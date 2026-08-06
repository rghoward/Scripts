package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c7b {
    public int a;
    public final int[] b;
    public final int[] c;

    public c7b(short s, short s2) {
        if (s > 254 || s < 0) {
            z90.a(pk.d(s, "Near cache size ", " is invalid"));
            throw null;
        }
        if (s2 > 254 || s2 < 0) {
            z90.a(pk.d(s2, "Same cache size ", " is invalid"));
            throw null;
        }
        if (s + s2 > 254) {
            z90.a(a30.b("Using near cache size ", " and same cache size ", " would exceed maximum number of COPY modes (256", s, s2));
            throw null;
        }
        this.b = new int[s];
        this.c = new int[s2 * 256];
    }

    public final short a() {
        return (byte) (((this.c.length / 256) + ((short) (this.b.length + 2))) - 1);
    }
}
