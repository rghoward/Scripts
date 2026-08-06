package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bi6 {
    public static final xh6 a;
    public static final zh6 b;

    static {
        ye8 ye8Var = ye8.c;
        xh6 xh6Var = null;
        try {
            xh6Var = (xh6) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = xh6Var;
        b = new zh6();
    }
}
