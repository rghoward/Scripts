package com.hwpo_training_app.notifications.data.network.push;

import com.hwpo_training_app.core.data.model.schedule.PlanNetworkEntity;
import com.hwpo_training_app.core.data.model.user.OpponentNetworkEntity;
import com.hwpo_training_app.notifications.data.network.push.leaderboard.LeaderboardScoreCommentNotificationNetworkEntity;
import com.hwpo_training_app.notifications.domain.entity.NotificationModel;
import defpackage.al;
import defpackage.b56;
import defpackage.ed7;
import defpackage.f93;
import defpackage.hl3;
import defpackage.hv5;
import defpackage.j26;
import defpackage.rd9;
import defpackage.ss5;
import defpackage.uo2;
import defpackage.ux1;
import defpackage.xj5;
import defpackage.y00;
import defpackage.yk2;
import j$.time.LocalDateTime;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9(with = NotificationModuleSerializer.class)
public abstract class NotificationNetworkEntity implements f93<NotificationModel> {
    public static final Companion Companion = new Companion(0);

    public /* synthetic */ NotificationNetworkEntity(int i) {
        this();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @rd9
    public static final class ClientBonusPlanRemindNotificationNetworkEntity extends NotificationNetworkEntity {
        public static final Companion Companion = new Companion(0);
        public static final ss5<KSerializer<Object>>[] D = {null, null, hv5.c(j26.t, new ed7(0)), null, null, null, null, null, null, null};
        public final String A;
        public final String B;
        public final OpponentNetworkEntity C;
        public final long t;
        public final boolean u;
        public final NotificationTypeNetworkEntity v;
        public final String w;
        public final String x;
        public final PlanNetworkEntity y;
        public final long z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ClientBonusPlanRemindNotificationNetworkEntity(int i, long j, boolean z, NotificationTypeNetworkEntity notificationTypeNetworkEntity, String str, String str2, PlanNetworkEntity planNetworkEntity, long j2, String str3, String str4, OpponentNetworkEntity opponentNetworkEntity) {
            super(0);
            if (991 != (i & 991)) {
                hl3.b(i, 991, NotificationNetworkEntity$ClientBonusPlanRemindNotificationNetworkEntity$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.t = j;
            this.u = z;
            this.v = notificationTypeNetworkEntity;
            this.w = str;
            this.x = str2;
            if ((i & 32) == 0) {
                this.y = null;
            } else {
                this.y = planNetworkEntity;
            }
            this.z = j2;
            this.A = str3;
            this.B = str4;
            this.C = opponentNetworkEntity;
        }

        @Override // defpackage.f93
        public final NotificationModel a() {
            LocalDateTime localDateTimeQ = yk2.q(this.z);
            localDateTimeQ.getClass();
            PlanNetworkEntity planNetworkEntity = this.y;
            return new NotificationModel.ClientBonusPlanRemind(this.t, this.A, this.B, localDateTimeQ, this.u, this.C.a(), planNetworkEntity != null ? planNetworkEntity.a() : null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClientBonusPlanRemindNotificationNetworkEntity)) {
                return false;
            }
            ClientBonusPlanRemindNotificationNetworkEntity clientBonusPlanRemindNotificationNetworkEntity = (ClientBonusPlanRemindNotificationNetworkEntity) obj;
            return this.t == clientBonusPlanRemindNotificationNetworkEntity.t && this.u == clientBonusPlanRemindNotificationNetworkEntity.u && this.v == clientBonusPlanRemindNotificationNetworkEntity.v && xj5.a(this.w, clientBonusPlanRemindNotificationNetworkEntity.w) && xj5.a(this.x, clientBonusPlanRemindNotificationNetworkEntity.x) && xj5.a(this.y, clientBonusPlanRemindNotificationNetworkEntity.y) && this.z == clientBonusPlanRemindNotificationNetworkEntity.z && xj5.a(this.A, clientBonusPlanRemindNotificationNetworkEntity.A) && xj5.a(this.B, clientBonusPlanRemindNotificationNetworkEntity.B) && xj5.a(this.C, clientBonusPlanRemindNotificationNetworkEntity.C);
        }

        public final int hashCode() {
            int iHashCode = (this.v.hashCode() + uo2.a(Long.hashCode(this.t) * 31, this.u, 31)) * 31;
            String str = this.w;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.x;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            PlanNetworkEntity planNetworkEntity = this.y;
            int iC = al.c(this.z, (iHashCode3 + (planNetworkEntity == null ? 0 : planNetworkEntity.hashCode())) * 31, 31);
            String str3 = this.A;
            int iHashCode4 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.B;
            return this.C.hashCode() + ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClientBonusPlanRemindNotificationNetworkEntity(id=");
            sb.append(this.t);
            sb.append(", isRead=");
            sb.append(this.u);
            sb.append(", notificationType=");
            sb.append(this.v);
            sb.append(", userType=");
            sb.append(this.w);
            sb.append(", activityType=");
            sb.append(this.x);
            sb.append(", plan=");
            sb.append(this.y);
            sb.append(", createdAt=");
            sb.append(this.z);
            sb.append(", title=");
            ux1.b(sb, this.A, ", text=", this.B, ", author=");
            sb.append(this.C);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Companion {
            public /* synthetic */ Companion(int i) {
                this();
            }

            public final KSerializer<ClientBonusPlanRemindNotificationNetworkEntity> serializer() {
                return NotificationNetworkEntity$ClientBonusPlanRemindNotificationNetworkEntity$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @rd9
    public static final class LeaderboardCommentMentionedNotificationNetworkEntity extends NotificationNetworkEntity {
        public static final Companion Companion = new Companion(0);
        public static final ss5<KSerializer<Object>>[] F = {null, hv5.c(j26.t, new y00(3)), null, null, null, null, null, null, null, null, null, null};
        public final OpponentNetworkEntity A;
        public final boolean B;
        public final Integer C;
        public final PlanNetworkEntity D;
        public final LeaderboardScoreCommentNotificationNetworkEntity E;
        public final long t;
        public final NotificationTypeNetworkEntity u;
        public final long v;
        public final String w;
        public final String x;
        public final String y;
        public final String z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ LeaderboardCommentMentionedNotificationNetworkEntity(int i, long j, NotificationTypeNetworkEntity notificationTypeNetworkEntity, long j2, String str, String str2, String str3, String str4, OpponentNetworkEntity opponentNetworkEntity, boolean z, Integer num, PlanNetworkEntity planNetworkEntity, LeaderboardScoreCommentNotificationNetworkEntity leaderboardScoreCommentNotificationNetworkEntity) {
            super(0);
            if (2559 != (i & 2559)) {
                hl3.b(i, 2559, NotificationNetworkEntity$LeaderboardCommentMentionedNotificationNetworkEntity$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.t = j;
            this.u = notificationTypeNetworkEntity;
            this.v = j2;
            this.w = str;
            this.x = str2;
            this.y = str3;
            this.z = str4;
            this.A = opponentNetworkEntity;
            this.B = z;
            if ((i & 512) == 0) {
                this.C = null;
            } else {
                this.C = num;
            }
            if ((i & 1024) == 0) {
                this.D = null;
            } else {
                this.D = planNetworkEntity;
            }
            this.E = leaderboardScoreCommentNotificationNetworkEntity;
        }

        @Override // defpackage.f93
        public final NotificationModel a() {
            LocalDateTime localDateTimeQ = yk2.q(this.v);
            localDateTimeQ.getClass();
            PlanNetworkEntity planNetworkEntity = this.D;
            return new NotificationModel.LeaderboardCommentMentioned(this.t, this.w, this.x, localDateTimeQ, this.B, this.A.a(), this.C, planNetworkEntity != null ? planNetworkEntity.a() : null, this.E.a());
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LeaderboardCommentMentionedNotificationNetworkEntity)) {
                return false;
            }
            LeaderboardCommentMentionedNotificationNetworkEntity leaderboardCommentMentionedNotificationNetworkEntity = (LeaderboardCommentMentionedNotificationNetworkEntity) obj;
            return this.t == leaderboardCommentMentionedNotificationNetworkEntity.t && this.u == leaderboardCommentMentionedNotificationNetworkEntity.u && this.v == leaderboardCommentMentionedNotificationNetworkEntity.v && xj5.a(this.w, leaderboardCommentMentionedNotificationNetworkEntity.w) && xj5.a(this.x, leaderboardCommentMentionedNotificationNetworkEntity.x) && xj5.a(this.y, leaderboardCommentMentionedNotificationNetworkEntity.y) && xj5.a(this.z, leaderboardCommentMentionedNotificationNetworkEntity.z) && xj5.a(this.A, leaderboardCommentMentionedNotificationNetworkEntity.A) && this.B == leaderboardCommentMentionedNotificationNetworkEntity.B && xj5.a(this.C, leaderboardCommentMentionedNotificationNetworkEntity.C) && xj5.a(this.D, leaderboardCommentMentionedNotificationNetworkEntity.D) && xj5.a(this.E, leaderboardCommentMentionedNotificationNetworkEntity.E);
        }

        public final int hashCode() {
            int iC = al.c(this.v, (this.u.hashCode() + (Long.hashCode(this.t) * 31)) * 31, 31);
            String str = this.w;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.x;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.y;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.z;
            int iA = uo2.a((this.A.hashCode() + ((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31, this.B, 31);
            Integer num = this.C;
            int iHashCode4 = (iA + (num == null ? 0 : num.hashCode())) * 31;
            PlanNetworkEntity planNetworkEntity = this.D;
            return this.E.hashCode() + ((iHashCode4 + (planNetworkEntity != null ? planNetworkEntity.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LeaderboardCommentMentionedNotificationNetworkEntity(id=");
            sb.append(this.t);
            sb.append(", notificationType=");
            sb.append(this.u);
            sb.append(", createdAt=");
            sb.append(this.v);
            sb.append(", title=");
            ux1.b(sb, this.w, ", text=", this.x, ", userType=");
            ux1.b(sb, this.y, ", activityType=", this.z, ", author=");
            sb.append(this.A);
            sb.append(", isRead=");
            sb.append(this.B);
            sb.append(", programId=");
            sb.append(this.C);
            sb.append(", plan=");
            sb.append(this.D);
            sb.append(", leaderboardScoreComment=");
            sb.append(this.E);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Companion {
            public /* synthetic */ Companion(int i) {
                this();
            }

            public final KSerializer<LeaderboardCommentMentionedNotificationNetworkEntity> serializer() {
                return NotificationNetworkEntity$LeaderboardCommentMentionedNotificationNetworkEntity$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @rd9
    public static final class LeaderboardCommentNotificationNetworkEntity extends NotificationNetworkEntity {
        public static final Companion Companion = new Companion(0);
        public static final ss5<KSerializer<Object>>[] F = {null, hv5.c(j26.t, new b56(1)), null, null, null, null, null, null, null, null, null, null};
        public final OpponentNetworkEntity A;
        public final boolean B;
        public final Integer C;
        public final PlanNetworkEntity D;
        public final LeaderboardScoreCommentNotificationNetworkEntity E;
        public final long t;
        public final NotificationTypeNetworkEntity u;
        public final long v;
        public final String w;
        public final String x;
        public final String y;
        public final String z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ LeaderboardCommentNotificationNetworkEntity(int i, long j, NotificationTypeNetworkEntity notificationTypeNetworkEntity, long j2, String str, String str2, String str3, String str4, OpponentNetworkEntity opponentNetworkEntity, boolean z, Integer num, PlanNetworkEntity planNetworkEntity, LeaderboardScoreCommentNotificationNetworkEntity leaderboardScoreCommentNotificationNetworkEntity) {
            super(0);
            if (2559 != (i & 2559)) {
                hl3.b(i, 2559, NotificationNetworkEntity$LeaderboardCommentNotificationNetworkEntity$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.t = j;
            this.u = notificationTypeNetworkEntity;
            this.v = j2;
            this.w = str;
            this.x = str2;
            this.y = str3;
            this.z = str4;
            this.A = opponentNetworkEntity;
            this.B = z;
            if ((i & 512) == 0) {
                this.C = null;
            } else {
                this.C = num;
            }
            if ((i & 1024) == 0) {
                this.D = null;
            } else {
                this.D = planNetworkEntity;
            }
            this.E = leaderboardScoreCommentNotificationNetworkEntity;
        }

        @Override // defpackage.f93
        public final NotificationModel a() {
            LocalDateTime localDateTimeQ = yk2.q(this.v);
            localDateTimeQ.getClass();
            PlanNetworkEntity planNetworkEntity = this.D;
            return new NotificationModel.LeaderboardCommentCreated(this.t, this.w, this.x, localDateTimeQ, this.B, this.A.a(), this.C, planNetworkEntity != null ? planNetworkEntity.a() : null, this.E.a());
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LeaderboardCommentNotificationNetworkEntity)) {
                return false;
            }
            LeaderboardCommentNotificationNetworkEntity leaderboardCommentNotificationNetworkEntity = (LeaderboardCommentNotificationNetworkEntity) obj;
            return this.t == leaderboardCommentNotificationNetworkEntity.t && this.u == leaderboardCommentNotificationNetworkEntity.u && this.v == leaderboardCommentNotificationNetworkEntity.v && xj5.a(this.w, leaderboardCommentNotificationNetworkEntity.w) && xj5.a(this.x, leaderboardCommentNotificationNetworkEntity.x) && xj5.a(this.y, leaderboardCommentNotificationNetworkEntity.y) && xj5.a(this.z, leaderboardCommentNotificationNetworkEntity.z) && xj5.a(this.A, leaderboardCommentNotificationNetworkEntity.A) && this.B == leaderboardCommentNotificationNetworkEntity.B && xj5.a(this.C, leaderboardCommentNotificationNetworkEntity.C) && xj5.a(this.D, leaderboardCommentNotificationNetworkEntity.D) && xj5.a(this.E, leaderboardCommentNotificationNetworkEntity.E);
        }

        public final int hashCode() {
            int iC = al.c(this.v, (this.u.hashCode() + (Long.hashCode(this.t) * 31)) * 31, 31);
            String str = this.w;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.x;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.y;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.z;
            int iA = uo2.a((this.A.hashCode() + ((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31, this.B, 31);
            Integer num = this.C;
            int iHashCode4 = (iA + (num == null ? 0 : num.hashCode())) * 31;
            PlanNetworkEntity planNetworkEntity = this.D;
            return this.E.hashCode() + ((iHashCode4 + (planNetworkEntity != null ? planNetworkEntity.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LeaderboardCommentNotificationNetworkEntity(id=");
            sb.append(this.t);
            sb.append(", notificationType=");
            sb.append(this.u);
            sb.append(", createdAt=");
            sb.append(this.v);
            sb.append(", title=");
            ux1.b(sb, this.w, ", text=", this.x, ", userType=");
            ux1.b(sb, this.y, ", activityType=", this.z, ", author=");
            sb.append(this.A);
            sb.append(", isRead=");
            sb.append(this.B);
            sb.append(", programId=");
            sb.append(this.C);
            sb.append(", plan=");
            sb.append(this.D);
            sb.append(", leaderboardScoreComment=");
            sb.append(this.E);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Companion {
            public /* synthetic */ Companion(int i) {
                this();
            }

            public final KSerializer<LeaderboardCommentNotificationNetworkEntity> serializer() {
                return NotificationNetworkEntity$LeaderboardCommentNotificationNetworkEntity$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public final KSerializer<NotificationNetworkEntity> serializer() {
            return NotificationModuleSerializer.c;
        }

        private Companion() {
        }
    }

    private NotificationNetworkEntity() {
    }
}
