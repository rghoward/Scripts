package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.value_details.ValueDetailsViewModel$cancelFileDownload$1", f = "ValueDetailsViewModel.kt", l = {351, 352}, m = "invokeSuspend", v = 2)
public final class p9b extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ o9b u;
    public final /* synthetic */ String v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.tracking.presentation.value_details.ValueDetailsViewModel$cancelFileDownload$1$1", f = "ValueDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<Exception, r02<? super g2b>, Object> {
        public /* synthetic */ Object t;
        public final /* synthetic */ o9b u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o9b o9bVar, r02<? super a> r02Var) {
            super(2, r02Var);
            this.u = o9bVar;
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
            o9b o9bVar = this.u;
            o9bVar.f(new i8b(o9bVar.M.a(exc)));
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9b(o9b o9bVar, String str, r02<? super p9b> r02Var) {
        super(2, r02Var);
        this.u = o9bVar;
        this.v = str;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new p9b(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((p9b) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
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
            o9b r2 = r6.u
            r3 = 2
            r4 = 1
            v72 r5 = defpackage.v72.t
            if (r0 == 0) goto L1d
            if (r0 == r4) goto L19
            if (r0 != r3) goto L13
            defpackage.dv8.b(r7)
            goto L40
        L13:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r6)
            return r1
        L19:
            defpackage.dv8.b(r7)
            goto L30
        L1d:
            defpackage.dv8.b(r7)
            r31 r7 = r2.E
            r6.t = r4
            r7.getClass()
            java.lang.String r0 = r6.v
            java.lang.Object r7 = defpackage.g5b.b(r7, r0, r6)
            if (r7 != r5) goto L30
            goto L3f
        L30:
            xd3 r7 = (defpackage.xd3) r7
            p9b$a r0 = new p9b$a
            r0.<init>(r2, r1)
            r6.t = r3
            java.lang.Object r6 = defpackage.yd3.a(r7, r0, r6)
            if (r6 != r5) goto L40
        L3f:
            return r5
        L40:
            g2b r6 = defpackage.g2b.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p9b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
