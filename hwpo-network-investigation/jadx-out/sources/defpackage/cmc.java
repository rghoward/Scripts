package defpackage;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cmc implements Callable {
    public final /* synthetic */ q1d a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ zmc c;

    public cmc(zmc zmcVar, q1d q1dVar, Bundle bundle) {
        this.a = q1dVar;
        this.b = bundle;
        Objects.requireNonNull(zmcVar);
        this.c = zmcVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        zmc zmcVar = this.c;
        zmcVar.b.W();
        return zmcVar.b.e0(this.b, this.a);
    }
}
