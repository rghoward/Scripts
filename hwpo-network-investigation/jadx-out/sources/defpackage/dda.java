package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode$show$1", f = "TextContextMenuToolbarHandlerModifier.kt", l = {205, 206, 208, 208}, m = "invokeSuspend", v = 1)
public final class dda extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public Throwable t;
    public int u;
    public final /* synthetic */ eda v;
    public final /* synthetic */ wca w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dda(eda edaVar, wca wcaVar, r02<? super dda> r02Var) {
        super(2, r02Var);
        this.v = edaVar;
        this.w = wcaVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new dda(this.v, this.w, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((dda) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        if (r8.invoke(r7) == r6) goto L37;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            int r0 = r7.u
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            eda r5 = r7.v
            v72 r6 = defpackage.v72.t
            if (r0 == 0) goto L2f
            if (r0 == r4) goto L2b
            if (r0 == r3) goto L25
            if (r0 == r2) goto L21
            if (r0 == r1) goto L1b
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r7)
            r7 = 0
            return r7
        L1b:
            java.lang.Throwable r7 = r7.t
            defpackage.dv8.b(r8)
            goto L6a
        L21:
            defpackage.dv8.b(r8)
            goto L57
        L25:
            defpackage.dv8.b(r8)     // Catch: java.lang.Throwable -> L29
            goto L4a
        L29:
            r8 = move-exception
            goto L5a
        L2b:
            defpackage.dv8.b(r8)     // Catch: java.lang.Throwable -> L29
            goto L3f
        L2f:
            defpackage.dv8.b(r8)
            oh4<? super r02<? super g2b>, ? extends java.lang.Object> r8 = r5.K     // Catch: java.lang.Throwable -> L29
            if (r8 == 0) goto L3f
            r7.u = r4     // Catch: java.lang.Throwable -> L29
            java.lang.Object r8 = r8.invoke(r7)     // Catch: java.lang.Throwable -> L29
            if (r8 != r6) goto L3f
            goto L68
        L3f:
            wca r8 = r7.w     // Catch: java.lang.Throwable -> L29
            r7.u = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r8 = r8.a(r5, r7)     // Catch: java.lang.Throwable -> L29
            if (r8 != r6) goto L4a
            goto L68
        L4a:
            oh4<? super r02<? super g2b>, ? extends java.lang.Object> r8 = r5.L
            if (r8 == 0) goto L57
            r7.u = r2
            java.lang.Object r7 = r8.invoke(r7)
            if (r7 != r6) goto L57
            goto L68
        L57:
            g2b r7 = defpackage.g2b.a
            return r7
        L5a:
            oh4<? super r02<? super g2b>, ? extends java.lang.Object> r0 = r5.L
            if (r0 == 0) goto L6b
            r7.t = r8
            r7.u = r1
            java.lang.Object r7 = r0.invoke(r7)
            if (r7 != r6) goto L69
        L68:
            return r6
        L69:
            r7 = r8
        L6a:
            r8 = r7
        L6b:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dda.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
