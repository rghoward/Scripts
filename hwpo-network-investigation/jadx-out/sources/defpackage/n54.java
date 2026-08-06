package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class n54 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ long t;
    public final /* synthetic */ wja u;
    public final /* synthetic */ float v;
    public final /* synthetic */ ci4<jt1, Integer, g2b> w;

    public n54(long j, wja wjaVar, float f, ci4 ci4Var) {
        this.t = j;
        this.u = wjaVar;
        this.v = f;
        this.w = ci4Var;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            bzb.b(this.t, this.u, gr1.b(-1767363041, new m54(this.v, this.w), jt1Var2), jt1Var2, 384);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
