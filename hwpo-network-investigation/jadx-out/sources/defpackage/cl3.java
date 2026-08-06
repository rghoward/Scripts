package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.entry_details.EntryDetailsViewModel$loadEntryDetails$1", f = "EntryDetailsViewModel.kt", l = {126, 127, 128}, m = "invokeSuspend", v = 2)
public final class cl3 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ gl3 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends wa implements ci4<xj3, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(xj3 xj3Var, r02<? super g2b> r02Var) {
            xj3 xj3Var2 = xj3Var;
            gl3 gl3Var = (gl3) this.receiver;
            int i = gl3.V;
            gl3Var.getClass();
            double d = xj3Var2.d;
            Double d2 = xj3Var2.e;
            String strA = li6.a(gl3Var.K, gl3Var.E, gl3Var.T, xj3Var2.g, d, d2, xj3Var2.f);
            String str = gl3Var.U.format(Long.valueOf(yk2.v(xj3Var2.c)));
            str.getClass();
            gl3Var.e(new yj3.b(strA, str));
            gl3Var.e(new yj3.a(xj3Var2));
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends wa implements ci4<Exception, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(Exception exc, r02<? super g2b> r02Var) {
            gl3 gl3Var = (gl3) this.receiver;
            int i = gl3.V;
            gl3Var.e(yj3.c.a);
            rma.a.b(exc);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl3(gl3 gl3Var, r02<? super cl3> r02Var) {
        super(2, r02Var);
        this.u = gl3Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new cl3(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((cl3) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        if (r13 == r11) goto L20;
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
            r1 = 3
            r2 = 2
            r3 = 1
            gl3 r6 = r12.u
            v72 r11 = defpackage.v72.t
            if (r0 == 0) goto L24
            if (r0 == r3) goto L20
            if (r0 == r2) goto L1c
            if (r0 != r1) goto L15
            defpackage.dv8.b(r13)
            goto L75
        L15:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r12)
            r12 = 0
            return r12
        L1c:
            defpackage.dv8.b(r13)
            goto L5d
        L20:
            defpackage.dv8.b(r13)
            goto L45
        L24:
            defpackage.dv8.b(r13)
            int r13 = defpackage.gl3.V
            yj3$d r13 = yj3.d.a
            r6.e(r13)
            pl4$a r13 = new pl4$a
            ebb r0 = r6.G
            int r4 = r6.H
            r13.<init>(r0, r4)
            pl4 r0 = r6.y
            r12.t = r3
            r0.getClass()
            java.lang.Object r13 = defpackage.g5b.b(r0, r13, r12)
            if (r13 != r11) goto L45
            goto L74
        L45:
            xd3 r13 = (defpackage.xd3) r13
            cl3$a r4 = new cl3$a
            java.lang.String r9 = "onEntryDetailsLoaded(Lcom/hwpo_training_app/tracking/domain/entity/EntryDetails;)V"
            r10 = 4
            r5 = 2
            java.lang.Class<gl3> r7 = defpackage.gl3.class
            java.lang.String r8 = "onEntryDetailsLoaded"
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r12.t = r2
            java.lang.Object r13 = defpackage.yd3.b(r13, r4, r12)
            if (r13 != r11) goto L5d
            goto L74
        L5d:
            xd3 r13 = (defpackage.xd3) r13
            cl3$b r4 = new cl3$b
            java.lang.String r9 = "onError(Ljava/lang/Exception;)V"
            r10 = 4
            r5 = 2
            java.lang.Class<gl3> r7 = defpackage.gl3.class
            java.lang.String r8 = "onError"
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r12.t = r1
            java.lang.Object r13 = defpackage.yd3.a(r13, r4, r12)
            if (r13 != r11) goto L75
        L74:
            return r11
        L75:
            xd3 r13 = (defpackage.xd3) r13
            r13.getClass()
            int r12 = defpackage.gl3.V
            yj3$e r12 = yj3.e.a
            r6.e(r12)
            g2b r12 = defpackage.g2b.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cl3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
