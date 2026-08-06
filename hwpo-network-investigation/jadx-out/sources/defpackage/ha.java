package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ha implements b33 {
    public final /* synthetic */ x9 a;

    public ha(x9 x9Var) {
        this.a = x9Var;
    }

    @Override // defpackage.b33
    public final void dispose() {
        da daVar = this.a.a;
        if (daVar != null) {
            daVar.b();
        } else {
            aa0.c("Launcher has not been initialized");
        }
    }
}
