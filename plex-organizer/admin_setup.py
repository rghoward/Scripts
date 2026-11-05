#!/usr/bin/python3
"""One-time privileged setup: backup Plex DB, grant traversal, save local API token."""
import os
from pathlib import Path
import pwd
import sqlite3
import subprocess
import time
import xml.etree.ElementTree as ET

user = pwd.getpwnam('ronnie')
base = Path('/var/lib/plexmediaserver/Library/Application Support/Plex Media Server')
token = ET.parse(base/'Preferences.xml').getroot().get('PlexOnlineToken')
if not token:
    raise SystemExit('Plex authentication token is missing; no settings changed.')
config = Path(user.pw_dir)/'.config/plex-organizer'
state = Path(user.pw_dir)/'.local/state/plex-organizer'
for folder in [config, state]:
    if folder.is_symlink():
        raise SystemExit('Refusing a symlink for private configuration directory')
    folder.mkdir(parents=True, exist_ok=True, mode=0o700)
    os.chown(folder,user.pw_uid,user.pw_gid)
    os.chmod(folder,0o700)
backup = state / ('plex-library-before-'+time.strftime('%Y%m%d-%H%M%S')+'.db')
source = sqlite3.connect('file:'+str(base/'Plug-in Support/Databases/com.plexapp.plugins.library.db')+'?mode=ro',uri=True)
with sqlite3.connect(backup) as destination:
    source.backup(destination)
source.close()
os.chown(backup,user.pw_uid,user.pw_gid)
os.chmod(backup,0o600)
fd=os.open(config/'token',os.O_WRONLY|os.O_CREAT|os.O_TRUNC|os.O_NOFOLLOW,0o600)
with os.fdopen(fd,'w') as handle:
    handle.write(token)
os.chown(config/'token',user.pw_uid,user.pw_gid)
os.chmod(config/'token',0o600)
# Plex can traverse the home directory without listing its contents.
subprocess.run(['setfacl','-m','u:plex:--x',user.pw_dir],check=True)
print('Plex database backed up. Local API credential saved privately. Plex home traversal granted.')
