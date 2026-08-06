package com.hwpo_training_app.core.data.model.schedule;

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
import io.intercom.android.sdk.models.AttributeType;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@gy2
public final /* synthetic */ class SchedulePerformanceNetworkEntity$$serializer implements gk4<SchedulePerformanceNetworkEntity> {
    public static final SchedulePerformanceNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SchedulePerformanceNetworkEntity$$serializer schedulePerformanceNetworkEntity$$serializer = new SchedulePerformanceNetworkEntity$$serializer();
        INSTANCE = schedulePerformanceNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.core.data.model.schedule.SchedulePerformanceNetworkEntity", schedulePerformanceNetworkEntity$$serializer, 3);
        o48Var.k("id", false);
        o48Var.k(AttributeType.TEXT, false);
        o48Var.k("attachments", false);
        descriptor = o48Var;
    }

    private SchedulePerformanceNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{ig5.a, ry0.a(o2a.a), SchedulePerformanceNetworkEntity.w[2].getValue()};
    }

    @Override // defpackage.sy2
    public final SchedulePerformanceNetworkEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = SchedulePerformanceNetworkEntity.w;
        boolean z = true;
        int i = 0;
        int iR = 0;
        String str = null;
        List list = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            if (iG0 == -1) {
                z = false;
            } else if (iG0 == 0) {
                iR = rt1VarN.R(serialDescriptor, 0);
                i |= 1;
            } else if (iG0 == 1) {
                str = (String) rt1VarN.L(serialDescriptor, 1, o2a.a, str);
                i |= 2;
            } else {
                if (iG0 != 2) {
                    ll.a(iG0);
                    return null;
                }
                list = (List) rt1VarN.J(serialDescriptor, 2, ss5VarArr[2].getValue(), list);
                i |= 4;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new SchedulePerformanceNetworkEntity(i, iR, str, list);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, SchedulePerformanceNetworkEntity schedulePerformanceNetworkEntity) {
        encoder.getClass();
        schedulePerformanceNetworkEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = SchedulePerformanceNetworkEntity.w;
        st1VarN.g(0, schedulePerformanceNetworkEntity.t, serialDescriptor);
        st1VarN.z(serialDescriptor, 1, o2a.a, schedulePerformanceNetworkEntity.u);
        st1VarN.q(serialDescriptor, 2, ss5VarArr[2].getValue(), schedulePerformanceNetworkEntity.v);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
