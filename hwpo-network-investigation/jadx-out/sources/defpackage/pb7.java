package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pb7 {
    public static final ox6.c a(dw2 dw2Var, int i) {
        ox6.c cVar = dw2Var.q().y;
        if (cVar == null || (cVar.w & i) == 0) {
            return null;
        }
        while (cVar != null) {
            int i2 = cVar.v;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return cVar;
            }
            cVar = cVar.y;
        }
        return null;
    }
}
