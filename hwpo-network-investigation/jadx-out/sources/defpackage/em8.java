package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class em8 implements Executor {
    public final /* synthetic */ Executor t;
    public final /* synthetic */ vl u;

    public em8(ExecutorService executorService, vl vlVar) {
        this.t = executorService;
        this.u = vlVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.t.execute(runnable);
    }
}
