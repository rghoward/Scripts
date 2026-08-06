package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ic6 {
    public final HashMap<String, yc1<hy8>> a = new HashMap<>();

    public final yc1<hy8> a(String str) {
        HashMap<String, yc1<hy8>> map = this.a;
        yc1<hy8> yc1Var = map.get(str);
        if (yc1Var == null) {
            yc1<hy8> yc1Var2 = new yc1<>(new hy8());
            map.put(str, yc1Var2);
            yc1Var = yc1Var2;
        }
        return yc1Var;
    }
}
