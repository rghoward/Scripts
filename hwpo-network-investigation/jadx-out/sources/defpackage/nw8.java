package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$onRightClickDown$2", f = "RightClickGestures.kt", l = {32, 35}, m = "invokeSuspend", v = 1)
public final class nw8 extends zu8 implements ci4<yg0, r02<? super g2b>, Object> {
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ oh4<vf7, g2b> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public nw8(oh4<? super vf7, g2b> oh4Var, r02<? super nw8> r02Var) {
        super(2, r02Var);
        this.w = oh4Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        nw8 nw8Var = new nw8(this.w, r02Var);
        nw8Var.v = obj;
        return nw8Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(yg0 yg0Var, r02<? super g2b> r02Var) {
        return ((nw8) create(yg0Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r8 == r4) goto L15;
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
            r1 = 2
            r2 = 0
            r3 = 1
            v72 r4 = defpackage.v72.t
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L17
            if (r0 != r1) goto L11
            defpackage.dv8.b(r8)
            goto L50
        L11:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r7)
            return r2
        L17:
            java.lang.Object r0 = r7.v
            yg0 r0 = (defpackage.yg0) r0
            defpackage.dv8.b(r8)
            goto L32
        L1f:
            defpackage.dv8.b(r8)
            java.lang.Object r8 = r7.v
            r0 = r8
            yg0 r0 = (defpackage.yg0) r0
            r7.v = r0
            r7.u = r3
            java.lang.Object r8 = defpackage.b0a.c(r0, r7)
            if (r8 != r4) goto L32
            goto L4f
        L32:
            a58 r8 = (defpackage.a58) r8
            r8.a()
            long r5 = r8.c
            vf7 r8 = new vf7
            r8.<init>(r5)
            oh4<vf7, g2b> r3 = r7.w
            r3.invoke(r8)
            r7.v = r2
            r7.u = r1
            s48 r8 = defpackage.s48.u
            java.lang.Object r8 = defpackage.o8a.i(r0, r8, r7)
            if (r8 != r4) goto L50
        L4f:
            return r4
        L50:
            a58 r8 = (defpackage.a58) r8
            if (r8 == 0) goto L57
            r8.a()
        L57:
            g2b r7 = defpackage.g2b.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nw8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
