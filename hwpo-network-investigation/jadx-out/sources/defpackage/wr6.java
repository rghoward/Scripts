package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wr6 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ nr6 t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ fr1 v;

    public wr6(nr6 nr6Var, boolean z, fr1 fr1Var) {
        this.t = nr6Var;
        this.u = z;
        this.v = fr1Var;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            jt1Var2.K(-864293207);
            jt1Var2.B();
            u93 u93Var = zy1.a;
            boolean z = this.u;
            nr6 nr6Var = this.t;
            nu1.a(u93Var.a(new uh1(z ? nr6Var.a : nr6Var.d)), gr1.b(-893579015, new vr6(this.v), jt1Var2), jt1Var2, 56);
            jt1Var2.K(-863072055);
            jt1Var2.B();
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
