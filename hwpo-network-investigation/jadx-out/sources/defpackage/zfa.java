package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zfa implements b33 {
    public final /* synthetic */ h37 a;
    public final /* synthetic */ h27 b;

    public zfa(h37 h37Var, h27 h27Var) {
        this.a = h37Var;
        this.b = h27Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.b33
    public final void dispose() {
        h37 h37Var = this.a;
        n88.b bVar = (n88.b) h37Var.getValue();
        if (bVar != null) {
            n88.a aVar = new n88.a(bVar);
            h27 h27Var = this.b;
            if (h27Var != null) {
                h27Var.b(aVar);
            }
            h37Var.setValue(null);
        }
    }
}
