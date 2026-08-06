package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qn3 implements ThreadFactory {
    public final /* synthetic */ AtomicLong a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends ji0 {
        public final /* synthetic */ Runnable t;

        public a(Runnable runnable) {
            this.t = runnable;
        }

        @Override // defpackage.ji0
        public final void a() {
            this.t.run();
        }
    }

    public qn3(AtomicLong atomicLong) {
        this.a = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(new a(runnable));
        threadNewThread.setName("awaitEvenIfOnMainThread task continuation executor" + this.a.getAndIncrement());
        return threadNewThread;
    }
}
