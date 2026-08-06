package io.ably.lib.realtime;

import io.ably.lib.types.ErrorInfo;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface ConnectionStateListener {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class Filter implements ConnectionStateListener {
        ConnectionStateListener listener;
        ConnectionState state;

        public Filter(ConnectionState connectionState, ConnectionStateListener connectionStateListener) {
            this.state = connectionState;
            this.listener = connectionStateListener;
        }

        @Override // io.ably.lib.realtime.ConnectionStateListener
        public void onConnectionStateChanged(ConnectionStateChange connectionStateChange) {
            if (connectionStateChange.current == this.state) {
                this.listener.onConnectionStateChanged(connectionStateChange);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class Multicaster extends io.ably.lib.util.Multicaster<ConnectionStateListener> implements ConnectionStateListener {
        public Multicaster() {
            super(new ConnectionStateListener[0]);
        }

        @Override // io.ably.lib.realtime.ConnectionStateListener
        public void onConnectionStateChanged(ConnectionStateChange connectionStateChange) {
            Iterator<ConnectionStateListener> it = getMembers().iterator();
            while (it.hasNext()) {
                try {
                    it.next().onConnectionStateChanged(connectionStateChange);
                } catch (Throwable unused) {
                }
            }
        }
    }

    void onConnectionStateChanged(ConnectionStateChange connectionStateChange);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class ConnectionStateChange {
        public final ConnectionState current;
        public final ConnectionEvent event;
        public final ConnectionState previous;
        public final ErrorInfo reason;
        public final long retryIn;

        private ConnectionStateChange(ErrorInfo errorInfo) {
            this.event = ConnectionEvent.update;
            ConnectionState connectionState = ConnectionState.connected;
            this.previous = connectionState;
            this.current = connectionState;
            this.retryIn = 0L;
            this.reason = errorInfo;
        }

        public static ConnectionStateChange createUpdateEvent(ErrorInfo errorInfo) {
            return new ConnectionStateChange(errorInfo);
        }

        public ConnectionStateChange(ConnectionState connectionState, ConnectionState connectionState2, long j, ErrorInfo errorInfo) {
            this.event = connectionState2.getConnectionEvent();
            this.previous = connectionState;
            this.current = connectionState2;
            this.retryIn = j;
            this.reason = errorInfo;
        }
    }
}
