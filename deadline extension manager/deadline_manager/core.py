from __future__ import annotations

import re
from dataclasses import dataclass
from datetime import datetime, timedelta
from typing import Iterable


def normalized(value: str) -> str:
    return re.sub(r"[^a-z0-9]+", " ", (value or "").casefold()).strip()


def parse_iso(value: str | None) -> datetime | None:
    if not value:
        return None
    return datetime.fromisoformat(value.replace("Z", "+00:00"))


def iso(value: datetime | None) -> str | None:
    return value.isoformat(timespec="seconds") if value else None


def choose_unique(items: Iterable, label_getter, wanted: str):
    key = normalized(wanted)
    matches = [item for item in items if normalized(label_getter(item)) == key]
    return matches[0] if len(matches) == 1 else None


@dataclass(frozen=True)
class Dates:
    due: datetime
    late: datetime | None

    def validate(self) -> None:
        if self.late is not None and self.late < self.due:
            raise ValueError("Late/available-until deadline cannot precede the normal deadline")


def calculate_dates(current: Dates, mode: str, *, days: float = 0,
                    due: datetime | None = None, late: datetime | None = None) -> Dates:
    if mode == "shift":
        delta = timedelta(days=days)
        result = Dates(current.due + delta, current.late + delta if current.late else None)
    elif mode in {"same", "manual"}:
        if due is None:
            raise ValueError("A normal deadline is required")
        result = Dates(due, late)
    else:
        raise ValueError(f"Unknown date mode: {mode}")
    result.validate()
    return result
