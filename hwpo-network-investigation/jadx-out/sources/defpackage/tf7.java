package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tf7 implements nn7 {
    public final rf7 t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements oh4<tf7, g2b> {
        public static final a u = new a(1);

        @Override // defpackage.oh4
        public final g2b invoke(tf7 tf7Var) {
            tf7 tf7Var2 = tf7Var;
            if (tf7Var2.V()) {
                tf7Var2.t.e1();
            }
            return g2b.a;
        }
    }

    public tf7(rf7 rf7Var) {
        this.t = rf7Var;
    }

    @Override // defpackage.nn7
    public final boolean V() {
        return this.t.q().G;
    }
}
