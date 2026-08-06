"""Day 1, Lesson 5: Cumulative practice (35 minutes)."""

# === Why this matters ===
# A useful script combines small skills into a readable workflow. This order
# pricer is intentionally modest: its value is that every rule is visible.

# === Learning objectives ===
# Combine variables, conditionals, loops, and functions to price a small order.

# === Business scenario ===
# The Asheville store receives a phone order for a daypack and two water bottles.
customer_is_member = True
product_names = ["RidgeLine Daypack", "RiverStone Water Bottle"]
unit_prices = [55.00, 16.00]
quantities = [1, 2]

# === Reusable pricing functions ===
def line_subtotal(unit_price, quantity):
    """Return the pre-discount value of one order line."""
    return unit_price * quantity


def discount_rate_for(subtotal, is_member):
    """Return the appropriate Blue Ridge Outfitters discount rate."""
    if subtotal >= 150:
        return 0.15
    if subtotal >= 75:
        return 0.10
    if is_member:
        return 0.05
    return 0.00


def shipping_charge(subtotal_after_discount, is_member):
    """Return shipping charge after considering the loyalty benefit."""
    if subtotal_after_discount >= 75 or is_member:
        return 0.00
    return 8.99


# === Build the receipt ===
merchandise_subtotal = 0
print("Blue Ridge Outfitters | Asheville phone order")
print("=" * 48)

for line_index in range(len(product_names)):
    current_line_subtotal = line_subtotal(unit_prices[line_index], quantities[line_index])
    merchandise_subtotal = merchandise_subtotal + current_line_subtotal
    print(f"{product_names[line_index]}: {quantities[line_index]} × ${unit_prices[line_index]:.2f} = ${current_line_subtotal:.2f}")

discount_rate = discount_rate_for(merchandise_subtotal, customer_is_member)
discount_amount = merchandise_subtotal * discount_rate
subtotal_after_discount = merchandise_subtotal - discount_amount
shipping = shipping_charge(subtotal_after_discount, customer_is_member)
sales_tax = subtotal_after_discount * 0.07
final_total = subtotal_after_discount + shipping + sales_tax

print("-" * 48)
print(f"Merchandise subtotal: ${merchandise_subtotal:.2f}")
print(f"Loyalty discount ({discount_rate:.0%}): -${discount_amount:.2f}")
print(f"Shipping: ${shipping:.2f}")
print(f"Sales tax: ${sales_tax:.2f}")
print(f"Final total: ${final_total:.2f}")
# Expected output includes: Merchandise subtotal: $87.00 and Final total: $83.78

# INSTRUCTOR NOTE: The three lists stay in the same order for today. On Day 2,
# students will learn safer ways to organize related values with dictionaries.

# === Guided exercise ===
# Add a Beacon Headlamp line (unit price $25.00, quantity 1) to `order_lines`.
# Re-run the script and explain which parts of the receipt update automatically.
# The completed line is included below for a fully runnable instructor version.
guided_prices = [55.00, 16.00, 25.00]
guided_quantities = [1, 2, 1]

guided_subtotal = 0
for line_index in range(len(guided_prices)):
    guided_subtotal = guided_subtotal + line_subtotal(guided_prices[line_index], guided_quantities[line_index])
print(f"\nGuided exercise merchandise subtotal: ${guided_subtotal:.2f}")
# Expected output: Guided exercise merchandise subtotal: $112.00

# === Independent challenge ===
# Build a Knoxville store order with a CloudPeak Fleece ($59.00, quantity 2)
# and a Signal Whistle ($8.00, quantity 1). Use the same functions to calculate
# the pre-tax total after shipping. A non-member should receive a 10% discount
# and free shipping.
knoxville_prices = [59.00, 8.00]
knoxville_quantities = [2, 1]
knoxville_subtotal = 0
for line_index in range(len(knoxville_prices)):
    knoxville_subtotal = knoxville_subtotal + line_subtotal(knoxville_prices[line_index], knoxville_quantities[line_index])

knoxville_discount_rate = discount_rate_for(knoxville_subtotal, False)
knoxville_after_discount = knoxville_subtotal * (1 - knoxville_discount_rate)
knoxville_shipping = shipping_charge(knoxville_after_discount, False)
knoxville_pre_tax_total = knoxville_after_discount + knoxville_shipping
print(f"Knoxville challenge pre-tax total: ${knoxville_pre_tax_total:.2f}")
# Expected output: Knoxville challenge pre-tax total: $113.40

# IF TIME: Change the customer membership status and describe precisely why the
# pricing result did or did not change.

# === Recap and preview ===
# Day 1 scripts are now capable of pricing a small order. Day 2 introduces
# richer collections and files so programs can work with stored business data.
