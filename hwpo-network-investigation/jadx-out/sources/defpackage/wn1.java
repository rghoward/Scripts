package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.comments.presentation.CommentsViewModel$markCommentsAsRead$1", f = "CommentsViewModel.kt", l = {450, 451, 452}, m = "invokeSuspend", v = 2)
public final class wn1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ qn1 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.comments.presentation.CommentsViewModel$markCommentsAsRead$1$1", f = "CommentsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<g2b, r02<? super g2b>, Object> {
        public final /* synthetic */ qn1 t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qn1 qn1Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.t = qn1Var;
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
            int i = qn1.a0;
            this.t.getClass();
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends wa implements ci4<Exception, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(Exception exc, r02<? super g2b> r02Var) {
            qn1.g((qn1) this.receiver, exc);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn1(qn1 qn1Var, r02<? super wn1> r02Var) {
        super(2, r02Var);
        this.u = qn1Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new wn1(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((wn1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
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
            qn1 r2 = r14.u
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
            ci8 r15 = r2.A
            pk1 r0 = r2.U
            r14.t = r5
            r15.getClass()
            java.lang.Object r15 = defpackage.g5b.b(r15, r0, r14)
            if (r15 != r6) goto L37
            goto L60
        L37:
            xd3 r15 = (defpackage.xd3) r15
            wn1$a r0 = new wn1$a
            r0.<init>(r2, r1)
            r14.t = r4
            java.lang.Object r15 = defpackage.yd3.b(r15, r0, r14)
            if (r15 != r6) goto L47
            goto L60
        L47:
            xd3 r15 = (defpackage.xd3) r15
            wn1$b r7 = new wn1$b
            java.lang.String r12 = "onError(Ljava/lang/Exception;)V"
            r13 = 4
            r8 = 2
            qn1 r9 = r14.u
            java.lang.Class<qn1> r10 = defpackage.qn1.class
            java.lang.String r11 = "onError"
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wn1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
