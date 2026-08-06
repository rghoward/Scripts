package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pzb {
    public static final String[] a = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    public static final tzb b;

    static {
        tzb uzbVar;
        for (int i = 0; i < 2; i++) {
            uzbVar = null;
            try {
                uzbVar = (tzb) Class.forName(a[i]).asSubclass(tzb.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (uzbVar != null) {
                b = uzbVar;
            }
        }
        uzbVar = new uzb();
        b = uzbVar;
    }
}
