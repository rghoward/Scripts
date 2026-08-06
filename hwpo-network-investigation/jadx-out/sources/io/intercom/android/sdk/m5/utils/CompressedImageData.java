package io.intercom.android.sdk.m5.utils;

import android.net.Uri;
import defpackage.fh0;
import defpackage.os2;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
final class CompressedImageData {
    private final int height;
    private final long size;
    private final Uri uri;
    private final int width;

    public CompressedImageData(Uri uri, int i, int i2, long j) {
        uri.getClass();
        this.uri = uri;
        this.width = i;
        this.height = i2;
        this.size = j;
    }

    public static /* synthetic */ CompressedImageData copy$default(CompressedImageData compressedImageData, Uri uri, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            uri = compressedImageData.uri;
        }
        if ((i3 & 2) != 0) {
            i = compressedImageData.width;
        }
        if ((i3 & 4) != 0) {
            i2 = compressedImageData.height;
        }
        if ((i3 & 8) != 0) {
            j = compressedImageData.size;
        }
        int i4 = i2;
        return compressedImageData.copy(uri, i, i4, j);
    }

    public final Uri component1() {
        return this.uri;
    }

    public final int component2() {
        return this.width;
    }

    public final int component3() {
        return this.height;
    }

    public final long component4() {
        return this.size;
    }

    public final CompressedImageData copy(Uri uri, int i, int i2, long j) {
        uri.getClass();
        return new CompressedImageData(uri, i, i2, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompressedImageData)) {
            return false;
        }
        CompressedImageData compressedImageData = (CompressedImageData) obj;
        return xj5.a(this.uri, compressedImageData.uri) && this.width == compressedImageData.width && this.height == compressedImageData.height && this.size == compressedImageData.size;
    }

    public final int getHeight() {
        return this.height;
    }

    public final long getSize() {
        return this.size;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Long.hashCode(this.size) + os2.a(this.height, os2.a(this.width, this.uri.hashCode() * 31, 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CompressedImageData(uri=");
        sb.append(this.uri);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", size=");
        return fh0.b(sb, this.size, ')');
    }
}
