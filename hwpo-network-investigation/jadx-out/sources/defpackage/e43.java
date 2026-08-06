package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e43 {
    public final String a;

    public e43(String str) {
        this.a = str;
    }

    public static e43 a(pt7 pt7Var) {
        String str;
        pt7Var.N(2);
        int iZ = pt7Var.z();
        int i = iZ >> 1;
        int iZ2 = ((pt7Var.z() >> 3) & 31) | ((iZ & 1) << 5);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sbA = bl2.a(str);
        sbA.append(i < 10 ? ".0" : ".");
        sbA.append(i);
        return new e43(d43.a(iZ2, iZ2 < 10 ? ".0" : ".", sbA));
    }
}
