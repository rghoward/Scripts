package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.value_details.ValueDetailsViewModel$deleteValueConfirmed$1", f = "ValueDetailsViewModel.kt", l = {456, 457, 458}, m = "invokeSuspend", v = 2)
public final class q9b extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public int u;
    public final /* synthetic */ o9b v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.tracking.presentation.value_details.ValueDetailsViewModel$deleteValueConfirmed$1$1", f = "ValueDetailsViewModel.kt", l = {457}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<g2b, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ o9b u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o9b o9bVar, r02<? super a> r02Var) {
            super(2, r02Var);
            this.u = o9bVar;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new a(this.u, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(g2b g2bVar, r02<? super g2b> r02Var) {
            return ((a) create(g2bVar, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                o9b o9bVar = this.u;
                q68 q68Var = o9bVar.H;
                rsa.b bVar = new rsa.b(o9bVar.O);
                this.t = 1;
                q68Var.getClass();
                Object objB = g5b.b(q68Var, bVar, this);
                v72 v72Var = v72.t;
                if (objB == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.tracking.presentation.value_details.ValueDetailsViewModel$deleteValueConfirmed$1$2", f = "ValueDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends p6a implements ci4<Exception, r02<? super g2b>, Object> {
        public /* synthetic */ Object t;
        public final /* synthetic */ o9b u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o9b o9bVar, r02<? super b> r02Var) {
            super(2, r02Var);
            this.u = o9bVar;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            b bVar = new b(this.u, r02Var);
            bVar.t = obj;
            return bVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(Exception exc, r02<? super g2b> r02Var) {
            return ((b) create(exc, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            Exception exc = (Exception) this.t;
            dv8.b(obj);
            o9b o9bVar = this.u;
            o9bVar.f(new i8b(o9bVar.M.a(exc)));
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9b(o9b o9bVar, r02<? super q9b> r02Var) {
        super(2, r02Var);
        this.v = o9bVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new q9b(this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((q9b) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        if (r10 == r6) goto L23;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            int r0 = r9.u
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            o9b r5 = r9.v
            v72 r6 = defpackage.v72.t
            if (r0 == 0) goto L28
            if (r0 == r3) goto L22
            if (r0 == r2) goto L1c
            if (r0 != r1) goto L16
            defpackage.dv8.b(r10)
            goto L76
        L16:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r9)
            return r4
        L1c:
            int r0 = r9.t
            defpackage.dv8.b(r10)
            goto L64
        L22:
            int r0 = r9.t
            defpackage.dv8.b(r10)
            goto L52
        L28:
            defpackage.dv8.b(r10)
            java.lang.Integer r10 = r5.X
            if (r10 == 0) goto L85
            int r10 = r10.intValue()
            d8b$j r0 = d8b.j.a
            r5.e(r0)
            ox2$a r0 = new ox2$a
            ebb r7 = r5.O
            r0.<init>(r7, r10)
            ox2 r7 = r5.F
            r9.t = r10
            r9.u = r3
            r7.getClass()
            java.lang.Object r0 = defpackage.g5b.b(r7, r0, r9)
            if (r0 != r6) goto L4f
            goto L75
        L4f:
            r8 = r0
            r0 = r10
            r10 = r8
        L52:
            xd3 r10 = (defpackage.xd3) r10
            q9b$a r3 = new q9b$a
            r3.<init>(r5, r4)
            r9.t = r0
            r9.u = r2
            java.lang.Object r10 = defpackage.yd3.b(r10, r3, r9)
            if (r10 != r6) goto L64
            goto L75
        L64:
            xd3 r10 = (defpackage.xd3) r10
            q9b$b r2 = new q9b$b
            r2.<init>(r5, r4)
            r9.t = r0
            r9.u = r1
            java.lang.Object r10 = defpackage.yd3.a(r10, r2, r9)
            if (r10 != r6) goto L76
        L75:
            return r6
        L76:
            xd3 r10 = (defpackage.xd3) r10
            r10.getClass()
            d8b$k r9 = d8b.k.a
            int r10 = defpackage.o9b.m0
            r5.e(r9)
            g2b r9 = defpackage.g2b.a
            return r9
        L85:
            g2b r9 = defpackage.g2b.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q9b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
