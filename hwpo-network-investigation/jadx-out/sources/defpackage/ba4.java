package defpackage;

import android.os.Trace;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ba4 extends ox6.c implements ju1, nq5, aa4, rf7, sx6 {
    public final boolean H;
    public final ci4<v94, v94, g2b> I;
    public boolean J;
    public boolean K;
    public final int L;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends vx6<ba4> {
        public static final a t = new a();

        private a() {
        }

        @Override // defpackage.vx6
        public final ox6.c a() {
            return new ba4(0, null, 15);
        }

        @Override // defpackage.vx6
        public final /* bridge */ /* synthetic */ void b(ox6.c cVar) {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return 1739042953;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends wp5 implements mh4<g2b> {
        public final /* synthetic */ gl8<k94> u;
        public final /* synthetic */ ba4 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(gl8<k94> gl8Var, ba4 ba4Var) {
            super(0);
            this.u = gl8Var;
            this.v = ba4Var;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, n94] */
        @Override // defpackage.mh4
        public final g2b invoke() {
            this.u.t = this.v.e2();
            return g2b.a;
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
            return Boolean.valueOf(ba4Var.c2(this.u));
        }
    }

    public ba4() {
        throw null;
    }

    public ba4(int i, ci4 ci4Var, int i2) {
        i = (i2 & 1) != 0 ? 1 : i;
        boolean z = (i2 & 2) == 0;
        ci4Var = (i2 & 4) != 0 ? null : ci4Var;
        this.H = z;
        this.I = ci4Var;
        this.L = i;
    }

    @Override // ox6.c
    public final boolean R1() {
        return false;
    }

    @Override // ox6.c
    public final void V1() {
        int iOrdinal = a0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                g94 focusOwner = ew2.g(this).getFocusOwner();
                ba4 ba4VarA = fa4.a(this);
                if (ba4VarA == null || !ba4VarA.H) {
                    return;
                }
                focusOwner.i();
                focusOwner.a();
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                u.b();
                return;
            }
        }
        g94 focusOwner2 = ew2.g(this).getFocusOwner();
        focusOwner2.p(8, true, false);
        if (this.H) {
            focusOwner2.i();
        }
        focusOwner2.a();
    }

    @Override // ox6.c
    public final void W1() {
        if (a0().e()) {
            ew2.g(this).getFocusOwner().p(8, true, true);
        }
    }

    public final boolean c2(int i) {
        int iOrdinal = ia.d(this, i).ordinal();
        if (iOrdinal == 0) {
            return ia.e(this);
        }
        if (iOrdinal == 1) {
            return false;
        }
        if (iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        u.b();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [k37] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [k37] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void d2(w94 w94Var, w94 w94Var2) {
        kb7 kb7Var;
        ci4<v94, v94, g2b> ci4Var;
        g94 focusOwner = ew2.g(this).getFocusOwner();
        ba4 ba4VarV = focusOwner.v();
        if (!w94Var.equals(w94Var2) && (ci4Var = this.I) != null) {
            ci4Var.invoke(w94Var, w94Var2);
        }
        ox6.c cVar = this.t;
        if (!cVar.G) {
            uc5.b("visitAncestors called on an unattached node");
        }
        ox6.c cVar2 = this.t;
        qr5 qr5VarF = ew2.f(this);
        while (qr5VarF != null) {
            if ((qr5VarF.Y.f.w & 5120) != 0) {
                while (cVar2 != null) {
                    int i = cVar2.v;
                    if ((i & 5120) != 0) {
                        if (cVar2 != cVar && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            ?? B = cVar2;
                            ?? k37Var = 0;
                            while (B != 0) {
                                if (B instanceof q84) {
                                    q84 q84Var = (q84) B;
                                    if (ba4VarV == focusOwner.v()) {
                                        q84Var.m0(w94Var2);
                                    }
                                } else if ((B.v & 4096) != 0 && (B instanceof gw2)) {
                                    ox6.c cVar3 = ((gw2) B).I;
                                    int i2 = 0;
                                    B = B;
                                    k37Var = k37Var;
                                    while (cVar3 != null) {
                                        if ((cVar3.v & 4096) != 0) {
                                            i2++;
                                            if (i2 == 1) {
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
                                        }
                                        cVar3 = cVar3.y;
                                        B = B;
                                        k37Var = k37Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                B = ew2.b(k37Var);
                            }
                        }
                    }
                    cVar2 = cVar2.x;
                }
            }
            qr5VarF = qr5VarF.I();
            cVar2 = (qr5VarF == null || (kb7Var = qr5VarF.Y) == null) ? null : kb7Var.e;
        }
    }

    @Override // defpackage.rf7
    public final void e1() {
        i2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [k37] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [k37] */
    /* JADX WARN: Type inference failed for: r8v4 */
    public final n94 e2() {
        boolean z;
        kb7 kb7Var;
        n94 n94Var = new n94();
        n94Var.a = true;
        p94 p94Var = p94.b;
        n94Var.b = p94Var;
        n94Var.c = p94Var;
        n94Var.d = p94Var;
        n94Var.e = p94Var;
        n94Var.f = p94Var;
        n94Var.g = p94Var;
        n94Var.h = p94Var;
        n94Var.i = p94Var;
        n94Var.j = l94.v;
        n94Var.k = m94.v;
        n94Var.l = k94.a.a;
        int i = this.L;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((rd5) ku1.a(this, qu1.m)).a() == 1);
        } else {
            if (i != 2) {
                aa0.c("Unknown Focusability");
                return null;
            }
            z = false;
        }
        n94Var.a = z;
        ox6.c cVar = this.t;
        if (!cVar.G) {
            uc5.b("visitAncestors called on an unattached node");
        }
        ox6.c cVar2 = this.t;
        qr5 qr5VarF = ew2.f(this);
        loop0: while (qr5VarF != null) {
            if ((qr5VarF.Y.f.w & 3072) != 0) {
                while (cVar2 != null) {
                    int i2 = cVar2.v;
                    if ((i2 & 3072) != 0) {
                        if (cVar2 != cVar && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0) {
                            ?? k37Var = 0;
                            ?? B = cVar2;
                            while (B != 0) {
                                if (B instanceof o94) {
                                    ((o94) B).k0(n94Var);
                                } else if ((B.v & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 && (B instanceof gw2)) {
                                    ox6.c cVar3 = ((gw2) B).I;
                                    int i3 = 0;
                                    while (cVar3 != null) {
                                        if ((cVar3.v & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0) {
                                            i3++;
                                            if (i3 == 1) {
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
                                    if (i3 == 1) {
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
                    cVar2 = cVar2.x;
                }
            }
            qr5VarF = qr5VarF.I();
            cVar2 = (qr5VarF == null || (kb7Var = qr5VarF.Y) == null) ? null : kb7Var.e;
        }
        return n94Var;
    }

    public final sk8 f2(qq5 qq5Var) {
        sk8 sk8Var = e2().l;
        if (sk8Var != k94.a.a) {
            return qq5Var == null ? sk8Var : sk8Var.i(qq5Var.U(ew2.e(this), 0L));
        }
        return qq5Var != null ? qq5Var.Z(ew2.e(this), false) : tk8.a(0L, c43.c(ew2.e(this).v));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v9, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final lp0 g2() {
        kb7 kb7Var;
        ?? r0;
        ?? r4;
        if (!this.t.G) {
            uc5.b("visitAncestors called on an unattached node");
        }
        ox6.c cVar = this.t.x;
        qr5 qr5VarF = ew2.f(this);
        loop0: while (qr5VarF != null) {
            if ((qr5VarF.Y.f.w & 8388640) != 0) {
                while (r0 != 0) {
                    int i = r0.v;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (!(r0 instanceof op0)) {
                                if (r0 instanceof gw2) {
                                    ox6.c cVar2 = ((gw2) r0).I;
                                    r0 = 0;
                                    while (cVar2 != null) {
                                        if (cVar2 instanceof op0) {
                                            r0 = cVar2;
                                        }
                                        cVar2 = cVar2.y;
                                        r0 = r0;
                                    }
                                } else {
                                    r0 = 0;
                                }
                            }
                            op0 op0Var = (op0) r0;
                            if (op0Var == null) {
                                break loop0;
                            }
                            return op0Var.a1();
                        }
                        if ((i & 32) == 0) {
                            continue;
                        } else {
                            if (r0 instanceof sx6) {
                                r4 = r0;
                            } else if (r0 instanceof gw2) {
                                ox6.c cVar3 = ((gw2) r0).I;
                                r4 = 0;
                                while (cVar3 != null) {
                                    if (cVar3 instanceof sx6) {
                                        r4 = cVar3;
                                    }
                                    cVar3 = cVar3.y;
                                    r4 = r4;
                                }
                            } else {
                                r4 = 0;
                            }
                            sx6 sx6Var = (sx6) r4;
                            if (sx6Var != null && sx6Var.M0().A0(mp0.a)) {
                                return (lp0) sx6Var.M0().H0();
                            }
                        }
                    }
                    r0 = r0.x;
                }
            }
            r0 = cVar;
            qr5VarF = qr5VarF.I();
            cVar = (qr5VarF == null || (kb7Var = qr5VarF.Y) == null) ? null : kb7Var.e;
        }
        return null;
    }

    @Override // defpackage.aa4
    /* JADX INFO: renamed from: h2, reason: merged with bridge method [inline-methods] */
    public final w94 a0() {
        g94 focusOwner;
        ba4 ba4VarV;
        kb7 kb7Var;
        boolean z = this.G;
        w94 w94Var = w94.w;
        if (!z || (ba4VarV = (focusOwner = ew2.g(this).getFocusOwner()).v()) == null) {
            return w94Var;
        }
        if (this == ba4VarV) {
            return focusOwner.e() ? w94.v : w94.t;
        }
        if (ba4VarV.G) {
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
                                    if (this == ((ba4) cVarB)) {
                                        return w94.u;
                                    }
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
        return w94Var;
    }

    public final void i2() {
        int iOrdinal = a0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                u.b();
                return;
            }
        }
        gl8 gl8Var = new gl8();
        sf7.a(this, new b(gl8Var, this));
        T t = gl8Var.t;
        if (t == 0) {
            xj5.e("focusProperties");
            throw null;
        }
        if (((k94) t).a()) {
            return;
        }
        ew2.g(this).getFocusOwner().w(true);
    }

    @Override // defpackage.aa4
    public final boolean y(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return e2().a ? c2(i) : bza.e(this, i, new c(i));
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.nq5
    public final void F(qq5 qq5Var) {
    }
}
