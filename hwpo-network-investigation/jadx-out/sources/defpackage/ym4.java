package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ym4 extends s66 {
    public static final ym4 b = new ym4();
    public static final a c = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements m76 {
        @Override // defpackage.m76
        public final s66 getLifecycle() {
            return ym4.b;
        }
    }

    @Override // defpackage.s66
    public final void a(l76 l76Var) {
        if (!(l76Var instanceof as2)) {
            li.c(l76Var, " must implement androidx.lifecycle.DefaultLifecycleObserver.");
            return;
        }
        as2 as2Var = (as2) l76Var;
        a aVar = c;
        as2Var.H(aVar);
        as2Var.onStart(aVar);
        as2Var.E(aVar);
    }

    @Override // defpackage.s66
    public final s66.b b() {
        return s66.b.x;
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // defpackage.s66
    public final void c(l76 l76Var) {
    }
}
