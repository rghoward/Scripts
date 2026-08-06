package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.main_tabs.presentation.tabs.MainTabsViewModel$checkIntercom$1", f = "MainTabsViewModel.kt", l = {101, 102}, m = "invokeSuspend", v = 2)
public final class rg6 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ qg6 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.main_tabs.presentation.tabs.MainTabsViewModel$checkIntercom$1$1", f = "MainTabsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<Exception, r02<? super g2b>, Object> {
        public /* synthetic */ Object t;
        public final /* synthetic */ qg6 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qg6 qg6Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.u = qg6Var;
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
            qg6 qg6Var = this.u;
            qg6Var.f(new eg6(qg6Var.G.a(exc)));
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg6(qg6 qg6Var, r02<? super rg6> r02Var) {
        super(2, r02Var);
        this.u = qg6Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new rg6(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((rg6) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (defpackage.yd3.a((defpackage.xd3) r7, r0, r6) == r5) goto L15;
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
            qg6 r2 = r6.u
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
            tb1 r7 = r2.z
            g2b r0 = defpackage.g2b.a
            r6.t = r4
            r7.getClass()
            java.lang.Object r7 = defpackage.g5b.b(r7, r0, r6)
            if (r7 != r5) goto L30
            goto L3f
        L30:
            xd3 r7 = (defpackage.xd3) r7
            rg6$a r0 = new rg6$a
            r0.<init>(r2, r1)
            r6.t = r3
            java.lang.Object r6 = defpackage.yd3.a(r7, r0, r6)
            if (r6 != r5) goto L40
        L3f:
            return r5
        L40:
            g2b r6 = defpackage.g2b.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rg6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
