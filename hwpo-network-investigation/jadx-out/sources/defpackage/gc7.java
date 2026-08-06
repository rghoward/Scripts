package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$untilNull$1", f = "NonTouchScrollingLogic.kt", l = {89}, m = "invokeSuspend", v = 1)
public final class gc7 extends zu8 implements ci4<ad9<Object>, r02<? super g2b>, Object> {
    public Object u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ mh4<Object> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc7(mh4<Object> mh4Var, r02<? super gc7> r02Var) {
        super(2, r02Var);
        this.x = mh4Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        gc7 gc7Var = new gc7(this.x, r02Var);
        gc7Var.w = obj;
        return gc7Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(ad9<Object> ad9Var, r02<? super g2b> r02Var) {
        return ((gc7) create(ad9Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0034 -> B:14:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:13:0x0034
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ak0
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.v
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            if (r0 != r2) goto L12
            java.lang.Object r0 = r4.u
            java.lang.Object r3 = r4.w
            ad9 r3 = (defpackage.ad9) r3
            defpackage.dv8.b(r5)
            goto L35
        L12:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r4)
            return r1
        L18:
            defpackage.dv8.b(r5)
            java.lang.Object r5 = r4.w
            ad9 r5 = (defpackage.ad9) r5
            r3 = r5
        L20:
            mh4<java.lang.Object> r5 = r4.x
            java.lang.Object r5 = r5.invoke()
            if (r5 == 0) goto L34
            r4.w = r3
            r4.u = r5
            r4.v = r2
            r3.a(r4, r5)
            v72 r4 = defpackage.v72.t
            return r4
        L34:
            r0 = r1
        L35:
            if (r0 != 0) goto L20
            g2b r4 = defpackage.g2b.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gc7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
