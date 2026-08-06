package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zv0 {
    public static final Object a(dw2 dw2Var, mh4 mh4Var, u02 u02Var) {
        Object obj;
        kb7 kb7Var;
        if (!dw2Var.q().G) {
            return g2b.a;
        }
        if (!dw2Var.q().G) {
            uc5.b("visitAncestors called on an unattached node");
        }
        ox6.c cVar = dw2Var.q().x;
        qr5 qr5VarF = ew2.f(dw2Var);
        loop0: while (true) {
            obj = null;
            if (qr5VarF == null) {
                break;
            }
            if ((qr5VarF.Y.f.w & 524288) != 0) {
                while (cVar != null) {
                    if ((cVar.v & 524288) != 0) {
                        ox6.c cVarB = cVar;
                        k37 k37Var = null;
                        while (cVarB != null) {
                            if (cVarB instanceof xv0) {
                                obj = cVarB;
                                break loop0;
                            }
                            if ((cVarB.v & 524288) != 0 && (cVarB instanceof gw2)) {
                                int i = 0;
                                for (ox6.c cVar2 = ((gw2) cVarB).I; cVar2 != null; cVar2 = cVar2.y) {
                                    if ((cVar2.v & 524288) != 0) {
                                        i++;
                                        if (i == 1) {
                                            cVarB = cVar2;
                                        } else {
                                            if (k37Var == null) {
                                                k37Var = new k37(new ox6.c[16]);
                                            }
                                            if (cVarB != null) {
                                                k37Var.d(cVarB);
                                                cVarB = null;
                                            }
                                            k37Var.d(cVar2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            cVarB = ew2.b(k37Var);
                        }
                    }
                    cVar = cVar.x;
                }
            }
            qr5VarF = qr5VarF.I();
            cVar = (qr5VarF == null || (kb7Var = qr5VarF.Y) == null) ? null : kb7Var.e;
        }
        xv0 xv0Var = (xv0) obj;
        if (xv0Var == null) {
            return g2b.a;
        }
        mb7 mb7VarE = ew2.e(dw2Var);
        Object objE0 = xv0Var.E0(mb7VarE, new yv0(mh4Var, mb7VarE), u02Var);
        return objE0 == v72.t ? objE0 : g2b.a;
    }
}
