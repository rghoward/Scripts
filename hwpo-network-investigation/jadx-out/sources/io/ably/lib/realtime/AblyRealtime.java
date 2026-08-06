package io.ably.lib.realtime;

import defpackage.sk0;
import io.ably.lib.objects.LiveObjectsPlugin;
import io.ably.lib.objects.ObjectsHelper;
import io.ably.lib.rest.AblyRest;
import io.ably.lib.rest.Auth;
import io.ably.lib.transport.ConnectionManager;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.ChannelOptions;
import io.ably.lib.types.ClientOptions;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.ProtocolMessage;
import io.ably.lib.types.ReadOnlyMap;
import io.ably.lib.types.RecoveryKeyContext;
import io.ably.lib.util.InternalMap;
import io.ably.lib.util.Log;
import io.ably.lib.util.StringUtils;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class AblyRealtime extends AblyRest {
    private static final String TAG = "io.ably.lib.realtime.AblyRealtime";
    public final Channels channels;
    public final Connection connection;
    private final LiveObjectsPlugin liveObjectsPlugin;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface Channels extends ReadOnlyMap<String, Channel> {
        Channel get(String str);

        Channel get(String str, ChannelOptions channelOptions);

        void release(String str);
    }

    public AblyRealtime(ClientOptions clientOptions) {
        RecoveryKeyContext recoveryKeyContextDecode;
        super(clientOptions);
        InternalChannels internalChannels = new InternalChannels();
        this.channels = internalChannels;
        LiveObjectsPlugin liveObjectsPluginTryInitializeObjectsPlugin = ObjectsHelper.tryInitializeObjectsPlugin(this);
        this.liveObjectsPlugin = liveObjectsPluginTryInitializeObjectsPlugin;
        Connection connection = new Connection(this, internalChannels, this.platformAgentProvider, liveObjectsPluginTryInitializeObjectsPlugin);
        this.connection = connection;
        if (!StringUtils.isNullOrEmpty(clientOptions.recover) && (recoveryKeyContextDecode = RecoveryKeyContext.decode(clientOptions.recover)) != null) {
            setChannelSerialsFromRecoverOption(recoveryKeyContextDecode.getChannelSerials());
            connection.connectionManager.msgSerial = recoveryKeyContextDecode.getMsgSerial();
        }
        if (clientOptions.autoConnect) {
            connection.connect();
        }
    }

    @Override // io.ably.lib.rest.AblyBase, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (Exception e) {
            Log.e(TAG, "There was an exception releasing client instance base resources.", e);
        }
        this.connection.close();
        LiveObjectsPlugin liveObjectsPlugin = this.liveObjectsPlugin;
        if (liveObjectsPlugin != null) {
            liveObjectsPlugin.dispose();
        }
    }

    @Override // io.ably.lib.rest.AblyBase
    public void connect() {
        super.connect();
        this.connection.connect();
    }

    public Map<String, String> getChannelSerials() {
        HashMap map = new HashMap();
        for (Channel channel : this.channels.values()) {
            if (channel.state == ChannelState.attached) {
                map.put(channel.name, channel.properties.channelSerial);
            }
        }
        return map;
    }

    @Override // io.ably.lib.rest.AblyBase
    public void onAuthError(ErrorInfo errorInfo) {
        this.connection.connectionManager.onAuthError(errorInfo);
    }

    @Override // io.ably.lib.rest.AblyBase
    public void onAuthUpdated(String str, boolean z) {
        this.connection.connectionManager.onAuthUpdated(str, z);
    }

    @Override // io.ably.lib.rest.AblyBase
    public void onAuthUpdatedAsync(String str, Auth.AuthUpdateResult authUpdateResult) {
        this.connection.connectionManager.onAuthUpdatedAsync(str, authUpdateResult);
    }

    public void setChannelSerialsFromRecoverOption(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Channel channel = this.channels.get(key);
            if (channel != null) {
                channel.properties.channelSerial = value;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class InternalChannels extends InternalMap<String, Channel> implements Channels, ConnectionManager.Channels {
        private InternalChannels() {
        }

        private void clear() {
            this.map.clear();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.ably.lib.realtime.AblyRealtime.Channels
        public Channel get(String str, ChannelOptions channelOptions) throws AblyException {
            AblyRealtime ablyRealtime = AblyRealtime.this;
            Channel channel = new Channel(ablyRealtime, str, channelOptions, ablyRealtime.liveObjectsPlugin);
            Channel channel2 = (Channel) this.map.putIfAbsent((K) str, (V) channel);
            if (channel2 == null) {
                return channel;
            }
            if (channelOptions == null) {
                return channel2;
            }
            if (channel2.shouldReattachToSetOptions(channelOptions)) {
                throw sk0.b(40000, CarouselScreenFragment.CAROUSEL_ANIMATION_MS, "Channels.get() cannot be used to set channel options that would cause the channel to reattach. Please, use Channel.setOptions() instead.");
            }
            channel2.setOptions(channelOptions);
            return channel2;
        }

        @Override // io.ably.lib.transport.ConnectionManager.Channels
        public void onMessage(ProtocolMessage protocolMessage) {
            Channel channel;
            String str = protocolMessage.channel;
            synchronized (this) {
                try {
                    channel = AblyRealtime.this.channels.containsKey(str) ? AblyRealtime.this.channels.get(str) : null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (channel == null) {
                Log.e(AblyRealtime.TAG, "Received channel message for non-existent channel");
            } else {
                channel.onChannelMessage(protocolMessage);
            }
        }

        @Override // io.ably.lib.realtime.AblyRealtime.Channels
        public void release(String str) {
            Channel channel = (Channel) this.map.remove(str);
            if (channel != null) {
                channel.markAsReleased();
                try {
                    channel.detach();
                } catch (AblyException e) {
                    Log.e(AblyRealtime.TAG, "Unexpected exception detaching channel; channelName = " + str, e);
                }
            }
            if (AblyRealtime.this.liveObjectsPlugin != null) {
                AblyRealtime.this.liveObjectsPlugin.dispose(str);
            }
        }

        @Override // io.ably.lib.transport.ConnectionManager.Channels
        public void suspendAll(ErrorInfo errorInfo, boolean z) {
            Iterator it = this.map.values().iterator();
            while (it.hasNext()) {
                ((Channel) it.next()).setSuspended(errorInfo, z);
            }
        }

        @Override // io.ably.lib.transport.ConnectionManager.Channels
        public void transferToChannelQueue(List<ConnectionManager.QueuedMessage> list) {
            HashMap map = new HashMap();
            for (ConnectionManager.QueuedMessage queuedMessage : list) {
                String str = queuedMessage.msg.channel;
                if (!map.containsKey(str)) {
                    map.put(str, new ArrayList());
                }
                ((List) map.get(str)).add(queuedMessage);
            }
            for (Channel channel : this.map.values()) {
                if (channel.state.isReattachable()) {
                    Log.d(AblyRealtime.TAG, "reAttach(); channel = " + channel.name);
                    channel.transferQueuedPresenceMessages((List) map.get(channel.name));
                }
            }
        }

        @Override // io.ably.lib.realtime.AblyRealtime.Channels
        public Channel get(String str) {
            try {
                return get(str, null);
            } catch (AblyException unused) {
                return null;
            }
        }
    }

    public AblyRealtime(String str) {
        this(new ClientOptions(str));
    }
}
