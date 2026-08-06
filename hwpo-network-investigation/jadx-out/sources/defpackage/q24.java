package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q24 implements xs3<pf2<ee9>> {
    public final ve5 a;
    public final lf8<h72> b;

    public q24(ve5 ve5Var, lf8 lf8Var) {
        this.a = ve5Var;
        this.b = lf8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nf8
    public final Object get() {
        Context context = (Context) this.a.a;
        h72 h72Var = this.b.get();
        context.getClass();
        h72Var.getClass();
        return n24.a(fe9.a, new un8(new n70(1)), u72.a(h72Var), new l24(0, context));
    }
}
