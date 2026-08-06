package com.hwpo_training_app.notifications.data.network.push.leaderboard;

import defpackage.gk4;
import defpackage.gy2;
import defpackage.ig5;
import defpackage.ll;
import defpackage.o48;
import defpackage.p48;
import defpackage.rt1;
import defpackage.ry0;
import defpackage.ss5;
import defpackage.st1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@gy2
public final /* synthetic */ class LeaderboardScoreCommentNotificationNetworkEntity$$serializer implements gk4<LeaderboardScoreCommentNotificationNetworkEntity> {
    public static final LeaderboardScoreCommentNotificationNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LeaderboardScoreCommentNotificationNetworkEntity$$serializer leaderboardScoreCommentNotificationNetworkEntity$$serializer = new LeaderboardScoreCommentNotificationNetworkEntity$$serializer();
        INSTANCE = leaderboardScoreCommentNotificationNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.notifications.data.network.push.leaderboard.LeaderboardScoreCommentNotificationNetworkEntity", leaderboardScoreCommentNotificationNetworkEntity$$serializer, 4);
        o48Var.k("id", false);
        o48Var.k("score_value_id", false);
        o48Var.k("score_score_id", false);
        o48Var.k("kind", false);
        descriptor = o48Var;
    }

    private LeaderboardScoreCommentNotificationNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        ss5<KSerializer<Object>>[] ss5VarArr = LeaderboardScoreCommentNotificationNetworkEntity.x;
        ig5 ig5Var = ig5.a;
        return new KSerializer[]{ig5Var, ry0.a(ig5Var), ig5Var, ss5VarArr[3].getValue()};
    }

    @Override // defpackage.sy2
    public final LeaderboardScoreCommentNotificationNetworkEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = LeaderboardScoreCommentNotificationNetworkEntity.x;
        boolean z = true;
        int i = 0;
        int iR = 0;
        int iR2 = 0;
        Integer num = null;
        LeaderboardKindNetworkEntity leaderboardKindNetworkEntity = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            if (iG0 == -1) {
                z = false;
            } else if (iG0 == 0) {
                iR = rt1VarN.R(serialDescriptor, 0);
                i |= 1;
            } else if (iG0 == 1) {
                num = (Integer) rt1VarN.L(serialDescriptor, 1, ig5.a, num);
                i |= 2;
            } else if (iG0 == 2) {
                iR2 = rt1VarN.R(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iG0 != 3) {
                    ll.a(iG0);
                    return null;
                }
                leaderboardKindNetworkEntity = (LeaderboardKindNetworkEntity) rt1VarN.J(serialDescriptor, 3, ss5VarArr[3].getValue(), leaderboardKindNetworkEntity);
                i |= 8;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new LeaderboardScoreCommentNotificationNetworkEntity(i, iR, num, iR2, leaderboardKindNetworkEntity);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, LeaderboardScoreCommentNotificationNetworkEntity leaderboardScoreCommentNotificationNetworkEntity) {
        encoder.getClass();
        leaderboardScoreCommentNotificationNetworkEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = LeaderboardScoreCommentNotificationNetworkEntity.x;
        st1VarN.g(0, leaderboardScoreCommentNotificationNetworkEntity.t, serialDescriptor);
        st1VarN.z(serialDescriptor, 1, ig5.a, leaderboardScoreCommentNotificationNetworkEntity.u);
        st1VarN.g(2, leaderboardScoreCommentNotificationNetworkEntity.v, serialDescriptor);
        st1VarN.q(serialDescriptor, 3, ss5VarArr[3].getValue(), leaderboardScoreCommentNotificationNetworkEntity.w);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
