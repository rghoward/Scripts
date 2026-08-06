package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.entry_details.challenge.ChallengeEntryDetailsViewModel$loadEntryDetails$1", f = "ChallengeEntryDetailsViewModel.kt", l = {155, 156, 157}, m = "invokeSuspend", v = 2)
public final class m71 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ w71 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends pi4 implements ci4<m61, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(m61 m61Var, r02<? super g2b> r02Var) {
            return w71.g((w71) this.receiver, m61Var, r02Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends wa implements ci4<Exception, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(Exception exc, r02<? super g2b> r02Var) {
            w71 w71Var = (w71) this.receiver;
            int i = w71.O;
            w71Var.e(n61.c.a);
            rma.a.b(exc);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m71(w71 w71Var, r02<? super m71> r02Var) {
        super(2, r02Var);
        this.u = w71Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new m71(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((m71) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
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
            w71 r6 = r12.u
            v72 r11 = defpackage.v72.t
            if (r0 == 0) goto L24
            if (r0 == r3) goto L20
            if (r0 == r2) goto L1c
            if (r0 != r1) goto L15
            defpackage.dv8.b(r13)
            goto L73
        L15:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r12)
            r12 = 0
            return r12
        L1c:
            defpackage.dv8.b(r13)
            goto L5b
        L20:
            defpackage.dv8.b(r13)
            goto L43
        L24:
            defpackage.dv8.b(r13)
            int r13 = defpackage.w71.O
            n61$d r13 = n61.d.a
            r6.e(r13)
            qk4 r13 = r6.y
            int r0 = r6.I
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r0)
            r12.t = r3
            r13.getClass()
            java.lang.Object r13 = defpackage.g5b.b(r13, r4, r12)
            if (r13 != r11) goto L43
            goto L72
        L43:
            xd3 r13 = (defpackage.xd3) r13
            m71$a r4 = new m71$a
            java.lang.String r9 = "onEntryDetailsLoaded(Lcom/hwpo_training_app/tracking/domain/entity/ChallengeEntryDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            r10 = 0
            r5 = 2
            java.lang.Class<w71> r7 = defpackage.w71.class
            java.lang.String r8 = "onEntryDetailsLoaded"
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r12.t = r2
            java.lang.Object r13 = defpackage.yd3.b(r13, r4, r12)
            if (r13 != r11) goto L5b
            goto L72
        L5b:
            xd3 r13 = (defpackage.xd3) r13
            m71$b r4 = new m71$b
            java.lang.String r9 = "onError(Ljava/lang/Exception;)V"
            r10 = 4
            r5 = 2
            java.lang.Class<w71> r7 = defpackage.w71.class
            java.lang.String r8 = "onError"
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r12.t = r1
            java.lang.Object r13 = defpackage.yd3.a(r13, r4, r12)
            if (r13 != r11) goto L73
        L72:
            return r11
        L73:
            xd3 r13 = (defpackage.xd3) r13
            r13.getClass()
            int r12 = defpackage.w71.O
            n61$e r12 = n61.e.a
            r6.e(r12)
            g2b r12 = defpackage.g2b.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m71.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
