package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$launchAwaitingReset$1", f = "TapGestureDetector.kt", l = {474, 475}, m = "invokeSuspend", v = 1)
public final class u8a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ el5 v;
    public final /* synthetic */ ci4<t72, r02<? super g2b>, Object> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u8a(el5 el5Var, ci4<? super t72, ? super r02<? super g2b>, ? extends Object> ci4Var, r02<? super u8a> r02Var) {
        super(2, r02Var);
        this.v = el5Var;
        this.w = ci4Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        u8a u8aVar = new u8a(this.v, this.w, r02Var);
        u8aVar.u = obj;
        return u8aVar;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((u8a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r5.w.invoke(r0, r5) == r4) goto L15;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            int r0 = r5.t
            r1 = 0
            r2 = 2
            r3 = 1
            v72 r4 = defpackage.v72.t
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            defpackage.dv8.b(r6)
            goto L41
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r5)
            return r1
        L17:
            java.lang.Object r0 = r5.u
            t72 r0 = (defpackage.t72) r0
            defpackage.dv8.b(r6)
            goto L34
        L1f:
            defpackage.dv8.b(r6)
            java.lang.Object r6 = r5.u
            r0 = r6
            t72 r0 = (defpackage.t72) r0
            r5.u = r0
            r5.t = r3
            el5 r6 = r5.v
            java.lang.Object r6 = r6.p0(r5)
            if (r6 != r4) goto L34
            goto L40
        L34:
            r5.u = r1
            r5.t = r2
            ci4<t72, r02<? super g2b>, java.lang.Object> r6 = r5.w
            java.lang.Object r5 = r6.invoke(r0, r5)
            if (r5 != r4) goto L41
        L40:
            return r4
        L41:
            g2b r5 = defpackage.g2b.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u8a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
