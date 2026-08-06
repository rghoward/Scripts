package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rq9 {
    public final boolean a;
    public final ba9 b;
    public final u99 c;

    public rq9(boolean z, ba9 ba9Var, u99 u99Var) {
        this.a = z;
        this.b = ba9Var;
        this.c = u99Var;
    }

    public final pb2 a() {
        u99 u99Var = this.c;
        int i = u99Var.a;
        int i2 = u99Var.b;
        if (i < i2) {
            return pb2.u;
        }
        return i > i2 ? pb2.t : pb2.v;
    }

    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.a + ", crossed=" + a() + ", info=\n\t" + this.c + ')';
    }
}
