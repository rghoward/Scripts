package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vz2 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ a03.a t;
    public final /* synthetic */ r47 u;

    public vz2(a03.a aVar, r47 r47Var) {
        this.t = aVar;
        this.u = r47Var;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        if ((num.intValue() & 3) == 2 && jt1Var2.r()) {
            jt1Var2.u();
        } else {
            this.t.z.invoke(this.u, jt1Var2, 0);
        }
        return g2b.a;
    }
}
