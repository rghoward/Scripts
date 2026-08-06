package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class it1 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements oh4<ox6.b, Boolean> {
        public static final a u = new a(1);

        @Override // defpackage.oh4
        public final Boolean invoke(ox6.b bVar) {
            return Boolean.valueOf(!(bVar instanceof ht1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends wp5 implements ci4<ox6, ox6.b, ox6> {
        public final /* synthetic */ jt1 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(jt1 jt1Var) {
            super(2);
            this.u = jt1Var;
        }

        @Override // defpackage.ci4
        public final ox6 invoke(ox6 ox6Var, ox6.b bVar) {
            ox6 ox6Var2 = ox6Var;
            ox6.b bVarB = bVar;
            if (bVarB instanceof ht1) {
                ei4<ox6, jt1, Integer, ox6> ei4Var = ((ht1) bVarB).x;
                fza.b(3, ei4Var);
                ox6.a aVar = ox6.a.t;
                jt1 jt1Var = this.u;
                bVarB = it1.b(jt1Var, ei4Var.invoke(aVar, jt1Var, 0));
            }
            return ox6Var2.H(bVarB);
        }
    }

    public static final ox6 a(ox6 ox6Var, ei4 ei4Var) {
        return ox6Var.H(new ht1(ei4Var));
    }

    public static final ox6 b(jt1 jt1Var, ox6 ox6Var) {
        if (ox6Var.l(a.u)) {
            return ox6Var;
        }
        jt1Var.e(1219399079);
        ox6 ox6Var2 = (ox6) ox6Var.p(new b(jt1Var), ox6.a.t);
        jt1Var.H();
        return ox6Var2;
    }

    public static final ox6 c(jt1 jt1Var, ox6 ox6Var) {
        jt1Var.K(439770924);
        ox6 ox6VarB = b(jt1Var, ox6Var);
        jt1Var.B();
        return ox6VarB;
    }
}
