package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class tm5 {
    public static sm5 a(oh4 oh4Var) {
        sl5.a aVar = sl5.d;
        aVar.getClass();
        vl5 vl5Var = new vl5();
        xl5 xl5Var = aVar.a;
        boolean z = xl5Var.d;
        vl5Var.a = xl5Var.a;
        vl5Var.b = xl5Var.b;
        String str = xl5Var.e;
        String str2 = xl5Var.f;
        rd1 rd1Var = xl5Var.h;
        boolean z2 = xl5Var.g;
        vl5Var.c = xl5Var.c;
        ln4 ln4Var = aVar.b;
        boolean z3 = xl5Var.i;
        oh4Var.invoke(vl5Var);
        if (!xj5.a(str, "    ")) {
            z90.a("Indent should not be specified when default printing mode is used");
            return null;
        }
        xl5 xl5Var2 = new xl5(vl5Var.a, vl5Var.b, vl5Var.c, z, str, str2, z2, rd1Var, z3);
        ln4Var.getClass();
        sm5 sm5Var = new sm5(xl5Var2, ln4Var);
        if (ln4Var.equals(yd9.a)) {
            return sm5Var;
        }
        ln4Var.F0(new fn5());
        return sm5Var;
    }
}
