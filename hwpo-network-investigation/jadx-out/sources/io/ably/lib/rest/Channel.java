package io.ably.lib.rest;

import io.ably.lib.push.PushChannel;
import io.ably.lib.types.ChannelOptions;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class Channel extends ChannelBase {
    public final PushChannel push;

    public Channel(AblyBase ablyBase, String str, ChannelOptions channelOptions) {
        super(ablyBase, str, channelOptions);
        this.push = new PushChannel(this, (AblyRest) ablyBase);
    }
}
