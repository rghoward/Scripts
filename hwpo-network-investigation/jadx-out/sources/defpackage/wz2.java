package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wz2 implements b33 {
    public final /* synthetic */ a03 a;
    public final /* synthetic */ r47 b;
    public final /* synthetic */ fv9 c;

    public wz2(a03 a03Var, r47 r47Var, fv9 fv9Var) {
        this.a = a03Var;
        this.b = r47Var;
        this.c = fv9Var;
    }

    @Override // defpackage.b33
    public final void dispose() {
        s87 s87VarB = this.a.b();
        r47 r47Var = this.b;
        s87VarB.b(r47Var);
        this.c.remove(r47Var);
    }
}
