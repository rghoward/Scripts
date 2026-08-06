package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qx8 {
    public static qx8 a;

    static {
        new rx8(0, 0, 0, false, false);
    }

    public static synchronized qx8 a() {
        try {
            if (a == null) {
                a = new qx8();
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }
}
