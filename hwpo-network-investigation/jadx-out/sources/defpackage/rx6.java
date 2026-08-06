package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rx6 {
    public final cm a;
    public final k37<qi0> b = new k37<>(new qi0[16]);
    public final k37<px6<?>> c = new k37<>(new px6[16]);
    public final k37<qr5> d = new k37<>(new qr5[16]);
    public final k37<px6<?>> e = new k37<>(new px6[16]);
    public boolean f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements mh4<g2b> {
        public a() {
            super(0);
        }

        @Override // defpackage.mh4
        public final g2b invoke() {
            rx6 rx6Var = rx6.this;
            k37<px6<?>> k37Var = rx6Var.c;
            k37<qi0> k37Var2 = rx6Var.b;
            k37<px6<?>> k37Var3 = rx6Var.e;
            rx6Var.f = false;
            HashSet hashSet = new HashSet();
            k37<qr5> k37Var4 = rx6Var.d;
            qr5[] qr5VarArr = k37Var4.t;
            int i = k37Var4.v;
            for (int i2 = 0; i2 < i; i2++) {
                qr5 qr5Var = qr5VarArr[i2];
                px6<?> px6Var = k37Var3.t[i2];
                ox6.c cVar = qr5Var.Y.f;
                if (cVar.G) {
                    rx6.b(cVar, px6Var, hashSet);
                }
            }
            k37Var4.k();
            k37Var3.k();
            qi0[] qi0VarArr = k37Var2.t;
            int i3 = k37Var2.v;
            for (int i4 = 0; i4 < i3; i4++) {
                qi0 qi0Var = qi0VarArr[i4];
                px6<?> px6Var2 = k37Var.t[i4];
                if (qi0Var.G) {
                    rx6.b(qi0Var, px6Var2, hashSet);
                }
            }
            k37Var2.k();
            k37Var.k();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((qi0) it.next()).e2();
            }
            return g2b.a;
        }
    }

    public rx6(cm cmVar) {
        this.a = cmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
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
    /* JADX WARN: Type inference failed for: r6v9 */
    public static void b(ox6.c cVar, px6 px6Var, HashSet hashSet) {
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
            if ((cVar4.w & 32) != 0) {
                ox6.c cVar5 = cVar4;
                while (true) {
                    if (cVar5 != null && cVar5.G) {
                        if ((cVar5.v & 32) != 0) {
                            ?? B = cVar5;
                            ?? k37Var2 = 0;
                            while (B != 0) {
                                if (B instanceof sx6) {
                                    sx6 sx6Var = (sx6) B;
                                    if (sx6Var instanceof qi0) {
                                        qi0 qi0Var = (qi0) sx6Var;
                                        if ((qi0Var.H instanceof qx6) && qi0Var.K.contains(px6Var)) {
                                            hashSet.add(sx6Var);
                                        }
                                    }
                                    if (sx6Var.M0().A0(px6Var)) {
                                        break;
                                    }
                                } else if ((B.v & 32) != 0 && (B instanceof gw2)) {
                                    ox6.c cVar6 = ((gw2) B).I;
                                    int i2 = 0;
                                    B = B;
                                    k37Var2 = k37Var2;
                                    while (cVar6 != null) {
                                        if ((cVar6.v & 32) != 0) {
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

    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.a.m(new a());
    }
}
