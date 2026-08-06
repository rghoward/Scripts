"""Day 1, Lesson 4: Functions (50 minutes)."""

# === Why this matters ===
# A function gives a reusable name to a business calculation and reduces errors
# when the same rule appears in several orders.

# === Learning objectives ===
# Define and call functions, pass parameters, return values, and identify local variables.

# === Define and call a function ===
def calculate_merchandise_subtotal(unit_price, quantity):
    """Return the price of one product line before discounts and shipping."""
    subtotal = unit_price * quantity
    return subtotal


daypack_subtotal = calculate_merchandise_subtotal(55.00, 2)
print(f"RidgeLine Daypack subtotal: ${daypack_subtotal:.2f}")

# === Parameters and return values ===
def calculate_order_total(unit_price, quantity, discount_rate, shipping_cost):
    """Return a final order total after a percentage discount and shipping."""
    merchandise_subtotal = unit_price * quantity
    discount_amount = merchandise_subtotal * discount_rate
    final_total = merchandise_subtotal - discount_amount + shipping_cost
    return final_total


tent_total = calculate_order_total(189.00, 1, 0.10, 0.00)
print(f"Summit 2-Person Tent total: ${tent_total:.2f}")
# Expected output: Summit 2-Person Tent total: $170.10

# INSTRUCTOR NOTE: The names inside a function, such as `discount_amount`, are
# local variables. They exist for the calculation but are not order-wide data.

# === Guided exercise: estimate margin ===
def estimate_margin(unit_price, standard_cost, quantity):
    """Return estimated gross margin dollars for a product line."""
    revenue = unit_price * quantity
    cost = standard_cost * quantity
    margin = revenue - cost
    return margin


boot_margin = estimate_margin(119.00, 68.00, 2)
print(f"TrailCore Hiking Boots estimated margin: ${boot_margin:.2f}")
# Expected output: TrailCore Hiking Boots estimated margin: $102.00

# COMMON MISTAKE: `return` sends a value back to the caller. Printing inside a
# function is useful for a message, but it does not make the value available for later math.

# === Independent challenge ===
# Create a reusable shipping function. Orders at or above $75 ship free; other
# orders cost $8.99. Then use it for a $64.00 order and a $120.00 order.
def shipping_charge(order_subtotal):
    """Return the Blue Ridge Outfitters standard shipping charge."""
    if order_subtotal >= 75:
        return 0.00
    return 8.99


small_order_shipping = shipping_charge(64.00)
large_order_shipping = shipping_charge(120.00)
print(f"\nShipping for $64.00 order: ${small_order_shipping:.2f}")
print(f"Shipping for $120.00 order: ${large_order_shipping:.2f}")
# Expected output: $8.99, then $0.00

# === Recap and preview ===
# Functions make a program easier to read, test, and reuse. The final Day 1
# practice combines variables, decisions, loops, and functions in one script.
