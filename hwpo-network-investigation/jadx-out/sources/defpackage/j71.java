package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.entry_details.challenge.ChallengeEntryDetailsViewModel$downloadFile$1", f = "ChallengeEntryDetailsViewModel.kt", l = {205, 205}, m = "invokeSuspend", v = 2)
public final class j71 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ long u;
    public final /* synthetic */ String v;
    public final /* synthetic */ w71 w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.tracking.presentation.entry_details.challenge.ChallengeEntryDetailsViewModel$downloadFile$1$1", f = "ChallengeEntryDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<Exception, r02<? super g2b>, Object> {
        public /* synthetic */ Object t;
        public final /* synthetic */ w71 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w71 w71Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.u = w71Var;
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
            w71 w71Var = this.u;
            w71Var.f(new q61(w71Var.H.a(exc)));
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j71(long j, String str, w71 w71Var, r02<? super j71> r02Var) {
        super(2, r02Var);
        this.u = j;
        this.v = str;
        this.w = w71Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new j71(this.u, this.v, this.w, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((j71) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (defpackage.yd3.a((defpackage.xd3) r9, r0, r8) == r5) goto L15;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            int r0 = r8.t
            w71 r1 = r8.w
            r2 = 2
            r3 = 1
            r4 = 0
            v72 r5 = defpackage.v72.t
            if (r0 == 0) goto L1d
            if (r0 == r3) goto L19
            if (r0 != r2) goto L13
            defpackage.dv8.b(r9)
            goto L47
        L13:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r8)
            return r4
        L19:
            defpackage.dv8.b(r9)
            goto L37
        L1d:
            defpackage.dv8.b(r9)
            mz9$a r9 = new mz9$a
            long r6 = r8.u
            java.lang.String r0 = r8.v
            r9.<init>(r6, r0)
            mz9 r0 = r1.C
            r8.t = r3
            r0.getClass()
            java.lang.Object r9 = defpackage.g5b.b(r0, r9, r8)
            if (r9 != r5) goto L37
            goto L46
        L37:
            xd3 r9 = (defpackage.xd3) r9
            j71$a r0 = new j71$a
            r0.<init>(r1, r4)
            r8.t = r2
            java.lang.Object r8 = defpackage.yd3.a(r9, r0, r8)
            if (r8 != r5) goto L47
        L46:
            return r5
        L47:
            g2b r8 = defpackage.g2b.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j71.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
