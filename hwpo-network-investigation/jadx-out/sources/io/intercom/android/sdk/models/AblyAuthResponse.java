package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AblyAuthResponse {
    public static final int $stable = 0;

    @SerializedName("token")
    private final String token;

    public AblyAuthResponse(String str) {
        str.getClass();
        this.token = str;
    }

    public static /* synthetic */ AblyAuthResponse copy$default(AblyAuthResponse ablyAuthResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ablyAuthResponse.token;
        }
        return ablyAuthResponse.copy(str);
    }

    public final String component1() {
        return this.token;
    }

    public final AblyAuthResponse copy(String str) {
        str.getClass();
        return new AblyAuthResponse(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AblyAuthResponse) && xj5.a(this.token, ((AblyAuthResponse) obj).token);
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.token.hashCode();
    }

    public String toString() {
        return wu0.a(new StringBuilder("AblyAuthResponse(token="), this.token, ')');
    }
}
