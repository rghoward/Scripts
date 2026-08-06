package io.ably.lib.network;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class HttpBody {
    private final byte[] content;
    private final String contentType;

    public HttpBody(String str, byte[] bArr) {
        this.contentType = str;
        this.content = bArr;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof HttpBody;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HttpBody)) {
            return false;
        }
        HttpBody httpBody = (HttpBody) obj;
        if (!httpBody.canEqual(this)) {
            return false;
        }
        String contentType = getContentType();
        String contentType2 = httpBody.getContentType();
        if (contentType != null ? contentType.equals(contentType2) : contentType2 == null) {
            return Arrays.equals(getContent(), httpBody.getContent());
        }
        return false;
    }

    public byte[] getContent() {
        return this.content;
    }

    public String getContentType() {
        return this.contentType;
    }

    public int hashCode() {
        String contentType = getContentType();
        return Arrays.hashCode(getContent()) + (((contentType == null ? 43 : contentType.hashCode()) + 59) * 59);
    }

    public String toString() {
        return "HttpBody(contentType=" + getContentType() + ", content=" + Arrays.toString(getContent()) + ")";
    }
}
