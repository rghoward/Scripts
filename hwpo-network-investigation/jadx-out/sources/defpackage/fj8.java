package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class fj8 extends su8 {
    public final String v;
    public final long w;
    public final ni8 x;

    public fj8(String str, long j, ni8 ni8Var) {
        this.v = str;
        this.w = j;
        this.x = ni8Var;
    }

    @Override // defpackage.su8
    public final long k() {
        return this.w;
    }

    @Override // defpackage.su8
    public final wq6 m() {
        String str = this.v;
        if (str != null) {
            ol8 ol8Var = wq6.e;
            try {
                return wq6.a.a(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.su8
    public final hy0 p() {
        return this.x;
    }
}
