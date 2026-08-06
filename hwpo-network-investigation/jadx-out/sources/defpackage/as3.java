package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class as3 {
    public static final yr3 a = new yr3();
    public static final wr3<?> b;

    static {
        wr3<?> wr3Var = null;
        try {
            wr3Var = (wr3) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = wr3Var;
    }
}
