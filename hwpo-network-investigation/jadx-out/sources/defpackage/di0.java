package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class di0 implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final di0 x = new di0();
    public final AtomicBoolean t = new AtomicBoolean();
    public final AtomicBoolean u = new AtomicBoolean();
    public final ArrayList v = new ArrayList();
    public boolean w = false;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        void a(boolean z);
    }

    public static void b(Application application) {
        di0 di0Var = x;
        synchronized (di0Var) {
            try {
                if (!di0Var.w) {
                    application.registerActivityLifecycleCallbacks(di0Var);
                    application.registerComponentCallbacks(di0Var);
                    di0Var.w = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(a aVar) {
        synchronized (x) {
            this.v.add(aVar);
        }
    }

    public final void c(boolean z) {
        synchronized (x) {
            try {
                ArrayList arrayList = this.v;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((a) obj).a(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.t.compareAndSet(true, false);
        this.u.set(true);
        if (zCompareAndSet) {
            c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean zCompareAndSet = this.t.compareAndSet(true, false);
        this.u.set(true);
        if (zCompareAndSet) {
            c(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.t.compareAndSet(false, true)) {
            this.u.set(true);
            c(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
