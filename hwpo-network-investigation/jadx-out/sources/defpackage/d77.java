package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d77 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ r47 t;
    public final /* synthetic */ nu u;

    public d77(r47 r47Var, nu nuVar) {
        this.t = r47Var;
        this.u = nuVar;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        if ((num.intValue() & 3) == 2 && jt1Var2.r()) {
            jt1Var2.u();
        } else {
            r47 r47Var = this.t;
            c67 c67Var = r47Var.u;
            c67Var.getClass();
            ((js1.a) c67Var).y.invoke(this.u, r47Var, jt1Var2, 0);
        }
        return g2b.a;
    }
}
