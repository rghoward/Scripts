"""Day 1, Lesson 3: Iteration (50 minutes)."""

# === Why this matters ===
# Analytics work often repeats one calculation across many dates, products, or stores.

# === Learning objectives ===
# Iterate with for and range, build a running total, and recognize a simple while loop.

# === Iterate over daily sales ===
daily_sales = [1240.50, 980.25, 1455.75, 1120.00, 1315.40]
total_sales = 0

for sales_amount in daily_sales:
    total_sales = total_sales + sales_amount
    print(f"Added ${sales_amount:.2f}; running total: ${total_sales:.2f}")

average_sales = total_sales / len(daily_sales)
print(f"\nFive-day total: ${total_sales:.2f}")
print(f"Average daily sales: ${average_sales:.2f}")
# Expected output: Five-day total: $6111.90

# INSTRUCTOR NOTE: Trace the first two passes slowly. The accumulator must be
# created before the loop; otherwise it would reset on every pass.

# === range() and store check-ins ===
# range(1, 4) gives 1, 2, and 3. The ending number is not included.
for check_in_number in range(1, 4):
    print(f"Store check-in {check_in_number}: ready for opening")

# === Guided exercise: count low-sales days ===
target_sales = 1200.00
days_below_target = 0
for sales_amount in daily_sales:
    if sales_amount < target_sales:
        days_below_target = days_below_target + 1

print(f"\nDays below ${target_sales:.2f}: {days_below_target}")
# Expected output: Days below $1200.00: 2

# === A brief while-loop demonstration ===
# A while loop repeats while its condition is True. Make sure something inside
# changes the condition, or the loop will never end.
inventory_count = 3
while inventory_count > 0:
    print(f"Packing one daypack; {inventory_count} ready to ship.")
    inventory_count = inventory_count - 1

# COMMON MISTAKE: Do not use a while loop when a list already gives the items
# to visit. A for loop is clearer for the daily_sales list above.

# === Independent challenge ===
# Find the total and average for these three Asheville store transactions.
asheville_transactions = [86.50, 42.00, 119.75]
transaction_total = 0
for transaction in asheville_transactions:
    transaction_total = transaction_total + transaction
transaction_average = transaction_total / len(asheville_transactions)
print(f"\nAsheville transaction total: ${transaction_total:.2f}")
print(f"Asheville transaction average: ${transaction_average:.2f}")
# Expected output: total $248.25; average $82.75

# === Recap and preview ===
# Loops repeat a clear operation and can build useful summary values. Next, we
# will package repeated calculations into functions.
