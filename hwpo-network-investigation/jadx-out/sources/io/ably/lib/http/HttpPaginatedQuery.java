package io.ably.lib.http;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.intercom.twig.BuildConfig;
import defpackage.ct1;
import defpackage.sk0;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.Callback;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.HttpPaginatedResponse;
import io.ably.lib.types.Param;
import io.ably.lib.util.Serialisation;
import j$.net.URLDecoder;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class HttpPaginatedQuery implements HttpCore.ResponseHandler<HttpPaginatedResponse> {
    static final HttpCore.BodyHandler<JsonElement> jsonArrayResponseHandler = new HttpCore.BodyHandler<JsonElement>() { // from class: io.ably.lib.http.HttpPaginatedQuery.2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ably.lib.http.HttpCore.BodyHandler
        public JsonElement[] handleResponseBody(String str, byte[] bArr) throws AblyException {
            if (!HttpConstants.ContentTypes.JSON.equals(str)) {
                throw AblyException.fromErrorInfo(new ErrorInfo(ct1.a("Unexpected content type: ", str), 500, 50000));
            }
            JsonElement jsonElement = Serialisation.gsonParser.parse(new String(bArr, Charset.forName("UTF-8")));
            if (!jsonElement.isJsonArray()) {
                return new JsonElement[]{jsonElement};
            }
            JsonArray asJsonArray = jsonElement.getAsJsonArray();
            int size = asJsonArray.size();
            JsonElement[] jsonElementArr = new JsonElement[size];
            for (int i = 0; i < size; i++) {
                jsonElementArr[i] = asJsonArray.get(i);
            }
            return jsonElementArr;
        }
    };
    private final HttpCore.BodyHandler<JsonElement> bodyHandler = jsonArrayResponseHandler;
    private final Http http;
    private final String method;
    private final String path;
    private final HttpCore.RequestBody requestBody;
    private final Param[] requestHeaders;
    private final Param[] requestParams;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class HttpPaginatedResult extends HttpPaginatedResponse {
        private JsonElement[] contents;
        private String relCurrent;
        private String relFirst;
        private String relNext;

        private HttpPaginatedResult(HttpCore.Response response, ErrorInfo errorInfo) {
            this.statusCode = response.statusCode;
            this.headers = HttpUtils.toParamArray(response.headers);
            if (errorInfo != null) {
                this.errorCode = errorInfo.code;
                this.errorMessage = errorInfo.message;
            } else {
                this.success = true;
                if (response.body != null) {
                    this.contents = (JsonElement[]) HttpPaginatedQuery.this.bodyHandler.handleResponseBody(response.contentType, response.body);
                }
            }
            List<String> headerFields = response.getHeaderFields(HttpConstants.Headers.LINK);
            if (headerFields != null) {
                HashMap<String, String> links = BasePaginatedQuery.parseLinks(headerFields);
                this.relFirst = links.get("first");
                this.relCurrent = links.get("current");
                this.relNext = links.get("next");
            }
        }

        private HttpPaginatedResponse execRel(String str) throws AblyException {
            if (str == null) {
                return null;
            }
            Matcher matcher = BasePaginatedQuery.urlPattern.matcher(str);
            if (!matcher.matches()) {
                throw sk0.b(500, 50000, "Unexpected link URL format");
            }
            String[] strArrSplit = matcher.group(2).split("&");
            Param[] paramArr = new Param[strArrSplit.length];
            for (int i = 0; i < strArrSplit.length; i++) {
                try {
                    String[] strArrSplit2 = strArrSplit[i].split("=");
                    paramArr[i] = new Param(strArrSplit2[0], URLDecoder.decode(strArrSplit2.length >= 2 ? strArrSplit2[1] : BuildConfig.FLAVOR, "UTF-8"));
                } catch (UnsupportedEncodingException unused) {
                }
            }
            return HttpPaginatedQuery.this.exec(paramArr);
        }

        @Override // io.ably.lib.types.HttpPaginatedResponse
        public HttpPaginatedResponse current() {
            return execRel(this.relCurrent);
        }

        @Override // io.ably.lib.types.HttpPaginatedResponse
        public HttpPaginatedResponse first() {
            return execRel(this.relFirst);
        }

        @Override // io.ably.lib.types.HttpPaginatedResponse
        public boolean hasCurrent() {
            return this.relCurrent != null;
        }

        @Override // io.ably.lib.types.HttpPaginatedResponse
        public boolean hasFirst() {
            return this.relFirst != null;
        }

        @Override // io.ably.lib.types.HttpPaginatedResponse
        public boolean hasNext() {
            return this.relNext != null;
        }

        @Override // io.ably.lib.types.HttpPaginatedResponse
        public boolean isLast() {
            return this.relNext == null;
        }

        @Override // io.ably.lib.types.HttpPaginatedResponse
        public JsonElement[] items() {
            return this.contents;
        }

        @Override // io.ably.lib.types.HttpPaginatedResponse
        public HttpPaginatedResponse next() {
            return execRel(this.relNext);
        }
    }

    public HttpPaginatedQuery(Http http, String str, String str2, Param[] paramArr, Param[] paramArr2, HttpCore.RequestBody requestBody) {
        this.http = http;
        this.method = str;
        this.path = str2;
        this.requestHeaders = paramArr;
        this.requestParams = paramArr2;
        this.requestBody = requestBody;
    }

    public HttpPaginatedResponse exec(final Param[] paramArr) {
        return (HttpPaginatedResponse) this.http.request(new Http.Execute<HttpPaginatedResponse>() { // from class: io.ably.lib.http.HttpPaginatedQuery.1
            @Override // io.ably.lib.http.Http.Execute
            public void execute(HttpScheduler httpScheduler, Callback<HttpPaginatedResponse> callback) {
                httpScheduler.exec(HttpPaginatedQuery.this.path, HttpPaginatedQuery.this.method, HttpPaginatedQuery.this.requestHeaders, paramArr, HttpPaginatedQuery.this.requestBody, this, true, callback);
            }
        }).sync();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.ably.lib.http.HttpCore.ResponseHandler
    public HttpPaginatedResponse handleResponse(HttpCore.Response response, ErrorInfo errorInfo) {
        return new HttpPaginatedResult(response, errorInfo);
    }

    public HttpPaginatedResponse exec() {
        return exec(this.requestParams);
    }
}
