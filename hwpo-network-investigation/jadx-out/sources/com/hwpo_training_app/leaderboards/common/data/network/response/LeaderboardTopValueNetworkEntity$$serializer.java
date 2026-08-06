package com.hwpo_training_app.leaderboards.common.data.network.response;

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
public final /* synthetic */ class LeaderboardTopValueNetworkEntity$$serializer implements gk4<LeaderboardTopValueNetworkEntity> {
    public static final LeaderboardTopValueNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LeaderboardTopValueNetworkEntity$$serializer leaderboardTopValueNetworkEntity$$serializer = new LeaderboardTopValueNetworkEntity$$serializer();
        INSTANCE = leaderboardTopValueNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardTopValueNetworkEntity", leaderboardTopValueNetworkEntity$$serializer, 20);
        o48Var.k("id", false);
        o48Var.k("place", false);
        o48Var.k("hidden", false);
        o48Var.k("comment_count", true);
        o48Var.k("count_attachments", true);
        o48Var.k("likes_count", true);
        o48Var.k("rounds", true);
        o48Var.k("reps", true);
        o48Var.k("show_attachments", false);
        o48Var.k("show_performance", false);
        o48Var.k("adjusted", false);
        o48Var.k("value", false);
        o48Var.k("score_sub_values", true);
        o48Var.k("units", false);
        o48Var.k("symbol", false);
        o48Var.k("measure", false);
        o48Var.k(Participant.USER_TYPE, false);
        o48Var.k("result_type", false);
        o48Var.k("my_like", false);
        o48Var.k("performance_present", false);
        descriptor = o48Var;
    }

    private LeaderboardTopValueNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        ss5<KSerializer<Object>>[] ss5VarArr = LeaderboardTopValueNetworkEntity.u;
        ig5 ig5Var = ig5.a;
        is0 is0Var = is0.a;
        o2a o2aVar = o2a.a;
        return new KSerializer[]{ig5Var, ig5Var, is0Var, ry0.a(ig5Var), ry0.a(ig5Var), ry0.a(ig5Var), ry0.a(ig5Var), ry0.a(ig5Var), is0Var, is0Var, is0Var, w44.a, ry0.a(ss5VarArr[12].getValue()), o2aVar, o2aVar, ss5VarArr[15].getValue(), LeaderboardUserNetworkEntity$$serializer.INSTANCE, ss5VarArr[17].getValue(), is0Var, is0Var};
    }

    @Override // defpackage.sy2
    public final LeaderboardTopValueNetworkEntity deserialize(Decoder decoder) {
        int i;
        int i2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = LeaderboardTopValueNetworkEntity.u;
        float fW0 = 0.0f;
        LeaderboardResultTypeNetworkEntity leaderboardResultTypeNetworkEntity = null;
        LeaderboardUserNetworkEntity leaderboardUserNetworkEntity = null;
        LeaderboardMeasureNetworkEntity leaderboardMeasureNetworkEntity = null;
        List list = null;
        boolean z = true;
        Integer num = null;
        int i3 = 0;
        int iR = 0;
        int iR2 = 0;
        boolean zA0 = false;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        boolean zA1 = false;
        boolean zA2 = false;
        boolean zA3 = false;
        String strC0 = null;
        String strC1 = null;
        boolean zA4 = false;
        boolean zA5 = false;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            switch (iG0) {
                case -1:
                    iR = iR;
                    z = false;
                    iR = iR;
                    break;
                case 0:
                    z = z;
                    i3 |= 1;
                    iR = rt1VarN.R(serialDescriptor, 0);
                    z = z;
                    break;
                case 1:
                    z = z;
                    iR2 = rt1VarN.R(serialDescriptor, 1);
                    i3 |= 2;
                    z = z;
                    break;
                case 2:
                    z = z;
                    zA0 = rt1VarN.a0(serialDescriptor, 2);
                    i3 |= 4;
                    z = z;
                    break;
                case 3:
                    z = z;
                    iR = iR;
                    num2 = (Integer) rt1VarN.L(serialDescriptor, 3, ig5.a, num2);
                    i3 |= 8;
                    z = z;
                    iR = iR;
                    break;
                case 4:
                    z = z;
                    iR = iR;
                    num3 = (Integer) rt1VarN.L(serialDescriptor, 4, ig5.a, num3);
                    i3 |= 16;
                    z = z;
                    iR = iR;
                    break;
                case 5:
                    z = z;
                    iR = iR;
                    num4 = (Integer) rt1VarN.L(serialDescriptor, 5, ig5.a, num4);
                    i3 |= 32;
                    z = z;
                    iR = iR;
                    break;
                case 6:
                    z = z;
                    iR = iR;
                    num5 = (Integer) rt1VarN.L(serialDescriptor, 6, ig5.a, num5);
                    i3 |= 64;
                    z = z;
                    iR = iR;
                    break;
                case 7:
                    z = z;
                    iR = iR;
                    num = (Integer) rt1VarN.L(serialDescriptor, 7, ig5.a, num);
                    i3 |= 128;
                    z = z;
                    iR = iR;
                    break;
                case 8:
                    z = z;
                    zA1 = rt1VarN.a0(serialDescriptor, 8);
                    i3 |= 256;
                    z = z;
                    break;
                case 9:
                    z = z;
                    zA2 = rt1VarN.a0(serialDescriptor, 9);
                    i3 |= 512;
                    z = z;
                    break;
                case 10:
                    z = z;
                    zA3 = rt1VarN.a0(serialDescriptor, 10);
                    i3 |= 1024;
                    z = z;
                    break;
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    z = z;
                    fW0 = rt1VarN.w0(serialDescriptor, 11);
                    i3 |= AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    z = z;
                    break;
                case 12:
                    z = z;
                    iR = iR;
                    list = (List) rt1VarN.L(serialDescriptor, 12, ss5VarArr[12].getValue(), list);
                    i3 |= 4096;
                    z = z;
                    iR = iR;
                    break;
                case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    z = z;
                    strC0 = rt1VarN.c0(serialDescriptor, 13);
                    i3 |= 8192;
                    z = z;
                    break;
                case 14:
                    z = z;
                    strC1 = rt1VarN.c0(serialDescriptor, 14);
                    i3 |= 16384;
                    z = z;
                    break;
                case h4c.e /* 15 */:
                    leaderboardMeasureNetworkEntity = (LeaderboardMeasureNetworkEntity) rt1VarN.J(serialDescriptor, 15, ss5VarArr[15].getValue(), leaderboardMeasureNetworkEntity);
                    i2 = 32768;
                    i3 |= i2;
                    z = z;
                    iR = iR;
                    break;
                case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                    leaderboardUserNetworkEntity = (LeaderboardUserNetworkEntity) rt1VarN.J(serialDescriptor, 16, LeaderboardUserNetworkEntity$$serializer.INSTANCE, leaderboardUserNetworkEntity);
                    i2 = 65536;
                    i3 |= i2;
                    z = z;
                    iR = iR;
                    break;
                case 17:
                    leaderboardResultTypeNetworkEntity = (LeaderboardResultTypeNetworkEntity) rt1VarN.J(serialDescriptor, 17, ss5VarArr[17].getValue(), leaderboardResultTypeNetworkEntity);
                    i2 = 131072;
                    i3 |= i2;
                    z = z;
                    iR = iR;
                    break;
                case 18:
                    zA4 = rt1VarN.a0(serialDescriptor, 18);
                    i = 262144;
                    i3 |= i;
                    z = z;
                    break;
                case 19:
                    zA5 = rt1VarN.a0(serialDescriptor, 19);
                    i = 524288;
                    i3 |= i;
                    z = z;
                    break;
                default:
                    ll.a(iG0);
                    return null;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new LeaderboardTopValueNetworkEntity(i3, iR, iR2, zA0, num2, num3, num4, num5, num, zA1, zA2, zA3, fW0, list, strC0, strC1, leaderboardMeasureNetworkEntity, leaderboardUserNetworkEntity, leaderboardResultTypeNetworkEntity, zA4, zA5);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, LeaderboardTopValueNetworkEntity leaderboardTopValueNetworkEntity) {
        encoder.getClass();
        leaderboardTopValueNetworkEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = LeaderboardTopValueNetworkEntity.u;
        int i = leaderboardTopValueNetworkEntity.a;
        List<LeaderboardScoreSubValueNetworkEntity> list = leaderboardTopValueNetworkEntity.m;
        Integer num = leaderboardTopValueNetworkEntity.h;
        Integer num2 = leaderboardTopValueNetworkEntity.g;
        Integer num3 = leaderboardTopValueNetworkEntity.f;
        Integer num4 = leaderboardTopValueNetworkEntity.e;
        Integer num5 = leaderboardTopValueNetworkEntity.d;
        st1VarN.g(0, i, serialDescriptor);
        st1VarN.g(1, leaderboardTopValueNetworkEntity.b, serialDescriptor);
        st1VarN.o(serialDescriptor, 2, leaderboardTopValueNetworkEntity.c);
        if (st1VarN.C(serialDescriptor) || num5 != null) {
            st1VarN.z(serialDescriptor, 3, ig5.a, num5);
        }
        if (st1VarN.C(serialDescriptor) || num4 != null) {
            st1VarN.z(serialDescriptor, 4, ig5.a, num4);
        }
        if (st1VarN.C(serialDescriptor) || num3 != null) {
            st1VarN.z(serialDescriptor, 5, ig5.a, num3);
        }
        if (st1VarN.C(serialDescriptor) || num2 != null) {
            st1VarN.z(serialDescriptor, 6, ig5.a, num2);
        }
        if (st1VarN.C(serialDescriptor) || num != null) {
            st1VarN.z(serialDescriptor, 7, ig5.a, num);
        }
        st1VarN.o(serialDescriptor, 8, leaderboardTopValueNetworkEntity.i);
        st1VarN.o(serialDescriptor, 9, leaderboardTopValueNetworkEntity.j);
        st1VarN.o(serialDescriptor, 10, leaderboardTopValueNetworkEntity.k);
        st1VarN.f(serialDescriptor, 11, leaderboardTopValueNetworkEntity.l);
        if (st1VarN.C(serialDescriptor) || list != null) {
            st1VarN.z(serialDescriptor, 12, ss5VarArr[12].getValue(), list);
        }
        st1VarN.p(serialDescriptor, 13, leaderboardTopValueNetworkEntity.n);
        st1VarN.p(serialDescriptor, 14, leaderboardTopValueNetworkEntity.o);
        st1VarN.q(serialDescriptor, 15, ss5VarArr[15].getValue(), leaderboardTopValueNetworkEntity.p);
        st1VarN.q(serialDescriptor, 16, LeaderboardUserNetworkEntity$$serializer.INSTANCE, leaderboardTopValueNetworkEntity.q);
        st1VarN.q(serialDescriptor, 17, ss5VarArr[17].getValue(), leaderboardTopValueNetworkEntity.r);
        st1VarN.o(serialDescriptor, 18, leaderboardTopValueNetworkEntity.s);
        st1VarN.o(serialDescriptor, 19, leaderboardTopValueNetworkEntity.t);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
