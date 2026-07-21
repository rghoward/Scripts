# pip install yfinance pandas lxml

import pandas as pd
import yfinance as yf
from datetime import date, timedelta

THRESHOLD = -0.02  # -2 percentage points vs SPY

def get_sp500_tickers():
    import requests

    url = "https://en.wikipedia.org/wiki/List_of_S%26P_500_companies"
    headers = {
        "User-Agent": "Mozilla/5.0"
    }

    html = requests.get(url, headers=headers, timeout=20).text
    df = pd.read_html(html)[0]

    return df["Symbol"].str.replace(".", "-", regex=False).tolist()

def main():
    tickers = get_sp500_tickers()
    all_tickers = tickers + ["SPY"]

    end = date.today() + timedelta(days=1)
    start = date.today() - timedelta(days=7)

    data = yf.download(
        all_tickers,
        start=start,
        end=end,
        auto_adjust=True,
        progress=False,
        group_by="column",
        threads=True
    )["Close"]

    daily_returns = data.pct_change().dropna()

    latest_day = daily_returns.index[-1]
    latest = daily_returns.loc[latest_day]

    spy_return = latest["SPY"]

    results = pd.DataFrame({
        "Ticker": tickers,
        "Stock Return": latest[tickers],
        "SPY Return": spy_return,
        "Difference vs SPY": latest[tickers] - spy_return
    })

    flagged = results[results["Difference vs SPY"] <= THRESHOLD]
    flagged = flagged.sort_values("Difference vs SPY")

    print(f"Date analyzed: {latest_day.date()}")
    print(f"SPY return: {spy_return:.2%}")
    print()
    print("Stocks with noticeable decrease vs S&P 500:")
    print(flagged.to_string(index=False, formatters={
        "Stock Return": "{:.2%}".format,
        "SPY Return": "{:.2%}".format,
        "Difference vs SPY": "{:.2%}".format
    }))

    flagged.to_csv("sp500_underperformers_today.csv", index=False)

if __name__ == "__main__":
    main()