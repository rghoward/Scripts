package io.ably.lib.http;

import com.google.gson.JsonParseException;
import defpackage.sk0;
import io.ably.lib.debug.DebugOptions;
import io.ably.lib.network.FailedConnectionException;
import io.ably.lib.network.HttpBody;
import io.ably.lib.network.HttpEngine;
import io.ably.lib.network.HttpEngineConfig;
import io.ably.lib.network.HttpEngineFactory;
import io.ably.lib.network.HttpRequest;
import io.ably.lib.network.HttpResponse;
import io.ably.lib.rest.Auth;
import io.ably.lib.transport.Defaults;
import io.ably.lib.transport.Hosts;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.ClientOptions;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.ErrorResponse;
import io.ably.lib.types.Param;
import io.ably.lib.types.ProxyOptions;
import io.ably.lib.util.AgentHeaderCreator;
import io.ably.lib.util.Base64Coder;
import io.ably.lib.util.ClientOptionsUtils;
import io.ably.lib.util.Log;
import io.ably.lib.util.PlatformAgentProvider;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class HttpCore {
    private static final String TAG = "io.ably.lib.http.HttpCore";
    private final Auth auth;
    private Map<String, String> dynamicAgents;
    private final HttpEngine engine;
    final Hosts hosts;
    final ClientOptions options;
    private final PlatformAgentProvider platformAgentProvider;
    public final int port;
    private HttpAuth proxyAuth;
    public final String scheme;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class AuthRequiredException extends AblyException {
        private static final long serialVersionUID = 1;
        public Map<HttpAuth.Type, String> authChallenge;
        public boolean expired;
        public Map<HttpAuth.Type, String> proxyAuthChallenge;

        public AuthRequiredException(Throwable th, ErrorInfo errorInfo) {
            super(th, errorInfo);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface BodyHandler<T> {
        T[] handleResponseBody(String str, byte[] bArr);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface RequestBody {
        String getContentType();

        byte[] getEncoded();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class Response {
        public byte[] body;
        public int contentLength;
        public String contentType;
        public Map<String, List<String>> headers;
        public int statusCode;
        public String statusLine;

        public String getHeaderField(String str) {
            List<String> list;
            Map<String, List<String>> map = this.headers;
            if (map == null || (list = map.get(str.toLowerCase(Locale.ROOT))) == null || list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }

        public List<String> getHeaderFields(String str) {
            Map<String, List<String>> map = this.headers;
            if (map == null) {
                return null;
            }
            return map.get(str.toLowerCase(Locale.ROOT));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface ResponseHandler<T> {
        T handleResponse(Response response, ErrorInfo errorInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    static {
        int i;
        ?? r0;
        ?? field = 0;
        try {
            field = Class.forName("android.os.Build$VERSION").getField("SDK_INT");
            i = field.getInt(field);
            r0 = field;
        } catch (Exception unused) {
            i = 0;
            r0 = field;
        }
        if (r0 == 0 || i >= 8) {
            return;
        }
        System.setProperty("httpCore.keepAlive", "false");
    }

    public HttpCore(ClientOptions clientOptions, Auth auth, PlatformAgentProvider platformAgentProvider) throws AblyException {
        this.options = clientOptions;
        this.auth = auth;
        this.platformAgentProvider = platformAgentProvider;
        this.scheme = clientOptions.tls ? "https://" : "http://";
        this.port = Defaults.getPort(clientOptions);
        this.hosts = new Hosts(clientOptions.restHost, Defaults.HOST_REST, clientOptions);
        ProxyOptions proxyOptions = clientOptions.proxy;
        if (proxyOptions != null) {
            if (proxyOptions.host == null) {
                throw sk0.b(40000, CarouselScreenFragment.CAROUSEL_ANIMATION_MS, "Unable to configure proxy without proxy host");
            }
            if (proxyOptions.port == 0) {
                throw sk0.b(40000, CarouselScreenFragment.CAROUSEL_ANIMATION_MS, "Unable to configure proxy without proxy port");
            }
            String str = proxyOptions.username;
            if (str != null) {
                String str2 = proxyOptions.password;
                if (str2 == null) {
                    throw sk0.b(40000, CarouselScreenFragment.CAROUSEL_ANIMATION_MS, "Unable to configure proxy without proxy password");
                }
                this.proxyAuth = new HttpAuth(str, str2, proxyOptions.prefAuthType);
            }
        }
        HttpEngineFactory firstAvailable = HttpEngineFactory.getFirstAvailable();
        Log.v(TAG, "Using " + firstAvailable.getEngineType().name() + " HTTP Engine");
        this.engine = firstAvailable.create(new HttpEngineConfig(ClientOptionsUtils.convertToProxyConfig(clientOptions)));
    }

    private Map<String, String> collectRequestHeaders(URL url, String str, Param[] paramArr, RequestBody requestBody, boolean z, boolean z2) {
        Auth auth;
        HashMap map = new HashMap();
        String first = Param.getFirst(paramArr, HttpConstants.Headers.AUTHORIZATION);
        if (first == null && (auth = this.auth) != null) {
            first = auth.getAuthorizationHeader();
        }
        if (z && first != null) {
            map.put(HttpConstants.Headers.AUTHORIZATION, first);
        }
        if (z2 && this.proxyAuth.hasChallenge()) {
            map.put(HttpConstants.Headers.PROXY_AUTHORIZATION, this.proxyAuth.getAuthorizationHeader(str, url.getPath(), requestBody != null ? requestBody.getEncoded() : null));
        }
        int i = 0;
        if (paramArr != null) {
            int length = paramArr.length;
            int i2 = 0;
            while (i < length) {
                Param param = paramArr[i];
                map.put(param.key, param.value);
                if (param.key.equals(HttpConstants.Headers.ACCEPT)) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
        }
        if (i == 0) {
            map.put(HttpConstants.Headers.ACCEPT, HttpConstants.ContentTypes.JSON);
        }
        if (!map.containsKey(Defaults.ABLY_PROTOCOL_VERSION_HEADER)) {
            map.put(Defaults.ABLY_PROTOCOL_VERSION_HEADER, Defaults.ABLY_PROTOCOL_VERSION);
        }
        HashMap map2 = new HashMap();
        Map<String, String> map3 = this.options.agents;
        if (map3 != null) {
            map2.putAll(map3);
        }
        Map<String, String> map4 = this.dynamicAgents;
        if (map4 != null) {
            map2.putAll(map4);
        }
        map.put(Defaults.ABLY_AGENT_HEADER, AgentHeaderCreator.create(map2, this.platformAgentProvider));
        String str2 = this.options.clientId;
        if (str2 != null) {
            map.put(Defaults.ABLY_CLIENT_ID_HEADER, Base64Coder.encodeString(str2));
        }
        return map;
    }

    private Response executeRequest(HttpRequest httpRequest) {
        HttpResponse httpResponseExecute = this.engine.call(httpRequest).execute();
        Response response = new Response();
        response.statusCode = httpResponseExecute.getCode();
        response.statusLine = httpResponseExecute.getMessage();
        Log.v(TAG, "HTTP response:");
        Map<String, List<String>> headers = httpResponseExecute.getHeaders();
        response.headers = new HashMap(headers.size(), 1.0f);
        for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
            if (entry.getKey() != null) {
                response.headers.put(entry.getKey().toLowerCase(Locale.ROOT), entry.getValue());
                if (Log.level <= 2) {
                    for (String str : entry.getValue()) {
                        Log.v(TAG, entry.getKey() + ": " + str);
                    }
                }
            }
        }
        if (response.statusCode != 204 && httpResponseExecute.getBody() != null) {
            response.contentType = httpResponseExecute.getBody().getContentType();
            byte[] content = httpResponseExecute.getBody().getContent();
            response.body = content;
            response.contentLength = content == null ? 0 : content.length;
            if (Log.level <= 2 && content != null) {
                Log.v(TAG, System.lineSeparator() + new String(response.body));
            }
        }
        return response;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    private <T> T handleResponse(boolean z, Response response, ResponseHandler<T> responseHandler) throws AblyException {
        ErrorInfo errorInfoFromResponseStatus;
        List<String> headerFields;
        int i = response.statusCode;
        if (i != 0) {
            if (i >= 500 && i <= 504) {
                throw AblyException.fromErrorInfo(ErrorInfo.fromResponseStatus(response.statusLine, i));
            }
            if (i < 200 || i >= 300) {
                byte[] bArr = response.body;
                if (bArr == null || bArr.length <= 0) {
                    errorInfoFromResponseStatus = null;
                } else {
                    String str = response.contentType;
                    if (str == null || !str.contains("msgpack")) {
                        String str2 = new String(response.body);
                        try {
                            ErrorResponse errorResponseFromJSON = ErrorResponse.fromJSON(str2);
                            if (errorResponseFromJSON != null) {
                                errorInfoFromResponseStatus = errorResponseFromJSON.error;
                            } else {
                                errorInfoFromResponseStatus = null;
                            }
                        } catch (JsonParseException unused) {
                            System.err.println("Error message in unexpected format: ".concat(str2));
                        }
                    } else {
                        try {
                            errorInfoFromResponseStatus = ErrorInfo.fromMsgpackBody(response.body);
                        } catch (IOException unused2) {
                            System.err.println("Unable to parse msgpack error response");
                            errorInfoFromResponseStatus = null;
                        }
                    }
                }
                if (errorInfoFromResponseStatus == null) {
                    String headerField = response.getHeaderField("X-Ably-ErrorCode");
                    String headerField2 = response.getHeaderField("X-Ably-ErrorMessage");
                    if (headerField != null) {
                        try {
                            errorInfoFromResponseStatus = new ErrorInfo(headerField2, response.statusCode, Integer.parseInt(headerField));
                        } catch (NumberFormatException unused3) {
                        }
                    }
                }
                if (response.statusCode == 401) {
                    boolean z2 = errorInfoFromResponseStatus != null && errorInfoFromResponseStatus.code == 40140;
                    List<String> headerFields2 = response.getHeaderFields(HttpConstants.Headers.WWW_AUTHENTICATE);
                    if (headerFields2 != null && headerFields2.size() > 0) {
                        Map<HttpAuth.Type, String> mapSortAuthenticateHeaders = HttpAuth.sortAuthenticateHeaders(headerFields2);
                        String str3 = mapSortAuthenticateHeaders.get(HttpAuth.Type.X_ABLY_TOKEN);
                        if (str3 != null) {
                            z2 |= str3.indexOf("stale") > -1;
                        }
                        AuthRequiredException authRequiredException = new AuthRequiredException(null, errorInfoFromResponseStatus);
                        authRequiredException.authChallenge = mapSortAuthenticateHeaders;
                        if (z2) {
                            authRequiredException.expired = true;
                            throw authRequiredException;
                        }
                        if (!z) {
                            throw authRequiredException;
                        }
                    }
                }
                if (response.statusCode == 407 && (headerFields = response.getHeaderFields(HttpConstants.Headers.PROXY_AUTHENTICATE)) != null && !headerFields.isEmpty()) {
                    AuthRequiredException authRequiredException2 = new AuthRequiredException(null, errorInfoFromResponseStatus);
                    authRequiredException2.proxyAuthChallenge = HttpAuth.sortAuthenticateHeaders(headerFields);
                    throw authRequiredException2;
                }
                if (errorInfoFromResponseStatus == null) {
                    errorInfoFromResponseStatus = ErrorInfo.fromResponseStatus(response.statusLine, response.statusCode);
                }
                Log.e(TAG, "Error response from server: err = " + errorInfoFromResponseStatus);
                if (responseHandler != null) {
                    return responseHandler.handleResponse(response, errorInfoFromResponseStatus);
                }
                throw AblyException.fromErrorInfo(errorInfoFromResponseStatus);
            }
            if (responseHandler != null) {
                return responseHandler.handleResponse(response, null);
            }
        }
        return null;
    }

    public void authorize(boolean z) {
        this.auth.assertAuthorizationHeader(z);
    }

    public String getPreferredHost() {
        return this.hosts.getPreferredHost();
    }

    public String getPrimaryHost() {
        return this.hosts.getPrimaryHost();
    }

    public <T> T httpExecute(URL url, String str, Param[] paramArr, RequestBody requestBody, boolean z, boolean z2, ResponseHandler<T> responseHandler) throws AblyException {
        String strSubstring;
        HttpRequest.HttpRequestBuilder httpRequestBuilderBuilder = HttpRequest.builder();
        DebugOptions.RawHttpListener rawHttpListener = null;
        httpRequestBuilderBuilder.url(url).method(str).httpOpenTimeout(this.options.httpOpenTimeout).httpReadTimeout(this.options.httpRequestTimeout).body(requestBody != null ? new HttpBody(requestBody.getContentType(), requestBody.getEncoded()) : null);
        Map<String, String> mapCollectRequestHeaders = collectRequestHeaders(url, str, paramArr, requestBody, z, z2);
        boolean zContainsKey = mapCollectRequestHeaders.containsKey(HttpConstants.Headers.AUTHORIZATION);
        String str2 = mapCollectRequestHeaders.get(HttpConstants.Headers.AUTHORIZATION);
        httpRequestBuilderBuilder.headers(mapCollectRequestHeaders);
        HttpRequest httpRequestBuild = httpRequestBuilderBuilder.build();
        if (Log.level <= 2 && httpRequestBuild.getBody() != null && httpRequestBuild.getBody().getContent() != null) {
            Log.v(TAG, System.lineSeparator() + new String(httpRequestBuild.getBody().getContent()));
        }
        Map<String, List<String>> headers = httpRequestBuild.getHeaders();
        if (Log.level <= 2) {
            String str3 = TAG;
            Log.v(str3, "HTTP request: " + url + " " + str);
            if (zContainsKey) {
                Log.v(str3, "  Authorization: " + str2);
            }
            for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
                for (String str4 : entry.getValue()) {
                    Log.v(TAG, "  " + entry.getKey() + ": " + str4);
                }
            }
            if (requestBody != null) {
                String str5 = TAG;
                Log.v(str5, "  Content-Type: " + requestBody.getContentType());
                StringBuilder sb = new StringBuilder("  Content-Length: ");
                sb.append(requestBody.getEncoded() != null ? requestBody.getEncoded().length : 0);
                Log.v(str5, sb.toString());
            }
        }
        ClientOptions clientOptions = this.options;
        if (clientOptions instanceof DebugOptions) {
            DebugOptions.RawHttpListener rawHttpListener2 = ((DebugOptions) clientOptions).httpListener;
            if (rawHttpListener2 != null) {
                strSubstring = String.valueOf(Math.random()).substring(2);
                Response responseOnRawHttpRequest = rawHttpListener2.onRawHttpRequest(strSubstring, httpRequestBuild, zContainsKey ? str2 : null, headers, requestBody);
                if (responseOnRawHttpRequest != null) {
                    return (T) handleResponse(zContainsKey, responseOnRawHttpRequest, responseHandler);
                }
            } else {
                strSubstring = null;
            }
            rawHttpListener = rawHttpListener2;
        } else {
            strSubstring = null;
        }
        try {
            Response responseExecuteRequest = executeRequest(httpRequestBuild);
            if (rawHttpListener != null) {
                rawHttpListener.onRawHttpResponse(strSubstring, str, responseExecuteRequest);
            }
            return (T) handleResponse(zContainsKey, responseExecuteRequest, responseHandler);
        } catch (FailedConnectionException e) {
            throw AblyException.fromThrowable(e);
        } catch (Exception e2) {
            if (e2.getCause() instanceof IOException) {
                throw AblyException.fromThrowable(e2.getCause());
            }
            throw AblyException.fromThrowable(e2);
        }
    }

    public <T> T httpExecuteWithRetry(URL url, String str, Param[] paramArr, RequestBody requestBody, ResponseHandler<T> responseHandler, boolean z) throws AblyException {
        HttpAuth httpAuth;
        if (z) {
            authorize(false);
        }
        boolean z2 = true;
        boolean z3 = true;
        while (true) {
            try {
                return (T) this.httpExecute(url, str, paramArr, requestBody, true, responseHandler);
            } catch (AuthRequiredException e) {
                if (e.authChallenge != null && z && e.expired && z2) {
                    this.authorize(true);
                    z2 = false;
                } else {
                    Map<HttpAuth.Type, String> map = e.proxyAuthChallenge;
                    if (map == null || !z3 || (httpAuth = this.proxyAuth) == null) {
                        throw e;
                    }
                    httpAuth.processAuthenticateHeaders(map);
                    z3 = false;
                }
            }
        }
    }

    public HttpCore injectDynamicAgents(Map<String, String> map) {
        return new HttpCore(this, map);
    }

    public void setPreferredHost(String str) {
        this.hosts.setPreferredHost(str, false);
    }

    private HttpCore(HttpCore httpCore, Map<String, String> map) {
        this.options = httpCore.options;
        this.auth = httpCore.auth;
        this.platformAgentProvider = httpCore.platformAgentProvider;
        this.scheme = httpCore.scheme;
        this.port = httpCore.port;
        this.hosts = httpCore.hosts;
        this.proxyAuth = httpCore.proxyAuth;
        this.engine = httpCore.engine;
        this.dynamicAgents = map;
    }

    public <T> T httpExecute(URL url, String str, Param[] paramArr, RequestBody requestBody, boolean z, ResponseHandler<T> responseHandler) {
        return (T) httpExecute(url, str, paramArr, requestBody, z, this.engine.isUsingProxy() && this.proxyAuth != null, responseHandler);
    }
}
