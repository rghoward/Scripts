package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mx1 implements y97 {
    public static Thread a;

    public static String b(String str, String str2) {
        return "https://console.firebase.google.com/project/" + str + "/performance/app/android:" + str2;
    }

    public static b65 c(long j, long j2, long j3, long j4, jt1 jt1Var, int i) {
        b65 b65Var;
        long j5 = (i & 1) != 0 ? uh1.k : j;
        long j6 = (i & 4) != 0 ? uh1.k : j3;
        fi1 fi1Var = (fi1) jt1Var.F(hi1.a);
        long j7 = ((uh1) jt1Var.F(zy1.a)).a;
        b65 b65Var2 = fi1Var.c0;
        if (b65Var2 == null) {
            long j8 = uh1.j;
            b65 b65Var3 = new b65(j8, j7, j8, uh1.b(lp1.t, j7));
            fi1Var.c0 = b65Var3;
            b65Var = b65Var3;
        } else {
            b65Var = b65Var2;
        }
        return b65Var.a(j5, j2, j6, j4);
    }

    @Override // defpackage.y97
    public boolean a() {
        return true;
    }

    @Override // defpackage.y97
    public void shutdown() {
    }
}
