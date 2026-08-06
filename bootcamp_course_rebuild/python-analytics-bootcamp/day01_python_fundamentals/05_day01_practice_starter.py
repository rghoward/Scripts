"""Day 1, Lesson 5: Cumulative practice (35 minutes)."""

# === Why this matters ===
# A readable script combines small skills into one transparent workflow.

# === Learning objectives ===
# Combine variables, conditionals, loops, and functions to price a small order.

# === Business scenario ===
# The Asheville store receives a phone order for a daypack and two water bottles.
customer_is_member = True
product_names = ["RidgeLine Daypack", "RiverStone Water Bottle"]
unit_prices = [55.00, 16.00]
quantities = [1, 2]

# === Reusable pricing functions ===
# TODO: Define `line_subtotal(unit_price, quantity)`.
# TODO: Define `discount_rate_for(subtotal, is_member)` using 15% at $150+,
# 10% at $75+, 5% for other members, and 0% otherwise.
# TODO: Define `shipping_charge(subtotal_after_discount, is_member)` using free
# shipping at $75+ or for members; otherwise charge $8.99.

# === Build the receipt ===
# TODO: Start a merchandise subtotal at zero. Use `range(len(product_names))`
# to visit each position, calculate each line subtotal, and print a receipt.
# TODO: Apply the discount, shipping, and 7% sales tax, then print labeled totals.
# Expected first receipt: merchandise subtotal $87.00; final total $83.78.

# === Guided exercise ===
# Add a Beacon Headlamp ($25.00, quantity 1) to a new order list. Use a loop to
# calculate its merchandise subtotal. Expected result: $112.00.
# TODO: Build and calculate the guided order.

# === Independent challenge ===
# Price a non-member Knoxville order with 2 CloudPeak Fleeces at $59.00 and 1
# Signal Whistle at $8.00. Calculate the pre-tax total after shipping.
# Expected: 10% discount, free shipping, and a $113.40 pre-tax total.
# TODO: Build the order, loop through it, and use your functions.

# === Recap and preview ===
# Day 2 introduces richer collections and files for stored business data.
