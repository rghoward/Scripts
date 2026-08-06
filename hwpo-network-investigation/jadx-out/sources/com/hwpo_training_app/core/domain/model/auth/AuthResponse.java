package com.hwpo_training_app.core.domain.model.auth;

import com.hwpo_training_app.core.data.model.user.UserNetworkEntity;
import defpackage.hl3;
import defpackage.rd9;
import defpackage.ru3;
import defpackage.vb0;
import defpackage.xj5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public final class AuthResponse {
    public static final Companion Companion = new Companion();
    public final String a;
    public final String b;
    public final UserNetworkEntity c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<AuthResponse> serializer() {
            return AuthResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AuthResponse(int i, String str, String str2, UserNetworkEntity userNetworkEntity) {
        if (7 != (i & 7)) {
            hl3.b(i, 7, AuthResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = userNetworkEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthResponse)) {
            return false;
        }
        AuthResponse authResponse = (AuthResponse) obj;
        return xj5.a(this.a, authResponse.a) && xj5.a(this.b, authResponse.b) && xj5.a(this.c, authResponse.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ru3.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbA = vb0.a("AuthResponse(token=", this.a, ", tokenType=", this.b, ", user=");
        sbA.append(this.c);
        sbA.append(")");
        return sbA.toString();
    }
}
