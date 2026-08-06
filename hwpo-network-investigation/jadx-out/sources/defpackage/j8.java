package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.account.presentation.AccountViewModel$onDeleteAvatarOptionPicked$1", f = "AccountViewModel.kt", l = {171, 172}, m = "invokeSuspend", v = 2)
public final class j8 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ e8 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends wa implements ci4<Exception, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(Exception exc, r02<? super g2b> r02Var) {
            e8.g((e8) this.receiver, exc);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8(e8 e8Var, r02<? super j8> r02Var) {
        super(2, r02Var);
        this.u = e8Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new j8(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((j8) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r13 == r4) goto L15;
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
            e8 r1 = r12.u
            r2 = 2
            r3 = 1
            v72 r4 = defpackage.v72.t
            if (r0 == 0) goto L1d
            if (r0 == r3) goto L19
            if (r0 != r2) goto L12
            defpackage.dv8.b(r13)
            goto L4a
        L12:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r12)
            r12 = 0
            return r12
        L19:
            defpackage.dv8.b(r13)
            goto L30
        L1d:
            defpackage.dv8.b(r13)
            gx2 r13 = r1.C
            g2b r0 = defpackage.g2b.a
            r12.t = r3
            r13.getClass()
            java.lang.Object r13 = defpackage.g5b.b(r13, r0, r12)
            if (r13 != r4) goto L30
            goto L49
        L30:
            xd3 r13 = (defpackage.xd3) r13
            j8$a r5 = new j8$a
            java.lang.String r10 = "onError(Ljava/lang/Exception;)V"
            r11 = 4
            r6 = 2
            e8 r7 = r12.u
            java.lang.Class<e8> r8 = defpackage.e8.class
            java.lang.String r9 = "onError"
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r12.t = r2
            java.lang.Object r13 = defpackage.yd3.a(r13, r5, r12)
            if (r13 != r4) goto L4a
        L49:
            return r4
        L4a:
            xd3 r13 = (defpackage.xd3) r13
            r13.getClass()
            e8$a r12 = defpackage.e8.Companion
            b5$a r12 = b5.a.a
            r1.e(r12)
            g2b r12 = defpackage.g2b.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
