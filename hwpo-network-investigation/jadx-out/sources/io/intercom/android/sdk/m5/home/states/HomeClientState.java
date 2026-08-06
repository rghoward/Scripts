package io.intercom.android.sdk.m5.home.states;

import defpackage.pi1;
import defpackage.qq2;
import defpackage.xj5;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.home.data.HomeV2Response;
import io.intercom.android.sdk.models.OpenMessengerResponse;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HomeClientState {
    public static final int $stable = 0;
    private final NetworkResponse<HomeV2Response> homeResponse;
    private final boolean isHeaderImageLoaded;
    private final NetworkResponse<OpenMessengerResponse> openMessengerResponse;

    public /* synthetic */ HomeClientState(NetworkResponse networkResponse, NetworkResponse networkResponse2, boolean z, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? null : networkResponse, (i & 2) != 0 ? null : networkResponse2, (i & 4) != 0 ? false : z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeClientState copy$default(HomeClientState homeClientState, NetworkResponse networkResponse, NetworkResponse networkResponse2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            networkResponse = homeClientState.homeResponse;
        }
        if ((i & 2) != 0) {
            networkResponse2 = homeClientState.openMessengerResponse;
        }
        if ((i & 4) != 0) {
            z = homeClientState.isHeaderImageLoaded;
        }
        return homeClientState.copy(networkResponse, networkResponse2, z);
    }

    public final NetworkResponse<HomeV2Response> component1() {
        return this.homeResponse;
    }

    public final NetworkResponse<OpenMessengerResponse> component2() {
        return this.openMessengerResponse;
    }

    public final boolean component3() {
        return this.isHeaderImageLoaded;
    }

    public final HomeClientState copy(NetworkResponse<HomeV2Response> networkResponse, NetworkResponse<OpenMessengerResponse> networkResponse2, boolean z) {
        return new HomeClientState(networkResponse, networkResponse2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeClientState)) {
            return false;
        }
        HomeClientState homeClientState = (HomeClientState) obj;
        return xj5.a(this.homeResponse, homeClientState.homeResponse) && xj5.a(this.openMessengerResponse, homeClientState.openMessengerResponse) && this.isHeaderImageLoaded == homeClientState.isHeaderImageLoaded;
    }

    public final NetworkResponse<HomeV2Response> getHomeResponse() {
        return this.homeResponse;
    }

    public final NetworkResponse<OpenMessengerResponse> getOpenMessengerResponse() {
        return this.openMessengerResponse;
    }

    public int hashCode() {
        NetworkResponse<HomeV2Response> networkResponse = this.homeResponse;
        int iHashCode = (networkResponse == null ? 0 : networkResponse.hashCode()) * 31;
        NetworkResponse<OpenMessengerResponse> networkResponse2 = this.openMessengerResponse;
        return Boolean.hashCode(this.isHeaderImageLoaded) + ((iHashCode + (networkResponse2 != null ? networkResponse2.hashCode() : 0)) * 31);
    }

    public final boolean isHeaderImageLoaded() {
        return this.isHeaderImageLoaded;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HomeClientState(homeResponse=");
        sb.append(this.homeResponse);
        sb.append(", openMessengerResponse=");
        sb.append(this.openMessengerResponse);
        sb.append(", isHeaderImageLoaded=");
        return pi1.a(sb, this.isHeaderImageLoaded, ')');
    }

    public HomeClientState(NetworkResponse<HomeV2Response> networkResponse, NetworkResponse<OpenMessengerResponse> networkResponse2, boolean z) {
        this.homeResponse = networkResponse;
        this.openMessengerResponse = networkResponse2;
        this.isHeaderImageLoaded = z;
    }

    public HomeClientState() {
        this(null, null, false, 7, null);
    }
}
