package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class yn2<T, R> extends xn2<T, R> implements r02<R> {
    public kn5 t;
    public Object u;
    public r02<Object> v;
    public Object w;

    @Override // defpackage.xn2
    public final void a(Object obj, ln5 ln5Var) {
        this.v = ln5Var;
        this.u = obj;
    }

    @Override // defpackage.r02
    public final h72 getContext() {
        return ff3.t;
    }

    @Override // defpackage.r02
    public final void resumeWith(Object obj) {
        this.v = null;
        this.w = obj;
    }
}
