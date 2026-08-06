package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class ct5 {
    public volatile au6 a;
    public volatile e01 b;

    public final au6 a(au6 au6Var) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = au6Var;
                        this.b = e01.u;
                    } catch (fk5 unused) {
                        this.a = au6Var;
                        this.b = e01.u;
                    }
                }
            }
        }
        return this.a;
    }
}
