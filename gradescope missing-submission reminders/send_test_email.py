#!/usr/bin/env python3
"""Preview or send one fixed, non-student test email."""

from __future__ import annotations

import argparse

from auth_check import create_account, fail, secure_token_cache


RECIPIENT = "rghoward1988@gmail.com"
SUBJECT = "Gradescope Reminder Emailer Test"
BODY = """Hello,

This is a test message from the new Gradescope missing-submission reminder system.

Microsoft authentication and individual email delivery are working. No student data is included in this test.

Thanks,
Ronnie
"""


def main() -> None:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument(
        "--send",
        action="store_true",
        help="Actually send the test. Without this flag, only a preview is shown.",
    )
    args = parser.parse_args()

    print(f"To: {RECIPIENT}")
    print(f"Subject: {SUBJECT}")
    print("\n" + BODY)
    if not args.send:
        print("DRY RUN: no email sent. Add --send to deliver this exact message.")
        return

    account, _microsoft = create_account()
    if not account.is_authenticated:
        fail("Microsoft authentication is unavailable. Run auth_check.py first.")

    message = account.new_message()
    message.to.add(RECIPIENT)
    message.subject = SUBJECT
    message.body = BODY
    if not message.send():
        fail("Microsoft Graph did not confirm that the test email was sent.")
    secure_token_cache()
    print(f"Test email sent successfully to {RECIPIENT}.")


if __name__ == "__main__":
    main()
