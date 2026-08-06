package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.workouts.presentation.workouts.WorkoutsViewModel$handleGowodLaunchArgument$1", f = "WorkoutsViewModel.kt", l = {191, 192}, m = "invokeSuspend", v = 2)
public final class xpb extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ wpb u;
    public final /* synthetic */ fp1.a v;
    public final /* synthetic */ k49 w;
    public final /* synthetic */ eo4 x;
    public final /* synthetic */ sc8 y;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.workouts.presentation.workouts.WorkoutsViewModel$handleGowodLaunchArgument$1$1", f = "WorkoutsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<Exception, r02<? super g2b>, Object> {
        public /* synthetic */ Object t;
        public final /* synthetic */ wpb u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wpb wpbVar, r02<? super a> r02Var) {
            super(2, r02Var);
            this.u = wpbVar;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(this.u, r02Var);
            aVar.t = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(Exception exc, r02<? super g2b> r02Var) {
            return ((a) create(exc, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            Exception exc = (Exception) this.t;
            dv8.b(obj);
            wpb wpbVar = this.u;
            wpbVar.f(new dpb(wpbVar.D.a(exc)));
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xpb(wpb wpbVar, fp1.a aVar, k49 k49Var, eo4 eo4Var, sc8 sc8Var, r02<? super xpb> r02Var) {
        super(2, r02Var);
        this.u = wpbVar;
        this.v = aVar;
        this.w = k49Var;
        this.x = eo4Var;
        this.y = sc8Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new xpb(this.u, this.v, this.w, this.x, this.y, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((xpb) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (defpackage.yd3.a((defpackage.xd3) r11, r0, r10) == r5) goto L15;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            int r0 = r10.t
            r1 = 0
            wpb r2 = r10.u
            r3 = 2
            r4 = 1
            v72 r5 = defpackage.v72.t
            if (r0 == 0) goto L1d
            if (r0 == r4) goto L19
            if (r0 != r3) goto L13
            defpackage.dv8.b(r11)
            goto L40
        L13:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r10)
            return r1
        L19:
            defpackage.dv8.b(r11)
            goto L30
        L1d:
            defpackage.dv8.b(r11)
            fp1 r11 = r2.A
            r10.t = r4
            r11.getClass()
            fp1$a r0 = r10.v
            java.lang.Object r11 = defpackage.g5b.b(r11, r0, r10)
            if (r11 != r5) goto L30
            goto L3f
        L30:
            xd3 r11 = (defpackage.xd3) r11
            xpb$a r0 = new xpb$a
            r0.<init>(r2, r1)
            r10.t = r3
            java.lang.Object r11 = defpackage.yd3.a(r11, r0, r10)
            if (r11 != r5) goto L40
        L3f:
            return r5
        L40:
            k49 r11 = r10.w
            java.util.List<sc8> r11 = r11.a
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r11 = r11.iterator()
        L4d:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L74
            java.lang.Object r1 = r11.next()
            r3 = r1
            sc8 r3 = (defpackage.sc8) r3
            j$.time.LocalDateTime r3 = r3.e
            j$.time.LocalDate r3 = r3.m()
            java.lang.Object r5 = r0.get(r3)
            if (r5 != 0) goto L6e
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r0.put(r3, r5)
        L6e:
            java.util.List r5 = (java.util.List) r5
            r5.add(r1)
            goto L4d
        L74:
            eo4 r11 = r10.x
            j$.time.LocalDate r11 = r11.b
            java.lang.Object r11 = r0.get(r11)
            java.util.List r11 = (java.util.List) r11
            if (r11 == 0) goto L85
            int r11 = r11.size()
            goto L86
        L85:
            r11 = 0
        L86:
            if (r11 == 0) goto Laf
            if (r11 == r4) goto Laf
            sc8 r10 = r10.y
            bu8 r11 = r2.E
            bc8 r10 = defpackage.rc8.b(r10, r11)
            spb r3 = r2.x
            long r0 = r10.y
            j$.time.LocalDate r4 = defpackage.yk2.p(r0)
            r4.getClass()
            int r5 = r10.t
            yz7 r11 = r10.u
            java.lang.Integer r6 = r11.t
            java.lang.String r7 = r11.u
            java.lang.Integer r8 = r10.w
            boolean r9 = r10.v
            r3.b(r4, r5, r6, r7, r8, r9)
            g2b r10 = defpackage.g2b.a
            return r10
        Laf:
            g2b r10 = defpackage.g2b.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xpb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
