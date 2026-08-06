package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s65 implements su6.a {
    public final byte[] a;
    public final String b;
    public final String c;

    public s65(String str, String str2, byte[] bArr) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    @Override // su6.a
    public final void b(np6.a aVar) {
        String str = this.b;
        if (str != null) {
            aVar.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s65.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((s65) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return i34.b(this.a.length, "\"", vb0.a("ICY: title=\"", this.b, "\", url=\"", this.c, "\", rawMetadata.length=\""));
    }
}
