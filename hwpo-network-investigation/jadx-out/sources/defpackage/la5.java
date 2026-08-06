package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class la5 implements nv9 {
    public static final la5 b = new la5(true);
    public static final la5 c = new la5(false);
    public final boolean a;

    public la5(boolean z) {
        this.a = z;
    }

    public final String toString() {
        return fz.c(new StringBuilder("IncorrectFragmentation{expected="), !this.a, "}");
    }
}
