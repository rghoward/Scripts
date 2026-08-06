package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {114, 114}, m = "invokeSuspend", v = 1)
public final class cp9 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public og2 t;
    public int u;
    public final /* synthetic */ dp9<Object> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp9(dp9<Object> dp9Var, r02<? super cp9> r02Var) {
        super(2, r02Var);
        this.v = dp9Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new cp9(this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((cp9) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0047 A[PHI: r0 r7
      0x0047: PHI (r0v1 og2) = (r0v2 og2), (r0v3 og2) binds: [B:13:0x0044, B:9:0x0019] A[DONT_GENERATE, DONT_INLINE]
      0x0047: PHI (r7v4 java.lang.Object) = (r7v9 java.lang.Object), (r7v0 java.lang.Object) binds: [B:13:0x0044, B:9:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (r0.invoke(r7, r6) == r5) goto L17;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004f -> B:18:0x0052). Please report as a decompilation issue!!! */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = r6.u
            r1 = 0
            r2 = 2
            r3 = 1
            dp9<java.lang.Object> r4 = r6.v
            v72 r5 = defpackage.v72.t
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L19
            if (r0 != r2) goto L13
            defpackage.dv8.b(r7)
            goto L52
        L13:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r6)
            return r1
        L19:
            og2 r0 = r6.t
            defpackage.dv8.b(r7)
            goto L47
        L1f:
            defpackage.dv8.b(r7)
            i60 r7 = r4.d
            java.util.concurrent.atomic.AtomicInteger r7 = r7.a
            int r7 = r7.get()
            if (r7 <= 0) goto L5f
        L2c:
            t72 r7 = r4.a
            h72 r7 = r7.getCoroutineContext()
            defpackage.sd.d(r7)
            og2 r0 = r4.b
            zx0 r7 = r4.c
            r6.t = r0
            r6.u = r3
            r7.getClass()
            java.lang.Object r7 = defpackage.zx0.K(r7, r6)
            if (r7 != r5) goto L47
            goto L51
        L47:
            r6.t = r1
            r6.u = r2
            java.lang.Object r7 = r0.invoke(r7, r6)
            if (r7 != r5) goto L52
        L51:
            return r5
        L52:
            i60 r7 = r4.d
            java.util.concurrent.atomic.AtomicInteger r7 = r7.a
            int r7 = r7.decrementAndGet()
            if (r7 != 0) goto L2c
            g2b r6 = defpackage.g2b.a
            return r6
        L5f:
            java.lang.String r6 = "Check failed."
            defpackage.aa0.c(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cp9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
