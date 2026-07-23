#!/usr/bin/env python3
"""Preview due coordinator notifications without sending email."""

from coordinator.deadlines import due_notification_previews


def main() -> None:
    messages = due_notification_previews()
    print(f"{len(messages)} notification(s) are due. Delivery is disabled.")
    for item in messages:
        print(f"- {item['kind']}: {item['grader_name']} <{item['email']}> — {item['subject']}")


if __name__ == "__main__":
    main()
