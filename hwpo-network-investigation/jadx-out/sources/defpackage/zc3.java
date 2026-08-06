package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.edit_performance.presentation.EditPerformanceViewModel$completePerformance$1", f = "EditPerformanceViewModel.kt", l = {424, 425, 429}, m = "invokeSuspend", v = 2)
public final class zc3 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ pc3 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.edit_performance.presentation.EditPerformanceViewModel$completePerformance$1$1", f = "EditPerformanceViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
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
            pc3Var.e(pc3.a.e.a);
            if (!pc3Var.i()) {
                pc3Var.z.b();
            }
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
    public zc3(pc3 pc3Var, r02<? super zc3> r02Var) {
        super(2, r02Var);
        this.u = pc3Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new zc3(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((zc3) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
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
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            pc3 r7 = r13.u
            v72 r12 = defpackage.v72.t
            if (r0 == 0) goto L24
            if (r0 == r4) goto L20
            if (r0 == r3) goto L1c
            if (r0 != r2) goto L16
            defpackage.dv8.b(r14)
            goto L6d
        L16:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r13)
            return r1
        L1c:
            defpackage.dv8.b(r14)
            goto L55
        L20:
            defpackage.dv8.b(r14)
            goto L45
        L24:
            defpackage.dv8.b(r14)
            pc3$a$k r14 = pc3.a.k.a
            pc3$b r0 = defpackage.pc3.Companion
            r7.e(r14)
            fp1 r14 = r7.D
            fp1$a r0 = new fp1$a
            int r5 = r7.x
            int r6 = r7.y
            r0.<init>(r5, r6)
            r13.t = r4
            r14.getClass()
            java.lang.Object r14 = defpackage.g5b.b(r14, r0, r13)
            if (r14 != r12) goto L45
            goto L6c
        L45:
            xd3 r14 = (defpackage.xd3) r14
            zc3$a r0 = new zc3$a
            r0.<init>(r7, r1)
            r13.t = r3
            java.lang.Object r14 = defpackage.yd3.b(r14, r0, r13)
            if (r14 != r12) goto L55
            goto L6c
        L55:
            xd3 r14 = (defpackage.xd3) r14
            zc3$b r5 = new zc3$b
            java.lang.String r10 = "notifyError(Ljava/lang/Exception;)V"
            r11 = 4
            r6 = 2
            java.lang.Class<pc3> r8 = defpackage.pc3.class
            java.lang.String r9 = "notifyError"
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r13.t = r2
            java.lang.Object r13 = defpackage.yd3.a(r14, r5, r13)
            if (r13 != r12) goto L6d
        L6c:
            return r12
        L6d:
            g2b r13 = defpackage.g2b.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zc3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
