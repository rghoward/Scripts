package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class r76 implements lv8, q20 {
    public final Object t;

    public r76() {
        fh6 fh6Var = new fh6();
        this.t = fh6Var;
        if (fh6Var.u) {
            return;
        }
        if (fh6Var.v) {
            d78.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
        }
        fh6Var.a();
        fh6Var.v = true;
    }

    @Override // defpackage.q20
    public Object a(t69 t69Var, Float f, Float f2, oh4 oh4Var, wt9 wt9Var) throws Throwable {
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f2.floatValue();
        Object objB = b23.b(t69Var, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, zv.b(0.0f, fFloatValue2, 28), (wv) this.t, oh4Var, wt9Var);
        return objB == v72.t ? objB : (tv) objB;
    }

    public r76(wv wvVar) {
        this.t = wvVar;
    }
}
