package io.ably.lib.http;

import defpackage.sk0;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.AsyncPaginatedResult;
import io.ably.lib.types.BasePaginatedResult;
import io.ably.lib.types.Callback;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.PaginatedResult;
import io.ably.lib.types.Param;
import j$.net.URLDecoder;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class BasePaginatedQuery<T> implements HttpCore.ResponseHandler<BasePaginatedResult<T>> {
    protected static Pattern linkPattern = Pattern.compile("\\s*<(.*)>;\\s*rel=\"(.*)\"");
    protected static Pattern urlPattern = Pattern.compile("\\./(.*)\\?(.*)");
    private final HttpCore.BodyHandler<T> bodyHandler;
    private final Http http;
    private final String path;
    private final HttpCore.RequestBody requestBody;
    private final Param[] requestHeaders;
    private final Param[] requestParams;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class AsyncResultPage<T> extends ResultPageWrapper<T> implements AsyncPaginatedResult<T> {
        public AsyncResultPage(BasePaginatedResult<T> basePaginatedResult) {
            super(basePaginatedResult);
        }

        @Override // io.ably.lib.types.AsyncPaginatedResult
        public void current(Callback<AsyncPaginatedResult<T>> callback) {
            this.resultBase.current().async(new CallbackBridge(callback));
        }

        @Override // io.ably.lib.types.AsyncPaginatedResult
        public void first(Callback<AsyncPaginatedResult<T>> callback) {
            this.resultBase.first().async(new CallbackBridge(callback));
        }

        @Override // io.ably.lib.types.AsyncPaginatedResult
        public void next(Callback<AsyncPaginatedResult<T>> callback) {
            this.resultBase.next().async(new CallbackBridge(callback));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class CallbackBridge<T> implements Callback<BasePaginatedResult<T>> {
        private final Callback<AsyncPaginatedResult<T>> callback;

        public CallbackBridge(Callback<AsyncPaginatedResult<T>> callback) {
            this.callback = callback;
        }

        @Override // io.ably.lib.types.Callback
        public void onError(ErrorInfo errorInfo) {
            this.callback.onError(errorInfo);
        }

        @Override // io.ably.lib.types.Callback
        public void onSuccess(BasePaginatedResult<T> basePaginatedResult) {
            this.callback.onSuccess(new AsyncResultPage(basePaginatedResult));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class ResultPage implements BasePaginatedResult<T> {
        private T[] contents;
        private String relCurrent;
        private String relFirst;
        private String relNext;

        private ResultPage(T[] tArr, Collection<String> collection) {
            this.contents = tArr;
            if (collection != null) {
                HashMap<String, String> links = BasePaginatedQuery.parseLinks(collection);
                this.relFirst = links.get("first");
                this.relCurrent = links.get("current");
                this.relNext = links.get("next");
            }
        }

        private Http.Request<BasePaginatedResult<T>> getRel(final String str) {
            return BasePaginatedQuery.this.http.request(new Http.Execute<BasePaginatedResult<T>>() { // from class: io.ably.lib.http.BasePaginatedQuery.ResultPage.1
                @Override // io.ably.lib.http.Http.Execute
                public void execute(HttpScheduler httpScheduler, Callback<BasePaginatedResult<T>> callback) throws AblyException {
                    String str2 = str;
                    if (str2 == null) {
                        callback.onSuccess(null);
                        return;
                    }
                    Matcher matcher = BasePaginatedQuery.urlPattern.matcher(str2);
                    if (!matcher.matches()) {
                        throw sk0.b(500, 50000, "Unexpected link URL format");
                    }
                    String[] strArrSplit = matcher.group(2).split("&");
                    Param[] paramArr = new Param[strArrSplit.length];
                    for (int i = 0; i < strArrSplit.length; i++) {
                        try {
                            String[] strArrSplit2 = strArrSplit[i].split("=");
                            paramArr[i] = new Param(strArrSplit2[0], URLDecoder.decode(strArrSplit2[1], "UTF-8"));
                        } catch (UnsupportedEncodingException unused) {
                        }
                    }
                    httpScheduler.get(BasePaginatedQuery.this.path, BasePaginatedQuery.this.requestHeaders, paramArr, BasePaginatedQuery.this, true, callback);
                }
            });
        }

        @Override // io.ably.lib.types.BasePaginatedResult
        public Http.Request<BasePaginatedResult<T>> current() {
            return getRel(this.relCurrent);
        }

        @Override // io.ably.lib.types.BasePaginatedResult
        public Http.Request<BasePaginatedResult<T>> first() {
            return getRel(this.relFirst);
        }

        @Override // io.ably.lib.types.BasePaginatedResult
        public boolean hasCurrent() {
            return this.relCurrent != null;
        }

        @Override // io.ably.lib.types.BasePaginatedResult
        public boolean hasFirst() {
            return this.relFirst != null;
        }

        @Override // io.ably.lib.types.BasePaginatedResult
        public boolean hasNext() {
            return this.relNext != null;
        }

        @Override // io.ably.lib.types.BasePaginatedResult
        public boolean isLast() {
            return this.relNext == null;
        }

        @Override // io.ably.lib.types.BasePaginatedResult
        public T[] items() {
            return this.contents;
        }

        @Override // io.ably.lib.types.BasePaginatedResult
        public Http.Request<BasePaginatedResult<T>> next() {
            return getRel(this.relNext);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class ResultPageWrapper<T> {
        protected final BasePaginatedResult<T> resultBase;

        public ResultPageWrapper(BasePaginatedResult<T> basePaginatedResult) {
            this.resultBase = basePaginatedResult;
        }

        public boolean hasCurrent() {
            return this.resultBase.hasCurrent();
        }

        public boolean hasFirst() {
            return this.resultBase.hasFirst();
        }

        public boolean hasNext() {
            return this.resultBase.hasNext();
        }

        public boolean isLast() {
            return this.resultBase.isLast();
        }

        public T[] items() {
            return this.resultBase.items();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class ResultRequest<T> {
        private final Http.Request<BasePaginatedResult<T>> wrappedRequest;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static class Failed<T> extends ResultRequest<T> {
            private final AblyException reason;

            /* JADX WARN: Multi-variable type inference failed */
            public Failed(AblyException ablyException) {
                super(null);
                this.reason = ablyException;
            }

            @Override // io.ably.lib.http.BasePaginatedQuery.ResultRequest
            public void async(Callback<AsyncPaginatedResult<T>> callback) {
                callback.onError(this.reason.errorInfo);
            }

            @Override // io.ably.lib.http.BasePaginatedQuery.ResultRequest
            public PaginatedResult<T> sync() throws AblyException {
                throw this.reason;
            }
        }

        private ResultRequest(Http.Request<BasePaginatedResult<T>> request) {
            this.wrappedRequest = request;
        }

        public void async(final Callback<AsyncPaginatedResult<T>> callback) {
            this.wrappedRequest.async(new Callback<BasePaginatedResult<T>>() { // from class: io.ably.lib.http.BasePaginatedQuery.ResultRequest.1
                @Override // io.ably.lib.types.Callback
                public void onError(ErrorInfo errorInfo) {
                    callback.onError(errorInfo);
                }

                @Override // io.ably.lib.types.Callback
                public void onSuccess(BasePaginatedResult<T> basePaginatedResult) {
                    callback.onSuccess(new AsyncResultPage(basePaginatedResult));
                }
            });
        }

        public PaginatedResult<T> sync() {
            return new SyncResultPage(this.wrappedRequest.sync());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class SyncResultPage<T> extends ResultPageWrapper<T> implements PaginatedResult<T> {
        public SyncResultPage(BasePaginatedResult<T> basePaginatedResult) {
            super(basePaginatedResult);
        }

        @Override // io.ably.lib.types.PaginatedResult
        public PaginatedResult<T> current() {
            return new SyncResultPage(this.resultBase.current().sync());
        }

        @Override // io.ably.lib.types.PaginatedResult
        public PaginatedResult<T> first() {
            return new SyncResultPage(this.resultBase.first().sync());
        }

        @Override // io.ably.lib.types.PaginatedResult
        public PaginatedResult<T> next() {
            return new SyncResultPage(this.resultBase.next().sync());
        }
    }

    public BasePaginatedQuery(Http http, String str, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody, HttpCore.BodyHandler<T> bodyHandler) {
        this.http = http;
        this.path = str;
        this.requestHeaders = paramArr;
        this.requestParams = paramArr2;
        this.requestBody = requestBody;
        this.bodyHandler = bodyHandler;
    }

    public static HashMap<String, String> parseLinks(Collection<String> collection) {
        HashMap<String, String> map = new HashMap<>();
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            Matcher matcher = linkPattern.matcher(it.next());
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                for (String str : matcher.group(2).toLowerCase(Locale.ENGLISH).split("\\s")) {
                    map.put(str, strGroup);
                }
            }
        }
        return map;
    }

    public Http.Request<BasePaginatedResult<T>> exec(final String str) {
        return this.http.request(new Http.Execute<BasePaginatedResult<T>>() { // from class: io.ably.lib.http.BasePaginatedQuery.1
            @Override // io.ably.lib.http.Http.Execute
            public void execute(HttpScheduler httpScheduler, Callback<BasePaginatedResult<T>> callback) {
                httpScheduler.exec(BasePaginatedQuery.this.path, str, BasePaginatedQuery.this.requestHeaders, BasePaginatedQuery.this.requestParams, BasePaginatedQuery.this.requestBody, this, true, callback);
            }
        });
    }

    public ResultRequest<T> get() {
        return new ResultRequest<>(exec(HttpConstants.Methods.GET));
    }

    @Override // io.ably.lib.http.HttpCore.ResponseHandler
    public BasePaginatedResult<T> handleResponse(HttpCore.Response response, ErrorInfo errorInfo) throws AblyException {
        if (errorInfo == null) {
            return new ResultPage(this.bodyHandler.handleResponseBody(response.contentType, response.body), response.getHeaderFields(HttpConstants.Headers.LINK));
        }
        throw AblyException.fromErrorInfo(errorInfo);
    }

    public BasePaginatedQuery(Http http, String str, Param[] paramArr, Param[] paramArr2, HttpCore.BodyHandler<T> bodyHandler) {
        this(http, str, paramArr, paramArr2, null, bodyHandler);
    }
}
