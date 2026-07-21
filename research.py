import numpy as np
import pandas as pd
import yfinance as yf
import requests
from datetime import date, timedelta

YEARS_BACK = 10
BENCHMARK = "SPY"
SECTOR_ETFS = {
    "Communication Services": "XLC",
    "Consumer Discretionary": "XLY",
    "Consumer Staples": "XLP",
    "Energy": "XLE",
    "Financials": "XLF",
    "Health Care": "XLV",
    "Industrials": "XLI",
    "Information Technology": "XLK",
    "Materials": "XLB",
    "Real Estate": "XLRE",
    "Utilities": "XLU",
}

FUTURE_WINDOWS = [1, 2, 3, 5, 10, 20]


def get_sp500_table():
    url = "https://en.wikipedia.org/wiki/List_of_S%26P_500_companies"
    headers = {"User-Agent": "Mozilla/5.0"}
    html = requests.get(url, headers=headers, timeout=20).text
    df = pd.read_html(html)[0]
    df["Symbol"] = df["Symbol"].str.replace(".", "-", regex=False)
    return df[["Symbol", "Security", "GICS Sector"]]


def rsi(series, period=14):
    delta = series.diff()
    gain = delta.clip(lower=0)
    loss = -delta.clip(upper=0)
    avg_gain = gain.rolling(period).mean()
    avg_loss = loss.rolling(period).mean()
    rs = avg_gain / avg_loss
    return 100 - (100 / (1 + rs))


def build_stock_frame(ticker, sector, prices, volume, benchmark_returns, sector_returns):
    close = prices[ticker].dropna()
    vol = volume[ticker].reindex(close.index)

    df = pd.DataFrame(index=close.index)
    df["Ticker"] = ticker
    df["Sector"] = sector
    df["Close"] = close
    df["Return"] = close.pct_change()
    df["SPY Return"] = benchmark_returns.reindex(df.index)
    df["Return vs SPY"] = df["Return"] - df["SPY Return"]

    if sector in sector_returns:
        df["Sector Return"] = sector_returns[sector].reindex(df.index)
        df["Return vs Sector"] = df["Return"] - df["Sector Return"]
    else:
        df["Sector Return"] = np.nan
        df["Return vs Sector"] = np.nan

    df["Volume"] = vol
    df["Volume 20 Avg"] = vol.rolling(20).mean()
    df["Volume Ratio"] = df["Volume"] / df["Volume 20 Avg"]

    df["MA50"] = close.rolling(50).mean()
    df["MA200"] = close.rolling(200).mean()
    df["Dist MA50"] = close / df["MA50"] - 1
    df["Dist MA200"] = close / df["MA200"] - 1

    df["RSI14"] = rsi(close)
    df["Momentum 5"] = close.pct_change(5)
    df["Momentum 20"] = close.pct_change(20)
    df["Momentum 50"] = close.pct_change(50)

    df["20 Day Low"] = close <= close.rolling(20).min()
    df["52 Week Low"] = close <= close.rolling(252).min()

    for w in FUTURE_WINDOWS:
        future_prices = pd.concat(
            [close.shift(-i) for i in range(1, w + 1)],
            axis=1
        )

        df[f"Future {w}D Final Return"] = close.shift(-w) / close - 1
        df[f"Future {w}D Max Gain"] = future_prices.max(axis=1) / close - 1
        df[f"Future {w}D Max Loss"] = future_prices.min(axis=1) / close - 1
        df[f"Hit +2% Within {w}D"] = df[f"Future {w}D Max Gain"] >= 0.02
        df[f"Hit +3% Within {w}D"] = df[f"Future {w}D Max Gain"] >= 0.03
        df[f"Hit +5% Within {w}D"] = df[f"Future {w}D Max Gain"] >= 0.05

    return df.reset_index(names="Date")


def score_candidates(dataset):
    candidates = dataset.copy()

    candidates["Score"] = 0

    candidates.loc[candidates["Return vs SPY"] <= -0.02, "Score"] += 2
    candidates.loc[candidates["Return vs SPY"] <= -0.03, "Score"] += 1
    candidates.loc[candidates["Return"] >= -0.08, "Score"] += 1
    candidates.loc[candidates["Volume Ratio"] <= 1.5, "Score"] += 1
    candidates.loc[candidates["Dist MA200"] > 0, "Score"] += 1
    candidates.loc[candidates["RSI14"] < 35, "Score"] += 1
    candidates.loc[candidates["Return vs Sector"] <= -0.02, "Score"] += 1

    candidates.loc[candidates["Volume Ratio"] > 2.0, "Score"] -= 2
    candidates.loc[candidates["Dist MA200"] < -0.05, "Score"] -= 2
    candidates.loc[candidates["Return"] < -0.10, "Score"] -= 3

    return candidates


def research_summary(dataset):
    filters = {
        "All drops vs SPY <= -2%": dataset["Return vs SPY"] <= -0.02,
        "RSI < 35": dataset["RSI14"] < 35,
        "Volume ratio <= 1.5": dataset["Volume Ratio"] <= 1.5,
        "Above MA200": dataset["Dist MA200"] > 0,
        "Drop not worse than -8%": dataset["Return"] >= -0.08,
        "Score >= 5": dataset["Score"] >= 5,
        "Score >= 6": dataset["Score"] >= 6,
        "Score >= 7": dataset["Score"] >= 7,
    }

    rows = []

    for name, mask in filters.items():
        subset = dataset[mask].dropna(subset=["Future 5D Final Return"])

        if subset.empty:
            continue

        rows.append({
            "Rule": name,
            "Count": len(subset),
            "Avg 2D Return": subset["Future 2D Final Return"].mean(),
            "Avg 3D Return": subset["Future 3D Final Return"].mean(),
            "Avg 5D Return": subset["Future 5D Final Return"].mean(),
            "Avg 10D Return": subset["Future 10D Final Return"].mean(),
            "Hit +2% Within 5D": subset["Hit +2% Within 5D"].mean(),
            "Hit +2% Within 10D": subset["Hit +2% Within 10D"].mean(),
            "Median 5D Return": subset["Future 5D Final Return"].median(),
        })

    return pd.DataFrame(rows)


def main():
    sp500 = get_sp500_table()
    tickers = sp500["Symbol"].tolist()
    sector_map = dict(zip(sp500["Symbol"], sp500["GICS Sector"]))

    extra_tickers = [BENCHMARK] + list(SECTOR_ETFS.values()) + ["^VIX"]
    all_tickers = sorted(set(tickers + extra_tickers))

    end = date.today() + timedelta(days=1)
    start = date.today() - timedelta(days=365 * YEARS_BACK + 300)

    print("Downloading data...")
    data = yf.download(
        all_tickers,
        start=start,
        end=end,
        auto_adjust=True,
        progress=True,
        threads=True
    )

    prices = data["Close"].dropna(axis=1, how="all")
    volume = data["Volume"].dropna(axis=1, how="all")

    benchmark_returns = prices[BENCHMARK].pct_change()

    sector_returns = {}
    for sector, etf in SECTOR_ETFS.items():
        if etf in prices.columns:
            sector_returns[sector] = prices[etf].pct_change()

    frames = []

    print("Building dataset...")
    for ticker in tickers:
        if ticker not in prices.columns or ticker not in volume.columns:
            continue

        sector = sector_map.get(ticker, "Unknown")

        try:
            frame = build_stock_frame(
                ticker,
                sector,
                prices,
                volume,
                benchmark_returns,
                sector_returns
            )
            frames.append(frame)
        except Exception as e:
            print(f"Skipped {ticker}: {e}")

    dataset = pd.concat(frames, ignore_index=True)
    dataset = score_candidates(dataset)

    recent = dataset[dataset["Date"] == dataset["Date"].max()]
    today_ranked = (
        recent
        .sort_values("Score", ascending=False)
        .head(25)
    )

    summary = research_summary(dataset)

    dataset.to_csv("sp500_dip_research_dataset.csv", index=False)
    summary.to_csv("sp500_dip_research_summary.csv", index=False)
    today_ranked.to_csv("sp500_dip_candidates_today.csv", index=False)

    print()
    print("Saved:")
    print("sp500_dip_research_dataset.csv")
    print("sp500_dip_research_summary.csv")
    print("sp500_dip_candidates_today.csv")

    print()
    print("Research summary:")
    print(summary.to_string(index=False, formatters={
        "Avg 2D Return": "{:.2%}".format,
        "Avg 3D Return": "{:.2%}".format,
        "Avg 5D Return": "{:.2%}".format,
        "Avg 10D Return": "{:.2%}".format,
        "Hit +2% Within 5D": "{:.2%}".format,
        "Hit +2% Within 10D": "{:.2%}".format,
        "Median 5D Return": "{:.2%}".format,
    }))


if __name__ == "__main__":
    main()