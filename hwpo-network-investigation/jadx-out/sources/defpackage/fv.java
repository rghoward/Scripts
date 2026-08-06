package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fv extends wp5 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ ox6 v;
    public final /* synthetic */ th3 w;
    public final /* synthetic */ jo3 x;
    public final /* synthetic */ String y;
    public final /* synthetic */ ei4<jv, jt1, Integer, g2b> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv(boolean z, ox6 ox6Var, th3 th3Var, jo3 jo3Var, String str, ei4 ei4Var, int i, int i2) {
        super(2);
        this.u = z;
        this.v = ox6Var;
        this.w = th3Var;
        this.x = jo3Var;
        this.y = str;
        this.z = ei4Var;
        this.A = i;
        this.B = i2;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        num.intValue();
        dv.c(this.u, this.v, this.w, this.x, this.y, this.z, jt1Var, gz3.s(this.A | 1), this.B);
        return g2b.a;
    }
}
