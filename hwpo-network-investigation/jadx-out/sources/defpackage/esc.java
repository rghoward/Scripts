package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class esc implements Runnable {
    public final /* synthetic */ Bundle t;
    public final /* synthetic */ dsc u;
    public final /* synthetic */ dsc v;
    public final /* synthetic */ long w;
    public final /* synthetic */ xsc x;

    public esc(xsc xscVar, Bundle bundle, dsc dscVar, dsc dscVar2, long j) {
        this.t = bundle;
        this.u = dscVar;
        this.v = dscVar2;
        this.w = j;
        Objects.requireNonNull(xscVar);
        this.x = xscVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle = this.t;
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        xsc xscVar = this.x;
        yzc yzcVar = xscVar.a.i;
        tkc.k(yzcVar);
        Bundle bundleQ = yzcVar.q("screen_view", bundle, null, false);
        xscVar.m(this.u, this.v, this.w, true, bundleQ);
    }
}
