package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ed0 extends u92.d.a {
    public final String a;
    public final byte[] b;

    public ed0(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    @Override // u92.d.a
    public final byte[] a() {
        return this.b;
    }

    @Override // u92.d.a
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u92.d.a)) {
            return false;
        }
        u92.d.a aVar = (u92.d.a) obj;
        if (this.a.equals(aVar.b())) {
            return Arrays.equals(this.b, aVar instanceof ed0 ? ((ed0) aVar).b : aVar.a());
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.b) + "}";
    }
}
