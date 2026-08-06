package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hh0 {
    public final b a = new b();
    public final a b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends g87<i87> {
        public a(i87 i87Var) {
            super(i87Var, false);
        }

        @Override // defpackage.g87
        public final void a() {
            hh0.this.b();
        }

        @Override // defpackage.g87
        public final void b() {
            hh0.this.c();
        }

        @Override // defpackage.g87
        public final void c(d87 d87Var) {
            hh0.this.d(new gh0(d87Var));
        }

        @Override // defpackage.g87
        public final void d(d87 d87Var) {
            d87Var.getClass();
            hh0.this.e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends vg7 {
        public b() {
            super(false);
        }

        @Override // defpackage.vg7
        public final void handleOnBackCancelled() {
            hh0.this.b();
        }

        @Override // defpackage.vg7
        public final void handleOnBackPressed() {
            hh0.this.c();
        }

        @Override // defpackage.vg7
        public final void handleOnBackProgressed(gh0 gh0Var) {
            hh0.this.d(gh0Var);
        }

        @Override // defpackage.vg7
        public final void handleOnBackStarted(gh0 gh0Var) {
            hh0.this.e();
        }
    }

    public hh0(i87 i87Var) {
        this.b = new a(i87Var);
    }

    public boolean a() {
        return this.a.isEnabled() && this.b.d;
    }

    public abstract void c();

    public void b() {
    }

    public void e() {
    }

    public void d(gh0 gh0Var) {
    }
}
