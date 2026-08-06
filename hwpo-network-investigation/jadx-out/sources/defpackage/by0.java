package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {3093}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk", v = 1)
public final class by0 extends u02 {
    public /* synthetic */ Object t;
    public final /* synthetic */ zx0<Object> u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by0(zx0 zx0Var, u02 u02Var) {
        super(u02Var);
        this.u = zx0Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        AtomicLongFieldUpdater atomicLongFieldUpdater = zx0.u;
        Object objM = this.u.M(null, 0, 0L, this);
        return objM == v72.t ? objM : new ga1(objM);
    }
}
