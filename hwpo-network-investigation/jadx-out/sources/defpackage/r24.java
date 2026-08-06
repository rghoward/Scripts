package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class r24 implements xs3<pf2<ge9>> {
    public final ve5 a;
    public final lf8<h72> b;
    public final lf8<he9> c;

    public r24(ve5 ve5Var, lf8 lf8Var, lf8 lf8Var2) {
        this.a = ve5Var;
        this.b = lf8Var;
        this.c = lf8Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nf8
    public final Object get() {
        Context context = (Context) this.a.a;
        h72 h72Var = this.b.get();
        he9 he9Var = this.c.get();
        context.getClass();
        h72Var.getClass();
        he9Var.getClass();
        return n24.a(he9Var, new un8(new hj2(1, he9Var)), u72.a(h72Var), new m24(0, context));
    }
}
