package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class d66 implements Runnable {
    public final /* synthetic */ g66 t;

    public d66(g66 g66Var, g66 g66Var2) {
        this.t = g66Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g66 g66Var = this.t;
        m76 m76VarA = vib.a(g66Var);
        if (m76VarA == null) {
            return;
        }
        oy0.d(i76.a(m76VarA.getLifecycle()), null, null, new e66(m76VarA, g66Var, null), 3);
    }
}
