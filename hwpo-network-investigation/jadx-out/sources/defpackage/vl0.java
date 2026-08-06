package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vl0 implements b33 {
    public final /* synthetic */ ol0 a;

    public vl0(ol0 ol0Var) {
        this.a = ol0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.b33
    public final void dispose() {
        ol0.a aVar = (ol0.a) this.a.c.getValue();
        if (aVar != null) {
            aVar.close();
        }
    }
}
