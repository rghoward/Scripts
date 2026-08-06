package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j67 {
    public static void a(i67 i67Var, String str, List list, oh4 oh4Var, oh4 oh4Var2, oh4 oh4Var3, oh4 oh4Var4, fr1 fr1Var, int i) {
        if ((i & 2) != 0) {
            list = hf3.t;
        }
        if ((i & 8) != 0) {
            oh4Var = null;
        }
        if ((i & 16) != 0) {
            oh4Var2 = null;
        }
        if ((i & 32) != 0) {
            oh4Var3 = oh4Var;
        }
        if ((i & 64) != 0) {
            oh4Var4 = oh4Var2;
        }
        r87 r87Var = i67Var.g;
        r87Var.getClass();
        ks1 ks1Var = new ks1((js1) r87Var.b(r87.a.a(js1.class)), str, fr1Var);
        for (h47 h47Var : list) {
            ks1Var.d.put(h47Var.a, h47Var.b);
        }
        ks1Var.i = oh4Var;
        ks1Var.j = oh4Var2;
        ks1Var.k = oh4Var3;
        ks1Var.l = oh4Var4;
        i67Var.i.add(ks1Var.a());
    }
}
