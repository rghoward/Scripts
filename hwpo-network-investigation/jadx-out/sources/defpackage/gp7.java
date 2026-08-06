package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$3", f = "PageFetcherSnapshot.kt", l = {647, 252}, m = "invokeSuspend", v = 1)
public final class gp7 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public hp7.a t;
    public a47 u;
    public uo7 v;
    public int w;
    public final /* synthetic */ uo7<Object, Object> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp7(uo7<Object, Object> uo7Var, r02<? super gp7> r02Var) {
        super(2, r02Var);
        this.x = uo7Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new gp7(this.x, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((gp7) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (defpackage.uo7.a(r0, r8, defpackage.wb6.v, r7) == r4) goto L17;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            int r0 = r7.w
            r1 = 2
            r2 = 1
            r3 = 0
            v72 r4 = defpackage.v72.t
            if (r0 == 0) goto L21
            if (r0 == r2) goto L17
            if (r0 != r1) goto L11
            defpackage.dv8.b(r8)
            goto L60
        L11:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r7)
            return r3
        L17:
            uo7 r0 = r7.v
            a47 r2 = r7.u
            hp7$a r5 = r7.t
            defpackage.dv8.b(r8)
            goto L3a
        L21:
            defpackage.dv8.b(r8)
            uo7<java.lang.Object, java.lang.Object> r0 = r7.x
            hp7$a<Key, Value> r5 = r0.h
            a47 r8 = r5.a
            r7.t = r5
            r7.u = r8
            r7.v = r0
            r7.w = r2
            java.lang.Object r2 = r8.b(r7)
            if (r2 != r4) goto L39
            goto L5f
        L39:
            r2 = r8
        L3a:
            hp7<Key, Value> r8 = r5.b     // Catch: java.lang.Throwable -> L63
            zx0 r5 = r8.f     // Catch: java.lang.Throwable -> L63
            q91 r5 = defpackage.yk2.g(r5)     // Catch: java.lang.Throwable -> L63
            ip7 r6 = new ip7     // Catch: java.lang.Throwable -> L63
            r6.<init>(r8, r3)     // Catch: java.lang.Throwable -> L63
            m64 r8 = new m64     // Catch: java.lang.Throwable -> L63
            r8.<init>(r5, r6)     // Catch: java.lang.Throwable -> L63
            r2.c(r3)
            r7.t = r3
            r7.u = r3
            r7.v = r3
            r7.w = r1
            wb6 r1 = defpackage.wb6.v
            java.lang.Object r7 = defpackage.uo7.a(r0, r8, r1, r7)
            if (r7 != r4) goto L60
        L5f:
            return r4
        L60:
            g2b r7 = defpackage.g2b.a
            return r7
        L63:
            r7 = move-exception
            r2.c(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gp7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
