package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ha8 extends bf3 {
    final /* synthetic */ ga8 this$0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends bf3 {
        final /* synthetic */ ga8 this$0;

        public a(ga8 ga8Var) {
            this.this$0 = ga8Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            ga8 ga8Var = this.this$0;
            int i = ga8Var.t + 1;
            ga8Var.t = i;
            if (i == 1 && ga8Var.w) {
                ga8Var.y.f(s66.a.ON_START);
                ga8Var.w = false;
            }
        }
    }

    public ha8(ga8 ga8Var) {
        this.this$0 = ga8Var;
    }

    @Override // defpackage.bf3, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = co8.u;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            fragmentFindFragmentByTag.getClass();
            ((co8) fragmentFindFragmentByTag).t = this.this$0.A;
        }
    }

    @Override // defpackage.bf3, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        ga8 ga8Var = this.this$0;
        int i = ga8Var.u - 1;
        ga8Var.u = i;
        if (i == 0) {
            Handler handler = ga8Var.x;
            handler.getClass();
            handler.postDelayed(ga8Var.z, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        ga8.a.a(activity, new a(this.this$0));
    }

    @Override // defpackage.bf3, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        ga8 ga8Var = this.this$0;
        int i = ga8Var.t - 1;
        ga8Var.t = i;
        if (i == 0 && ga8Var.v) {
            ga8Var.y.f(s66.a.ON_STOP);
            ga8Var.w = true;
        }
    }
}
