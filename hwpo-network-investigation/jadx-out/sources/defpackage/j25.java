package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.host.presentation.HostActivityViewModel$handleGowodDeepLink$1", f = "HostActivityViewModel.kt", l = {237, 237}, m = "invokeSuspend", v = 2)
public final class j25 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ e25 u;
    public final /* synthetic */ eo4 v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.host.presentation.HostActivityViewModel$handleGowodDeepLink$1$1", f = "HostActivityViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<g2b, r02<? super g2b>, Object> {
        public final /* synthetic */ e25 t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e25 e25Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.t = e25Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new a(this.t, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(g2b g2bVar, r02<? super g2b> r02Var) {
            return ((a) create(g2bVar, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            this.t.z.c();
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j25(e25 e25Var, eo4 eo4Var, r02<? super j25> r02Var) {
        super(2, r02Var);
        this.u = e25Var;
        this.v = eo4Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new j25(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((j25) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (defpackage.yd3.b((defpackage.xd3) r7, r0, r6) == r5) goto L15;
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
            e25 r2 = r6.u
            r3 = 2
            r4 = 1
            v72 r5 = defpackage.v72.t
            if (r0 == 0) goto L1d
            if (r0 == r4) goto L19
            if (r0 != r3) goto L13
            defpackage.dv8.b(r7)
            goto L40
        L13:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r6)
            return r1
        L19:
            defpackage.dv8.b(r7)
            goto L30
        L1d:
            defpackage.dv8.b(r7)
            hk9 r7 = r2.M
            r6.t = r4
            r7.getClass()
            eo4 r0 = r6.v
            java.lang.Object r7 = defpackage.g5b.b(r7, r0, r6)
            if (r7 != r5) goto L30
            goto L3f
        L30:
            xd3 r7 = (defpackage.xd3) r7
            j25$a r0 = new j25$a
            r0.<init>(r2, r1)
            r6.t = r3
            java.lang.Object r6 = defpackage.yd3.b(r7, r0, r6)
            if (r6 != r5) goto L40
        L3f:
            return r5
        L40:
            g2b r6 = defpackage.g2b.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j25.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
