package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ih3 extends wp5 implements oh4<ro4, g2b> {
    public final /* synthetic */ boolean u;
    public final /* synthetic */ mh4<Boolean> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih3(mh4 mh4Var, boolean z) {
        super(1);
        this.u = z;
        this.v = mh4Var;
    }

    @Override // defpackage.oh4
    public final g2b invoke(ro4 ro4Var) {
        ro4Var.s(!this.u && this.v.invoke().booleanValue());
        return g2b.a;
    }
}
