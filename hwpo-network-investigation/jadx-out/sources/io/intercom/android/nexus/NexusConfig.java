package io.intercom.android.nexus;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class NexusConfig {
    private final int connectionTimeout;
    private final List<String> endpoints;
    private final int presenceHeartbeatInterval;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class Builder {
        int connection_timeout;
        List<String> endpoints;
        int presence_heartbeat_interval;

        public NexusConfig build() {
            return new NexusConfig(this);
        }

        public Builder withConnectionTimeout(int i) {
            this.connection_timeout = i;
            return this;
        }

        public Builder withEndpoints(List<String> list) {
            this.endpoints = list;
            return this;
        }

        public Builder withPresenceHeartbeatInterval(int i) {
            this.presence_heartbeat_interval = i;
            return this;
        }
    }

    public NexusConfig(Builder builder) {
        List<String> list = builder.endpoints;
        this.endpoints = list == null ? new ArrayList<>() : list;
        this.presenceHeartbeatInterval = builder.presence_heartbeat_interval;
        this.connectionTimeout = builder.connection_timeout;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            NexusConfig nexusConfig = (NexusConfig) obj;
            if (this.connectionTimeout == nexusConfig.connectionTimeout && this.presenceHeartbeatInterval == nexusConfig.presenceHeartbeatInterval && this.endpoints.equals(nexusConfig.endpoints)) {
                return true;
            }
        }
        return false;
    }

    public int getConnectionTimeout() {
        return this.connectionTimeout;
    }

    public List<String> getEndpoints() {
        return this.endpoints;
    }

    public int getPresenceHeartbeatInterval() {
        return this.presenceHeartbeatInterval;
    }

    public int hashCode() {
        return (((this.endpoints.hashCode() * 31) + this.presenceHeartbeatInterval) * 31) + this.connectionTimeout;
    }

    public NexusConfig() {
        this(new Builder());
    }
}
