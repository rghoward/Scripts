package com.hwpo_training_app.leaderboards.valuedetails.data.network.response;

import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardMeasureNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardResultTypeNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardScoreSubValueNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardUserNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardUserNetworkEntity$$serializer;
import defpackage.gk4;
import defpackage.gy2;
import defpackage.h4c;
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
import defpackage.w44;
import defpackage.z97;
import io.ably.lib.util.Crypto;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.models.Participant;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@gy2
public final /* synthetic */ class LeaderboardValueDetailsNetworkEntity$$serializer implements gk4<LeaderboardValueDetailsNetworkEntity> {
    public static final LeaderboardValueDetailsNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LeaderboardValueDetailsNetworkEntity$$serializer leaderboardValueDetailsNetworkEntity$$serializer = new LeaderboardValueDetailsNetworkEntity$$serializer();
        INSTANCE = leaderboardValueDetailsNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.leaderboards.valuedetails.data.network.response.LeaderboardValueDetailsNetworkEntity", leaderboardValueDetailsNetworkEntity$$serializer, 20);
        o48Var.k("id", false);
        o48Var.k("hidden", false);
        o48Var.k("comment_count", true);
        o48Var.k("count_attachments", true);
        o48Var.k("likes_count", true);
        o48Var.k("rounds", true);
        o48Var.k("reps", true);
        o48Var.k("show_attachments", false);
        o48Var.k("show_performance", false);
        o48Var.k("adjusted", false);
        o48Var.k("value", true);
        o48Var.k("score_sub_values", true);
        o48Var.k("units", false);
        o48Var.k("symbol", false);
        o48Var.k("measure", false);
        o48Var.k(Participant.USER_TYPE, false);
        o48Var.k("result_type", false);
        o48Var.k("my_like", false);
        o48Var.k("performance_present", false);
        o48Var.k("score_score", false);
        descriptor = o48Var;
    }

    private LeaderboardValueDetailsNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        ss5<KSerializer<Object>>[] ss5VarArr = LeaderboardValueDetailsNetworkEntity.u;
        ig5 ig5Var = ig5.a;
        is0 is0Var = is0.a;
        o2a o2aVar = o2a.a;
        return new KSerializer[]{ig5Var, is0Var, ry0.a(ig5Var), ry0.a(ig5Var), ry0.a(ig5Var), ry0.a(ig5Var), ry0.a(ig5Var), is0Var, is0Var, is0Var, ry0.a(w44.a), ry0.a(ss5VarArr[11].getValue()), o2aVar, o2aVar, ss5VarArr[14].getValue(), LeaderboardUserNetworkEntity$$serializer.INSTANCE, ss5VarArr[16].getValue(), is0Var, is0Var, LeaderboardValueParentInfoNetworkEntity$$serializer.INSTANCE};
    }

    @Override // defpackage.sy2
    public final LeaderboardValueDetailsNetworkEntity deserialize(Decoder decoder) {
        int i;
        int i2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = LeaderboardValueDetailsNetworkEntity.u;
        LeaderboardResultTypeNetworkEntity leaderboardResultTypeNetworkEntity = null;
        LeaderboardUserNetworkEntity leaderboardUserNetworkEntity = null;
        LeaderboardMeasureNetworkEntity leaderboardMeasureNetworkEntity = null;
        List list = null;
        LeaderboardValueParentInfoNetworkEntity leaderboardValueParentInfoNetworkEntity = null;
        Float f = null;
        int i3 = 0;
        int iR = 0;
        boolean zA0 = false;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        boolean zA1 = false;
        boolean zA2 = false;
        boolean zA3 = false;
        String strC0 = null;
        String strC1 = null;
        boolean z = true;
        boolean zA4 = false;
        boolean zA5 = false;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            switch (iG0) {
                case -1:
                    zA0 = zA0;
                    z = false;
                    zA0 = zA0;
                    break;
                case 0:
                    zA0 = zA0;
                    i3 |= 1;
                    iR = rt1VarN.R(serialDescriptor, 0);
                    zA0 = zA0;
                    break;
                case 1:
                    iR = iR;
                    zA0 = rt1VarN.a0(serialDescriptor, 1);
                    i3 |= 2;
                    iR = iR;
                    break;
                case 2:
                    iR = iR;
                    zA0 = zA0;
                    num = (Integer) rt1VarN.L(serialDescriptor, 2, ig5.a, num);
                    i3 |= 4;
                    iR = iR;
                    zA0 = zA0;
                    break;
                case 3:
                    iR = iR;
                    zA0 = zA0;
                    num2 = (Integer) rt1VarN.L(serialDescriptor, 3, ig5.a, num2);
                    i3 |= 8;
                    iR = iR;
                    zA0 = zA0;
                    break;
                case 4:
                    iR = iR;
                    zA0 = zA0;
                    num3 = (Integer) rt1VarN.L(serialDescriptor, 4, ig5.a, num3);
                    i3 |= 16;
                    iR = iR;
                    zA0 = zA0;
                    break;
                case 5:
                    iR = iR;
                    zA0 = zA0;
                    num4 = (Integer) rt1VarN.L(serialDescriptor, 5, ig5.a, num4);
                    i3 |= 32;
                    iR = iR;
                    zA0 = zA0;
                    break;
                case 6:
                    iR = iR;
                    zA0 = zA0;
                    num5 = (Integer) rt1VarN.L(serialDescriptor, 6, ig5.a, num5);
                    i3 |= 64;
                    iR = iR;
                    zA0 = zA0;
                    break;
                case 7:
                    iR = iR;
                    zA1 = rt1VarN.a0(serialDescriptor, 7);
                    i3 |= 128;
                    iR = iR;
                    break;
                case 8:
                    iR = iR;
                    zA2 = rt1VarN.a0(serialDescriptor, 8);
                    i3 |= 256;
                    iR = iR;
                    break;
                case 9:
                    iR = iR;
                    zA3 = rt1VarN.a0(serialDescriptor, 9);
                    i3 |= 512;
                    iR = iR;
                    break;
                case 10:
                    iR = iR;
                    zA0 = zA0;
                    f = (Float) rt1VarN.L(serialDescriptor, 10, w44.a, f);
                    i3 |= 1024;
                    iR = iR;
                    zA0 = zA0;
                    break;
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    iR = iR;
                    zA0 = zA0;
                    list = (List) rt1VarN.L(serialDescriptor, 11, ss5VarArr[11].getValue(), list);
                    i3 |= AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    iR = iR;
                    zA0 = zA0;
                    break;
                case 12:
                    iR = iR;
                    strC0 = rt1VarN.c0(serialDescriptor, 12);
                    i3 |= 4096;
                    iR = iR;
                    break;
                case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    iR = iR;
                    strC1 = rt1VarN.c0(serialDescriptor, 13);
                    i3 |= 8192;
                    iR = iR;
                    break;
                case 14:
                    iR = iR;
                    zA0 = zA0;
                    leaderboardMeasureNetworkEntity = (LeaderboardMeasureNetworkEntity) rt1VarN.J(serialDescriptor, 14, ss5VarArr[14].getValue(), leaderboardMeasureNetworkEntity);
                    i3 |= 16384;
                    iR = iR;
                    zA0 = zA0;
                    break;
                case h4c.e /* 15 */:
                    leaderboardUserNetworkEntity = (LeaderboardUserNetworkEntity) rt1VarN.J(serialDescriptor, 15, LeaderboardUserNetworkEntity$$serializer.INSTANCE, leaderboardUserNetworkEntity);
                    i = 32768;
                    i3 |= i;
                    iR = iR;
                    zA0 = zA0;
                    break;
                case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                    leaderboardResultTypeNetworkEntity = (LeaderboardResultTypeNetworkEntity) rt1VarN.J(serialDescriptor, 16, ss5VarArr[16].getValue(), leaderboardResultTypeNetworkEntity);
                    i = 65536;
                    i3 |= i;
                    iR = iR;
                    zA0 = zA0;
                    break;
                case 17:
                    zA4 = rt1VarN.a0(serialDescriptor, 17);
                    i2 = 131072;
                    i3 |= i2;
                    iR = iR;
                    break;
                case 18:
                    zA5 = rt1VarN.a0(serialDescriptor, 18);
                    i2 = 262144;
                    i3 |= i2;
                    iR = iR;
                    break;
                case 19:
                    leaderboardValueParentInfoNetworkEntity = (LeaderboardValueParentInfoNetworkEntity) rt1VarN.J(serialDescriptor, 19, LeaderboardValueParentInfoNetworkEntity$$serializer.INSTANCE, leaderboardValueParentInfoNetworkEntity);
                    i = 524288;
                    i3 |= i;
                    iR = iR;
                    zA0 = zA0;
                    break;
                default:
                    ll.a(iG0);
                    return null;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new LeaderboardValueDetailsNetworkEntity(i3, iR, zA0, num, num2, num3, num4, num5, zA1, zA2, zA3, f, list, strC0, strC1, leaderboardMeasureNetworkEntity, leaderboardUserNetworkEntity, leaderboardResultTypeNetworkEntity, zA4, zA5, leaderboardValueParentInfoNetworkEntity);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, LeaderboardValueDetailsNetworkEntity leaderboardValueDetailsNetworkEntity) {
        encoder.getClass();
        leaderboardValueDetailsNetworkEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = LeaderboardValueDetailsNetworkEntity.u;
        int i = leaderboardValueDetailsNetworkEntity.a;
        List<LeaderboardScoreSubValueNetworkEntity> list = leaderboardValueDetailsNetworkEntity.l;
        Float f = leaderboardValueDetailsNetworkEntity.k;
        Integer num = leaderboardValueDetailsNetworkEntity.g;
        Integer num2 = leaderboardValueDetailsNetworkEntity.f;
        Integer num3 = leaderboardValueDetailsNetworkEntity.e;
        Integer num4 = leaderboardValueDetailsNetworkEntity.d;
        Integer num5 = leaderboardValueDetailsNetworkEntity.c;
        st1VarN.g(0, i, serialDescriptor);
        st1VarN.o(serialDescriptor, 1, leaderboardValueDetailsNetworkEntity.b);
        if (st1VarN.C(serialDescriptor) || num5 != null) {
            st1VarN.z(serialDescriptor, 2, ig5.a, num5);
        }
        if (st1VarN.C(serialDescriptor) || num4 != null) {
            st1VarN.z(serialDescriptor, 3, ig5.a, num4);
        }
        if (st1VarN.C(serialDescriptor) || num3 != null) {
            st1VarN.z(serialDescriptor, 4, ig5.a, num3);
        }
        if (st1VarN.C(serialDescriptor) || num2 != null) {
            st1VarN.z(serialDescriptor, 5, ig5.a, num2);
        }
        if (st1VarN.C(serialDescriptor) || num != null) {
            st1VarN.z(serialDescriptor, 6, ig5.a, num);
        }
        st1VarN.o(serialDescriptor, 7, leaderboardValueDetailsNetworkEntity.h);
        st1VarN.o(serialDescriptor, 8, leaderboardValueDetailsNetworkEntity.i);
        st1VarN.o(serialDescriptor, 9, leaderboardValueDetailsNetworkEntity.j);
        if (st1VarN.C(serialDescriptor) || f != null) {
            st1VarN.z(serialDescriptor, 10, w44.a, f);
        }
        if (st1VarN.C(serialDescriptor) || list != null) {
            st1VarN.z(serialDescriptor, 11, ss5VarArr[11].getValue(), list);
        }
        st1VarN.p(serialDescriptor, 12, leaderboardValueDetailsNetworkEntity.m);
        st1VarN.p(serialDescriptor, 13, leaderboardValueDetailsNetworkEntity.n);
        st1VarN.q(serialDescriptor, 14, ss5VarArr[14].getValue(), leaderboardValueDetailsNetworkEntity.o);
        st1VarN.q(serialDescriptor, 15, LeaderboardUserNetworkEntity$$serializer.INSTANCE, leaderboardValueDetailsNetworkEntity.p);
        st1VarN.q(serialDescriptor, 16, ss5VarArr[16].getValue(), leaderboardValueDetailsNetworkEntity.q);
        st1VarN.o(serialDescriptor, 17, leaderboardValueDetailsNetworkEntity.r);
        st1VarN.o(serialDescriptor, 18, leaderboardValueDetailsNetworkEntity.s);
        st1VarN.q(serialDescriptor, 19, LeaderboardValueParentInfoNetworkEntity$$serializer.INSTANCE, leaderboardValueDetailsNetworkEntity.t);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
