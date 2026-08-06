package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.enter_value.EnterValueViewModel$saveClicked$1", f = "EnterValueViewModel.kt", l = {258, 258, 260, 261}, m = "invokeSuspend", v = 2)
public final class nj3 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ fj3 u;
    public final /* synthetic */ a4b v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.tracking.presentation.enter_value.EnterValueViewModel$saveClicked$1$1", f = "EnterValueViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<g2b, r02<? super g2b>, Object> {
        public final /* synthetic */ fj3 t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fj3 fj3Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.t = fj3Var;
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
            fj3.a aVar = fj3.Companion;
            fj3 fj3Var = this.t;
            oy0.d(rhb.b(fj3Var), null, null, new mj3(fj3Var, null), 3);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends wa implements ci4<Exception, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(Exception exc, r02<? super g2b> r02Var) {
            fj3.g((fj3) this.receiver, exc);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj3(fj3 fj3Var, a4b a4bVar, r02<? super nj3> r02Var) {
        super(2, r02Var);
        this.u = fj3Var;
        this.v = a4bVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new nj3(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((nj3) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (r11 == r9) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r11 == r9) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (defpackage.yd3.a((defpackage.xd3) r11, r1, r10) == r9) goto L29;
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
            fj3 r3 = r10.u
            r8 = 4
            r1 = 3
            r2 = 2
            r4 = 1
            r5 = 0
            v72 r9 = defpackage.v72.t
            if (r0 == 0) goto L2b
            if (r0 == r4) goto L27
            if (r0 == r2) goto L23
            if (r0 == r1) goto L1f
            if (r0 != r8) goto L19
            defpackage.dv8.b(r11)
            goto L7b
        L19:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r10)
            return r5
        L1f:
            defpackage.dv8.b(r11)
            goto L63
        L23:
            defpackage.dv8.b(r11)
            goto L53
        L27:
            defpackage.dv8.b(r11)
            goto L42
        L2b:
            defpackage.dv8.b(r11)
            java.lang.Integer r11 = r3.M
            a4b r0 = r10.v
            if (r11 != 0) goto L45
            xc r11 = r3.y
            r10.t = r4
            r11.getClass()
            java.lang.Object r11 = defpackage.g5b.b(r11, r0, r10)
            if (r11 != r9) goto L42
            goto L7a
        L42:
            xd3 r11 = (defpackage.xd3) r11
            goto L55
        L45:
            sd3 r11 = r3.z
            r10.t = r2
            r11.getClass()
            java.lang.Object r11 = defpackage.g5b.b(r11, r0, r10)
            if (r11 != r9) goto L53
            goto L7a
        L53:
            xd3 r11 = (defpackage.xd3) r11
        L55:
            nj3$a r0 = new nj3$a
            r0.<init>(r3, r5)
            r10.t = r1
            java.lang.Object r11 = defpackage.yd3.b(r11, r0, r10)
            if (r11 != r9) goto L63
            goto L7a
        L63:
            xd3 r11 = (defpackage.xd3) r11
            nj3$b r1 = new nj3$b
            java.lang.String r6 = "onError(Ljava/lang/Exception;)V"
            r7 = 4
            r2 = 2
            java.lang.Class<fj3> r4 = defpackage.fj3.class
            java.lang.String r5 = "onError"
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r10.t = r8
            java.lang.Object r10 = defpackage.yd3.a(r11, r1, r10)
            if (r10 != r9) goto L7b
        L7a:
            return r9
        L7b:
            g2b r10 = defpackage.g2b.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nj3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
