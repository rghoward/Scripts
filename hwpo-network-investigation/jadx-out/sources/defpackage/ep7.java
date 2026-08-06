package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$2", f = "PageFetcherSnapshot.kt", l = {647, 193}, m = "invokeSuspend", v = 1)
public final class ep7 extends p6a implements ci4<s54<? super oo7<Object>>, r02<? super g2b>, Object> {
    public a47 t;
    public s54 u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ uo7<Object, Object> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep7(uo7<Object, Object> uo7Var, r02<? super ep7> r02Var) {
        super(2, r02Var);
        this.x = uo7Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        ep7 ep7Var = new ep7(this.x, r02Var);
        ep7Var.w = obj;
        return ep7Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(s54<? super oo7<Object>> s54Var, r02<? super g2b> r02Var) {
        return ((ep7) create(s54Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (r0.emit(r2, r6) == r4) goto L17;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = r6.v
            r1 = 2
            r2 = 1
            r3 = 0
            v72 r4 = defpackage.v72.t
            if (r0 == 0) goto L23
            if (r0 == r2) goto L17
            if (r0 != r1) goto L11
            defpackage.dv8.b(r7)
            goto L60
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r6)
            return r3
        L17:
            s54 r0 = r6.u
            a47 r2 = r6.t
            java.lang.Object r5 = r6.w
            hp7$a r5 = (hp7.a) r5
            defpackage.dv8.b(r7)
            goto L41
        L23:
            defpackage.dv8.b(r7)
            java.lang.Object r7 = r6.w
            r0 = r7
            s54 r0 = (defpackage.s54) r0
            uo7<java.lang.Object, java.lang.Object> r7 = r6.x
            hp7$a<Key, Value> r5 = r7.h
            a47 r7 = r5.a
            r6.w = r5
            r6.t = r7
            r6.u = r0
            r6.v = r2
            java.lang.Object r2 = r7.b(r6)
            if (r2 != r4) goto L40
            goto L5f
        L40:
            r2 = r7
        L41:
            hp7<Key, Value> r7 = r5.b     // Catch: java.lang.Throwable -> L63
            l27 r7 = r7.h     // Catch: java.lang.Throwable -> L63
            vb6 r7 = r7.d()     // Catch: java.lang.Throwable -> L63
            r2.c(r3)
            oo7$c r2 = new oo7$c
            r2.<init>(r7, r3)
            r6.w = r3
            r6.t = r3
            r6.u = r3
            r6.v = r1
            java.lang.Object r6 = r0.emit(r2, r6)
            if (r6 != r4) goto L60
        L5f:
            return r4
        L60:
            g2b r6 = defpackage.g2b.a
            return r6
        L63:
            r6 = move-exception
            r2.c(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ep7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
