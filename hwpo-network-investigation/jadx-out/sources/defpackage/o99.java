package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", l = {450, 453}, m = "doSelectSuspend", v = 1)
public final class o99 extends u02 {
    public /* synthetic */ Object t;
    public final /* synthetic */ n99<Object> u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o99(n99 n99Var, u02 u02Var) {
        super(u02Var);
        this.u = n99Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n99.y;
        return this.u.g(this);
    }
}
