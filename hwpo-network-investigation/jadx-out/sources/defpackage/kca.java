package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kca extends gw2 implements ju1, bn4 {
    public ci4<? super vf7, ? super r02<? super g2b>, ? extends Object> J;
    public final dt7 K = new dt7(null, ha7.u);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a implements gca {
        public final long t;

        public a(long j) {
            this.t = j;
        }

        @Override // defpackage.gca
        public final sk8 E(qq5 qq5Var) {
            return tk8.a(z(qq5Var), 0L);
        }

        @Override // defpackage.gca
        public final fca G0() {
            return uca.a(kca.this);
        }

        @Override // defpackage.gca
        public final long z(qq5 qq5Var) {
            qq5 qq5Var2 = (qq5) kca.this.K.getValue();
            if (qq5Var2 != null) {
                return qq5Var.T(qq5Var2, this.t);
            }
            xc5.d("Tried to open context menu before the anchor was placed.");
            fl.a();
            return 0L;
        }
    }

    public kca(iga igaVar) {
        this.J = igaVar;
        c2(t6a.a(new jca(this)));
    }

    @Override // defpackage.bn4
    public final void Q0(mb7 mb7Var) {
        this.K.setValue(mb7Var);
    }
}
