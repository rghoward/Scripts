package io.intercom.android.nexus;

import com.intercom.twig.BuildConfig;
import com.intercom.twig.Twig;
import defpackage.ao3;
import defpackage.g01;
import defpackage.jp8;
import defpackage.lg7;
import defpackage.pkb;
import defpackage.qu8;
import defpackage.rkb;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
class NexusSocket {
    private static final pkb CLOSED_SOCKET = new pkb() { // from class: io.intercom.android.nexus.NexusSocket.4
        @Override // defpackage.pkb
        public boolean close(int i, String str) {
            return false;
        }

        public long queueSize() {
            return 0L;
        }

        public jp8 request() {
            throw new NullPointerException("ClosedSocket has no request");
        }

        @Override // defpackage.pkb
        public boolean send(String str) {
            return false;
        }

        @Override // defpackage.pkb
        public boolean send(g01 g01Var) {
            return false;
        }

        @Override // defpackage.pkb
        public void cancel() {
        }
    };
    private static final String HEADER = "?X-Nexus-Version=android.1.3.0";
    private static final int MAX_RECONNECT_TIME_SECONDS = 900;
    private static final int N_TIMEOUT_DISCONNECT = 4001;
    private static final int OK_CLIENT_DISCONNECT = 4000;
    private final lg7 client;
    private final long connectionTimeoutSeconds;
    private final NexusListener listener;
    private ScheduledFuture reconnectFuture;
    private final boolean shouldSendPing;
    private final ScheduledExecutorService timeoutExecutor;
    private ScheduledFuture timeoutFuture;
    private final NexusTopicProvider topicProvider;
    private final Twig twig;
    private final String url;
    private pkb socket = CLOSED_SOCKET;
    private final Runnable timeoutRunnable = new Runnable() { // from class: io.intercom.android.nexus.NexusSocket.1
        @Override // java.lang.Runnable
        public void run() {
            NexusSocket.this.timedOut();
        }
    };
    private long lastReconnectAt = 0;
    private int reconnectAttempts = 0;
    private final rkb webSocketListener = new rkb() { // from class: io.intercom.android.nexus.NexusSocket.3
        private void parseJsonString(String str) {
            if (str.isEmpty() || str.equals(" ") || str.endsWith("|")) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                String strOptString = jSONObject.optString("eventName");
                if (!strOptString.isEmpty() && !strOptString.equals("ACK")) {
                    NexusSocket.this.twig.internal("onMessage TEXT: ".concat(str));
                    NexusSocket.this.listener.notifyEvent(new NexusEvent(jSONObject));
                    return;
                }
                NexusSocket.this.twig.internal("onMessage ACK: ".concat(str));
            } catch (JSONException e) {
                NexusSocket.this.twig.internal("onMessage: json parse exception for message: '" + str + " " + e);
            }
        }

        @Override // defpackage.rkb
        public void onClosed(pkb pkbVar, int i, String str) {
            NexusSocket nexusSocket = NexusSocket.this;
            if (i != NexusSocket.OK_CLIENT_DISCONNECT) {
                nexusSocket.scheduleReconnect();
            } else {
                nexusSocket.shutdown();
            }
            NexusSocket.this.twig.internal("onClose code: " + i + " reason: " + str);
        }

        @Override // defpackage.rkb
        public void onClosing(pkb pkbVar, int i, String str) {
            NexusSocket.this.twig.internal("Server requested close:  " + i + " - '" + str + "'");
            pkbVar.close(i, str);
        }

        @Override // defpackage.rkb
        public void onFailure(pkb pkbVar, Throwable th, qu8 qu8Var) {
            boolean zShouldReconnectFromFailure = NexusSocket.shouldReconnectFromFailure(th, qu8Var);
            NexusSocket nexusSocket = NexusSocket.this;
            if (zShouldReconnectFromFailure) {
                nexusSocket.scheduleReconnect();
            } else {
                nexusSocket.shutdown();
            }
            NexusSocket.this.twig.internal("onFailure: " + th.getMessage());
            NexusSocket.this.listener.onConnectFailed();
        }

        @Override // defpackage.rkb
        public void onMessage(pkb pkbVar, g01 g01Var) {
            NexusSocket.this.twig.internal("Received bytes message " + g01Var + ", resetting timeout");
            NexusSocket.this.resetTimeout();
        }

        @Override // defpackage.rkb
        public void onOpen(pkb pkbVar, qu8 qu8Var) {
            NexusSocket.this.twig.internal("onOpen: " + qu8Var.v);
            NexusSocket.this.socket = pkbVar;
            NexusSocket.this.resetTimeout();
            List<String> topics = NexusSocket.this.topicProvider.getTopics();
            if (!topics.isEmpty()) {
                NexusSocket.this.fire(NexusEvent.getSubscribeEvent(topics).toStringEncodedJsonObject());
            }
            if (NexusSocket.this.shouldSendPing) {
                NexusSocket.this.fire(NexusEvent.getPingEvent().toStringEncodedJsonObject());
            }
            NexusSocket.this.listener.onConnect();
        }

        @Override // defpackage.rkb
        public void onMessage(pkb pkbVar, String str) {
            NexusSocket.this.resetTimeout();
            parseJsonString(str);
        }
    };

    public NexusSocket(String str, int i, boolean z, Twig twig, ScheduledExecutorService scheduledExecutorService, lg7 lg7Var, NexusListener nexusListener, NexusTopicProvider nexusTopicProvider) {
        this.url = str;
        this.connectionTimeoutSeconds = i;
        this.shouldSendPing = z;
        this.twig = twig;
        this.listener = nexusListener;
        this.topicProvider = nexusTopicProvider;
        this.client = lg7Var;
        this.timeoutExecutor = scheduledExecutorService;
    }

    public static long calculateReconnectTimerInSeconds(int i) {
        int iMin = (int) Math.min(Math.pow(2.0d, i), 900.0d);
        return new Random().nextInt(iMin + 1) + iMin;
    }

    private void disconnect(int i, String str) {
        if (this.socket.close(i, str)) {
            return;
        }
        this.twig.internal("Could not close socket while disconnecting, it may be already closed");
    }

    private static boolean isAndroidLifecycleException(Throwable th) {
        if (th == null) {
            return false;
        }
        String message = th.getMessage();
        if (message == null) {
            message = BuildConfig.FLAVOR;
        }
        if (th instanceof SocketTimeoutException) {
            return message.contains("Read timed out") && message.length() < 50;
        }
        if (th instanceof ConnectException) {
            return message.contains("Connection refused") || message.contains("Network unreachable");
        }
        if (th instanceof SocketException) {
            return message.contains("Software caused connection abort") || message.contains("Connection reset by peer") || message.contains("Connection reset") || message.contains("Broken pipe") || message.contains("Socket closed");
        }
        if (th instanceof IllegalStateException) {
            return message.contains("WebSocket is closed") || message.contains(MetricTracker.Action.CLOSED);
        }
        if (th instanceof UnknownHostException) {
            return message.contains("Unable to resolve host") || message.contains("No address associated with hostname");
        }
        if (th instanceof IOException) {
            return message.contains("Unexpected end of stream") || message.contains("Stream was reset") || message.contains("Connection closed");
        }
        return false;
    }

    private void modifyReconnectAttempts() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.lastReconnectAt;
        Twig twig = this.twig;
        if (jCurrentTimeMillis > 1800000) {
            twig.d("resetting reconnection attempts", new Object[0]);
            this.reconnectAttempts = 1;
        } else {
            twig.d("incrementing reconnection attempts", new Object[0]);
            this.reconnectAttempts++;
        }
        this.lastReconnectAt = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetTimeout() {
        ScheduledFuture scheduledFuture = this.timeoutFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.timeoutFuture = this.timeoutExecutor.schedule(this.timeoutRunnable, this.connectionTimeoutSeconds, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleReconnect() {
        if (this.reconnectFuture != null) {
            return;
        }
        modifyReconnectAttempts();
        long jCalculateReconnectTimerInSeconds = calculateReconnectTimerInSeconds(this.reconnectAttempts);
        Twig twig = this.twig;
        StringBuilder sbB = ao3.b("Scheduling reconnect in: ", jCalculateReconnectTimerInSeconds, " for attempt: ");
        sbB.append(this.reconnectAttempts);
        twig.internal(sbB.toString());
        this.reconnectFuture = this.timeoutExecutor.schedule(new Runnable() { // from class: io.intercom.android.nexus.NexusSocket.2
            @Override // java.lang.Runnable
            public void run() {
                NexusSocket.this.connect();
                NexusSocket.this.reconnectFuture = null;
            }
        }, jCalculateReconnectTimerInSeconds, TimeUnit.SECONDS);
    }

    public static boolean shouldReconnectFromFailure(Throwable th, qu8 qu8Var) {
        if (qu8Var == null && th != null && isAndroidLifecycleException(th)) {
            return false;
        }
        if (qu8Var == null) {
            return true;
        }
        int i = qu8Var.w;
        return i >= 500 && i <= 599;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void shutdown() {
        this.socket = CLOSED_SOCKET;
        ScheduledFuture scheduledFuture = this.timeoutFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.listener.onShutdown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void timedOut() {
        if (this.socket == CLOSED_SOCKET) {
            scheduleReconnect();
        } else {
            disconnect(N_TIMEOUT_DISCONNECT, "Socket timed out");
        }
        this.listener.onConnectFailed();
    }

    public void connect() {
        this.twig.d("connecting to a socket...", new Object[0]);
        jp8.a aVar = new jp8.a();
        aVar.d(this.url + HEADER);
        this.client.c(new jp8(aVar), this.webSocketListener);
        this.timeoutFuture = this.timeoutExecutor.schedule(this.timeoutRunnable, this.connectionTimeoutSeconds, TimeUnit.SECONDS);
    }

    public void fire(String str) {
        if (str.isEmpty()) {
            return;
        }
        try {
            this.twig.internal("firing: ".concat(str));
            this.socket.send(str);
        } catch (IllegalStateException e) {
            this.twig.internal("Error when firing '" + str + "': " + e);
        }
    }

    public boolean isConnected() {
        return this.socket != CLOSED_SOCKET;
    }

    public void disconnect() {
        disconnect(OK_CLIENT_DISCONNECT, "Disconnect called by client");
    }
}
