package com.hwpo_training_app.notifications.data.network.push.leaderboard;

import com.hwpo_training_app.notifications.domain.entity.LeaderboardScoreModel;
import defpackage.f93;
import defpackage.hl3;
import defpackage.hv5;
import defpackage.j26;
import defpackage.l46;
import defpackage.os2;
import defpackage.rd9;
import defpackage.ss5;
import defpackage.xj5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class LeaderboardScoreCommentNotificationNetworkEntity implements f93<LeaderboardScoreModel> {
    public static final Companion Companion = new Companion(0);
    public static final ss5<KSerializer<Object>>[] x = {null, null, null, hv5.c(j26.t, new l46())};
    public final int t;
    public final Integer u;
    public final int v;
    public final LeaderboardKindNetworkEntity w;

    public /* synthetic */ LeaderboardScoreCommentNotificationNetworkEntity(int i, int i2, Integer num, int i3, LeaderboardKindNetworkEntity leaderboardKindNetworkEntity) {
        if (15 != (i & 15)) {
            hl3.b(i, 15, LeaderboardScoreCommentNotificationNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.t = i2;
        this.u = num;
        this.v = i3;
        this.w = leaderboardKindNetworkEntity;
    }

    @Override // defpackage.f93
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final LeaderboardScoreModel a() {
        return new LeaderboardScoreModel(this.t, this.u, this.v, this.w.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardScoreCommentNotificationNetworkEntity)) {
            return false;
        }
        LeaderboardScoreCommentNotificationNetworkEntity leaderboardScoreCommentNotificationNetworkEntity = (LeaderboardScoreCommentNotificationNetworkEntity) obj;
        return this.t == leaderboardScoreCommentNotificationNetworkEntity.t && xj5.a(this.u, leaderboardScoreCommentNotificationNetworkEntity.u) && this.v == leaderboardScoreCommentNotificationNetworkEntity.v && this.w == leaderboardScoreCommentNotificationNetworkEntity.w;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.t) * 31;
        Integer num = this.u;
        return this.w.hashCode() + os2.a(this.v, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "LeaderboardScoreCommentNotificationNetworkEntity(id=" + this.t + ", valueId=" + this.u + ", leaderboardId=" + this.v + ", kind=" + this.w + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public final KSerializer<LeaderboardScoreCommentNotificationNetworkEntity> serializer() {
            return LeaderboardScoreCommentNotificationNetworkEntity$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
