package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.gestures.TrackpadScrollingLogic$dispatchTrackpadScroll$3", f = "TrackpadScrollingLogic.kt", l = {178}, m = "invokeSuspend", v = 1)
public final class tua extends p6a implements ci4<k97, r02<? super g2b>, Object> {
    public gl8 t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ rua w;
    public final /* synthetic */ z79 x;
    public final /* synthetic */ gl8<rua.a> y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tua(rua ruaVar, z79 z79Var, gl8<rua.a> gl8Var, r02<? super tua> r02Var) {
        super(2, r02Var);
        this.w = ruaVar;
        this.x = z79Var;
        this.y = gl8Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        tua tuaVar = new tua(this.w, this.x, this.y, r02Var);
        tuaVar.v = obj;
        return tuaVar;
    }

    @Override // defpackage.ci4
    public final Object invoke(k97 k97Var, r02<? super g2b> r02Var) {
        return ((tua) create(k97Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0057  */
    /* JADX WARN: Code duplicated, block: B:13:0x006c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x006d  */
    /* JADX WARN: Code duplicated, block: B:17:0x00a5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23, types: [T, rua$a] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x006d -> B:15:0x006f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ak0
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tua.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
