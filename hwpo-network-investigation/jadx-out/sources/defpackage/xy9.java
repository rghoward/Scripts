package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class xy9<T> implements r02<T>, w72 {
    public final x91.a t;
    public final h72 u;

    public xy9(x91.a aVar, h72 h72Var) {
        this.t = aVar;
        this.u = h72Var;
    }

    @Override // defpackage.w72
    public final w72 getCallerFrame() {
        return this.t;
    }

    @Override // defpackage.r02
    public final h72 getContext() {
        return this.u;
    }

    @Override // defpackage.r02
    public final void resumeWith(Object obj) {
        this.t.resumeWith(obj);
    }
}
