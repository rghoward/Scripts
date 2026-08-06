"""Day 1, Lesson 2: Conditionals (40 minutes)."""

# === Why this matters ===
# Business rules turn facts about an order into consistent pricing decisions.

# === Learning objectives ===
# Use comparisons, if/elif/else, and and/or/not to apply discount and shipping rules.

# === Comparisons produce Boolean values ===
cart_subtotal = 82.00
is_loyalty_member = True
has_promo_code = False

print(f"Cart qualifies for free shipping: {cart_subtotal >= 75}")
print(f"Customer can receive a loyalty offer: {is_loyalty_member and not has_promo_code}")

# === Discount tier demonstration ===
# Check the highest threshold first. That prevents a $150 order from stopping at
# the smaller $75 discount tier.
if cart_subtotal >= 150:
    discount_rate = 0.15
elif cart_subtotal >= 75:
    discount_rate = 0.10
elif is_loyalty_member:
    discount_rate = 0.05
else:
    discount_rate = 0.00

discount_amount = cart_subtotal * discount_rate
print(f"Discount rate: {discount_rate:.0%}")
print(f"Discount amount: ${discount_amount:.2f}")

# COMMON MISTAKE: `=` assigns a value; `==` compares two values. Conditions
# need comparisons such as `cart_subtotal >= 75`.

# === Shipping eligibility demonstration ===
discounted_subtotal = cart_subtotal - discount_amount
if discounted_subtotal >= 75 or is_loyalty_member:
    shipping_cost = 0.00
    shipping_message = "Free shipping applied"
else:
    shipping_cost = 8.99
    shipping_message = "Standard shipping applied"

print(f"{shipping_message}: ${shipping_cost:.2f}")
# Expected output includes: Free shipping applied: $0.00

# === Guided exercise: evaluate a return ===
# A return is eligible when it is within 30 days AND the item is unopened.
days_since_purchase = 18
item_is_unopened = True

if days_since_purchase <= 30 and item_is_unopened:
    return_status = "Eligible for return"
else:
    return_status = "Review with a store associate"
print(f"\nReturn status: {return_status}")

# === Independent challenge ===
# Determine the discount rate for a $165.00 order from a non-member. Then
# decide whether it receives free shipping using the same $75 threshold.
challenge_subtotal = 165.00
challenge_member = False

if challenge_subtotal >= 150:
    challenge_discount_rate = 0.15
elif challenge_subtotal >= 75:
    challenge_discount_rate = 0.10
elif challenge_member:
    challenge_discount_rate = 0.05
else:
    challenge_discount_rate = 0.00

challenge_after_discount = challenge_subtotal * (1 - challenge_discount_rate)
if challenge_after_discount >= 75 or challenge_member:
    challenge_shipping = 0.00
else:
    challenge_shipping = 8.99
print(f"\nChallenge discount: {challenge_discount_rate:.0%}")
print(f"Challenge shipping: ${challenge_shipping:.2f}")
# Expected output: Challenge discount: 15%; Challenge shipping: $0.00

# === Recap and preview ===
# Conditions make one program respond to different orders. Next, we will repeat
# a task for several business values with loops.
