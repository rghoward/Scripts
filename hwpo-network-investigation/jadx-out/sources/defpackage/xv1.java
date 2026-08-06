package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xv1 extends ln4 {
    public static xv1 x;

    public xv1() {
        super(7);
    }

    public static synchronized xv1 h1() {
        try {
            if (x == null) {
                x = new xv1();
            }
        } catch (Throwable th) {
            throw th;
        }
        return x;
    }

    @Override // defpackage.ln4
    public final String J0() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    @Override // defpackage.ln4
    public final String M0() {
        return "experiment_app_start_ttid";
    }
}
