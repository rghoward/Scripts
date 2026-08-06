package io.ably.lib.types;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public enum ChannelMode {
    presence(ProtocolMessage.Flag.presence),
    publish(ProtocolMessage.Flag.publish),
    subscribe(ProtocolMessage.Flag.subscribe),
    presence_subscribe(ProtocolMessage.Flag.presence_subscribe),
    object_publish(ProtocolMessage.Flag.object_publish),
    object_subscribe(ProtocolMessage.Flag.object_subscribe),
    annotation_publish(ProtocolMessage.Flag.annotation_publish),
    annotation_subscribe(ProtocolMessage.Flag.annotation_subscribe);

    private final int mask;

    ChannelMode(ProtocolMessage.Flag flag) {
        this.mask = flag.getMask();
    }

    public static Set<ChannelMode> toSet(int i) {
        HashSet hashSet = new HashSet();
        for (ChannelMode channelMode : values()) {
            int mask = channelMode.getMask();
            if ((i & mask) == mask) {
                hashSet.add(channelMode);
            }
        }
        return hashSet;
    }

    public int getMask() {
        return this.mask;
    }
}
