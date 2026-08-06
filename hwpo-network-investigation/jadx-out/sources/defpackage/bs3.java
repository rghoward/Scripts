package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bs3 {
    public static final zr3 a = new zr3();
    public static final xr3<?> b;

    static {
        ye8 ye8Var = ye8.c;
        xr3<?> xr3Var = null;
        try {
            xr3Var = (xr3) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = xr3Var;
    }
}
