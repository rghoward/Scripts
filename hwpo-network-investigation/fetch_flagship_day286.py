#!/usr/bin/env python3
"""Fetch FLAGSHIP 1.0 Day 286 using the date-and-plan endpoint."""

import getpass
import json
import urllib.error
from pathlib import Path

from fetch_one_day import embedded_oauth_fields, request_json


OUTPUT = Path(__file__).resolve().parent / "hwpo-flagship-1.0-day-286.json"


def main() -> int:
    print("Target: FLAGSHIP 1.0 Day 286 (2024-01-12)")
    print("Credentials and access tokens are not written to disk.\n")
    email = input("HWPO email: ").strip()
    password = getpass.getpass("HWPO password: ")
    try:
        client_id, client_secret = embedded_oauth_fields()
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
        token = auth.get("access_token") if isinstance(auth, dict) else None
        if not isinstance(token, str):
            raise RuntimeError("Login returned no access token")
        result = request_json("athlete/schedules/2024-01-12/plans/73", token=token)
        OUTPUT.write_text(json.dumps(result, indent=2, ensure_ascii=False) + "\n")
    except urllib.error.HTTPError as exc:
        print(f"Target endpoint returned HTTP {exc.code}; nothing was saved.")
        return 1
    except Exception as exc:
        print(f"Request failed: {exc}")
        return 1
    finally:
        password = ""
    print(f"Saved targeted response to:\n{OUTPUT}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
