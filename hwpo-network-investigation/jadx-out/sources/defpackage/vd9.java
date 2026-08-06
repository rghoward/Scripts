package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class vd9 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends vd9 {
        public final sl5 a;

        public a(sl5 sl5Var) {
            this.a = sl5Var;
        }

        @Override // defpackage.vd9
        public final <T> T a(sy2<? extends T> sy2Var, su8 su8Var) {
            su8Var.getClass();
            String strT = su8Var.t();
            strT.getClass();
            return (T) this.a.b(sy2Var, strT);
        }

        @Override // defpackage.vd9
        public final <T> qp8 b(wq6 wq6Var, ud9<? super T> ud9Var, T t) {
            wq6Var.getClass();
            qp8 qp8VarCreate = qp8.create(wq6Var, this.a.c(ud9Var, t));
            qp8VarCreate.getClass();
            return qp8VarCreate;
        }

        public final f2a c() {
            return this.a;
        }
    }

    public abstract <T> T a(sy2<? extends T> sy2Var, su8 su8Var);

    public abstract <T> qp8 b(wq6 wq6Var, ud9<? super T> ud9Var, T t);
}
