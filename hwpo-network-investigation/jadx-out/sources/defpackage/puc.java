package defpackage;

import android.content.ComponentName;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class puc implements Runnable {
    public final /* synthetic */ ComponentName t;
    public final /* synthetic */ hvc u;

    public puc(hvc hvcVar, ComponentName componentName) {
        this.t = componentName;
        this.u = hvcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.u.v.r(this.t);
    }
}
