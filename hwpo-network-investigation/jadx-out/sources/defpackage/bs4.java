package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bs4 {
    public static final /* synthetic */ int a = 0;

    public static final void a(ub9 ub9Var, int i, d69 d69Var) {
        k37 k37Var = new k37(new ub9[16]);
        List listI = ub9Var.i(false, false);
        while (true) {
            k37Var.f(k37Var.v, listI);
            while (true) {
                int i2 = k37Var.v;
                if (i2 == 0) {
                    return;
                }
                ub9 ub9Var2 = (ub9) k37Var.o(i2 - 1);
                boolean zG = zb9.g(ub9Var2);
                lb9 lb9Var = ub9Var2.d;
                c37<gc9<?>, Object> c37Var = lb9Var.t;
                if (!zG && !c37Var.b(ac9.j)) {
                    mb7 mb7VarD = ub9Var2.d();
                    if (mb7VarD == null) {
                        throw ik.a("Expected semantics node to have a coordinator.");
                    }
                    gg5 gg5VarD = qk1.d(rq5.b(mb7VarD, true));
                    if (gg5VarD.a < gg5VarD.c && gg5VarD.b < gg5VarD.d) {
                        Object objD = lb9Var.t.d(kb9.e);
                        if (objD == null) {
                            objD = null;
                        }
                        ci4 ci4Var = (ci4) objD;
                        Object objD2 = c37Var.d(ac9.w);
                        c69 c69Var = (c69) (objD2 != null ? objD2 : null);
                        if (ci4Var == null || c69Var == null || c69Var.b.invoke().floatValue() <= 0.0f) {
                            listI = ub9Var2.i(false, false);
                        } else {
                            int i3 = 1 + i;
                            d69Var.invoke(new h69(ub9Var2, i3, gg5VarD, mb7VarD));
                            a(ub9Var2, i3, d69Var);
                        }
                    }
                }
            }
        }
    }
}
