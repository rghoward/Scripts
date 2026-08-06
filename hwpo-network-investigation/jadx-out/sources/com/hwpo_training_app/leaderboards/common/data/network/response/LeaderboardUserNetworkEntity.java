package com.hwpo_training_app.leaderboards.common.data.network.response;

import defpackage.hl3;
import defpackage.il;
import defpackage.os2;
import defpackage.rd9;
import defpackage.ru3;
import defpackage.ux1;
import defpackage.xj5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class LeaderboardUserNetworkEntity {
    public static final Companion Companion = new Companion(0);
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final boolean f;

    public /* synthetic */ LeaderboardUserNetworkEntity(int i, int i2, String str, String str2, String str3, int i3, boolean z) {
        if (55 != (i & 55)) {
            hl3.b(i, 55, LeaderboardUserNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = str;
        this.c = str2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        this.e = i3;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardUserNetworkEntity)) {
            return false;
        }
        LeaderboardUserNetworkEntity leaderboardUserNetworkEntity = (LeaderboardUserNetworkEntity) obj;
        return this.a == leaderboardUserNetworkEntity.a && xj5.a(this.b, leaderboardUserNetworkEntity.b) && xj5.a(this.c, leaderboardUserNetworkEntity.c) && xj5.a(this.d, leaderboardUserNetworkEntity.d) && this.e == leaderboardUserNetworkEntity.e && this.f == leaderboardUserNetworkEntity.f;
    }

    public final int hashCode() {
        int iC = ru3.c(ru3.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.f) + os2.a(this.e, (iC + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbA = il.a("LeaderboardUserNetworkEntity(id=", ", fullName=", this.b, ", country=", this.a);
        ux1.b(sbA, this.c, ", avatarUrl=", this.d, ", age=");
        sbA.append(this.e);
        sbA.append(", isMine=");
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public final KSerializer<LeaderboardUserNetworkEntity> serializer() {
            return LeaderboardUserNetworkEntity$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
