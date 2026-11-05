#!/usr/bin/env python3
"""Conservative linked Plex library; original downloads are never modified."""
import argparse
import fcntl
import hashlib
import json
import os
from pathlib import Path
import re
import time
import urllib.parse
import urllib.request
import xml.etree.ElementTree as ET

VIDEO = {'.mkv', '.mp4', '.avi', '.m4v', '.mov', '.ts', '.wmv'}
SUBTITLE = {'.srt', '.ass', '.ssa', '.vtt', '.sub', '.idx'}
EXTRAS = {'sample', 'samples', 'extras', 'featurettes', 'behind the scenes', 'trailers'}
EPISODE = re.compile(r'(?i)(?<!\w)(?:s(?P<s>\d{1,2})[ ._-]*e(?P<e>\d{1,3})|(?P<sx>\d{1,2})x(?P<ex>\d{2}))(?!\d)')
YEAR = re.compile(r'(?<!\d)((?:19|20)\d{2})(?!\d)')
STATE = Path.home() / '.local/state/plex-organizer'
CONFIG = Path(__file__).with_name('config.json')


def clean(text):
    text = re.sub(r'^www\.[^\s]+\s*-\s*', '', text, flags=re.I)
    text = re.sub(r'[._]+', ' ', text)
    text = re.sub(r'[<>:"/\\|?*\x00-\x1f]', ' ', text)
    return re.sub(r'\s+', ' ', text).strip(' -()[]')


def alias(text):
    return re.sub(r'[^a-z0-9]', '', text.casefold())


def classify(file, source, config):
    relative = file.relative_to(source)
    if any(p.casefold() in EXTRAS for p in relative.parts[:-1]):
        return None, 'extra/sample'
    if re.search(r'(?i)(?:^|[ ._-])sample(?:[ ._-]|$)', file.stem):
        return None, 'extra/sample'
    # Match separators after cleaning dots, preserving release-year hints.
    stem = clean(file.stem)
    episode = EPISODE.search(stem)
    if episode:
        raw = stem[:episode.start()].strip(' -')
        year = YEAR.search(raw)
        title = clean(raw[:year.start()] if year else raw)
        identity = config.get('shows', {}).get(alias(title))
        show = identity or (f'{title} ({year.group(1)})' if year else title)
        if not show:
            return None, 'missing show name'
        season = int(episode.group('s') or episode.group('sx'))
        number = int(episode.group('e') or episode.group('ex'))
        # Multi-episode files require an explicit override rather than losing episodes.
        if re.match(r'(?i)\s*[- ]?E\d+', stem[episode.end():]):
            return None, 'multi-episode file needs review'
        return Path('TV Shows') / show / f'Season {season:02}' / f'{show} - S{season:02}E{number:02}', None
    year = YEAR.search(stem)
    if not year:
        return None, 'no clear movie year or episode number'
    title = clean(stem[:year.start()])
    if not title or re.search(r'(?i)\b(?:season|s\d{1,2})\b', title):
        return None, 'uncertain movie title'
    name = f'{title} ({year.group(1)})'
    return Path('Movies') / name / name, None


def atomic_json(file, value):
    file.parent.mkdir(parents=True, exist_ok=True, mode=0o700)
    temporary = file.with_suffix('.tmp')
    with open(temporary, 'w', opener=lambda p, f: os.open(p, f, 0o600)) as handle:
        json.dump(value, handle, indent=2)
    temporary.replace(file)


def plex(endpoint, method='GET', params=None):
    token = (Path.home() / '.config/plex-organizer/token').read_text().strip()
    url = 'http://127.0.0.1:32400' + endpoint
    if params:
        url += '?' + urllib.parse.urlencode(params, doseq=True)
    request = urllib.request.Request(url, method=method, headers={'X-Plex-Token': token})
    with urllib.request.urlopen(request, timeout=60) as response:
        data = response.read()
    return ET.fromstring(data) if data.strip() else None


def organize(config, apply=False):
    destination = Path(config['destination'])
    planned, review, pending = [], [], []
    # Missing input roots abort before changing links or requesting scans.
    for value in config['sources']:
        source = Path(value)
        if not source.is_dir() or (value in config.get('required_mounts', []) and not os.path.ismount(source)):
            raise RuntimeError(f'Source unavailable: {source}; leaving library unchanged')
        for directory, dirs, files in os.walk(source, followlinks=False):
            dirs[:] = sorted(d for d in dirs if not d.startswith('.') and d.casefold() not in {'incomplete', 'temp', 'lost+found'})
            for name in sorted(files):
                file = Path(directory) / name
                if file.suffix.lower() not in VIDEO or file.is_symlink():
                    continue
                result, reason = classify(file, source, config)
                if result is None:
                    review.append({'file': str(file), 'reason': reason})
                    continue
                stat = file.stat()
                if stat.st_size == 0 or time.time() - stat.st_mtime < config.get('settle_minutes', 10) * 60:
                    pending.append(str(file))
                    continue
                # Keep alternate encodes distinct, with stable suffixes Plex ignores for matching.
                digest = hashlib.sha256(str(file).encode()).hexdigest()[:10]
                target = destination / result.parent / (result.name + f' - [{digest}]' + file.suffix.lower())
                planned.append((file, target))
                for subtitle in file.parent.iterdir():
                    if subtitle.suffix.lower() in SUBTITLE and (subtitle.stem == file.stem or subtitle.stem.startswith(file.stem + '.')):
                        language = subtitle.stem[len(file.stem):]
                        planned.append((subtitle, target.with_suffix('').with_name(target.stem + language + subtitle.suffix.lower())))
    added = 0
    for source, target in planned:
        if target.is_symlink():
            if Path(os.readlink(target)) != source:
                raise RuntimeError(f'Existing link points elsewhere: {target}')
        elif target.exists():
            raise RuntimeError(f'Refusing to replace existing file: {target}')
        else:
            added += 1
            if apply:
                target.parent.mkdir(parents=True, exist_ok=True, mode=0o755)
                target.symlink_to(source)
    report = {'video_links': sum(s.suffix.lower() in VIDEO for s, _ in planned), 'new_links': added,
              'pending': pending, 'review': review, 'checked_at': time.strftime('%Y-%m-%dT%H:%M:%S%z')}
    if apply:
        atomic_json(STATE / 'report.json', report)
        pending_scan = STATE / 'scan-pending.json'
        if added:
            atomic_json(pending_scan, {'requested_at': report['checked_at']})
        if pending_scan.exists() and config.get('plex_configured'):
            for section in config['sections']:
                plex(f'/library/sections/{section}/refresh')
            pending_scan.unlink()
    return report, planned


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('--apply', action='store_true', help='Create links and scan configured Plex libraries')
    args = parser.parse_args()
    config = json.loads(CONFIG.read_text())
    STATE.mkdir(parents=True, exist_ok=True, mode=0o700)
    with (STATE / 'run.lock').open('w') as lock:
        try:
            fcntl.flock(lock, fcntl.LOCK_EX | fcntl.LOCK_NB)
        except BlockingIOError:
            print('Organizer already running; skipped')
            return
        report, plan = organize(config, args.apply)
        print(json.dumps(report, indent=2))
        if not args.apply:
            for source, target in plan:
                print(f'{source.name} -> {target}')


if __name__ == '__main__':
    main()
