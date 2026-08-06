package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class x20 extends ln4 {
    public static volatile x20 y;
    public final bu2 x;

    public x20() {
        super(25);
        this.x = new bu2();
    }

    public static x20 h1() {
        if (y != null) {
            return y;
        }
        synchronized (x20.class) {
            try {
                if (y == null) {
                    y = new x20();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return y;
    }
}
