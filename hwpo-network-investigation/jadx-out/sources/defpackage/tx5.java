package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tx5 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ tx5(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                return Integer.valueOf(((nz5) obj).j().e());
            default:
                mj7.a aVar = mj7.Companion;
                mj7.b bVar = new mj7.b(1, ((mj7) obj).q(), rj7.class, "onBenchmarkClicked", "onBenchmarkClicked(Lcom/hwpo_training_app/client/onboarding_settings/slide2/presentation/entity/RequiredBenchmarkUiEntity;)V", 0);
                qr8 qr8Var = new qr8(new qr8.a());
                qr8Var.d.b(new e93(new xq8(), new yq8(3), new gz5(1, bVar), zq8.u));
                return qr8Var;
        }
    }
}
