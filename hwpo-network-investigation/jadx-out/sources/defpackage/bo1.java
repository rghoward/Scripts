package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.comments.presentation.CommentsViewModel$onCommentRetryClick$1", f = "CommentsViewModel.kt", l = {338, 339, 340}, m = "invokeSuspend", v = 2)
public final class bo1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ qn1 u;
    public final /* synthetic */ sk1 v;
    public final /* synthetic */ w60 w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.comments.presentation.CommentsViewModel$onCommentRetryClick$1$1", f = "CommentsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
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
    public bo1(qn1 qn1Var, sk1 sk1Var, w60 w60Var, r02<? super bo1> r02Var) {
        super(2, r02Var);
        this.u = qn1Var;
        this.v = sk1Var;
        this.w = w60Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new bo1(this.u, this.v, this.w, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((bo1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
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
            r1 = 3
            r2 = 2
            r3 = 1
            qn1 r4 = r14.u
            r5 = 0
            v72 r6 = defpackage.v72.t
            if (r0 == 0) goto L24
            if (r0 == r3) goto L20
            if (r0 == r2) goto L1c
            if (r0 != r1) goto L16
            defpackage.dv8.b(r15)
            goto L72
        L16:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r14)
            return r5
        L1c:
            defpackage.dv8.b(r15)
            goto L58
        L20:
            defpackage.dv8.b(r15)
            goto L48
        L24:
            defpackage.dv8.b(r15)
            et8$a r7 = new et8$a
            pk1 r8 = r4.U
            sk1 r15 = r14.v
            long r9 = r15.a()
            w60 r15 = r14.w
            long r11 = r15.b()
            r7.<init>(r8, r9, r11)
            et8 r15 = r4.D
            r14.t = r3
            r15.getClass()
            java.lang.Object r15 = defpackage.g5b.b(r15, r7, r14)
            if (r15 != r6) goto L48
            goto L71
        L48:
            xd3 r15 = (defpackage.xd3) r15
            bo1$a r0 = new bo1$a
            r0.<init>(r4, r5)
            r14.t = r2
            java.lang.Object r15 = defpackage.yd3.b(r15, r0, r14)
            if (r15 != r6) goto L58
            goto L71
        L58:
            xd3 r15 = (defpackage.xd3) r15
            bo1$b r7 = new bo1$b
            java.lang.String r12 = "onError(Ljava/lang/Exception;)V"
            r13 = 4
            r8 = 2
            qn1 r9 = r14.u
            java.lang.Class<qn1> r10 = defpackage.qn1.class
            java.lang.String r11 = "onError"
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r14.t = r1
            java.lang.Object r14 = defpackage.yd3.a(r15, r7, r14)
            if (r14 != r6) goto L72
        L71:
            return r6
        L72:
            g2b r14 = defpackage.g2b.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bo1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
