package com.hwpo_training_app.core.data.model.schedule;

import defpackage.gk4;
import defpackage.gy2;
import defpackage.ll;
import defpackage.o48;
import defpackage.p48;
import defpackage.rt1;
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
public final /* synthetic */ class ScheduleResponse$$serializer implements gk4<ScheduleResponse> {
    public static final ScheduleResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ScheduleResponse$$serializer scheduleResponse$$serializer = new ScheduleResponse$$serializer();
        INSTANCE = scheduleResponse$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.core.data.model.schedule.ScheduleResponse", scheduleResponse$$serializer, 2);
        o48Var.k("schedules", false);
        o48Var.k("launch_dates", false);
        descriptor = o48Var;
    }

    private ScheduleResponse$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        ss5<KSerializer<Object>>[] ss5VarArr = ScheduleResponse.v;
        return new KSerializer[]{ss5VarArr[0].getValue(), ss5VarArr[1].getValue()};
    }

    @Override // defpackage.sy2
    public final ScheduleResponse deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = ScheduleResponse.v;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            if (iG0 == -1) {
                z = false;
            } else if (iG0 == 0) {
                list = (List) rt1VarN.J(serialDescriptor, 0, ss5VarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iG0 != 1) {
                    ll.a(iG0);
                    return null;
                }
                list2 = (List) rt1VarN.J(serialDescriptor, 1, ss5VarArr[1].getValue(), list2);
                i |= 2;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new ScheduleResponse(i, list, list2);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, ScheduleResponse scheduleResponse) {
        encoder.getClass();
        scheduleResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = ScheduleResponse.v;
        st1VarN.q(serialDescriptor, 0, ss5VarArr[0].getValue(), scheduleResponse.t);
        st1VarN.q(serialDescriptor, 1, ss5VarArr[1].getValue(), scheduleResponse.u);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
