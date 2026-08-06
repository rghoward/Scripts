#!/usr/bin/env python3
"""Fetch the current user's populated HWPO benchmarks without persisting credentials."""

from __future__ import annotations

import getpass
import json
import re
import subprocess
import sys
import urllib.error
import urllib.parse
import urllib.request
from pathlib import Path


ROOT = Path(__file__).resolve().parent
APK = ROOT / "hwpo-base.apk"
OUTPUT = ROOT / "hwpo-benchmarks.json"
API = "https://app.hwpo-training.com/mobile/api/v4/"


def embedded_oauth_fields() -> tuple[str, str]:
    dex = subprocess.run(
        ["unzip", "-p", str(APK), "classes.dex"],
        check=True,
        capture_output=True,
    ).stdout
    match = re.search(
        rb"clientSecret=([^,\x00]+), clientId=([^,\x00]+), hwpoSignUpUrl=",
        dex,
    )
    if not match:
        raise RuntimeError("Could not locate the app client configuration in the APK")
    return match.group(2).decode(), match.group(1).decode()


def request_json(
    path: str,
    *,
    method: str = "GET",
    token: str | None = None,
    form: dict[str, str] | None = None,
) -> object:
    headers = {"Accept": "application/json"}
    body = None
    if token:
        headers["Authorization"] = f"Bearer {token}"
    if form is not None:
        body = urllib.parse.urlencode(form).encode()
        headers["Content-Type"] = "application/x-www-form-urlencoded"
    request = urllib.request.Request(API + path, data=body, headers=headers, method=method)
    with urllib.request.urlopen(request, timeout=30) as response:
        return json.load(response)


def main() -> int:
    print("HWPO benchmark import (read-only)")
    print("Credentials and access tokens are not written to disk.\n")
    email = input("HWPO email: ").strip()
    password = getpass.getpass("HWPO password: ")
    if not email or not password:
        print("Email and password are required.", file=sys.stderr)
        return 2

    stage = "reading client configuration"
    try:
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

        # The installed client declares ``benchmark_values/with_value``. Some
        # server deployments expose the same read-only resource under the
        # shorter ``benchmarks`` name, so try only these known-safe GET forms.
        candidates = [
            "athlete/benchmark_values/with_value",
            "athlete/benchmarks/with_value",
            "athlete/benchmark_values",
            "athlete/benchmarks",
        ]
        endpoint = None
        first_result: object = None
        query = urllib.parse.urlencode(
            {"page": 1, "per_page": 100, "q[name_cont]": ""}
        )
        for candidate in candidates:
            stage = f"probing GET {candidate}"
            try:
                first_result = request_json(f"{candidate}?{query}", token=token)
                endpoint = candidate
                break
            except urllib.error.HTTPError as exc:
                if exc.code != 404:
                    raise
        if endpoint is None:
            raise RuntimeError("None of the app's read-only benchmark routes were available")

        all_items: list[object] = []
        page = 1
        per_page = 100
        last_pagination: object = None
        while True:
            query = urllib.parse.urlencode(
                {"page": page, "per_page": per_page, "q[name_cont]": ""}
            )
            stage = f"benchmark page {page}"
            if page == 1:
                result = first_result
            else:
                result = request_json(f"{endpoint}?{query}", token=token)
            if not isinstance(result, dict) or not isinstance(result.get("items"), list):
                raise RuntimeError("Benchmark endpoint returned an unexpected response")
            items = result["items"]
            all_items.extend(items)
            last_pagination = result.get("pagination")

            if not items or len(items) < per_page:
                break
            if isinstance(last_pagination, dict):
                total_pages = last_pagination.get("total_pages")
                if isinstance(total_pages, int) and page >= total_pages:
                    break
            page += 1
            if page > 100:
                raise RuntimeError("Pagination exceeded the safety limit")

        output = {
            "source_endpoint": f"GET {endpoint}",
            "items": all_items,
            "pagination": last_pagination,
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

    print(f"\nSaved {len(all_items)} populated benchmark(s) to:\n{OUTPUT}")
    for item in all_items:
        if isinstance(item, dict) and item.get("id") in (46, 47):
            print(
                f"ID {item.get('id')}: {item.get('name')} = "
                f"{item.get('last_value')} {item.get('units')}"
            )
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
