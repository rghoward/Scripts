package com.google.firebase.perf.session;

import android.content.Context;
import com.google.firebase.perf.session.gauges.GaugeManager;
import defpackage.ce9;
import defpackage.f20;
import defpackage.g20;
import defpackage.hv7;
import defpackage.o20;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class SessionManager extends g20 {
    private static final SessionManager instance = new SessionManager();
    private final f20 appStateMonitor;
    private final Set<WeakReference<ce9>> clients;
    private final GaugeManager gaugeManager;
    private hv7 perfSession;
    private Future syncInitFuture;

    private SessionManager() {
        this(GaugeManager.getInstance(), hv7.c(UUID.randomUUID().toString()), f20.a());
    }

    public static SessionManager getInstance() {
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$setApplicationContext$0(Context context, hv7 hv7Var) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (hv7Var.v) {
            this.gaugeManager.logGaugeMetadata(hv7Var.t, o20.FOREGROUND);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(o20 o20Var) {
        hv7 hv7Var = this.perfSession;
        if (hv7Var.v) {
            this.gaugeManager.logGaugeMetadata(hv7Var.t, o20Var);
        }
    }

    private void startOrStopCollectingGauges(o20 o20Var) {
        hv7 hv7Var = this.perfSession;
        boolean z = hv7Var.v;
        GaugeManager gaugeManager = this.gaugeManager;
        if (z) {
            gaugeManager.startCollectingGauges(hv7Var, o20Var);
        } else {
            gaugeManager.stopCollectingGauges();
        }
    }

    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        o20 o20Var = o20.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(o20Var);
        startOrStopCollectingGauges(o20Var);
    }

    @Override // defpackage.g20, f20.b
    public void onUpdateAppState(o20 o20Var) {
        super.onUpdateAppState(o20Var);
        if (this.appStateMonitor.J) {
            return;
        }
        if (o20Var == o20.FOREGROUND) {
            updatePerfSession(hv7.c(UUID.randomUUID().toString()));
        } else if (this.perfSession.d()) {
            updatePerfSession(hv7.c(UUID.randomUUID().toString()));
        } else {
            startOrStopCollectingGauges(o20Var);
        }
    }

    public final hv7 perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<ce9> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(final Context context) {
        final hv7 hv7Var = this.perfSession;
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: zg9
            @Override // java.lang.Runnable
            public final void run() {
                this.t.lambda$setApplicationContext$0(context, hv7Var);
            }
        });
    }

    public void setPerfSession(hv7 hv7Var) {
        this.perfSession = hv7Var;
    }

    public void stopGaugeCollectionIfSessionRunningTooLong() {
        if (this.perfSession.d()) {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public void unregisterForSessionUpdates(WeakReference<ce9> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(hv7 hv7Var) {
        if (hv7Var.t == this.perfSession.t) {
            return;
        }
        this.perfSession = hv7Var;
        synchronized (this.clients) {
            try {
                Iterator<WeakReference<ce9>> it = this.clients.iterator();
                while (it.hasNext()) {
                    ce9 ce9Var = it.next().get();
                    if (ce9Var != null) {
                        ce9Var.a(hv7Var);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        logGaugeMetadataIfCollectionEnabled(this.appStateMonitor.H);
        startOrStopCollectingGauges(this.appStateMonitor.H);
    }

    public SessionManager(GaugeManager gaugeManager, hv7 hv7Var, f20 f20Var) {
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = hv7Var;
        this.appStateMonitor = f20Var;
        registerForAppState();
    }
}
