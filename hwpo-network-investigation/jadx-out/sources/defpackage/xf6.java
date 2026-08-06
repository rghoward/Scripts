package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xf6 extends ox6.c implements bn4, a73, qb9, rf7 {
    public oh4<? super tx2, vf7> H;
    public oh4<? super c53, g2b> I;
    public float J;
    public boolean K;
    public long L;
    public float M;
    public float N;
    public boolean O;
    public y08 P;
    public View Q;
    public tx2 R;
    public x08 S;
    public final dt7 T;
    public my2 U;
    public long V;
    public kg5 W;
    public zx0 X;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.MagnifierNode$onAttach$1", f = "Magnifier.android.kt", l = {382, 386}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;

        public a(r02<? super a> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return xf6.this.new a(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) throws Throwable {
            ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
            return v72.t;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0020  */
        /* JADX WARN: Code duplicated, block: B:13:0x0024  */
        /* JADX WARN: Code duplicated, block: B:16:0x002d  */
        /* JADX WARN: Code duplicated, block: B:18:0x0031  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x002f -> B:11:0x0020). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004a -> B:21:0x004d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.ak0
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                int r0 = r7.t
                r1 = 2
                r2 = 1
                xf6 r3 = defpackage.xf6.this
                v72 r4 = defpackage.v72.t
                if (r0 == 0) goto L1d
                if (r0 == r2) goto L19
                if (r0 != r1) goto L12
                defpackage.dv8.b(r8)
                goto L4d
            L12:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r7)
                r7 = 0
                return r7
            L19:
                defpackage.dv8.b(r8)
                goto L2d
            L1d:
                defpackage.dv8.b(r8)
            L20:
                zx0 r8 = r3.X
                if (r8 == 0) goto L2d
                r7.t = r2
                java.lang.Object r8 = defpackage.zx0.K(r8, r7)
                if (r8 != r4) goto L2d
                goto L4c
            L2d:
                x08 r8 = r3.S
                if (r8 == 0) goto L20
                wf6 r8 = new wf6
                r8.<init>()
                r7.t = r1
                h72 r0 = r7.getContext()
                xx6 r0 = defpackage.zx6.a(r0)
                yx6 r5 = new yx6
                r6 = 0
                r5.<init>(r6, r8)
                java.lang.Object r8 = r0.u(r5, r7)
                if (r8 != r4) goto L4d
            L4c:
                return r4
            L4d:
                x08 r8 = r3.S
                if (r8 == 0) goto L20
                r8.b()
                goto L20
            */
            throw new UnsupportedOperationException("Method not decompiled: xf6.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public xf6() {
        throw null;
    }

    public xf6(xn6 xn6Var, zga zgaVar, float f, boolean z, long j, float f2, float f3, boolean z2, y08 y08Var) {
        this.H = xn6Var;
        this.I = zgaVar;
        this.J = f;
        this.K = z;
        this.L = j;
        this.M = f2;
        this.N = f3;
        this.O = z2;
        this.P = y08Var;
        this.T = new dt7(null, ha7.u);
        this.V = 9205357640488583168L;
    }

    @Override // defpackage.qb9
    public final void E1(hc9 hc9Var) {
        hc9Var.d(yf6.a, new vf6(this, 0));
    }

    @Override // defpackage.bn4
    public final void Q0(mb7 mb7Var) {
        this.T.setValue(mb7Var);
    }

    @Override // ox6.c
    public final void U1() {
        e1();
        this.X = da1.a(0, 7, null);
        oy0.d(Q1(), null, x72.w, new a(null), 1);
    }

    @Override // ox6.c
    public final void V1() {
        x08 x08Var = this.S;
        if (x08Var != null) {
            x08Var.dismiss();
        }
        this.S = null;
    }

    public final long c2() {
        if (this.U == null) {
            this.U = bl7.f(new l24(1, this));
        }
        my2 my2Var = this.U;
        if (my2Var != null) {
            return ((vf7) my2Var.getValue()).a;
        }
        return 9205357640488583168L;
    }

    public final void d2() {
        x08 x08Var = this.S;
        if (x08Var != null) {
            x08Var.dismiss();
        }
        View viewA = this.Q;
        if (viewA == null) {
            viewA = fw2.a(this);
        }
        View view = viewA;
        this.Q = view;
        tx2 tx2Var = this.R;
        if (tx2Var == null) {
            tx2Var = ew2.f(this).R;
        }
        tx2 tx2Var2 = tx2Var;
        this.R = tx2Var2;
        this.S = this.P.b(view, this.K, this.L, this.M, this.N, this.O, tx2Var2, this.J);
        f2();
    }

    @Override // defpackage.rf7
    public final void e1() {
        sf7.a(this, new uf6(this, 0));
    }

    public final void e2() {
        tx2 tx2Var = this.R;
        if (tx2Var == null) {
            tx2Var = ew2.f(this).R;
            this.R = tx2Var;
        }
        long j = this.H.invoke(tx2Var).a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & c2()) == 9205357640488583168L) {
            this.V = 9205357640488583168L;
            x08 x08Var = this.S;
            if (x08Var != null) {
                x08Var.dismiss();
                return;
            }
            return;
        }
        this.V = vf7.e(c2(), j);
        if (this.S == null) {
            d2();
        }
        x08 x08Var2 = this.S;
        if (x08Var2 != null) {
            x08Var2.c(this.J, this.V, 9205357640488583168L);
        }
        f2();
    }

    public final void f2() {
        tx2 tx2Var;
        x08 x08Var = this.S;
        if (x08Var == null || (tx2Var = this.R) == null || kg5.a(x08Var.a(), this.W)) {
            return;
        }
        oh4<? super c53, g2b> oh4Var = this.I;
        if (oh4Var != null) {
            oh4Var.invoke(new c53(tx2Var.P(c43.c(x08Var.a()))));
        }
        this.W = new kg5(x08Var.a());
    }

    @Override // defpackage.a73
    public final void t(tr5 tr5Var) {
        tr5Var.K1();
        zx0 zx0Var = this.X;
        if (zx0Var != null) {
            zx0Var.n(g2b.a);
        }
    }
}
