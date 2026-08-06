package defpackage;

import com.hwpo_training_app.R;
import com.intercom.twig.BuildConfig;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class qf9 extends dl0<c, b> {
    public static final /* synthetic */ int Y = 0;
    public final mf9 A;
    public final hl4 B;
    public final fp1 C;
    public final t1b D;
    public final mz9 E;
    public final r31 F;
    public final k55 G;
    public final n89 H;
    public final p43 I;
    public final uc8 J;
    public final ad8 K;
    public final r60 L;
    public final cm3 M;
    public final bu8 N;
    public final yq6 O;
    public final yq6 P;
    public final yq6 Q;
    public final yq6 R;
    public final yq6 S;
    public final yq6 T;
    public final yq6 U;
    public final yq6 V;
    public final yq6 W;
    public final yq6 X;
    public final int x;
    public final int y;
    public final String z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.sessions.presentation.session_details.SessionDetailsViewModel$1", f = "SessionDetailsViewModel.kt", l = {109}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;

        public a(r02<? super a> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return qf9.this.new a(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                this.t = 1;
                Object objI = qf9.i(qf9.this, this);
                v72 v72Var = v72.t;
                if (objI == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class b implements bl0 {

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a extends b {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 596793197;
            }

            public final String toString() {
                return "FinishLoading";
            }
        }

        /* JADX INFO: renamed from: qf9$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0224b extends b {
            public final String a;

            public C0224b(String str) {
                str.getClass();
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0224b) && xj5.a(this.a, ((C0224b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return sk0.c("LoadingFailure(errorMessage=", this.a, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class c extends b {
            public final rv7 a;

            public c(rv7 rv7Var) {
                this.a = rv7Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a.equals(((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "PerformanceLayoutUiStateChanged(uiState=" + this.a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class d extends b {
            public final gd8 a;

            public d(gd8 gd8Var) {
                gd8Var.getClass();
                this.a = gd8Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && xj5.a(this.a, ((d) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "SessionDetailsLoaded(sessionDetails=" + this.a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class e extends b {
            public final tc8 a;

            public e(tc8 tc8Var) {
                this.a = tc8Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.a.equals(((e) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "SessionPerformanceUpdated(programPerformance=" + this.a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class f extends b {
            public final zc8 a;

            public f(zc8 zc8Var) {
                this.a = zc8Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.a.equals(((f) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "SessionScoreUpdated(programScore=" + this.a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class g extends b {
            public static final g a = new g();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return 1796367286;
            }

            public final String toString() {
                return "StartLoading";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class h implements bl0 {
            public final long a;
            public final s60 b;

            public h(long j, s60 s60Var) {
                this.a = j;
                this.b = s60Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return this.a == hVar.a && this.b == hVar.b;
            }

            public final int hashCode() {
                return this.b.hashCode() + (Long.hashCode(this.a) * 31);
            }

            public final String toString() {
                return "UpdateFileState(id=" + this.a + ", statusAttachment=" + this.b + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class i implements bl0 {
            public final long a;
            public final s60 b;

            public i(long j, s60 s60Var) {
                this.a = j;
                this.b = s60Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                i iVar = (i) obj;
                return this.a == iVar.a && this.b == iVar.b;
            }

            public final int hashCode() {
                return this.b.hashCode() + (Long.hashCode(this.a) * 31);
            }

            public final String toString() {
                return "UpdatePerformanceFileState(id=" + this.a + ", statusAttachment=" + this.b + ")";
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class d extends pi4 implements oh4<String, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(String str) {
            String str2 = str;
            str2.getClass();
            ((mf9) this.receiver).u(str2);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class e extends pi4 implements ci4<Long, String, g2b> {
        @Override // defpackage.ci4
        public final g2b invoke(Long l, String str) {
            long jLongValue = l.longValue();
            String str2 = str;
            str2.getClass();
            qf9 qf9Var = (qf9) this.receiver;
            int i = qf9.Y;
            qf9Var.getClass();
            oy0.d(rhb.b(qf9Var), null, null, new xf9(jLongValue, str2, qf9Var, null), 3);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class f extends pi4 implements oh4<String, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(String str) {
            String str2 = str;
            str2.getClass();
            qf9 qf9Var = (qf9) this.receiver;
            int i = qf9.Y;
            qf9Var.getClass();
            oy0.d(rhb.b(qf9Var), null, null, new vf9(qf9Var, str2, null), 3);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class g extends pi4 implements ci4<Integer, String[], g2b> {
        @Override // defpackage.ci4
        public final g2b invoke(Integer num, String[] strArr) {
            int iIntValue = num.intValue();
            String[] strArr2 = strArr;
            strArr2.getClass();
            ((mf9) this.receiver).f(strArr2, iIntValue);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class h extends pi4 implements ci4<File, String, g2b> {
        @Override // defpackage.ci4
        public final g2b invoke(File file, String str) {
            File file2 = file;
            String str2 = str;
            file2.getClass();
            str2.getClass();
            qf9 qf9Var = (qf9) this.receiver;
            qf9Var.G.getClass();
            qf9Var.f(new rf9(file2, str2));
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf9(int i, int i2, String str, mf9 mf9Var, hl4 hl4Var, fp1 fp1Var, t1b t1bVar, mf7 mf7Var, pf9 pf9Var, af7 af7Var, mz9 mz9Var, r31 r31Var, dh9 dh9Var, ih9 ih9Var, de9 de9Var, k55 k55Var, n89 n89Var, p43 p43Var, uc8 uc8Var, ad8 ad8Var, r60 r60Var, cm3 cm3Var, bu8 bu8Var) {
        super(new c(i, i2, str));
        str.getClass();
        mf9Var.getClass();
        hl4Var.getClass();
        fp1Var.getClass();
        t1bVar.getClass();
        mf7Var.getClass();
        pf9Var.getClass();
        af7Var.getClass();
        mz9Var.getClass();
        r31Var.getClass();
        dh9Var.getClass();
        ih9Var.getClass();
        de9Var.getClass();
        k55Var.getClass();
        n89Var.getClass();
        p43Var.getClass();
        uc8Var.getClass();
        ad8Var.getClass();
        r60Var.getClass();
        cm3Var.getClass();
        bu8Var.getClass();
        this.x = i;
        this.y = i2;
        this.z = str;
        this.A = mf9Var;
        this.B = hl4Var;
        this.C = fp1Var;
        this.D = t1bVar;
        this.E = mz9Var;
        this.F = r31Var;
        this.G = k55Var;
        this.H = n89Var;
        this.I = p43Var;
        this.J = uc8Var;
        this.K = ad8Var;
        this.L = r60Var;
        this.M = cm3Var;
        this.N = bu8Var;
        this.O = oh7.a(this.u, new cd(1));
        this.P = oh7.a(this.u, new dd(1));
        this.Q = oh7.a(this.u, new ed(1));
        this.R = oh7.a(this.u, new fd(1));
        this.S = oh7.a(this.u, new sb8(1));
        this.T = oh7.a(this.u, new tb8(1));
        this.U = oh7.a(this.u, new ub8(1));
        this.V = oh7.a(this.u, new m72(2));
        this.W = oh7.a(this.u, new dp6(3));
        this.X = oh7.a(this.u, new bd(1));
        yk2.o(new k74(new gg9(new fg9(pf9Var.b, this), this), new hg9(this, null)), rhb.b(this));
        yk2.o(new k74(dh9Var.b, new cg9(this, null)), rhb.b(this));
        yk2.o(new k74(ih9Var.b, new dg9(this, null)), rhb.b(this));
        yk2.o(new k74(de9Var.b, new eg9(this, null)), rhb.b(this));
        g2b g2bVar = g2b.a;
        yk2.o(new k74(new ig9(mf7Var.b(g2bVar)), new jg9(this, null)), rhb.b(this));
        oy0.d(rhb.b(this), null, null, new a(null), 3);
        yk2.o(new k74(af7Var.b(g2bVar), new bg9(this, null)), rhb.b(this));
    }

    public static final void g(qf9 qf9Var) {
        qf9Var.e(new b.c(rv7.a(qf9Var.b().j, false, new js7(Boolean.TRUE, Boolean.FALSE), false, false, false, false, false, false, false, null, null, null, null, null, 32763)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        if (defpackage.yd3.a((defpackage.xd3) r9, r1, r0) == r6) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(defpackage.qf9 r8, defpackage.u02 r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof defpackage.yf9
            if (r0 == 0) goto L13
            r0 = r9
            yf9 r0 = (defpackage.yf9) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            yf9 r0 = new yf9
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.t
            int r1 = r0.v
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            v72 r6 = defpackage.v72.t
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L38
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2e
            defpackage.dv8.b(r9)
            goto L7b
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r8)
            return r5
        L34:
            defpackage.dv8.b(r9)
            goto L6b
        L38:
            defpackage.dv8.b(r9)
            goto L5b
        L3c:
            defpackage.dv8.b(r9)
            qf9$b$g r9 = qf9.b.g.a
            r8.e(r9)
            hl4$a r9 = new hl4$a
            int r1 = r8.x
            int r7 = r8.y
            r9.<init>(r1, r7)
            hl4 r1 = r8.B
            r0.v = r4
            r1.getClass()
            java.lang.Object r9 = defpackage.g5b.b(r1, r9, r0)
            if (r9 != r6) goto L5b
            goto L7a
        L5b:
            xd3 r9 = (defpackage.xd3) r9
            zf9 r1 = new zf9
            r1.<init>(r8, r5)
            r0.v = r3
            java.lang.Object r9 = defpackage.yd3.b(r9, r1, r0)
            if (r9 != r6) goto L6b
            goto L7a
        L6b:
            xd3 r9 = (defpackage.xd3) r9
            ag9 r1 = new ag9
            r1.<init>(r8, r5)
            r0.v = r2
            java.lang.Object r8 = defpackage.yd3.a(r9, r1, r0)
            if (r8 != r6) goto L7b
        L7a:
            return r6
        L7b:
            g2b r8 = defpackage.g2b.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qf9.i(qf9, u02):java.lang.Object");
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        String str;
        u60 u60Var;
        bl0Var.getClass();
        if (bl0Var instanceof b.g) {
            return c.a(b(), 0, 0, null, null, null, null, null, null, null, null, true, false, false, vz7.a(b().n), 7167);
        }
        if (bl0Var instanceof b.a) {
            return c.a(b(), 0, 0, null, null, null, null, null, null, null, null, false, false, false, null, 15359);
        }
        boolean z = bl0Var instanceof b.C0224b;
        bu8 bu8Var = this.N;
        if (z) {
            return c.a(b(), 0, 0, null, null, null, null, null, null, null, null, false, false, false, new vz7(0, true, true, bu8Var.b(R.string.something_went_wrong, new Object[0]), bu8Var.b(R.string.no_internet_description, new Object[0]), bu8Var.b(R.string.reload, new Object[0]), 65), 7167);
        }
        if (bl0Var instanceof b.d) {
            gd8 gd8Var = ((b.d) bl0Var).a;
            List<l89> list = gd8Var.h;
            zc8 zc8Var = gd8Var.k;
            tc8 tc8Var = gd8Var.j;
            String str2 = gd8Var.e;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                u60Var = u60.w;
                if (!zHasNext) {
                    break;
                }
                Object next = it.next();
                if (((l89) next).v != u60Var) {
                    arrayList.add(next);
                }
            }
            List<l89> list2 = gd8Var.h;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list2) {
                if (((l89) obj).v == u60Var) {
                    arrayList2.add(obj);
                }
            }
            return c.a(b(), this.x, gd8Var.a, gd8Var.b, str2, tc8Var, zc8Var, arrayList, arrayList2, gd8Var.i, j(gd8Var.f, gd8Var.g, tc8Var, zc8Var), false, ws0.i(o89.w, o89.u).contains(gd8Var.c), (z2a.w(str2) && arrayList.isEmpty() && arrayList2.isEmpty()) ? false : true, null, 8192);
        }
        boolean z2 = bl0Var instanceof b.e;
        String strB = BuildConfig.FLAVOR;
        if (z2) {
            tc8 tc8Var2 = ((b.e) bl0Var).a;
            boolean z3 = b().j.j || yx.b(tc8Var2);
            boolean zB = yx.b(tc8Var2);
            String str3 = tc8Var2.u;
            List<l89> list3 = tc8Var2.v;
            boolean z4 = (zB || cy.a(b().f)) ? false : true;
            if (z2a.w(str3)) {
                if (!b().f.B && z3) {
                    strB = bu8Var.b(R.string.marked_as_competed, new Object[0]);
                }
                str = strB;
            } else {
                str = str3;
            }
            return c.a(b(), 0, 0, null, null, tc8Var2, null, null, null, null, rv7.a(b().j, z3, new js7(Boolean.valueOf(z3), Boolean.FALSE), z4, false, false, !z2a.w(str), !yx.d(list3).isEmpty(), !yx.c(list3).isEmpty(), z3, null, str, yx.d(list3), yx.c(list3), null, 17457), false, false, false, null, 15855);
        }
        if (bl0Var instanceof b.f) {
            zc8 zc8Var2 = ((b.f) bl0Var).a;
            boolean z5 = b().j.j || cy.a(zc8Var2);
            boolean z6 = (yx.b(b().e) || cy.a(zc8Var2)) ? false : true;
            if (!z2a.w(b().e.u)) {
                strB = b().e.u;
            } else if (!zc8Var2.B && z5) {
                strB = bu8Var.b(R.string.marked_as_competed, new Object[0]);
            }
            String str4 = strB;
            return c.a(b(), 0, 0, null, null, null, zc8Var2, null, null, null, rv7.a(b().j, z5, new js7(Boolean.valueOf(z5), Boolean.FALSE), z6, cy.b(zc8Var2), cy.b(zc8Var2), !z2a.w(str4), false, false, z5, zc8Var2.y, str4, null, null, zc8Var2, 12673), false, false, false, null, 15839);
        }
        if (bl0Var instanceof b.h) {
            b.h hVar = (b.h) bl0Var;
            long j = hVar.a;
            s60 s60Var = hVar.b;
            List<l89> list4 = b().h;
            ArrayList arrayList3 = new ArrayList(ph1.n(list4, 10));
            for (l89 l89VarA : list4) {
                if (l89VarA.t == j) {
                    l89VarA = l89.a(l89VarA, s60Var, null, 15359);
                }
                arrayList3.add(l89VarA);
            }
            return c.a(b(), 0, 0, null, null, null, null, null, arrayList3, null, null, false, false, false, null, 16255);
        }
        if (!(bl0Var instanceof b.i)) {
            if (bl0Var instanceof b.c) {
                return c.a(b(), 0, 0, null, null, null, null, null, null, null, ((b.c) bl0Var).a, false, false, false, null, 15871);
            }
            return new c(this.x, this.y, this.z);
        }
        b.i iVar = (b.i) bl0Var;
        long j2 = iVar.a;
        s60 s60Var2 = iVar.b;
        List<l89> list5 = b().j.n;
        ArrayList arrayList4 = new ArrayList(ph1.n(list5, 10));
        for (l89 l89VarA2 : list5) {
            if (l89VarA2.t == j2) {
                l89VarA2 = l89.a(l89VarA2, s60Var2, null, 15359);
            }
            arrayList4.add(l89VarA2);
        }
        return c.a(b(), 0, 0, null, null, null, null, null, null, null, rv7.a(b().j, false, null, false, false, false, false, false, false, false, null, null, null, arrayList4, null, 24575), false, false, false, null, 15871);
    }

    public final rv7 j(boolean z, boolean z2, tc8 tc8Var, zc8 zc8Var) {
        String strB;
        ArrayList arrayListC = yx.c(tc8Var.v);
        ArrayList arrayListD = yx.d(tc8Var.v);
        String str = tc8Var.u;
        if (z2a.w(str)) {
            strB = (zc8Var.B || !z) ? BuildConfig.FLAVOR : this.N.b(R.string.marked_as_competed, new Object[0]);
        } else {
            strB = str;
        }
        Boolean bool = Boolean.FALSE;
        return new rv7(true, z, new js7(bool, bool), z2, cy.b(zc8Var), cy.b(zc8Var), !z2a.w(str) || (!zc8Var.B && z), !arrayListD.isEmpty(), !arrayListC.isEmpty(), z, zc8Var.y, strB, arrayListD, arrayListC, zc8Var);
    }

    public final void k(l89 l89Var, boolean z) {
        List<l89> list;
        l89Var.getClass();
        int i = 1;
        if (z) {
            list = b().g;
        } else {
            if (z) {
                u.b();
                return;
            }
            list = b().e.v;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((l89) obj).v == u60.u) {
                arrayList.add(obj);
            }
        }
        mf9 mf9Var = this.A;
        this.L.a(l89Var, arrayList, new d(1, mf9Var, mf9.class, "goToPhotoPreview", "goToPhotoPreview(Ljava/lang/String;)V", 0), new jb3(i, this), new e(2, this, qf9.class, "downloadFile", "downloadFile(JLjava/lang/String;)V", 0), new f(1, this, qf9.class, "cancelFileDownload", "cancelFileDownload(Ljava/lang/String;)V", 0), new g(2, mf9Var, mf9.class, "goToVideoPlayer", "goToVideoPlayer(I[Ljava/lang/String;)V", 0), new h(2, this, qf9.class, "openFile", "openFile(Ljava/io/File;Ljava/lang/String;)V", 0));
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements el0 {
        public final int a;
        public final int b;
        public final String c;
        public final String d;
        public final tc8 e;
        public final zc8 f;
        public final List<l89> g;
        public final List<l89> h;
        public final List<vn0> i;
        public final rv7 j;
        public final boolean k;
        public final boolean l;
        public final boolean m;
        public final vz7 n;

        public /* synthetic */ c(int i, int i2, String str) {
            tc8 tc8Var = new tc8(0, 15, (String) null, (ArrayList) null);
            zc8 zc8Var = new zc8(0);
            rv7 rv7Var = new rv7(0);
            vz7 vz7Var = new vz7(0, false, false, null, null, null, 127);
            hf3 hf3Var = hf3.t;
            this(i, i2, str, BuildConfig.FLAVOR, tc8Var, zc8Var, hf3Var, hf3Var, hf3Var, rv7Var, false, false, false, vz7Var);
        }

        public static c a(c cVar, int i, int i2, String str, String str2, tc8 tc8Var, zc8 zc8Var, ArrayList arrayList, ArrayList arrayList2, List list, rv7 rv7Var, boolean z, boolean z2, boolean z3, vz7 vz7Var, int i3) {
            int i4 = (i3 & 1) != 0 ? cVar.a : i;
            int i5 = (i3 & 2) != 0 ? cVar.b : i2;
            String str3 = (i3 & 4) != 0 ? cVar.c : str;
            String str4 = (i3 & 8) != 0 ? cVar.d : str2;
            tc8 tc8Var2 = (i3 & 16) != 0 ? cVar.e : tc8Var;
            zc8 zc8Var2 = (i3 & 32) != 0 ? cVar.f : zc8Var;
            List<l89> list2 = (i3 & 64) != 0 ? cVar.g : arrayList;
            List<l89> list3 = (i3 & 128) != 0 ? cVar.h : arrayList2;
            List list4 = (i3 & 256) != 0 ? cVar.i : list;
            rv7 rv7Var2 = (i3 & 512) != 0 ? cVar.j : rv7Var;
            boolean z4 = (i3 & 1024) != 0 ? cVar.k : z;
            boolean z5 = (i3 & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? cVar.l : z2;
            boolean z6 = (i3 & 4096) != 0 ? cVar.m : z3;
            vz7 vz7Var2 = (i3 & 8192) != 0 ? cVar.n : vz7Var;
            cVar.getClass();
            str3.getClass();
            str4.getClass();
            tc8Var2.getClass();
            zc8Var2.getClass();
            list2.getClass();
            list3.getClass();
            list4.getClass();
            rv7Var2.getClass();
            vz7Var2.getClass();
            return new c(i4, i5, str3, str4, tc8Var2, zc8Var2, list2, list3, list4, rv7Var2, z4, z5, z6, vz7Var2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && xj5.a(this.c, cVar.c) && xj5.a(this.d, cVar.d) && xj5.a(this.e, cVar.e) && xj5.a(this.f, cVar.f) && xj5.a(this.g, cVar.g) && xj5.a(this.h, cVar.h) && xj5.a(this.i, cVar.i) && xj5.a(this.j, cVar.j) && this.k == cVar.k && this.l == cVar.l && this.m == cVar.m && xj5.a(this.n, cVar.n);
        }

        public final int hashCode() {
            return this.n.hashCode() + uo2.a(uo2.a(uo2.a((this.j.hashCode() + ho2.a(ho2.a(ho2.a((this.f.hashCode() + ((this.e.hashCode() + ru3.c(ru3.c(os2.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31, this.k, 31), this.l, 31), this.m, 31);
        }

        public final String toString() {
            StringBuilder sbB = u43.b("State(programId=", ", sessionId=", ", sessionTitle=", this.a, this.b);
            ux1.b(sbB, this.c, ", sessionDescription=", this.d, ", performance=");
            sbB.append(this.e);
            sbB.append(", score=");
            sbB.append(this.f);
            sbB.append(", mediaAttachments=");
            sbB.append(this.g);
            sbB.append(", fileAttachments=");
            sbB.append(this.h);
            sbB.append(", benchmarks=");
            sbB.append(this.i);
            sbB.append(", performanceLayoutUiState=");
            sbB.append(this.j);
            sbB.append(", isProgress=");
            e4.a(sbB, this.k, ", isOpenLeaderboardButtonVisible=", this.l, ", isDescriptionBlockVisible=");
            sbB.append(this.m);
            sbB.append(", placeholderState=");
            sbB.append(this.n);
            sbB.append(")");
            return sbB.toString();
        }

        public c(int i, int i2, String str, String str2, tc8 tc8Var, zc8 zc8Var, List<l89> list, List<l89> list2, List<vn0> list3, rv7 rv7Var, boolean z, boolean z2, boolean z3, vz7 vz7Var) {
            str.getClass();
            this.a = i;
            this.b = i2;
            this.c = str;
            this.d = str2;
            this.e = tc8Var;
            this.f = zc8Var;
            this.g = list;
            this.h = list2;
            this.i = list3;
            this.j = rv7Var;
            this.k = z;
            this.l = z2;
            this.m = z3;
            this.n = vz7Var;
        }
    }
}
