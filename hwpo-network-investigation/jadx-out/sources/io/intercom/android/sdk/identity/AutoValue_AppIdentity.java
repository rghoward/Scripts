package io.intercom.android.sdk.identity;

import defpackage.ac4;
import defpackage.av;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_AppIdentity extends AppIdentity {
    private final String apiKey;
    private final String appId;

    public AutoValue_AppIdentity(String str, String str2) {
        if (str == null) {
            ac4.c("Null apiKey");
            throw null;
        }
        this.apiKey = str;
        if (str2 != null) {
            this.appId = str2;
        } else {
            ac4.c("Null appId");
            throw null;
        }
    }

    @Override // io.intercom.android.sdk.identity.AppIdentity
    public String apiKey() {
        return this.apiKey;
    }

    @Override // io.intercom.android.sdk.identity.AppIdentity
    public String appId() {
        return this.appId;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AppIdentity) {
            AppIdentity appIdentity = (AppIdentity) obj;
            if (this.apiKey.equals(appIdentity.apiKey()) && this.appId.equals(appIdentity.appId())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.appId.hashCode() ^ ((this.apiKey.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppIdentity{apiKey=");
        sb.append(this.apiKey);
        sb.append(", appId=");
        return av.a(sb, this.appId, "}");
    }
}
