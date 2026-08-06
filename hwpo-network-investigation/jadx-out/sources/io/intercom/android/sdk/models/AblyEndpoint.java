package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.qq2;
import defpackage.wu0;
import defpackage.xj5;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AblyEndpoint {
    public static final int $stable = 8;

    @SerializedName("connectivity_check")
    private final String connectivityCheck;

    @SerializedName("endpoint")
    private final String endpoint;

    @SerializedName("fallback")
    private final List<String> fallback;

    @SerializedName("ws_connectivity_check")
    private final String wsConnectivityCheck;

    public /* synthetic */ AblyEndpoint(String str, List list, String str2, String str3, int i, qq2 qq2Var) {
        this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AblyEndpoint copy$default(AblyEndpoint ablyEndpoint, String str, List list, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ablyEndpoint.endpoint;
        }
        if ((i & 2) != 0) {
            list = ablyEndpoint.fallback;
        }
        if ((i & 4) != 0) {
            str2 = ablyEndpoint.connectivityCheck;
        }
        if ((i & 8) != 0) {
            str3 = ablyEndpoint.wsConnectivityCheck;
        }
        return ablyEndpoint.copy(str, list, str2, str3);
    }

    public final String component1() {
        return this.endpoint;
    }

    public final List<String> component2() {
        return this.fallback;
    }

    public final String component3() {
        return this.connectivityCheck;
    }

    public final String component4() {
        return this.wsConnectivityCheck;
    }

    public final AblyEndpoint copy(String str, List<String> list, String str2, String str3) {
        str.getClass();
        return new AblyEndpoint(str, list, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AblyEndpoint)) {
            return false;
        }
        AblyEndpoint ablyEndpoint = (AblyEndpoint) obj;
        return xj5.a(this.endpoint, ablyEndpoint.endpoint) && xj5.a(this.fallback, ablyEndpoint.fallback) && xj5.a(this.connectivityCheck, ablyEndpoint.connectivityCheck) && xj5.a(this.wsConnectivityCheck, ablyEndpoint.wsConnectivityCheck);
    }

    public final String getConnectivityCheck() {
        return this.connectivityCheck;
    }

    public final String getEndpoint() {
        return this.endpoint;
    }

    public final List<String> getFallback() {
        return this.fallback;
    }

    public final String getWsConnectivityCheck() {
        return this.wsConnectivityCheck;
    }

    public int hashCode() {
        int iHashCode = this.endpoint.hashCode() * 31;
        List<String> list = this.fallback;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.connectivityCheck;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.wsConnectivityCheck;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AblyEndpoint(endpoint=");
        sb.append(this.endpoint);
        sb.append(", fallback=");
        sb.append(this.fallback);
        sb.append(", connectivityCheck=");
        sb.append(this.connectivityCheck);
        sb.append(", wsConnectivityCheck=");
        return wu0.a(sb, this.wsConnectivityCheck, ')');
    }

    public AblyEndpoint(String str, List<String> list, String str2, String str3) {
        str.getClass();
        this.endpoint = str;
        this.fallback = list;
        this.connectivityCheck = str2;
        this.wsConnectivityCheck = str3;
    }
}
