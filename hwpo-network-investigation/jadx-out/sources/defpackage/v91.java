package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class v91<T> extends u91<T> {
    public final ci4<ua8<? super T>, r02<? super g2b>, Object> w;

    /* JADX WARN: Multi-variable type inference failed */
    public v91(ci4<? super ua8<? super T>, ? super r02<? super g2b>, ? extends Object> ci4Var, h72 h72Var, int i, xx0 xx0Var) {
        super(h72Var, i, xx0Var);
        this.w = ci4Var;
    }

    @Override // defpackage.u91
    public Object i(ua8<? super T> ua8Var, r02<? super g2b> r02Var) {
        Object objInvoke = this.w.invoke(ua8Var, r02Var);
        return objInvoke == v72.t ? objInvoke : g2b.a;
    }

    @Override // defpackage.u91
    public u91<T> j(h72 h72Var, int i, xx0 xx0Var) {
        return new v91(this.w, h72Var, i, xx0Var);
    }

    @Override // defpackage.u91
    public final String toString() {
        return "block[" + this.w + "] -> " + super.toString();
    }
}
