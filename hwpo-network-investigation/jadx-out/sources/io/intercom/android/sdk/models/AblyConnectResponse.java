package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.hf3;
import defpackage.qq2;
import defpackage.xj5;
import defpackage.zc6;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AblyConnectResponse {
    public static final int $stable = 8;

    @SerializedName("channel")
    private final String channel;

    @SerializedName("endpoints")
    private final List<AblyEndpoint> endpoints;

    public AblyConnectResponse(String str, List<AblyEndpoint> list) {
        str.getClass();
        list.getClass();
        this.channel = str;
        this.endpoints = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AblyConnectResponse copy$default(AblyConnectResponse ablyConnectResponse, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ablyConnectResponse.channel;
        }
        if ((i & 2) != 0) {
            list = ablyConnectResponse.endpoints;
        }
        return ablyConnectResponse.copy(str, list);
    }

    public final String component1() {
        return this.channel;
    }

    public final List<AblyEndpoint> component2() {
        return this.endpoints;
    }

    public final AblyConnectResponse copy(String str, List<AblyEndpoint> list) {
        str.getClass();
        list.getClass();
        return new AblyConnectResponse(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AblyConnectResponse)) {
            return false;
        }
        AblyConnectResponse ablyConnectResponse = (AblyConnectResponse) obj;
        return xj5.a(this.channel, ablyConnectResponse.channel) && xj5.a(this.endpoints, ablyConnectResponse.endpoints);
    }

    public final String getChannel() {
        return this.channel;
    }

    public final List<AblyEndpoint> getEndpoints() {
        return this.endpoints;
    }

    public int hashCode() {
        return this.endpoints.hashCode() + (this.channel.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AblyConnectResponse(channel=");
        sb.append(this.channel);
        sb.append(", endpoints=");
        return zc6.a(sb, this.endpoints, ')');
    }

    public /* synthetic */ AblyConnectResponse(String str, List list, int i, qq2 qq2Var) {
        this(str, (i & 2) != 0 ? hf3.t : list);
    }
}
