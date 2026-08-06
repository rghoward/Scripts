package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ma implements ak4<ka> {
    public final px4 t;
    public final px4 u;
    public volatile ka v;
    public final Object w = new Object();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        zd2 e();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends mhb {
        public final ae2 t;
        public final t09 u;

        public b(ae2 ae2Var, t09 t09Var) {
            this.t = ae2Var;
            this.u = t09Var;
        }

        @Override // defpackage.mhb
        public final void onCleared() {
            super.onCleared();
            ((kv8) ((c) kl3.b(c.class, this.t)).a()).a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface c {
        na a();
    }

    public ma(px4 px4Var) {
        this.t = px4Var;
        this.u = px4Var;
    }

    @Override // defpackage.ak4
    public final ka a() {
        if (this.v == null) {
            synchronized (this.w) {
                try {
                    if (this.v == null) {
                        px4 px4Var = this.t;
                        la laVar = new la(this.u);
                        vhb viewModelStore = px4Var.getViewModelStore();
                        lb2 defaultViewModelCreationExtras = px4Var.getDefaultViewModelCreationExtras();
                        viewModelStore.getClass();
                        defaultViewModelCreationExtras.getClass();
                        uhb uhbVar = new uhb(viewModelStore, laVar, defaultViewModelCreationExtras);
                        sd1 sd1VarA = ll8.a(b.class);
                        String strE = sd1VarA.e();
                        if (strE == null) {
                            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                        }
                        this.v = ((b) uhbVar.a(sd1VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strE))).t;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.v;
    }
}
