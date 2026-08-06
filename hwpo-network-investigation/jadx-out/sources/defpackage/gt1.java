package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gt1 implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ et1 t;

    public gt1(et1 et1Var) {
        this.t = et1Var;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.t.d(configuration);
    }

    @Override // android.content.ComponentCallbacks
    @gy2
    public final void onLowMemory() {
        et1 et1Var = this.t;
        et1Var.f.a.clear();
        et1Var.g.a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        et1 et1Var = this.t;
        et1Var.f.a.clear();
        et1Var.g.a();
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.t.s.b.setValue(Boolean.valueOf(z));
    }
}
