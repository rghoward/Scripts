package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tm3 implements su6.a {
    public static final id4 g;
    public static final id4 h;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    public int f;

    static {
        id4.a aVar = new id4.a();
        aVar.n = fv6.n("application/id3");
        g = new id4(aVar);
        id4.a aVar2 = new id4.a();
        aVar2.n = fv6.n("application/x-scte35");
        h = new id4(aVar2);
    }

    public tm3(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    @Override // su6.a
    public final id4 a() {
        switch (this.a) {
            case "urn:scte:scte35:2014:bin":
                return h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return g;
            default:
                return null;
        }
    }

    @Override // su6.a
    public final byte[] c() {
        if (a() != null) {
            return this.e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tm3.class != obj.getClass()) {
            return false;
        }
        tm3 tm3Var = (tm3) obj;
        return this.c == tm3Var.c && this.d == tm3Var.d && this.a.equals(tm3Var.a) && this.b.equals(tm3Var.b) && Arrays.equals(this.e, tm3Var.e);
    }

    public final int hashCode() {
        if (this.f == 0) {
            int iC = ru3.c(ru3.c(527, 31, this.a), 31, this.b);
            long j = this.c;
            int i = (iC + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.d;
            this.f = Arrays.hashCode(this.e) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }
}
