package io.ably.lib.realtime;

import io.ably.lib.objects.LiveObjectsPlugin;
import io.ably.lib.push.PushChannel;
import io.ably.lib.rest.AblyBase;
import io.ably.lib.types.ChannelOptions;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class Channel extends ChannelBase {
    public final PushChannel push;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface MessageListener extends ChannelBase.MessageListener {
    }

    public Channel(AblyRealtime ablyRealtime, String str, ChannelOptions channelOptions, LiveObjectsPlugin liveObjectsPlugin) {
        super(ablyRealtime, str, channelOptions, liveObjectsPlugin);
        this.push = ((AblyBase) ablyRealtime).channels.get(str, channelOptions).push;
    }
}
