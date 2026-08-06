package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class th9 {
    public static final sh9.a a(sh9 sh9Var, int i) {
        sh9Var.getClass();
        sh9.a aVar = sh9Var.a;
        int i2 = (aVar == null && (i == 0 || i == 1)) ? i + 1 : i;
        if (i2 == 0) {
            return aVar;
        }
        if (i2 == 1) {
            return sh9Var.b;
        }
        if (i2 == 2) {
            return sh9Var.c;
        }
        z90.a(pp2.a(i, "Position must be in [0..2], got: "));
        return null;
    }
}
