package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.edit_performance.presentation.EditPerformanceViewModel$onAttachmentActionClick$1", f = "EditPerformanceViewModel.kt", l = {333, 333}, m = "invokeSuspend", v = 2)
public final class dd3 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ l89 u;
    public final /* synthetic */ pc3 v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends wa implements ci4<Exception, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(Exception exc, r02<? super g2b> r02Var) {
            pc3 pc3Var = (pc3) this.receiver;
            pc3.b bVar = pc3.Companion;
            pc3Var.k(exc);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd3(l89 l89Var, pc3 pc3Var, r02<? super dd3> r02Var) {
        super(2, r02Var);
        this.u = l89Var;
        this.v = pc3Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new dd3(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((dd3) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (defpackage.yd3.a((defpackage.xd3) r13, r2, r12) == r11) goto L21;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            int r0 = r12.t
            r1 = 1
            pc3 r4 = r12.v
            r9 = 2
            l89 r10 = r12.u
            v72 r11 = defpackage.v72.t
            if (r0 == 0) goto L1f
            if (r0 == r1) goto L1b
            if (r0 != r9) goto L14
            defpackage.dv8.b(r13)
            goto L68
        L14:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r12)
            r12 = 0
            return r12
        L1b:
            defpackage.dv8.b(r13)
            goto L50
        L1f:
            defpackage.dv8.b(r13)
            z60 r13 = r10.E
            int r13 = r13.ordinal()
            if (r13 == r9) goto L3b
            r12 = 3
            if (r13 == r12) goto L2e
            goto L74
        L2e:
            pc3$a$g r12 = new pc3$a$g
            long r0 = r10.t
            r12.<init>(r0)
            pc3$b r13 = defpackage.pc3.Companion
            r4.e(r12)
            goto L74
        L3b:
            s31$a r13 = new s31$a
            java.lang.String r0 = r10.w
            r13.<init>(r0)
            s31 r0 = r4.J
            r12.t = r1
            r0.getClass()
            java.lang.Object r13 = defpackage.g5b.b(r0, r13, r12)
            if (r13 != r11) goto L50
            goto L67
        L50:
            xd3 r13 = (defpackage.xd3) r13
            dd3$a r2 = new dd3$a
            java.lang.String r7 = "notifyError(Ljava/lang/Exception;)V"
            r8 = 4
            r3 = 2
            java.lang.Class<pc3> r5 = defpackage.pc3.class
            java.lang.String r6 = "notifyError"
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r12.t = r9
            java.lang.Object r12 = defpackage.yd3.a(r13, r2, r12)
            if (r12 != r11) goto L68
        L67:
            return r11
        L68:
            pc3$a$g r12 = new pc3$a$g
            long r0 = r10.t
            r12.<init>(r0)
            pc3$b r13 = defpackage.pc3.Companion
            r4.e(r12)
        L74:
            g2b r12 = defpackage.g2b.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dd3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
