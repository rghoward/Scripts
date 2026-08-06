package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dt {
    public static final a a = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements b97 {
    }

    public static final void a(zgb zgbVar, qr5 qr5Var) {
        long jA0 = qr5Var.Y.c.a0(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jA0 >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jA0 & 4294967295L)));
        zgbVar.layout(iRound, iRound2, zgbVar.getMeasuredWidth() + iRound, zgbVar.getMeasuredHeight() + iRound2);
    }
}
