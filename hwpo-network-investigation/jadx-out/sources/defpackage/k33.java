package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class k33 implements v31 {
    public final e33 t;

    public k33(e33 e33Var) {
        this.t = e33Var;
    }

    @Override // defpackage.v31
    public final void c(Throwable th) {
        this.t.dispose();
    }

    public final String toString() {
        return "DisposeOnCancel[" + this.t + ']';
    }
}
