#!/usr/bin/python3
"""Bridge to Ubuntu Secret Service; credentials travel only over private pipes."""
import json
import sys
import gi

gi.require_version('Secret', '1')
from gi.repository import Secret

schema = Secret.Schema.new('com.honeycomb.monitor', Secret.SchemaFlags.NONE,
                           {'application': Secret.SchemaAttributeType.STRING})
attributes = {'application': 'honeycomb-monitor'}
try:
    if sys.argv[1] == 'store':
        value = sys.stdin.read()
        credentials = json.loads(value)
        if not credentials.get('email') or not credentials.get('password'):
            raise ValueError('Missing credentials')
        if not Secret.password_store_sync(schema, attributes, Secret.COLLECTION_DEFAULT,
                                          'Honeycomb monitor automatic login', value, None):
            raise RuntimeError('Keyring storage failed')
    elif sys.argv[1] == 'lookup':
        value = Secret.password_lookup_sync(schema, attributes, None)
        if value is None:
            sys.exit(3)
        sys.stdout.write(value)
    else:
        sys.exit(2)
except Exception:
    print('Ubuntu login keyring is unavailable or locked. Unlock it in Passwords and Keys, then retry.', file=sys.stderr)
    sys.exit(1)
