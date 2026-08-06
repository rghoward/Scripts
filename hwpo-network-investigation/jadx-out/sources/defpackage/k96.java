package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class k96 {
    public static final i96 a;
    public static final j96 b;

    static {
        ye8 ye8Var = ye8.c;
        i96 i96Var = null;
        try {
            i96Var = (i96) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = i96Var;
        b = new j96();
    }
}
