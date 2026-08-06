package io.intercom.android.sdk;

import android.app.Activity;
import android.app.Application;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.SimpleActivityLifecycleCallbacks;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class LateInitializationPreparer extends SimpleActivityLifecycleCallbacks {
    private static LateInitializationPreparer instance;
    private boolean hasPaused;
    private boolean isRegistered;
    private Activity lastResumedActivity;
    private final Twig twig = LumberMill.getLogger();
    private final Set<Integer> startedActivities = new HashSet();

    public static LateInitializationPreparer getInstance() {
        if (instance == null) {
            instance = new LateInitializationPreparer();
        }
        return instance;
    }

    public void handlePastLifecycleEvents(Application application, Injector injector) {
        Activity activity = this.lastResumedActivity;
        boolean z = this.hasPaused;
        Set<Integer> set = this.startedActivities;
        unregister(application);
        if (activity != null) {
            this.twig.i("Handling lifecycle events for " + activity + " during late initialisation", new Object[0]);
            LifecycleTracker lifecycleTracker = injector.getLifecycleTracker();
            lifecycleTracker.onActivityStarted(activity);
            lifecycleTracker.onActivityResumed(activity);
            if (z) {
                lifecycleTracker.onActivityPaused(activity);
            }
        }
        if (set.isEmpty()) {
            return;
        }
        injector.getLifecycleTracker().registerActivities(set);
        this.twig.i("Observed Activities with hashcodes " + set + " during late initialization", new Object[0]);
    }

    public boolean hasPaused() {
        return this.hasPaused;
    }

    public Activity lastResumedActivity() {
        return this.lastResumedActivity;
    }

    @Override // io.intercom.android.sdk.utilities.SimpleActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.startedActivities.add(Integer.valueOf(System.identityHashCode(activity)));
        this.hasPaused = true;
    }

    @Override // io.intercom.android.sdk.utilities.SimpleActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.startedActivities.add(Integer.valueOf(System.identityHashCode(activity)));
        this.lastResumedActivity = activity;
        this.hasPaused = false;
    }

    @Override // io.intercom.android.sdk.utilities.SimpleActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.startedActivities.add(Integer.valueOf(System.identityHashCode(activity)));
    }

    @Override // io.intercom.android.sdk.utilities.SimpleActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        this.startedActivities.remove(Integer.valueOf(System.identityHashCode(activity)));
        if (activity == this.lastResumedActivity) {
            this.lastResumedActivity = null;
        }
    }

    public void register(Application application) {
        this.twig.i("Registering for later initialization", new Object[0]);
        synchronized (this) {
            try {
                if (!this.isRegistered) {
                    application.registerActivityLifecycleCallbacks(this);
                    this.isRegistered = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Set<Integer> startedActivities() {
        return this.startedActivities;
    }

    public void unregister(Application application) {
        this.twig.i("Unregistering for later initialization", new Object[0]);
        application.unregisterActivityLifecycleCallbacks(this);
        this.isRegistered = false;
        this.lastResumedActivity = null;
        this.hasPaused = false;
    }
}
