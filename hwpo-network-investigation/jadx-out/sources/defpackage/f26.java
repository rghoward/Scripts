package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class f26 extends dz9 {
    public final r02<g2b> y;

    public f26(h72 h72Var, ci4<? super t72, ? super r02<? super g2b>, ? extends Object> ci4Var) {
        super(h72Var, false);
        this.y = th0.d(this, this, ci4Var);
    }

    @Override // defpackage.ll5
    public final void q0() throws Throwable {
        try {
            b23.e(th0.e(this.y), g2b.a);
        } catch (Throwable th) {
            th = th;
            if (th instanceof x13) {
                th = ((x13) th).t;
            }
            resumeWith(dv8.a(th));
            throw th;
        }
    }
}
