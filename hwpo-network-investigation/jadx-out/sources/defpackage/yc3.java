package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.edit_performance.presentation.EditPerformanceViewModel$clearPerformance$1", f = "EditPerformanceViewModel.kt", l = {319, 320, 323}, m = "invokeSuspend", v = 2)
public final class yc3 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ pc3 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.edit_performance.presentation.EditPerformanceViewModel$clearPerformance$1$1", f = "EditPerformanceViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<g2b, r02<? super g2b>, Object> {
        public final /* synthetic */ pc3 t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pc3 pc3Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.t = pc3Var;
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
            pc3.a.c cVar = pc3.a.c.a;
            pc3.b bVar = pc3.Companion;
            pc3 pc3Var = this.t;
            pc3Var.e(cVar);
            pc3Var.z.b();
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends wa implements ci4<Exception, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(Exception exc, r02<? super g2b> r02Var) {
            pc3 pc3Var = (pc3) this.receiver;
            pc3.b bVar = pc3.Companion;
            pc3Var.k(exc);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc3(pc3 pc3Var, r02<? super yc3> r02Var) {
        super(2, r02Var);
        this.u = pc3Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new yc3(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((yc3) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        if (defpackage.yd3.a((defpackage.xd3) r14, r5, r13) == r12) goto L20;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            int r0 = r13.t
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            pc3 r7 = r13.u
            v72 r12 = defpackage.v72.t
            if (r0 == 0) goto L24
            if (r0 == r3) goto L20
            if (r0 == r2) goto L1c
            if (r0 != r1) goto L16
            defpackage.dv8.b(r14)
            goto L79
        L16:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r13)
            return r4
        L1c:
            defpackage.dv8.b(r14)
            goto L61
        L20:
            defpackage.dv8.b(r14)
            goto L51
        L24:
            defpackage.dv8.b(r14)
            pc3$a$k r14 = pc3.a.k.a
            pc3$b r0 = defpackage.pc3.Companion
            r7.e(r14)
            ee1$a r14 = new ee1$a
            int r0 = r7.x
            int r5 = r7.y
            el0 r6 = r7.b()
            pc3$c r6 = (pc3.c) r6
            zc8 r6 = r6.b
            bd8 r6 = defpackage.mm8.g(r6)
            r14.<init>(r0, r5, r6)
            ee1 r0 = r7.C
            r13.t = r3
            r0.getClass()
            java.lang.Object r14 = defpackage.g5b.b(r0, r14, r13)
            if (r14 != r12) goto L51
            goto L78
        L51:
            xd3 r14 = (defpackage.xd3) r14
            yc3$a r0 = new yc3$a
            r0.<init>(r7, r4)
            r13.t = r2
            java.lang.Object r14 = defpackage.yd3.b(r14, r0, r13)
            if (r14 != r12) goto L61
            goto L78
        L61:
            xd3 r14 = (defpackage.xd3) r14
            yc3$b r5 = new yc3$b
            java.lang.String r10 = "notifyError(Ljava/lang/Exception;)V"
            r11 = 4
            r6 = 2
            java.lang.Class<pc3> r8 = defpackage.pc3.class
            java.lang.String r9 = "notifyError"
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r13.t = r1
            java.lang.Object r13 = defpackage.yd3.a(r14, r5, r13)
            if (r13 != r12) goto L79
        L78:
            return r12
        L79:
            g2b r13 = defpackage.g2b.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yc3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
