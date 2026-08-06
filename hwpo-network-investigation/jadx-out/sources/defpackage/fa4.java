package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fa4 {
    public static final ba4 a(ba4 ba4Var) {
        ba4 ba4VarV = ew2.g(ba4Var).getFocusOwner().v();
        if (ba4VarV == null || !ba4VarV.G) {
            return null;
        }
        return ba4VarV;
    }

    public static final sk8 b(ba4 ba4Var) {
        mb7 mb7Var;
        if (ba4Var.G && (mb7Var = ba4Var.A) != null) {
            qq5 qq5VarD = rq5.d(mb7Var);
            if (!qq5VarD.e()) {
                qq5VarD = null;
            }
            if (qq5VarD != null) {
                return ba4Var.f2(qq5VarD);
            }
        }
        return sk8.e;
    }

    public static final ba4 c(ba4 ba4Var) {
        boolean z = ba4Var.t.G;
        if (z) {
            if (!z) {
                uc5.b("visitChildren called on an unattached node");
            }
            k37 k37Var = new k37(new ox6.c[16]);
            ox6.c cVar = ba4Var.t;
            ox6.c cVar2 = cVar.y;
            if (cVar2 == null) {
                ew2.a(k37Var, cVar);
            } else {
                k37Var.d(cVar2);
            }
            while (true) {
                int i = k37Var.v;
                if (i == 0) {
                    break;
                }
                ox6.c cVarB = (ox6.c) k37Var.o(i - 1);
                if ((cVarB.w & 1024) == 0) {
                    ew2.a(k37Var, cVarB);
                } else {
                    while (cVarB != null) {
                        if ((cVarB.v & 1024) != 0) {
                            k37 k37Var2 = null;
                            while (cVarB != null) {
                                if (cVarB instanceof ba4) {
                                    ba4 ba4Var2 = (ba4) cVarB;
                                    if (ba4Var2.t.G) {
                                        int iOrdinal = ba4Var2.a0().ordinal();
                                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                            return ba4Var2;
                                        }
                                        if (iOrdinal != 3) {
                                            u.b();
                                            return null;
                                        }
                                    }
                                } else if ((cVarB.v & 1024) != 0 && (cVarB instanceof gw2)) {
                                    int i2 = 0;
                                    for (ox6.c cVar3 = ((gw2) cVarB).I; cVar3 != null; cVar3 = cVar3.y) {
                                        if ((cVar3.v & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cVarB = cVar3;
                                            } else {
                                                if (k37Var2 == null) {
                                                    k37Var2 = new k37(new ox6.c[16]);
                                                }
                                                if (cVarB != null) {
                                                    k37Var2.d(cVarB);
                                                    cVarB = null;
                                                }
                                                k37Var2.d(cVar3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                cVarB = ew2.b(k37Var2);
                            }
                            break;
                        }
                        cVarB = cVarB.y;
                    }
                }
            }
        }
        return null;
    }

    public static final boolean d(ba4 ba4Var) {
        qr5 qr5Var;
        mb7 mb7Var;
        qr5 qr5Var2;
        mb7 mb7Var2 = ba4Var.A;
        return (mb7Var2 == null || (qr5Var = mb7Var2.H) == null || !qr5Var.j() || (mb7Var = ba4Var.A) == null || (qr5Var2 = mb7Var.H) == null || !qr5Var2.e()) ? false : true;
    }
}
