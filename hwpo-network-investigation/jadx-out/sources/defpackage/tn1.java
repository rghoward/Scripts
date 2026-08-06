package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.comments.presentation.CommentsViewModel$deleteComment$1$1", f = "CommentsViewModel.kt", l = {272, 273, 274}, m = "invokeSuspend", v = 2)
public final class tn1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ qn1 u;
    public final /* synthetic */ long v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.comments.presentation.CommentsViewModel$deleteComment$1$1$1", f = "CommentsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
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
    public tn1(long j, qn1 qn1Var, r02 r02Var) {
        super(2, r02Var);
        this.u = qn1Var;
        this.v = j;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new tn1(this.v, this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((tn1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (defpackage.yd3.a((defpackage.xd3) r13, r4, r12) == r11) goto L20;
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
            qn1 r6 = r12.u
            r4 = 0
            v72 r11 = defpackage.v72.t
            if (r0 == 0) goto L24
            if (r0 == r3) goto L20
            if (r0 == r2) goto L1c
            if (r0 != r1) goto L16
            defpackage.dv8.b(r13)
            goto L66
        L16:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r12)
            return r4
        L1c:
            defpackage.dv8.b(r13)
            goto L4e
        L20:
            defpackage.dv8.b(r13)
            goto L3e
        L24:
            defpackage.dv8.b(r13)
            jx2$a r13 = new jx2$a
            pk1 r0 = r6.U
            long r7 = r12.v
            r13.<init>(r0, r7)
            jx2 r0 = r6.H
            r12.t = r3
            r0.getClass()
            java.lang.Object r13 = defpackage.g5b.b(r0, r13, r12)
            if (r13 != r11) goto L3e
            goto L65
        L3e:
            xd3 r13 = (defpackage.xd3) r13
            tn1$a r0 = new tn1$a
            r0.<init>(r6, r4)
            r12.t = r2
            java.lang.Object r13 = defpackage.yd3.b(r13, r0, r12)
            if (r13 != r11) goto L4e
            goto L65
        L4e:
            xd3 r13 = (defpackage.xd3) r13
            tn1$b r4 = new tn1$b
            java.lang.String r9 = "onError(Ljava/lang/Exception;)V"
            r10 = 4
            r5 = 2
            java.lang.Class<qn1> r7 = defpackage.qn1.class
            java.lang.String r8 = "onError"
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r12.t = r1
            java.lang.Object r12 = defpackage.yd3.a(r13, r4, r12)
            if (r12 != r11) goto L66
        L65:
            return r11
        L66:
            g2b r12 = defpackage.g2b.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tn1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
