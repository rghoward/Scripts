package io.ably.lib.types;

import io.ably.lib.push.Storage;
import io.ably.lib.rest.Auth;
import io.ably.lib.transport.Defaults;
import io.ably.lib.util.Log;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class ClientOptions extends Auth.AuthOptions {
    public boolean addRequestIds;
    public Map<String, String> agents;
    public int asyncHttpThreadpoolSize;
    public boolean autoConnect;
    public int channelRetryTimeout;
    public String clientId;
    public Auth.TokenParams defaultTokenParams;
    public long disconnectedRetryTimeout;
    public boolean echoMessages;
    public String environment;
    public String[] fallbackHosts;

    @Deprecated
    public boolean fallbackHostsUseDefault;
    public long fallbackRetryTimeout;
    public Map<String, String> headers;
    public int httpMaxRetryCount;
    public int httpMaxRetryDuration;
    public int httpOpenTimeout;
    public int httpRequestTimeout;
    public boolean idempotentRestPublishing;
    public Storage localStorage;
    public Log.LogHandler logHandler;
    public int logLevel;
    public int port;
    public ProxyOptions proxy;
    public boolean pushFullWait;
    public boolean queueMessages;
    public String realtimeHost;
    public long realtimeRequestTimeout;
    public String recover;
    public String restHost;
    public long suspendedRetryTimeout;
    public boolean tls;
    public int tlsPort;
    public Param[] transportParams;
    public boolean useBinaryProtocol;

    public ClientOptions(String str) {
        super(str);
        this.tls = true;
        this.autoConnect = true;
        this.useBinaryProtocol = true;
        this.queueMessages = true;
        this.echoMessages = true;
        this.idempotentRestPublishing = true;
        this.httpOpenTimeout = Defaults.TIMEOUT_HTTP_OPEN;
        this.httpRequestTimeout = Defaults.TIMEOUT_HTTP_REQUEST;
        this.httpMaxRetryDuration = Defaults.httpMaxRetryDuration;
        this.httpMaxRetryCount = 3;
        this.realtimeRequestTimeout = Defaults.realtimeRequestTimeout;
        this.disconnectedRetryTimeout = Defaults.TIMEOUT_DISCONNECT;
        this.suspendedRetryTimeout = Defaults.suspendedRetryTimeout;
        this.fallbackRetryTimeout = Defaults.fallbackRetryTimeout;
        this.defaultTokenParams = new Auth.TokenParams();
        this.channelRetryTimeout = Defaults.TIMEOUT_CHANNEL_RETRY;
        this.asyncHttpThreadpoolSize = 64;
        this.pushFullWait = false;
        this.localStorage = null;
        this.addRequestIds = false;
        this.logLevel = 5;
    }

    public void clearAuthOptions() {
        this.key = null;
        this.token = null;
        this.tokenDetails = null;
        this.authHeaders = null;
        this.authParams = null;
        this.queryTime = false;
        this.useTokenAuth = false;
    }

    public ClientOptions copy() {
        ClientOptions clientOptions = new ClientOptions();
        clientOptions.clientId = this.clientId;
        clientOptions.logLevel = this.logLevel;
        clientOptions.logHandler = this.logHandler;
        clientOptions.tls = this.tls;
        clientOptions.restHost = this.restHost;
        clientOptions.realtimeHost = this.realtimeHost;
        clientOptions.port = this.port;
        clientOptions.tlsPort = this.tlsPort;
        clientOptions.autoConnect = this.autoConnect;
        clientOptions.useBinaryProtocol = this.useBinaryProtocol;
        clientOptions.queueMessages = this.queueMessages;
        clientOptions.echoMessages = this.echoMessages;
        clientOptions.recover = this.recover;
        clientOptions.proxy = this.proxy;
        clientOptions.environment = this.environment;
        clientOptions.idempotentRestPublishing = this.idempotentRestPublishing;
        clientOptions.httpOpenTimeout = this.httpOpenTimeout;
        clientOptions.httpRequestTimeout = this.httpRequestTimeout;
        clientOptions.httpMaxRetryDuration = this.httpMaxRetryDuration;
        clientOptions.httpMaxRetryCount = this.httpMaxRetryCount;
        clientOptions.realtimeRequestTimeout = this.realtimeRequestTimeout;
        clientOptions.disconnectedRetryTimeout = this.disconnectedRetryTimeout;
        clientOptions.suspendedRetryTimeout = this.suspendedRetryTimeout;
        clientOptions.fallbackHostsUseDefault = this.fallbackHostsUseDefault;
        clientOptions.fallbackRetryTimeout = this.fallbackRetryTimeout;
        clientOptions.defaultTokenParams = this.defaultTokenParams;
        clientOptions.channelRetryTimeout = this.channelRetryTimeout;
        clientOptions.asyncHttpThreadpoolSize = this.asyncHttpThreadpoolSize;
        clientOptions.pushFullWait = this.pushFullWait;
        clientOptions.localStorage = this.localStorage;
        clientOptions.addRequestIds = this.addRequestIds;
        clientOptions.authCallback = this.authCallback;
        clientOptions.authUrl = this.authUrl;
        clientOptions.authMethod = this.authMethod;
        clientOptions.key = this.key;
        clientOptions.token = this.token;
        clientOptions.tokenDetails = this.tokenDetails;
        clientOptions.authHeaders = this.authHeaders;
        clientOptions.authParams = this.authParams;
        clientOptions.queryTime = this.queryTime;
        clientOptions.useTokenAuth = this.useTokenAuth;
        return clientOptions;
    }

    public ClientOptions() {
        this.tls = true;
        this.autoConnect = true;
        this.useBinaryProtocol = true;
        this.queueMessages = true;
        this.echoMessages = true;
        this.idempotentRestPublishing = true;
        this.httpOpenTimeout = Defaults.TIMEOUT_HTTP_OPEN;
        this.httpRequestTimeout = Defaults.TIMEOUT_HTTP_REQUEST;
        this.httpMaxRetryDuration = Defaults.httpMaxRetryDuration;
        this.httpMaxRetryCount = 3;
        this.realtimeRequestTimeout = Defaults.realtimeRequestTimeout;
        this.disconnectedRetryTimeout = Defaults.TIMEOUT_DISCONNECT;
        this.suspendedRetryTimeout = Defaults.suspendedRetryTimeout;
        this.fallbackRetryTimeout = Defaults.fallbackRetryTimeout;
        this.defaultTokenParams = new Auth.TokenParams();
        this.channelRetryTimeout = Defaults.TIMEOUT_CHANNEL_RETRY;
        this.asyncHttpThreadpoolSize = 64;
        this.pushFullWait = false;
        this.localStorage = null;
        this.addRequestIds = false;
    }
}
