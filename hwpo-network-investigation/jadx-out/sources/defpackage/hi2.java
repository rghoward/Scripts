package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hi2 implements ci4 {
    public final /* synthetic */ int t = 0;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ mh4 v;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ hi2(mh4 mh4Var, n85 n85Var, String str, ox6 ox6Var, boolean z, int i, int i2) {
        this.v = mh4Var;
        this.x = n85Var;
        this.y = str;
        this.z = ox6Var;
        this.u = z;
        this.w = i2;
    }

    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.t;
        Object obj3 = this.z;
        Object obj4 = this.y;
        Object obj5 = this.x;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iS = gz3.s(1);
                lj2.h(this.v, (n85) obj5, (String) obj4, (ox6) obj3, this.u, (jt1) obj, iS, this.w);
                break;
            default:
                ((Integer) obj2).getClass();
                int iS2 = gz3.s(this.w | 1);
                boolean z = this.u;
                mh4 mh4Var = this.v;
                xna.l(z, (jl9) obj5, mh4Var, (xma) obj4, (fr1) obj3, (jt1) obj, iS2);
                break;
        }
        return g2b.a;
    }

    public /* synthetic */ hi2(boolean z, jl9 jl9Var, mh4 mh4Var, xma xmaVar, fr1 fr1Var, int i) {
        this.u = z;
        this.x = jl9Var;
        this.v = mh4Var;
        this.y = xmaVar;
        this.z = fr1Var;
        this.w = i;
    }
}
