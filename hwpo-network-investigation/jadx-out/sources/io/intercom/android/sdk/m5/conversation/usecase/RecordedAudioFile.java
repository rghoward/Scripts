package io.intercom.android.sdk.m5.conversation.usecase;

import android.net.Uri;
import defpackage.xj5;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class RecordedAudioFile {
    public static final int $stable = 8;
    private final File file;
    private final Uri uri;

    public RecordedAudioFile(File file, Uri uri) {
        file.getClass();
        uri.getClass();
        this.file = file;
        this.uri = uri;
    }

    public static /* synthetic */ RecordedAudioFile copy$default(RecordedAudioFile recordedAudioFile, File file, Uri uri, int i, Object obj) {
        if ((i & 1) != 0) {
            file = recordedAudioFile.file;
        }
        if ((i & 2) != 0) {
            uri = recordedAudioFile.uri;
        }
        return recordedAudioFile.copy(file, uri);
    }

    public final File component1() {
        return this.file;
    }

    public final Uri component2() {
        return this.uri;
    }

    public final RecordedAudioFile copy(File file, Uri uri) {
        file.getClass();
        uri.getClass();
        return new RecordedAudioFile(file, uri);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordedAudioFile)) {
            return false;
        }
        RecordedAudioFile recordedAudioFile = (RecordedAudioFile) obj;
        return xj5.a(this.file, recordedAudioFile.file) && xj5.a(this.uri, recordedAudioFile.uri);
    }

    public final File getFile() {
        return this.file;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.uri.hashCode() + (this.file.hashCode() * 31);
    }

    public String toString() {
        return "RecordedAudioFile(file=" + this.file + ", uri=" + this.uri + ')';
    }
}
