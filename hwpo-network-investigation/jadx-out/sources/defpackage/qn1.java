package defpackage;

import com.hwpo_training_app.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qn1 extends dl0<ko1, a> {
    public static final /* synthetic */ int a0 = 0;
    public final ci8 A;
    public final fb B;
    public final jb C;
    public final et8 D;
    public final hn8 E;
    public final mz9 F;
    public final r31 G;
    public final jx2 H;
    public final hx2 I;
    public final zd1 J;
    public final uk4 K;
    public final dm9 L;
    public final vb1 M;
    public final k55 N;
    public final xy3 O;
    public final bu8 P;
    public final cm3 Q;
    public final am1.b R;
    public Long S;
    public h5b T;
    public final pk1 U;
    public final yq6 V;
    public final yq6 W;
    public final yq6 X;
    public final yq6 Y;
    public final yq6 Z;
    public final hy8 x;
    public final t72 y;
    public final hu3 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class a implements bl0 {

        /* JADX INFO: renamed from: qn1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0227a extends a {
            public final ld5 a;

            public C0227a(ld5 ld5Var) {
                this.a = ld5Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0227a) && this.a.equals(((C0227a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "ChangeInputViewState(inputFieldViewState=" + this.a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class b extends a {
            public final ArrayList a;

            public b(ArrayList arrayList) {
                this.a = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a.equals(((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ml.a("CommentsLoaded(comments=", this.a, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class c extends a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 638838591;
            }

            public final String toString() {
                return "HidePlaceHolder";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class d extends a {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 622776478;
            }

            public final String toString() {
                return "LoadingError";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class e extends a {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 1100624412;
            }

            public final String toString() {
                return "LoadingFinished";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class f extends a {
            public static final f a = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 1069543831;
            }

            public final String toString() {
                return "LoadingStarted";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class g extends a {
            public final String a;

            public g(String str) {
                str.getClass();
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && xj5.a(this.a, ((g) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return sk0.c("MessageTextChanged(messageText=", this.a, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class h extends a {
            public static final h a = new h();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public final int hashCode() {
                return 2052137325;
            }

            public final String toString() {
                return "ShowNoResultsPlaceHolder";
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements oh4<Object, Boolean> {
        public static final b t = new b();

        @Override // defpackage.oh4
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof sk1.a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements oh4<Object, Boolean> {
        public static final c t = new c();

        @Override // defpackage.oh4
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof w60.c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.comments.presentation.CommentsViewModel$onCleared$1", f = "CommentsViewModel.kt", l = {509, 509}, m = "invokeSuspend", v = 2)
    public static final class d extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final /* synthetic */ class a extends wa implements ci4<Throwable, r02<? super g2b>, Object> {
            @Override // defpackage.ci4
            public final Object invoke(Throwable th, r02<? super g2b> r02Var) {
                ((rma.a) this.receiver).b(th);
                return g2b.a;
            }
        }

        public d(r02<? super d> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return qn1.this.new d(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((d) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        
            if (defpackage.yd3.a((defpackage.xd3) r12, r4, r11) == r3) goto L15;
         */
        @Override // defpackage.ak0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                int r0 = r11.t
                r1 = 2
                r2 = 1
                v72 r3 = defpackage.v72.t
                if (r0 == 0) goto L1b
                if (r0 == r2) goto L17
                if (r0 != r1) goto L10
                defpackage.dv8.b(r12)
                goto L4a
            L10:
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r11)
                r11 = 0
                return r11
            L17:
                defpackage.dv8.b(r12)
                goto L30
            L1b:
                defpackage.dv8.b(r12)
                qn1 r12 = defpackage.qn1.this
                zd1 r12 = r12.J
                g2b r0 = defpackage.g2b.a
                r11.t = r2
                r12.getClass()
                java.lang.Object r12 = defpackage.g5b.b(r12, r0, r11)
                if (r12 != r3) goto L30
                goto L49
            L30:
                xd3 r12 = (defpackage.xd3) r12
                qn1$d$a r4 = new qn1$d$a
                rma$a r6 = defpackage.rma.a
                java.lang.String r9 = "e(Ljava/lang/Throwable;)V"
                r10 = 4
                r5 = 2
                java.lang.Class<rma$a> r7 = rma.a.class
                java.lang.String r8 = "e"
                r4.<init>(r5, r6, r7, r8, r9, r10)
                r11.t = r1
                java.lang.Object r11 = defpackage.yd3.a(r12, r4, r11)
                if (r11 != r3) goto L4a
            L49:
                return r3
            L4a:
                g2b r11 = defpackage.g2b.a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: qn1.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn1(hy8 hy8Var, t72 t72Var, hu3 hu3Var, xe7 xe7Var, ci8 ci8Var, fb fbVar, jb jbVar, et8 et8Var, hn8 hn8Var, we7 we7Var, mz9 mz9Var, r31 r31Var, jx2 jx2Var, hx2 hx2Var, zd1 zd1Var, uk4 uk4Var, dm9 dm9Var, vb1 vb1Var, k55 k55Var, xy3 xy3Var, bu8 bu8Var, cm3 cm3Var, q09 q09Var) {
        pk1 aVar;
        super(new ko1(0));
        hy8Var.getClass();
        t72Var.getClass();
        hu3Var.getClass();
        xe7Var.getClass();
        ci8Var.getClass();
        fbVar.getClass();
        jbVar.getClass();
        et8Var.getClass();
        hn8Var.getClass();
        we7Var.getClass();
        mz9Var.getClass();
        r31Var.getClass();
        jx2Var.getClass();
        hx2Var.getClass();
        zd1Var.getClass();
        uk4Var.getClass();
        dm9Var.getClass();
        vb1Var.getClass();
        k55Var.getClass();
        xy3Var.getClass();
        bu8Var.getClass();
        cm3Var.getClass();
        q09Var.getClass();
        int i = 0;
        this.x = hy8Var;
        this.y = t72Var;
        this.z = hu3Var;
        this.A = ci8Var;
        this.B = fbVar;
        this.C = jbVar;
        this.D = et8Var;
        this.E = hn8Var;
        this.F = mz9Var;
        this.G = r31Var;
        this.H = jx2Var;
        this.I = hx2Var;
        this.J = zd1Var;
        this.K = uk4Var;
        this.L = dm9Var;
        this.M = vb1Var;
        this.N = k55Var;
        this.O = xy3Var;
        this.P = bu8Var;
        this.Q = cm3Var;
        Object objA = q09Var.a("comments_params");
        if (objA == null) {
            z90.a("Required value was null.");
            throw null;
        }
        am1.b bVar = (am1.b) objA;
        this.R = bVar;
        if (bVar instanceof am1.b.a) {
            aVar = new pk1.b(((am1.b.a) bVar).u);
        } else {
            if (!(bVar instanceof am1.b.C0003b)) {
                u.b();
                throw null;
            }
            aVar = new pk1.a(((am1.b.C0003b) bVar).t);
        }
        this.U = aVar;
        this.V = oh7.a(this.u, new ln1(i));
        this.W = oh7.a(this.u, new mn1(i));
        this.X = oh7.a(this.u, new nn1(i));
        this.Y = oh7.a(this.u, new g9(1));
        this.Z = oh7.a(this.u, new on1(i));
        oy0.d(rhb.b(this), null, null, new sn1(this, null), 3);
        g2b g2bVar = g2b.a;
        yk2.o(new k74(xe7Var.b(g2bVar), new xn1(this, null)), rhb.b(this));
        e(a.f.a);
        oy0.d(rhb.b(this), null, null, new un1(this, null), 3);
        yk2.o(we7Var.b(g2bVar), rhb.b(this));
    }

    public static final void g(qn1 qn1Var, Exception exc) {
        qn1Var.getClass();
        rma.a.b(exc);
        qn1Var.f(il1.b);
        qn1Var.f(new gl1(qn1Var.Q.a(exc)));
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (bl0Var.equals(a.f.a)) {
            return ko1.a(b(), true, false, null, vz7.a(b().d), null, 22);
        }
        if (bl0Var.equals(a.e.a)) {
            return ko1.a(b(), false, false, null, null, null, 30);
        }
        boolean zEquals = bl0Var.equals(a.d.a);
        bu8 bu8Var = this.P;
        if (zEquals) {
            return ko1.a(b(), false, false, null, new vz7(0, true, true, bu8Var.b(R.string.something_went_wrong, new Object[0]), bu8Var.b(R.string.no_internet_description, new Object[0]), bu8Var.b(R.string.reload, new Object[0]), 65), null, 22);
        }
        if (bl0Var instanceof a.b) {
            return ko1.a(b(), false, false, null, null, ((a.b) bl0Var).a, 15);
        }
        if (bl0Var instanceof a.c) {
            return ko1.a(b(), false, false, null, vz7.a(b().d), null, 23);
        }
        if (bl0Var instanceof a.h) {
            return ko1.a(b(), false, false, null, new vz7(0, true, false, bu8Var.b(R.string.no_comments_title, new Object[0]), bu8Var.b(R.string.no_comments_description, new Object[0]), null, 97), null, 23);
        }
        if (bl0Var instanceof a.g) {
            return ko1.a(b(), false, !z2a.w(((a.g) bl0Var).a), null, null, null, 29);
        }
        return bl0Var instanceof a.C0227a ? ko1.a(b(), false, false, ((a.C0227a) bl0Var).a, null, null, 27) : b();
    }

    public final void i() {
        List<v23> list = b().e;
        list.getClass();
        oz3.a aVar = new oz3.a(new oz3(new d44(new oz3(new sh1(list), true, b.t), new fz0(1), new tm2(2)), true, c.t));
        while (aVar.hasNext()) {
            if (((w60.c) aVar.next()).a() == xc9.t) {
                f(jl1.b);
                return;
            }
        }
        this.x.b();
    }

    @Override // defpackage.mhb
    public final void onCleared() {
        super.onCleared();
        oy0.d(this.y, null, null, new d(null), 3);
    }
}
