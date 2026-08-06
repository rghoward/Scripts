package com.hwpo_training_app.reschedule.data.entity;

import defpackage.gk4;
import defpackage.gy2;
import defpackage.ig5;
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
/* JADX INFO: loaded from: classes3.dex */
@gy2
public final /* synthetic */ class RescheduleMaxDayResponse$$serializer implements gk4<RescheduleMaxDayResponse> {
    public static final RescheduleMaxDayResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        RescheduleMaxDayResponse$$serializer rescheduleMaxDayResponse$$serializer = new RescheduleMaxDayResponse$$serializer();
        INSTANCE = rescheduleMaxDayResponse$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.reschedule.data.entity.RescheduleMaxDayResponse", rescheduleMaxDayResponse$$serializer, 1);
        o48Var.k("max_allow_day", false);
        descriptor = o48Var;
    }

    private RescheduleMaxDayResponse$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{ig5.a};
    }

    @Override // defpackage.sy2
    public final RescheduleMaxDayResponse deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iR = 0;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            if (iG0 == -1) {
                z = false;
            } else {
                if (iG0 != 0) {
                    ll.a(iG0);
                    return null;
                }
                iR = rt1VarN.R(serialDescriptor, 0);
                i = 1;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new RescheduleMaxDayResponse(i, iR);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, RescheduleMaxDayResponse rescheduleMaxDayResponse) {
        encoder.getClass();
        rescheduleMaxDayResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        st1VarN.g(0, rescheduleMaxDayResponse.a, serialDescriptor);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
