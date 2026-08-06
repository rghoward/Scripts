#!/usr/bin/env python3
"""Fetch dated HWPO benchmark history using read-only requests only."""

from __future__ import annotations

import getpass
import json
import sys
import urllib.error
import urllib.parse
from datetime import date

from fetch_benchmarks import OUTPUT as BENCHMARKS_FILE
from fetch_benchmarks import ROOT, embedded_oauth_fields, request_json


OUTPUT = ROOT / "hwpo-benchmark-history.json"


def main() -> int:
    print("HWPO benchmark-history import (read-only)")
    print("Credentials and access tokens are not written to disk.\n")
    email = input("HWPO email: ").strip()
    password = getpass.getpass("HWPO password: ")
    if not email or not password:
        print("Email and password are required.", file=sys.stderr)
        return 2

    stage = "loading benchmark catalog"
    try:
        catalog = json.loads(BENCHMARKS_FILE.read_text())
        benchmarks = catalog.get("items")
        if not isinstance(benchmarks, list):
            raise RuntimeError("Run fetch_benchmarks.py first")

        client_id, client_secret = embedded_oauth_fields()
        stage = "login"
        auth = request_json(
            "users/sign_in",
            method="POST",
            form={
                "client_id": client_id,
                "client_secret": client_secret,
                "email": email,
                "password": password,
            },
        )
        if not isinstance(auth, dict) or not isinstance(auth.get("access_token"), str):
            raise RuntimeError("Login succeeded but returned no access token")
        token = auth["access_token"]

        histories = []
        for number, benchmark in enumerate(benchmarks, start=1):
            if not isinstance(benchmark, dict) or not isinstance(benchmark.get("id"), int):
                continue
            benchmark_id = benchmark["id"]
            cursor_date = date.today().isoformat()
            entries: list[object] = []
            seen_ids: set[int] = set()
            page = 1
            while True:
                stage = f"benchmark {number}/{len(benchmarks)} (ID {benchmark_id}), page {page}"
                query = urllib.parse.urlencode(
                    {"direction": "less_or_eq" if page == 1 else "less", "date": cursor_date}
                )
                result = request_json(
                    f"athlete/benchmarks/{benchmark_id}/benchmark_values?{query}",
                    token=token,
                )
                if not isinstance(result, dict) or not isinstance(result.get("items"), list):
                    raise RuntimeError("History endpoint returned an unexpected response")
                page_items = result["items"]
                new_items = []
                for item in page_items:
                    item_id = item.get("id") if isinstance(item, dict) else None
                    if isinstance(item_id, int) and item_id in seen_ids:
                        continue
                    if isinstance(item_id, int):
                        seen_ids.add(item_id)
                    new_items.append(item)
                entries.extend(new_items)

                pagination = result.get("pagination")
                has_less = pagination.get("has_less") if isinstance(pagination, dict) else False
                dated = [
                    item.get("date")
                    for item in page_items
                    if isinstance(item, dict) and isinstance(item.get("date"), str)
                ]
                if not has_less or not dated or not new_items:
                    break
                cursor_date = min(dated)
                page += 1
                if page > 100:
                    raise RuntimeError("History pagination exceeded the safety limit")

            histories.append(
                {
                    "benchmark": benchmark,
                    "entries": entries,
                }
            )

        output = {
            "source_endpoint": "GET athlete/benchmarks/{id}/benchmark_values",
            "benchmarks": histories,
        }
        OUTPUT.write_text(json.dumps(output, indent=2, ensure_ascii=False) + "\n")
    except urllib.error.HTTPError as exc:
        detail = exc.read().decode("utf-8", errors="replace")[:500]
        print(f"HWPO returned HTTP {exc.code} during {stage}.", file=sys.stderr)
        if detail:
            print(f"Server response: {detail}", file=sys.stderr)
        print("No output file was written.", file=sys.stderr)
        return 1
    except (OSError, ValueError, RuntimeError, urllib.error.URLError) as exc:
        print(f"Import failed during {stage}: {exc}", file=sys.stderr)
        return 1
    finally:
        password = ""

    total = sum(len(item["entries"]) for item in histories)
    print(f"\nSaved {total} dated entries across {len(histories)} benchmarks to:\n{OUTPUT}")
    for item in histories:
        benchmark = item["benchmark"]
        if benchmark.get("id") in (46, 47):
            print(f"\nID {benchmark['id']}: {benchmark.get('name')}")
            for entry in item["entries"]:
                if isinstance(entry, dict):
                    print(f"  {entry.get('date')}: {entry.get('value')} {entry.get('symbol')}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
