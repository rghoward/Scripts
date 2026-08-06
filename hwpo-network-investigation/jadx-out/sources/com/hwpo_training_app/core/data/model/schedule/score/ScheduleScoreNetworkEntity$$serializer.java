package com.hwpo_training_app.core.data.model.schedule.score;

import defpackage.gk4;
import defpackage.gy2;
import defpackage.ig5;
import defpackage.ll;
import defpackage.o2a;
import defpackage.o48;
import defpackage.p48;
import defpackage.rt1;
import defpackage.ry0;
import defpackage.ss5;
import defpackage.st1;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@gy2
public final /* synthetic */ class ScheduleScoreNetworkEntity$$serializer implements gk4<ScheduleScoreNetworkEntity> {
    public static final ScheduleScoreNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ScheduleScoreNetworkEntity$$serializer scheduleScoreNetworkEntity$$serializer = new ScheduleScoreNetworkEntity$$serializer();
        INSTANCE = scheduleScoreNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.core.data.model.schedule.score.ScheduleScoreNetworkEntity", scheduleScoreNetworkEntity$$serializer, 9);
        o48Var.k("id", false);
        o48Var.k("measure", false);
        o48Var.k("objective", true);
        o48Var.k("rounds", true);
        o48Var.k("reps", true);
        o48Var.k("count_sub_value", true);
        o48Var.k("tags", false);
        o48Var.k("score_value", true);
        o48Var.k("symbol", false);
        descriptor = o48Var;
    }

    private ScheduleScoreNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        ss5<KSerializer<Object>>[] ss5VarArr = ScheduleScoreNetworkEntity.C;
        ig5 ig5Var = ig5.a;
        return new KSerializer[]{ig5Var, ss5VarArr[1].getValue(), ry0.a(ig5Var), ry0.a(ig5Var), ry0.a(ig5Var), ry0.a(ig5Var), ss5VarArr[6].getValue(), ry0.a(ScoreValueNetworkEntity$$serializer.INSTANCE), o2a.a};
    }

    @Override // defpackage.sy2
    public final ScheduleScoreNetworkEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = ScheduleScoreNetworkEntity.C;
        ScheduleScoreNetworkEntity scheduleScoreNetworkEntity = null;
        boolean z = true;
        ScoreValueNetworkEntity scoreValueNetworkEntity = null;
        ScoreMeasureTypeNetworkEntity scoreMeasureTypeNetworkEntity = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        List list = null;
        String strC0 = null;
        int i = 0;
        int iR = 0;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            switch (iG0) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    iR = rt1VarN.R(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    scoreMeasureTypeNetworkEntity = (ScoreMeasureTypeNetworkEntity) rt1VarN.J(serialDescriptor, 1, ss5VarArr[1].getValue(), scoreMeasureTypeNetworkEntity);
                    i |= 2;
                    break;
                case 2:
                    num = (Integer) rt1VarN.L(serialDescriptor, 2, ig5.a, num);
                    i |= 4;
                    break;
                case 3:
                    num2 = (Integer) rt1VarN.L(serialDescriptor, 3, ig5.a, num2);
                    i |= 8;
                    break;
                case 4:
                    num3 = (Integer) rt1VarN.L(serialDescriptor, 4, ig5.a, num3);
                    i |= 16;
                    break;
                case 5:
                    num4 = (Integer) rt1VarN.L(serialDescriptor, 5, ig5.a, num4);
                    i |= 32;
                    break;
                case 6:
                    list = (List) rt1VarN.J(serialDescriptor, 6, ss5VarArr[6].getValue(), list);
                    i |= 64;
                    break;
                case 7:
                    scoreValueNetworkEntity = (ScoreValueNetworkEntity) rt1VarN.L(serialDescriptor, 7, ScoreValueNetworkEntity$$serializer.INSTANCE, scoreValueNetworkEntity);
                    i |= 128;
                    break;
                case 8:
                    strC0 = rt1VarN.c0(serialDescriptor, 8);
                    i |= 256;
                    break;
                default:
                    ll.a(iG0);
                    return scheduleScoreNetworkEntity;
            }
            scheduleScoreNetworkEntity = null;
        }
        rt1VarN.i(serialDescriptor);
        return new ScheduleScoreNetworkEntity(i, iR, scoreMeasureTypeNetworkEntity, num, num2, num3, num4, list, scoreValueNetworkEntity, strC0);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, ScheduleScoreNetworkEntity scheduleScoreNetworkEntity) {
        encoder.getClass();
        scheduleScoreNetworkEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = ScheduleScoreNetworkEntity.C;
        int i = scheduleScoreNetworkEntity.t;
        ScoreValueNetworkEntity scoreValueNetworkEntity = scheduleScoreNetworkEntity.A;
        Integer num = scheduleScoreNetworkEntity.y;
        Integer num2 = scheduleScoreNetworkEntity.x;
        Integer num3 = scheduleScoreNetworkEntity.w;
        Integer num4 = scheduleScoreNetworkEntity.v;
        st1VarN.g(0, i, serialDescriptor);
        st1VarN.q(serialDescriptor, 1, ss5VarArr[1].getValue(), scheduleScoreNetworkEntity.u);
        if (st1VarN.C(serialDescriptor) || num4 != null) {
            st1VarN.z(serialDescriptor, 2, ig5.a, num4);
        }
        if (st1VarN.C(serialDescriptor) || num3 != null) {
            st1VarN.z(serialDescriptor, 3, ig5.a, num3);
        }
        if (st1VarN.C(serialDescriptor) || num2 != null) {
            st1VarN.z(serialDescriptor, 4, ig5.a, num2);
        }
        if (st1VarN.C(serialDescriptor) || num != null) {
            st1VarN.z(serialDescriptor, 5, ig5.a, num);
        }
        st1VarN.q(serialDescriptor, 6, ss5VarArr[6].getValue(), scheduleScoreNetworkEntity.z);
        if (st1VarN.C(serialDescriptor) || scoreValueNetworkEntity != null) {
            st1VarN.z(serialDescriptor, 7, ScoreValueNetworkEntity$$serializer.INSTANCE, scoreValueNetworkEntity);
        }
        st1VarN.p(serialDescriptor, 8, scheduleScoreNetworkEntity.B);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
