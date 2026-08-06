package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ni2 implements ci4 {
    public final /* synthetic */ int t = 1;
    public final /* synthetic */ ox6 u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ ni2(int i, qi qiVar, ox6 ox6Var, xma xmaVar, boolean z) {
        this.u = ox6Var;
        this.x = qiVar;
        this.y = xmaVar;
        this.v = z;
        this.w = i;
    }

    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.t;
        int i2 = this.w;
        Object obj3 = this.y;
        Object obj4 = this.x;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                lj2.o((mh4) obj4, this.v, this.u, (fr1) obj3, (jt1) obj, gz3.s(i2 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                int iS = gz3.s(i2 | 1);
                xna.c(iS, (qi) obj4, (jt1) obj, this.u, (xma) obj3, this.v);
                break;
        }
        return g2b.a;
    }

    public /* synthetic */ ni2(mh4 mh4Var, boolean z, ox6 ox6Var, fr1 fr1Var, int i) {
        this.x = mh4Var;
        this.v = z;
        this.u = ox6Var;
        this.y = fr1Var;
        this.w = i;
    }
}
