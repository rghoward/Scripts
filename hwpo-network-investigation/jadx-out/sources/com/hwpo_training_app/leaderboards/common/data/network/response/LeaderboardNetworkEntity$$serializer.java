package com.hwpo_training_app.leaderboards.common.data.network.response;

import com.hwpo_training_app.core.data.model.schedule.BenchmarkMeasureTypeNetworkEntity;
import com.hwpo_training_app.core.data.model.schedule.UnitsNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.request.LeaderboardKindNetworkEntity;
import defpackage.gk4;
import defpackage.gy2;
import defpackage.h4c;
import defpackage.ig5;
import defpackage.ll;
import defpackage.n2b;
import defpackage.o2a;
import defpackage.o48;
import defpackage.p48;
import defpackage.rt1;
import defpackage.ry0;
import defpackage.ss5;
import defpackage.st1;
import defpackage.ue6;
import defpackage.z97;
import io.ably.lib.util.Crypto;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@gy2
public final /* synthetic */ class LeaderboardNetworkEntity$$serializer implements gk4<LeaderboardNetworkEntity> {
    public static final LeaderboardNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LeaderboardNetworkEntity$$serializer leaderboardNetworkEntity$$serializer = new LeaderboardNetworkEntity$$serializer();
        INSTANCE = leaderboardNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardNetworkEntity", leaderboardNetworkEntity$$serializer, 18);
        o48Var.k("id", false);
        o48Var.k("title", true);
        o48Var.k("description", true);
        o48Var.k("kind", false);
        o48Var.k("measure", false);
        o48Var.k("rounds", true);
        o48Var.k("reps", true);
        o48Var.k("count_sub_value", true);
        o48Var.k("plan", true);
        o48Var.k("section", true);
        o48Var.k("tags", true);
        o48Var.k("comments_count", true);
        o48Var.k("schedule", true);
        o48Var.k("units", false);
        o48Var.k("symbol", false);
        o48Var.k("objective", true);
        o48Var.k("updated_at", true);
        o48Var.k("top_values", true);
        descriptor = o48Var;
    }

    private LeaderboardNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        ss5<KSerializer<Object>>[] ss5VarArr = LeaderboardNetworkEntity.s;
        ig5 ig5Var = ig5.a;
        o2a o2aVar = o2a.a;
        return new KSerializer[]{ig5Var, ry0.a(o2aVar), ry0.a(o2aVar), ss5VarArr[3].getValue(), ss5VarArr[4].getValue(), ry0.a(ig5Var), ry0.a(ig5Var), ry0.a(ig5Var), ry0.a(LeaderboardPlanNetworkEntity$$serializer.INSTANCE), ry0.a(LeaderboardSectionNetworkEntity$$serializer.INSTANCE), ry0.a(ss5VarArr[10].getValue()), ry0.a(ig5Var), ry0.a(LeaderboardScheduleNetworkEntity$$serializer.INSTANCE), n2b.a, o2aVar, ry0.a(o2aVar), ry0.a(ue6.a), ry0.a(ss5VarArr[17].getValue())};
    }

    @Override // defpackage.sy2
    public final LeaderboardNetworkEntity deserialize(Decoder decoder) {
        BenchmarkMeasureTypeNetworkEntity benchmarkMeasureTypeNetworkEntity;
        int i;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = LeaderboardNetworkEntity.s;
        Integer num = null;
        List list = null;
        LeaderboardSectionNetworkEntity leaderboardSectionNetworkEntity = null;
        LeaderboardPlanNetworkEntity leaderboardPlanNetworkEntity = null;
        LeaderboardScheduleNetworkEntity leaderboardScheduleNetworkEntity = null;
        Integer num2 = null;
        int i2 = 0;
        UnitsNetworkEntity unitsNetworkEntity = null;
        String str = null;
        Long l = null;
        List list2 = null;
        BenchmarkMeasureTypeNetworkEntity benchmarkMeasureTypeNetworkEntity2 = null;
        Integer num3 = null;
        Integer num4 = null;
        boolean z = true;
        int iR = 0;
        String str2 = null;
        String str3 = null;
        LeaderboardKindNetworkEntity leaderboardKindNetworkEntity = null;
        String strC0 = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            switch (iG0) {
                case -1:
                    benchmarkMeasureTypeNetworkEntity = benchmarkMeasureTypeNetworkEntity2;
                    z = false;
                    benchmarkMeasureTypeNetworkEntity2 = benchmarkMeasureTypeNetworkEntity;
                    num = num;
                    num3 = num3;
                    break;
                case 0:
                    benchmarkMeasureTypeNetworkEntity = benchmarkMeasureTypeNetworkEntity2;
                    iR = rt1VarN.R(serialDescriptor, 0);
                    i2 |= 1;
                    benchmarkMeasureTypeNetworkEntity2 = benchmarkMeasureTypeNetworkEntity;
                    num = num;
                    num3 = num3;
                    break;
                case 1:
                    benchmarkMeasureTypeNetworkEntity = benchmarkMeasureTypeNetworkEntity2;
                    str2 = (String) rt1VarN.L(serialDescriptor, 1, o2a.a, str2);
                    i2 |= 2;
                    str3 = str3;
                    benchmarkMeasureTypeNetworkEntity2 = benchmarkMeasureTypeNetworkEntity;
                    num = num;
                    num3 = num3;
                    break;
                case 2:
                    benchmarkMeasureTypeNetworkEntity = benchmarkMeasureTypeNetworkEntity2;
                    str3 = (String) rt1VarN.L(serialDescriptor, 2, o2a.a, str3);
                    i2 |= 4;
                    benchmarkMeasureTypeNetworkEntity2 = benchmarkMeasureTypeNetworkEntity;
                    num = num;
                    num3 = num3;
                    break;
                case 3:
                    benchmarkMeasureTypeNetworkEntity = benchmarkMeasureTypeNetworkEntity2;
                    leaderboardKindNetworkEntity = (LeaderboardKindNetworkEntity) rt1VarN.J(serialDescriptor, 3, ss5VarArr[3].getValue(), leaderboardKindNetworkEntity);
                    i2 |= 8;
                    benchmarkMeasureTypeNetworkEntity2 = benchmarkMeasureTypeNetworkEntity;
                    num = num;
                    num3 = num3;
                    break;
                case 4:
                    num = num;
                    num3 = num3;
                    benchmarkMeasureTypeNetworkEntity2 = (BenchmarkMeasureTypeNetworkEntity) rt1VarN.J(serialDescriptor, 4, ss5VarArr[4].getValue(), benchmarkMeasureTypeNetworkEntity2);
                    i2 |= 16;
                    num = num;
                    num3 = num3;
                    break;
                case 5:
                    num3 = (Integer) rt1VarN.L(serialDescriptor, 5, ig5.a, num3);
                    i2 |= 32;
                    benchmarkMeasureTypeNetworkEntity2 = benchmarkMeasureTypeNetworkEntity2;
                    num = num;
                    break;
                case 6:
                    benchmarkMeasureTypeNetworkEntity2 = benchmarkMeasureTypeNetworkEntity2;
                    num3 = num3;
                    num4 = (Integer) rt1VarN.L(serialDescriptor, 6, ig5.a, num4);
                    i2 |= 64;
                    benchmarkMeasureTypeNetworkEntity2 = benchmarkMeasureTypeNetworkEntity2;
                    num3 = num3;
                    break;
                case 7:
                    benchmarkMeasureTypeNetworkEntity2 = benchmarkMeasureTypeNetworkEntity2;
                    num3 = num3;
                    num2 = (Integer) rt1VarN.L(serialDescriptor, 7, ig5.a, num2);
                    i2 |= 128;
                    benchmarkMeasureTypeNetworkEntity2 = benchmarkMeasureTypeNetworkEntity2;
                    num3 = num3;
                    break;
                case 8:
                    benchmarkMeasureTypeNetworkEntity2 = benchmarkMeasureTypeNetworkEntity2;
                    num3 = num3;
                    leaderboardPlanNetworkEntity = (LeaderboardPlanNetworkEntity) rt1VarN.L(serialDescriptor, 8, LeaderboardPlanNetworkEntity$$serializer.INSTANCE, leaderboardPlanNetworkEntity);
                    i2 |= 256;
                    benchmarkMeasureTypeNetworkEntity2 = benchmarkMeasureTypeNetworkEntity2;
                    num3 = num3;
                    break;
                case 9:
                    benchmarkMeasureTypeNetworkEntity2 = benchmarkMeasureTypeNetworkEntity2;
                    num3 = num3;
                    leaderboardSectionNetworkEntity = (LeaderboardSectionNetworkEntity) rt1VarN.L(serialDescriptor, 9, LeaderboardSectionNetworkEntity$$serializer.INSTANCE, leaderboardSectionNetworkEntity);
                    i2 |= 512;
                    benchmarkMeasureTypeNetworkEntity2 = benchmarkMeasureTypeNetworkEntity2;
                    num3 = num3;
                    break;
                case 10:
                    benchmarkMeasureTypeNetworkEntity2 = benchmarkMeasureTypeNetworkEntity2;
                    num3 = num3;
                    list = (List) rt1VarN.L(serialDescriptor, 10, ss5VarArr[10].getValue(), list);
                    i2 |= 1024;
                    benchmarkMeasureTypeNetworkEntity2 = benchmarkMeasureTypeNetworkEntity2;
                    num3 = num3;
                    break;
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    benchmarkMeasureTypeNetworkEntity2 = benchmarkMeasureTypeNetworkEntity2;
                    num3 = num3;
                    num = (Integer) rt1VarN.L(serialDescriptor, 11, ig5.a, num);
                    i2 |= AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    benchmarkMeasureTypeNetworkEntity2 = benchmarkMeasureTypeNetworkEntity2;
                    num3 = num3;
                    break;
                case 12:
                    benchmarkMeasureTypeNetworkEntity2 = benchmarkMeasureTypeNetworkEntity2;
                    num3 = num3;
                    leaderboardScheduleNetworkEntity = (LeaderboardScheduleNetworkEntity) rt1VarN.L(serialDescriptor, 12, LeaderboardScheduleNetworkEntity$$serializer.INSTANCE, leaderboardScheduleNetworkEntity);
                    i2 |= 4096;
                    benchmarkMeasureTypeNetworkEntity2 = benchmarkMeasureTypeNetworkEntity2;
                    num3 = num3;
                    break;
                case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    benchmarkMeasureTypeNetworkEntity2 = benchmarkMeasureTypeNetworkEntity2;
                    num3 = num3;
                    unitsNetworkEntity = (UnitsNetworkEntity) rt1VarN.J(serialDescriptor, 13, n2b.a, unitsNetworkEntity);
                    i2 |= 8192;
                    benchmarkMeasureTypeNetworkEntity2 = benchmarkMeasureTypeNetworkEntity2;
                    num3 = num3;
                    break;
                case 14:
                    strC0 = rt1VarN.c0(serialDescriptor, 14);
                    i2 |= 16384;
                    benchmarkMeasureTypeNetworkEntity2 = benchmarkMeasureTypeNetworkEntity2;
                    break;
                case h4c.e /* 15 */:
                    str = (String) rt1VarN.L(serialDescriptor, 15, o2a.a, str);
                    i = 32768;
                    i2 |= i;
                    benchmarkMeasureTypeNetworkEntity2 = benchmarkMeasureTypeNetworkEntity2;
                    num3 = num3;
                    break;
                case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                    l = (Long) rt1VarN.L(serialDescriptor, 16, ue6.a, l);
                    i = 65536;
                    i2 |= i;
                    benchmarkMeasureTypeNetworkEntity2 = benchmarkMeasureTypeNetworkEntity2;
                    num3 = num3;
                    break;
                case 17:
                    list2 = (List) rt1VarN.L(serialDescriptor, 17, ss5VarArr[17].getValue(), list2);
                    i = 131072;
                    i2 |= i;
                    benchmarkMeasureTypeNetworkEntity2 = benchmarkMeasureTypeNetworkEntity2;
                    num3 = num3;
                    break;
                default:
                    ll.a(iG0);
                    return null;
            }
        }
        Integer num5 = num3;
        String str4 = str2;
        String str5 = str3;
        rt1VarN.i(serialDescriptor);
        List list3 = list2;
        return new LeaderboardNetworkEntity(i2, iR, str4, str5, leaderboardKindNetworkEntity, benchmarkMeasureTypeNetworkEntity2, num5, num4, num2, leaderboardPlanNetworkEntity, leaderboardSectionNetworkEntity, list, num, leaderboardScheduleNetworkEntity, unitsNetworkEntity, strC0, str, l, list3);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, LeaderboardNetworkEntity leaderboardNetworkEntity) {
        encoder.getClass();
        leaderboardNetworkEntity.getClass();
        List<LeaderboardTopValueNetworkEntity> list = leaderboardNetworkEntity.r;
        Long l = leaderboardNetworkEntity.q;
        String str = leaderboardNetworkEntity.p;
        LeaderboardScheduleNetworkEntity leaderboardScheduleNetworkEntity = leaderboardNetworkEntity.m;
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = LeaderboardNetworkEntity.s;
        int i = leaderboardNetworkEntity.a;
        Integer num = leaderboardNetworkEntity.l;
        List<String> list2 = leaderboardNetworkEntity.k;
        LeaderboardSectionNetworkEntity leaderboardSectionNetworkEntity = leaderboardNetworkEntity.j;
        LeaderboardPlanNetworkEntity leaderboardPlanNetworkEntity = leaderboardNetworkEntity.i;
        Integer num2 = leaderboardNetworkEntity.h;
        Integer num3 = leaderboardNetworkEntity.g;
        Integer num4 = leaderboardNetworkEntity.f;
        String str2 = leaderboardNetworkEntity.c;
        String str3 = leaderboardNetworkEntity.b;
        st1VarN.g(0, i, serialDescriptor);
        if (st1VarN.C(serialDescriptor) || str3 != null) {
            st1VarN.z(serialDescriptor, 1, o2a.a, str3);
        }
        if (st1VarN.C(serialDescriptor) || str2 != null) {
            st1VarN.z(serialDescriptor, 2, o2a.a, str2);
        }
        st1VarN.q(serialDescriptor, 3, ss5VarArr[3].getValue(), leaderboardNetworkEntity.d);
        st1VarN.q(serialDescriptor, 4, ss5VarArr[4].getValue(), leaderboardNetworkEntity.e);
        if (st1VarN.C(serialDescriptor) || num4 != null) {
            st1VarN.z(serialDescriptor, 5, ig5.a, num4);
        }
        if (st1VarN.C(serialDescriptor) || num3 != null) {
            st1VarN.z(serialDescriptor, 6, ig5.a, num3);
        }
        if (st1VarN.C(serialDescriptor) || num2 != null) {
            st1VarN.z(serialDescriptor, 7, ig5.a, num2);
        }
        if (st1VarN.C(serialDescriptor) || leaderboardPlanNetworkEntity != null) {
            st1VarN.z(serialDescriptor, 8, LeaderboardPlanNetworkEntity$$serializer.INSTANCE, leaderboardPlanNetworkEntity);
        }
        if (st1VarN.C(serialDescriptor) || leaderboardSectionNetworkEntity != null) {
            st1VarN.z(serialDescriptor, 9, LeaderboardSectionNetworkEntity$$serializer.INSTANCE, leaderboardSectionNetworkEntity);
        }
        if (st1VarN.C(serialDescriptor) || list2 != null) {
            st1VarN.z(serialDescriptor, 10, ss5VarArr[10].getValue(), list2);
        }
        if (st1VarN.C(serialDescriptor) || num != null) {
            st1VarN.z(serialDescriptor, 11, ig5.a, num);
        }
        if (st1VarN.C(serialDescriptor) || leaderboardScheduleNetworkEntity != null) {
            st1VarN.z(serialDescriptor, 12, LeaderboardScheduleNetworkEntity$$serializer.INSTANCE, leaderboardScheduleNetworkEntity);
        }
        st1VarN.q(serialDescriptor, 13, n2b.a, leaderboardNetworkEntity.n);
        st1VarN.p(serialDescriptor, 14, leaderboardNetworkEntity.o);
        if (st1VarN.C(serialDescriptor) || str != null) {
            st1VarN.z(serialDescriptor, 15, o2a.a, str);
        }
        if (st1VarN.C(serialDescriptor) || l != null) {
            st1VarN.z(serialDescriptor, 16, ue6.a, l);
        }
        if (st1VarN.C(serialDescriptor) || list != null) {
            st1VarN.z(serialDescriptor, 17, ss5VarArr[17].getValue(), list);
        }
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
