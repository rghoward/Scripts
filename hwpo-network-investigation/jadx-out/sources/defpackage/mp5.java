package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class mp5 extends wp5 implements oh4<Throwable, g2b> {
    public final /* synthetic */ p21<Object> u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp5(p21<Object> p21Var) {
        super(1);
        this.u = p21Var;
    }

    @Override // defpackage.oh4
    public final g2b invoke(Throwable th) {
        this.u.cancel();
        return g2b.a;
    }
}
