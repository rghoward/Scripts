package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rz8 implements Executor {
    public final Executor t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a implements Runnable {
        public final Runnable t;

        public a(Runnable runnable) {
            this.t = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.t.run();
            } catch (Exception e) {
                be6.b("Executor", "Background execution failure.", e);
            }
        }
    }

    public rz8(ExecutorService executorService) {
        this.t = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.t.execute(new a(runnable));
    }
}
