package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.datastore.core.DataStoreImpl$readState$2", f = "DataStoreImpl.kt", l = {232, 240}, m = "invokeSuspend", v = 1)
public final class mg2 extends p6a implements ci4<t72, r02<? super xz9<Object>>, Object> {
    public int t;
    public final /* synthetic */ xf2<Object> u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg2(xf2 xf2Var, r02 r02Var) {
        super(2, r02Var);
        this.u = xf2Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new mg2(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super xz9<Object>> r02Var) {
        return ((mg2) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (r7 == r5) goto L20;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            xf2<java.lang.Object> r0 = r6.u
            rg2 r1 = r0.h
            int r2 = r6.t
            r3 = 2
            r4 = 1
            v72 r5 = defpackage.v72.t
            if (r2 == 0) goto L1f
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L14
            defpackage.dv8.b(r7)
            goto L42
        L14:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r6)
            r6 = 0
            return r6
        L1b:
            defpackage.dv8.b(r7)     // Catch: java.lang.Throwable -> L45
            goto L38
        L1f:
            defpackage.dv8.b(r7)
            xz9 r7 = r1.a()
            boolean r7 = r7 instanceof defpackage.yz3
            if (r7 == 0) goto L2f
            xz9 r6 = r1.a()
            return r6
        L2f:
            r6.t = r4     // Catch: java.lang.Throwable -> L45
            java.lang.Object r7 = defpackage.xf2.e(r0, r6)     // Catch: java.lang.Throwable -> L45
            if (r7 != r5) goto L38
            goto L41
        L38:
            r6.t = r3
            r7 = 0
            java.lang.Object r7 = defpackage.xf2.f(r0, r7, r6)
            if (r7 != r5) goto L42
        L41:
            return r5
        L42:
            xz9 r7 = (defpackage.xz9) r7
            return r7
        L45:
            r6 = move-exception
            di8 r7 = new di8
            r0 = -1
            r7.<init>(r6, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mg2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
