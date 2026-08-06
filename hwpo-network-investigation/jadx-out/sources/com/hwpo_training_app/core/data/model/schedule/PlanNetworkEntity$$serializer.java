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
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@gy2
public final /* synthetic */ class PlanNetworkEntity$$serializer implements gk4<PlanNetworkEntity> {
    public static final PlanNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PlanNetworkEntity$$serializer planNetworkEntity$$serializer = new PlanNetworkEntity$$serializer();
        INSTANCE = planNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.core.data.model.schedule.PlanNetworkEntity", planNetworkEntity$$serializer, 5);
        o48Var.k("id", true);
        o48Var.k("title", false);
        o48Var.k("plan_type", false);
        o48Var.k("cover_url", true);
        o48Var.k("plan_options", true);
        descriptor = o48Var;
    }

    private PlanNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        ss5<KSerializer<Object>>[] ss5VarArr = PlanNetworkEntity.y;
        o2a o2aVar = o2a.a;
        return new KSerializer[]{ry0.a(ig5.a), o2aVar, ss5VarArr[2].getValue(), ry0.a(o2aVar), ry0.a(ss5VarArr[4].getValue())};
    }

    @Override // defpackage.sy2
    public final PlanNetworkEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = PlanNetworkEntity.y;
        boolean z = true;
        int i = 0;
        Integer num = null;
        String strC0 = null;
        PlanType planType = null;
        String str = null;
        List list = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            if (iG0 == -1) {
                z = false;
            } else if (iG0 == 0) {
                num = (Integer) rt1VarN.L(serialDescriptor, 0, ig5.a, num);
                i |= 1;
            } else if (iG0 == 1) {
                strC0 = rt1VarN.c0(serialDescriptor, 1);
                i |= 2;
            } else if (iG0 == 2) {
                planType = (PlanType) rt1VarN.J(serialDescriptor, 2, ss5VarArr[2].getValue(), planType);
                i |= 4;
            } else if (iG0 == 3) {
                str = (String) rt1VarN.L(serialDescriptor, 3, o2a.a, str);
                i |= 8;
            } else {
                if (iG0 != 4) {
                    ll.a(iG0);
                    return null;
                }
                list = (List) rt1VarN.L(serialDescriptor, 4, ss5VarArr[4].getValue(), list);
                i |= 16;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new PlanNetworkEntity(i, num, strC0, planType, str, list);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, PlanNetworkEntity planNetworkEntity) {
        encoder.getClass();
        planNetworkEntity.getClass();
        Integer num = planNetworkEntity.t;
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = PlanNetworkEntity.y;
        if (st1VarN.C(serialDescriptor) || num != null) {
            st1VarN.z(serialDescriptor, 0, ig5.a, num);
        }
        String str = planNetworkEntity.u;
        List<PlanOptionNetworkEntity> list = planNetworkEntity.x;
        String str2 = planNetworkEntity.w;
        st1VarN.p(serialDescriptor, 1, str);
        st1VarN.q(serialDescriptor, 2, ss5VarArr[2].getValue(), planNetworkEntity.v);
        if (st1VarN.C(serialDescriptor) || str2 != null) {
            st1VarN.z(serialDescriptor, 3, o2a.a, str2);
        }
        if (st1VarN.C(serialDescriptor) || list != null) {
            st1VarN.z(serialDescriptor, 4, ss5VarArr[4].getValue(), list);
        }
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
