package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", l = {213, 213}, m = "invokeSuspend", v = 1)
public final class z64 extends p6a implements ei4<s54<Object>, Object, r02<? super g2b>, Object> {
    public s54 t;
    public int u;
    public /* synthetic */ s54 v;
    public /* synthetic */ Object w;
    public final /* synthetic */ ci4<Object, r02<Object>, Object> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z64(ci4<Object, ? super r02<Object>, ? extends Object> ci4Var, r02<? super z64> r02Var) {
        super(3, r02Var);
        this.x = ci4Var;
    }

    @Override // defpackage.ei4
    public final Object invoke(s54<Object> s54Var, Object obj, r02<? super g2b> r02Var) {
        z64 z64Var = new z64(this.x, r02Var);
        z64Var.v = s54Var;
        z64Var.w = obj;
        return z64Var.invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (r0.emit(r8, r7) == r6) goto L15;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            s54 r0 = r7.v
            java.lang.Object r1 = r7.w
            int r2 = r7.u
            r3 = 2
            r4 = 1
            r5 = 0
            v72 r6 = defpackage.v72.t
            if (r2 == 0) goto L21
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.dv8.b(r8)
            goto L44
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r7)
            return r5
        L1b:
            s54 r0 = r7.t
            defpackage.dv8.b(r8)
            goto L35
        L21:
            defpackage.dv8.b(r8)
            r7.v = r5
            r7.w = r5
            r7.t = r0
            r7.u = r4
            ci4<java.lang.Object, r02<java.lang.Object>, java.lang.Object> r8 = r7.x
            java.lang.Object r8 = r8.invoke(r1, r7)
            if (r8 != r6) goto L35
            goto L43
        L35:
            r7.v = r5
            r7.w = r5
            r7.t = r5
            r7.u = r3
            java.lang.Object r7 = r0.emit(r8, r7)
            if (r7 != r6) goto L44
        L43:
            return r6
        L44:
            g2b r7 = defpackage.g2b.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z64.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
