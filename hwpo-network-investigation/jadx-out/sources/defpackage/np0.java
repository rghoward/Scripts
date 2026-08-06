package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class np0 {
    /* JADX WARN: Code duplicated, block: B:55:0x009e A[PHI: r0
      0x009e: PHI (r0v10 int) = (r0v5 int), (r0v6 int), (r0v7 int), (r0v8 int), (r0v9 int) binds: [B:54:0x009c, B:57:0x00a1, B:60:0x00a5, B:63:0x00a9, B:66:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    public static final <T> T a(ba4 ba4Var, int i, oh4<? super lp0.a, ? extends T> oh4Var) {
        int i2;
        ox6.c cVarB;
        lp0 lp0VarG2;
        kb7 kb7Var;
        if (!ba4Var.t.G) {
            uc5.b("visitAncestors called on an unattached node");
        }
        ox6.c cVar = ba4Var.t.x;
        qr5 qr5VarF = ew2.f(ba4Var);
        loop0: while (true) {
            i2 = 1;
            if (qr5VarF == null) {
                cVarB = null;
                break;
            }
            if ((qr5VarF.Y.f.w & 1024) != 0) {
                while (cVar != null) {
                    if ((cVar.v & 1024) != 0) {
                        cVarB = cVar;
                        k37 k37Var = null;
                        while (cVarB != null) {
                            if (cVarB instanceof ba4) {
                                break loop0;
                            }
                            if ((cVarB.v & 1024) != 0 && (cVarB instanceof gw2)) {
                                int i3 = 0;
                                for (ox6.c cVar2 = ((gw2) cVarB).I; cVar2 != null; cVar2 = cVar2.y) {
                                    if ((cVar2.v & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
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
                                if (i3 == 1) {
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
        ba4 ba4Var2 = (ba4) cVarB;
        if ((ba4Var2 == null || !xj5.a(ba4Var2.g2(), ba4Var.g2())) && (lp0VarG2 = ba4Var.g2()) != null) {
            int i4 = 5;
            if (i == 5) {
                i2 = i4;
            } else {
                i4 = 6;
                if (i == 6) {
                    i2 = i4;
                } else {
                    i4 = 3;
                    if (i == 3) {
                        i2 = i4;
                    } else {
                        i4 = 4;
                        if (i == 4) {
                            i2 = i4;
                        } else {
                            i4 = 2;
                            if (i == 1) {
                                i2 = i4;
                            } else if (i != 2) {
                                aa0.c("Unsupported direction for beyond bounds layout");
                            }
                        }
                    }
                }
            }
            return (T) lp0VarG2.K0(oh4Var, i2);
        }
        return null;
    }
}
