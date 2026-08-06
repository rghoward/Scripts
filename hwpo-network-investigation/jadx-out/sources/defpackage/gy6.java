package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gy6 implements Executor {
    public final /* synthetic */ Executor t;
    public final /* synthetic */ g84.a u;

    public gy6(Executor executor, g84.a aVar) {
        this.t = executor;
        this.u = aVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.t.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.u.m(e);
        }
    }
}
