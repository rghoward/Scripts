package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface v31 extends kc7 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements v31 {
        public final oh4<Throwable, g2b> t;

        /* JADX WARN: Multi-variable type inference failed */
        public a(oh4<? super Throwable, g2b> oh4Var) {
            this.t = oh4Var;
        }

        @Override // defpackage.v31
        public final void c(Throwable th) {
            this.t.invoke(th);
        }

        public final String toString() {
            return "CancelHandler.UserSupplied[" + this.t.getClass().getSimpleName() + '@' + ym2.c(this) + ']';
        }
    }

    void c(Throwable th);
}
