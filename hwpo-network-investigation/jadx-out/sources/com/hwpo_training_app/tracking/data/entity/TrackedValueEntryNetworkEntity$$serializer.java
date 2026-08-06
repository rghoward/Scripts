package com.hwpo_training_app.tracking.data.entity;

import com.hwpo_training_app.core.data.model.schedule.UnitsNetworkEntity;
import defpackage.gk4;
import defpackage.gy2;
import defpackage.ig5;
import defpackage.is0;
import defpackage.ll;
import defpackage.n2b;
import defpackage.n43;
import defpackage.o2a;
import defpackage.o48;
import defpackage.p48;
import defpackage.rt1;
import defpackage.ry0;
import defpackage.ss5;
import defpackage.st1;
import io.intercom.android.sdk.models.AttributeType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@gy2
public final /* synthetic */ class TrackedValueEntryNetworkEntity$$serializer implements gk4<TrackedValueEntryNetworkEntity> {
    public static final TrackedValueEntryNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        TrackedValueEntryNetworkEntity$$serializer trackedValueEntryNetworkEntity$$serializer = new TrackedValueEntryNetworkEntity$$serializer();
        INSTANCE = trackedValueEntryNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.tracking.data.entity.TrackedValueEntryNetworkEntity", trackedValueEntryNetworkEntity$$serializer, 10);
        o48Var.k("id", false);
        o48Var.k("value", false);
        o48Var.k("second_value", true);
        o48Var.k("difference", true);
        o48Var.k("units", false);
        o48Var.k("symbol", false);
        o48Var.k("progress", true);
        o48Var.k("has_note", false);
        o48Var.k("media_count", true);
        o48Var.k(AttributeType.DATE, false);
        descriptor = o48Var;
    }

    private TrackedValueEntryNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        ss5<KSerializer<Object>>[] ss5VarArr = TrackedValueEntryNetworkEntity.D;
        ig5 ig5Var = ig5.a;
        n43 n43Var = n43.a;
        KSerializer<?> kSerializerA = ry0.a(n43Var);
        KSerializer<?> kSerializerA2 = ry0.a(ss5VarArr[3].getValue());
        KSerializer<?> kSerializerA3 = ry0.a(ig5Var);
        KSerializer<?> kSerializerA4 = ry0.a(ig5Var);
        o2a o2aVar = o2a.a;
        return new KSerializer[]{ig5Var, n43Var, kSerializerA, kSerializerA2, n2b.a, o2aVar, kSerializerA3, is0.a, kSerializerA4, o2aVar};
    }

    @Override // defpackage.sy2
    public final TrackedValueEntryNetworkEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = TrackedValueEntryNetworkEntity.D;
        TrackedValueEntryNetworkEntity trackedValueEntryNetworkEntity = null;
        double dO0 = 0.0d;
        Integer num = null;
        Integer num2 = null;
        Double d = null;
        DifferenceNetworkEntity differenceNetworkEntity = null;
        UnitsNetworkEntity unitsNetworkEntity = null;
        String strC0 = null;
        String strC1 = null;
        int i = 0;
        int iR = 0;
        boolean zA0 = false;
        boolean z = true;
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
                    dO0 = rt1VarN.o0(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    d = (Double) rt1VarN.L(serialDescriptor, 2, n43.a, d);
                    i |= 4;
                    break;
                case 3:
                    differenceNetworkEntity = (DifferenceNetworkEntity) rt1VarN.L(serialDescriptor, 3, ss5VarArr[3].getValue(), differenceNetworkEntity);
                    i |= 8;
                    break;
                case 4:
                    unitsNetworkEntity = (UnitsNetworkEntity) rt1VarN.J(serialDescriptor, 4, n2b.a, unitsNetworkEntity);
                    i |= 16;
                    break;
                case 5:
                    strC0 = rt1VarN.c0(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    num = (Integer) rt1VarN.L(serialDescriptor, 6, ig5.a, num);
                    i |= 64;
                    break;
                case 7:
                    zA0 = rt1VarN.a0(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    num2 = (Integer) rt1VarN.L(serialDescriptor, 8, ig5.a, num2);
                    i |= 256;
                    break;
                case 9:
                    strC1 = rt1VarN.c0(serialDescriptor, 9);
                    i |= 512;
                    break;
                default:
                    ll.a(iG0);
                    return trackedValueEntryNetworkEntity;
            }
            trackedValueEntryNetworkEntity = null;
        }
        rt1VarN.i(serialDescriptor);
        return new TrackedValueEntryNetworkEntity(i, iR, dO0, d, differenceNetworkEntity, unitsNetworkEntity, strC0, num, zA0, num2, strC1);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, TrackedValueEntryNetworkEntity trackedValueEntryNetworkEntity) {
        encoder.getClass();
        trackedValueEntryNetworkEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = TrackedValueEntryNetworkEntity.D;
        int i = trackedValueEntryNetworkEntity.t;
        Integer num = trackedValueEntryNetworkEntity.B;
        Integer num2 = trackedValueEntryNetworkEntity.z;
        DifferenceNetworkEntity differenceNetworkEntity = trackedValueEntryNetworkEntity.w;
        Double d = trackedValueEntryNetworkEntity.v;
        st1VarN.g(0, i, serialDescriptor);
        st1VarN.x(serialDescriptor, 1, trackedValueEntryNetworkEntity.u);
        if (st1VarN.C(serialDescriptor) || d != null) {
            st1VarN.z(serialDescriptor, 2, n43.a, d);
        }
        if (st1VarN.C(serialDescriptor) || differenceNetworkEntity != null) {
            st1VarN.z(serialDescriptor, 3, ss5VarArr[3].getValue(), differenceNetworkEntity);
        }
        st1VarN.q(serialDescriptor, 4, n2b.a, trackedValueEntryNetworkEntity.x);
        st1VarN.p(serialDescriptor, 5, trackedValueEntryNetworkEntity.y);
        if (st1VarN.C(serialDescriptor) || num2 != null) {
            st1VarN.z(serialDescriptor, 6, ig5.a, num2);
        }
        st1VarN.o(serialDescriptor, 7, trackedValueEntryNetworkEntity.A);
        if (st1VarN.C(serialDescriptor) || num != null) {
            st1VarN.z(serialDescriptor, 8, ig5.a, num);
        }
        st1VarN.p(serialDescriptor, 9, trackedValueEntryNetworkEntity.C);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
