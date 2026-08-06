package defpackage;

import android.app.Application;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j9 implements Runnable {
    public final /* synthetic */ Application t;
    public final /* synthetic */ l9.a u;

    public j9(Application application, l9.a aVar) {
        this.t = application;
        this.u = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.t.unregisterActivityLifecycleCallbacks(this.u);
    }
}
