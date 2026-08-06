package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.value_details.ValueDetailsViewModel$requestData$1", f = "ValueDetailsViewModel.kt", l = {220, 230, 231}, m = "invokeSuspend", v = 2)
public final class cab extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ c13 u;
    public final /* synthetic */ o9b v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.tracking.presentation.value_details.ValueDetailsViewModel$requestData$1$1", f = "ValueDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<Exception, r02<? super g2b>, Object> {
        public /* synthetic */ Object t;
        public final /* synthetic */ o9b u;
        public final /* synthetic */ c13 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r02 r02Var, c13 c13Var, o9b o9bVar) {
            super(2, r02Var);
            this.u = o9bVar;
            this.v = c13Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(r02Var, this.v, this.u);
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
            o9b.g(this.u, exc, this.v);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cab(r02 r02Var, c13 c13Var, o9b o9bVar) {
        super(2, r02Var);
        this.u = c13Var;
        this.v = o9bVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new cab(r02Var, this.u, this.v);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((cab) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        if (r10 == r8) goto L29;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            o9b r0 = r9.v
            ebb r1 = r0.O
            int r2 = r9.t
            r3 = 3
            r4 = 2
            r5 = 0
            c13 r6 = r9.u
            r7 = 1
            v72 r8 = defpackage.v72.t
            if (r2 == 0) goto L28
            if (r2 == r7) goto L24
            if (r2 == r4) goto L20
            if (r2 != r3) goto L1a
            defpackage.dv8.b(r10)
            goto L76
        L1a:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r9)
            return r5
        L20:
            defpackage.dv8.b(r10)
            goto L66
        L24:
            defpackage.dv8.b(r10)
            goto L51
        L28:
            defpackage.dv8.b(r10)
            c13$a r10 = defpackage.c13.v
            if (r6 != r10) goto L31
            r10 = r7
            goto L32
        L31:
            r10 = 0
        L32:
            if (r10 != r7) goto L48
            d8b$i r10 = d8b.i.a
            int r2 = defpackage.o9b.m0
            r0.e(r10)
            ebb r10 = defpackage.ebb.CHALLENGES
            if (r1 != r10) goto L51
            r9.t = r7
            java.lang.Object r10 = defpackage.o9b.i(r0, r9)
            if (r10 != r8) goto L51
            goto L75
        L48:
            if (r10 != 0) goto L85
            d8b$j r10 = d8b.j.a
            int r2 = defpackage.o9b.m0
            r0.e(r10)
        L51:
            rq8$a r10 = new rq8$a
            int r2 = r0.N
            r10.<init>(r1, r2, r6)
            rq8 r1 = r0.A
            r9.t = r4
            r1.getClass()
            java.lang.Object r10 = defpackage.g5b.b(r1, r10, r9)
            if (r10 != r8) goto L66
            goto L75
        L66:
            xd3 r10 = (defpackage.xd3) r10
            cab$a r1 = new cab$a
            r1.<init>(r5, r6, r0)
            r9.t = r3
            java.lang.Object r10 = defpackage.yd3.a(r10, r1, r9)
            if (r10 != r8) goto L76
        L75:
            return r8
        L76:
            xd3 r10 = (defpackage.xd3) r10
            r10.getClass()
            d8b$k r9 = d8b.k.a
            int r10 = defpackage.o9b.m0
            r0.e(r9)
            g2b r9 = defpackage.g2b.a
            return r9
        L85:
            defpackage.u.b()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cab.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
