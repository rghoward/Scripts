package com.hwpo_training_app.core.data.model.schedule;

import defpackage.gk4;
import defpackage.gy2;
import defpackage.ll;
import defpackage.o48;
import defpackage.p48;
import defpackage.rt1;
import defpackage.st1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@gy2
public final /* synthetic */ class ScheduleDetailsResponse$$serializer implements gk4<ScheduleDetailsResponse> {
    public static final ScheduleDetailsResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ScheduleDetailsResponse$$serializer scheduleDetailsResponse$$serializer = new ScheduleDetailsResponse$$serializer();
        INSTANCE = scheduleDetailsResponse$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.core.data.model.schedule.ScheduleDetailsResponse", scheduleDetailsResponse$$serializer, 1);
        o48Var.k("schedule", false);
        descriptor = o48Var;
    }

    private ScheduleDetailsResponse$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{ScheduleNetworkEntity$$serializer.INSTANCE};
    }

    @Override // defpackage.sy2
    public final ScheduleDetailsResponse deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        boolean z = true;
        int i = 0;
        ScheduleNetworkEntity scheduleNetworkEntity = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            if (iG0 == -1) {
                z = false;
            } else {
                if (iG0 != 0) {
                    ll.a(iG0);
                    return null;
                }
                scheduleNetworkEntity = (ScheduleNetworkEntity) rt1VarN.J(serialDescriptor, 0, ScheduleNetworkEntity$$serializer.INSTANCE, scheduleNetworkEntity);
                i = 1;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new ScheduleDetailsResponse(i, scheduleNetworkEntity);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, ScheduleDetailsResponse scheduleDetailsResponse) {
        encoder.getClass();
        scheduleDetailsResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        st1VarN.q(serialDescriptor, 0, ScheduleNetworkEntity$$serializer.INSTANCE, scheduleDetailsResponse.t);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
