package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class q8d {
    public static final q8d d = new q8d(true, null, null);
    public final boolean a;
    public final String b;
    public final Throwable c;

    public q8d(boolean z, String str, Exception exc) {
        this.a = z;
        this.b = str;
        this.c = exc;
    }

    public static q8d b(String str) {
        return new q8d(false, str, null);
    }

    public static q8d c(String str, Exception exc) {
        return new q8d(false, str, exc);
    }

    public String a() {
        return this.b;
    }
}
