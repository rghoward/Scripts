package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vj implements q63 {
    public final a a;
    public final /* synthetic */ wj<Object> b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements f63 {
        public final /* synthetic */ wj<Object> a;

        public a(wj<Object> wjVar) {
            this.a = wjVar;
        }

        @Override // defpackage.f63
        public final void a(float f) {
            wj<Object> wjVar = this.a;
            wjVar.n.a(wjVar.f(f), 0.0f);
        }
    }

    public vj(wj<Object> wjVar) {
        this.b = wjVar;
        this.a = new a(wjVar);
    }

    @Override // defpackage.q63
    public final Object a(o63 o63Var, y53.b bVar) throws Throwable {
        Object objA = this.b.a(o37.u, new uj(this, o63Var, null), bVar);
        return objA == v72.t ? objA : g2b.a;
    }
}
