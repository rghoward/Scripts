package defpackage;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c92 implements Callable<Void> {
    public final /* synthetic */ long a;
    public final /* synthetic */ d92 b;

    public c92(d92 d92Var, long j) {
        this.b = d92Var;
        this.a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.a);
        this.b.k.c(bundle);
        return null;
    }
}
