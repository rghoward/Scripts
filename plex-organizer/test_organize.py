import json
from pathlib import Path
import tempfile
import time
import unittest
from unittest.mock import patch
from organize import classify, organize

class OrganizerTests(unittest.TestCase):
    def setUp(self):
        self.source = Path('/downloads')
        self.config = {'shows': {'silo': 'Silo (2023)', 'euphoriaus': 'Euphoria (2019)'}}

    def test_mixed_media(self):
        cases = {
            'Silo.3x05.Ricordi.ITA.ENG.mkv': 'TV Shows/Silo (2023)/Season 03/Silo (2023) - S03E05',
            'Euphoria.US.S02E01.Title.mkv': 'TV Shows/Euphoria (2019)/Season 02/Euphoria (2019) - S02E01',
            'Aladdin The Return of Jafar 1994 MULTI 1080p.mkv': 'Movies/Aladdin The Return of Jafar (1994)/Aladdin The Return of Jafar (1994)',
            "Widow's Bay - S01E04 - Beach Reads.mkv": "TV Shows/Widow's Bay/Season 01/Widow's Bay - S01E04",
            'Scrubs.2026.S01E08.720p.mkv': 'TV Shows/Scrubs (2026)/Season 01/Scrubs (2026) - S01E08',
        }
        for name, expected in cases.items():
            result, _ = classify(self.source / name, self.source, self.config)
            self.assertEqual(str(result), expected)

    def test_skip_ambiguous_and_extras(self):
        for name in ['random.mkv', 'Featurettes/The Great 2020.mkv', 'Movie.2020.sample.mkv', 'Show.S01E01E02.mkv']:
            self.assertIsNone(classify(self.source / name, self.source, self.config)[0])

    def test_links_only_and_idempotent(self):
        with tempfile.TemporaryDirectory() as tmp:
            root = Path(tmp); source = root/'downloads'; source.mkdir()
            media = source/'Example.2020.mkv'; media.write_bytes(b'original video')
            subtitle = source/'Example.2020.en.srt'; subtitle.write_text('subtitle')
            config = {'sources': [str(source)], 'destination': str(root/'Plex'), 'settle_minutes': 0}
            with patch('organize.STATE', root/'state'):
                report, _ = organize(config, False)
                self.assertFalse((root/'Plex').exists())
                report, plan = organize(config, True)
                self.assertEqual(report['new_links'], 2)
                for src, dest in plan:
                    self.assertTrue(dest.is_symlink()); self.assertEqual(dest.read_bytes(), src.read_bytes())
                self.assertEqual(organize(config, True)[0]['new_links'], 0)
                self.assertEqual(media.read_bytes(), b'original video')

    def test_unmounted_drive_aborts(self):
        with tempfile.TemporaryDirectory() as tmp:
            with patch('organize.os.path.ismount', return_value=False):
                with self.assertRaises(RuntimeError):
                    organize({'sources': [tmp], 'required_mounts': [tmp], 'destination': tmp+'/Plex'}, True)

    def test_failed_scan_retries_without_new_links(self):
        with tempfile.TemporaryDirectory() as tmp:
            root = Path(tmp); source = root/'downloads'; source.mkdir()
            (source/'Example.2020.mkv').write_bytes(b'video')
            config = {'sources': [str(source)], 'destination': str(root/'Plex'), 'settle_minutes': 0,
                      'plex_configured': True, 'sections': [6, 7]}
            with patch('organize.STATE', root/'state'):
                with patch('organize.plex', side_effect=OSError('offline')):
                    with self.assertRaises(OSError):
                        organize(config, True)
                self.assertTrue((root/'state/scan-pending.json').exists())
                with patch('organize.plex') as api:
                    self.assertEqual(organize(config, True)[0]['new_links'], 0)
                    self.assertEqual(api.call_count, 2)
                self.assertFalse((root/'state/scan-pending.json').exists())

    def test_missing_drive_aborts(self):
        with self.assertRaises(RuntimeError):
            organize({'sources':['/does-not-exist-plex-organizer'], 'destination':'/unused'}, True)

if __name__ == '__main__':
    unittest.main()
