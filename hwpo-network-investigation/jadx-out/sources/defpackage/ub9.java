package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ub9 {
    public final ox6.c a;
    public final boolean b;
    public final qr5 c;
    public final lb9 d;
    public ub9 e;
    public final int f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends ox6.c implements qb9 {
        public final /* synthetic */ oh4<hc9, g2b> H;

        /* JADX WARN: Multi-variable type inference failed */
        public a(oh4<? super hc9, g2b> oh4Var) {
            this.H = oh4Var;
        }

        @Override // defpackage.qb9
        public final void E1(hc9 hc9Var) {
            this.H.invoke(hc9Var);
        }
    }

    public ub9(ox6.c cVar, boolean z, qr5 qr5Var, lb9 lb9Var) {
        this.a = cVar;
        this.b = z;
        this.c = qr5Var;
        this.d = lb9Var;
        this.f = qr5Var.u;
    }

    public static /* synthetic */ List j(int i, ub9 ub9Var) {
        return ub9Var.i((i & 1) != 0 ? !ub9Var.b : false, (i & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
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
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final sk8 a(mb7 mb7Var) {
        ?? B;
        ub9 ub9VarL = l();
        if (ub9VarL == null) {
            return sk8.e;
        }
        ox6.c cVar = ub9VarL.c.Y.f;
        if ((cVar.w & 8) == 0) {
            B = 0;
            break;
        }
        loop0: while (true) {
            if (cVar != null) {
                if ((cVar.v & 8) != 0) {
                    B = cVar;
                    ?? k37Var = 0;
                    while (B != 0) {
                        if (B instanceof qb9) {
                            if (((qb9) B).A()) {
                                break loop0;
                            }
                        } else if ((B.v & 8) != 0 && (B instanceof gw2)) {
                            ox6.c cVar2 = ((gw2) B).I;
                            int i = 0;
                            while (cVar2 != null) {
                                if ((cVar2.v & 8) != 0) {
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
                if ((cVar.w & 8) != 0) {
                    cVar = cVar.y;
                }
            }
            B = 0;
            break;
        }
        qb9 qb9Var = (qb9) B;
        mb7 mb7VarD = qb9Var != null ? ew2.d(qb9Var, 8) : null;
        return mb7VarD == null ? ub9VarL.a(mb7Var) : mb7VarD.Z(mb7Var, true);
    }

    public final ub9 b(ex8 ex8Var, oh4<? super hc9, g2b> oh4Var) {
        lb9 lb9Var = new lb9();
        lb9Var.v = false;
        lb9Var.w = false;
        oh4Var.invoke(lb9Var);
        ub9 ub9Var = new ub9(new a(oh4Var), false, new qr5(this.f + (ex8Var != null ? 1000000000 : 2000000000), true), lb9Var);
        ub9Var.e = this;
        return ub9Var;
    }

    public final void c(qr5 qr5Var, ArrayList arrayList) {
        k37<qr5> k37VarK = qr5Var.K();
        qr5[] qr5VarArr = k37VarK.t;
        int i = k37VarK.v;
        for (int i2 = 0; i2 < i; i2++) {
            qr5 qr5Var2 = qr5VarArr[i2];
            if (qr5Var2.e() && !qr5Var2.j0) {
                if (qr5Var2.Y.d(8)) {
                    arrayList.add(wb9.a(qr5Var2, this.b));
                } else {
                    c(qr5Var2, arrayList);
                }
            }
        }
    }

    public final mb7 d() {
        if (!o()) {
            qb9 qb9VarF = f();
            return qb9VarF != null ? ew2.d(qb9VarF, 8) : this.c.Y.c;
        }
        ub9 ub9VarL = l();
        if (ub9VarL != null) {
            return ub9VarL.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        s(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            ub9 ub9Var = (ub9) arrayList.get(size2);
            if (ub9Var.p()) {
                arrayList2.add(ub9Var);
            } else if (!ub9Var.d.w) {
                ub9Var.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3, types: [k37] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [k37] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final qb9 f() {
        ?? B;
        boolean z;
        ?? r0;
        boolean z2 = this.d.v;
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        qr5 qr5Var = this.c;
        if (!z2) {
            ox6.c cVar = qr5Var.Y.f;
            if ((cVar.w & 8) != 0) {
                loop3: while (cVar != null) {
                    if ((cVar.v & 8) != 0) {
                        B = cVar;
                        ?? k37Var = 0;
                        while (true) {
                            if (B != 0) {
                                if (B instanceof qb9) {
                                    if (((qb9) B).A()) {
                                        r4 = B;
                                    }
                                } else if ((B.v & 8) != 0 && (B instanceof gw2)) {
                                    ox6.c cVar2 = ((gw2) B).I;
                                    int i = 0;
                                    while (cVar2 != null) {
                                        if ((cVar2.v & 8) != 0) {
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
                    }
                    if ((cVar.w & 8) == 0) {
                        break;
                    }
                    cVar = cVar.y;
                }
            }
        } else {
            ox6.c cVar3 = qr5Var.Y.f;
            if ((cVar3.w & 8) != 0) {
                B = 0;
                while (cVar3 != null) {
                    if ((cVar3.v & 8) != 0) {
                        ox6.c cVarB = cVar3;
                        k37 k37Var2 = null;
                        while (cVarB != null) {
                            if (cVarB instanceof qb9) {
                                qb9 qb9Var = (qb9) cVarB;
                                if (qb9Var.A()) {
                                    if (qb9Var.G1()) {
                                        r0 = B;
                                        r0 = B;
                                        return qb9Var;
                                    }
                                    if (B == 0) {
                                        r0 = qb9Var;
                                    }
                                }
                                r0 = B;
                                z = false;
                                B = r0;
                            } else {
                                z = true;
                            }
                            if (z) {
                                B = B;
                                if ((cVarB.v & 8) != 0 && (cVarB instanceof gw2)) {
                                    int i2 = 0;
                                    for (ox6.c cVar4 = ((gw2) cVarB).I; cVar4 != null; cVar4 = cVar4.y) {
                                        if ((cVar4.v & 8) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cVarB = cVar4;
                                            } else {
                                                if (k37Var2 == null) {
                                                    k37Var2 = new k37(new ox6.c[16]);
                                                }
                                                if (cVarB != null) {
                                                    k37Var2.d(cVarB);
                                                    cVarB = null;
                                                }
                                                k37Var2.d(cVar4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                            } else {
                                B = B;
                            }
                            cVarB = ew2.b(k37Var2);
                        }
                    }
                    if ((cVar3.w & 8) == 0) {
                        break;
                    }
                    cVar3 = cVar3.y;
                    B = B;
                }
                r4 = B;
            }
        }
        return (qb9) r4;
    }

    public final sk8 g() {
        mb7 mb7VarD = d();
        if (mb7VarD != null) {
            if (!mb7VarD.g1().G) {
                mb7VarD = null;
            }
            if (mb7VarD != null) {
                return rq5.d(mb7VarD).Z(mb7VarD, true);
            }
        }
        return sk8.e;
    }

    public final sk8 h() {
        mb7 mb7VarD = d();
        if (mb7VarD != null) {
            if (!mb7VarD.g1().G) {
                mb7VarD = null;
            }
            if (mb7VarD != null) {
                return rq5.b(mb7VarD, true);
            }
        }
        return sk8.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.w) {
            return hf3.t;
        }
        ArrayList arrayList = new ArrayList();
        if (!p()) {
            return s(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final lb9 k() {
        boolean zP = p();
        lb9 lb9Var = this.d;
        if (!zP) {
            return lb9Var;
        }
        lb9 lb9VarE = lb9Var.e();
        r(new ArrayList(), lb9VarE);
        return lb9VarE;
    }

    public final ub9 l() {
        qr5 qr5VarI;
        ub9 ub9Var = this.e;
        if (ub9Var != null) {
            return ub9Var;
        }
        qr5 qr5Var = this.c;
        boolean z = this.b;
        if (!z) {
            qr5VarI = null;
            break;
        }
        qr5VarI = qr5Var.I();
        while (true) {
            if (qr5VarI == null) {
                qr5VarI = null;
                break;
            }
            lb9 lb9VarR = qr5VarI.r();
            if (lb9VarR != null && lb9VarR.v) {
                break;
            }
            qr5VarI = qr5VarI.I();
        }
        if (qr5VarI == null) {
            for (qr5 qr5VarI2 = qr5Var.I(); qr5VarI2 != null; qr5VarI2 = qr5VarI2.I()) {
                if (qr5VarI2.Y.d(8)) {
                    qr5VarI = qr5VarI2;
                }
            }
            qr5VarI = null;
        }
        if (qr5VarI == null) {
            return null;
        }
        return wb9.a(qr5VarI, z);
    }

    public final sk8 m() {
        qb9 qb9VarF = f();
        if (qb9VarF == null) {
            return this.c.Y.c.Z1();
        }
        ox6.c cVarQ = qb9VarF.q();
        Object objD = this.d.t.d(kb9.b);
        if (objD == null) {
            objD = null;
        }
        return rb9.a(cVarQ, objD != null, true);
    }

    public final lb9 n() {
        return this.d;
    }

    public final boolean o() {
        return this.e != null;
    }

    public final boolean p() {
        return this.b && this.d.v;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    public final boolean q() {
        if (o() || !j(4, this).isEmpty()) {
            return false;
        }
        qr5 qr5VarI = this.c.I();
        while (qr5VarI != null) {
            lb9 lb9VarR = qr5VarI.r();
            if (lb9VarR != null && lb9VarR.v) {
                if (qr5VarI == null) {
                    return true;
                }
                return false;
            }
            qr5VarI = qr5VarI.I();
        }
        qr5VarI = null;
        if (qr5VarI == null) {
            return true;
        }
        return false;
    }

    public final void r(ArrayList arrayList, lb9 lb9Var) {
        if (this.d.w) {
            return;
        }
        s(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            ub9 ub9Var = (ub9) arrayList.get(size2);
            if (!ub9Var.p()) {
                lb9Var.i(ub9Var.d);
                ub9Var.r(arrayList, lb9Var);
            }
        }
    }

    public final List s(ArrayList arrayList, boolean z) {
        if (o()) {
            return hf3.t;
        }
        c(this.c, arrayList);
        if (z) {
            lb9 lb9Var = this.d;
            c37<gc9<?>, Object> c37Var = lb9Var.t;
            Object objD = c37Var.d(ac9.z);
            if (objD == null) {
                objD = null;
            }
            ex8 ex8Var = (ex8) objD;
            if (ex8Var != null && lb9Var.v && !arrayList.isEmpty()) {
                arrayList.add(b(ex8Var, new sb9(ex8Var)));
            }
            gc9<List<String>> gc9Var = ac9.a;
            if (c37Var.b(gc9Var) && !arrayList.isEmpty() && lb9Var.v) {
                Object objD2 = c37Var.d(gc9Var);
                if (objD2 == null) {
                    objD2 = null;
                }
                List list = (List) objD2;
                String str = list != null ? (String) th1.A(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new tb9(str)));
                }
            }
        }
        return arrayList;
    }
}
