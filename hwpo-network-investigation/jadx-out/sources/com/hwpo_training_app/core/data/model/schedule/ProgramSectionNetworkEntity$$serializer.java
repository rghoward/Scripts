package com.hwpo_training_app.core.data.model.schedule;

import com.hwpo_training_app.core.data.model.attachments.SectionAttachmentNetworkEntity;
import com.hwpo_training_app.core.data.model.attachments.SectionAttachmentNetworkEntity$$serializer;
import com.hwpo_training_app.core.data.model.schedule.score.ScheduleScoreNetworkEntity;
import com.hwpo_training_app.core.data.model.schedule.score.ScheduleScoreNetworkEntity$$serializer;
import defpackage.gk4;
import defpackage.gy2;
import defpackage.h4c;
import defpackage.hf3;
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
import defpackage.xj5;
import defpackage.z97;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@gy2
public final /* synthetic */ class ProgramSectionNetworkEntity$$serializer implements gk4<ProgramSectionNetworkEntity> {
    public static final ProgramSectionNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ProgramSectionNetworkEntity$$serializer programSectionNetworkEntity$$serializer = new ProgramSectionNetworkEntity$$serializer();
        INSTANCE = programSectionNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.core.data.model.schedule.ProgramSectionNetworkEntity", programSectionNetworkEntity$$serializer, 16);
        o48Var.k("id", false);
        o48Var.k("title", true);
        o48Var.k("kind", false);
        o48Var.k("position", true);
        o48Var.k("description", true);
        o48Var.k(MetricTracker.Action.COMPLETED, false);
        o48Var.k("has_performance", true);
        o48Var.k("has_feedback", true);
        o48Var.k("attachment_for_tip", true);
        o48Var.k("attachments", true);
        o48Var.k("benchmarks", true);
        o48Var.k("performance", true);
        o48Var.k("plan_option_id", true);
        o48Var.k("score", true);
        o48Var.k("pre_wod", true);
        o48Var.k("post_wod", true);
        descriptor = o48Var;
    }

    private ProgramSectionNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        ss5<KSerializer<Object>>[] ss5VarArr = ProgramSectionNetworkEntity.J;
        ig5 ig5Var = ig5.a;
        o2a o2aVar = o2a.a;
        is0 is0Var = is0.a;
        return new KSerializer[]{ig5Var, ry0.a(o2aVar), ss5VarArr[2].getValue(), ry0.a(ig5Var), ry0.a(o2aVar), is0Var, ry0.a(is0Var), ry0.a(is0Var), ry0.a(SectionAttachmentNetworkEntity$$serializer.INSTANCE), ss5VarArr[9].getValue(), ry0.a(ss5VarArr[10].getValue()), ry0.a(SchedulePerformanceNetworkEntity$$serializer.INSTANCE), ry0.a(ig5Var), ry0.a(ScheduleScoreNetworkEntity$$serializer.INSTANCE), ry0.a(o2aVar), ry0.a(o2aVar)};
    }

    @Override // defpackage.sy2
    public final ProgramSectionNetworkEntity deserialize(Decoder decoder) {
        SectionKindNetworkEntity sectionKindNetworkEntity;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = ProgramSectionNetworkEntity.J;
        SchedulePerformanceNetworkEntity schedulePerformanceNetworkEntity = null;
        List list = null;
        List list2 = null;
        SectionAttachmentNetworkEntity sectionAttachmentNetworkEntity = null;
        Integer num = null;
        Boolean bool = null;
        int i = 0;
        ScheduleScoreNetworkEntity scheduleScoreNetworkEntity = null;
        String str = null;
        SectionKindNetworkEntity sectionKindNetworkEntity2 = null;
        Integer num2 = null;
        String str2 = null;
        String str3 = null;
        Boolean bool2 = null;
        boolean z = true;
        int iR = 0;
        boolean zA0 = false;
        String str4 = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            switch (iG0) {
                case -1:
                    z = false;
                    sectionKindNetworkEntity2 = sectionKindNetworkEntity2;
                    num2 = num2;
                    break;
                case 0:
                    sectionKindNetworkEntity = sectionKindNetworkEntity2;
                    iR = rt1VarN.R(serialDescriptor, 0);
                    i |= 1;
                    sectionKindNetworkEntity2 = sectionKindNetworkEntity;
                    num2 = num2;
                    schedulePerformanceNetworkEntity = schedulePerformanceNetworkEntity;
                    break;
                case 1:
                    sectionKindNetworkEntity = sectionKindNetworkEntity2;
                    str4 = (String) rt1VarN.L(serialDescriptor, 1, o2a.a, str4);
                    i |= 2;
                    sectionKindNetworkEntity2 = sectionKindNetworkEntity;
                    num2 = num2;
                    schedulePerformanceNetworkEntity = schedulePerformanceNetworkEntity;
                    break;
                case 2:
                    schedulePerformanceNetworkEntity = schedulePerformanceNetworkEntity;
                    num2 = num2;
                    sectionKindNetworkEntity2 = (SectionKindNetworkEntity) rt1VarN.J(serialDescriptor, 2, ss5VarArr[2].getValue(), sectionKindNetworkEntity2);
                    i |= 4;
                    num2 = num2;
                    schedulePerformanceNetworkEntity = schedulePerformanceNetworkEntity;
                    break;
                case 3:
                    schedulePerformanceNetworkEntity = schedulePerformanceNetworkEntity;
                    num2 = (Integer) rt1VarN.L(serialDescriptor, 3, ig5.a, num2);
                    i |= 8;
                    sectionKindNetworkEntity2 = sectionKindNetworkEntity2;
                    schedulePerformanceNetworkEntity = schedulePerformanceNetworkEntity;
                    break;
                case 4:
                    str2 = (String) rt1VarN.L(serialDescriptor, 4, o2a.a, str2);
                    i |= 16;
                    sectionKindNetworkEntity2 = sectionKindNetworkEntity2;
                    num2 = num2;
                    break;
                case 5:
                    zA0 = rt1VarN.a0(serialDescriptor, 5);
                    i |= 32;
                    sectionKindNetworkEntity2 = sectionKindNetworkEntity2;
                    break;
                case 6:
                    bool2 = (Boolean) rt1VarN.L(serialDescriptor, 6, is0.a, bool2);
                    i |= 64;
                    sectionKindNetworkEntity2 = sectionKindNetworkEntity2;
                    num2 = num2;
                    break;
                case 7:
                    bool = (Boolean) rt1VarN.L(serialDescriptor, 7, is0.a, bool);
                    i |= 128;
                    sectionKindNetworkEntity2 = sectionKindNetworkEntity2;
                    num2 = num2;
                    break;
                case 8:
                    sectionAttachmentNetworkEntity = (SectionAttachmentNetworkEntity) rt1VarN.L(serialDescriptor, 8, SectionAttachmentNetworkEntity$$serializer.INSTANCE, sectionAttachmentNetworkEntity);
                    i |= 256;
                    sectionKindNetworkEntity2 = sectionKindNetworkEntity2;
                    num2 = num2;
                    break;
                case 9:
                    list2 = (List) rt1VarN.J(serialDescriptor, 9, ss5VarArr[9].getValue(), list2);
                    i |= 512;
                    sectionKindNetworkEntity2 = sectionKindNetworkEntity2;
                    num2 = num2;
                    break;
                case 10:
                    list = (List) rt1VarN.L(serialDescriptor, 10, ss5VarArr[10].getValue(), list);
                    i |= 1024;
                    sectionKindNetworkEntity2 = sectionKindNetworkEntity2;
                    num2 = num2;
                    break;
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    schedulePerformanceNetworkEntity = (SchedulePerformanceNetworkEntity) rt1VarN.L(serialDescriptor, 11, SchedulePerformanceNetworkEntity$$serializer.INSTANCE, schedulePerformanceNetworkEntity);
                    i |= AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    sectionKindNetworkEntity2 = sectionKindNetworkEntity2;
                    num2 = num2;
                    break;
                case 12:
                    num = (Integer) rt1VarN.L(serialDescriptor, 12, ig5.a, num);
                    i |= 4096;
                    sectionKindNetworkEntity2 = sectionKindNetworkEntity2;
                    num2 = num2;
                    break;
                case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    scheduleScoreNetworkEntity = (ScheduleScoreNetworkEntity) rt1VarN.L(serialDescriptor, 13, ScheduleScoreNetworkEntity$$serializer.INSTANCE, scheduleScoreNetworkEntity);
                    i |= 8192;
                    sectionKindNetworkEntity2 = sectionKindNetworkEntity2;
                    num2 = num2;
                    break;
                case 14:
                    str3 = (String) rt1VarN.L(serialDescriptor, 14, o2a.a, str3);
                    i |= 16384;
                    sectionKindNetworkEntity2 = sectionKindNetworkEntity2;
                    num2 = num2;
                    break;
                case h4c.e /* 15 */:
                    str = (String) rt1VarN.L(serialDescriptor, 15, o2a.a, str);
                    i |= 32768;
                    sectionKindNetworkEntity2 = sectionKindNetworkEntity2;
                    num2 = num2;
                    break;
                default:
                    ll.a(iG0);
                    return null;
            }
        }
        SectionKindNetworkEntity sectionKindNetworkEntity3 = sectionKindNetworkEntity2;
        Integer num3 = num2;
        String str5 = str4;
        rt1VarN.i(serialDescriptor);
        return new ProgramSectionNetworkEntity(i, iR, str5, sectionKindNetworkEntity3, num3, str2, zA0, bool2, bool, sectionAttachmentNetworkEntity, list2, list, schedulePerformanceNetworkEntity, num, scheduleScoreNetworkEntity, str3, str);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, ProgramSectionNetworkEntity programSectionNetworkEntity) {
        encoder.getClass();
        programSectionNetworkEntity.getClass();
        String str = programSectionNetworkEntity.I;
        String str2 = programSectionNetworkEntity.H;
        ScheduleScoreNetworkEntity scheduleScoreNetworkEntity = programSectionNetworkEntity.G;
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = ProgramSectionNetworkEntity.J;
        int i = programSectionNetworkEntity.t;
        Integer num = programSectionNetworkEntity.F;
        SchedulePerformanceNetworkEntity schedulePerformanceNetworkEntity = programSectionNetworkEntity.E;
        List<BenchmarkNetworkEntity> list = programSectionNetworkEntity.D;
        List<SectionAttachmentNetworkEntity> list2 = programSectionNetworkEntity.C;
        SectionAttachmentNetworkEntity sectionAttachmentNetworkEntity = programSectionNetworkEntity.B;
        Boolean bool = programSectionNetworkEntity.A;
        Boolean bool2 = programSectionNetworkEntity.z;
        String str3 = programSectionNetworkEntity.x;
        Integer num2 = programSectionNetworkEntity.w;
        String str4 = programSectionNetworkEntity.u;
        st1VarN.g(0, i, serialDescriptor);
        if (st1VarN.C(serialDescriptor) || str4 != null) {
            st1VarN.z(serialDescriptor, 1, o2a.a, str4);
        }
        st1VarN.q(serialDescriptor, 2, ss5VarArr[2].getValue(), programSectionNetworkEntity.v);
        if (st1VarN.C(serialDescriptor) || num2 == null || num2.intValue() != -1) {
            st1VarN.z(serialDescriptor, 3, ig5.a, num2);
        }
        if (st1VarN.C(serialDescriptor) || str3 != null) {
            st1VarN.z(serialDescriptor, 4, o2a.a, str3);
        }
        st1VarN.o(serialDescriptor, 5, programSectionNetworkEntity.y);
        if (st1VarN.C(serialDescriptor) || !xj5.a(bool2, Boolean.FALSE)) {
            st1VarN.z(serialDescriptor, 6, is0.a, bool2);
        }
        if (st1VarN.C(serialDescriptor) || !xj5.a(bool, Boolean.FALSE)) {
            st1VarN.z(serialDescriptor, 7, is0.a, bool);
        }
        if (st1VarN.C(serialDescriptor) || sectionAttachmentNetworkEntity != null) {
            st1VarN.z(serialDescriptor, 8, SectionAttachmentNetworkEntity$$serializer.INSTANCE, sectionAttachmentNetworkEntity);
        }
        if (st1VarN.C(serialDescriptor) || !xj5.a(list2, hf3.t)) {
            st1VarN.q(serialDescriptor, 9, ss5VarArr[9].getValue(), list2);
        }
        if (st1VarN.C(serialDescriptor) || list != null) {
            st1VarN.z(serialDescriptor, 10, ss5VarArr[10].getValue(), list);
        }
        if (st1VarN.C(serialDescriptor) || schedulePerformanceNetworkEntity != null) {
            st1VarN.z(serialDescriptor, 11, SchedulePerformanceNetworkEntity$$serializer.INSTANCE, schedulePerformanceNetworkEntity);
        }
        if (st1VarN.C(serialDescriptor) || num != null) {
            st1VarN.z(serialDescriptor, 12, ig5.a, num);
        }
        if (st1VarN.C(serialDescriptor) || scheduleScoreNetworkEntity != null) {
            st1VarN.z(serialDescriptor, 13, ScheduleScoreNetworkEntity$$serializer.INSTANCE, scheduleScoreNetworkEntity);
        }
        if (st1VarN.C(serialDescriptor) || str2 != null) {
            st1VarN.z(serialDescriptor, 14, o2a.a, str2);
        }
        if (st1VarN.C(serialDescriptor) || str != null) {
            st1VarN.z(serialDescriptor, 15, o2a.a, str);
        }
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
