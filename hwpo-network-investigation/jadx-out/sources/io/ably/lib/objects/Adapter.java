package io.ably.lib.objects;

import defpackage.ct1;
import io.ably.lib.realtime.AblyRealtime;
import io.ably.lib.realtime.ChannelBase;
import io.ably.lib.realtime.Connection;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.ClientOptions;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.util.Log;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class Adapter implements ObjectsAdapter {
    private static final String TAG = ObjectsAdapter.class.getName();
    private final AblyRealtime ably;

    public Adapter(AblyRealtime ablyRealtime) {
        this.ably = ablyRealtime;
    }

    @Override // io.ably.lib.objects.ObjectsAdapter
    public ChannelBase getChannel(String str) throws AblyException {
        if (this.ably.channels.containsKey(str)) {
            return this.ably.channels.get(str);
        }
        Log.e(TAG, "attachChannel(): channel not found: " + str);
        throw AblyException.fromErrorInfo(new ErrorInfo(ct1.a("Channel not found: ", str), 404));
    }

    @Override // io.ably.lib.objects.ObjectsAdapter
    public ClientOptions getClientOptions() {
        return this.ably.options;
    }

    @Override // io.ably.lib.objects.ObjectsAdapter
    public Connection getConnection() {
        return this.ably.connection;
    }

    @Override // io.ably.lib.objects.ObjectsAdapter
    public long getTime() {
        return this.ably.time();
    }
}
