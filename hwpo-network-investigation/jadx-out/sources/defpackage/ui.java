package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ui implements uv0 {
    public final /* synthetic */ xi t;

    @Override // defpackage.uv0
    public final void a(tv0 tv0Var) {
        xi xiVar = this.t;
        synchronized (xiVar) {
            try {
                if (xiVar.b instanceof f13) {
                    xiVar.c.add(tv0Var);
                }
                xiVar.b.a(tv0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
