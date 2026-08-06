package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yx {
    public static final txa a(gw2 gw2Var, Object obj) {
        kb7 kb7Var;
        if (!gw2Var.t.G) {
            uc5.b("visitAncestors called on an unattached node");
        }
        ox6.c cVar = gw2Var.t.x;
        qr5 qr5VarF = ew2.f(gw2Var);
        while (qr5VarF != null) {
            if ((qr5VarF.Y.f.w & 262144) != 0) {
                while (cVar != null) {
                    if ((cVar.v & 262144) != 0) {
                        ox6.c cVarB = cVar;
                        k37 k37Var = null;
                        while (cVarB != null) {
                            if (cVarB instanceof txa) {
                                txa txaVar = (txa) cVarB;
                                if (obj.equals(txaVar.G())) {
                                    return txaVar;
                                }
                            }
                            if ((cVarB.v & 262144) != 0 && (cVarB instanceof gw2)) {
                                int i = 0;
                                for (ox6.c cVar2 = ((gw2) cVarB).I; cVar2 != null; cVar2 = cVar2.y) {
                                    if ((cVar2.v & 262144) != 0) {
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
        return null;
    }

    public static final boolean b(tc8 tc8Var) {
        tc8Var.getClass();
        return tc8Var.t != -1;
    }

    public static final ArrayList c(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((l89) obj).v == u60.w) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final ArrayList d(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((l89) obj).v != u60.w) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [k37] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [k37] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    public static final void e(dw2 dw2Var, Object obj, oh4 oh4Var) {
        kb7 kb7Var;
        if (!dw2Var.q().G) {
            uc5.b("visitAncestors called on an unattached node");
        }
        ox6.c cVar = dw2Var.q().x;
        qr5 qr5VarF = ew2.f(dw2Var);
        while (qr5VarF != null) {
            if ((qr5VarF.Y.f.w & 262144) != 0) {
                while (cVar != null) {
                    if ((cVar.v & 262144) != 0) {
                        ?? B = cVar;
                        ?? k37Var = 0;
                        while (B != 0) {
                            if (B instanceof txa) {
                                txa txaVar = (txa) B;
                                if (!(xj5.a(obj, txaVar.G()) ? ((Boolean) oh4Var.invoke(txaVar)).booleanValue() : true)) {
                                    return;
                                }
                            } else if ((B.v & 262144) != 0 && (B instanceof gw2)) {
                                ox6.c cVar2 = ((gw2) B).I;
                                int i = 0;
                                while (cVar2 != null) {
                                    if ((cVar2.v & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            B = B;
                                            k37Var = k37Var;
                                            k37Var = k37Var;
                                            B = cVar2;
                                        } else {
                                            if (k37Var == 0) {
                                                k37Var = new k37(new ox6.c[16]);
                                            }
                                            if (B != 0) {
                                                k37Var.d(B);
                                                B = 0;
                                            }
                                            k37Var.d(cVar2);
                                        }
                                    } else {
                                        B = B;
                                        k37Var = k37Var;
                                    }
                                    cVar2 = cVar2.y;
                                    B = B;
                                    k37Var = k37Var;
                                }
                                if (i == 1) {
                                    B = B;
                                    k37Var = k37Var;
                                } else {
                                    B = B;
                                    k37Var = k37Var;
                                }
                            }
                            B = ew2.b(k37Var);
                        }
                    }
                    cVar = cVar.x;
                }
            }
            qr5VarF = qr5VarF.I();
            cVar = (qr5VarF == null || (kb7Var = qr5VarF.Y) == null) ? null : kb7Var.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [dw2, java.lang.Object, txa] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [k37] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [k37] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final void f(txa txaVar, oh4 oh4Var) {
        kb7 kb7Var;
        ox6.c cVar = (ox6.c) txaVar;
        if (!cVar.t.G) {
            uc5.b("visitAncestors called on an unattached node");
        }
        ox6.c cVar2 = cVar.t.x;
        qr5 qr5VarF = ew2.f(txaVar);
        while (qr5VarF != null) {
            if ((qr5VarF.Y.f.w & 262144) != 0) {
                while (cVar2 != null) {
                    if ((cVar2.v & 262144) != 0) {
                        ?? B = cVar2;
                        ?? k37Var = 0;
                        while (B != 0) {
                            boolean zBooleanValue = true;
                            if (B instanceof txa) {
                                txa txaVar2 = (txa) B;
                                if (xj5.a(txaVar.G(), txaVar2.G()) && txaVar.getClass() == txaVar2.getClass()) {
                                    zBooleanValue = ((Boolean) oh4Var.invoke(txaVar2)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else if ((B.v & 262144) != 0 && (B instanceof gw2)) {
                                ox6.c cVar3 = ((gw2) B).I;
                                int i = 0;
                                while (cVar3 != null) {
                                    if ((cVar3.v & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            B = B;
                                            k37Var = k37Var;
                                            k37Var = k37Var;
                                            B = cVar3;
                                        } else {
                                            if (k37Var == 0) {
                                                k37Var = new k37(new ox6.c[16]);
                                            }
                                            if (B != 0) {
                                                k37Var.d(B);
                                                B = 0;
                                            }
                                            k37Var.d(cVar3);
                                        }
                                    } else {
                                        B = B;
                                        k37Var = k37Var;
                                    }
                                    cVar3 = cVar3.y;
                                    B = B;
                                    k37Var = k37Var;
                                }
                                if (i == 1) {
                                    B = B;
                                    k37Var = k37Var;
                                } else {
                                    B = B;
                                    k37Var = k37Var;
                                }
                            }
                            B = ew2.b(k37Var);
                        }
                    }
                    cVar2 = cVar2.x;
                }
            }
            qr5VarF = qr5VarF.I();
            cVar2 = (qr5VarF == null || (kb7Var = qr5VarF.Y) == null) ? null : kb7Var.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [k37] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [k37] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public static final void g(ox6.c cVar, String str, oh4 oh4Var) {
        if (!cVar.t.G) {
            uc5.b("visitSubtreeIf called on an unattached node");
        }
        k37 k37Var = new k37(new ox6.c[16]);
        ox6.c cVar2 = cVar.t;
        ox6.c cVar3 = cVar2.y;
        if (cVar3 == null) {
            ew2.a(k37Var, cVar2);
        } else {
            k37Var.d(cVar3);
        }
        while (true) {
            int i = k37Var.v;
            if (i == 0) {
                return;
            }
            ox6.c cVar4 = (ox6.c) k37Var.o(i - 1);
            if ((cVar4.w & 262144) != 0) {
                ox6.c cVar5 = cVar4;
                while (true) {
                    if (cVar5 != null && cVar5.G) {
                        if ((cVar5.v & 262144) != 0) {
                            ?? B = cVar5;
                            ?? k37Var2 = 0;
                            while (B != 0) {
                                if (B instanceof txa) {
                                    txa txaVar = (txa) B;
                                    sxa sxaVar = str.equals(txaVar.G()) ? (sxa) oh4Var.invoke(txaVar) : sxa.t;
                                    if (sxaVar != sxa.v) {
                                        if (sxaVar == sxa.u) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((B.v & 262144) != 0 && (B instanceof gw2)) {
                                    ox6.c cVar6 = ((gw2) B).I;
                                    int i2 = 0;
                                    B = B;
                                    k37Var2 = k37Var2;
                                    while (cVar6 != null) {
                                        if ((cVar6.v & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                k37Var2 = k37Var2;
                                                B = cVar6;
                                            } else {
                                                if (k37Var2 == 0) {
                                                    k37Var2 = new k37(new ox6.c[16]);
                                                }
                                                if (B != 0) {
                                                    k37Var2.d(B);
                                                    B = 0;
                                                }
                                                k37Var2.d(cVar6);
                                            }
                                        }
                                        cVar6 = cVar6.y;
                                        B = B;
                                        k37Var2 = k37Var2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                B = ew2.b(k37Var2);
                            }
                        }
                        cVar5 = cVar5.y;
                    }
                }
            }
            ew2.a(k37Var, cVar4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [k37] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [k37] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void h(txa txaVar, oh4 oh4Var) {
        if (!txaVar.q().G) {
            uc5.b("visitSubtreeIf called on an unattached node");
        }
        k37 k37Var = new k37(new ox6.c[16]);
        ox6.c cVar = txaVar.q().y;
        if (cVar == null) {
            ew2.a(k37Var, txaVar.q());
        } else {
            k37Var.d(cVar);
        }
        while (true) {
            int i = k37Var.v;
            if (i == 0) {
                return;
            }
            ox6.c cVar2 = (ox6.c) k37Var.o(i - 1);
            if ((cVar2.w & 262144) != 0) {
                ox6.c cVar3 = cVar2;
                while (true) {
                    if (cVar3 != null && cVar3.G) {
                        if ((cVar3.v & 262144) != 0) {
                            ?? B = cVar3;
                            ?? k37Var2 = 0;
                            while (B != 0) {
                                if (B instanceof txa) {
                                    txa txaVar2 = (txa) B;
                                    sxa sxaVar = (xj5.a(txaVar.G(), txaVar2.G()) && txaVar.getClass() == txaVar2.getClass()) ? (sxa) oh4Var.invoke(txaVar2) : sxa.t;
                                    if (sxaVar != sxa.v) {
                                        if (sxaVar == sxa.u) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((B.v & 262144) != 0 && (B instanceof gw2)) {
                                    ox6.c cVar4 = ((gw2) B).I;
                                    int i2 = 0;
                                    B = B;
                                    k37Var2 = k37Var2;
                                    while (cVar4 != null) {
                                        if ((cVar4.v & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                k37Var2 = k37Var2;
                                                B = cVar4;
                                            } else {
                                                if (k37Var2 == 0) {
                                                    k37Var2 = new k37(new ox6.c[16]);
                                                }
                                                if (B != 0) {
                                                    k37Var2.d(B);
                                                    B = 0;
                                                }
                                                k37Var2.d(cVar4);
                                            }
                                        }
                                        cVar4 = cVar4.y;
                                        B = B;
                                        k37Var2 = k37Var2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                B = ew2.b(k37Var2);
                            }
                        }
                        cVar3 = cVar3.y;
                    }
                }
            }
            ew2.a(k37Var, cVar2);
        }
    }
}
