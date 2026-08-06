package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.main_tabs.presentation.tabs.MainTabsViewModel$checkNotificationPermission$1", f = "MainTabsViewModel.kt", l = {109, 110, 113}, m = "invokeSuspend", v = 2)
public final class wg6 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ qg6 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.main_tabs.presentation.tabs.MainTabsViewModel$checkNotificationPermission$1$1", f = "MainTabsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<Boolean, r02<? super g2b>, Object> {
        public /* synthetic */ boolean t;
        public final /* synthetic */ qg6 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qg6 qg6Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.u = qg6Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(this.u, r02Var);
            aVar.t = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(Boolean bool, r02<? super g2b> r02Var) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((a) create(bool2, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z = this.t;
            dv8.b(obj);
            if (z) {
                cg6 cg6Var = cg6.b;
                qg6.b bVar = qg6.Companion;
                this.u.f(cg6Var);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends wa implements ci4<Throwable, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(Throwable th, r02<? super g2b> r02Var) {
            ((rma.a) this.receiver).b(th);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg6(qg6 qg6Var, r02<? super wg6> r02Var) {
        super(2, r02Var);
        this.u = qg6Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new wg6(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((wg6) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (defpackage.yd3.a((defpackage.xd3) r15, r7, r14) == r6) goto L20;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            int r0 = r14.t
            r1 = 0
            qg6 r2 = r14.u
            r3 = 3
            r4 = 2
            r5 = 1
            v72 r6 = defpackage.v72.t
            if (r0 == 0) goto L24
            if (r0 == r5) goto L20
            if (r0 == r4) goto L1c
            if (r0 != r3) goto L16
            defpackage.dv8.b(r15)
            goto L61
        L16:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r14)
            return r1
        L1c:
            defpackage.dv8.b(r15)
            goto L47
        L20:
            defpackage.dv8.b(r15)
            goto L37
        L24:
            defpackage.dv8.b(r15)
            xb1 r15 = r2.D
            g2b r0 = defpackage.g2b.a
            r14.t = r5
            r15.getClass()
            java.lang.Object r15 = defpackage.g5b.b(r15, r0, r14)
            if (r15 != r6) goto L37
            goto L60
        L37:
            xd3 r15 = (defpackage.xd3) r15
            wg6$a r0 = new wg6$a
            r0.<init>(r2, r1)
            r14.t = r4
            java.lang.Object r15 = defpackage.yd3.b(r15, r0, r14)
            if (r15 != r6) goto L47
            goto L60
        L47:
            xd3 r15 = (defpackage.xd3) r15
            wg6$b r7 = new wg6$b
            rma$a r9 = defpackage.rma.a
            java.lang.String r12 = "e(Ljava/lang/Throwable;)V"
            r13 = 4
            r8 = 2
            java.lang.Class<rma$a> r10 = rma.a.class
            java.lang.String r11 = "e"
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r14.t = r3
            java.lang.Object r14 = defpackage.yd3.a(r15, r7, r14)
            if (r14 != r6) goto L61
        L60:
            return r6
        L61:
            g2b r14 = defpackage.g2b.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
