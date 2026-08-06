package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rc9 {
    public final hy3 a;
    public final Uri b;
    public final String c;

    public rc9(hy3 hy3Var, Uri uri, String str) {
        this.a = hy3Var;
        this.b = uri;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc9)) {
            return false;
        }
        rc9 rc9Var = (rc9) obj;
        return this.a == rc9Var.a && this.b.equals(rc9Var.b) && this.c.equals(rc9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendAttachmentModel(fileType=");
        sb.append(this.a);
        sb.append(", uri=");
        sb.append(this.b);
        sb.append(", fileName=");
        return av.a(sb, this.c, ")");
    }
}
