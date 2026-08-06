package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class py8 implements oy8 {
    public static final py8 a = new py8();

    @Override // defpackage.oy8
    public final ox6 a(ox6 ox6Var, float f, boolean z) {
        if (f <= 0.0d) {
            sc5.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return ox6Var.H(new qs5(z, f));
    }
}
