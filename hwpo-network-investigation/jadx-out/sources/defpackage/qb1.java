package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.core.domain.usecase.user.CheckDeviceTokenUseCase$observeFcmTokenChanges$2", f = "CheckDeviceTokenUseCase.kt", l = {31, 32}, m = "invokeSuspend", v = 2)
public final class qb1 extends p6a implements ci4<String, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ rb1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb1(rb1 rb1Var, r02<? super qb1> r02Var) {
        super(2, r02Var);
        this.v = rb1Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        qb1 qb1Var = new qb1(this.v, r02Var);
        qb1Var.u = obj;
        return qb1Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(String str, r02<? super g2b> r02Var) {
        return ((qb1) create(str, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r8.b(r0) == r6) goto L15;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.Object r0 = r7.u
            java.lang.String r0 = (java.lang.String) r0
            int r1 = r7.t
            r2 = 0
            rb1 r3 = r7.v
            r4 = 2
            r5 = 1
            v72 r6 = defpackage.v72.t
            if (r1 == 0) goto L21
            if (r1 == r5) goto L1d
            if (r1 != r4) goto L17
            defpackage.dv8.b(r8)
            goto L3e
        L17:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r7)
            return r2
        L1d:
            defpackage.dv8.b(r8)
            goto L31
        L21:
            defpackage.dv8.b(r8)
            w5b r8 = r3.c
            r7.u = r0
            r7.t = r5
            java.lang.Object r8 = r8.h(r0, r7)
            if (r8 != r6) goto L31
            goto L3d
        L31:
            xg5 r8 = r3.b
            r7.u = r2
            r7.t = r4
            g2b r7 = r8.b(r0)
            if (r7 != r6) goto L3e
        L3d:
            return r6
        L3e:
            g2b r7 = defpackage.g2b.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
