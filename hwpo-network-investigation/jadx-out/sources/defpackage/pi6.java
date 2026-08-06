package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class pi6 extends qk1 {
    public static kh6 f(kh6 kh6Var) {
        kh6Var.b();
        kh6Var.F = true;
        if (kh6Var.B > 0) {
            return kh6Var;
        }
        kh6 kh6Var2 = kh6.G;
        kh6Var2.getClass();
        return kh6Var2;
    }

    public static int g(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
