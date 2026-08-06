package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class bt5 {
    public volatile zt6 a;
    public volatile f01 b;

    static {
        vr3.a();
    }

    public final zt6 a(zt6 zt6Var) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = zt6Var;
                        this.b = f01.u;
                    } catch (gk5 unused) {
                        this.a = zt6Var;
                        this.b = f01.u;
                    }
                }
            }
        }
        return this.a;
    }
}
