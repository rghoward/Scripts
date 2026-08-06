package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mh implements ci4 {
    public final /* synthetic */ int t = 1;
    public final /* synthetic */ fr1 u;
    public final /* synthetic */ int v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ mh(mh4 mh4Var, ox6 ox6Var, f03 f03Var, fr1 fr1Var, int i) {
        this.w = mh4Var;
        this.x = ox6Var;
        this.y = f03Var;
        this.u = fr1Var;
        this.v = i;
    }

    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.t;
        int i2 = this.v;
        Object obj3 = this.y;
        Object obj4 = this.x;
        Object obj5 = this.w;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ci.d((mh4) obj5, (ox6) obj4, (f03) obj3, this.u, (jt1) obj, gz3.s(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iS = gz3.s(i2 | 1);
                fr1 fr1Var = this.u;
                pn0.a((l68) obj5, fr1Var, (fra) obj4, (fr1) obj3, (jt1) obj, iS);
                break;
        }
        return g2b.a;
    }

    public /* synthetic */ mh(l68 l68Var, fr1 fr1Var, fra fraVar, fr1 fr1Var2, int i) {
        this.w = l68Var;
        this.u = fr1Var;
        this.x = fraVar;
        this.y = fr1Var2;
        this.v = i;
    }
}
