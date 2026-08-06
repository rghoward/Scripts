package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k13 {
    public static final a a = new a();
    public static final b b = new b();
    public static final c c = new c();
    public static final e d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends k13 {
        @Override // defpackage.k13
        public final boolean a() {
            return true;
        }

        @Override // defpackage.k13
        public final boolean b() {
            return true;
        }

        @Override // defpackage.k13
        public final boolean c(kf2 kf2Var) {
            return kf2Var == kf2.u;
        }

        @Override // defpackage.k13
        public final boolean d(boolean z, kf2 kf2Var, uf3 uf3Var) {
            return (kf2Var == kf2.w || kf2Var == kf2.x) ? false : true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b extends k13 {
        @Override // defpackage.k13
        public final boolean a() {
            return false;
        }

        @Override // defpackage.k13
        public final boolean b() {
            return false;
        }

        @Override // defpackage.k13
        public final boolean c(kf2 kf2Var) {
            return false;
        }

        @Override // defpackage.k13
        public final boolean d(boolean z, kf2 kf2Var, uf3 uf3Var) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class c extends k13 {
        @Override // defpackage.k13
        public final boolean a() {
            return true;
        }

        @Override // defpackage.k13
        public final boolean b() {
            return false;
        }

        @Override // defpackage.k13
        public final boolean c(kf2 kf2Var) {
            return (kf2Var == kf2.v || kf2Var == kf2.x) ? false : true;
        }

        @Override // defpackage.k13
        public final boolean d(boolean z, kf2 kf2Var, uf3 uf3Var) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class d extends k13 {
        @Override // defpackage.k13
        public final boolean a() {
            return false;
        }

        @Override // defpackage.k13
        public final boolean b() {
            return true;
        }

        @Override // defpackage.k13
        public final boolean c(kf2 kf2Var) {
            return false;
        }

        @Override // defpackage.k13
        public final boolean d(boolean z, kf2 kf2Var, uf3 uf3Var) {
            return (kf2Var == kf2.w || kf2Var == kf2.x) ? false : true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class e extends k13 {
        @Override // defpackage.k13
        public final boolean a() {
            return true;
        }

        @Override // defpackage.k13
        public final boolean b() {
            return true;
        }

        @Override // defpackage.k13
        public final boolean c(kf2 kf2Var) {
            return kf2Var == kf2.u;
        }

        @Override // defpackage.k13
        public final boolean d(boolean z, kf2 kf2Var, uf3 uf3Var) {
            return ((z && kf2Var == kf2.v) || kf2Var == kf2.t) && uf3Var == uf3.u;
        }
    }

    static {
        new d();
        d = new e();
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(kf2 kf2Var);

    public abstract boolean d(boolean z, kf2 kf2Var, uf3 uf3Var);
}
