package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$2", f = "TextFieldSelectionManager.kt", l = {241, 243}, m = "invokeSuspend", v = 1)
public final class jga extends p6a implements oh4<r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ qga u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jga(qga qgaVar, r02<? super jga> r02Var) {
        super(1, r02Var);
        this.u = qgaVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(r02<?> r02Var) {
        return new jga(this.u, r02Var);
    }

    @Override // defpackage.oh4
    public final Object invoke(r02<? super g2b> r02Var) {
        return ((jga) create(r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (r8.a(r0, r5, r7) == r4) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            int r0 = r7.t
            r1 = 2
            r2 = 1
            qga r3 = r7.u
            v72 r4 = defpackage.v72.t
            if (r0 == 0) goto L1d
            if (r0 == r2) goto L19
            if (r0 != r1) goto L12
            defpackage.dv8.b(r8)
            goto L46
        L12:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r7)
            r7 = 0
            return r7
        L19:
            defpackage.dv8.b(r8)
            goto L29
        L1d:
            defpackage.dv8.b(r8)
            r7.t = r2
            java.lang.Object r8 = r3.s(r7)
            if (r8 != r4) goto L29
            goto L45
        L29:
            js7 r8 = defpackage.qga.a(r3)
            if (r8 == 0) goto L46
            A r0 = r8.t
            java.lang.String r0 = (java.lang.String) r0
            B r8 = r8.u
            lja r8 = (defpackage.lja) r8
            long r5 = r8.a
            j18 r8 = r3.i
            if (r8 == 0) goto L46
            r7.t = r1
            java.lang.Object r7 = r8.a(r0, r5, r7)
            if (r7 != r4) goto L46
        L45:
            return r4
        L46:
            r3.B = r2
            g2b r7 = defpackage.g2b.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jga.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
