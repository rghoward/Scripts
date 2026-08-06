package com.hwpo_training_app.tracking.data.entity;

import com.hwpo_training_app.core.data.model.schedule.BenchmarkMeasureTypeNetworkEntity;
import com.hwpo_training_app.core.data.model.schedule.UnitsNetworkEntity;
import defpackage.gk4;
import defpackage.gy2;
import defpackage.ig5;
import defpackage.ll;
import defpackage.n2b;
import defpackage.o2a;
import defpackage.o48;
import defpackage.p48;
import defpackage.rt1;
import defpackage.ss5;
import defpackage.st1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@gy2
public final /* synthetic */ class ValueToAddNetworkEntity$$serializer implements gk4<ValueToAddNetworkEntity> {
    public static final ValueToAddNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ValueToAddNetworkEntity$$serializer valueToAddNetworkEntity$$serializer = new ValueToAddNetworkEntity$$serializer();
        INSTANCE = valueToAddNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.tracking.data.entity.ValueToAddNetworkEntity", valueToAddNetworkEntity$$serializer, 4);
        o48Var.k("id", false);
        o48Var.k("name", false);
        o48Var.k("measure", false);
        o48Var.k("units", false);
        descriptor = o48Var;
    }

    private ValueToAddNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{ig5.a, o2a.a, ValueToAddNetworkEntity.x[2].getValue(), n2b.a};
    }

    @Override // defpackage.sy2
    public final ValueToAddNetworkEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = ValueToAddNetworkEntity.x;
        boolean z = true;
        int i = 0;
        int iR = 0;
        String strC0 = null;
        BenchmarkMeasureTypeNetworkEntity benchmarkMeasureTypeNetworkEntity = null;
        UnitsNetworkEntity unitsNetworkEntity = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            if (iG0 == -1) {
                z = false;
            } else if (iG0 == 0) {
                iR = rt1VarN.R(serialDescriptor, 0);
                i |= 1;
            } else if (iG0 == 1) {
                strC0 = rt1VarN.c0(serialDescriptor, 1);
                i |= 2;
            } else if (iG0 == 2) {
                benchmarkMeasureTypeNetworkEntity = (BenchmarkMeasureTypeNetworkEntity) rt1VarN.J(serialDescriptor, 2, ss5VarArr[2].getValue(), benchmarkMeasureTypeNetworkEntity);
                i |= 4;
            } else {
                if (iG0 != 3) {
                    ll.a(iG0);
                    return null;
                }
                unitsNetworkEntity = (UnitsNetworkEntity) rt1VarN.J(serialDescriptor, 3, n2b.a, unitsNetworkEntity);
                i |= 8;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new ValueToAddNetworkEntity(i, iR, strC0, benchmarkMeasureTypeNetworkEntity, unitsNetworkEntity);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, ValueToAddNetworkEntity valueToAddNetworkEntity) {
        encoder.getClass();
        valueToAddNetworkEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = ValueToAddNetworkEntity.x;
        st1VarN.g(0, valueToAddNetworkEntity.t, serialDescriptor);
        st1VarN.p(serialDescriptor, 1, valueToAddNetworkEntity.u);
        st1VarN.q(serialDescriptor, 2, ss5VarArr[2].getValue(), valueToAddNetworkEntity.v);
        st1VarN.q(serialDescriptor, 3, n2b.a, valueToAddNetworkEntity.w);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
