package io.ably.lib.http;

import io.ably.lib.types.AblyException;
import io.ably.lib.types.Callback;
import io.ably.lib.types.ErrorInfo;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class Http implements AutoCloseable {
    private final AsyncHttpScheduler asyncHttp;
    private final SyncHttpScheduler syncHttp;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface Execute<Result> {
        void execute(HttpScheduler httpScheduler, Callback<Result> callback);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class Request<Result> {
        private final Execute<Result> execute;

        public Request(Execute<Result> execute) {
            this.execute = execute;
        }

        public void async(Callback<Result> callback) {
            try {
                this.execute.execute(Http.this.asyncHttp, callback);
            } catch (AblyException e) {
                callback.onError(e.errorInfo);
            }
        }

        public Result sync() throws AblyException {
            final SyncExecuteResult syncExecuteResult = new SyncExecuteResult();
            this.execute.execute(Http.this.syncHttp, new Callback<Result>() { // from class: io.ably.lib.http.Http.Request.1
                @Override // io.ably.lib.types.Callback
                public void onError(ErrorInfo errorInfo) {
                    syncExecuteResult.error = errorInfo;
                }

                @Override // io.ably.lib.types.Callback
                public void onSuccess(Result result) {
                    syncExecuteResult.ok = result;
                }
            });
            ErrorInfo errorInfo = syncExecuteResult.error;
            if (errorInfo == null) {
                return syncExecuteResult.ok;
            }
            throw AblyException.fromErrorInfo(errorInfo);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class SyncExecuteResult<Result> {
        public ErrorInfo error;
        public Result ok;

        private SyncExecuteResult() {
            this.ok = null;
            this.error = null;
        }
    }

    public Http(AsyncHttpScheduler asyncHttpScheduler, SyncHttpScheduler syncHttpScheduler) {
        this.asyncHttp = asyncHttpScheduler;
        this.syncHttp = syncHttpScheduler;
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        this.asyncHttp.close();
    }

    public void connect() {
        this.asyncHttp.connect();
    }

    public Http exchangeHttpCore(HttpCore httpCore) {
        return new Http(this.asyncHttp.exchangeHttpCore(httpCore), new SyncHttpScheduler(httpCore));
    }

    public <Result> Request<Result> failedRequest(final AblyException ablyException) {
        return new Request<>(new Execute<Result>() { // from class: io.ably.lib.http.Http.1
            @Override // io.ably.lib.http.Http.Execute
            public void execute(HttpScheduler httpScheduler, final Callback<Result> callback) {
                httpScheduler.execute(new Runnable() { // from class: io.ably.lib.http.Http.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        callback.onError(ablyException.errorInfo);
                    }
                });
            }
        });
    }

    public <Result> Request<Result> request(Execute<Result> execute) {
        return new Request<>(execute);
    }
}
