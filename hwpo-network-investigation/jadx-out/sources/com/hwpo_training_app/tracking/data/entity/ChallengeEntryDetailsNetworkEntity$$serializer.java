package com.hwpo_training_app.tracking.data.entity;

import com.hwpo_training_app.core.data.model.schedule.SchedulePerformanceNetworkEntity;
import com.hwpo_training_app.core.data.model.schedule.SchedulePerformanceNetworkEntity$$serializer;
import com.hwpo_training_app.core.data.model.schedule.score.ScheduleScoreNetworkEntity;
import com.hwpo_training_app.core.data.model.schedule.score.ScheduleScoreNetworkEntity$$serializer;
import defpackage.gk4;
import defpackage.gy2;
import defpackage.ig5;
import defpackage.ll;
import defpackage.o2a;
import defpackage.o48;
import defpackage.p48;
import defpackage.rt1;
import defpackage.ry0;
import defpackage.st1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@gy2
public final /* synthetic */ class ChallengeEntryDetailsNetworkEntity$$serializer implements gk4<ChallengeEntryDetailsNetworkEntity> {
    public static final ChallengeEntryDetailsNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChallengeEntryDetailsNetworkEntity$$serializer challengeEntryDetailsNetworkEntity$$serializer = new ChallengeEntryDetailsNetworkEntity$$serializer();
        INSTANCE = challengeEntryDetailsNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.tracking.data.entity.ChallengeEntryDetailsNetworkEntity", challengeEntryDetailsNetworkEntity$$serializer, 5);
        o48Var.k("section_id", false);
        o48Var.k("schedule_id", false);
        o48Var.k("title", false);
        o48Var.k("performance", false);
        o48Var.k("score", false);
        descriptor = o48Var;
    }

    private ChallengeEntryDetailsNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializerA = ry0.a(SchedulePerformanceNetworkEntity$$serializer.INSTANCE);
        ig5 ig5Var = ig5.a;
        return new KSerializer[]{ig5Var, ig5Var, o2a.a, kSerializerA, ScheduleScoreNetworkEntity$$serializer.INSTANCE};
    }

    @Override // defpackage.sy2
    public final ChallengeEntryDetailsNetworkEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iR = 0;
        int iR2 = 0;
        String strC0 = null;
        SchedulePerformanceNetworkEntity schedulePerformanceNetworkEntity = null;
        ScheduleScoreNetworkEntity scheduleScoreNetworkEntity = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            if (iG0 == -1) {
                z = false;
            } else if (iG0 == 0) {
                iR = rt1VarN.R(serialDescriptor, 0);
                i |= 1;
            } else if (iG0 == 1) {
                iR2 = rt1VarN.R(serialDescriptor, 1);
                i |= 2;
            } else if (iG0 == 2) {
                strC0 = rt1VarN.c0(serialDescriptor, 2);
                i |= 4;
            } else if (iG0 == 3) {
                schedulePerformanceNetworkEntity = (SchedulePerformanceNetworkEntity) rt1VarN.L(serialDescriptor, 3, SchedulePerformanceNetworkEntity$$serializer.INSTANCE, schedulePerformanceNetworkEntity);
                i |= 8;
            } else {
                if (iG0 != 4) {
                    ll.a(iG0);
                    return null;
                }
                scheduleScoreNetworkEntity = (ScheduleScoreNetworkEntity) rt1VarN.J(serialDescriptor, 4, ScheduleScoreNetworkEntity$$serializer.INSTANCE, scheduleScoreNetworkEntity);
                i |= 16;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new ChallengeEntryDetailsNetworkEntity(i, iR, iR2, strC0, schedulePerformanceNetworkEntity, scheduleScoreNetworkEntity);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, ChallengeEntryDetailsNetworkEntity challengeEntryDetailsNetworkEntity) {
        encoder.getClass();
        challengeEntryDetailsNetworkEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        st1VarN.g(0, challengeEntryDetailsNetworkEntity.t, serialDescriptor);
        st1VarN.g(1, challengeEntryDetailsNetworkEntity.u, serialDescriptor);
        st1VarN.p(serialDescriptor, 2, challengeEntryDetailsNetworkEntity.v);
        st1VarN.z(serialDescriptor, 3, SchedulePerformanceNetworkEntity$$serializer.INSTANCE, challengeEntryDetailsNetworkEntity.w);
        st1VarN.q(serialDescriptor, 4, ScheduleScoreNetworkEntity$$serializer.INSTANCE, challengeEntryDetailsNetworkEntity.x);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
