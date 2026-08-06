package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zr5 extends wp5 implements mh4<g2b> {
    public final /* synthetic */ xr5.b u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr5(xr5.b bVar) {
        super(0);
        this.u = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mh4
    public final g2b invoke() {
        qv8 qv8Var;
        xr5.b bVar = this.u;
        if (!((Boolean) bVar.g.getValue()).booleanValue() && (qv8Var = bVar.c) != null) {
            qv8Var.deactivate();
        }
        return g2b.a;
    }
}
