package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.add_value.AddValueViewModel$initData$1", f = "AddValueViewModel.kt", l = {138, 139}, m = "invokeSuspend", v = 2)
public final class hd extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ gd u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd(gd gdVar, r02<? super hd> r02Var) {
        super(2, r02Var);
        this.u = gdVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new hd(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((hd) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (r0 == r5) goto L23;
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
            gd r2 = r6.u
            r3 = 2
            r4 = 1
            v72 r5 = defpackage.v72.t
            if (r0 == 0) goto L1d
            if (r0 == r4) goto L19
            if (r0 != r3) goto L13
            defpackage.dv8.b(r7)
            goto L53
        L13:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r6)
            return r1
        L19:
            defpackage.dv8.b(r7)
            goto L2b
        L1d:
            defpackage.dv8.b(r7)
            r6.t = r4
            java.lang.String r7 = ""
            java.lang.Object r7 = defpackage.gd.g(r2, r7, r6)
            if (r7 != r5) goto L2b
            goto L52
        L2b:
            r6.t = r3
            pf7 r7 = r2.z
            g2b r0 = defpackage.g2b.a
            e84 r7 = r7.b(r0)
            rd r3 = new rd
            r3.<init>(r2, r1)
            k74$a r1 = new k74$a
            jc7 r2 = defpackage.jc7.t
            r1.<init>(r2, r3)
            java.lang.Object r6 = r7.collect(r1, r6)
            if (r6 != r5) goto L48
            goto L49
        L48:
            r6 = r0
        L49:
            if (r6 != r5) goto L4c
            goto L4d
        L4c:
            r6 = r0
        L4d:
            if (r6 != r5) goto L50
            r0 = r6
        L50:
            if (r0 != r5) goto L53
        L52:
            return r5
        L53:
            g2b r6 = defpackage.g2b.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
