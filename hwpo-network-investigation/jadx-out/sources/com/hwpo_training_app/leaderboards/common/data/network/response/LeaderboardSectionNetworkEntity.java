package com.hwpo_training_app.leaderboards.common.data.network.response;

import defpackage.av;
import defpackage.hl3;
import defpackage.il;
import defpackage.rd9;
import defpackage.xj5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class LeaderboardSectionNetworkEntity {
    public static final Companion Companion = new Companion(0);
    public final int a;
    public final String b;
    public final String c;

    public /* synthetic */ LeaderboardSectionNetworkEntity(int i, int i2, String str, String str2) {
        if (1 != (i & 1)) {
            hl3.b(i, 1, LeaderboardSectionNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = i2;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardSectionNetworkEntity)) {
            return false;
        }
        LeaderboardSectionNetworkEntity leaderboardSectionNetworkEntity = (LeaderboardSectionNetworkEntity) obj;
        return this.a == leaderboardSectionNetworkEntity.a && xj5.a(this.b, leaderboardSectionNetworkEntity.b) && xj5.a(this.c, leaderboardSectionNetworkEntity.c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return av.a(il.a("LeaderboardSectionNetworkEntity(id=", ", title=", this.b, ", description=", this.a), this.c, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public final KSerializer<LeaderboardSectionNetworkEntity> serializer() {
            return LeaderboardSectionNetworkEntity$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
