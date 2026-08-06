package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {77, 81}, m = "invokeSuspend", v = 1)
public final class te6 extends zu8 implements ci4<yg0, r02<? super g2b>, Object> {
    public a58 u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ lda x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te6(lda ldaVar, r02<? super te6> r02Var) {
        super(2, r02Var);
        this.x = ldaVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        te6 te6Var = new te6(this.x, r02Var);
        te6Var.w = obj;
        return te6Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(yg0 yg0Var, r02<? super g2b> r02Var) {
        return ((te6) create(yg0Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r13 == r4) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (r13 == r4) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        return r4;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004f -> B:17:0x0052). Please report as a decompilation issue!!! */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            int r0 = r12.v
            lda r1 = r12.x
            r2 = 2
            r3 = 1
            v72 r4 = defpackage.v72.t
            if (r0 == 0) goto L27
            if (r0 == r3) goto L1f
            if (r0 != r2) goto L18
            a58 r0 = r12.u
            java.lang.Object r3 = r12.w
            yg0 r3 = (defpackage.yg0) r3
            defpackage.dv8.b(r13)
            goto L52
        L18:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r12)
            r12 = 0
            return r12
        L1f:
            java.lang.Object r0 = r12.w
            yg0 r0 = (defpackage.yg0) r0
            defpackage.dv8.b(r13)
            goto L3a
        L27:
            defpackage.dv8.b(r13)
            java.lang.Object r13 = r12.w
            r0 = r13
            yg0 r0 = (defpackage.yg0) r0
            r12.w = r0
            r12.v = r3
            java.lang.Object r13 = defpackage.o8a.b(r0, r12, r2)
            if (r13 != r4) goto L3a
            goto L51
        L3a:
            a58 r13 = (defpackage.a58) r13
            long r5 = r13.c
            r1.d()
            r3 = r0
            r0 = r13
        L43:
            r12.w = r3
            r12.u = r0
            r12.v = r2
            s48 r13 = defpackage.s48.u
            java.lang.Object r13 = r3.h1(r13, r12)
            if (r13 != r4) goto L52
        L51:
            return r4
        L52:
            r48 r13 = (defpackage.r48) r13
            java.util.List<a58> r13 = r13.a
            int r5 = r13.size()
            r6 = 0
        L5b:
            if (r6 >= r5) goto L75
            java.lang.Object r7 = r13.get(r6)
            a58 r7 = (defpackage.a58) r7
            long r8 = r7.a
            long r10 = r0.a
            boolean r8 = defpackage.zj7.a(r8, r10)
            if (r8 == 0) goto L72
            boolean r7 = r7.d
            if (r7 == 0) goto L72
            goto L43
        L72:
            int r6 = r6 + 1
            goto L5b
        L75:
            r1.c()
            g2b r12 = defpackage.g2b.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
