package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ew2 {
    public static final void a(k37 k37Var, ox6.c cVar) {
        k37<qr5> k37VarL = f(cVar).L();
        int i = k37VarL.v - 1;
        qr5[] qr5VarArr = k37VarL.t;
        if (i < qr5VarArr.length) {
            while (i >= 0) {
                k37Var.d(qr5VarArr[i].Y.f);
                i--;
            }
        }
    }

    public static final ox6.c b(k37 k37Var) {
        int i;
        if (k37Var == null || (i = k37Var.v) == 0) {
            return null;
        }
        return (ox6.c) k37Var.o(i - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final lr5 c(ox6.c cVar) {
        if ((cVar.v & 2) != 0) {
            if (cVar instanceof lr5) {
                return (lr5) cVar;
            }
            if (cVar instanceof gw2) {
                ox6.c cVar2 = ((gw2) cVar).I;
                while (cVar2 != 0) {
                    if (cVar2 instanceof lr5) {
                        return (lr5) cVar2;
                    }
                    cVar2 = (!(cVar2 instanceof gw2) || (cVar2.v & 2) == 0) ? cVar2.y : ((gw2) cVar2).I;
                }
            }
        }
        return null;
    }

    public static final mb7 d(dw2 dw2Var, int i) {
        mb7 mb7Var = dw2Var.q().A;
        mb7Var.getClass();
        if (mb7Var.g1() != dw2Var || !qb7.g(i)) {
            return mb7Var;
        }
        mb7 mb7Var2 = mb7Var.K;
        mb7Var2.getClass();
        return mb7Var2;
    }

    public static final mb7 e(dw2 dw2Var) {
        if (!dw2Var.q().G) {
            uc5.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        mb7 mb7VarD = d(dw2Var, 2);
        if (!mb7VarD.g1().G) {
            uc5.b("LayoutCoordinates is not attached.");
        }
        return mb7VarD;
    }

    public static final qr5 f(dw2 dw2Var) {
        mb7 mb7Var = dw2Var.q().A;
        if (mb7Var != null) {
            return mb7Var.H;
        }
        throw ik.a("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final mn7 g(dw2 dw2Var) {
        mn7 mn7Var = f(dw2Var).G;
        if (mn7Var != null) {
            return mn7Var;
        }
        throw ik.a("This node does not have an owner.");
    }
}
