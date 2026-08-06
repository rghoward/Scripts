package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vl4 implements jn2 {
    public final m85 a;
    public final zk7 b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements jn2.a {
        @Override // jn2.a
        public final jn2 create(tw9 tw9Var, zk7 zk7Var, b85 b85Var) {
            hy0 hy0VarP = tw9Var.a.p();
            if (hy0VarP.q(0L, tl4.b) || hy0VarP.q(0L, tl4.a)) {
                return new vl4(tw9Var.a, zk7Var);
            }
            return null;
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return a.class.hashCode();
        }
    }

    public vl4(m85 m85Var, zk7 zk7Var) {
        this.a = m85Var;
        this.b = zk7Var;
    }

    @Override // defpackage.jn2
    public final Object decode(r02<? super in2> r02Var) {
        return zv.g(new ul4(0, this), (u02) r02Var);
    }
}
