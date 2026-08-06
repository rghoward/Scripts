package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$1", f = "TextFieldSelectionManager.kt", l = {228, 230}, m = "invokeSuspend", v = 1)
public final class iga extends p6a implements ci4<vf7, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ long u;
    public final /* synthetic */ qga v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iga(qga qgaVar, r02<? super iga> r02Var) {
        super(2, r02Var);
        this.v = qgaVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        iga igaVar = new iga(this.v, r02Var);
        igaVar.u = ((vf7) obj).a;
        return igaVar;
    }

    @Override // defpackage.ci4
    public final Object invoke(vf7 vf7Var, r02<? super g2b> r02Var) {
        long j = vf7Var.a;
        iga igaVar = new iga(this.v, r02Var);
        igaVar.u = j;
        return igaVar.invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        if (r8.b(r0, r5, r7) == r4) goto L19;
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
            qga r3 = r7.v
            v72 r4 = defpackage.v72.t
            if (r0 == 0) goto L1d
            if (r0 == r2) goto L19
            if (r0 != r1) goto L12
            defpackage.dv8.b(r8)
            goto L4a
        L12:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r7)
            r7 = 0
            return r7
        L19:
            defpackage.dv8.b(r8)
            goto L2d
        L1d:
            defpackage.dv8.b(r8)
            long r5 = r7.u
            r7.u = r5
            r7.t = r2
            java.lang.Object r8 = r3.s(r7)
            if (r8 != r4) goto L2d
            goto L49
        L2d:
            js7 r8 = defpackage.qga.a(r3)
            if (r8 == 0) goto L4a
            A r0 = r8.t
            java.lang.String r0 = (java.lang.String) r0
            B r8 = r8.u
            lja r8 = (defpackage.lja) r8
            long r5 = r8.a
            j18 r8 = r3.i
            if (r8 == 0) goto L4a
            r7.t = r1
            java.lang.Object r7 = r8.b(r0, r5, r7)
            if (r7 != r4) goto L4a
        L49:
            return r4
        L4a:
            g2b r7 = defpackage.g2b.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iga.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
