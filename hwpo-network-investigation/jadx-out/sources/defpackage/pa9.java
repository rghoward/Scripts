package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitSelectionGestures$2", f = "SelectionGestures.kt", l = {111, 119, 122, 124}, m = "invokeSuspend", v = 1)
public final class pa9 extends zu8 implements ci4<yg0, r02<? super g2b>, Object> {
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ cf1 w;
    public final /* synthetic */ bz6 x;
    public final /* synthetic */ lda y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa9(cf1 cf1Var, bz6 bz6Var, lda ldaVar, r02<? super pa9> r02Var) {
        super(2, r02Var);
        this.w = cf1Var;
        this.x = bz6Var;
        this.y = ldaVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        pa9 pa9Var = new pa9(this.w, this.x, this.y, r02Var);
        pa9Var.v = obj;
        return pa9Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(yg0 yg0Var, r02<? super g2b> r02Var) {
        return ((pa9) create(yg0Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007d  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b0, code lost:
    
        if (defpackage.wa9.c(r1, r18.x, r9, r8, r18) == r7) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c4, code lost:
    
        if (defpackage.wa9.d(r1, r3, r8, r18) == r7) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
    
        if (defpackage.wa9.b(r1, r3, r8, r2, r18) == r7) goto L45;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pa9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
