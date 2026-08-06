package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q4 implements b33 {
    public final /* synthetic */ mh4 a;
    public final /* synthetic */ m76 b;
    public final /* synthetic */ p4 c;

    public q4(mh4 mh4Var, m76 m76Var, p4 p4Var) {
        this.a = mh4Var;
        this.b = m76Var;
        this.c = p4Var;
    }

    @Override // defpackage.b33
    public final void dispose() {
        this.a.invoke();
        this.b.getLifecycle().c(this.c);
    }
}
