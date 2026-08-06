package io.ably.lib.http;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import defpackage.cj2;
import defpackage.zn3;
import io.ably.lib.network.HttpCall;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.Callback;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.Param;
import io.ably.lib.util.Log;
import java.net.URL;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class HttpScheduler implements AutoCloseable {
    protected static final String TAG = "io.ably.lib.http.HttpScheduler";
    protected final CloseableExecutor executor;
    private final HttpCore httpCore;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class AblyRequestWithFallback<T> extends AsyncRequest<T> {
        private final String path;
        private final boolean requireAblyAuth;

        private AblyRequestWithFallback(String str, String str2, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler<T> responseHandler, boolean z, Callback<T> callback) {
            super(str2, paramArr, paramArr2, requestBody, responseHandler, callback);
            this.path = str;
            this.requireAblyAuth = z;
        }

        private String extendMessage(String str) {
            if (Param.getFirst(this.params, "request_id") == null) {
                return str;
            }
            Locale locale = Locale.ROOT;
            return cj2.a(str, " request_id=", Param.getFirst(this.params, "request_id"));
        }

        @Override // java.lang.Runnable
        public void run() {
            String preferredHost = HttpScheduler.this.httpCore.hosts.getPreferredHost();
            int i = HttpScheduler.this.httpCore.hosts.fallbackHostsRemaining(preferredHost) > 0 ? HttpScheduler.this.httpCore.options.httpMaxRetryCount : 0;
            String fallback = preferredHost;
            while (!this.isCancelled) {
                try {
                    boolean zEquals = fallback.equals(preferredHost);
                    T tHttpExecuteWithRetry = httpExecuteWithRetry(fallback, this.path, this.requireAblyAuth);
                    this.result = tHttpExecuteWithRetry;
                    setResult(tHttpExecuteWithRetry);
                    if (!zEquals) {
                        HttpScheduler.this.httpCore.hosts.setPreferredHost(fallback, true);
                    }
                } catch (AblyException.HostFailedException e) {
                    try {
                        i--;
                        if (i < 0) {
                            ErrorInfo errorInfo = e.errorInfo;
                            errorInfo.message = extendMessage(errorInfo.message);
                            setError(e.errorInfo);
                        } else {
                            String str = HttpScheduler.TAG;
                            Log.d(str, extendMessage("Connection failed to host `" + fallback + "`. Searching for new host..."));
                            fallback = HttpScheduler.this.httpCore.hosts.getFallback(fallback);
                            if (fallback == null) {
                                ErrorInfo errorInfo2 = e.errorInfo;
                                errorInfo2.message = extendMessage(errorInfo2.message);
                                setError(e.errorInfo);
                            } else {
                                Log.d(str, extendMessage("Switched to `" + fallback + "`."));
                                disposeConnection();
                            }
                        }
                    } catch (Throwable th) {
                        disposeConnection();
                        throw th;
                    }
                } catch (AblyException e2) {
                    ErrorInfo errorInfo3 = e2.errorInfo;
                    errorInfo3.message = extendMessage(errorInfo3.message);
                    setError(e2.errorInfo);
                }
                disposeConnection();
                return;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class AblyRequestWithRetry<T> extends AsyncRequest<T> {
        private final String host;
        private final String path;
        private final Boolean requireAblyAuth;

        private AblyRequestWithRetry(String str, String str2, String str3, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler<T> responseHandler, boolean z, Callback<T> callback) {
            super(str3, paramArr, paramArr2, requestBody, responseHandler, callback);
            this.host = str;
            this.path = str2;
            this.requireAblyAuth = Boolean.valueOf(z);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                T tHttpExecuteWithRetry = httpExecuteWithRetry(this.host, this.path, this.requireAblyAuth.booleanValue());
                this.result = tHttpExecuteWithRetry;
                setResult(tHttpExecuteWithRetry);
            } catch (AblyException e) {
                setError(e.errorInfo);
            } finally {
                disposeConnection();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class UrlRequest<T> extends AsyncRequest<T> {
        private final URL url;

        private UrlRequest(URL url, String str, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler<T> responseHandler, Callback<T> callback) {
            super(str, paramArr, paramArr2, requestBody, responseHandler, callback);
            this.url = url;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                setResult(httpExecuteWithRetry(this.url));
            } catch (AblyException e) {
                setError(e.errorInfo);
            } finally {
                disposeConnection();
            }
        }
    }

    public HttpScheduler(HttpCore httpCore, CloseableExecutor closeableExecutor) {
        this.httpCore = httpCore;
        this.executor = closeableExecutor;
    }

    public <T> Future<T> ablyHttpExecuteWithFallback(String str, String str2, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler<T> responseHandler, boolean z, Callback<T> callback) {
        AblyRequestWithFallback ablyRequestWithFallback = new AblyRequestWithFallback(str, str2, paramArr, paramArr2, requestBody, responseHandler, z, callback);
        this.executor.execute(ablyRequestWithFallback);
        return ablyRequestWithFallback;
    }

    public <T> Future<T> ablyHttpExecuteWithRetry(String str, String str2, String str3, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler<T> responseHandler, boolean z, Callback<T> callback) {
        AblyRequestWithRetry ablyRequestWithRetry = new AblyRequestWithRetry(str, str2, str3, paramArr, paramArr2, requestBody, responseHandler, z, callback);
        this.executor.execute(ablyRequestWithRetry);
        return ablyRequestWithRetry;
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        boolean zIsTerminated;
        AutoCloseable autoCloseable = this.executor;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            }
            if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
                return;
            } else {
                zn3.b();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public <T> Future<T> del(String str, Param[] paramArr, Param[] paramArr2, HttpCore.ResponseHandler<T> responseHandler, boolean z, Callback<T> callback) {
        return ablyHttpExecuteWithFallback(str, HttpConstants.Methods.DELETE, paramArr, paramArr2, null, responseHandler, z, callback);
    }

    public <T> Future<T> exec(String str, String str2, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler<T> responseHandler, boolean z, Callback<T> callback) {
        return ablyHttpExecuteWithFallback(str, str2, paramArr, paramArr2, requestBody, responseHandler, z, callback);
    }

    public void execute(Runnable runnable) {
        this.executor.execute(runnable);
    }

    public <T> Future<T> get(String str, Param[] paramArr, Param[] paramArr2, HttpCore.ResponseHandler<T> responseHandler, boolean z, Callback<T> callback) {
        return ablyHttpExecuteWithFallback(str, HttpConstants.Methods.GET, paramArr, paramArr2, null, responseHandler, z, callback);
    }

    public <T> Future<T> httpExecute(URL url, String str, Param[] paramArr, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler<T> responseHandler, Callback<T> callback) {
        UrlRequest urlRequest = new UrlRequest(url, str, paramArr, null, requestBody, responseHandler, callback);
        this.executor.execute(urlRequest);
        return urlRequest;
    }

    public <T> Future<T> patch(String str, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler<T> responseHandler, boolean z, Callback<T> callback) {
        return ablyHttpExecuteWithFallback(str, HttpConstants.Methods.PATCH, paramArr, paramArr2, requestBody, responseHandler, z, callback);
    }

    public <T> Future<T> post(String str, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler<T> responseHandler, boolean z, Callback<T> callback) {
        return ablyHttpExecuteWithFallback(str, HttpConstants.Methods.POST, paramArr, paramArr2, requestBody, responseHandler, z, callback);
    }

    public <T> Future<T> put(String str, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler<T> responseHandler, boolean z, Callback<T> callback) {
        return ablyHttpExecuteWithFallback(str, HttpConstants.Methods.PUT, paramArr, paramArr2, requestBody, responseHandler, z, callback);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public abstract class AsyncRequest<T> implements Future<T>, Runnable {
        protected final Callback<T> callback;
        protected ErrorInfo err;
        protected final Param[] headers;
        protected HttpCall httpCall;
        protected boolean isCancelled;
        protected boolean isDone;
        protected final String method;
        protected final Param[] params;
        protected final HttpCore.RequestBody requestBody;
        protected final HttpCore.ResponseHandler<T> responseHandler;
        protected T result;

        private AsyncRequest(String str, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.ResponseHandler<T> responseHandler, Callback<T> callback) {
            this.isCancelled = false;
            this.isDone = false;
            this.method = str;
            this.headers = paramArr;
            this.params = paramArr2;
            this.requestBody = requestBody;
            this.responseHandler = responseHandler;
            this.callback = callback;
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            this.isCancelled = true;
            return disposeConnection();
        }

        public synchronized boolean disposeConnection() {
            boolean z;
            HttpCall httpCall = this.httpCall;
            z = httpCall != null;
            if (z) {
                httpCall.cancel();
                this.httpCall = null;
            }
            return z;
        }

        @Override // java.util.concurrent.Future
        public T get(long j, TimeUnit timeUnit) {
            long millis = timeUnit.toMillis(j);
            long jCurrentTimeMillis = System.currentTimeMillis() + millis;
            synchronized (this) {
                while (millis > 0) {
                    try {
                        wait(millis);
                        if (this.isDone) {
                            break;
                        }
                        millis = jCurrentTimeMillis - System.currentTimeMillis();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!this.isDone) {
                    throw new TimeoutException();
                }
                ErrorInfo errorInfo = this.err;
                if (errorInfo != null) {
                    throw new ExecutionException(AblyException.fromErrorInfo(errorInfo));
                }
            }
            return this.result;
        }

        public T httpExecuteWithRetry(String str, String str2, boolean z) {
            return (T) HttpScheduler.this.httpCore.httpExecuteWithRetry(HttpUtils.buildURL(HttpScheduler.this.httpCore.scheme, str, HttpScheduler.this.httpCore.port, str2, this.params), this.method, this.headers, this.requestBody, this.responseHandler, z);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.isCancelled;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.isDone;
        }

        public void setError(ErrorInfo errorInfo) {
            synchronized (this) {
                this.err = errorInfo;
                this.isDone = true;
                notifyAll();
            }
            Callback<T> callback = this.callback;
            if (callback != null) {
                callback.onError(errorInfo);
            }
        }

        public void setResult(T t) {
            synchronized (this) {
                this.result = t;
                this.isDone = true;
                notifyAll();
            }
            Callback<T> callback = this.callback;
            if (callback != null) {
                callback.onSuccess(t);
            }
        }

        public T httpExecuteWithRetry(URL url) {
            return (T) HttpScheduler.this.httpCore.httpExecuteWithRetry(url, this.method, this.headers, this.requestBody, this.responseHandler, false);
        }

        @Override // java.util.concurrent.Future
        public T get() {
            synchronized (this) {
                while (!this.isDone) {
                    try {
                        wait();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ErrorInfo errorInfo = this.err;
                if (errorInfo != null) {
                    throw new ExecutionException(AblyException.fromErrorInfo(errorInfo));
                }
            }
            return this.result;
        }
    }
}
