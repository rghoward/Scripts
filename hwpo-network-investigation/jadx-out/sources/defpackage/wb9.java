package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wb9 {
    /* JADX WARN: Code duplicated, block: B:35:0x0061 A[LOOP:0: B:4:0x000b->B:35:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0064 A[EDGE_INSN: B:43:0x0064->B:36:0x0064 BREAK  A[LOOP:0: B:4:0x000b->B:35:0x0061], SYNTHETIC] */
    public static final ub9 a(qr5 qr5Var, boolean z) {
        ox6.c cVar = qr5Var.Y.f;
        Object obj = null;
        if ((cVar.w & 8) != 0) {
            loop0: while (cVar != null) {
                if ((cVar.v & 8) == 0) {
                    if ((cVar.w & 8) != 0) {
                        break;
                        break;
                    }
                    cVar = cVar.y;
                } else {
                    ox6.c cVarB = cVar;
                    k37 k37Var = null;
                    while (cVarB != null) {
                        if (cVarB instanceof qb9) {
                            obj = cVarB;
                            break loop0;
                        }
                        if ((cVarB.v & 8) != 0 && (cVarB instanceof gw2)) {
                            int i = 0;
                            for (ox6.c cVar2 = ((gw2) cVarB).I; cVar2 != null; cVar2 = cVar2.y) {
                                if ((cVar2.v & 8) != 0) {
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
                    if ((cVar.w & 8) != 0) {
                        break;
                    }
                    cVar = cVar.y;
                }
            }
        }
        obj.getClass();
        ox6.c cVarQ = ((qb9) obj).q();
        lb9 lb9VarR = qr5Var.r();
        if (lb9VarR == null) {
            lb9VarR = new lb9();
        }
        return new ub9(cVarQ, z, qr5Var, lb9VarR);
    }
}
