package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j2b<Model> implements kx6<Model, Model> {
    public static final j2b<?> a = new j2b<>();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a<Model> implements lx6<Model, Model> {
        public static final a<?> a = new a<>();

        @Override // defpackage.lx6
        public final kx6<Model, Model> d(i07 i07Var) {
            return j2b.a;
        }
    }

    @Override // defpackage.kx6
    public final kx6.a<Model> a(Model model, int i, int i2, xk7 xk7Var) {
        return new kx6.a<>(new ke7(model), new b(model));
    }

    @Override // defpackage.kx6
    public final boolean b(Model model) {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b<Model> implements xe2<Model> {
        public final Model t;

        public b(Model model) {
            this.t = model;
        }

        @Override // defpackage.xe2
        public final Class<Model> a() {
            return (Class<Model>) this.t.getClass();
        }

        @Override // defpackage.xe2
        public final void c(p98 p98Var, xe2.a<? super Model> aVar) {
            aVar.e(this.t);
        }

        @Override // defpackage.xe2
        public final kf2 getDataSource() {
            return kf2.t;
        }

        @Override // defpackage.xe2
        public final void b() {
        }

        @Override // defpackage.xe2
        public final void cancel() {
        }
    }
}
