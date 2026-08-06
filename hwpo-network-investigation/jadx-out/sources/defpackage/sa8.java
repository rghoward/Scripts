package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sa8<T> implements ra8<T>, h37<T> {
    public final /* synthetic */ h37<T> t;
    public final h72 u;

    public sa8(h37<T> h37Var, h72 h72Var) {
        this.t = h37Var;
        this.u = h72Var;
    }

    @Override // defpackage.t72
    public final h72 getCoroutineContext() {
        return this.u;
    }

    @Override // defpackage.yz9
    public final T getValue() {
        return this.t.getValue();
    }

    @Override // defpackage.h37
    public final void setValue(T t) {
        this.t.setValue(t);
    }
}
