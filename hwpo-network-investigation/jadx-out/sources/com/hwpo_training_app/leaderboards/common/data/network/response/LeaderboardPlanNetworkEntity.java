package com.hwpo_training_app.leaderboards.common.data.network.response;

import com.hwpo_training_app.leaderboards.common.data.network.request.LeaderboardPlanTypeNetworkEntity;
import defpackage.f46;
import defpackage.hl3;
import defpackage.hv5;
import defpackage.il;
import defpackage.j26;
import defpackage.rd9;
import defpackage.ru3;
import defpackage.ss5;
import defpackage.xj5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class LeaderboardPlanNetworkEntity {
    public static final Companion Companion;
    public static final ss5<KSerializer<Object>>[] d;
    public final int a;
    public final String b;
    public final LeaderboardPlanTypeNetworkEntity c;

    static {
        int i = 0;
        Companion = new Companion(i);
        d = new ss5[]{null, null, hv5.c(j26.t, new f46(i))};
    }

    public /* synthetic */ LeaderboardPlanNetworkEntity(int i, int i2, String str, LeaderboardPlanTypeNetworkEntity leaderboardPlanTypeNetworkEntity) {
        if (7 != (i & 7)) {
            hl3.b(i, 7, LeaderboardPlanNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = str;
        this.c = leaderboardPlanTypeNetworkEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardPlanNetworkEntity)) {
            return false;
        }
        LeaderboardPlanNetworkEntity leaderboardPlanNetworkEntity = (LeaderboardPlanNetworkEntity) obj;
        return this.a == leaderboardPlanNetworkEntity.a && xj5.a(this.b, leaderboardPlanNetworkEntity.b) && this.c == leaderboardPlanNetworkEntity.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ru3.c(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbA = il.a("LeaderboardPlanNetworkEntity(id=", ", title=", this.b, ", type=", this.a);
        sbA.append(this.c);
        sbA.append(")");
        return sbA.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public final KSerializer<LeaderboardPlanNetworkEntity> serializer() {
            return LeaderboardPlanNetworkEntity$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
