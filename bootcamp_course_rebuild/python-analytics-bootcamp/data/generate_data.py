"""Generate deterministic fictional Blue Ridge Outfitters source data."""

from __future__ import annotations

import csv
import random
from datetime import date, timedelta
from pathlib import Path

from openpyxl import Workbook

SEED = 20260804
ROOT = Path(__file__).resolve().parent
RAW = ROOT / "raw"

STORES = [
    ("STR-101", "Peachtree Basecamp", "Atlanta", "GA", "Southeast", 33.7490, -84.3880),
    ("STR-102", "French Broad Outfitters", "Asheville", "NC", "Southeast", 35.5951, -82.5515),
    ("STR-103", "Queen City Trailhead", "Charlotte", "NC", "Southeast", 35.2271, -80.8431),
    ("STR-104", "Cumberland Camp", "Nashville", "TN", "South Central", 36.1627, -86.7816),
    ("STR-105", "Tennessee River Gear", "Knoxville", "TN", "South Central", 35.9606, -83.9207),
    ("STR-106", "James River Supply", "Richmond", "VA", "Mid-Atlantic", 37.5407, -77.4360),
    ("STR-107", "Falls Lake Outfitters", "Raleigh", "NC", "Mid-Atlantic", 35.7796, -78.6382),
]

PRODUCT_BLUEPRINTS = [
    ("Camping", "Shelter", "Summit 2-Person Tent", "Northwind Supply", 119.00, 189.00),
    ("Camping", "Sleep", "Alpine Sleeping Bag", "Northwind Supply", 62.00, 99.00),
    ("Camping", "Cooking", "Campfire Cook Set", "Emberworks", 24.00, 42.00),
    ("Camping", "Lighting", "Beacon Headlamp", "Emberworks", 13.00, 25.00),
    ("Hiking", "Packs", "RidgeLine Daypack", "Trailsmith Co.", 31.00, 55.00),
    ("Hiking", "Footwear", "TrailCore Hiking Boots", "Trailsmith Co.", 68.00, 119.00),
    ("Hiking", "Poles", "Switchback Trekking Poles", "Trailsmith Co.", 27.00, 49.00),
    ("Hiking", "Navigation", "Contour Compass", "Trailsmith Co.", 9.00, 18.00),
    ("Apparel", "Outerwear", "Blue Ridge Rain Jacket", "Pine & Peak", 48.00, 89.00),
    ("Apparel", "Fleece", "CloudPeak Fleece", "Pine & Peak", 32.00, 59.00),
    ("Apparel", "Base Layers", "Creekside Base Layer", "Pine & Peak", 18.00, 34.00),
    ("Apparel", "Headwear", "Overlook Trail Cap", "Pine & Peak", 10.00, 22.00),
    ("Hydration", "Bottles", "RiverStone Water Bottle", "ClearCurrent", 8.00, 16.00),
    ("Hydration", "Filters", "Springline Water Filter", "ClearCurrent", 18.00, 35.00),
    ("Hydration", "Reservoirs", "Longhaul Hydration Pack", "ClearCurrent", 22.00, 44.00),
    ("Hydration", "Mixes", "Trail Citrus Electrolytes", "ClearCurrent", 6.00, 12.00),
    ("Accessories", "Safety", "Signal Whistle", "Ridgeworks", 3.00, 8.00),
    ("Accessories", "Tools", "Pine Knot Multi-Tool", "Ridgeworks", 14.00, 29.00),
    ("Accessories", "Storage", "Dry Creek Gear Pouch", "Ridgeworks", 7.00, 15.00),
    ("Accessories", "Comfort", "Lookout Camp Chair", "Ridgeworks", 29.00, 54.00),
]


def write_csv(path: Path, fieldnames: list[str], rows: list[dict]) -> None:
    with path.open("w", newline="", encoding="utf-8") as file:
        writer = csv.DictWriter(file, fieldnames=fieldnames)
        writer.writeheader()
        writer.writerows(rows)


def build_products() -> list[dict]:
    products = []
    for index, (category, subcategory, name, supplier, cost, price) in enumerate(PRODUCT_BLUEPRINTS, 1):
        for variation in ("Standard", "Trail"):
            suffix = "" if variation == "Standard" else " — Trail Edition"
            multiplier = 1 if variation == "Standard" else 1.18
            products.append({
                "product_id": f"PRD-{index:03d}-{variation[0]}", "product_name": f"{name}{suffix}",
                "category": category, "subcategory": subcategory, "supplier": supplier,
                "standard_cost": round(cost * multiplier, 2), "list_price": round(price * multiplier, 2),
            })
    return products


def build_customers(rng: random.Random) -> list[dict]:
    first_names = ["Avery", "Jordan", "Morgan", "Riley", "Cameron", "Taylor", "Casey", "Quinn", "Parker", "Rowan"]
    last_names = ["Bennett", "Carter", "Davis", "Ellis", "Foster", "Griffin", "Hayes", "Jordan", "Miller", "Sutton"]
    customers = []
    for number in range(1, 251):
        store = STORES[(number - 1) % len(STORES)]
        segment = rng.choices(["Consumer", "Small Business", "Corporate"], weights=[70, 20, 10])[0]
        customers.append({
            "customer_id": f"CUS-{number:04d}",
            "customer_name": f"{rng.choice(first_names)} {rng.choice(last_names)}",
            "segment": segment, "city": store[2], "state": store[3],
            "region": "" if number in {37, 142, 219} else store[4],
            "signup_date": (date(2023, 1, 1) + timedelta(days=rng.randrange(900))).isoformat(),
            "loyalty_member": "Yes" if rng.random() < 0.58 else "No",
        })
    return customers


def write_customers_workbook(customers: list[dict]) -> None:
    workbook = Workbook()
    sheet = workbook.active
    sheet.title = "customers"
    headers = list(customers[0])
    sheet.append(headers)
    for customer in customers:
        sheet.append([customer[header] for header in headers])
    segments = workbook.create_sheet("segments")
    segments.append(["segment", "description"])
    segments.append(["Consumer", "Individual outdoor customers"])
    segments.append(["Small Business", "Local guides and small organizations"])
    segments.append(["Corporate", "Larger company and event accounts"])
    workbook.save(RAW / "customers.xlsx")


def build_orders(rng: random.Random, customers: list[dict], products: list[dict]) -> list[dict]:
    rows = []
    for line in range(2430):
        product = rng.choice(products)
        store = rng.choice(STORES)
        order_date = date(2025, 1, 1) + timedelta(days=rng.randrange(365))
        discount = rng.choice([0, 0, 0.05, 0.10, 0.15])
        rows.append({
            "order_id": f"ORD-{100000 + line // 2}", "order_date": order_date.isoformat(),
            "customer_id": rng.choice(customers)["customer_id"], "store_id": store[0],
            "product_id": product["product_id"], "quantity": rng.choices([1, 2, 3, 4, 5], [45, 30, 15, 7, 3])[0],
            "unit_price": round(product["list_price"] * rng.choice([0.95, 1.00, 1.00, 1.05]), 2),
            "discount": "" if line in {117, 913, 2044} else discount,
            "shipping_cost": round(rng.choice([0, 0, 4.99, 7.99, 11.99]), 2),
            "sales_channel": rng.choice(["Store", "Online", "Phone"]),
            "returned": "Yes" if rng.random() < 0.055 else "No",
        })
    rows[38]["sales_channel"] = "online "
    rows[202]["sales_channel"] = "STORE"
    rows[501]["quantity"] = 48
    rows[1888]["quantity"] = 60
    rows.extend([rows[74].copy(), rows[1660].copy()])
    return rows


def main() -> None:
    rng = random.Random(SEED)
    RAW.mkdir(parents=True, exist_ok=True)
    write_csv(RAW / "stores.csv", ["store_id", "store_name", "city", "state", "region", "latitude", "longitude"], [
        dict(zip(["store_id", "store_name", "city", "state", "region", "latitude", "longitude"], store)) for store in STORES
    ])
    products = build_products()
    write_csv(RAW / "products.csv", list(products[0]), products)
    customers = build_customers(rng)
    write_customers_workbook(customers)
    orders = build_orders(rng, customers, products)
    write_csv(RAW / "orders.csv", list(orders[0]), orders)
    print(f"Created {len(products)} products, {len(customers)} customers, and {len(orders)} order lines.")


if __name__ == "__main__":
    main()
