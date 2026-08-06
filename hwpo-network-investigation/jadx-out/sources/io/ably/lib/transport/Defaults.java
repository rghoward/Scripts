package io.ably.lib.transport;

import defpackage.al;
import io.ably.lib.types.ClientOptions;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class Defaults {
    public static final String ABLY_AGENT_HEADER = "Ably-Agent";
    public static final String ABLY_AGENT_PARAM = "agent";
    public static final String ABLY_AGENT_VERSION = "ably-java/1.7.2";
    public static final String ABLY_CLIENT_ID_HEADER = "X-Ably-ClientId";
    public static final String ABLY_PROTOCOL_VERSION = "6";
    public static final String ABLY_PROTOCOL_VERSION_HEADER = "X-Ably-Version";
    public static final String ABLY_PROTOCOL_VERSION_PARAM = "v";
    public static final String HOST_REALTIME = "realtime.ably.io";
    public static final String HOST_REST = "rest.ably.io";
    public static final int HTTP_ASYNC_THREADPOOL_SIZE = 64;
    public static final int HTTP_MAX_RETRY_COUNT = 3;
    public static final int PORT = 80;
    public static final int TLS_PORT = 443;
    public static final String[] HOST_FALLBACKS = {"A.ably-realtime.com", "B.ably-realtime.com", "C.ably-realtime.com", "D.ably-realtime.com", "E.ably-realtime.com"};
    public static int TIMEOUT_CONNECT = 15000;
    public static int TIMEOUT_DISCONNECT = 15000;
    public static int TIMEOUT_CHANNEL_RETRY = 15000;
    public static int TIMEOUT_HTTP_OPEN = 4000;
    public static int TIMEOUT_HTTP_REQUEST = 10000;
    public static int httpMaxRetryDuration = 15000;
    public static long realtimeRequestTimeout = 10000;
    public static long suspendedRetryTimeout = AudioConstants.TRANSCRIPTION_TIMEOUT_MS;
    public static long fallbackRetryTimeout = 600000;
    public static long maxIdleInterval = 20000;
    public static int maxMessageSize = 65536;
    public static long connectionStateTtl = 120000;
    public static final ITransport.Factory TRANSPORT = new WebSocketTransport.Factory();

    public static String[] getEnvironmentFallbackHosts(String str) {
        return new String[]{al.d(str, "-a-fallback.ably-realtime.com"), al.d(str, "-b-fallback.ably-realtime.com"), al.d(str, "-c-fallback.ably-realtime.com"), al.d(str, "-d-fallback.ably-realtime.com"), al.d(str, "-e-fallback.ably-realtime.com")};
    }

    public static int getPort(ClientOptions clientOptions) {
        if (clientOptions.tls) {
            int i = clientOptions.tlsPort;
            return i != 0 ? i : TLS_PORT;
        }
        int i2 = clientOptions.port;
        if (i2 != 0) {
            return i2;
        }
        return 80;
    }
}
