package com.hwpo_training_app.notifications.domain.entity;

import defpackage.a08;
import defpackage.ps6;
import defpackage.uo2;
import defpackage.xj5;
import j$.time.LocalDateTime;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class NotificationModel {
    public final long a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class ClientBonusPlanRemind extends NotificationModel {
        public final long b;
        public final String c;
        public final String d;
        public final LocalDateTime e;
        public final boolean f;
        public final ps6 g;
        public final a08 h;

        public ClientBonusPlanRemind(long j, String str, String str2, LocalDateTime localDateTime, boolean z, ps6 ps6Var, a08 a08Var) {
            super(j);
            this.b = j;
            this.c = str;
            this.d = str2;
            this.e = localDateTime;
            this.f = z;
            this.g = ps6Var;
            this.h = a08Var;
        }

        @Override // com.hwpo_training_app.notifications.domain.entity.NotificationModel
        public final long a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClientBonusPlanRemind)) {
                return false;
            }
            ClientBonusPlanRemind clientBonusPlanRemind = (ClientBonusPlanRemind) obj;
            return this.b == clientBonusPlanRemind.b && xj5.a(this.c, clientBonusPlanRemind.c) && xj5.a(this.d, clientBonusPlanRemind.d) && this.e.equals(clientBonusPlanRemind.e) && this.f == clientBonusPlanRemind.f && this.g.equals(clientBonusPlanRemind.g) && xj5.a(this.h, clientBonusPlanRemind.h);
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.b) * 31;
            String str = this.c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode3 = (this.g.hashCode() + uo2.a((this.e.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, this.f, 31)) * 31;
            a08 a08Var = this.h;
            return iHashCode3 + (a08Var != null ? a08Var.hashCode() : 0);
        }

        public final String toString() {
            return "ClientBonusPlanRemind(id=" + this.b + ", title=" + this.c + ", text=" + this.d + ", createdAt=" + this.e + ", isRead=" + this.f + ", author=" + this.g + ", plan=" + this.h + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class LeaderboardCommentCreated extends NotificationModel {
        public final long b;
        public final String c;
        public final String d;
        public final LocalDateTime e;
        public final boolean f;
        public final ps6 g;
        public final Integer h;
        public final a08 i;
        public final LeaderboardScoreModel j;

        public LeaderboardCommentCreated(long j, String str, String str2, LocalDateTime localDateTime, boolean z, ps6 ps6Var, Integer num, a08 a08Var, LeaderboardScoreModel leaderboardScoreModel) {
            super(j);
            this.b = j;
            this.c = str;
            this.d = str2;
            this.e = localDateTime;
            this.f = z;
            this.g = ps6Var;
            this.h = num;
            this.i = a08Var;
            this.j = leaderboardScoreModel;
        }

        @Override // com.hwpo_training_app.notifications.domain.entity.NotificationModel
        public final long a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LeaderboardCommentCreated)) {
                return false;
            }
            LeaderboardCommentCreated leaderboardCommentCreated = (LeaderboardCommentCreated) obj;
            return this.b == leaderboardCommentCreated.b && xj5.a(this.c, leaderboardCommentCreated.c) && xj5.a(this.d, leaderboardCommentCreated.d) && this.e.equals(leaderboardCommentCreated.e) && this.f == leaderboardCommentCreated.f && this.g.equals(leaderboardCommentCreated.g) && xj5.a(this.h, leaderboardCommentCreated.h) && xj5.a(this.i, leaderboardCommentCreated.i) && this.j.equals(leaderboardCommentCreated.j);
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.b) * 31;
            String str = this.c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode3 = (this.g.hashCode() + uo2.a((this.e.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, this.f, 31)) * 31;
            Integer num = this.h;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            a08 a08Var = this.i;
            return this.j.hashCode() + ((iHashCode4 + (a08Var != null ? a08Var.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "LeaderboardCommentCreated(id=" + this.b + ", title=" + this.c + ", text=" + this.d + ", createdAt=" + this.e + ", isRead=" + this.f + ", author=" + this.g + ", programId=" + this.h + ", plan=" + this.i + ", leaderboardScoreComment=" + this.j + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class LeaderboardCommentMentioned extends NotificationModel {
        public final long b;
        public final String c;
        public final String d;
        public final LocalDateTime e;
        public final boolean f;
        public final ps6 g;
        public final Integer h;
        public final a08 i;
        public final LeaderboardScoreModel j;

        public LeaderboardCommentMentioned(long j, String str, String str2, LocalDateTime localDateTime, boolean z, ps6 ps6Var, Integer num, a08 a08Var, LeaderboardScoreModel leaderboardScoreModel) {
            super(j);
            this.b = j;
            this.c = str;
            this.d = str2;
            this.e = localDateTime;
            this.f = z;
            this.g = ps6Var;
            this.h = num;
            this.i = a08Var;
            this.j = leaderboardScoreModel;
        }

        @Override // com.hwpo_training_app.notifications.domain.entity.NotificationModel
        public final long a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LeaderboardCommentMentioned)) {
                return false;
            }
            LeaderboardCommentMentioned leaderboardCommentMentioned = (LeaderboardCommentMentioned) obj;
            return this.b == leaderboardCommentMentioned.b && xj5.a(this.c, leaderboardCommentMentioned.c) && xj5.a(this.d, leaderboardCommentMentioned.d) && this.e.equals(leaderboardCommentMentioned.e) && this.f == leaderboardCommentMentioned.f && this.g.equals(leaderboardCommentMentioned.g) && xj5.a(this.h, leaderboardCommentMentioned.h) && xj5.a(this.i, leaderboardCommentMentioned.i) && this.j.equals(leaderboardCommentMentioned.j);
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.b) * 31;
            String str = this.c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode3 = (this.g.hashCode() + uo2.a((this.e.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, this.f, 31)) * 31;
            Integer num = this.h;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            a08 a08Var = this.i;
            return this.j.hashCode() + ((iHashCode4 + (a08Var != null ? a08Var.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "LeaderboardCommentMentioned(id=" + this.b + ", title=" + this.c + ", text=" + this.d + ", createdAt=" + this.e + ", isRead=" + this.f + ", author=" + this.g + ", programId=" + this.h + ", plan=" + this.i + ", leaderboardScoreComment=" + this.j + ")";
        }
    }

    public NotificationModel(long j) {
        this.a = j;
    }

    public long a() {
        return this.a;
    }
}
