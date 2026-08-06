package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.affiliated_gym.presentation.filters.location_filter.GymLocationFilterViewModel$initData$1", f = "GymLocationFilterViewModel.kt", l = {110, 111}, m = "invokeSuspend", v = 2)
public final class sr4 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ rr4 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr4(rr4 rr4Var, r02<? super sr4> r02Var) {
        super(2, r02Var);
        this.u = rr4Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new sr4(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((sr4) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        if (r6 == r5) goto L30;
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
            rr4 r2 = r6.u
            r3 = 2
            r4 = 1
            v72 r5 = defpackage.v72.t
            if (r0 == 0) goto L1d
            if (r0 == r4) goto L19
            if (r0 != r3) goto L13
            defpackage.dv8.b(r7)
            goto L68
        L13:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r6)
            return r1
        L19:
            defpackage.dv8.b(r7)
            goto L29
        L1d:
            defpackage.dv8.b(r7)
            r6.t = r4
            java.lang.Object r7 = defpackage.rr4.g(r2, r6)
            if (r7 != r5) goto L29
            goto L67
        L29:
            r6.t = r3
            ed6 r7 = r2.J
            boolean r0 = r7 instanceof ed6.a
            if (r0 == 0) goto L3a
            ve7 r7 = r2.z
            g2b r0 = defpackage.g2b.a
            e84 r7 = r7.b(r0)
            goto L46
        L3a:
            boolean r7 = r7 instanceof ed6.b
            if (r7 == 0) goto L6b
            ye7 r7 = r2.A
            g2b r0 = defpackage.g2b.a
            e84 r7 = r7.b(r0)
        L46:
            zr4 r0 = new zr4
            r0.<init>(r2, r1)
            k74$a r1 = new k74$a
            jc7 r2 = defpackage.jc7.t
            r1.<init>(r2, r0)
            java.lang.Object r6 = r7.collect(r1, r6)
            if (r6 != r5) goto L59
            goto L5b
        L59:
            g2b r6 = defpackage.g2b.a
        L5b:
            if (r6 != r5) goto L5e
            goto L60
        L5e:
            g2b r6 = defpackage.g2b.a
        L60:
            if (r6 != r5) goto L63
            goto L65
        L63:
            g2b r6 = defpackage.g2b.a
        L65:
            if (r6 != r5) goto L68
        L67:
            return r5
        L68:
            g2b r6 = defpackage.g2b.a
            return r6
        L6b:
            defpackage.u.b()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sr4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
