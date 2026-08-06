package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class x2c {
    public static final w2c a(Object obj, Object obj2) {
        w2c w2cVarA = (w2c) obj;
        w2c w2cVar = (w2c) obj2;
        if (!w2cVar.isEmpty()) {
            if (!w2cVarA.t) {
                w2cVarA = w2cVarA.a();
            }
            w2cVarA.c();
            if (!w2cVar.isEmpty()) {
                w2cVarA.putAll(w2cVar);
            }
        }
        return w2cVarA;
    }
}
