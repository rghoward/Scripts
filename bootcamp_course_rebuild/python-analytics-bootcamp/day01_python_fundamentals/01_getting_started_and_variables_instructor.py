"""Day 1, Lesson 1: Getting started and variables (35 minutes)."""

# === Why this matters ===
# Analysts turn business questions into small, transparent calculations. A script
# makes every step repeatable and gives us a place to check intermediate values.

# === Learning objectives ===
# By the end, students can run a Python script, create descriptive variables,
# identify basic data types, and calculate an order total.

# === Run your first script ===
print("Blue Ridge Outfitters | Order check")
print("=" * 38)

# === Variables and basic types ===
# Variables give a meaningful name to a value we will use later.
product_name = "RidgeLine Daypack"       # string: text in quotation marks
unit_price = 55.00                       # float: a number with decimals
quantity = 2                             # integer: a whole number
loyalty_member = True                    # Boolean: True or False

print(f"Product: {product_name}")
print(f"Unit price: ${unit_price:.2f}")
print(f"Quantity: {quantity}")
print(f"Loyalty member: {loyalty_member}")
print(f"The price is stored as a {type(unit_price).__name__}.")

# INSTRUCTOR NOTE: Pause here to have students run the file and deliberately
# change one value. The script should respond without changing any formula.

# === Arithmetic and an f-string ===
# Python follows the usual order of operations. Parentheses make a business
# formula easier for another analyst to review.
merchandise_subtotal = unit_price * quantity
member_discount = 5.00 if loyalty_member else 0.00
order_total = merchandise_subtotal - member_discount

print(f"Merchandise subtotal: ${merchandise_subtotal:.2f}")
print(f"Member discount: -${member_discount:.2f}")
print(f"Order total before tax: ${order_total:.2f}")
# Expected output includes: Order total before tax: $105.00

# COMMON MISTAKE: `55.00` is a number, while `"55.00"` is text. Python cannot
# multiply text by a price formula in the way a business calculation needs.

# === Guided exercise: calculate checkout amounts ===
# A customer adds a Beacon Headlamp to an order. Work through the calculation
# in visible steps so the receipt is easy to audit.
headlamp_price = 25.00
headlamp_quantity = 3
sales_tax_rate = 0.07

retail_subtotal = headlamp_price * headlamp_quantity
sales_tax = retail_subtotal * sales_tax_rate
checkout_total = retail_subtotal + sales_tax

print(f"\nBeacon Headlamp subtotal: ${retail_subtotal:.2f}")
print(f"Sales tax: ${sales_tax:.2f}")
print(f"Checkout total: ${checkout_total:.2f}")
# Expected output: Checkout total: $80.25

# === Independent challenge ===
# Blue Ridge Outfitters sells a CloudPeak Fleece for $59.00. Calculate the
# subtotal, 6% tax, and final total for a customer buying 2 fleeces.
fleece_price = 59.00
fleece_quantity = 2
fleece_tax_rate = 0.06
fleece_subtotal = fleece_price * fleece_quantity
fleece_tax = fleece_subtotal * fleece_tax_rate
fleece_total = fleece_subtotal + fleece_tax
print(f"\nCloudPeak Fleece final total: ${fleece_total:.2f}")
# Expected output: CloudPeak Fleece final total: $125.08

# === Recap and preview ===
# We used names, values, arithmetic, and formatted output to make a small
# order calculation. Next, the program will make decisions about an order.
