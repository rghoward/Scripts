package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2", f = "TapGestureDetector.kt", l = {412, 435}, m = "invokeSuspend", v = 1)
public final class h9a extends zu8 implements ci4<yg0, r02<? super g2b>, Object> {
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ s48 w;
    public final /* synthetic */ gl8<pe6> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9a(s48 s48Var, gl8<pe6> gl8Var, r02<? super h9a> r02Var) {
        super(2, r02Var);
        this.w = s48Var;
        this.x = gl8Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        h9a h9aVar = new h9a(this.w, this.x, r02Var);
        h9aVar.v = obj;
        return h9aVar;
    }

    @Override // defpackage.ci4
    public final Object invoke(yg0 yg0Var, r02<? super g2b> r02Var) {
        return ((h9a) create(yg0Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8 A[LOOP:1: B:16:0x0047->B:41:0x00b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0084 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v1, types: [T, pe6$b] */
    /* JADX WARN: Type inference failed for: r14v2, types: [T, pe6$a] */
    /* JADX WARN: Type inference failed for: r14v3, types: [T, pe6$c] */
    /* JADX WARN: Type inference failed for: r14v5, types: [T, pe6$a] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0093 -> B:34:0x0096). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ak0
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h9a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
