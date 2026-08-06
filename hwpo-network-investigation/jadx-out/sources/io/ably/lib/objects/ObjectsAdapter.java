package io.ably.lib.objects;

import io.ably.lib.realtime.ChannelBase;
import io.ably.lib.realtime.Connection;
import io.ably.lib.types.ClientOptions;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface ObjectsAdapter {
    ChannelBase getChannel(String str);

    ClientOptions getClientOptions();

    Connection getConnection();

    long getTime();
}
