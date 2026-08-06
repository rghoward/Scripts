package io.intercom.android.sdk;

import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AuthToken {
    public static final int $stable = 8;
    private String name;
    private String token;

    public AuthToken(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.name = str;
        this.token = str2;
    }

    public static /* synthetic */ AuthToken copy$default(AuthToken authToken, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authToken.name;
        }
        if ((i & 2) != 0) {
            str2 = authToken.token;
        }
        return authToken.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.token;
    }

    public final AuthToken copy(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new AuthToken(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthToken)) {
            return false;
        }
        AuthToken authToken = (AuthToken) obj;
        return xj5.a(this.name, authToken.name) && xj5.a(this.token, authToken.token);
    }

    public final String getName() {
        return this.name;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.token.hashCode() + (this.name.hashCode() * 31);
    }

    public final void setName(String str) {
        str.getClass();
        this.name = str;
    }

    public final void setToken(String str) {
        str.getClass();
        this.token = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AuthToken(name=");
        sb.append(this.name);
        sb.append(", token=");
        return wu0.a(sb, this.token, ')');
    }
}
