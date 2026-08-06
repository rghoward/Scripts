package com.hwpo_training_app.notifications.data.network.push;

import com.hwpo_training_app.core.data.model.schedule.PlanNetworkEntity;
import com.hwpo_training_app.core.data.model.schedule.PlanNetworkEntity$$serializer;
import com.hwpo_training_app.core.data.model.user.OpponentNetworkEntity;
import com.hwpo_training_app.core.data.model.user.OpponentNetworkEntity$$serializer;
import com.hwpo_training_app.notifications.data.network.push.leaderboard.LeaderboardScoreCommentNotificationNetworkEntity;
import com.hwpo_training_app.notifications.data.network.push.leaderboard.LeaderboardScoreCommentNotificationNetworkEntity$$serializer;
import defpackage.gk4;
import defpackage.gy2;
import defpackage.ig5;
import defpackage.is0;
import defpackage.ll;
import defpackage.o2a;
import defpackage.o48;
import defpackage.p48;
import defpackage.rt1;
import defpackage.ry0;
import defpackage.ss5;
import defpackage.st1;
import defpackage.ue6;
import defpackage.z97;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.Participant;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@gy2
public final /* synthetic */ class NotificationNetworkEntity$LeaderboardCommentMentionedNotificationNetworkEntity$$serializer implements gk4<NotificationNetworkEntity.LeaderboardCommentMentionedNotificationNetworkEntity> {
    public static final NotificationNetworkEntity$LeaderboardCommentMentionedNotificationNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        NotificationNetworkEntity$LeaderboardCommentMentionedNotificationNetworkEntity$$serializer notificationNetworkEntity$LeaderboardCommentMentionedNotificationNetworkEntity$$serializer = new NotificationNetworkEntity$LeaderboardCommentMentionedNotificationNetworkEntity$$serializer();
        INSTANCE = notificationNetworkEntity$LeaderboardCommentMentionedNotificationNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.notifications.data.network.push.NotificationNetworkEntity.LeaderboardCommentMentionedNotificationNetworkEntity", notificationNetworkEntity$LeaderboardCommentMentionedNotificationNetworkEntity$$serializer, 12);
        o48Var.k("id", false);
        o48Var.k("notification_type", false);
        o48Var.k("created_at", false);
        o48Var.k("title", false);
        o48Var.k(AttributeType.TEXT, false);
        o48Var.k("user_type", false);
        o48Var.k("activity_type", false);
        o48Var.k(Participant.USER_TYPE, false);
        o48Var.k("read", false);
        o48Var.k("schedule_id", true);
        o48Var.k("plan", true);
        o48Var.k("score_comment", false);
        descriptor = o48Var;
    }

    private NotificationNetworkEntity$LeaderboardCommentMentionedNotificationNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        ss5<KSerializer<Object>>[] ss5VarArr = NotificationNetworkEntity.LeaderboardCommentMentionedNotificationNetworkEntity.F;
        ue6 ue6Var = ue6.a;
        o2a o2aVar = o2a.a;
        return new KSerializer[]{ue6Var, ss5VarArr[1].getValue(), ue6Var, ry0.a(o2aVar), ry0.a(o2aVar), ry0.a(o2aVar), ry0.a(o2aVar), OpponentNetworkEntity$$serializer.INSTANCE, is0.a, ry0.a(ig5.a), ry0.a(PlanNetworkEntity$$serializer.INSTANCE), LeaderboardScoreCommentNotificationNetworkEntity$$serializer.INSTANCE};
    }

    @Override // defpackage.sy2
    public final NotificationNetworkEntity.LeaderboardCommentMentionedNotificationNetworkEntity deserialize(Decoder decoder) {
        long jG;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = NotificationNetworkEntity.LeaderboardCommentMentionedNotificationNetworkEntity.F;
        long j = 0;
        long jG2 = 0;
        PlanNetworkEntity planNetworkEntity = null;
        Integer num = null;
        OpponentNetworkEntity opponentNetworkEntity = null;
        LeaderboardScoreCommentNotificationNetworkEntity leaderboardScoreCommentNotificationNetworkEntity = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        NotificationTypeNetworkEntity notificationTypeNetworkEntity = null;
        String str4 = null;
        boolean z = true;
        boolean zA0 = false;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            switch (iG0) {
                case -1:
                    jG = j;
                    z = false;
                    break;
                case 0:
                    jG = rt1VarN.G(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    jG = j;
                    notificationTypeNetworkEntity = (NotificationTypeNetworkEntity) rt1VarN.J(serialDescriptor, 1, ss5VarArr[1].getValue(), notificationTypeNetworkEntity);
                    i |= 2;
                    break;
                case 2:
                    jG = j;
                    jG2 = rt1VarN.G(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    jG = j;
                    str4 = (String) rt1VarN.L(serialDescriptor, 3, o2a.a, str4);
                    i |= 8;
                    break;
                case 4:
                    jG = j;
                    str = (String) rt1VarN.L(serialDescriptor, 4, o2a.a, str);
                    i |= 16;
                    break;
                case 5:
                    jG = j;
                    str3 = (String) rt1VarN.L(serialDescriptor, 5, o2a.a, str3);
                    i |= 32;
                    break;
                case 6:
                    jG = j;
                    str2 = (String) rt1VarN.L(serialDescriptor, 6, o2a.a, str2);
                    i |= 64;
                    break;
                case 7:
                    jG = j;
                    opponentNetworkEntity = (OpponentNetworkEntity) rt1VarN.J(serialDescriptor, 7, OpponentNetworkEntity$$serializer.INSTANCE, opponentNetworkEntity);
                    i |= 128;
                    break;
                case 8:
                    jG = j;
                    zA0 = rt1VarN.a0(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    jG = j;
                    num = (Integer) rt1VarN.L(serialDescriptor, 9, ig5.a, num);
                    i |= 512;
                    break;
                case 10:
                    jG = j;
                    planNetworkEntity = (PlanNetworkEntity) rt1VarN.L(serialDescriptor, 10, PlanNetworkEntity$$serializer.INSTANCE, planNetworkEntity);
                    i |= 1024;
                    break;
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    jG = j;
                    leaderboardScoreCommentNotificationNetworkEntity = (LeaderboardScoreCommentNotificationNetworkEntity) rt1VarN.J(serialDescriptor, 11, LeaderboardScoreCommentNotificationNetworkEntity$$serializer.INSTANCE, leaderboardScoreCommentNotificationNetworkEntity);
                    i |= AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    break;
                default:
                    ll.a(iG0);
                    return null;
            }
            j = jG;
        }
        rt1VarN.i(serialDescriptor);
        return new NotificationNetworkEntity.LeaderboardCommentMentionedNotificationNetworkEntity(i, j, notificationTypeNetworkEntity, jG2, str4, str, str3, str2, opponentNetworkEntity, zA0, num, planNetworkEntity, leaderboardScoreCommentNotificationNetworkEntity);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, NotificationNetworkEntity.LeaderboardCommentMentionedNotificationNetworkEntity leaderboardCommentMentionedNotificationNetworkEntity) {
        encoder.getClass();
        leaderboardCommentMentionedNotificationNetworkEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = NotificationNetworkEntity.LeaderboardCommentMentionedNotificationNetworkEntity.F;
        long j = leaderboardCommentMentionedNotificationNetworkEntity.t;
        PlanNetworkEntity planNetworkEntity = leaderboardCommentMentionedNotificationNetworkEntity.D;
        Integer num = leaderboardCommentMentionedNotificationNetworkEntity.C;
        st1VarN.B(serialDescriptor, 0, j);
        st1VarN.q(serialDescriptor, 1, ss5VarArr[1].getValue(), leaderboardCommentMentionedNotificationNetworkEntity.u);
        st1VarN.B(serialDescriptor, 2, leaderboardCommentMentionedNotificationNetworkEntity.v);
        o2a o2aVar = o2a.a;
        st1VarN.z(serialDescriptor, 3, o2aVar, leaderboardCommentMentionedNotificationNetworkEntity.w);
        st1VarN.z(serialDescriptor, 4, o2aVar, leaderboardCommentMentionedNotificationNetworkEntity.x);
        st1VarN.z(serialDescriptor, 5, o2aVar, leaderboardCommentMentionedNotificationNetworkEntity.y);
        st1VarN.z(serialDescriptor, 6, o2aVar, leaderboardCommentMentionedNotificationNetworkEntity.z);
        st1VarN.q(serialDescriptor, 7, OpponentNetworkEntity$$serializer.INSTANCE, leaderboardCommentMentionedNotificationNetworkEntity.A);
        st1VarN.o(serialDescriptor, 8, leaderboardCommentMentionedNotificationNetworkEntity.B);
        if (st1VarN.C(serialDescriptor) || num != null) {
            st1VarN.z(serialDescriptor, 9, ig5.a, num);
        }
        if (st1VarN.C(serialDescriptor) || planNetworkEntity != null) {
            st1VarN.z(serialDescriptor, 10, PlanNetworkEntity$$serializer.INSTANCE, planNetworkEntity);
        }
        st1VarN.q(serialDescriptor, 11, LeaderboardScoreCommentNotificationNetworkEntity$$serializer.INSTANCE, leaderboardCommentMentionedNotificationNetworkEntity.E);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
