package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dk7 implements i41 {
    public final zg0 t;
    public final k60 u = new k60(0);

    public dk7(zg0 zg0Var) {
        this.t = zg0Var;
    }

    @Override // defpackage.i41
    public final void cancel() {
        if (this.u.compareAndSet(1, 1)) {
            return;
        }
        this.t.invoke();
    }
}
