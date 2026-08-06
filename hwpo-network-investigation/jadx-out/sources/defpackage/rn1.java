package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.comments.presentation.CommentsViewModel$cancelFileLoading$1", f = "CommentsViewModel.kt", l = {475, 476}, m = "invokeSuspend", v = 2)
public final class rn1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ qn1 u;
    public final /* synthetic */ w60.a v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.comments.presentation.CommentsViewModel$cancelFileLoading$1$1", f = "CommentsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<Exception, r02<? super g2b>, Object> {
        public /* synthetic */ Object t;
        public final /* synthetic */ qn1 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qn1 qn1Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.u = qn1Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(this.u, r02Var);
            aVar.t = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(Exception exc, r02<? super g2b> r02Var) {
            return ((a) create(exc, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            Exception exc = (Exception) this.t;
            dv8.b(obj);
            this.u.Q.a(exc).getClass();
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn1(w60.a aVar, qn1 qn1Var, r02 r02Var) {
        super(2, r02Var);
        this.u = qn1Var;
        this.v = aVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new rn1(this.v, this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((rn1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (defpackage.yd3.a((defpackage.xd3) r7, r0, r6) == r5) goto L15;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = r6.t
            r1 = 0
            qn1 r2 = r6.u
            r3 = 2
            r4 = 1
            v72 r5 = defpackage.v72.t
            if (r0 == 0) goto L1d
            if (r0 == r4) goto L19
            if (r0 != r3) goto L13
            defpackage.dv8.b(r7)
            goto L42
        L13:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r6)
            return r1
        L19:
            defpackage.dv8.b(r7)
            goto L32
        L1d:
            defpackage.dv8.b(r7)
            r31 r7 = r2.G
            w60$a r0 = r6.v
            java.lang.String r0 = r0.f
            r6.t = r4
            r7.getClass()
            java.lang.Object r7 = defpackage.g5b.b(r7, r0, r6)
            if (r7 != r5) goto L32
            goto L41
        L32:
            xd3 r7 = (defpackage.xd3) r7
            rn1$a r0 = new rn1$a
            r0.<init>(r2, r1)
            r6.t = r3
            java.lang.Object r6 = defpackage.yd3.a(r7, r0, r6)
            if (r6 != r5) goto L42
        L41:
            return r5
        L42:
            g2b r6 = defpackage.g2b.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rn1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
