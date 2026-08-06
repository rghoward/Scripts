package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class igb extends wp5 implements mh4<g2b> {
    public final /* synthetic */ v0 u;
    public final /* synthetic */ jgb v;
    public final /* synthetic */ hgb w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public igb(v0 v0Var, jgb jgbVar, hgb hgbVar) {
        super(0);
        this.u = v0Var;
        this.v = jgbVar;
        this.w = hgbVar;
    }

    @Override // defpackage.mh4
    public final g2b invoke() {
        jgb jgbVar = this.v;
        v0 v0Var = this.u;
        v0Var.removeOnAttachStateChangeListener(jgbVar);
        uy5.c(v0Var).a.remove(this.w);
        return g2b.a;
    }
}
