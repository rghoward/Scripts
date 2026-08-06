package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xi1 extends wp5 implements oh4<ew, uh1> {
    public final /* synthetic */ ii1 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi1(ii1 ii1Var) {
        super(1);
        this.u = ii1Var;
    }

    @Override // defpackage.oh4
    public final uh1 invoke(ew ewVar) {
        ew ewVar2 = ewVar;
        float f = ewVar2.b;
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        float f2 = ewVar2.c;
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        float f3 = ewVar2.d;
        float f4 = f3 >= -0.5f ? f3 : -0.5f;
        float f5 = f4 <= 0.5f ? f4 : 0.5f;
        float f6 = ewVar2.a;
        float f7 = f6 >= 0.0f ? f6 : 0.0f;
        return new uh1(uh1.a(u7d.a(f, f2, f5, f7 <= 1.0f ? f7 : 1.0f, si1.x), this.u));
    }
}
