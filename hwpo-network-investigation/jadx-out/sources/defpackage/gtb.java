package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gtb extends ox6.c implements lr5 {
    public float H;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements oh4<jz7.a, g2b> {
        public final /* synthetic */ jz7 u;
        public final /* synthetic */ gtb v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(jz7 jz7Var, gtb gtbVar) {
            super(1);
            this.u = jz7Var;
            this.v = gtbVar;
        }

        @Override // defpackage.oh4
        public final g2b invoke(jz7.a aVar) {
            aVar.l(this.u, 0, 0, this.v.H);
            return g2b.a;
        }
    }

    @Override // defpackage.lr5
    public final gl6 e(hl6 hl6Var, cl6 cl6Var, long j) {
        jz7 jz7VarE = cl6Var.E(j);
        return hl6Var.y0(jz7VarE.t, jz7VarE.u, if3.t, new a(jz7VarE, this));
    }

    public final String toString() {
        return ho.a(new StringBuilder("ZIndexModifier(zIndex="), this.H, ')');
    }
}
