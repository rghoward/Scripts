package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode$tryShowContextMenu$1", f = "TextContextMenuGesturesModifier.kt", l = {107, 108}, m = "invokeSuspend", v = 1)
public final class lca extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ kca u;
    public final /* synthetic */ long v;
    public final /* synthetic */ wca w;
    public final /* synthetic */ kca.a x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lca(kca kcaVar, long j, wca wcaVar, kca.a aVar, r02<? super lca> r02Var) {
        super(2, r02Var);
        this.u = kcaVar;
        this.v = j;
        this.w = wcaVar;
        this.x = aVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new lca(this.u, this.v, this.w, this.x, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((lca) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r6.w.a(r6.x, r6) == r3) goto L17;
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
            r1 = 2
            r2 = 1
            v72 r3 = defpackage.v72.t
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            defpackage.dv8.b(r7)
            goto L41
        L10:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r6)
            r6 = 0
            return r6
        L17:
            defpackage.dv8.b(r7)
            goto L34
        L1b:
            defpackage.dv8.b(r7)
            kca r7 = r6.u
            ci4<? super vf7, ? super r02<? super g2b>, ? extends java.lang.Object> r7 = r7.J
            if (r7 == 0) goto L34
            vf7 r0 = new vf7
            long r4 = r6.v
            r0.<init>(r4)
            r6.t = r2
            java.lang.Object r7 = r7.invoke(r0, r6)
            if (r7 != r3) goto L34
            goto L40
        L34:
            r6.t = r1
            wca r7 = r6.w
            kca$a r0 = r6.x
            java.lang.Object r6 = r7.a(r0, r6)
            if (r6 != r3) goto L41
        L40:
            return r3
        L41:
            g2b r6 = defpackage.g2b.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lca.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
