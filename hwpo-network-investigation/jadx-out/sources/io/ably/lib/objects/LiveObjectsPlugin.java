package io.ably.lib.objects;

import io.ably.lib.realtime.ChannelState;
import io.ably.lib.types.ProtocolMessage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface LiveObjectsPlugin {
    void dispose();

    void dispose(String str);

    RealtimeObjects getInstance(String str);

    void handle(ProtocolMessage protocolMessage);

    void handleStateChange(String str, ChannelState channelState, boolean z);
}
