package com.hwpo_training_app.core.data.model.schedule;

import defpackage.gk4;
import defpackage.gy2;
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
import defpackage.ue6;
import io.intercom.android.sdk.models.AttributeType;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@gy2
public final /* synthetic */ class ScheduleNetworkEntity$$serializer implements gk4<ScheduleNetworkEntity> {
    public static final ScheduleNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ScheduleNetworkEntity$$serializer scheduleNetworkEntity$$serializer = new ScheduleNetworkEntity$$serializer();
        INSTANCE = scheduleNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.core.data.model.schedule.ScheduleNetworkEntity", scheduleNetworkEntity$$serializer, 8);
        o48Var.k("id", false);
        o48Var.k("color", false);
        o48Var.k("plan", false);
        o48Var.k("day_number", true);
        o48Var.k(AttributeType.DATE, false);
        o48Var.k("sections", false);
        o48Var.k("can_navigate_back", true);
        o48Var.k("can_navigate_forward", true);
        descriptor = o48Var;
    }

    private ScheduleNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        ss5<KSerializer<Object>>[] ss5VarArr = ScheduleNetworkEntity.B;
        ig5 ig5Var = ig5.a;
        is0 is0Var = is0.a;
        return new KSerializer[]{ig5Var, o2a.a, PlanNetworkEntity$$serializer.INSTANCE, ry0.a(ig5Var), ue6.a, ss5VarArr[5].getValue(), ry0.a(is0Var), ry0.a(is0Var)};
    }

    @Override // defpackage.sy2
    public final ScheduleNetworkEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = ScheduleNetworkEntity.B;
        long jG = 0;
        Boolean bool = null;
        boolean z = true;
        List list = null;
        Boolean bool2 = null;
        int i = 0;
        int iR = 0;
        String strC0 = null;
        PlanNetworkEntity planNetworkEntity = null;
        Integer num = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            switch (iG0) {
                case -1:
                    z = false;
                    break;
                case 0:
                    iR = rt1VarN.R(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strC0 = rt1VarN.c0(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    planNetworkEntity = (PlanNetworkEntity) rt1VarN.J(serialDescriptor, 2, PlanNetworkEntity$$serializer.INSTANCE, planNetworkEntity);
                    i |= 4;
                    break;
                case 3:
                    num = (Integer) rt1VarN.L(serialDescriptor, 3, ig5.a, num);
                    i |= 8;
                    break;
                case 4:
                    jG = rt1VarN.G(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    list = (List) rt1VarN.J(serialDescriptor, 5, ss5VarArr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    bool2 = (Boolean) rt1VarN.L(serialDescriptor, 6, is0.a, bool2);
                    i |= 64;
                    break;
                case 7:
                    bool = (Boolean) rt1VarN.L(serialDescriptor, 7, is0.a, bool);
                    i |= 128;
                    break;
                default:
                    ll.a(iG0);
                    return null;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new ScheduleNetworkEntity(i, iR, strC0, planNetworkEntity, num, jG, list, bool2, bool);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, ScheduleNetworkEntity scheduleNetworkEntity) {
        encoder.getClass();
        scheduleNetworkEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = ScheduleNetworkEntity.B;
        int i = scheduleNetworkEntity.t;
        Boolean bool = scheduleNetworkEntity.A;
        Boolean bool2 = scheduleNetworkEntity.z;
        Integer num = scheduleNetworkEntity.w;
        st1VarN.g(0, i, serialDescriptor);
        st1VarN.p(serialDescriptor, 1, scheduleNetworkEntity.u);
        st1VarN.q(serialDescriptor, 2, PlanNetworkEntity$$serializer.INSTANCE, scheduleNetworkEntity.v);
        if (st1VarN.C(serialDescriptor) || num != null) {
            st1VarN.z(serialDescriptor, 3, ig5.a, num);
        }
        st1VarN.B(serialDescriptor, 4, scheduleNetworkEntity.x);
        st1VarN.q(serialDescriptor, 5, ss5VarArr[5].getValue(), scheduleNetworkEntity.y);
        if (st1VarN.C(serialDescriptor) || bool2 != null) {
            st1VarN.z(serialDescriptor, 6, is0.a, bool2);
        }
        if (st1VarN.C(serialDescriptor) || bool != null) {
            st1VarN.z(serialDescriptor, 7, is0.a, bool);
        }
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
