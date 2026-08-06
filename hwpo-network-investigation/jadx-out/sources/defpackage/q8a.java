package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", l = {254}, m = "invokeSuspend", v = 1)
public final class q8a extends zu8 implements ci4<yg0, r02<? super a58>, Object> {
    public long u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ a58 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8a(a58 a58Var, r02<? super q8a> r02Var) {
        super(2, r02Var);
        this.x = a58Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        q8a q8aVar = new q8a(this.x, r02Var);
        q8aVar.w = obj;
        return q8aVar;
    }

    @Override // defpackage.ci4
    public final Object invoke(yg0 yg0Var, r02<? super a58> r02Var) {
        return ((q8a) create(yg0Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0047 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003c -> B:12:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ak0
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.v
            r1 = 1
            if (r0 == 0) goto L18
            if (r0 != r1) goto L11
            long r2 = r6.u
            java.lang.Object r0 = r6.w
            yg0 r0 = (defpackage.yg0) r0
            defpackage.dv8.b(r7)
            goto L3f
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r6)
            r6 = 0
            return r6
        L18:
            defpackage.dv8.b(r7)
            java.lang.Object r7 = r6.w
            yg0 r7 = (defpackage.yg0) r7
            a58 r0 = r6.x
            long r2 = r0.b
            lgb r0 = r7.getViewConfiguration()
            r0.getClass()
            r4 = 40
            long r4 = r4 + r2
            r0 = r7
            r2 = r4
        L2f:
            r6.w = r0
            r6.u = r2
            r6.v = r1
            r7 = 3
            java.lang.Object r7 = defpackage.o8a.b(r0, r6, r7)
            v72 r4 = defpackage.v72.t
            if (r7 != r4) goto L3f
            return r4
        L3f:
            a58 r7 = (defpackage.a58) r7
            long r4 = r7.b
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 < 0) goto L2f
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q8a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
