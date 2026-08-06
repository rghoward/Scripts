package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lz5 {
    public final /* synthetic */ nz5 a;

    public lz5(nz5 nz5Var) {
        this.a = nz5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final lx5.b a(int i) {
        nz5 nz5Var = this.a;
        hu9 hu9VarA = hu9.a.a();
        oh4<Object, g2b> oh4VarE = hu9VarA != null ? hu9VarA.e() : null;
        hu9 hu9VarB = hu9.a.b(hu9VarA);
        try {
            xy5 xy5Var = (xy5) nz5Var.f.getValue();
            return nz5Var.q.a(i, xy5Var.j, nz5Var.d, new kz5(i, xy5Var));
        } finally {
            hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
        }
    }
}
