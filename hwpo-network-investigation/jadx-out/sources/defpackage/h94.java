package defpackage;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h94 implements g94 {
    public final cm a;
    public final cm b;
    public final b94 d;
    public o27 f;
    public ba4 h;
    public final ba4 c = new ba4(2, null, 14);
    public final i94 e = new i94(this);
    public final t27<c94> g = new t27<>(1);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements oh4<ba4, Boolean> {
        public final /* synthetic */ ba4 u;
        public final /* synthetic */ h94 v;
        public final /* synthetic */ oh4<ba4, Boolean> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ba4 ba4Var, h94 h94Var, oh4<? super ba4, Boolean> oh4Var) {
            super(1);
            this.u = ba4Var;
            this.v = h94Var;
            this.w = oh4Var;
        }

        @Override // defpackage.oh4
        public final Boolean invoke(ba4 ba4Var) {
            boolean zBooleanValue;
            ba4 ba4Var2 = ba4Var;
            if (xj5.a(ba4Var2, this.u)) {
                zBooleanValue = false;
            } else {
                if (xj5.a(ba4Var2, this.v.c)) {
                    aa0.c("Focus search landed at the root.");
                    return null;
                }
                zBooleanValue = this.w.invoke(ba4Var2).booleanValue();
            }
            return Boolean.valueOf(zBooleanValue);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends wp5 implements oh4<ba4, Boolean> {
        public final /* synthetic */ gl8<Boolean> u;
        public final /* synthetic */ int v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, gl8 gl8Var) {
            super(1);
            this.u = gl8Var;
            this.v = i;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.Boolean] */
        @Override // defpackage.oh4
        public final Boolean invoke(ba4 ba4Var) {
            ?? ValueOf = Boolean.valueOf(ba4Var.y(this.v));
            this.u.t = ValueOf;
            return ValueOf;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends wp5 implements oh4<ba4, Boolean> {
        public final /* synthetic */ int u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i) {
            super(1);
            this.u = i;
        }

        @Override // defpackage.oh4
        public final Boolean invoke(ba4 ba4Var) {
            return Boolean.valueOf(ba4Var.y(this.u));
        }
    }

    public h94(cm cmVar, cm cmVar2) {
        this.a = cmVar;
        this.b = cmVar2;
        this.d = new b94(this, cmVar2);
    }

    @Override // defpackage.g94
    public final void a() {
        this.d.a();
    }

    @Override // defpackage.g94
    public final i94 b() {
        return this.e;
    }

    @Override // defpackage.g94
    public final Boolean c(int i, sk8 sk8Var, oh4<? super ba4, Boolean> oh4Var) {
        boolean zA;
        ba4 ba4Var;
        kb7 kb7Var;
        ba4 ba4Var2 = this.c;
        ba4 ba4VarA = fa4.a(ba4Var2);
        int i2 = 4;
        cm cmVar = this.b;
        boolean zBooleanValue = false;
        if (ba4VarA != null) {
            tq5 layoutDirection = cmVar.getLayoutDirection();
            n94 n94VarE2 = ba4VarA.e2();
            p94 p94Var = n94VarE2.h;
            p94 p94Var2 = n94VarE2.i;
            if (i == 1) {
                p94Var = n94VarE2.b;
            } else if (i == 2) {
                p94Var = n94VarE2.c;
            } else if (i == 5) {
                p94Var = n94VarE2.d;
            } else if (i == 6) {
                p94Var = n94VarE2.e;
            } else if (i == 3) {
                int iOrdinal = layoutDirection.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        u.b();
                        return null;
                    }
                    p94Var = p94Var2;
                }
                if (p94Var == p94.b) {
                    p94Var = null;
                }
                if (p94Var == null) {
                    p94Var = n94VarE2.f;
                }
            } else if (i == 4) {
                int iOrdinal2 = layoutDirection.ordinal();
                if (iOrdinal2 == 0) {
                    p94Var = p94Var2;
                } else if (iOrdinal2 != 1) {
                    u.b();
                    return null;
                }
                if (p94Var == p94.b) {
                    p94Var = null;
                }
                if (p94Var == null) {
                    p94Var = n94VarE2.g;
                }
            } else {
                if (i != 7 && i != 8) {
                    aa0.c("invalid FocusDirection");
                    return null;
                }
                w31 w31Var = new w31(i);
                g94 focusOwner = ew2.g(ba4VarA).getFocusOwner();
                ba4 ba4VarV = focusOwner.v();
                if (i == 7) {
                    n94VarE2.j.invoke(w31Var);
                } else {
                    n94VarE2.k.invoke(w31Var);
                }
                p94Var = w31Var.b ? p94.c : ba4VarV != focusOwner.v() ? p94.d : p94.b;
            }
            p94 p94Var3 = p94.c;
            if (!xj5.a(p94Var, p94Var3)) {
                if (xj5.a(p94Var, p94.d)) {
                    ba4 ba4VarA2 = fa4.a(ba4Var2);
                    if (ba4VarA2 != null) {
                        return oh4Var.invoke(ba4VarA2);
                    }
                } else {
                    p94 p94Var4 = p94.b;
                    if (!xj5.a(p94Var, p94Var4)) {
                        if (p94Var == p94Var4) {
                            aa0.c("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        if (p94Var == p94Var3) {
                            aa0.c("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        k37<s94> k37Var = p94Var.a;
                        int i3 = k37Var.v;
                        if (i3 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                        } else {
                            s94[] s94VarArr = k37Var.t;
                            boolean z = false;
                            for (int i4 = 0; i4 < i3; i4++) {
                                s94 s94Var = s94VarArr[i4];
                                if (!s94Var.q().G) {
                                    uc5.b("visitChildren called on an unattached node");
                                }
                                k37 k37Var2 = new k37(new ox6.c[16]);
                                ox6.c cVar = s94Var.q().y;
                                if (cVar == null) {
                                    ew2.a(k37Var2, s94Var.q());
                                } else {
                                    k37Var2.d(cVar);
                                }
                                while (true) {
                                    int i5 = k37Var2.v;
                                    if (i5 == 0) {
                                        break;
                                    }
                                    ox6.c cVarB = (ox6.c) k37Var2.o(i5 - 1);
                                    if ((cVarB.w & 1024) == 0) {
                                        ew2.a(k37Var2, cVarB);
                                    } else {
                                        while (cVarB != null) {
                                            if ((cVarB.v & 1024) != 0) {
                                                k37 k37Var3 = null;
                                                while (cVarB != null) {
                                                    if (cVarB instanceof ba4) {
                                                        if (oh4Var.invoke((ba4) cVarB).booleanValue()) {
                                                            z = true;
                                                            break;
                                                        }
                                                    } else if ((cVarB.v & 1024) != 0 && (cVarB instanceof gw2)) {
                                                        int i6 = 0;
                                                        for (ox6.c cVar2 = ((gw2) cVarB).I; cVar2 != null; cVar2 = cVar2.y) {
                                                            if ((cVar2.v & 1024) != 0) {
                                                                i6++;
                                                                if (i6 == 1) {
                                                                    cVarB = cVar2;
                                                                } else {
                                                                    if (k37Var3 == null) {
                                                                        k37Var3 = new k37(new ox6.c[16]);
                                                                    }
                                                                    if (cVarB != null) {
                                                                        k37Var3.d(cVarB);
                                                                        cVarB = null;
                                                                    }
                                                                    k37Var3.d(cVar2);
                                                                }
                                                            }
                                                        }
                                                        if (i6 == 1) {
                                                        }
                                                    }
                                                    cVarB = ew2.b(k37Var3);
                                                }
                                                break;
                                            }
                                            cVarB = cVarB.y;
                                        }
                                    }
                                }
                            }
                            zBooleanValue = z;
                        }
                        return Boolean.valueOf(zBooleanValue);
                    }
                }
            }
            return null;
        }
        ba4VarA = null;
        tq5 layoutDirection2 = cmVar.getLayoutDirection();
        a aVar = new a(ba4VarA, this, oh4Var);
        if (i == 1 || i == 2) {
            if (i == 1) {
                zA = ck7.b(ba4Var2, aVar);
            } else {
                if (i != 2) {
                    aa0.c("This function should only be used for 1-D focus search");
                    return null;
                }
                zA = ck7.a(ba4Var2, aVar);
            }
            return Boolean.valueOf(zA);
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return bza.l(i, aVar, ba4Var2, sk8Var);
        }
        if (i == 7) {
            int iOrdinal3 = layoutDirection2.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    u.b();
                    return null;
                }
                i2 = 3;
            }
            ba4 ba4VarA3 = fa4.a(ba4Var2);
            if (ba4VarA3 != null) {
                return bza.l(i2, aVar, ba4VarA3, sk8Var);
            }
            return null;
        }
        if (i != 8) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) l84.a(i))).toString());
        }
        ba4 ba4VarA4 = fa4.a(ba4Var2);
        if (ba4VarA4 == null) {
            ba4Var = null;
            break;
        }
        if (!ba4VarA4.t.G) {
            uc5.b("visitAncestors called on an unattached node");
        }
        ox6.c cVar3 = ba4VarA4.t.x;
        qr5 qr5VarF = ew2.f(ba4VarA4);
        loop5: while (true) {
            if (qr5VarF == null) {
                ba4Var = null;
                break;
            }
            if ((qr5VarF.Y.f.w & 1024) != 0) {
                while (cVar3 != null) {
                    if ((cVar3.v & 1024) != 0) {
                        ox6.c cVarB2 = cVar3;
                        k37 k37Var4 = null;
                        while (cVarB2 != null) {
                            if (cVarB2 instanceof ba4) {
                                ba4 ba4Var3 = (ba4) cVarB2;
                                if (ba4Var3.e2().a) {
                                    ba4Var = ba4Var3;
                                    break loop5;
                                }
                            } else if ((cVarB2.v & 1024) != 0 && (cVarB2 instanceof gw2)) {
                                int i7 = 0;
                                for (ox6.c cVar4 = ((gw2) cVarB2).I; cVar4 != null; cVar4 = cVar4.y) {
                                    if ((cVar4.v & 1024) != 0) {
                                        i7++;
                                        if (i7 == 1) {
                                            cVarB2 = cVar4;
                                        } else {
                                            if (k37Var4 == null) {
                                                k37Var4 = new k37(new ox6.c[16]);
                                            }
                                            if (cVarB2 != null) {
                                                k37Var4.d(cVarB2);
                                                cVarB2 = null;
                                            }
                                            k37Var4.d(cVar4);
                                        }
                                    }
                                }
                                if (i7 != 1) {
                                    cVarB2 = ew2.b(k37Var4);
                                }
                            }
                            cVarB2 = ew2.b(k37Var4);
                        }
                    }
                    cVar3 = cVar3.x;
                }
            }
            qr5VarF = qr5VarF.I();
            cVar3 = (qr5VarF == null || (kb7Var = qr5VarF.Y) == null) ? null : kb7Var.e;
        }
        if (ba4Var != null && ba4Var != ba4Var2) {
            zBooleanValue = ((Boolean) aVar.invoke(ba4Var)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [k37] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [k37] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r9v12 */
    @Override // defpackage.g94
    public final void d() {
        nb5 nb5Var;
        kb7 kb7Var;
        boolean z;
        ?? B;
        kb7 kb7Var2;
        ba4 ba4VarV = v();
        if (ba4VarV != null) {
            if (!ba4VarV.t.G) {
                uc5.b("visitAncestors called on an unattached node");
            }
            ox6.c cVar = ba4VarV.t;
            qr5 qr5VarF = ew2.f(ba4VarV);
            loop0: while (true) {
                if (qr5VarF == null) {
                    B = 0;
                    break;
                }
                if ((qr5VarF.Y.f.w & 2097152) != 0) {
                    while (cVar != null) {
                        if ((cVar.v & 2097152) != 0) {
                            ?? k37Var = 0;
                            B = cVar;
                            while (B != 0) {
                                if (B instanceof nb5) {
                                    break loop0;
                                }
                                if ((B.v & 2097152) != 0 && (B instanceof gw2)) {
                                    ox6.c cVar2 = ((gw2) B).I;
                                    int i = 0;
                                    while (cVar2 != null) {
                                        if ((cVar2.v & 2097152) != 0) {
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
                cVar = (qr5VarF == null || (kb7Var2 = qr5VarF.Y) == null) ? null : kb7Var2.e;
            }
            nb5Var = (nb5) B;
        } else {
            nb5Var = null;
        }
        if (nb5Var != null) {
            if (!nb5Var.q().G) {
                uc5.b("visitAncestors called on an unattached node");
            }
            ox6.c cVar3 = nb5Var.q().x;
            qr5 qr5VarF2 = ew2.f(nb5Var);
            ArrayList arrayList = null;
            while (qr5VarF2 != null) {
                if ((qr5VarF2.Y.f.w & 2097152) != 0) {
                    while (cVar3 != null) {
                        if ((cVar3.v & 2097152) != 0) {
                            ox6.c cVarB = cVar3;
                            k37 k37Var2 = null;
                            while (cVarB != null) {
                                if (cVarB instanceof nb5) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVarB);
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z && (cVarB.v & 2097152) != 0 && (cVarB instanceof gw2)) {
                                    int i2 = 0;
                                    for (ox6.c cVar4 = ((gw2) cVarB).I; cVar4 != null; cVar4 = cVar4.y) {
                                        if ((cVar4.v & 2097152) != 0) {
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
                                cVarB = ew2.b(k37Var2);
                            }
                        }
                        cVar3 = cVar3.x;
                    }
                }
                qr5VarF2 = qr5VarF2.I();
                cVar3 = (qr5VarF2 == null || (kb7Var = qr5VarF2.Y) == null) ? null : kb7Var.e;
            }
            nb5Var.X0();
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((nb5) arrayList.get(i3)).X0();
                }
            }
        }
    }

    @Override // defpackage.g94
    public final boolean e() {
        return false;
    }

    @Override // defpackage.g94
    public final boolean f() {
        ba4 ba4Var = this.c;
        if (ba4Var.G) {
            if (!ba4Var.t.G) {
                uc5.b("visitSubtreeIf called on an unattached node");
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
                ox6.c cVar3 = (ox6.c) k37Var.o(i - 1);
                if ((cVar3.w & 1024) != 0) {
                    for (ox6.c cVar4 = cVar3; cVar4 != null && cVar4.G; cVar4 = cVar4.y) {
                        if ((cVar4.v & 1024) != 0) {
                            ox6.c cVarB = cVar4;
                            k37 k37Var2 = null;
                            while (cVarB != null) {
                                if (cVarB instanceof ba4) {
                                    ba4 ba4Var2 = (ba4) cVarB;
                                    if (ba4Var2.G) {
                                        n94 n94VarE2 = ba4Var2.e2();
                                        if (ba4Var2.G && !ba4Var2.H && n94VarE2.a) {
                                            return true;
                                        }
                                    }
                                } else if ((cVarB.v & 1024) != 0 && (cVarB instanceof gw2)) {
                                    int i2 = 0;
                                    for (ox6.c cVar5 = ((gw2) cVarB).I; cVar5 != null; cVar5 = cVar5.y) {
                                        if ((cVar5.v & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cVarB = cVar5;
                                            } else {
                                                if (k37Var2 == null) {
                                                    k37Var2 = new k37(new ox6.c[16]);
                                                }
                                                if (cVarB != null) {
                                                    k37Var2.d(cVarB);
                                                    cVarB = null;
                                                }
                                                k37Var2.d(cVar5);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                cVarB = ew2.b(k37Var2);
                            }
                        }
                    }
                }
                ew2.a(k37Var, cVar3);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0155 A[Catch: all -> 0x02f2, TryCatch #0 {all -> 0x02f2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016b, B:128:0x0171, B:129:0x0174, B:131:0x017f, B:134:0x018b, B:138:0x0195, B:141:0x019b, B:142:0x01a0, B:145:0x01a8, B:147:0x01ae, B:149:0x01b2, B:151:0x01ba, B:153:0x01c0, B:155:0x01c4, B:157:0x01ca, B:159:0x01d3, B:160:0x01d7, B:161:0x01da, B:164:0x01e0, B:165:0x01e5, B:166:0x01e8, B:168:0x01ee, B:170:0x01f2, B:173:0x01f9, B:175:0x0201, B:182:0x0218, B:183:0x021a, B:185:0x021f, B:187:0x0223, B:210:0x0267, B:191:0x022f, B:193:0x0235, B:195:0x0239, B:197:0x0241, B:199:0x0247, B:201:0x024b, B:203:0x0251, B:205:0x025a, B:206:0x025e, B:207:0x0261, B:211:0x026c, B:215:0x027c, B:217:0x0281, B:219:0x0285, B:242:0x02c9, B:223:0x0291, B:225:0x0297, B:227:0x029b, B:229:0x02a3, B:231:0x02a9, B:233:0x02ad, B:235:0x02b3, B:237:0x02bc, B:238:0x02c0, B:239:0x02c3, B:244:0x02d0, B:246:0x02d7, B:251:0x02ea, B:252:0x02ec, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d7, B:77:0x00db, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:57:0x00a3, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e1, B:80:0x00e7, B:81:0x00ea, B:83:0x00f4, B:86:0x0100, B:90:0x010a, B:121:0x015f, B:123:0x0163, B:93:0x010f, B:95:0x0115, B:97:0x0119, B:99:0x0121, B:101:0x0127, B:103:0x012b, B:105:0x0131, B:107:0x013a, B:108:0x013e, B:109:0x0141, B:112:0x0147, B:113:0x014c, B:114:0x014f, B:116:0x0155, B:118:0x0159), top: B:258:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0163 A[Catch: all -> 0x02f2, TryCatch #0 {all -> 0x02f2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016b, B:128:0x0171, B:129:0x0174, B:131:0x017f, B:134:0x018b, B:138:0x0195, B:141:0x019b, B:142:0x01a0, B:145:0x01a8, B:147:0x01ae, B:149:0x01b2, B:151:0x01ba, B:153:0x01c0, B:155:0x01c4, B:157:0x01ca, B:159:0x01d3, B:160:0x01d7, B:161:0x01da, B:164:0x01e0, B:165:0x01e5, B:166:0x01e8, B:168:0x01ee, B:170:0x01f2, B:173:0x01f9, B:175:0x0201, B:182:0x0218, B:183:0x021a, B:185:0x021f, B:187:0x0223, B:210:0x0267, B:191:0x022f, B:193:0x0235, B:195:0x0239, B:197:0x0241, B:199:0x0247, B:201:0x024b, B:203:0x0251, B:205:0x025a, B:206:0x025e, B:207:0x0261, B:211:0x026c, B:215:0x027c, B:217:0x0281, B:219:0x0285, B:242:0x02c9, B:223:0x0291, B:225:0x0297, B:227:0x029b, B:229:0x02a3, B:231:0x02a9, B:233:0x02ad, B:235:0x02b3, B:237:0x02bc, B:238:0x02c0, B:239:0x02c3, B:244:0x02d0, B:246:0x02d7, B:251:0x02ea, B:252:0x02ec, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d7, B:77:0x00db, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:57:0x00a3, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e1, B:80:0x00e7, B:81:0x00ea, B:83:0x00f4, B:86:0x0100, B:90:0x010a, B:121:0x015f, B:123:0x0163, B:93:0x010f, B:95:0x0115, B:97:0x0119, B:99:0x0121, B:101:0x0127, B:103:0x012b, B:105:0x0131, B:107:0x013a, B:108:0x013e, B:109:0x0141, B:112:0x0147, B:113:0x014c, B:114:0x014f, B:116:0x0155, B:118:0x0159), top: B:258:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0168  */
    /* JADX WARN: Code duplicated, block: B:319:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:320:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x005b A[Catch: all -> 0x02f2, TryCatch #0 {all -> 0x02f2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016b, B:128:0x0171, B:129:0x0174, B:131:0x017f, B:134:0x018b, B:138:0x0195, B:141:0x019b, B:142:0x01a0, B:145:0x01a8, B:147:0x01ae, B:149:0x01b2, B:151:0x01ba, B:153:0x01c0, B:155:0x01c4, B:157:0x01ca, B:159:0x01d3, B:160:0x01d7, B:161:0x01da, B:164:0x01e0, B:165:0x01e5, B:166:0x01e8, B:168:0x01ee, B:170:0x01f2, B:173:0x01f9, B:175:0x0201, B:182:0x0218, B:183:0x021a, B:185:0x021f, B:187:0x0223, B:210:0x0267, B:191:0x022f, B:193:0x0235, B:195:0x0239, B:197:0x0241, B:199:0x0247, B:201:0x024b, B:203:0x0251, B:205:0x025a, B:206:0x025e, B:207:0x0261, B:211:0x026c, B:215:0x027c, B:217:0x0281, B:219:0x0285, B:242:0x02c9, B:223:0x0291, B:225:0x0297, B:227:0x029b, B:229:0x02a3, B:231:0x02a9, B:233:0x02ad, B:235:0x02b3, B:237:0x02bc, B:238:0x02c0, B:239:0x02c3, B:244:0x02d0, B:246:0x02d7, B:251:0x02ea, B:252:0x02ec, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d7, B:77:0x00db, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:57:0x00a3, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e1, B:80:0x00e7, B:81:0x00ea, B:83:0x00f4, B:86:0x0100, B:90:0x010a, B:121:0x015f, B:123:0x0163, B:93:0x010f, B:95:0x0115, B:97:0x0119, B:99:0x0121, B:101:0x0127, B:103:0x012b, B:105:0x0131, B:107:0x013a, B:108:0x013e, B:109:0x0141, B:112:0x0147, B:113:0x014c, B:114:0x014f, B:116:0x0155, B:118:0x0159), top: B:258:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:339:0x015e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:340:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x015c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0061 A[Catch: all -> 0x02f2, TryCatch #0 {all -> 0x02f2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016b, B:128:0x0171, B:129:0x0174, B:131:0x017f, B:134:0x018b, B:138:0x0195, B:141:0x019b, B:142:0x01a0, B:145:0x01a8, B:147:0x01ae, B:149:0x01b2, B:151:0x01ba, B:153:0x01c0, B:155:0x01c4, B:157:0x01ca, B:159:0x01d3, B:160:0x01d7, B:161:0x01da, B:164:0x01e0, B:165:0x01e5, B:166:0x01e8, B:168:0x01ee, B:170:0x01f2, B:173:0x01f9, B:175:0x0201, B:182:0x0218, B:183:0x021a, B:185:0x021f, B:187:0x0223, B:210:0x0267, B:191:0x022f, B:193:0x0235, B:195:0x0239, B:197:0x0241, B:199:0x0247, B:201:0x024b, B:203:0x0251, B:205:0x025a, B:206:0x025e, B:207:0x0261, B:211:0x026c, B:215:0x027c, B:217:0x0281, B:219:0x0285, B:242:0x02c9, B:223:0x0291, B:225:0x0297, B:227:0x029b, B:229:0x02a3, B:231:0x02a9, B:233:0x02ad, B:235:0x02b3, B:237:0x02bc, B:238:0x02c0, B:239:0x02c3, B:244:0x02d0, B:246:0x02d7, B:251:0x02ea, B:252:0x02ec, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d7, B:77:0x00db, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:57:0x00a3, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e1, B:80:0x00e7, B:81:0x00ea, B:83:0x00f4, B:86:0x0100, B:90:0x010a, B:121:0x015f, B:123:0x0163, B:93:0x010f, B:95:0x0115, B:97:0x0119, B:99:0x0121, B:101:0x0127, B:103:0x012b, B:105:0x0131, B:107:0x013a, B:108:0x013e, B:109:0x0141, B:112:0x0147, B:113:0x014c, B:114:0x014f, B:116:0x0155, B:118:0x0159), top: B:258:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:352:0x0147 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x006c A[Catch: all -> 0x02f2, TryCatch #0 {all -> 0x02f2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016b, B:128:0x0171, B:129:0x0174, B:131:0x017f, B:134:0x018b, B:138:0x0195, B:141:0x019b, B:142:0x01a0, B:145:0x01a8, B:147:0x01ae, B:149:0x01b2, B:151:0x01ba, B:153:0x01c0, B:155:0x01c4, B:157:0x01ca, B:159:0x01d3, B:160:0x01d7, B:161:0x01da, B:164:0x01e0, B:165:0x01e5, B:166:0x01e8, B:168:0x01ee, B:170:0x01f2, B:173:0x01f9, B:175:0x0201, B:182:0x0218, B:183:0x021a, B:185:0x021f, B:187:0x0223, B:210:0x0267, B:191:0x022f, B:193:0x0235, B:195:0x0239, B:197:0x0241, B:199:0x0247, B:201:0x024b, B:203:0x0251, B:205:0x025a, B:206:0x025e, B:207:0x0261, B:211:0x026c, B:215:0x027c, B:217:0x0281, B:219:0x0285, B:242:0x02c9, B:223:0x0291, B:225:0x0297, B:227:0x029b, B:229:0x02a3, B:231:0x02a9, B:233:0x02ad, B:235:0x02b3, B:237:0x02bc, B:238:0x02c0, B:239:0x02c3, B:244:0x02d0, B:246:0x02d7, B:251:0x02ea, B:252:0x02ec, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d7, B:77:0x00db, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:57:0x00a3, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e1, B:80:0x00e7, B:81:0x00ea, B:83:0x00f4, B:86:0x0100, B:90:0x010a, B:121:0x015f, B:123:0x0163, B:93:0x010f, B:95:0x0115, B:97:0x0119, B:99:0x0121, B:101:0x0127, B:103:0x012b, B:105:0x0131, B:107:0x013a, B:108:0x013e, B:109:0x0141, B:112:0x0147, B:113:0x014c, B:114:0x014f, B:116:0x0155, B:118:0x0159), top: B:258:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0076 A[ADDED_TO_REGION, LOOP:12: B:39:0x0076->B:67:0x00c4, LOOP_START, PHI: r6
      0x0076: PHI (r6v27 ox6$c) = (r6v22 ox6$c), (r6v28 ox6$c) binds: [B:38:0x0074, B:67:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x0078 A[Catch: all -> 0x02f2, TryCatch #0 {all -> 0x02f2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016b, B:128:0x0171, B:129:0x0174, B:131:0x017f, B:134:0x018b, B:138:0x0195, B:141:0x019b, B:142:0x01a0, B:145:0x01a8, B:147:0x01ae, B:149:0x01b2, B:151:0x01ba, B:153:0x01c0, B:155:0x01c4, B:157:0x01ca, B:159:0x01d3, B:160:0x01d7, B:161:0x01da, B:164:0x01e0, B:165:0x01e5, B:166:0x01e8, B:168:0x01ee, B:170:0x01f2, B:173:0x01f9, B:175:0x0201, B:182:0x0218, B:183:0x021a, B:185:0x021f, B:187:0x0223, B:210:0x0267, B:191:0x022f, B:193:0x0235, B:195:0x0239, B:197:0x0241, B:199:0x0247, B:201:0x024b, B:203:0x0251, B:205:0x025a, B:206:0x025e, B:207:0x0261, B:211:0x026c, B:215:0x027c, B:217:0x0281, B:219:0x0285, B:242:0x02c9, B:223:0x0291, B:225:0x0297, B:227:0x029b, B:229:0x02a3, B:231:0x02a9, B:233:0x02ad, B:235:0x02b3, B:237:0x02bc, B:238:0x02c0, B:239:0x02c3, B:244:0x02d0, B:246:0x02d7, B:251:0x02ea, B:252:0x02ec, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d7, B:77:0x00db, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:57:0x00a3, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e1, B:80:0x00e7, B:81:0x00ea, B:83:0x00f4, B:86:0x0100, B:90:0x010a, B:121:0x015f, B:123:0x0163, B:93:0x010f, B:95:0x0115, B:97:0x0119, B:99:0x0121, B:101:0x0127, B:103:0x012b, B:105:0x0131, B:107:0x013a, B:108:0x013e, B:109:0x0141, B:112:0x0147, B:113:0x014c, B:114:0x014f, B:116:0x0155, B:118:0x0159), top: B:258:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082 A[Catch: all -> 0x02f2, TryCatch #0 {all -> 0x02f2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016b, B:128:0x0171, B:129:0x0174, B:131:0x017f, B:134:0x018b, B:138:0x0195, B:141:0x019b, B:142:0x01a0, B:145:0x01a8, B:147:0x01ae, B:149:0x01b2, B:151:0x01ba, B:153:0x01c0, B:155:0x01c4, B:157:0x01ca, B:159:0x01d3, B:160:0x01d7, B:161:0x01da, B:164:0x01e0, B:165:0x01e5, B:166:0x01e8, B:168:0x01ee, B:170:0x01f2, B:173:0x01f9, B:175:0x0201, B:182:0x0218, B:183:0x021a, B:185:0x021f, B:187:0x0223, B:210:0x0267, B:191:0x022f, B:193:0x0235, B:195:0x0239, B:197:0x0241, B:199:0x0247, B:201:0x024b, B:203:0x0251, B:205:0x025a, B:206:0x025e, B:207:0x0261, B:211:0x026c, B:215:0x027c, B:217:0x0281, B:219:0x0285, B:242:0x02c9, B:223:0x0291, B:225:0x0297, B:227:0x029b, B:229:0x02a3, B:231:0x02a9, B:233:0x02ad, B:235:0x02b3, B:237:0x02bc, B:238:0x02c0, B:239:0x02c3, B:244:0x02d0, B:246:0x02d7, B:251:0x02ea, B:252:0x02ec, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d7, B:77:0x00db, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:57:0x00a3, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e1, B:80:0x00e7, B:81:0x00ea, B:83:0x00f4, B:86:0x0100, B:90:0x010a, B:121:0x015f, B:123:0x0163, B:93:0x010f, B:95:0x0115, B:97:0x0119, B:99:0x0121, B:101:0x0127, B:103:0x012b, B:105:0x0131, B:107:0x013a, B:108:0x013e, B:109:0x0141, B:112:0x0147, B:113:0x014c, B:114:0x014f, B:116:0x0155, B:118:0x0159), top: B:258:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0087 A[Catch: all -> 0x02f2, TryCatch #0 {all -> 0x02f2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016b, B:128:0x0171, B:129:0x0174, B:131:0x017f, B:134:0x018b, B:138:0x0195, B:141:0x019b, B:142:0x01a0, B:145:0x01a8, B:147:0x01ae, B:149:0x01b2, B:151:0x01ba, B:153:0x01c0, B:155:0x01c4, B:157:0x01ca, B:159:0x01d3, B:160:0x01d7, B:161:0x01da, B:164:0x01e0, B:165:0x01e5, B:166:0x01e8, B:168:0x01ee, B:170:0x01f2, B:173:0x01f9, B:175:0x0201, B:182:0x0218, B:183:0x021a, B:185:0x021f, B:187:0x0223, B:210:0x0267, B:191:0x022f, B:193:0x0235, B:195:0x0239, B:197:0x0241, B:199:0x0247, B:201:0x024b, B:203:0x0251, B:205:0x025a, B:206:0x025e, B:207:0x0261, B:211:0x026c, B:215:0x027c, B:217:0x0281, B:219:0x0285, B:242:0x02c9, B:223:0x0291, B:225:0x0297, B:227:0x029b, B:229:0x02a3, B:231:0x02a9, B:233:0x02ad, B:235:0x02b3, B:237:0x02bc, B:238:0x02c0, B:239:0x02c3, B:244:0x02d0, B:246:0x02d7, B:251:0x02ea, B:252:0x02ec, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d7, B:77:0x00db, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:57:0x00a3, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e1, B:80:0x00e7, B:81:0x00ea, B:83:0x00f4, B:86:0x0100, B:90:0x010a, B:121:0x015f, B:123:0x0163, B:93:0x010f, B:95:0x0115, B:97:0x0119, B:99:0x0121, B:101:0x0127, B:103:0x012b, B:105:0x0131, B:107:0x013a, B:108:0x013e, B:109:0x0141, B:112:0x0147, B:113:0x014c, B:114:0x014f, B:116:0x0155, B:118:0x0159), top: B:258:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00db A[Catch: all -> 0x02f2, TryCatch #0 {all -> 0x02f2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016b, B:128:0x0171, B:129:0x0174, B:131:0x017f, B:134:0x018b, B:138:0x0195, B:141:0x019b, B:142:0x01a0, B:145:0x01a8, B:147:0x01ae, B:149:0x01b2, B:151:0x01ba, B:153:0x01c0, B:155:0x01c4, B:157:0x01ca, B:159:0x01d3, B:160:0x01d7, B:161:0x01da, B:164:0x01e0, B:165:0x01e5, B:166:0x01e8, B:168:0x01ee, B:170:0x01f2, B:173:0x01f9, B:175:0x0201, B:182:0x0218, B:183:0x021a, B:185:0x021f, B:187:0x0223, B:210:0x0267, B:191:0x022f, B:193:0x0235, B:195:0x0239, B:197:0x0241, B:199:0x0247, B:201:0x024b, B:203:0x0251, B:205:0x025a, B:206:0x025e, B:207:0x0261, B:211:0x026c, B:215:0x027c, B:217:0x0281, B:219:0x0285, B:242:0x02c9, B:223:0x0291, B:225:0x0297, B:227:0x029b, B:229:0x02a3, B:231:0x02a9, B:233:0x02ad, B:235:0x02b3, B:237:0x02bc, B:238:0x02c0, B:239:0x02c3, B:244:0x02d0, B:246:0x02d7, B:251:0x02ea, B:252:0x02ec, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d7, B:77:0x00db, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:57:0x00a3, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e1, B:80:0x00e7, B:81:0x00ea, B:83:0x00f4, B:86:0x0100, B:90:0x010a, B:121:0x015f, B:123:0x0163, B:93:0x010f, B:95:0x0115, B:97:0x0119, B:99:0x0121, B:101:0x0127, B:103:0x012b, B:105:0x0131, B:107:0x013a, B:108:0x013e, B:109:0x0141, B:112:0x0147, B:113:0x014c, B:114:0x014f, B:116:0x0155, B:118:0x0159), top: B:258:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1 A[Catch: all -> 0x02f2, TryCatch #0 {all -> 0x02f2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016b, B:128:0x0171, B:129:0x0174, B:131:0x017f, B:134:0x018b, B:138:0x0195, B:141:0x019b, B:142:0x01a0, B:145:0x01a8, B:147:0x01ae, B:149:0x01b2, B:151:0x01ba, B:153:0x01c0, B:155:0x01c4, B:157:0x01ca, B:159:0x01d3, B:160:0x01d7, B:161:0x01da, B:164:0x01e0, B:165:0x01e5, B:166:0x01e8, B:168:0x01ee, B:170:0x01f2, B:173:0x01f9, B:175:0x0201, B:182:0x0218, B:183:0x021a, B:185:0x021f, B:187:0x0223, B:210:0x0267, B:191:0x022f, B:193:0x0235, B:195:0x0239, B:197:0x0241, B:199:0x0247, B:201:0x024b, B:203:0x0251, B:205:0x025a, B:206:0x025e, B:207:0x0261, B:211:0x026c, B:215:0x027c, B:217:0x0281, B:219:0x0285, B:242:0x02c9, B:223:0x0291, B:225:0x0297, B:227:0x029b, B:229:0x02a3, B:231:0x02a9, B:233:0x02ad, B:235:0x02b3, B:237:0x02bc, B:238:0x02c0, B:239:0x02c3, B:244:0x02d0, B:246:0x02d7, B:251:0x02ea, B:252:0x02ec, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d7, B:77:0x00db, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:57:0x00a3, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e1, B:80:0x00e7, B:81:0x00ea, B:83:0x00f4, B:86:0x0100, B:90:0x010a, B:121:0x015f, B:123:0x0163, B:93:0x010f, B:95:0x0115, B:97:0x0119, B:99:0x0121, B:101:0x0127, B:103:0x012b, B:105:0x0131, B:107:0x013a, B:108:0x013e, B:109:0x0141, B:112:0x0147, B:113:0x014c, B:114:0x014f, B:116:0x0155, B:118:0x0159), top: B:258:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7 A[Catch: all -> 0x02f2, TryCatch #0 {all -> 0x02f2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016b, B:128:0x0171, B:129:0x0174, B:131:0x017f, B:134:0x018b, B:138:0x0195, B:141:0x019b, B:142:0x01a0, B:145:0x01a8, B:147:0x01ae, B:149:0x01b2, B:151:0x01ba, B:153:0x01c0, B:155:0x01c4, B:157:0x01ca, B:159:0x01d3, B:160:0x01d7, B:161:0x01da, B:164:0x01e0, B:165:0x01e5, B:166:0x01e8, B:168:0x01ee, B:170:0x01f2, B:173:0x01f9, B:175:0x0201, B:182:0x0218, B:183:0x021a, B:185:0x021f, B:187:0x0223, B:210:0x0267, B:191:0x022f, B:193:0x0235, B:195:0x0239, B:197:0x0241, B:199:0x0247, B:201:0x024b, B:203:0x0251, B:205:0x025a, B:206:0x025e, B:207:0x0261, B:211:0x026c, B:215:0x027c, B:217:0x0281, B:219:0x0285, B:242:0x02c9, B:223:0x0291, B:225:0x0297, B:227:0x029b, B:229:0x02a3, B:231:0x02a9, B:233:0x02ad, B:235:0x02b3, B:237:0x02bc, B:238:0x02c0, B:239:0x02c3, B:244:0x02d0, B:246:0x02d7, B:251:0x02ea, B:252:0x02ec, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d7, B:77:0x00db, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:57:0x00a3, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e1, B:80:0x00e7, B:81:0x00ea, B:83:0x00f4, B:86:0x0100, B:90:0x010a, B:121:0x015f, B:123:0x0163, B:93:0x010f, B:95:0x0115, B:97:0x0119, B:99:0x0121, B:101:0x0127, B:103:0x012b, B:105:0x0131, B:107:0x013a, B:108:0x013e, B:109:0x0141, B:112:0x0147, B:113:0x014c, B:114:0x014f, B:116:0x0155, B:118:0x0159), top: B:258:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f4 A[Catch: all -> 0x02f2, TryCatch #0 {all -> 0x02f2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016b, B:128:0x0171, B:129:0x0174, B:131:0x017f, B:134:0x018b, B:138:0x0195, B:141:0x019b, B:142:0x01a0, B:145:0x01a8, B:147:0x01ae, B:149:0x01b2, B:151:0x01ba, B:153:0x01c0, B:155:0x01c4, B:157:0x01ca, B:159:0x01d3, B:160:0x01d7, B:161:0x01da, B:164:0x01e0, B:165:0x01e5, B:166:0x01e8, B:168:0x01ee, B:170:0x01f2, B:173:0x01f9, B:175:0x0201, B:182:0x0218, B:183:0x021a, B:185:0x021f, B:187:0x0223, B:210:0x0267, B:191:0x022f, B:193:0x0235, B:195:0x0239, B:197:0x0241, B:199:0x0247, B:201:0x024b, B:203:0x0251, B:205:0x025a, B:206:0x025e, B:207:0x0261, B:211:0x026c, B:215:0x027c, B:217:0x0281, B:219:0x0285, B:242:0x02c9, B:223:0x0291, B:225:0x0297, B:227:0x029b, B:229:0x02a3, B:231:0x02a9, B:233:0x02ad, B:235:0x02b3, B:237:0x02bc, B:238:0x02c0, B:239:0x02c3, B:244:0x02d0, B:246:0x02d7, B:251:0x02ea, B:252:0x02ec, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d7, B:77:0x00db, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:57:0x00a3, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e1, B:80:0x00e7, B:81:0x00ea, B:83:0x00f4, B:86:0x0100, B:90:0x010a, B:121:0x015f, B:123:0x0163, B:93:0x010f, B:95:0x0115, B:97:0x0119, B:99:0x0121, B:101:0x0127, B:103:0x012b, B:105:0x0131, B:107:0x013a, B:108:0x013e, B:109:0x0141, B:112:0x0147, B:113:0x014c, B:114:0x014f, B:116:0x0155, B:118:0x0159), top: B:258:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x00fe A[ADDED_TO_REGION, LOOP:16: B:85:0x00fe->B:113:0x014c, LOOP_START, PHI: r12
      0x00fe: PHI (r12v13 ox6$c) = (r12v8 ox6$c), (r12v14 ox6$c) binds: [B:84:0x00fc, B:113:0x014c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x0100 A[Catch: all -> 0x02f2, TryCatch #0 {all -> 0x02f2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016b, B:128:0x0171, B:129:0x0174, B:131:0x017f, B:134:0x018b, B:138:0x0195, B:141:0x019b, B:142:0x01a0, B:145:0x01a8, B:147:0x01ae, B:149:0x01b2, B:151:0x01ba, B:153:0x01c0, B:155:0x01c4, B:157:0x01ca, B:159:0x01d3, B:160:0x01d7, B:161:0x01da, B:164:0x01e0, B:165:0x01e5, B:166:0x01e8, B:168:0x01ee, B:170:0x01f2, B:173:0x01f9, B:175:0x0201, B:182:0x0218, B:183:0x021a, B:185:0x021f, B:187:0x0223, B:210:0x0267, B:191:0x022f, B:193:0x0235, B:195:0x0239, B:197:0x0241, B:199:0x0247, B:201:0x024b, B:203:0x0251, B:205:0x025a, B:206:0x025e, B:207:0x0261, B:211:0x026c, B:215:0x027c, B:217:0x0281, B:219:0x0285, B:242:0x02c9, B:223:0x0291, B:225:0x0297, B:227:0x029b, B:229:0x02a3, B:231:0x02a9, B:233:0x02ad, B:235:0x02b3, B:237:0x02bc, B:238:0x02c0, B:239:0x02c3, B:244:0x02d0, B:246:0x02d7, B:251:0x02ea, B:252:0x02ec, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d7, B:77:0x00db, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:57:0x00a3, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e1, B:80:0x00e7, B:81:0x00ea, B:83:0x00f4, B:86:0x0100, B:90:0x010a, B:121:0x015f, B:123:0x0163, B:93:0x010f, B:95:0x0115, B:97:0x0119, B:99:0x0121, B:101:0x0127, B:103:0x012b, B:105:0x0131, B:107:0x013a, B:108:0x013e, B:109:0x0141, B:112:0x0147, B:113:0x014c, B:114:0x014f, B:116:0x0155, B:118:0x0159), top: B:258:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0106  */
    /* JADX WARN: Code duplicated, block: B:90:0x010a A[Catch: all -> 0x02f2, TryCatch #0 {all -> 0x02f2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016b, B:128:0x0171, B:129:0x0174, B:131:0x017f, B:134:0x018b, B:138:0x0195, B:141:0x019b, B:142:0x01a0, B:145:0x01a8, B:147:0x01ae, B:149:0x01b2, B:151:0x01ba, B:153:0x01c0, B:155:0x01c4, B:157:0x01ca, B:159:0x01d3, B:160:0x01d7, B:161:0x01da, B:164:0x01e0, B:165:0x01e5, B:166:0x01e8, B:168:0x01ee, B:170:0x01f2, B:173:0x01f9, B:175:0x0201, B:182:0x0218, B:183:0x021a, B:185:0x021f, B:187:0x0223, B:210:0x0267, B:191:0x022f, B:193:0x0235, B:195:0x0239, B:197:0x0241, B:199:0x0247, B:201:0x024b, B:203:0x0251, B:205:0x025a, B:206:0x025e, B:207:0x0261, B:211:0x026c, B:215:0x027c, B:217:0x0281, B:219:0x0285, B:242:0x02c9, B:223:0x0291, B:225:0x0297, B:227:0x029b, B:229:0x02a3, B:231:0x02a9, B:233:0x02ad, B:235:0x02b3, B:237:0x02bc, B:238:0x02c0, B:239:0x02c3, B:244:0x02d0, B:246:0x02d7, B:251:0x02ea, B:252:0x02ec, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d7, B:77:0x00db, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:57:0x00a3, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e1, B:80:0x00e7, B:81:0x00ea, B:83:0x00f4, B:86:0x0100, B:90:0x010a, B:121:0x015f, B:123:0x0163, B:93:0x010f, B:95:0x0115, B:97:0x0119, B:99:0x0121, B:101:0x0127, B:103:0x012b, B:105:0x0131, B:107:0x013a, B:108:0x013e, B:109:0x0141, B:112:0x0147, B:113:0x014c, B:114:0x014f, B:116:0x0155, B:118:0x0159), top: B:258:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x010f A[Catch: all -> 0x02f2, TryCatch #0 {all -> 0x02f2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016b, B:128:0x0171, B:129:0x0174, B:131:0x017f, B:134:0x018b, B:138:0x0195, B:141:0x019b, B:142:0x01a0, B:145:0x01a8, B:147:0x01ae, B:149:0x01b2, B:151:0x01ba, B:153:0x01c0, B:155:0x01c4, B:157:0x01ca, B:159:0x01d3, B:160:0x01d7, B:161:0x01da, B:164:0x01e0, B:165:0x01e5, B:166:0x01e8, B:168:0x01ee, B:170:0x01f2, B:173:0x01f9, B:175:0x0201, B:182:0x0218, B:183:0x021a, B:185:0x021f, B:187:0x0223, B:210:0x0267, B:191:0x022f, B:193:0x0235, B:195:0x0239, B:197:0x0241, B:199:0x0247, B:201:0x024b, B:203:0x0251, B:205:0x025a, B:206:0x025e, B:207:0x0261, B:211:0x026c, B:215:0x027c, B:217:0x0281, B:219:0x0285, B:242:0x02c9, B:223:0x0291, B:225:0x0297, B:227:0x029b, B:229:0x02a3, B:231:0x02a9, B:233:0x02ad, B:235:0x02b3, B:237:0x02bc, B:238:0x02c0, B:239:0x02c3, B:244:0x02d0, B:246:0x02d7, B:251:0x02ea, B:252:0x02ec, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d7, B:77:0x00db, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:57:0x00a3, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e1, B:80:0x00e7, B:81:0x00ea, B:83:0x00f4, B:86:0x0100, B:90:0x010a, B:121:0x015f, B:123:0x0163, B:93:0x010f, B:95:0x0115, B:97:0x0119, B:99:0x0121, B:101:0x0127, B:103:0x012b, B:105:0x0131, B:107:0x013a, B:108:0x013e, B:109:0x0141, B:112:0x0147, B:113:0x014c, B:114:0x014f, B:116:0x0155, B:118:0x0159), top: B:258:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0115 A[Catch: all -> 0x02f2, TryCatch #0 {all -> 0x02f2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016b, B:128:0x0171, B:129:0x0174, B:131:0x017f, B:134:0x018b, B:138:0x0195, B:141:0x019b, B:142:0x01a0, B:145:0x01a8, B:147:0x01ae, B:149:0x01b2, B:151:0x01ba, B:153:0x01c0, B:155:0x01c4, B:157:0x01ca, B:159:0x01d3, B:160:0x01d7, B:161:0x01da, B:164:0x01e0, B:165:0x01e5, B:166:0x01e8, B:168:0x01ee, B:170:0x01f2, B:173:0x01f9, B:175:0x0201, B:182:0x0218, B:183:0x021a, B:185:0x021f, B:187:0x0223, B:210:0x0267, B:191:0x022f, B:193:0x0235, B:195:0x0239, B:197:0x0241, B:199:0x0247, B:201:0x024b, B:203:0x0251, B:205:0x025a, B:206:0x025e, B:207:0x0261, B:211:0x026c, B:215:0x027c, B:217:0x0281, B:219:0x0285, B:242:0x02c9, B:223:0x0291, B:225:0x0297, B:227:0x029b, B:229:0x02a3, B:231:0x02a9, B:233:0x02ad, B:235:0x02b3, B:237:0x02bc, B:238:0x02c0, B:239:0x02c3, B:244:0x02d0, B:246:0x02d7, B:251:0x02ea, B:252:0x02ec, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d7, B:77:0x00db, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:57:0x00a3, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e1, B:80:0x00e7, B:81:0x00ea, B:83:0x00f4, B:86:0x0100, B:90:0x010a, B:121:0x015f, B:123:0x0163, B:93:0x010f, B:95:0x0115, B:97:0x0119, B:99:0x0121, B:101:0x0127, B:103:0x012b, B:105:0x0131, B:107:0x013a, B:108:0x013e, B:109:0x0141, B:112:0x0147, B:113:0x014c, B:114:0x014f, B:116:0x0155, B:118:0x0159), top: B:258:0x0007 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v20, types: [k37] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [k37] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v23, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r12v24, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r12v28, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r12v29, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r12v35, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v45, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r12v52 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r12v68 */
    /* JADX WARN: Type inference failed for: r12v69 */
    /* JADX WARN: Type inference failed for: r12v70 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [k37] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [k37] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r6v37 */
    @Override // defpackage.g94
    public final boolean g(KeyEvent keyEvent, mh4<Boolean> mh4Var) {
        ox6.c cVar;
        qr5 qr5VarF;
        Object obj;
        so5 so5Var;
        ox6.c cVarQ;
        kb7 kb7Var;
        ox6.c cVarB;
        k37 k37Var;
        ox6.c cVar2;
        qr5 qr5VarF2;
        Object obj2;
        so5 so5Var2;
        kb7 kb7Var2;
        k37 k37Var2;
        ox6.c cVarB2;
        kb7 kb7Var3;
        boolean z;
        ba4 ba4Var = this.c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                Trace.endSection();
                return false;
            }
            if (!z(keyEvent)) {
                Trace.endSection();
                return false;
            }
            ba4 ba4VarA = fa4.a(ba4Var);
            if (ba4VarA != null) {
                if (!ba4VarA.t.G) {
                    uc5.b("visitLocalDescendants called on an unattached node");
                }
                ox6.c cVar3 = ba4VarA.t;
                if ((cVar3.w & 9216) != 0) {
                    cVarQ = null;
                    for (ox6.c cVar4 = cVar3.y; cVar4 != null; cVar4 = cVar4.y) {
                        int i = cVar4.v;
                        if ((i & 9216) != 0) {
                            if ((i & 1024) != 0) {
                                break;
                            }
                            cVarQ = cVar4;
                        }
                    }
                } else {
                    cVarQ = null;
                }
                if (cVarQ == null) {
                    if (ba4VarA == null) {
                        if (!ba4Var.t.G) {
                            uc5.b("visitAncestors called on an unattached node");
                        }
                        cVar = ba4Var.t.x;
                        qr5VarF = ew2.f(ba4Var);
                        loop15: while (true) {
                            if (qr5VarF != null) {
                                obj = null;
                                break;
                            }
                            if ((qr5VarF.Y.f.w & 8192) != 0) {
                                while (cVar != null) {
                                    if ((cVar.v & 8192) != 0) {
                                        cVarB = cVar;
                                        k37Var = null;
                                        while (cVarB != null) {
                                            if (cVarB instanceof so5) {
                                                obj = cVarB;
                                                break loop15;
                                            }
                                            if ((cVarB.v & 8192) == 0) {
                                            }
                                            cVarB = ew2.b(k37Var);
                                        }
                                    }
                                    cVar = cVar.x;
                                }
                            }
                            qr5VarF = qr5VarF.I();
                            if (qr5VarF != null) {
                            }
                        }
                        so5Var = (so5) obj;
                        if (so5Var != null) {
                            cVarQ = so5Var.q();
                        } else {
                            cVarQ = null;
                        }
                    } else {
                        if (!ba4VarA.t.G) {
                            uc5.b("visitAncestors called on an unattached node");
                        }
                        cVar2 = ba4VarA.t;
                        qr5VarF2 = ew2.f(ba4VarA);
                        loop11: while (true) {
                            if (qr5VarF2 != null) {
                                obj2 = null;
                                break;
                            }
                            if ((qr5VarF2.Y.f.w & 8192) != 0) {
                                while (cVar2 != null) {
                                    if ((cVar2.v & 8192) != 0) {
                                        k37Var2 = null;
                                        cVarB2 = cVar2;
                                        while (cVarB2 != null) {
                                            if (cVarB2 instanceof so5) {
                                                obj2 = cVarB2;
                                                break loop11;
                                            }
                                            if ((cVarB2.v & 8192) == 0) {
                                            }
                                            cVarB2 = ew2.b(k37Var2);
                                        }
                                    }
                                    cVar2 = cVar2.x;
                                }
                            }
                            qr5VarF2 = qr5VarF2.I();
                            if (qr5VarF2 != null) {
                            }
                        }
                        so5Var2 = (so5) obj2;
                        if (so5Var2 != null) {
                            cVarQ = so5Var2.q();
                        } else {
                            if (!ba4Var.t.G) {
                                uc5.b("visitAncestors called on an unattached node");
                            }
                            cVar = ba4Var.t.x;
                            qr5VarF = ew2.f(ba4Var);
                            loop15: while (true) {
                                if (qr5VarF != null) {
                                    obj = null;
                                    break;
                                }
                                if ((qr5VarF.Y.f.w & 8192) != 0) {
                                    while (cVar != null) {
                                        if ((cVar.v & 8192) != 0) {
                                            cVarB = cVar;
                                            k37Var = null;
                                            while (cVarB != null) {
                                                if (cVarB instanceof so5) {
                                                    obj = cVarB;
                                                    break loop15;
                                                }
                                                if ((cVarB.v & 8192) == 0) {
                                                }
                                                cVarB = ew2.b(k37Var);
                                            }
                                        }
                                        cVar = cVar.x;
                                    }
                                }
                                qr5VarF = qr5VarF.I();
                                if (qr5VarF != null) {
                                }
                            }
                            so5Var = (so5) obj;
                            if (so5Var != null) {
                                cVarQ = so5Var.q();
                            } else {
                                cVarQ = null;
                            }
                        }
                    }
                }
            } else if (ba4VarA == null) {
                if (!ba4Var.t.G) {
                    uc5.b("visitAncestors called on an unattached node");
                }
                cVar = ba4Var.t.x;
                qr5VarF = ew2.f(ba4Var);
                loop15: while (true) {
                    if (qr5VarF != null) {
                        obj = null;
                        break;
                    }
                    if ((qr5VarF.Y.f.w & 8192) != 0) {
                        while (cVar != null) {
                            if ((cVar.v & 8192) != 0) {
                                cVarB = cVar;
                                k37Var = null;
                                while (cVarB != null) {
                                    if (cVarB instanceof so5) {
                                        obj = cVarB;
                                        break loop15;
                                    }
                                    if ((cVarB.v & 8192) == 0 && (cVarB instanceof gw2)) {
                                        ox6.c cVar5 = ((gw2) cVarB).I;
                                        int i2 = 0;
                                        while (cVar5 != null) {
                                            if ((cVar5.v & 8192) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    cVarB = cVarB;
                                                    k37Var = k37Var;
                                                    k37Var = k37Var;
                                                    g2b g2bVar = g2b.a;
                                                    cVarB = cVar5;
                                                } else {
                                                    if (k37Var == null) {
                                                        k37Var = new k37(new ox6.c[16]);
                                                    }
                                                    if (cVarB != null) {
                                                        k37Var.d(cVarB);
                                                        cVarB = null;
                                                    }
                                                    k37Var.d(cVar5);
                                                }
                                            } else {
                                                cVarB = cVarB;
                                                k37Var = k37Var;
                                            }
                                            cVar5 = cVar5.y;
                                            cVarB = cVarB;
                                            k37Var = k37Var;
                                        }
                                        if (i2 == 1) {
                                            cVarB = cVarB;
                                            k37Var = k37Var;
                                        } else {
                                            cVarB = cVarB;
                                            k37Var = k37Var;
                                        }
                                    }
                                    cVarB = ew2.b(k37Var);
                                }
                            }
                            cVar = cVar.x;
                        }
                    }
                    qr5VarF = qr5VarF.I();
                    cVar = (qr5VarF != null || (kb7Var = qr5VarF.Y) == null) ? null : kb7Var.e;
                }
                so5Var = (so5) obj;
                if (so5Var != null) {
                    cVarQ = so5Var.q();
                } else {
                    cVarQ = null;
                }
            } else {
                if (!ba4VarA.t.G) {
                    uc5.b("visitAncestors called on an unattached node");
                }
                cVar2 = ba4VarA.t;
                qr5VarF2 = ew2.f(ba4VarA);
                loop11: while (true) {
                    if (qr5VarF2 != null) {
                        obj2 = null;
                        break;
                    }
                    if ((qr5VarF2.Y.f.w & 8192) != 0) {
                        while (cVar2 != null) {
                            if ((cVar2.v & 8192) != 0) {
                                k37Var2 = null;
                                cVarB2 = cVar2;
                                while (cVarB2 != null) {
                                    if (cVarB2 instanceof so5) {
                                        obj2 = cVarB2;
                                        break loop11;
                                    }
                                    if ((cVarB2.v & 8192) == 0 && (cVarB2 instanceof gw2)) {
                                        ox6.c cVar6 = ((gw2) cVarB2).I;
                                        int i3 = 0;
                                        while (cVar6 != null) {
                                            if ((cVar6.v & 8192) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    cVarB2 = cVarB2;
                                                    k37Var2 = k37Var2;
                                                    k37Var2 = k37Var2;
                                                    g2b g2bVar2 = g2b.a;
                                                    cVarB2 = cVar6;
                                                } else {
                                                    if (k37Var2 == null) {
                                                        k37Var2 = new k37(new ox6.c[16]);
                                                    }
                                                    if (cVarB2 != null) {
                                                        k37Var2.d(cVarB2);
                                                        cVarB2 = null;
                                                    }
                                                    k37Var2.d(cVar6);
                                                }
                                            } else {
                                                cVarB2 = cVarB2;
                                                k37Var2 = k37Var2;
                                            }
                                            cVar6 = cVar6.y;
                                            cVarB2 = cVarB2;
                                            k37Var2 = k37Var2;
                                        }
                                        if (i3 == 1) {
                                            cVarB2 = cVarB2;
                                            k37Var2 = k37Var2;
                                        } else {
                                            cVarB2 = cVarB2;
                                            k37Var2 = k37Var2;
                                        }
                                    }
                                    cVarB2 = ew2.b(k37Var2);
                                }
                            }
                            cVar2 = cVar2.x;
                        }
                    }
                    qr5VarF2 = qr5VarF2.I();
                    cVar2 = (qr5VarF2 != null || (kb7Var2 = qr5VarF2.Y) == null) ? null : kb7Var2.e;
                }
                so5Var2 = (so5) obj2;
                if (so5Var2 != null) {
                    cVarQ = so5Var2.q();
                } else {
                    if (!ba4Var.t.G) {
                        uc5.b("visitAncestors called on an unattached node");
                    }
                    cVar = ba4Var.t.x;
                    qr5VarF = ew2.f(ba4Var);
                    loop15: while (true) {
                        if (qr5VarF != null) {
                            obj = null;
                            break;
                        }
                        if ((qr5VarF.Y.f.w & 8192) != 0) {
                            while (cVar != null) {
                                if ((cVar.v & 8192) != 0) {
                                    cVarB = cVar;
                                    k37Var = null;
                                    while (cVarB != null) {
                                        if (cVarB instanceof so5) {
                                            obj = cVarB;
                                            break loop15;
                                        }
                                        if ((cVarB.v & 8192) == 0) {
                                        }
                                        cVarB = ew2.b(k37Var);
                                    }
                                }
                                cVar = cVar.x;
                            }
                        }
                        qr5VarF = qr5VarF.I();
                        if (qr5VarF != null) {
                        }
                    }
                    so5Var = (so5) obj;
                    if (so5Var != null) {
                        cVarQ = so5Var.q();
                    } else {
                        cVarQ = null;
                    }
                }
            }
            if (cVarQ != null) {
                if (!cVarQ.t.G) {
                    uc5.b("visitAncestors called on an unattached node");
                }
                ox6.c cVar7 = cVarQ.t.x;
                qr5 qr5VarF3 = ew2.f(cVarQ);
                ArrayList arrayList = null;
                while (qr5VarF3 != null) {
                    if ((qr5VarF3.Y.f.w & 8192) != 0) {
                        while (cVar7 != null) {
                            if ((cVar7.v & 8192) != 0) {
                                ox6.c cVarB3 = cVar7;
                                k37 k37Var3 = null;
                                while (cVarB3 != null) {
                                    if (cVarB3 instanceof so5) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(cVarB3);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (cVarB3.v & 8192) != 0 && (cVarB3 instanceof gw2)) {
                                        int i4 = 0;
                                        for (ox6.c cVar8 = ((gw2) cVarB3).I; cVar8 != null; cVar8 = cVar8.y) {
                                            if ((cVar8.v & 8192) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    g2b g2bVar3 = g2b.a;
                                                    cVarB3 = cVar8;
                                                } else {
                                                    if (k37Var3 == null) {
                                                        k37Var3 = new k37(new ox6.c[16]);
                                                    }
                                                    if (cVarB3 != null) {
                                                        k37Var3.d(cVarB3);
                                                        cVarB3 = null;
                                                    }
                                                    k37Var3.d(cVar8);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    cVarB3 = ew2.b(k37Var3);
                                }
                            }
                            cVar7 = cVar7.x;
                        }
                    }
                    qr5VarF3 = qr5VarF3.I();
                    cVar7 = (qr5VarF3 == null || (kb7Var3 = qr5VarF3.Y) == null) ? null : kb7Var3.e;
                }
                if (arrayList != null) {
                    int size = arrayList.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i5 = size - 1;
                            if (((so5) arrayList.get(size)).C(keyEvent)) {
                                Trace.endSection();
                                return true;
                            }
                            if (i5 < 0) {
                                break;
                            }
                            size = i5;
                        }
                    }
                    g2b g2bVar4 = g2b.a;
                }
                ?? B = cVarQ.t;
                ?? k37Var4 = 0;
                while (B != 0) {
                    if (B instanceof so5) {
                        if (((so5) B).C(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((B.v & 8192) != 0 && (B instanceof gw2)) {
                        ox6.c cVar9 = ((gw2) B).I;
                        int i6 = 0;
                        while (cVar9 != null) {
                            if ((cVar9.v & 8192) != 0) {
                                i6++;
                                if (i6 == 1) {
                                    k37Var4 = k37Var4;
                                    B = B;
                                    k37Var4 = k37Var4;
                                    g2b g2bVar5 = g2b.a;
                                    B = cVar9;
                                } else {
                                    if (k37Var4 == 0) {
                                        k37Var4 = new k37(new ox6.c[16]);
                                    }
                                    if (B != 0) {
                                        k37Var4.d(B);
                                        B = 0;
                                    }
                                    k37Var4.d(cVar9);
                                }
                            } else {
                                k37Var4 = k37Var4;
                                B = B;
                            }
                            cVar9 = cVar9.y;
                            k37Var4 = k37Var4;
                            B = B;
                        }
                        if (i6 == 1) {
                            k37Var4 = k37Var4;
                            B = B;
                        } else {
                            k37Var4 = k37Var4;
                            B = B;
                        }
                    }
                    B = ew2.b(k37Var4);
                }
                if (mh4Var.invoke().booleanValue()) {
                    Trace.endSection();
                    return true;
                }
                ?? B2 = cVarQ.t;
                ?? k37Var5 = 0;
                while (B2 != 0) {
                    if (B2 instanceof so5) {
                        if (((so5) B2).l0(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((B2.v & 8192) != 0 && (B2 instanceof gw2)) {
                        ox6.c cVar10 = ((gw2) B2).I;
                        int i7 = 0;
                        while (cVar10 != null) {
                            if ((cVar10.v & 8192) != 0) {
                                i7++;
                                if (i7 == 1) {
                                    B2 = B2;
                                    k37Var5 = k37Var5;
                                    k37Var5 = k37Var5;
                                    g2b g2bVar6 = g2b.a;
                                    B2 = cVar10;
                                } else {
                                    if (k37Var5 == 0) {
                                        k37Var5 = new k37(new ox6.c[16]);
                                    }
                                    if (B2 != 0) {
                                        k37Var5.d(B2);
                                        B2 = 0;
                                    }
                                    k37Var5.d(cVar10);
                                }
                            } else {
                                B2 = B2;
                                k37Var5 = k37Var5;
                            }
                            cVar10 = cVar10.y;
                            B2 = B2;
                            k37Var5 = k37Var5;
                        }
                        if (i7 == 1) {
                            B2 = B2;
                            k37Var5 = k37Var5;
                        } else {
                            B2 = B2;
                            k37Var5 = k37Var5;
                        }
                    }
                    B2 = ew2.b(k37Var5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        if (((so5) arrayList.get(i8)).l0(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    }
                    g2b g2bVar7 = g2b.a;
                }
                g2b g2bVar8 = g2b.a;
            }
            Trace.endSection();
            return false;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // defpackage.g94
    public final t27<c94> getListeners() {
        return this.g;
    }

    @Override // defpackage.g94
    public final void h(ba4 ba4Var) {
        ba4 ba4Var2 = this.h;
        this.h = ba4Var;
        t27<c94> t27Var = this.g;
        Object[] objArr = t27Var.a;
        int i = t27Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((c94) objArr[i2]).b(ba4Var2, ba4Var);
        }
    }

    @Override // defpackage.g94
    public final boolean i() {
        return this.a.e0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Boolean] */
    @Override // defpackage.g94
    public final boolean j(int i, boolean z) {
        ba4 ba4VarV = v();
        cm cmVar = this.a;
        if (ba4VarV == null || !ba4VarV.H || !cmVar.a0(i)) {
            gl8 gl8Var = new gl8();
            gl8Var.t = Boolean.FALSE;
            ba4 ba4VarV2 = v();
            Boolean boolC = c(i, cmVar.getEmbeddedViewFocusRect(), new b(i, gl8Var));
            if (!xj5.a(boolC, Boolean.TRUE) || ba4VarV2 == v()) {
                if (boolC != null && gl8Var.t != 0) {
                    if (!boolC.booleanValue() || !((Boolean) gl8Var.t).booleanValue()) {
                        if ((i == 1 || i == 2) && z && p(i, false, false)) {
                            Boolean boolC2 = c(i, null, new j94(i));
                            if (boolC2 != null ? boolC2.booleanValue() : false) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.g94
    public final boolean k() {
        ba4 ba4Var = this.c;
        if (ba4Var.G) {
            if (!ba4Var.t.G) {
                uc5.b("visitSubtreeIf called on an unattached node");
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
                ox6.c cVar3 = (ox6.c) k37Var.o(i - 1);
                if ((cVar3.w & 1024) != 0) {
                    for (ox6.c cVar4 = cVar3; cVar4 != null && cVar4.G; cVar4 = cVar4.y) {
                        if ((cVar4.v & 1024) != 0) {
                            ox6.c cVarB = cVar4;
                            k37 k37Var2 = null;
                            while (cVarB != null) {
                                if (cVarB instanceof ba4) {
                                    ba4 ba4Var2 = (ba4) cVarB;
                                    if (ba4Var2.G && ba4Var2.e2().a) {
                                        return true;
                                    }
                                } else if ((cVarB.v & 1024) != 0 && (cVarB instanceof gw2)) {
                                    int i2 = 0;
                                    for (ox6.c cVar5 = ((gw2) cVarB).I; cVar5 != null; cVar5 = cVar5.y) {
                                        if ((cVar5.v & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cVarB = cVar5;
                                            } else {
                                                if (k37Var2 == null) {
                                                    k37Var2 = new k37(new ox6.c[16]);
                                                }
                                                if (cVarB != null) {
                                                    k37Var2.d(cVarB);
                                                    cVarB = null;
                                                }
                                                k37Var2.d(cVar5);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                cVarB = ew2.b(k37Var2);
                            }
                        }
                    }
                }
                ew2.a(k37Var, cVar3);
            }
        }
        return false;
    }

    @Override // defpackage.g94
    public final void l(ba4 ba4Var) {
        b94 b94Var = this.d;
        if (b94Var.c.a(ba4Var)) {
            b94Var.a();
        }
    }

    @Override // defpackage.g94
    public final void m(q84 q84Var) {
        b94 b94Var = this.d;
        if (b94Var.d.a(q84Var)) {
            b94Var.a();
        }
    }

    @Override // defpackage.g94
    public final boolean n(int i) {
        if (!p(i, false, false)) {
            return false;
        }
        Boolean boolC = c(i, null, new c(i));
        boolean zBooleanValue = boolC != null ? boolC.booleanValue() : false;
        if (!zBooleanValue) {
            y();
        }
        return zBooleanValue;
    }

    @Override // defpackage.g94
    public final sk8 o() {
        ba4 ba4VarA = fa4.a(this.c);
        if (ba4VarA != null) {
            return fa4.b(ba4VarA);
        }
        return null;
    }

    @Override // defpackage.g94
    public final boolean p(int i, boolean z, boolean z2) {
        int iOrdinal;
        boolean z3 = true;
        if (z || (iOrdinal = ia.b(this.c, i).ordinal()) == 0) {
            x(z);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                u.b();
                return false;
            }
            z3 = false;
        }
        if (z3 && z2) {
            y();
        }
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [k37] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [k37] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r9v12 */
    @Override // defpackage.g94
    public final boolean q(to toVar) {
        nb5 nb5Var;
        int size;
        int size2;
        kb7 kb7Var;
        boolean z;
        ?? B;
        kb7 kb7Var2;
        if (this.d.e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated.");
            return false;
        }
        ba4 ba4VarV = v();
        if (ba4VarV != null) {
            if (!ba4VarV.t.G) {
                uc5.b("visitAncestors called on an unattached node");
            }
            ox6.c cVar = ba4VarV.t;
            qr5 qr5VarF = ew2.f(ba4VarV);
            loop0: while (true) {
                if (qr5VarF == null) {
                    B = 0;
                    break;
                }
                if ((qr5VarF.Y.f.w & 2097152) != 0) {
                    while (cVar != null) {
                        if ((cVar.v & 2097152) != 0) {
                            ?? k37Var = 0;
                            B = cVar;
                            while (B != 0) {
                                if (B instanceof nb5) {
                                    break loop0;
                                }
                                if ((B.v & 2097152) != 0 && (B instanceof gw2)) {
                                    ox6.c cVar2 = ((gw2) B).I;
                                    int i = 0;
                                    while (cVar2 != null) {
                                        if ((cVar2.v & 2097152) != 0) {
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
                cVar = (qr5VarF == null || (kb7Var2 = qr5VarF.Y) == null) ? null : kb7Var2.e;
            }
            nb5Var = (nb5) B;
        } else {
            nb5Var = null;
        }
        if (nb5Var != null) {
            if (!nb5Var.q().G) {
                uc5.b("visitAncestors called on an unattached node");
            }
            ox6.c cVar3 = nb5Var.q().x;
            qr5 qr5VarF2 = ew2.f(nb5Var);
            ArrayList arrayList = null;
            while (qr5VarF2 != null) {
                if ((qr5VarF2.Y.f.w & 2097152) != 0) {
                    while (cVar3 != null) {
                        if ((cVar3.v & 2097152) != 0) {
                            ox6.c cVarB = cVar3;
                            k37 k37Var2 = null;
                            while (cVarB != null) {
                                if (cVarB instanceof nb5) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVarB);
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z && (cVarB.v & 2097152) != 0 && (cVarB instanceof gw2)) {
                                    int i2 = 0;
                                    for (ox6.c cVar4 = ((gw2) cVarB).I; cVar4 != null; cVar4 = cVar4.y) {
                                        if ((cVar4.v & 2097152) != 0) {
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
                                cVarB = ew2.b(k37Var2);
                            }
                        }
                        cVar3 = cVar3.x;
                    }
                }
                qr5VarF2 = qr5VarF2.I();
                cVar3 = (qr5VarF2 == null || (kb7Var = qr5VarF2.Y) == null) ? null : kb7Var.e;
            }
            s48 s48Var = s48.t;
            if (arrayList != null && (size2 = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i3 = size2 - 1;
                    ((nb5) arrayList.get(size2)).b0(toVar, s48Var);
                    if (i3 < 0) {
                        break;
                    }
                    size2 = i3;
                }
            }
            nb5Var.b0(toVar, s48Var);
            s48 s48Var2 = s48.u;
            nb5Var.b0(toVar, s48Var2);
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    ((nb5) arrayList.get(i4)).b0(toVar, s48Var2);
                }
            }
            s48 s48Var3 = s48.v;
            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i5 = size - 1;
                    ((nb5) arrayList.get(size)).b0(toVar, s48Var3);
                    if (i5 < 0) {
                        break;
                    }
                    size = i5;
                }
            }
            nb5Var.b0(toVar, s48Var3);
        }
        ArrayList arrayList2 = toVar.a;
        int size4 = arrayList2.size();
        for (int i6 = 0; i6 < size4; i6++) {
            if (((jb5) arrayList2.get(i6)).i) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.d94
    public final boolean r(int i) {
        return j(i, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v13, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r11v14, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r11v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r11v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r11v54 */
    /* JADX WARN: Type inference failed for: r11v55 */
    /* JADX WARN: Type inference failed for: r11v8, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r11v9, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14, types: [k37] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17, types: [k37] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20, types: [k37] */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23, types: [k37] */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31, types: [k37] */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34, types: [k37] */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v16 */
    @Override // defpackage.g94
    public final boolean s(tx8 tx8Var, em emVar) {
        sx8 sx8Var;
        kb7 kb7Var;
        boolean z;
        ?? B;
        kb7 kb7Var2;
        if (this.d.e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        ba4 ba4VarA = fa4.a(this.c);
        if (ba4VarA != null) {
            if (!ba4VarA.t.G) {
                uc5.b("visitAncestors called on an unattached node");
            }
            ox6.c cVar = ba4VarA.t;
            qr5 qr5VarF = ew2.f(ba4VarA);
            loop0: while (true) {
                if (qr5VarF == null) {
                    B = 0;
                    break;
                }
                if ((qr5VarF.Y.f.w & 16384) != 0) {
                    while (cVar != null) {
                        if ((cVar.v & 16384) != 0) {
                            ?? k37Var = 0;
                            B = cVar;
                            while (B != 0) {
                                if (B instanceof sx8) {
                                    break loop0;
                                }
                                if ((B.v & 16384) != 0 && (B instanceof gw2)) {
                                    ox6.c cVar2 = ((gw2) B).I;
                                    int i = 0;
                                    while (cVar2 != null) {
                                        if ((cVar2.v & 16384) != 0) {
                                            i++;
                                            if (i == 1) {
                                                B = B;
                                                k37Var = k37Var;
                                                k37Var = k37Var;
                                                g2b g2bVar = g2b.a;
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
                cVar = (qr5VarF == null || (kb7Var2 = qr5VarF.Y) == null) ? null : kb7Var2.e;
            }
            sx8Var = (sx8) B;
        } else {
            sx8Var = null;
        }
        if (sx8Var != null) {
            if (!sx8Var.q().G) {
                uc5.b("visitAncestors called on an unattached node");
            }
            ox6.c cVar3 = sx8Var.q().x;
            qr5 qr5VarF2 = ew2.f(sx8Var);
            ArrayList arrayList = null;
            while (qr5VarF2 != null) {
                if ((qr5VarF2.Y.f.w & 16384) != 0) {
                    while (cVar3 != null) {
                        if ((cVar3.v & 16384) != 0) {
                            ox6.c cVarB = cVar3;
                            k37 k37Var2 = null;
                            while (cVarB != null) {
                                if (cVarB instanceof sx8) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVarB);
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z && (cVarB.v & 16384) != 0 && (cVarB instanceof gw2)) {
                                    int i2 = 0;
                                    for (ox6.c cVar4 = ((gw2) cVarB).I; cVar4 != null; cVar4 = cVar4.y) {
                                        if ((cVar4.v & 16384) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                g2b g2bVar2 = g2b.a;
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
                                cVarB = ew2.b(k37Var2);
                            }
                        }
                        cVar3 = cVar3.x;
                    }
                }
                qr5VarF2 = qr5VarF2.I();
                cVar3 = (qr5VarF2 == null || (kb7Var = qr5VarF2.Y) == null) ? null : kb7Var.e;
            }
            if (arrayList != null) {
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i3 = size - 1;
                        ((sx8) arrayList.get(size)).getClass();
                        if (i3 < 0) {
                            break;
                        }
                        size = i3;
                    }
                }
                g2b g2bVar3 = g2b.a;
            }
            ?? Q = sx8Var.q();
            ?? k37Var3 = 0;
            while (Q != 0) {
                if (Q instanceof sx8) {
                } else if ((Q.v & 16384) != 0 && (Q instanceof gw2)) {
                    ox6.c cVar5 = ((gw2) Q).I;
                    int i4 = 0;
                    while (cVar5 != null) {
                        if ((cVar5.v & 16384) != 0) {
                            i4++;
                            if (i4 == 1) {
                                Q = Q;
                                k37Var3 = k37Var3;
                                k37Var3 = k37Var3;
                                g2b g2bVar4 = g2b.a;
                                Q = cVar5;
                            } else {
                                if (k37Var3 == 0) {
                                    k37Var3 = new k37(new ox6.c[16]);
                                }
                                if (Q != 0) {
                                    k37Var3.d(Q);
                                    Q = 0;
                                }
                                k37Var3.d(cVar5);
                            }
                        } else {
                            Q = Q;
                            k37Var3 = k37Var3;
                        }
                        cVar5 = cVar5.y;
                        Q = Q;
                        k37Var3 = k37Var3;
                    }
                    if (i4 == 1) {
                        Q = Q;
                        k37Var3 = k37Var3;
                    } else {
                        Q = Q;
                        k37Var3 = k37Var3;
                    }
                }
                Q = ew2.b(k37Var3);
            }
            if (((Boolean) emVar.invoke()).booleanValue()) {
                return true;
            }
            ?? Q2 = sx8Var.q();
            ?? k37Var4 = 0;
            while (Q2 != 0) {
                if (Q2 instanceof sx8) {
                } else if ((Q2.v & 16384) != 0 && (Q2 instanceof gw2)) {
                    ox6.c cVar6 = ((gw2) Q2).I;
                    int i5 = 0;
                    while (cVar6 != null) {
                        if ((cVar6.v & 16384) != 0) {
                            i5++;
                            if (i5 == 1) {
                                Q2 = Q2;
                                k37Var4 = k37Var4;
                                k37Var4 = k37Var4;
                                g2b g2bVar5 = g2b.a;
                                Q2 = cVar6;
                            } else {
                                if (k37Var4 == 0) {
                                    k37Var4 = new k37(new ox6.c[16]);
                                }
                                if (Q2 != 0) {
                                    k37Var4.d(Q2);
                                    Q2 = 0;
                                }
                                k37Var4.d(cVar6);
                            }
                        } else {
                            Q2 = Q2;
                            k37Var4 = k37Var4;
                        }
                        cVar6 = cVar6.y;
                        Q2 = Q2;
                        k37Var4 = k37Var4;
                    }
                    if (i5 == 1) {
                        Q2 = Q2;
                        k37Var4 = k37Var4;
                    } else {
                        Q2 = Q2;
                        k37Var4 = k37Var4;
                    }
                }
                Q2 = ew2.b(k37Var4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    ((sx8) arrayList.get(i6)).getClass();
                }
                g2b g2bVar6 = g2b.a;
            }
            g2b g2bVar7 = g2b.a;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0151  */
    /* JADX WARN: Code duplicated, block: B:117:0x015f  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:165:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:167:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:170:0x01ff A[LOOP:13: B:166:0x01f0->B:170:0x01ff, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:219:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r12v11, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r12v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v52 */
    /* JADX WARN: Type inference failed for: r12v53 */
    /* JADX WARN: Type inference failed for: r12v54 */
    /* JADX WARN: Type inference failed for: r12v55 */
    /* JADX WARN: Type inference failed for: r12v8, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r12v9, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14, types: [k37] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17, types: [k37] */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20, types: [k37] */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23, types: [k37] */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32, types: [k37] */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35, types: [k37] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v19 */
    @Override // defpackage.g94
    public final boolean t(KeyEvent keyEvent) {
        wv9 wv9Var;
        ?? Q;
        ?? k37Var;
        ?? Q2;
        ?? k37Var2;
        int size;
        int i;
        kb7 kb7Var;
        boolean z;
        ?? B;
        kb7 kb7Var2;
        if (this.d.e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            return false;
        }
        ba4 ba4VarA = fa4.a(this.c);
        if (ba4VarA != null) {
            if (!ba4VarA.t.G) {
                uc5.b("visitAncestors called on an unattached node");
            }
            ox6.c cVar = ba4VarA.t;
            qr5 qr5VarF = ew2.f(ba4VarA);
            loop0: while (true) {
                if (qr5VarF == null) {
                    B = 0;
                    break;
                }
                if ((qr5VarF.Y.f.w & 131072) != 0) {
                    while (cVar != null) {
                        if ((cVar.v & 131072) != 0) {
                            ?? k37Var3 = 0;
                            B = cVar;
                            while (B != 0) {
                                if (B instanceof wv9) {
                                    break loop0;
                                }
                                if ((B.v & 131072) != 0 && (B instanceof gw2)) {
                                    ox6.c cVar2 = ((gw2) B).I;
                                    int i2 = 0;
                                    while (cVar2 != null) {
                                        if ((cVar2.v & 131072) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                B = B;
                                                k37Var3 = k37Var3;
                                                k37Var3 = k37Var3;
                                                g2b g2bVar = g2b.a;
                                                B = cVar2;
                                            } else {
                                                if (k37Var3 == 0) {
                                                    k37Var3 = new k37(new ox6.c[16]);
                                                }
                                                if (B != 0) {
                                                    k37Var3.d(B);
                                                    B = 0;
                                                }
                                                k37Var3.d(cVar2);
                                            }
                                        } else {
                                            B = B;
                                            k37Var3 = k37Var3;
                                        }
                                        cVar2 = cVar2.y;
                                        B = B;
                                        k37Var3 = k37Var3;
                                    }
                                    if (i2 == 1) {
                                        B = B;
                                        k37Var3 = k37Var3;
                                    } else {
                                        B = B;
                                        k37Var3 = k37Var3;
                                    }
                                }
                                B = ew2.b(k37Var3);
                            }
                        }
                        cVar = cVar.x;
                    }
                }
                qr5VarF = qr5VarF.I();
                cVar = (qr5VarF == null || (kb7Var2 = qr5VarF.Y) == null) ? null : kb7Var2.e;
            }
            wv9Var = (wv9) B;
        } else {
            wv9Var = null;
        }
        if (wv9Var != null) {
            if (!wv9Var.q().G) {
                uc5.b("visitAncestors called on an unattached node");
            }
            ox6.c cVar3 = wv9Var.q().x;
            qr5 qr5VarF2 = ew2.f(wv9Var);
            ArrayList arrayList = null;
            while (qr5VarF2 != null) {
                if ((qr5VarF2.Y.f.w & 131072) != 0) {
                    while (cVar3 != null) {
                        if ((cVar3.v & 131072) != 0) {
                            ox6.c cVarB = cVar3;
                            k37 k37Var4 = null;
                            while (cVarB != null) {
                                if (cVarB instanceof wv9) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVarB);
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z && (cVarB.v & 131072) != 0 && (cVarB instanceof gw2)) {
                                    int i3 = 0;
                                    for (ox6.c cVar4 = ((gw2) cVarB).I; cVar4 != null; cVar4 = cVar4.y) {
                                        if ((cVar4.v & 131072) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                g2b g2bVar2 = g2b.a;
                                                cVarB = cVar4;
                                            } else {
                                                if (k37Var4 == null) {
                                                    k37Var4 = new k37(new ox6.c[16]);
                                                }
                                                if (cVarB != null) {
                                                    k37Var4.d(cVarB);
                                                    cVarB = null;
                                                }
                                                k37Var4.d(cVar4);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                cVarB = ew2.b(k37Var4);
                            }
                        }
                        cVar3 = cVar3.x;
                    }
                }
                qr5VarF2 = qr5VarF2.I();
                cVar3 = (qr5VarF2 == null || (kb7Var = qr5VarF2.Y) == null) ? null : kb7Var.e;
            }
            if (arrayList == null) {
                Q = wv9Var.q();
                k37Var = 0;
                while (Q != 0) {
                    if (Q instanceof wv9) {
                        if (((wv9) Q).R()) {
                        }
                    } else if ((Q.v & 131072) == 0 && (Q instanceof gw2)) {
                        ox6.c cVar5 = ((gw2) Q).I;
                        int i4 = 0;
                        while (cVar5 != null) {
                            if ((cVar5.v & 131072) != 0) {
                                i4++;
                                if (i4 == 1) {
                                    Q = Q;
                                    k37Var = k37Var;
                                    k37Var = k37Var;
                                    g2b g2bVar3 = g2b.a;
                                    Q = cVar5;
                                } else {
                                    if (k37Var == 0) {
                                        k37Var = new k37(new ox6.c[16]);
                                    }
                                    if (Q != 0) {
                                        k37Var.d(Q);
                                        Q = 0;
                                    }
                                    k37Var.d(cVar5);
                                }
                            } else {
                                Q = Q;
                                k37Var = k37Var;
                            }
                            cVar5 = cVar5.y;
                            Q = Q;
                            k37Var = k37Var;
                        }
                        if (i4 == 1) {
                            Q = Q;
                            k37Var = k37Var;
                        } else {
                            Q = Q;
                            k37Var = k37Var;
                        }
                    }
                    Q = ew2.b(k37Var);
                }
                Q2 = wv9Var.q();
                k37Var2 = 0;
                while (Q2 != 0) {
                    if (Q2 instanceof wv9) {
                        if (((wv9) Q2).s1()) {
                        }
                    } else if ((Q2.v & 131072) == 0 && (Q2 instanceof gw2)) {
                        ox6.c cVar6 = ((gw2) Q2).I;
                        int i5 = 0;
                        while (cVar6 != null) {
                            if ((cVar6.v & 131072) != 0) {
                                i5++;
                                if (i5 == 1) {
                                    Q2 = Q2;
                                    k37Var2 = k37Var2;
                                    k37Var2 = k37Var2;
                                    g2b g2bVar4 = g2b.a;
                                    Q2 = cVar6;
                                } else {
                                    if (k37Var2 == 0) {
                                        k37Var2 = new k37(new ox6.c[16]);
                                    }
                                    if (Q2 != 0) {
                                        k37Var2.d(Q2);
                                        Q2 = 0;
                                    }
                                    k37Var2.d(cVar6);
                                }
                            } else {
                                Q2 = Q2;
                                k37Var2 = k37Var2;
                            }
                            cVar6 = cVar6.y;
                            Q2 = Q2;
                            k37Var2 = k37Var2;
                        }
                        if (i5 == 1) {
                            Q2 = Q2;
                            k37Var2 = k37Var2;
                        } else {
                            Q2 = Q2;
                            k37Var2 = k37Var2;
                        }
                    }
                    Q2 = ew2.b(k37Var2);
                }
                if (arrayList != null) {
                    size = arrayList.size();
                    for (i = 0; i < size; i++) {
                        if (((wv9) arrayList.get(i)).s1()) {
                        }
                    }
                    g2b g2bVar5 = g2b.a;
                }
                g2b g2bVar6 = g2b.a;
            } else {
                int size2 = arrayList.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i6 = size2 - 1;
                        if (!((wv9) arrayList.get(size2)).R()) {
                            if (i6 < 0) {
                                break;
                            }
                            size2 = i6;
                        }
                    }
                }
                g2b g2bVar7 = g2b.a;
                Q = wv9Var.q();
                k37Var = 0;
                while (Q != 0) {
                    if (Q instanceof wv9) {
                        if (((wv9) Q).R()) {
                        }
                    } else if ((Q.v & 131072) == 0) {
                    }
                    Q = ew2.b(k37Var);
                }
                Q2 = wv9Var.q();
                k37Var2 = 0;
                while (Q2 != 0) {
                    if (Q2 instanceof wv9) {
                        if (((wv9) Q2).s1()) {
                        }
                    } else if ((Q2.v & 131072) == 0) {
                    }
                    Q2 = ew2.b(k37Var2);
                }
                if (arrayList != null) {
                    size = arrayList.size();
                    while (i < size) {
                        if (((wv9) arrayList.get(i)).s1()) {
                        }
                    }
                    g2b g2bVar8 = g2b.a;
                }
                g2b g2bVar9 = g2b.a;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.g94
    public final void u() {
        ia.a(this.c, true);
        if (v() != null) {
            ba4 ba4VarV = v();
            h(null);
            if (ba4VarV != null) {
                ba4VarV.d2(w94.t, w94.w);
            }
        }
    }

    @Override // defpackage.g94
    public final ba4 v() {
        ba4 ba4Var = this.h;
        if (ba4Var == null || !ba4Var.G) {
            return null;
        }
        return ba4Var;
    }

    @Override // defpackage.d94
    public final void w(boolean z) {
        p(8, z, true);
    }

    public final boolean x(boolean z) {
        kb7 kb7Var;
        if (v() != null) {
            ba4 ba4VarV = v();
            h(null);
            if (ba4VarV != null) {
                w94 w94Var = w94.t;
                w94 w94Var2 = w94.w;
                ba4VarV.d2(w94Var, w94Var2);
                if (!ba4VarV.t.G) {
                    uc5.b("visitAncestors called on an unattached node");
                }
                ox6.c cVar = ba4VarV.t.x;
                qr5 qr5VarF = ew2.f(ba4VarV);
                while (qr5VarF != null) {
                    if ((qr5VarF.Y.f.w & 1024) != 0) {
                        while (cVar != null) {
                            if ((cVar.v & 1024) != 0) {
                                ox6.c cVarB = cVar;
                                k37 k37Var = null;
                                while (cVarB != null) {
                                    if (cVarB instanceof ba4) {
                                        ((ba4) cVarB).d2(w94.u, w94Var2);
                                    } else if ((cVarB.v & 1024) != 0 && (cVarB instanceof gw2)) {
                                        int i = 0;
                                        for (ox6.c cVar2 = ((gw2) cVarB).I; cVar2 != null; cVar2 = cVar2.y) {
                                            if ((cVar2.v & 1024) != 0) {
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
            }
        }
        return true;
    }

    public final void y() {
        cm cmVar = this.a;
        if (cmVar.isFocused() || cmVar.hasFocus()) {
            cmVar.clearFocus();
        } else if (cmVar.hasFocus()) {
            View viewFindFocus = cmVar.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            cmVar.clearFocus();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean z(KeyEvent keyEvent) {
        int iNumberOfTrailingZeros;
        int i;
        long j;
        int iNumberOfTrailingZeros2;
        int i2;
        long[] jArr;
        int i3;
        boolean z;
        long jA = db7.a(keyEvent);
        int iB = db7.b(keyEvent);
        int i4 = -862048943;
        long j2 = 0;
        char c2 = '\b';
        int i5 = 0;
        int i6 = 1;
        if (iB != 2) {
            if (iB != 1) {
                return true;
            }
            o27 o27Var = this.f;
            if (o27Var == null || !o27Var.a(jA)) {
                return false;
            }
            o27 o27Var2 = this.f;
            if (o27Var2 != null) {
                int iHashCode = Long.hashCode(jA) * (-862048943);
                int i7 = iHashCode ^ (iHashCode << 16);
                int i8 = i7 & 127;
                int i9 = o27Var2.c;
                int i10 = i7 >>> 7;
                loop5: while (true) {
                    int i11 = i10 & i9;
                    long[] jArr2 = o27Var2.a;
                    int i12 = i11 >> 3;
                    int i13 = (i11 & 7) << 3;
                    long j3 = ((jArr2[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr2[i12] >>> i13);
                    long j4 = (((long) i8) * 72340172838076673L) ^ j3;
                    for (long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                        iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i11) & i9;
                        if (o27Var2.b[iNumberOfTrailingZeros] == jA) {
                            break loop5;
                        }
                    }
                    if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                        iNumberOfTrailingZeros = -1;
                        break;
                    }
                    i5 += 8;
                    i10 = i11 + i5;
                }
                if (iNumberOfTrailingZeros >= 0) {
                    o27Var2.d--;
                    long[] jArr3 = o27Var2.a;
                    int i14 = o27Var2.c;
                    int i15 = iNumberOfTrailingZeros >> 3;
                    int i16 = (iNumberOfTrailingZeros & 7) << 3;
                    long j6 = (jArr3[i15] & (~(255 << i16))) | (254 << i16);
                    jArr3[i15] = j6;
                    jArr3[(((iNumberOfTrailingZeros - 7) & i14) + (i14 & 7)) >> 3] = j6;
                    return true;
                }
            }
            return true;
        }
        o27 o27Var3 = this.f;
        if (o27Var3 == null) {
            o27Var3 = new o27(3);
            this.f = o27Var3;
        }
        o27 o27Var4 = o27Var3;
        int iHashCode2 = Long.hashCode(jA) * (-862048943);
        int i17 = iHashCode2 ^ (iHashCode2 << 16);
        int i18 = i17 >>> 7;
        int i19 = i17 & 127;
        int i20 = o27Var4.c;
        int i21 = i18 & i20;
        int i22 = 0;
        loop0: while (true) {
            long[] jArr4 = o27Var4.a;
            int i23 = i21 >> 3;
            int i24 = (i21 & 7) << 3;
            long j7 = (jArr4[i23] >>> i24) | ((jArr4[i23 + 1] << (64 - i24)) & ((-i24) >> 63));
            int i25 = i4;
            long j8 = i19;
            long j9 = j7 ^ (j8 * 72340172838076673L);
            long j10 = (j9 - 72340172838076673L) & (~j9) & (-9187201950435737472L);
            while (j10 != j2) {
                iNumberOfTrailingZeros2 = (i21 + (Long.numberOfTrailingZeros(j10) >> 3)) & i20;
                long j11 = j2;
                if (o27Var4.b[iNumberOfTrailingZeros2] == jA) {
                    z = 1;
                    break loop0;
                }
                j10 &= j10 - 1;
                j2 = j11;
            }
            long j12 = j2;
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != j12) {
                int iB2 = o27Var4.b(i18);
                if (o27Var4.e != 0 || ((o27Var4.a[iB2 >> 3] >> ((iB2 & 7) << 3)) & 255) == 254) {
                    i = 1;
                    j = 128;
                } else {
                    int i26 = o27Var4.c;
                    if (i26 <= 8 || Long.compare((((long) o27Var4.d) * 32) ^ Long.MIN_VALUE, (((long) i26) * 25) ^ Long.MIN_VALUE) > 0) {
                        i2 = 1;
                        j = 128;
                        int iC = z39.c(o27Var4.c);
                        long[] jArr5 = o27Var4.a;
                        long[] jArr6 = o27Var4.b;
                        int i27 = o27Var4.c;
                        o27Var4.c(iC);
                        long[] jArr7 = o27Var4.a;
                        long[] jArr8 = o27Var4.b;
                        int i28 = o27Var4.c;
                        int i29 = 0;
                        while (i29 < i27) {
                            if (((jArr5[i29 >> 3] >> ((i29 & 7) << 3)) & 255) < 128) {
                                long j13 = jArr6[i29];
                                int iHashCode3 = Long.hashCode(j13) * i25;
                                int i30 = iHashCode3 ^ (iHashCode3 << 16);
                                int iB3 = o27Var4.b(i30 >>> 7);
                                jArr = jArr7;
                                int i31 = iB3 >> 3;
                                int i32 = (iB3 & 7) << 3;
                                long j14 = (jArr[i31] & (~(255 << i32))) | (((long) (i30 & 127)) << i32);
                                jArr[i31] = j14;
                                jArr[(((iB3 - 7) & i28) + (i28 & 7)) >> 3] = j14;
                                jArr8[iB3] = j13;
                            } else {
                                jArr = jArr7;
                            }
                            i29++;
                            jArr5 = jArr5;
                            jArr7 = jArr;
                            jArr6 = jArr6;
                            i2 = i2;
                        }
                    } else {
                        long[] jArr9 = o27Var4.a;
                        int i33 = o27Var4.c;
                        long[] jArr10 = o27Var4.b;
                        int i34 = (i33 + 7) >> 3;
                        int i35 = 0;
                        while (i35 < i34) {
                            long j15 = jArr9[i35] & (-9187201950435737472L);
                            jArr9[i35] = ((~j15) + (j15 >>> 7)) & (-72340172838076674L);
                            i35++;
                            c2 = c2;
                            i33 = i33;
                        }
                        char c3 = c2;
                        int i36 = i33;
                        j = 128;
                        int iY = u30.y(jArr9);
                        int i37 = iY - 1;
                        long j16 = 72057594037927935L;
                        jArr9[i37] = (jArr9[i37] & 72057594037927935L) | (-72057594037927936L);
                        jArr9[iY] = jArr9[0];
                        int i38 = i36;
                        int i39 = 0;
                        while (i39 != i38) {
                            int i40 = i39 >> 3;
                            int i41 = (i39 & 7) << 3;
                            long j17 = (jArr9[i40] >> i41) & 255;
                            if (j17 != 128 && j17 == 254) {
                                int iHashCode4 = Long.hashCode(jArr10[i39]) * i25;
                                int i42 = iHashCode4 ^ (iHashCode4 << 16);
                                long j18 = j16;
                                int i43 = i42 >>> 7;
                                int iB4 = o27Var4.b(i43);
                                int i44 = i43 & i38;
                                char c4 = c3;
                                if (((iB4 - i44) & i38) / 8 == ((i39 - i44) & i38) / 8) {
                                    int i45 = i6;
                                    jArr9[i40] = (jArr9[i40] & (~(255 << i41))) | (((long) (i42 & 127)) << i41);
                                    jArr9[jArr9.length - i45] = (jArr9[0] & j18) | Long.MIN_VALUE;
                                    i39++;
                                    i6 = i45;
                                    j16 = j18;
                                    c3 = c4;
                                } else {
                                    int i46 = i6;
                                    int i47 = iB4 >> 3;
                                    long j19 = jArr9[i47];
                                    int i48 = (iB4 & 7) << 3;
                                    if (((j19 >> i48) & 255) == 128) {
                                        int i49 = i39;
                                        jArr9[i47] = (j19 & (~(255 << i48))) | (((long) (i42 & 127)) << i48);
                                        jArr9[i40] = (jArr9[i40] & (~(255 << i41))) | (128 << i41);
                                        jArr10[iB4] = jArr10[i49];
                                        jArr10[i49] = j12;
                                        i3 = i49;
                                    } else {
                                        int i50 = i39;
                                        jArr9[i47] = (j19 & (~(255 << i48))) | (((long) (i42 & 127)) << i48);
                                        long j20 = jArr10[iB4];
                                        jArr10[iB4] = jArr10[i50];
                                        jArr10[i50] = j20;
                                        i3 = i50 - 1;
                                    }
                                    jArr9[jArr9.length - i46] = (jArr9[0] & j18) | Long.MIN_VALUE;
                                    i39 = i3 + i46;
                                    i6 = i46;
                                    j16 = j18;
                                    c3 = c4;
                                    i38 = i38;
                                }
                            } else {
                                i39++;
                            }
                        }
                        i2 = i6;
                        o27Var4.e = z39.a(o27Var4.c) - o27Var4.d;
                    }
                    i = i2;
                    iB2 = o27Var4.b(i18);
                }
                iNumberOfTrailingZeros2 = iB2;
                o27Var4.d++;
                int i51 = o27Var4.e;
                long[] jArr11 = o27Var4.a;
                int i52 = iNumberOfTrailingZeros2 >> 3;
                long j21 = jArr11[i52];
                int i53 = (iNumberOfTrailingZeros2 & 7) << 3;
                o27Var4.e = i51 - (((j21 >> i53) & 255) == j ? i == true ? 1 : 0 : 0);
                int i54 = o27Var4.c;
                long j22 = (j21 & (~(255 << i53))) | (j8 << i53);
                jArr11[i52] = j22;
                jArr11[(((iNumberOfTrailingZeros2 - 7) & i54) + (i54 & 7)) >> 3] = j22;
                z = i;
                break;
            }
            i22 += 8;
            i21 = (i21 + i22) & i20;
            i4 = i25;
            j2 = j12;
        }
        o27Var4.b[iNumberOfTrailingZeros2] = jA;
        return z;
    }
}
