package io.ably.lib.rest;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.intercom.twig.BuildConfig;
import defpackage.av;
import defpackage.sk0;
import defpackage.wu0;
import defpackage.z90;
import io.ably.lib.http.HttpConstants;
import io.ably.lib.http.HttpCore;
import io.ably.lib.http.HttpHelpers;
import io.ably.lib.http.HttpUtils;
import io.ably.lib.realtime.Presence;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.BaseMessage;
import io.ably.lib.types.Capability;
import io.ably.lib.types.ClientOptions;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.NonRetriableTokenException;
import io.ably.lib.types.Param;
import io.ably.lib.util.Base64Coder;
import io.ably.lib.util.Log;
import io.ably.lib.util.Serialisation;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class Auth {
    private static final String TAG = "io.ably.lib.rest.Auth";
    public static final String WILDCARD_CLIENTID = "*";
    private final AblyBase ably;
    private String authHeader;
    private AuthOptions authOptions;
    private String basicCredentials;
    public String clientId;
    private String encodedToken;
    private final AuthMethod method;
    private TokenDetails tokenDetails;
    private TokenParams tokenParams;
    private long timeDelta = Long.MAX_VALUE;
    private long nanoTimeDelta = System.currentTimeMillis() - (System.nanoTime() / 1000000);

    /* JADX INFO: renamed from: io.ably.lib.rest.Auth$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$io$ably$lib$rest$Auth$AuthMethod;

        static {
            int[] iArr = new int[AuthMethod.values().length];
            $SwitchMap$io$ably$lib$rest$Auth$AuthMethod = iArr;
            try {
                iArr[AuthMethod.basic.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$ably$lib$rest$Auth$AuthMethod[AuthMethod.token.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public enum AuthMethod {
        basic,
        token
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface AuthUpdateResult {
        void onUpdate(boolean z, ErrorInfo errorInfo);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface RenewAuthResult {
        void onCompletion(boolean z, TokenDetails tokenDetails, ErrorInfo errorInfo);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface TokenCallback {
        Object getTokenRequest(TokenParams tokenParams);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class TokenParams {
        public String capability;
        public String clientId;
        public long timestamp;
        public long ttl;

        /* JADX INFO: Access modifiers changed from: private */
        public TokenParams copy() {
            TokenParams tokenParams = new TokenParams();
            tokenParams.ttl = this.ttl;
            tokenParams.capability = this.capability;
            tokenParams.clientId = this.clientId;
            tokenParams.timestamp = this.timestamp;
            return tokenParams;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public TokenParams storedValues() {
            TokenParams tokenParams = new TokenParams();
            tokenParams.ttl = this.ttl;
            tokenParams.capability = this.capability;
            tokenParams.clientId = this.clientId;
            return tokenParams;
        }

        public Map<String, Param> asMap() {
            HashMap map = new HashMap();
            long j = this.ttl;
            if (j > 0) {
                map.put("ttl", new Param("ttl", String.valueOf(j)));
            }
            String str = this.capability;
            if (str != null) {
                map.put("capability", new Param("capability", str));
            }
            String str2 = this.clientId;
            if (str2 != null) {
                map.put(Presence.GET_CLIENTID, new Param(Presence.GET_CLIENTID, str2));
            }
            long j2 = this.timestamp;
            if (j2 > 0) {
                map.put("timestamp", new Param("timestamp", String.valueOf(j2)));
            }
            return map;
        }

        public boolean equals(Object obj) {
            TokenParams tokenParams = (TokenParams) obj;
            return (this.ttl == tokenParams.ttl) & Auth.equalNullableStrings(this.capability, tokenParams.capability) & Auth.equalNullableStrings(this.clientId, tokenParams.clientId) & (this.timestamp == tokenParams.timestamp);
        }
    }

    public Auth(AblyBase ablyBase, ClientOptions clientOptions) throws AblyException {
        this.ably = ablyBase;
        this.authOptions = clientOptions;
        TokenParams tokenParams = clientOptions.defaultTokenParams;
        this.tokenParams = tokenParams == null ? new TokenParams() : tokenParams;
        String str = clientOptions.clientId;
        if (str != null) {
            if (str.equals(WILDCARD_CLIENTID)) {
                throw sk0.b(CarouselScreenFragment.CAROUSEL_ANIMATION_MS, 40000, "Disallowed wildcard clientId in ClientOptions");
            }
            setClientId(clientOptions.clientId);
            this.tokenParams.clientId = clientOptions.clientId;
        }
        AuthOptions authOptions = this.authOptions;
        if (authOptions.key != null && !clientOptions.useTokenAuth && clientOptions.token == null && clientOptions.tokenDetails == null && clientOptions.authCallback == null && clientOptions.authUrl == null) {
            Log.i("Auth()", "anonymous, using basic auth");
            this.method = AuthMethod.basic;
            this.basicCredentials = this.authOptions.key;
            setClientId(WILDCARD_CLIENTID);
            return;
        }
        this.method = AuthMethod.token;
        String str2 = authOptions.token;
        if (str2 != null) {
            setTokenDetails(str2);
        } else {
            TokenDetails tokenDetails = authOptions.tokenDetails;
            if (tokenDetails != null) {
                setTokenDetails(tokenDetails);
            }
        }
        AuthOptions authOptions2 = this.authOptions;
        if (authOptions2.authCallback != null) {
            Log.i("Auth()", "using token auth with authCallback");
            return;
        }
        String str3 = authOptions2.authUrl;
        if (str3 != null) {
            HttpUtils.parseUrl(str3);
            Log.i("Auth()", "using token auth with authUrl");
        } else if (authOptions2.key != null) {
            Log.i("Auth()", "using token auth with client-side signing");
        } else if (this.tokenDetails != null) {
            Log.i("Auth()", "using token auth with supplied token only");
        } else {
            Log.e("Auth()", "no authentication parameters supplied");
            throw AblyException.fromErrorInfo(new ErrorInfo("No authentication parameters supplied", CarouselScreenFragment.CAROUSEL_ANIMATION_MS, 40000));
        }
    }

    private TokenDetails assertValidToken(TokenParams tokenParams, AuthOptions authOptions, boolean z) throws AblyException {
        Log.i("Auth.assertValidToken()", BuildConfig.FLAVOR);
        TokenDetails tokenDetails = this.tokenDetails;
        if (tokenDetails != null) {
            if (!z && (tokenDetails.expires == 0 || tokenValid(tokenDetails))) {
                Log.i("Auth.assertValidToken()", "using cached token; expires = " + this.tokenDetails.expires);
                return this.tokenDetails;
            }
            Log.i("Auth.assertValidToken()", "deleting expired token");
            clearTokenDetails();
        }
        Log.i("Auth.assertValidToken()", "requesting new token");
        try {
            setTokenDetails(requestToken(tokenParams, authOptions));
            return this.tokenDetails;
        } catch (AblyException e) {
            if (shouldFailConnectionDueToAuthError(e.errorInfo)) {
                this.ably.onAuthError(e.errorInfo);
            }
            throw e;
        }
    }

    private void clearTokenDetails() {
        Log.i("TokenAuth.clearTokenDetails()", BuildConfig.FLAVOR);
        this.tokenDetails = null;
        this.encodedToken = null;
        this.authHeader = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean equalNullableStrings(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    private static String hmac(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(Charset.forName("UTF-8")), "HmacSHA256"));
            return new String(Base64Coder.encode(mac.doFinal(str.getBytes(Charset.forName("UTF-8")))));
        } catch (GeneralSecurityException e) {
            Log.e("Auth.hmac", "Unexpected exception", e);
            return null;
        }
    }

    private static String random() {
        return String.format(Locale.ROOT, "%016d", Long.valueOf((long) (Math.random() * 1.0E16d)));
    }

    private void setTokenDetails(TokenDetails tokenDetails) throws AblyException {
        Log.i("TokenAuth.setTokenDetails()", BuildConfig.FLAVOR);
        setClientId(tokenDetails.clientId);
        this.tokenDetails = tokenDetails;
        this.encodedToken = Base64Coder.encodeString(tokenDetails.token);
    }

    private boolean shouldFailConnectionDueToAuthError(ErrorInfo errorInfo) {
        return errorInfo.statusCode == 403 && errorInfo.code == 80019;
    }

    public static long timestamp() {
        return System.currentTimeMillis();
    }

    private boolean tokenValid(TokenDetails tokenDetails) {
        return this.timeDelta == Long.MAX_VALUE || tokenDetails.expires > serverTimestamp();
    }

    public void assertAuthorizationHeader(boolean z) {
        if (this.authHeader == null || z) {
            if (getAuthMethod() == AuthMethod.basic) {
                this.authHeader = "Basic " + Base64Coder.encodeString(getBasicCredentials());
            } else {
                if (z) {
                    renew();
                } else {
                    assertValidToken();
                }
                this.authHeader = "Bearer " + getEncodedToken();
            }
        }
    }

    @Deprecated
    public TokenDetails authorise(TokenParams tokenParams, AuthOptions authOptions) {
        Log.w(TAG, "authorise() is deprecated and will be removed in 1.0. Please use authorize() instead");
        return authorize(tokenParams, authOptions);
    }

    public TokenDetails authorize(TokenParams tokenParams, AuthOptions authOptions) throws AblyException {
        if (authOptions != null) {
            this.authOptions = authOptions.storedValues();
        }
        if (tokenParams != null) {
            this.tokenParams = tokenParams.storedValues();
        }
        AuthOptions authOptionsCopy = authOptions == null ? this.authOptions : authOptions.copy();
        TokenParams tokenParamsCopy = tokenParams == null ? this.tokenParams : tokenParams.copy();
        AuthOptions authOptions2 = this.authOptions;
        String str = authOptions2.token;
        if (str != null) {
            authOptions2.tokenDetails = new TokenDetails(str);
        }
        TokenDetails tokenDetailsAssertValidToken = this.authOptions.tokenDetails;
        if (tokenDetailsAssertValidToken != null) {
            setTokenDetails(tokenDetailsAssertValidToken);
        } else {
            try {
                tokenDetailsAssertValidToken = assertValidToken(tokenParamsCopy, authOptionsCopy, true);
            } catch (AblyException e) {
                this.ably.onAuthError(e.errorInfo);
                throw e;
            }
        }
        this.ably.onAuthUpdated(tokenDetailsAssertValidToken.token, true);
        return tokenDetailsAssertValidToken;
    }

    public String checkClientId(BaseMessage baseMessage, boolean z, boolean z2) throws AblyException {
        String str = baseMessage.clientId;
        if (WILDCARD_CLIENTID.equals(str)) {
            throw sk0.b(CarouselScreenFragment.CAROUSEL_ANIMATION_MS, 40000, "Invalid wildcard clientId specified in message");
        }
        String str2 = this.clientId;
        boolean z3 = str2 == null && !z2;
        if (str != null) {
            if (str.equals(str2) || WILDCARD_CLIENTID.equals(this.clientId) || z3) {
                return str;
            }
            throw sk0.b(CarouselScreenFragment.CAROUSEL_ANIMATION_MS, 40012, "Incompatible clientId specified in message");
        }
        if (str2 != null && !str2.equals(WILDCARD_CLIENTID)) {
            return this.clientId;
        }
        if (z || z3) {
            return null;
        }
        throw sk0.b(CarouselScreenFragment.CAROUSEL_ANIMATION_MS, 91000, "Invalid attempt to enter with no clientId");
    }

    public void clearCachedServerTime() {
        this.timeDelta = Long.MAX_VALUE;
    }

    public TokenRequest createTokenRequest(TokenParams tokenParams, AuthOptions authOptions) throws AblyException {
        AuthOptions authOptionsCopy = authOptions == null ? this.authOptions : authOptions.copy();
        TokenParams tokenParamsCopy = tokenParams == null ? this.tokenParams : tokenParams.copy();
        tokenParamsCopy.capability = Capability.c14n(tokenParamsCopy.capability);
        TokenRequest tokenRequest = new TokenRequest(tokenParamsCopy);
        String str = authOptionsCopy.key;
        if (str == null) {
            throw sk0.b(401, 40101, "No key specified");
        }
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length != 2) {
            throw sk0.b(401, 40101, "Invalid key specified");
        }
        String str2 = strArrSplit[0];
        String str3 = strArrSplit[1];
        String str4 = tokenRequest.keyName;
        if (str4 == null) {
            tokenRequest.keyName = str2;
        } else if (!str4.equals(str2)) {
            throw sk0.b(401, 40102, "Incompatible keys specified");
        }
        long j = tokenRequest.ttl;
        String str5 = BuildConfig.FLAVOR;
        String strValueOf = j == 0 ? BuildConfig.FLAVOR : String.valueOf(j);
        String str6 = tokenRequest.capability;
        if (str6 == null) {
            str6 = BuildConfig.FLAVOR;
        }
        if (tokenRequest.clientId == null) {
            tokenRequest.clientId = this.ably.options.clientId;
        }
        String str7 = tokenRequest.clientId;
        if (str7 != null) {
            str5 = str7;
        }
        if (tokenRequest.timestamp == 0) {
            if (authOptionsCopy.queryTime) {
                long j2 = this.nanoTimeDelta;
                long jCurrentTimeMillis = System.currentTimeMillis() - (System.nanoTime() / 1000000);
                if (this.timeDelta != Long.MAX_VALUE && Math.abs(j2 - jCurrentTimeMillis) > 500) {
                    this.timeDelta = Long.MAX_VALUE;
                }
                if (this.timeDelta != Long.MAX_VALUE) {
                    tokenRequest.timestamp = timestamp() + this.timeDelta;
                    this.nanoTimeDelta = jCurrentTimeMillis;
                } else {
                    long jTime = this.ably.time();
                    tokenRequest.timestamp = jTime;
                    this.timeDelta = jTime - timestamp();
                }
            } else {
                tokenRequest.timestamp = timestamp();
            }
        }
        tokenRequest.nonce = random();
        StringBuilder sb = new StringBuilder();
        sb.append(tokenRequest.keyName);
        sb.append('\n');
        sb.append(strValueOf);
        sb.append('\n');
        sb.append(str6);
        sb.append('\n');
        sb.append(str5);
        sb.append('\n');
        sb.append(tokenRequest.timestamp);
        sb.append('\n');
        tokenRequest.mac = hmac(wu0.a(sb, tokenRequest.nonce, '\n'), str3);
        Log.i("Auth.getTokenRequest()", "generated signed request");
        return tokenRequest;
    }

    public AuthMethod getAuthMethod() {
        return this.method;
    }

    public AuthOptions getAuthOptions() {
        return this.authOptions.copy();
    }

    public Param[] getAuthParams() {
        int i = AnonymousClass3.$SwitchMap$io$ably$lib$rest$Auth$AuthMethod[this.method.ordinal()];
        if (i == 1) {
            return new Param[]{new Param("key", this.authOptions.key)};
        }
        if (i != 2) {
            return null;
        }
        assertValidToken();
        return new Param[]{new Param("accessToken", getTokenDetails().token)};
    }

    public String getAuthorizationHeader() {
        return this.authHeader;
    }

    public String getBasicCredentials() {
        if (this.method == AuthMethod.basic) {
            return this.basicCredentials;
        }
        return null;
    }

    public String getEncodedToken() {
        Log.i("TokenAuth.getEncodedToken()", BuildConfig.FLAVOR);
        return this.encodedToken;
    }

    public TokenDetails getTokenDetails() {
        Log.i("TokenAuth.getTokenDetails()", BuildConfig.FLAVOR);
        return this.tokenDetails;
    }

    public void onAuthError(ErrorInfo errorInfo) {
        int i = errorInfo.code;
        if (i < 40140 || i >= 40150) {
            return;
        }
        clearTokenDetails();
    }

    @Deprecated
    public TokenDetails renew() throws AblyException {
        TokenDetails tokenDetailsAssertValidToken = assertValidToken(this.tokenParams, this.authOptions, true);
        this.ably.onAuthUpdated(tokenDetailsAssertValidToken.token, false);
        return tokenDetailsAssertValidToken;
    }

    public void renewAuth(final RenewAuthResult renewAuthResult) throws AblyException {
        final TokenDetails tokenDetailsAssertValidToken = assertValidToken(this.tokenParams, this.authOptions, true);
        this.ably.onAuthUpdatedAsync(tokenDetailsAssertValidToken.token, new AuthUpdateResult() { // from class: fa0
            @Override // io.ably.lib.rest.Auth.AuthUpdateResult
            public final void onUpdate(boolean z, ErrorInfo errorInfo) {
                renewAuthResult.onCompletion(z, tokenDetailsAssertValidToken, errorInfo);
            }
        });
    }

    public TokenDetails requestToken(TokenParams tokenParams, AuthOptions authOptions) throws AblyException {
        TokenRequest tokenRequestCreateTokenRequest;
        Object uri;
        AuthOptions authOptionsCopy = authOptions == null ? this.authOptions : authOptions.copy();
        TokenParams tokenParamsCopy = tokenParams == null ? this.tokenParams : tokenParams.copy();
        if (tokenParamsCopy.clientId == null) {
            tokenParamsCopy.clientId = this.ably.options.clientId;
        }
        tokenParamsCopy.capability = Capability.c14n(tokenParamsCopy.capability);
        int i = 0;
        if (authOptionsCopy.authCallback != null) {
            Log.i("Auth.requestToken()", "using token auth with auth_callback");
            try {
                Object tokenRequest = authOptionsCopy.authCallback.getTokenRequest(tokenParamsCopy);
                if (tokenRequest instanceof String) {
                    return new TokenDetails((String) tokenRequest);
                }
                if (tokenRequest instanceof TokenDetails) {
                    return (TokenDetails) tokenRequest;
                }
                if (!(tokenRequest instanceof TokenRequest)) {
                    throw AblyException.fromErrorInfo(new ErrorInfo("Invalid authCallback response", CarouselScreenFragment.CAROUSEL_ANIMATION_MS, 40000));
                }
                tokenRequestCreateTokenRequest = (TokenRequest) tokenRequest;
            } catch (Exception e) {
                boolean z = e instanceof NonRetriableTokenException;
                if ((e instanceof AblyException) && ((AblyException) e).errorInfo.statusCode == 403) {
                    i = 1;
                }
                throw AblyException.fromErrorInfo(e, new ErrorInfo("authCallback failed with an exception", (z || i != 0) ? 403 : 401, 80019));
            }
        } else if (authOptionsCopy.authUrl != null) {
            Log.i("Auth.requestToken()", "using token auth with auth_url");
            try {
                HttpCore.ResponseHandler<Object> responseHandler = new HttpCore.ResponseHandler<Object>() { // from class: io.ably.lib.rest.Auth.1
                    @Override // io.ably.lib.http.HttpCore.ResponseHandler
                    public Object handleResponse(HttpCore.Response response, ErrorInfo errorInfo) throws AblyException {
                        if (errorInfo != null) {
                            throw AblyException.fromErrorInfo(errorInfo);
                        }
                        try {
                            String str = response.contentType;
                            byte[] bArr = response.body;
                            if (bArr != null && bArr.length != 0) {
                                if (str != null) {
                                    if (!str.startsWith("text/plain") && !str.startsWith("application/jwt")) {
                                        if (!str.startsWith(HttpConstants.ContentTypes.JSON)) {
                                            throw AblyException.fromErrorInfo(new ErrorInfo("Unacceptable content type from auth callback", 406, 40170));
                                        }
                                    }
                                    return new TokenDetails(new String(bArr));
                                }
                                JsonElement jsonElement = Serialisation.gsonParser.parse(new String(bArr));
                                if (!(jsonElement instanceof JsonObject)) {
                                    throw AblyException.fromErrorInfo(new ErrorInfo("Unexpected response type from auth callback", 406, 40170));
                                }
                                JsonObject jsonObject = (JsonObject) jsonElement;
                                return jsonObject.has("issued") ? TokenDetails.fromJsonElement(jsonObject) : TokenRequest.fromJsonElement(jsonObject);
                            }
                            return null;
                        } catch (JsonParseException unused) {
                            throw sk0.b(406, 40170, "Unable to parse response from auth callback");
                        }
                    }
                };
                URL url = HttpUtils.parseUrl(this.authOptions.authUrl);
                String strUrlWithQueryStringRemoved = HttpUtils.urlWithQueryStringRemoved(this.authOptions.authUrl);
                String query = url.getQuery();
                Map<String, Param> mapDecodeParams = (query == null || query.isEmpty()) ? null : HttpUtils.decodeParams(query);
                Map<String, Param> mapAsMap = tokenParamsCopy.asMap();
                Param[] paramArr = authOptionsCopy.authParams;
                if (paramArr != null) {
                    int length = paramArr.length;
                    while (i < length) {
                        Param param = paramArr[i];
                        if (!mapAsMap.containsKey(param.key)) {
                            mapAsMap.put(param.key, param);
                        }
                        i++;
                    }
                }
                if (HttpConstants.Methods.POST.equals(authOptionsCopy.authMethod)) {
                    uri = HttpHelpers.postUri(this.ably.httpCore, strUrlWithQueryStringRemoved, authOptionsCopy.authHeaders, HttpUtils.flattenParams(mapDecodeParams), HttpUtils.flattenParams(mapAsMap), responseHandler);
                } else {
                    if (mapDecodeParams != null) {
                        mapAsMap = HttpUtils.mergeParams(mapDecodeParams, mapAsMap);
                    }
                    uri = HttpHelpers.getUri(this.ably.httpCore, strUrlWithQueryStringRemoved, authOptionsCopy.authHeaders, HttpUtils.flattenParams(mapAsMap), responseHandler);
                }
                if (uri == null) {
                    throw AblyException.fromErrorInfo(null, new ErrorInfo("Empty response received from authUrl", 401, 80019));
                }
                if (uri instanceof TokenDetails) {
                    return (TokenDetails) uri;
                }
                tokenRequestCreateTokenRequest = (TokenRequest) uri;
            } catch (AblyException e2) {
                throw AblyException.fromErrorInfo(e2, new ErrorInfo("authUrl failed with an exception", e2.errorInfo.statusCode, 80019));
            }
        } else {
            if (authOptionsCopy.key == null) {
                throw sk0.b(CarouselScreenFragment.CAROUSEL_ANIMATION_MS, 40106, "Auth.requestToken(): options must include valid authentication parameters");
            }
            Log.i("Auth.requestToken()", "using token auth with client-side signing");
            tokenRequestCreateTokenRequest = createTokenRequest(tokenParamsCopy, authOptionsCopy);
        }
        return (TokenDetails) HttpHelpers.postSync(this.ably.http, av.a(new StringBuilder("/keys/"), tokenRequestCreateTokenRequest.keyName, "/requestToken"), null, null, new HttpUtils.JsonRequestBody(tokenRequestCreateTokenRequest.asJsonElement().toString()), new HttpCore.ResponseHandler<TokenDetails>() { // from class: io.ably.lib.rest.Auth.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.ably.lib.http.HttpCore.ResponseHandler
            public TokenDetails handleResponse(HttpCore.Response response, ErrorInfo errorInfo) throws AblyException {
                if (errorInfo != null) {
                    throw AblyException.fromErrorInfo(errorInfo);
                }
                try {
                    return TokenDetails.fromJsonElement((JsonObject) Serialisation.gsonParser.parse(new String(response.body)));
                } catch (JsonParseException e3) {
                    throw AblyException.fromThrowable(e3);
                }
            }
        }, false);
    }

    public long serverTimestamp() {
        long jTimestamp = timestamp();
        long j = this.timeDelta;
        return j != Long.MAX_VALUE ? jTimestamp + j : jTimestamp;
    }

    public void setClientId(String str) throws AblyException {
        if (str == null) {
            return;
        }
        String str2 = this.clientId;
        if (str2 == null) {
            this.clientId = str;
            this.ably.onClientIdSet(str);
        } else if (!str2.equals(str) && !WILDCARD_CLIENTID.equals(str)) {
            throw sk0.b(401, 40101, "Unable to set different clientId from that given in options");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class TokenDetails {
        public String capability;
        public String clientId;
        public long expires;
        public long issued;
        public String token;

        public TokenDetails(String str) {
            this.token = str;
        }

        @Deprecated
        public static TokenDetails fromJSON(JsonObject jsonObject) {
            return (TokenDetails) Serialisation.gson.fromJson((JsonElement) jsonObject, TokenDetails.class);
        }

        public static TokenDetails fromJson(String str) {
            return (TokenDetails) Serialisation.gson.fromJson(str, TokenDetails.class);
        }

        public static TokenDetails fromJsonElement(JsonObject jsonObject) {
            return (TokenDetails) Serialisation.gson.fromJson((JsonElement) jsonObject, TokenDetails.class);
        }

        public String asJson() {
            return asJsonElement().toString();
        }

        public JsonObject asJsonElement() {
            return (JsonObject) Serialisation.gson.toJsonTree(this);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof TokenDetails)) {
                return false;
            }
            TokenDetails tokenDetails = (TokenDetails) obj;
            return Auth.equalNullableStrings(this.token, tokenDetails.token) & Auth.equalNullableStrings(this.capability, tokenDetails.capability) & Auth.equalNullableStrings(this.clientId, tokenDetails.clientId) & (this.issued == tokenDetails.issued) & (this.expires == tokenDetails.expires);
        }

        public int hashCode() {
            return Objects.hash(this.token, this.capability, this.clientId, Long.valueOf(this.issued), Long.valueOf(this.expires));
        }

        public TokenDetails() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class TokenRequest extends TokenParams {
        public String keyName;
        public String mac;
        public String nonce;

        public TokenRequest(TokenParams tokenParams) {
            this.ttl = tokenParams.ttl;
            this.capability = tokenParams.capability;
            this.clientId = tokenParams.clientId;
            this.timestamp = tokenParams.timestamp;
        }

        @Deprecated
        public static TokenRequest fromJSON(JsonObject jsonObject) {
            return (TokenRequest) Serialisation.gson.fromJson((JsonElement) jsonObject, TokenRequest.class);
        }

        public static TokenRequest fromJson(String str) {
            return (TokenRequest) Serialisation.gson.fromJson(str, TokenRequest.class);
        }

        public static TokenRequest fromJsonElement(JsonObject jsonObject) {
            return (TokenRequest) Serialisation.gson.fromJson((JsonElement) jsonObject, TokenRequest.class);
        }

        public String asJson() {
            return asJsonElement().toString();
        }

        public JsonObject asJsonElement() {
            JsonObject jsonObject = (JsonObject) Serialisation.gson.toJsonTree(this);
            if (this.ttl == 0) {
                jsonObject.remove("ttl");
            }
            String str = this.capability;
            if (str != null && str.isEmpty()) {
                jsonObject.remove("capability");
            }
            return jsonObject;
        }

        @Override // io.ably.lib.rest.Auth.TokenParams
        public boolean equals(Object obj) {
            TokenRequest tokenRequest = (TokenRequest) obj;
            return Auth.equalNullableStrings(this.mac, tokenRequest.mac) & super.equals(obj) & Auth.equalNullableStrings(this.keyName, tokenRequest.keyName) & Auth.equalNullableStrings(this.nonce, tokenRequest.nonce);
        }

        public TokenRequest() {
        }
    }

    private void setTokenDetails(String str) {
        Log.i("TokenAuth.setTokenDetails()", BuildConfig.FLAVOR);
        this.tokenDetails = new TokenDetails(str);
        this.encodedToken = Base64Coder.encodeString(str);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class AuthOptions {
        public TokenCallback authCallback;
        public Param[] authHeaders;
        public String authMethod;
        public Param[] authParams;
        public String authUrl;
        public String key;
        public boolean queryTime;
        public String token;
        public TokenDetails tokenDetails;
        public boolean useTokenAuth;

        public AuthOptions(String str) throws AblyException {
            if (str == null) {
                throw sk0.b(40000, CarouselScreenFragment.CAROUSEL_ANIMATION_MS, "key string cannot be null");
            }
            if (str.isEmpty()) {
                z90.a("Key string cannot be empty");
                throw null;
            }
            if (str.indexOf(58) > -1) {
                this.key = str;
            } else {
                this.token = str;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AuthOptions copy() {
            AuthOptions authOptions = new AuthOptions();
            authOptions.key = this.key;
            authOptions.authUrl = this.authUrl;
            authOptions.authMethod = this.authMethod;
            authOptions.authParams = this.authParams;
            authOptions.authHeaders = this.authHeaders;
            authOptions.token = this.token;
            authOptions.tokenDetails = this.tokenDetails;
            authOptions.authCallback = this.authCallback;
            authOptions.queryTime = this.queryTime;
            return authOptions;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AuthOptions storedValues() {
            AuthOptions authOptions = new AuthOptions();
            authOptions.key = this.key;
            authOptions.authUrl = this.authUrl;
            authOptions.authMethod = this.authMethod;
            authOptions.authParams = this.authParams;
            authOptions.authHeaders = this.authHeaders;
            authOptions.token = this.token;
            authOptions.tokenDetails = this.tokenDetails;
            authOptions.authCallback = this.authCallback;
            return authOptions;
        }

        public AuthOptions() {
        }
    }

    public TokenDetails assertValidToken() {
        return assertValidToken(this.tokenParams, this.authOptions, false);
    }
}
