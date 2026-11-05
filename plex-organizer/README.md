# Linked Plex library

Original downloads remain in `/media/ronnie/bulk` and `~/Downloads`.
Plex scans `~/Videos/Plex/Movies` and `~/Videos/Plex/TV Shows` only.
The organizer creates symbolic links with clean names and never modifies or deletes originals.

Run `python3 organize.py` to preview, or `python3 organize.py --apply` to create links.
The installed user timer runs every five minutes. Videos modified in the last ten minutes are deferred;
this is a settling heuristic, not a torrent-completion check. Incomplete/temp/hidden folders and
non-video partial extensions are ignored. Ambiguous files and extras are listed in
`~/.local/state/plex-organizer/report.json`. Use qBittorrent's incomplete-file suffix or temporary
download directory for downloads that preallocate files and pause for long periods.

`config.json` holds source paths, destination and known show names. Unknown files require a clear
movie year or episode number. Existing links, alternate versions and matching subtitles are preserved.
The organizer aborts if the bulk drive is unmounted and never deletes links automatically. Plex itself may mark items unavailable when a drive is offline. Failed scan requests are retried on the next organizer run.
Delete stale links manually if you intentionally remove an original. Do not use Plex's Delete Media
feature to manage originals; delete downloads through the downloader/file manager.

The local Plex token stays outside the repository in `~/.config/plex-organizer/token`, mode 600.
The one-time admin helper saves a private SQLite database backup under `~/.local/state/plex-organizer`
and gives the plex user traversal (not listing) permission through your home directory.
To stop automatic organization: `systemctl --user disable --now plex-organizer.timer`.
Plex library locations can be restored from the private `library-paths-before.json` snapshot.

During the initial migration, Plex automatic trash cleanup was disabled to retain old unavailable
catalog entries pending approval. Its previous value is saved in the private preferences-before.json.
No obsolete metadata records have been purged. Original media is never deleted by the organizer.
