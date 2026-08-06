package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e4a extends wp5 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ f4a u;
    public final /* synthetic */ ox6 v;
    public final /* synthetic */ ci4<g4a, xx1, gl6> w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4a(f4a f4aVar, ox6 ox6Var, ci4 ci4Var, int i) {
        super(2);
        this.u = f4aVar;
        this.v = ox6Var;
        this.w = ci4Var;
        this.x = i;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        num.intValue();
        int iS = gz3.s(this.x | 1);
        c4a.b(this.u, this.v, this.w, jt1Var, iS);
        return g2b.a;
    }
}
