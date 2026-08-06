package com.hwpo_training_app.notifications.presentation.entity;

import defpackage.os2;
import defpackage.ru3;
import defpackage.uo2;
import defpackage.ux1;
import defpackage.w27;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class NotificationUiEntity {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class ClientBonusPlanRemind extends NotificationUiEntity {
        public final long a;
        public final boolean b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientBonusPlanRemind(long j, boolean z, String str, String str2, String str3, String str4, String str5) {
            super(0);
            str2.getClass();
            str4.getClass();
            this.a = j;
            this.b = z;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = str5;
        }

        @Override // com.hwpo_training_app.notifications.presentation.entity.NotificationUiEntity
        public final String a() {
            return this.e;
        }

        @Override // com.hwpo_training_app.notifications.presentation.entity.NotificationUiEntity
        public final String b() {
            return this.d;
        }

        @Override // com.hwpo_training_app.notifications.presentation.entity.NotificationUiEntity
        public final long c() {
            return this.a;
        }

        @Override // com.hwpo_training_app.notifications.presentation.entity.NotificationUiEntity
        public final String d() {
            return this.c;
        }

        @Override // com.hwpo_training_app.notifications.presentation.entity.NotificationUiEntity
        public final String e() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClientBonusPlanRemind)) {
                return false;
            }
            ClientBonusPlanRemind clientBonusPlanRemind = (ClientBonusPlanRemind) obj;
            return this.a == clientBonusPlanRemind.a && this.b == clientBonusPlanRemind.b && xj5.a(this.c, clientBonusPlanRemind.c) && xj5.a(this.d, clientBonusPlanRemind.d) && xj5.a(this.e, clientBonusPlanRemind.e) && xj5.a(this.f, clientBonusPlanRemind.f) && xj5.a(this.g, clientBonusPlanRemind.g);
        }

        @Override // com.hwpo_training_app.notifications.presentation.entity.NotificationUiEntity
        public final boolean f() {
            return this.b;
        }

        public final int hashCode() {
            int iC = ru3.c(ru3.c(uo2.a(Long.hashCode(this.a) * 31, this.b, 31), 31, this.c), 31, this.d);
            String str = this.e;
            int iC2 = ru3.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
            String str2 = this.g;
            return iC2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClientBonusPlanRemind(id=");
            sb.append(this.a);
            sb.append(", isRead=");
            sb.append(this.b);
            ux1.b(sb, ", sentTimeText=", this.c, ", authorName=", this.d);
            ux1.b(sb, ", authorAvatarUrl=", this.e, ", authorAvatarLetter=", this.f);
            return w27.a(sb, ", text=", this.g, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class LeaderboardCommentCreated extends NotificationUiEntity {
        public final long a;
        public final boolean b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LeaderboardCommentCreated(long j, boolean z, String str, String str2, String str3, String str4, String str5, int i) {
            super(0);
            str2.getClass();
            str4.getClass();
            this.a = j;
            this.b = z;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = str5;
            this.h = i;
        }

        @Override // com.hwpo_training_app.notifications.presentation.entity.NotificationUiEntity
        public final String a() {
            return this.e;
        }

        @Override // com.hwpo_training_app.notifications.presentation.entity.NotificationUiEntity
        public final String b() {
            return this.d;
        }

        @Override // com.hwpo_training_app.notifications.presentation.entity.NotificationUiEntity
        public final long c() {
            return this.a;
        }

        @Override // com.hwpo_training_app.notifications.presentation.entity.NotificationUiEntity
        public final String d() {
            return this.c;
        }

        @Override // com.hwpo_training_app.notifications.presentation.entity.NotificationUiEntity
        public final String e() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LeaderboardCommentCreated)) {
                return false;
            }
            LeaderboardCommentCreated leaderboardCommentCreated = (LeaderboardCommentCreated) obj;
            return this.a == leaderboardCommentCreated.a && this.b == leaderboardCommentCreated.b && xj5.a(this.c, leaderboardCommentCreated.c) && xj5.a(this.d, leaderboardCommentCreated.d) && xj5.a(this.e, leaderboardCommentCreated.e) && xj5.a(this.f, leaderboardCommentCreated.f) && xj5.a(this.g, leaderboardCommentCreated.g) && this.h == leaderboardCommentCreated.h;
        }

        @Override // com.hwpo_training_app.notifications.presentation.entity.NotificationUiEntity
        public final boolean f() {
            return this.b;
        }

        public final int hashCode() {
            int iC = ru3.c(ru3.c(uo2.a(Long.hashCode(this.a) * 31, this.b, 31), 31, this.c), 31, this.d);
            String str = this.e;
            int iC2 = ru3.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
            String str2 = this.g;
            return Integer.hashCode(this.h) + ((iC2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LeaderboardCommentCreated(id=");
            sb.append(this.a);
            sb.append(", isRead=");
            sb.append(this.b);
            ux1.b(sb, ", sentTimeText=", this.c, ", authorName=", this.d);
            ux1.b(sb, ", authorAvatarUrl=", this.e, ", authorAvatarLetter=", this.f);
            sb.append(", text=");
            sb.append(this.g);
            sb.append(", leaderboardId=");
            sb.append(this.h);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class LeaderboardValueCommentCreated extends NotificationUiEntity {
        public final long a;
        public final boolean b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final int h;
        public final int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LeaderboardValueCommentCreated(long j, boolean z, String str, String str2, String str3, String str4, String str5, int i, int i2) {
            super(0);
            str2.getClass();
            str4.getClass();
            this.a = j;
            this.b = z;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = str5;
            this.h = i;
            this.i = i2;
        }

        @Override // com.hwpo_training_app.notifications.presentation.entity.NotificationUiEntity
        public final String a() {
            return this.e;
        }

        @Override // com.hwpo_training_app.notifications.presentation.entity.NotificationUiEntity
        public final String b() {
            return this.d;
        }

        @Override // com.hwpo_training_app.notifications.presentation.entity.NotificationUiEntity
        public final long c() {
            return this.a;
        }

        @Override // com.hwpo_training_app.notifications.presentation.entity.NotificationUiEntity
        public final String d() {
            return this.c;
        }

        @Override // com.hwpo_training_app.notifications.presentation.entity.NotificationUiEntity
        public final String e() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LeaderboardValueCommentCreated)) {
                return false;
            }
            LeaderboardValueCommentCreated leaderboardValueCommentCreated = (LeaderboardValueCommentCreated) obj;
            return this.a == leaderboardValueCommentCreated.a && this.b == leaderboardValueCommentCreated.b && xj5.a(this.c, leaderboardValueCommentCreated.c) && xj5.a(this.d, leaderboardValueCommentCreated.d) && xj5.a(this.e, leaderboardValueCommentCreated.e) && xj5.a(this.f, leaderboardValueCommentCreated.f) && xj5.a(this.g, leaderboardValueCommentCreated.g) && this.h == leaderboardValueCommentCreated.h && this.i == leaderboardValueCommentCreated.i;
        }

        @Override // com.hwpo_training_app.notifications.presentation.entity.NotificationUiEntity
        public final boolean f() {
            return this.b;
        }

        public final int hashCode() {
            int iC = ru3.c(ru3.c(uo2.a(Long.hashCode(this.a) * 31, this.b, 31), 31, this.c), 31, this.d);
            String str = this.e;
            int iC2 = ru3.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
            String str2 = this.g;
            return Integer.hashCode(this.i) + os2.a(this.h, (iC2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LeaderboardValueCommentCreated(id=");
            sb.append(this.a);
            sb.append(", isRead=");
            sb.append(this.b);
            ux1.b(sb, ", sentTimeText=", this.c, ", authorName=", this.d);
            ux1.b(sb, ", authorAvatarUrl=", this.e, ", authorAvatarLetter=", this.f);
            sb.append(", text=");
            sb.append(this.g);
            sb.append(", leaderboardId=");
            sb.append(this.h);
            sb.append(", valueId=");
            sb.append(this.i);
            sb.append(")");
            return sb.toString();
        }
    }

    public /* synthetic */ NotificationUiEntity(int i) {
        this();
    }

    public abstract String a();

    public abstract String b();

    public abstract long c();

    public abstract String d();

    public abstract String e();

    public abstract boolean f();

    private NotificationUiEntity() {
    }
}
