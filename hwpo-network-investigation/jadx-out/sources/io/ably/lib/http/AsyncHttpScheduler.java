package io.ably.lib.http;

import io.ably.lib.types.ClientOptions;
import io.ably.lib.util.Log;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class AsyncHttpScheduler extends HttpScheduler {
    private static final long KEEP_ALIVE_TIME = 2000;
    protected static final String TAG = "io.ably.lib.http.AsyncHttpScheduler";

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class CloseableThreadPoolExecutor implements CloseableExecutor {
        private volatile ThreadPoolExecutor executor;
        private final ClientOptions options;

        public CloseableThreadPoolExecutor(ClientOptions clientOptions) {
            this.options = clientOptions;
            int i = clientOptions.asyncHttpThreadpoolSize;
            this.executor = new ThreadPoolExecutor(i, i, AsyncHttpScheduler.KEEP_ALIVE_TIME, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            int size = this.executor.shutdownNow().size();
            if (size > 0) {
                Log.w(AsyncHttpScheduler.TAG, "close() drained (cancelled) task count: " + size);
            }
        }

        public void connect() {
            if (this.executor.isShutdown()) {
                int i = this.options.asyncHttpThreadpoolSize;
                this.executor = new ThreadPoolExecutor(i, i, AsyncHttpScheduler.KEEP_ALIVE_TIME, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.executor.execute(runnable);
        }
    }

    public AsyncHttpScheduler(HttpCore httpCore, ClientOptions clientOptions) {
        super(httpCore, new CloseableThreadPoolExecutor(clientOptions));
    }

    public void connect() {
        ((CloseableThreadPoolExecutor) this.executor).connect();
    }

    public AsyncHttpScheduler exchangeHttpCore(HttpCore httpCore) {
        return new AsyncHttpScheduler(httpCore, this.executor);
    }

    private AsyncHttpScheduler(HttpCore httpCore, CloseableExecutor closeableExecutor) {
        super(httpCore, closeableExecutor);
    }
}
