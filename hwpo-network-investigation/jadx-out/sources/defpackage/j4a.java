package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {475, 479}, m = "onSubscription", v = 1)
public final class j4a extends u02 {
    public kz8 t;
    public /* synthetic */ Object u;
    public final /* synthetic */ k4a<Object> v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4a(k4a k4aVar, u02 u02Var) {
        super(u02Var);
        this.v = k4aVar;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.a(this);
    }
}
