package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ta7 {
    public static final pa7 a;
    public static final ra7 b;

    static {
        pa7 pa7Var = null;
        try {
            pa7Var = (pa7) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = pa7Var;
        b = new ra7();
    }
}
