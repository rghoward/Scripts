package defpackage;

import com.hwpo_training_app.R;
import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pg extends dl0<eh, ef> {
    public static final b Companion = new b();
    public final w3b A;
    public final cm3 B;
    public final bu8 C;
    public final yq6 D;
    public final yq6 E;
    public final yq6 F;
    public final yq6 G;
    public final yq6 H;
    public final yq6 I;
    public final o7a J;
    public final o7a K;
    public String L;
    public dz9 M;
    public final js4 x;
    public final iq8 y;
    public final cf7 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.affiliated_gym.presentation.list.AffiliatedGymListViewModel$1", f = "AffiliatedGymListViewModel.kt", l = {77, 78}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;

        public a(r02<? super a> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return pg.this.new a(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
        
            if (r0 == r5) goto L23;
         */
        @Override // defpackage.ak0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                int r0 = r6.t
                r1 = 0
                pg r2 = defpackage.pg.this
                r3 = 2
                r4 = 1
                v72 r5 = defpackage.v72.t
                if (r0 == 0) goto L1d
                if (r0 == r4) goto L19
                if (r0 != r3) goto L13
                defpackage.dv8.b(r7)
                goto L53
            L13:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r6)
                return r1
            L19:
                defpackage.dv8.b(r7)
                goto L2b
            L1d:
                defpackage.dv8.b(r7)
                r6.t = r4
                java.lang.String r7 = ""
                java.lang.Object r7 = defpackage.pg.g(r2, r7, r6)
                if (r7 != r5) goto L2b
                goto L52
            L2b:
                r6.t = r3
                cf7 r7 = r2.z
                g2b r0 = defpackage.g2b.a
                e84 r7 = r7.b(r0)
                bh r3 = new bh
                r3.<init>(r2, r1)
                k74$a r1 = new k74$a
                jc7 r2 = defpackage.jc7.t
                r1.<init>(r2, r3)
                java.lang.Object r6 = r7.collect(r1, r6)
                if (r6 != r5) goto L48
                goto L49
            L48:
                r6 = r0
            L49:
                if (r6 != r5) goto L4c
                goto L4d
            L4c:
                r6 = r0
            L4d:
                if (r6 != r5) goto L50
                r0 = r6
            L50:
                if (r0 != r5) goto L53
            L52:
                return r5
            L53:
                g2b r6 = defpackage.g2b.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: pg.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
    }

    public pg(final q09 q09Var, js4 js4Var, iq8 iq8Var, cf7 cf7Var, w3b w3bVar, cm3 cm3Var, bu8 bu8Var) {
        q09Var.getClass();
        js4Var.getClass();
        iq8Var.getClass();
        cf7Var.getClass();
        w3bVar.getClass();
        cm3Var.getClass();
        bu8Var.getClass();
        eh.Companion.getClass();
        vz7 vz7Var = new vz7(0, false, false, null, null, null, 127);
        hf3 hf3Var = hf3.t;
        super(new eh(hf3Var, hf3Var, null, null, false, false, true, false, vz7Var));
        this.x = js4Var;
        this.y = iq8Var;
        this.z = cf7Var;
        this.A = w3bVar;
        this.B = cm3Var;
        this.C = bu8Var;
        this.D = oh7.a(this.u, new hg(0));
        this.E = oh7.a(this.u, new ig(0));
        this.F = oh7.a(this.u, new jg(0));
        this.G = oh7.a(this.u, new kg(0));
        this.H = oh7.a(this.u, new oh4() { // from class: lg
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                pg.b bVar = pg.Companion;
                return Boolean.valueOf(q09Var.a("com.hwpo_training_app.affilated_gym.list.AffilatedGymListFragment.CAME_FOM_KEY") == g31.t);
            }
        });
        this.I = oh7.a(this.u, new mg(0));
        this.J = new o7a(new mh4() { // from class: ng
            @Override // defpackage.mh4
            public final Object invoke() {
                pg.b bVar = pg.Companion;
                Object objA = q09Var.a("com.hwpo_training_app.affilated_gym.list.AffilatedGymListFragment.CAME_FOM_KEY");
                if (objA != null) {
                    return (g31) objA;
                }
                z90.a("Required value was null.");
                return null;
            }
        });
        this.K = new o7a(new mh4() { // from class: og
            @Override // defpackage.mh4
            public final Object invoke() {
                pg pgVar = this.t;
                return pgVar.x.a((g31) pgVar.J.getValue());
            }
        });
        this.L = BuildConfig.FLAVOR;
        oy0.d(rhb.b(this), null, null, new a(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        if (defpackage.yd3.a((defpackage.xd3) r15, r6, r0) == r5) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(defpackage.pg r13, java.lang.String r14, defpackage.u02 r15) throws java.lang.Throwable {
        /*
            r13.getClass()
            boolean r0 = r15 instanceof defpackage.wg
            if (r0 == 0) goto L16
            r0 = r15
            wg r0 = (defpackage.wg) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.v = r1
            goto L1b
        L16:
            wg r0 = new wg
            r0.<init>(r13, r15)
        L1b:
            java.lang.Object r15 = r0.t
            int r1 = r0.v
            r2 = 2
            r3 = 1
            r4 = 0
            v72 r5 = defpackage.v72.t
            if (r1 == 0) goto L38
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2e
            defpackage.dv8.b(r15)
            goto L81
        L2e:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r13)
            return r4
        L34:
            defpackage.dv8.b(r15)
            goto L68
        L38:
            defpackage.dv8.b(r15)
            el0 r15 = r13.b()
            eh r15 = (defpackage.eh) r15
            oq4$a r15 = r15.d
            if (r15 == 0) goto L48
            java.lang.String r15 = r15.u
            goto L49
        L48:
            r15 = r4
        L49:
            el0 r1 = r13.b()
            eh r1 = (defpackage.eh) r1
            oq4$b r1 = r1.c
            if (r1 == 0) goto L55
            java.lang.String r4 = r1.t
        L55:
            iq8$a r1 = new iq8$a
            r1.<init>(r14, r3, r4, r15)
            iq8 r14 = r13.y
            r0.v = r3
            r14.getClass()
            java.lang.Object r15 = defpackage.g5b.b(r14, r1, r0)
            if (r15 != r5) goto L68
            goto L80
        L68:
            xd3 r15 = (defpackage.xd3) r15
            xg r6 = new xg
            java.lang.String r11 = "dataRequestFailure(Ljava/lang/Exception;)V"
            r12 = 4
            r7 = 2
            java.lang.Class<pg> r9 = defpackage.pg.class
            java.lang.String r10 = "dataRequestFailure"
            r8 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.v = r2
            java.lang.Object r13 = defpackage.yd3.a(r15, r6, r0)
            if (r13 != r5) goto L81
        L80:
            return r5
        L81:
            g2b r13 = defpackage.g2b.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pg.g(pg, java.lang.String, u02):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        if (defpackage.yd3.a((defpackage.xd3) r15, r6, r0) == r5) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(defpackage.pg r13, java.lang.String r14, defpackage.u02 r15) throws java.lang.Throwable {
        /*
            r13.getClass()
            boolean r0 = r15 instanceof defpackage.yg
            if (r0 == 0) goto L16
            r0 = r15
            yg r0 = (defpackage.yg) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.v = r1
            goto L1b
        L16:
            yg r0 = new yg
            r0.<init>(r13, r15)
        L1b:
            java.lang.Object r15 = r0.t
            int r1 = r0.v
            r2 = 2
            r3 = 1
            r4 = 0
            v72 r5 = defpackage.v72.t
            if (r1 == 0) goto L38
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2e
            defpackage.dv8.b(r15)
            goto L87
        L2e:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r13)
            return r4
        L34:
            defpackage.dv8.b(r15)
            goto L6e
        L38:
            defpackage.dv8.b(r15)
            ef$h r15 = ef.h.a
            r13.e(r15)
            el0 r15 = r13.b()
            eh r15 = (defpackage.eh) r15
            oq4$a r15 = r15.d
            if (r15 == 0) goto L4d
            java.lang.String r15 = r15.u
            goto L4e
        L4d:
            r15 = r4
        L4e:
            el0 r1 = r13.b()
            eh r1 = (defpackage.eh) r1
            oq4$b r1 = r1.c
            if (r1 == 0) goto L5a
            java.lang.String r4 = r1.t
        L5a:
            iq8$a r1 = new iq8$a
            r6 = 0
            r1.<init>(r14, r6, r4, r15)
            iq8 r14 = r13.y
            r0.v = r3
            r14.getClass()
            java.lang.Object r15 = defpackage.g5b.b(r14, r1, r0)
            if (r15 != r5) goto L6e
            goto L86
        L6e:
            xd3 r15 = (defpackage.xd3) r15
            zg r6 = new zg
            java.lang.String r11 = "paginationFailure(Ljava/lang/Exception;)V"
            r12 = 4
            r7 = 2
            java.lang.Class<pg> r9 = defpackage.pg.class
            java.lang.String r10 = "paginationFailure"
            r8 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.v = r2
            java.lang.Object r13 = defpackage.yd3.a(r15, r6, r0)
            if (r13 != r5) goto L87
        L86:
            return r5
        L87:
            g2b r13 = defpackage.g2b.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pg.i(pg, java.lang.String, u02):java.lang.Object");
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (bl0Var instanceof ef.b) {
            return eh.a(b(), null, ((ef.b) bl0Var).a, null, null, false, false, false, false, null, 509);
        }
        if (bl0Var instanceof ef.c) {
            return eh.a(b(), null, null, null, null, false, false, ((ef.c) bl0Var).a, false, null, 447);
        }
        if (bl0Var instanceof ef.g) {
            return eh.a(b(), null, null, null, null, true, false, false, false, null, 495);
        }
        if (bl0Var instanceof ef.i) {
            return eh.a(b(), null, null, null, null, false, false, false, false, null, 495);
        }
        if (bl0Var instanceof ef.a) {
            return eh.a(b(), null, null, null, null, false, false, false, ((ef.a) bl0Var).a, null, 383);
        }
        if (bl0Var instanceof ef.k) {
            ef.k kVar = (ef.k) bl0Var;
            return eh.a(b(), null, null, kVar.a, kVar.b, false, false, false, false, null, 499);
        }
        if (bl0Var instanceof ef.h) {
            return eh.a(b(), th1.L(b().a, nr7.a), null, null, null, false, true, false, false, null, 478);
        }
        if (!(bl0Var instanceof ef.j)) {
            if (bl0Var instanceof ef.d) {
                return eh.a(b(), ((ef.d) bl0Var).a, null, null, null, false, false, false, false, vz7.a(b().i), 206);
            }
            boolean z = bl0Var instanceof ef.f;
            bu8 bu8Var = this.C;
            hf3 hf3Var = hf3.t;
            if (z) {
                return eh.a(b(), hf3Var, null, null, null, false, false, false, false, new vz7(0, true, true, bu8Var.b(R.string.something_went_wrong, new Object[0]), bu8Var.b(R.string.no_internet_description, new Object[0]), bu8Var.b(R.string.reload, new Object[0]), 65), 238);
            }
            return bl0Var instanceof ef.e ? eh.a(b(), hf3Var, null, null, null, false, false, false, false, new vz7(0, true, false, bu8Var.b(R.string.no_results_found, new Object[0]), BuildConfig.FLAVOR, null, 101), 238) : b();
        }
        eh ehVarB = b();
        List<u23> list = b().a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!(((u23) obj) instanceof nr7)) {
                arrayList.add(obj);
            }
        }
        return eh.a(ehVarB, arrayList, null, null, null, false, false, false, false, null, 478);
    }
}
