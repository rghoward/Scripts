package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wq7 {
    public static final float a(dr7 dr7Var) {
        return dr7Var.n().c() == fl7.u ? Float.intBitsToFloat((int) (dr7Var.r() >> 32)) : Float.intBitsToFloat((int) (dr7Var.r() & 4294967295L));
    }

    public static final boolean b(dr7 dr7Var, float f) {
        boolean zE = dr7Var.n().e();
        boolean z = (dr7Var.s() ? -f : a(dr7Var)) > 0.0f;
        return (z && zE) || !(z || zE);
    }
}
