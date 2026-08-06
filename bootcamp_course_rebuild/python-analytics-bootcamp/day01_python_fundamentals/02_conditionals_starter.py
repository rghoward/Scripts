"""Day 1, Lesson 2: Conditionals (40 minutes)."""

# === Why this matters ===
# Business rules turn order details into consistent decisions.

# === Learning objectives ===
# Use comparisons and conditional statements for discounts and shipping.

# === Comparisons produce Boolean values ===
cart_subtotal = 82.00
is_loyalty_member = True
has_promo_code = False
# TODO: Print whether the cart reaches $75 and whether a loyalty offer applies.

# === Discount tier demonstration ===
# `if` checks a condition. `elif` gives another condition; `else` covers all
# remaining cases. TODO: Assign a discount rate: 15% at $150+, 10% at $75+,
# 5% for remaining loyalty members, otherwise 0%.

# === Shipping eligibility demonstration ===
# TODO: After applying the discount, give free shipping at $75+ or to members;
# otherwise use $8.99 shipping. Print a helpful message.

# === Guided exercise: evaluate a return ===
# A return is eligible when it is within 30 days AND the item is unopened.
# Use `days_since_purchase = 18` and `item_is_unopened = True`.
# Expected status: Eligible for return.
# TODO: Write the conditional and print the result.

# === Independent challenge ===
# For a $165.00 non-member order, calculate the discount rate and shipping cost
# using the same rules. Expected: 15% discount and $0.00 shipping.
# TODO: Write the conditional logic and labeled output.

# === Recap and preview ===
# Next, we will repeat a task for several business values with loops.
