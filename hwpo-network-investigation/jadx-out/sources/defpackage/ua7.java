package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ua7 {
    public static final qa7 a;
    public static final sa7 b;

    static {
        ye8 ye8Var = ye8.c;
        qa7 qa7Var = null;
        try {
            qa7Var = (qa7) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = qa7Var;
        b = new sa7();
    }
}
