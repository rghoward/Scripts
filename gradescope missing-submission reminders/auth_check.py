#!/usr/bin/env python3
"""Authenticate to GT Microsoft 365 and verify mailbox identity without sending mail."""

from __future__ import annotations

import os
import platform
import subprocess
import sys
import tomllib
import webbrowser
from http.server import BaseHTTPRequestHandler, HTTPServer
from pathlib import Path
from urllib.parse import urlparse

from O365 import Account, FileSystemTokenBackend


PROJECT_DIR = Path(__file__).resolve().parent
CONFIG_PATH = PROJECT_DIR / "config.local.toml"
if os.environ.get("GRADESCOPE_REMINDER_STATE_DIR"):
    STATE_DIR = Path(os.environ["GRADESCOPE_REMINDER_STATE_DIR"])
elif sys.platform == "darwin":
    STATE_DIR = Path.home() / "Library" / "Application Support" / "Gradescope Reminder"
else:
    STATE_DIR = Path(os.environ.get("XDG_STATE_HOME", Path.home() / ".local" / "state")) / "gradescope-reminder"
TOKEN_FILENAME = "grader_o365_token.txt"
TOKEN_PATH = STATE_DIR / TOKEN_FILENAME


def fail(message: str) -> None:
    print(f"ERROR: {message}", file=sys.stderr)
    raise SystemExit(1)


def load_config() -> dict:
    if not CONFIG_PATH.exists():
        fail("config.local.toml is missing. Copy config.example.toml and fill in the client ID.")
    with CONFIG_PATH.open("rb") as handle:
        config = tomllib.load(handle)
    microsoft = config.get("microsoft", {})
    required = (
        "client_id", "tenant_id", "redirect_uri", "keychain_account", "keychain_service"
    )
    missing = [name for name in required if not str(microsoft.get(name, "")).strip()]
    if missing:
        fail(f"Missing Microsoft configuration: {', '.join(missing)}")
    return microsoft


def read_client_secret(account: str, service: str, env_name: str) -> str:
    if env_name and os.environ.get(env_name):
        return os.environ[env_name]
    if sys.platform != "darwin":
        fail(f"Set {env_name} to the Microsoft client secret on {platform.system()}.")
    result = subprocess.run(
        [
            "/usr/bin/security",
            "find-generic-password",
            "-a",
            account,
            "-s",
            service,
            "-w",
        ],
        check=False,
        capture_output=True,
        text=True,
    )
    if result.returncode != 0:
        fail("The client secret was not found in macOS Keychain.")
    secret = result.stdout.strip()
    if not secret:
        fail("The Keychain item exists but contains no secret value.")
    return secret


def localhost_consent_handler(redirect_uri: str):
    """Return an O365 consent handler that captures the OAuth redirect locally."""
    parsed = urlparse(redirect_uri)
    if parsed.scheme != "http" or parsed.hostname not in {"localhost", "127.0.0.1"}:
        fail("The redirect URI must use an HTTP localhost callback.")
    port = parsed.port or 80
    callback_path = parsed.path or "/"

    def handle_consent(consent_url: str) -> str:
        captured: dict[str, str] = {}

        class CallbackHandler(BaseHTTPRequestHandler):
            def do_GET(self) -> None:  # noqa: N802 - required by BaseHTTPRequestHandler
                if urlparse(self.path).path != callback_path:
                    self.send_response(404)
                    self.end_headers()
                    return
                captured["url"] = f"{redirect_uri.split(callback_path, 1)[0]}{self.path}"
                body = (
                    "<!doctype html><meta charset='utf-8'><title>Authentication complete</title>"
                    "<h1>Authentication received</h1>"
                    "<p>You may close this tab and return to Terminal.</p>"
                ).encode()
                self.send_response(200)
                self.send_header("Content-Type", "text/html; charset=utf-8")
                self.send_header("Content-Length", str(len(body)))
                self.end_headers()
                self.wfile.write(body)

            def log_message(self, _format: str, *_args: object) -> None:
                return

        try:
            server = HTTPServer(("127.0.0.1", port), CallbackHandler)
        except OSError as exc:
            fail(f"Could not start the localhost callback on port {port}: {exc}")
        server.timeout = 300
        print("Opening the secure Microsoft sign-in page in your browser…")
        if not webbrowser.open(consent_url):
            print(f"Open this Microsoft URL manually:\n{consent_url}")
        server.handle_request()
        server.server_close()
        if "url" not in captured:
            fail("Microsoft sign-in timed out before the callback was received.")
        return captured["url"]

    return handle_consent


def create_account() -> tuple[Account, dict]:
    microsoft = load_config()
    redirect = urlparse(microsoft["redirect_uri"])
    if redirect.scheme != "http" or redirect.hostname not in {"localhost", "127.0.0.1"}:
        fail("The configured OAuth callback must be an HTTP localhost address.")
    # OAuthlib blocks all plain HTTP by default, including the OAuth desktop-app
    # localhost exception. This affects only the one-time loopback callback;
    # authorization and token exchanges with Microsoft remain HTTPS.
    os.environ["OAUTHLIB_INSECURE_TRANSPORT"] = "1"
    secret = read_client_secret(
        microsoft["keychain_account"], microsoft["keychain_service"],
        microsoft.get("client_secret_env", "GRADESCOPE_REMINDER_CLIENT_SECRET"),
    )

    STATE_DIR.mkdir(parents=True, exist_ok=True, mode=0o700)
    token_backend = FileSystemTokenBackend(
        token_path=STATE_DIR,
        token_filename=TOKEN_FILENAME,
    )
    account = Account(
        (microsoft["client_id"], secret),
        token_backend=token_backend,
        tenant_id=microsoft["tenant_id"],
        auth_flow_type="authorization",
    )
    return account, microsoft


def secure_token_cache() -> None:
    if TOKEN_PATH.exists():
        TOKEN_PATH.chmod(0o600)


def main() -> None:
    account, microsoft = create_account()

    if not account.is_authenticated:
        print("Microsoft sign-in is required. No email will be created or sent.")
        authenticated = account.authenticate(
            scopes=["basic", "message_send"],
            redirect_uri=microsoft["redirect_uri"],
            handle_consent=localhost_consent_handler(microsoft["redirect_uri"]),
        )
        if not authenticated:
            fail("Microsoft authentication did not complete.")
    secure_token_cache()

    user = account.get_current_user()
    if user is None:
        fail("Authentication succeeded, but Microsoft Graph did not return a mailbox identity.")

    display_name = getattr(user, "display_name", None) or "Unknown name"
    address = getattr(user, "mail", None) or getattr(user, "user_principal_name", None)
    print("Authentication check succeeded.")
    print(f"Signed in as: {display_name} <{address or 'address unavailable'}>")
    print("Mail.Send is authorized. No email was sent.")
    print(f"Token cache: {TOKEN_PATH}")


if __name__ == "__main__":
    main()
