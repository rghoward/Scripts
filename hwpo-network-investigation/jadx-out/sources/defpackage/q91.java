package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class q91<T> extends u91<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater y = AtomicIntegerFieldUpdater.newUpdater(q91.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;
    public final tj8<T> w;
    public final boolean x;

    public /* synthetic */ q91(tj8 tj8Var, boolean z) {
        this(tj8Var, z, ff3.t, -3, xx0.t);
    }

    @Override // defpackage.u91, defpackage.r54
    public final Object collect(s54<? super T> s54Var, r02<? super g2b> r02Var) throws Throwable {
        int i = this.u;
        v72 v72Var = v72.t;
        if (i != -3) {
            Object objCollect = super.collect(s54Var, r02Var);
            return objCollect == v72Var ? objCollect : g2b.a;
        }
        boolean z = this.x;
        if (z && y.getAndSet(this, 1) == 1) {
            aa0.c("ReceiveChannel.consumeAsFlow can be collected just once");
            return null;
        }
        Object objA = e64.a(s54Var, this.w, z, r02Var);
        return objA == v72Var ? objA : g2b.a;
    }

    @Override // defpackage.u91
    public final String h() {
        return "channel=" + this.w;
    }

    @Override // defpackage.u91
    public final Object i(ua8<? super T> ua8Var, r02<? super g2b> r02Var) throws Throwable {
        Object objA = e64.a(new wc9(ua8Var), this.w, this.x, r02Var);
        return objA == v72.t ? objA : g2b.a;
    }

    @Override // defpackage.u91
    public final u91<T> j(h72 h72Var, int i, xx0 xx0Var) {
        return new q91(this.w, this.x, h72Var, i, xx0Var);
    }

    @Override // defpackage.u91
    public final r54<T> k() {
        return new q91(this.w, this.x);
    }

    @Override // defpackage.u91
    public final tj8<T> l(t72 t72Var) {
        if (!this.x || y.getAndSet(this, 1) != 1) {
            return this.u == -3 ? this.w : super.l(t72Var);
        }
        aa0.c("ReceiveChannel.consumeAsFlow can be collected just once");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q91(tj8<? extends T> tj8Var, boolean z, h72 h72Var, int i, xx0 xx0Var) {
        super(h72Var, i, xx0Var);
        this.w = tj8Var;
        this.x = z;
    }
}
