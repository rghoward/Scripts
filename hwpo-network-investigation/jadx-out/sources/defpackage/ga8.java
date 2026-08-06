package defpackage;

import android.app.Activity;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ga8 implements m76 {
    public static final ga8 B = new ga8();
    public int t;
    public int u;
    public Handler x;
    public boolean v = true;
    public boolean w = true;
    public final n76 y = new n76(this, true);
    public final fa8 z = new Runnable() { // from class: fa8
        @Override // java.lang.Runnable
        public final void run() {
            ga8 ga8Var = this.t;
            n76 n76Var = ga8Var.y;
            if (ga8Var.u == 0) {
                ga8Var.v = true;
                n76Var.f(s66.a.ON_PAUSE);
            }
            if (ga8Var.t == 0 && ga8Var.v) {
                n76Var.f(s66.a.ON_STOP);
                ga8Var.w = true;
            }
        }
    };
    public final b A = new b();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final void a(Activity activity, ha8.a aVar) {
            activity.registerActivityLifecycleCallbacks(aVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public b() {
        }
    }

    public final void a() {
        int i = this.u + 1;
        this.u = i;
        if (i == 1) {
            if (this.v) {
                this.y.f(s66.a.ON_RESUME);
                this.v = false;
            } else {
                Handler handler = this.x;
                handler.getClass();
                handler.removeCallbacks(this.z);
            }
        }
    }

    @Override // defpackage.m76
    public final s66 getLifecycle() {
        return this.y;
    }
}
