package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g20 implements f20.b {
    private final WeakReference<f20.b> appStateCallback;
    private final f20 appStateMonitor;
    private o20 currentAppState;
    private boolean isRegisteredForAppState;

    public g20(f20 f20Var) {
        this.isRegisteredForAppState = false;
        this.currentAppState = o20.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.appStateMonitor = f20Var;
        this.appStateCallback = new WeakReference<>(this);
    }

    public o20 getAppState() {
        return this.currentAppState;
    }

    public WeakReference<f20.b> getAppStateCallback() {
        return this.appStateCallback;
    }

    public void incrementTsnsCount(int i) {
        this.appStateMonitor.A.addAndGet(i);
    }

    @Override // f20.b
    public void onUpdateAppState(o20 o20Var) {
        o20 o20Var2 = this.currentAppState;
        o20 o20Var3 = o20.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (o20Var2 == o20Var3) {
            this.currentAppState = o20Var;
        } else {
            if (o20Var2 == o20Var || o20Var == o20Var3) {
                return;
            }
            this.currentAppState = o20.FOREGROUND_BACKGROUND;
        }
    }

    public void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        f20 f20Var = this.appStateMonitor;
        this.currentAppState = f20Var.H;
        WeakReference<f20.b> weakReference = this.appStateCallback;
        synchronized (f20Var.y) {
            f20Var.y.add(weakReference);
        }
        this.isRegisteredForAppState = true;
    }

    public void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            f20 f20Var = this.appStateMonitor;
            WeakReference<f20.b> weakReference = this.appStateCallback;
            synchronized (f20Var.y) {
                f20Var.y.remove(weakReference);
            }
            this.isRegisteredForAppState = false;
        }
    }

    public g20() {
        this(f20.a());
    }
}
