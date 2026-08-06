package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a30 implements c30.i {
    public static String b(String str, String str2, String str3, int i, int i2) {
        return str + i + str2 + i2 + str3;
    }

    @Override // c30.i
    public int a(int i, tq5 tq5Var) {
        return Math.round((1.0f + (tq5Var == tq5.t ? -1.0f : 1.0f)) * (i / 2.0f));
    }
}
