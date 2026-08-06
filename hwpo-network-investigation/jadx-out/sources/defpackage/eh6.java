package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class eh6<I, O> extends w9<I> {
    public final x9<I> a;
    public final h37 b;

    public eh6(x9 x9Var, h37 h37Var) {
        this.a = x9Var;
        this.b = h37Var;
    }

    @Override // defpackage.w9
    public final void a(Object obj) {
        da daVar = this.a.a;
        if (daVar != null) {
            daVar.a(obj);
        } else {
            aa0.c("Launcher has not been initialized");
        }
    }
}
