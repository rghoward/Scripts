package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class eh3 extends wp5 implements oh4<wg3, Float> {
    public final /* synthetic */ th3 u;
    public final /* synthetic */ jo3 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh3(th3 th3Var, jo3 jo3Var) {
        super(1);
        this.u = th3Var;
        this.v = jo3Var;
    }

    @Override // defpackage.oh4
    public final Float invoke(wg3 wg3Var) {
        int iOrdinal = wg3Var.ordinal();
        float f = 1.0f;
        if (iOrdinal == 0) {
            t39 t39Var = this.u.a().d;
            if (t39Var != null) {
                f = t39Var.a;
            }
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                u.b();
                return null;
            }
            t39 t39Var2 = this.v.a().d;
            if (t39Var2 != null) {
                f = t39Var2.a;
            }
        }
        return Float.valueOf(f);
    }
}
