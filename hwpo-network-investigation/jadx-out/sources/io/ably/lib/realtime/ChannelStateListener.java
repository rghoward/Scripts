package io.ably.lib.realtime;

import defpackage.pi1;
import io.ably.lib.types.ErrorInfo;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface ChannelStateListener {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class Filter implements ChannelStateListener {
        ChannelStateListener listener;
        ChannelState state;

        public Filter(ChannelState channelState, ChannelStateListener channelStateListener) {
            this.state = channelState;
            this.listener = channelStateListener;
        }

        @Override // io.ably.lib.realtime.ChannelStateListener
        public void onChannelStateChanged(ChannelStateChange channelStateChange) {
            if (channelStateChange.current == this.state) {
                this.listener.onChannelStateChanged(channelStateChange);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class Multicaster extends io.ably.lib.util.Multicaster<ChannelStateListener> implements ChannelStateListener {
        public Multicaster() {
            super(new ChannelStateListener[0]);
        }

        @Override // io.ably.lib.realtime.ChannelStateListener
        public void onChannelStateChanged(ChannelStateChange channelStateChange) {
            Iterator<ChannelStateListener> it = getMembers().iterator();
            while (it.hasNext()) {
                try {
                    it.next().onChannelStateChanged(channelStateChange);
                } catch (Throwable unused) {
                }
            }
        }
    }

    void onChannelStateChanged(ChannelStateChange channelStateChange);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class ChannelStateChange {
        public final ChannelState current;
        public final ChannelEvent event;
        public final ChannelState previous;
        public final ErrorInfo reason;
        public final boolean resumed;

        public ChannelStateChange(ChannelState channelState, ChannelState channelState2, ErrorInfo errorInfo, boolean z) {
            this.event = channelState.getChannelEvent();
            this.current = channelState;
            this.previous = channelState2;
            this.reason = errorInfo;
            this.resumed = z;
        }

        public static ChannelStateChange createUpdateEvent(ErrorInfo errorInfo, boolean z) {
            return new ChannelStateChange(errorInfo, z);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{event=");
            sb.append(this.event);
            sb.append(", current=");
            sb.append(this.current);
            sb.append(", previous=");
            sb.append(this.previous);
            sb.append(", reason=");
            sb.append(this.reason);
            sb.append(", resumed=");
            return pi1.a(sb, this.resumed, '}');
        }

        private ChannelStateChange(ErrorInfo errorInfo, boolean z) {
            this.event = ChannelEvent.update;
            ChannelState channelState = ChannelState.attached;
            this.previous = channelState;
            this.current = channelState;
            this.reason = errorInfo;
            this.resumed = z;
        }
    }
}
