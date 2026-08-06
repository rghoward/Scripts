package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class yq2 {
    public static final zv2 a;

    static {
        String property;
        ht4 ht4Var;
        int i = e8a.a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            et2 et2Var = i23.a;
            ht4 ht4Var2 = ag6.a;
            ht4Var2.getClass();
            ht4Var = !(ht4Var2 instanceof zv2) ? xq2.E : ht4Var2;
        } else {
            ht4Var = xq2.E;
        }
        a = ht4Var;
    }
}
