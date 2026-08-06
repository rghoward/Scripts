package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", l = {29, 29}, m = "invokeSuspend", v = 1)
public final class n74 extends p6a implements ei4<s54<Object>, Object[], r02<? super g2b>, Object> {
    public s54 t;
    public int u;
    public /* synthetic */ s54 v;
    public /* synthetic */ Object[] w;
    public final /* synthetic */ ei4<Object, Object, r02<Object>, Object> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n74(ei4<Object, Object, ? super r02<Object>, ? extends Object> ei4Var, r02<? super n74> r02Var) {
        super(3, r02Var);
        this.x = ei4Var;
    }

    @Override // defpackage.ei4
    public final Object invoke(s54<Object> s54Var, Object[] objArr, r02<? super g2b> r02Var) {
        n74 n74Var = new n74(this.x, r02Var);
        n74Var.v = s54Var;
        n74Var.w = objArr;
        return n74Var.invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
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
            java.lang.Object[] r1 = r7.w
            int r2 = r7.u
            r3 = 2
            r4 = 1
            r5 = 0
            v72 r6 = defpackage.v72.t
            if (r2 == 0) goto L21
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.dv8.b(r8)
            goto L49
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r7)
            return r5
        L1b:
            s54 r0 = r7.t
            defpackage.dv8.b(r8)
            goto L3a
        L21:
            defpackage.dv8.b(r8)
            r8 = 0
            r8 = r1[r8]
            r1 = r1[r4]
            r7.v = r5
            r7.w = r5
            r7.t = r0
            r7.u = r4
            ei4<java.lang.Object, java.lang.Object, r02<java.lang.Object>, java.lang.Object> r2 = r7.x
            java.lang.Object r8 = r2.invoke(r8, r1, r7)
            if (r8 != r6) goto L3a
            goto L48
        L3a:
            r7.v = r5
            r7.w = r5
            r7.t = r5
            r7.u = r3
            java.lang.Object r7 = r0.emit(r8, r7)
            if (r7 != r6) goto L49
        L48:
            return r6
        L49:
            g2b r7 = defpackage.g2b.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n74.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
