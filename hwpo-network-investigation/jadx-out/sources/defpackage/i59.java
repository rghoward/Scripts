package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class i59<T> extends x0<T> implements w72 {
    public final r02<T> y;

    public i59(r02 r02Var, h72 h72Var) {
        super(h72Var, true);
        this.y = r02Var;
    }

    @Override // defpackage.ll5
    public final boolean b0() {
        return true;
    }

    @Override // defpackage.w72
    public final w72 getCallerFrame() {
        r02<T> r02Var = this.y;
        if (r02Var instanceof w72) {
            return (w72) r02Var;
        }
        return null;
    }

    @Override // defpackage.ll5
    public void r(Object obj) {
        b23.e(th0.e(this.y), lp1.b(obj));
    }

    @Override // defpackage.ll5
    public void s(Object obj) {
        this.y.resumeWith(lp1.b(obj));
    }

    public void E0() {
    }
}
