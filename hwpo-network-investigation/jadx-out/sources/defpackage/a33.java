package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a33 implements im8 {
    public final oh4<c33, b33> t;
    public b33 u;

    /* JADX WARN: Multi-variable type inference failed */
    public a33(oh4<? super c33, ? extends b33> oh4Var) {
        this.t = oh4Var;
    }

    @Override // defpackage.im8
    public final void c() {
        b33 b33Var = this.u;
        if (b33Var != null) {
            b33Var.dispose();
        }
        this.u = null;
    }

    @Override // defpackage.im8
    public final void d() {
        this.u = this.t.invoke(wd3.a);
    }

    @Override // defpackage.im8
    public final void b() {
    }
}
