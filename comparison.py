import numpy as np
import pandas as pd
import yfinance as yf
from sklearn.ensemble import RandomForestClassifier
from sklearn.impute import SimpleImputer
from sklearn.pipeline import Pipeline
from sklearn.metrics import roc_auc_score

STARTING_CASH = 10_000
TOP_N = 5
BENCHMARK = "SPY"

TARGET_COL = "Hit +2% Within 5D"
PROFIT_TARGET = 0.05
MAX_HOLD_DAYS = 10

MIN_TRAIN_ROWS = 10_000
RETRAIN_EVERY_N_DAYS = 20

FEATURES = [
    "Return",
    "SPY Return",
    "Return vs SPY",
    "Sector Return",
    "Return vs Sector",
    "Volume Ratio",
    "Dist MA50",
    "Dist MA200",
    "RSI14",
    "Momentum 5",
    "Momentum 20",
    "Momentum 50",
    "20 Day Low",
    "52 Week Low",
    "Score",
]

CANDIDATE_FILTERS = {
    "min_return_vs_spy": -0.02,
    "min_score": 4,
}

dataset = pd.read_csv("sp500_dip_research_dataset.csv", parse_dates=["Date"])
dataset = dataset.sort_values(["Date", "Ticker"])

dataset["20 Day Low"] = dataset["20 Day Low"].astype(float)
dataset["52 Week Low"] = dataset["52 Week Low"].astype(float)

dataset = dataset.dropna(subset=[TARGET_COL, "Close"])
dataset[TARGET_COL] = dataset[TARGET_COL].astype(int)

dates = sorted(dataset["Date"].unique())
price_pivot = dataset.pivot(index="Date", columns="Ticker", values="Close")

cash = STARTING_CASH
open_trades = []
trades = []
portfolio_rows = []

model = None
last_train_i = None
auc_scores = []

for i, current_date in enumerate(dates):
    day = dataset[dataset["Date"] == current_date]

    still_open = []

    for trade in open_trades:
        ticker = trade["Ticker"]

        if ticker not in price_pivot.columns or current_date not in price_pivot.index:
            still_open.append(trade)
            continue

        current_price = price_pivot.loc[current_date, ticker]

        if pd.isna(current_price):
            still_open.append(trade)
            continue

        trade_return = current_price / trade["Buy Price"] - 1
        days_held = len([d for d in dates if trade["Buy Date"] < d <= current_date])

        should_sell = trade_return >= PROFIT_TARGET or days_held >= MAX_HOLD_DAYS

        if should_sell:
            sell_value = trade["Shares"] * current_price
            cash += sell_value

            trade.update({
                "Sell Date": current_date,
                "Sell Price": current_price,
                "Days Held": days_held,
                "Trade Return": trade_return,
                "Final Value": sell_value,
                "Exit Reason": "profit target" if trade_return >= PROFIT_TARGET else "max hold",
            })

            trades.append(trade)
        else:
            still_open.append(trade)

    open_trades = still_open

    open_value = 0
    for trade in open_trades:
        ticker = trade["Ticker"]
        if ticker in price_pivot.columns:
            current_price = price_pivot.loc[current_date, ticker]
            if not pd.isna(current_price):
                open_value += trade["Shares"] * current_price

    portfolio_value = cash + open_value

    portfolio_rows.append({
        "Date": current_date,
        "Portfolio Value": portfolio_value,
        "Cash": cash,
        "Invested": open_value,
        "Open Positions": len(open_trades),
    })

    # Only buy if fully in cash
    if open_trades or cash <= 0:
        continue

    train = dataset[dataset["Date"] < current_date].copy()

    if len(train) < MIN_TRAIN_ROWS:
        continue

    should_retrain = (
        model is None or
        last_train_i is None or
        i - last_train_i >= RETRAIN_EVERY_N_DAYS
    )

    if should_retrain:
        split_date = train["Date"].quantile(0.85)

        train_part = train[train["Date"] < split_date]
        valid_part = train[train["Date"] >= split_date]

        model = Pipeline([
            ("imputer", SimpleImputer(strategy="median")),
            ("rf", RandomForestClassifier(
                n_estimators=300,
                max_depth=6,
                min_samples_leaf=50,
                random_state=42,
                n_jobs=-1,
                class_weight="balanced_subsample"
            ))
        ])

        model.fit(train_part[FEATURES], train_part[TARGET_COL])

        if len(valid_part[TARGET_COL].unique()) > 1:
            valid_probs = model.predict_proba(valid_part[FEATURES])[:, 1]
            auc = roc_auc_score(valid_part[TARGET_COL], valid_probs)
            auc_scores.append({
                "Date": current_date,
                "Validation AUC": auc
            })

        last_train_i = i

    candidates = day[
        (day["Return vs SPY"] <= CANDIDATE_FILTERS["min_return_vs_spy"]) &
        (day["Score"] >= CANDIDATE_FILTERS["min_score"])
    ].copy()

    if candidates.empty:
        continue

    candidates["Predicted Rebound Probability"] = model.predict_proba(
        candidates[FEATURES]
    )[:, 1]

    picks = (
        candidates
        .sort_values("Predicted Rebound Probability", ascending=False)
        .head(TOP_N)
    )

    if picks.empty:
        continue

    amount_per_stock = cash / len(picks)

    for _, row in picks.iterrows():
        shares = amount_per_stock / row["Close"]

        open_trades.append({
            "Buy Date": current_date,
            "Ticker": row["Ticker"],
            "Sector": row["Sector"],
            "Buy Price": row["Close"],
            "Shares": shares,
            "Initial Amount": amount_per_stock,
            "Predicted Rebound Probability": row["Predicted Rebound Probability"],
            "Score": row["Score"],
            "Return vs SPY": row["Return vs SPY"],
            "RSI14": row["RSI14"],
            "Volume Ratio": row["Volume Ratio"],
            "Dist MA200": row["Dist MA200"],
        })

    cash = 0


portfolio = pd.DataFrame(portfolio_rows)
trades = pd.DataFrame(trades)
auc_df = pd.DataFrame(auc_scores)

start_date = portfolio["Date"].min()
end_date = portfolio["Date"].max()

spy_prices = yf.download(
    BENCHMARK,
    start=start_date,
    end=end_date + pd.Timedelta(days=1),
    auto_adjust=True,
    progress=False
)["Close"]

spy_prices = spy_prices.squeeze().dropna()

spy_start = float(spy_prices.iloc[0])
spy_end = float(spy_prices.iloc[-1])

strategy_ending_value = float(portfolio["Portfolio Value"].iloc[-1])
strategy_profit = strategy_ending_value - STARTING_CASH
strategy_return = strategy_ending_value / STARTING_CASH - 1

spy_ending_value = STARTING_CASH * (spy_end / spy_start)
spy_profit = spy_ending_value - STARTING_CASH
spy_return = spy_ending_value / STARTING_CASH - 1

completed_cycles = trades["Buy Date"].nunique() if not trades.empty else 0

portfolio.to_csv("ml_dip_equity_curve.csv", index=False)
trades.to_csv("ml_dip_trades.csv", index=False)
auc_df.to_csv("ml_dip_validation_auc.csv", index=False)

print()
print("Backtest Period:")
print(f"{start_date.date()} to {end_date.date()}")

print()
print("ML Dip Strategy vs SPY:")
print(f"Strategy ending value: ${strategy_ending_value:,.2f}")
print(f"Strategy profit: ${strategy_profit:,.2f}")
print(f"Strategy return: {strategy_return:.2%}")

print()
print(f"SPY ending value: ${spy_ending_value:,.2f}")
print(f"SPY profit: ${spy_profit:,.2f}")
print(f"SPY return: {spy_return:.2%}")

print()
print(f"Difference: ${strategy_ending_value - spy_ending_value:,.2f}")
print(f"Difference return: {strategy_return - spy_return:.2%}")

print()
print("Trading Stats:")
print(f"Completed stock trades: {len(trades)}")
print(f"Completed portfolio cycles: {completed_cycles}")

if not trades.empty:
    print(f"Win rate: {(trades['Trade Return'] > 0).mean():.2%}")
    print(f"Average trade return: {trades['Trade Return'].mean():.2%}")
    print(f"Median trade return: {trades['Trade Return'].median():.2%}")
    print(f"Average predicted probability: {trades['Predicted Rebound Probability'].mean():.2%}")

if not auc_df.empty:
    print(f"Average validation AUC: {auc_df['Validation AUC'].mean():.3f}")

print()
print("Saved:")
print("ml_dip_equity_curve.csv")
print("ml_dip_trades.csv")
print("ml_dip_validation_auc.csv")