# Blue Ridge Outfitters — Company and Data Guide

Blue Ridge Outfitters is a fictional outdoor retailer with stores in the southeastern and mid-Atlantic United States plus online and phone sales. It sells Camping, Hiking, Apparel, Hydration, and Accessories products.

## Continuity rules

- Prefer practical questions about orders, discounts, shipping, returns, and store operations.
- Reuse a familiar, small collection of fictional product and store names.
- Keep data examples realistic without requiring retail expertise.
- Use weather as external context for store operations through Open-Meteo.

## Data package

`data/generate_data.py` creates all controlled inputs with a fixed seed:

- `stores.csv`: seven stores, including coordinates for weather requests.
- `products.csv`: fifty products across five categories.
- `customers.xlsx`: 250 customers and a segment reference sheet.
- `orders.csv`: 2,430 fictional order lines, including limited deliberate data-quality issues for the final analysis.
- `open_meteo_sample_response.json`: a compatible local API fallback fixture.

The order data contains a few missing customer regions after later merging, null discounts, inconsistent channel text, duplicate rows, and two quantity outliers. These are deliberate and small enough for an introductory cleaning workflow.
