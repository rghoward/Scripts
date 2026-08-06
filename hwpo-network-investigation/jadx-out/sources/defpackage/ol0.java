package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ol0 implements wca {
    public final fr1 a;
    public final w37 b = new w37();
    public final dt7 c = bl7.i(null);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a implements ada {
        public final gca a;
        public final zx0 b = da1.a(0, 7, null);

        public a(gca gcaVar) {
            this.a = gcaVar;
        }

        @Override // defpackage.ada
        public final void close() {
            this.b.n(g2b.a);
        }
    }

    public ol0(fr1 fr1Var) {
        this.a = fr1Var;
    }

    @Override // defpackage.wca
    public final Object a(gca gcaVar, p6a p6aVar) {
        pl0 pl0Var = new pl0(this, new a(gcaVar), null);
        w37 w37Var = this.b;
        w37Var.getClass();
        Object objD = u72.d(new t37(o37.t, w37Var, pl0Var, null), p6aVar);
        return objD == v72.t ? objD : g2b.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(final mh4<? extends qq5> mh4Var, jt1 jt1Var, final int i) {
        mh4<? extends qq5> mh4Var2;
        bj4 bj4VarO = jt1Var.o(723898654);
        int i2 = (bj4VarO.J(this) ? 32 : 16) | i;
        if (bj4VarO.A(i2 & 1, (i2 & 19) != 18)) {
            a aVar = (a) this.c.getValue();
            if (aVar == null) {
                xj8 xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4(mh4Var, i) { // from class: ml0
                        public final /* synthetic */ mh4 u;

                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iS = gz3.s(7);
                            this.t.b(this.u, (jt1) obj, iS);
                            return g2b.a;
                        }
                    };
                    return;
                }
                return;
            }
            mh4Var2 = mh4Var;
            this.a.invoke(aVar, aVar.a, mh4Var2, bj4VarO, 384);
        } else {
            mh4Var2 = mh4Var;
            bj4VarO.u();
        }
        xj8 xj8VarW2 = bj4VarO.W();
        if (xj8VarW2 != null) {
            xj8VarW2.d = new nl0(i, 0, this, mh4Var2);
        }
    }
}
