package io.ably.lib.realtime;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public enum ChannelState {
    initialized(ChannelEvent.initialized),
    attaching(ChannelEvent.attaching),
    attached(ChannelEvent.attached),
    detaching(ChannelEvent.detaching),
    detached(ChannelEvent.detached),
    failed(ChannelEvent.failed),
    suspended(ChannelEvent.suspended);

    private final ChannelEvent event;

    ChannelState(ChannelEvent channelEvent) {
        this.event = channelEvent;
    }

    public ChannelEvent getChannelEvent() {
        return this.event;
    }

    public boolean isReattachable() {
        return this == attaching || this == attached || this == suspended;
    }
}
