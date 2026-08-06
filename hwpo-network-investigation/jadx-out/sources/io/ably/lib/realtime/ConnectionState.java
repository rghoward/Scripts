package io.ably.lib.realtime;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public enum ConnectionState {
    initialized(ConnectionEvent.initialized),
    connecting(ConnectionEvent.connecting),
    connected(ConnectionEvent.connected),
    disconnected(ConnectionEvent.disconnected),
    suspended(ConnectionEvent.suspended),
    closing(ConnectionEvent.closing),
    closed(ConnectionEvent.closed),
    failed(ConnectionEvent.failed);

    private final ConnectionEvent event;

    ConnectionState(ConnectionEvent connectionEvent) {
        this.event = connectionEvent;
    }

    public ConnectionEvent getConnectionEvent() {
        return this.event;
    }
}
