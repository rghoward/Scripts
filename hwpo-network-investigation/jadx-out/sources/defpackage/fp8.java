package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.report.presentation.reasons.ReportReasonsViewModel$reportReason$1", f = "ReportReasonsViewModel.kt", l = {77, 78, 79}, m = "invokeSuspend", v = 2)
public final class fp8 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ gp8 u;
    public final /* synthetic */ jo8 v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.report.presentation.reasons.ReportReasonsViewModel$reportReason$1$1", f = "ReportReasonsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<g2b, r02<? super g2b>, Object> {
        public final /* synthetic */ gp8 t;
        public final /* synthetic */ jo8 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gp8 gp8Var, jo8 jo8Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.t = gp8Var;
            this.u = jo8Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new a(this.t, this.u, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(g2b g2bVar, r02<? super g2b> r02Var) {
            return ((a) create(g2bVar, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            gp8 gp8Var = this.t;
            gp8Var.y.b(gp8Var.g(), this.u.b);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.report.presentation.reasons.ReportReasonsViewModel$reportReason$1$2", f = "ReportReasonsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends p6a implements ci4<Exception, r02<? super g2b>, Object> {
        public /* synthetic */ Object t;
        public final /* synthetic */ gp8 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(gp8 gp8Var, r02<? super b> r02Var) {
            super(2, r02Var);
            this.u = gp8Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            b bVar = new b(this.u, r02Var);
            bVar.t = obj;
            return bVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(Exception exc, r02<? super g2b> r02Var) {
            return ((b) create(exc, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            Exception exc = (Exception) this.t;
            dv8.b(obj);
            gp8 gp8Var = this.u;
            gp8Var.f(new ro8(gp8Var.B.a(exc)));
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fp8(gp8 gp8Var, jo8 jo8Var, r02<? super fp8> r02Var) {
        super(2, r02Var);
        this.u = gp8Var;
        this.v = jo8Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new fp8(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((fp8) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
    
        if (r15 == r7) goto L22;
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
            jo8 r1 = r14.v
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            gp8 r6 = r14.u
            v72 r7 = defpackage.v72.t
            if (r0 == 0) goto L26
            if (r0 == r4) goto L22
            if (r0 == r3) goto L1e
            if (r0 != r2) goto L18
            defpackage.dv8.b(r15)
            goto L82
        L18:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r14)
            return r5
        L1e:
            defpackage.dv8.b(r15)
            goto L72
        L22:
            defpackage.dv8.b(r15)
            goto L62
        L26:
            defpackage.dv8.b(r15)
            int r15 = defpackage.gp8.E
            po8$b r15 = po8.b.a
            r6.e(r15)
            q09 r15 = r6.x
            wn8$a r8 = new wn8$a
            long r9 = r6.g()
            java.lang.String r0 = "com.hwpo_training_app.report.presentation.reasons.ReportReasonsFragment.SCORE_ID_EXTRA"
            java.lang.Object r0 = r15.a(r0)
            if (r0 == 0) goto L91
            java.lang.Number r0 = (java.lang.Number) r0
            int r11 = r0.intValue()
            java.lang.String r0 = "com.hwpo_training_app.report.presentation.reasons.ReportReasonsFragment.SCORE_VALUE_ID_EXTRA"
            java.lang.Object r15 = r15.a(r0)
            r12 = r15
            java.lang.Integer r12 = (java.lang.Integer) r12
            java.lang.String r13 = r1.a
            r8.<init>(r9, r11, r12, r13)
            wn8 r15 = r6.A
            r14.t = r4
            r15.getClass()
            java.lang.Object r15 = defpackage.g5b.b(r15, r8, r14)
            if (r15 != r7) goto L62
            goto L81
        L62:
            xd3 r15 = (defpackage.xd3) r15
            fp8$a r0 = new fp8$a
            r0.<init>(r6, r1, r5)
            r14.t = r3
            java.lang.Object r15 = defpackage.yd3.b(r15, r0, r14)
            if (r15 != r7) goto L72
            goto L81
        L72:
            xd3 r15 = (defpackage.xd3) r15
            fp8$b r0 = new fp8$b
            r0.<init>(r6, r5)
            r14.t = r2
            java.lang.Object r15 = defpackage.yd3.a(r15, r0, r14)
            if (r15 != r7) goto L82
        L81:
            return r7
        L82:
            xd3 r15 = (defpackage.xd3) r15
            r15.getClass()
            int r14 = defpackage.gp8.E
            po8$c r14 = po8.c.a
            r6.e(r14)
            g2b r14 = defpackage.g2b.a
            return r14
        L91:
            java.lang.String r14 = "Required value was null."
            defpackage.z90.a(r14)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fp8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
