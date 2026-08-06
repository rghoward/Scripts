package com.hwpo_training_app.core.data.model.schedule;

import defpackage.gk4;
import defpackage.gy2;
import defpackage.ig5;
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
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@gy2
public final /* synthetic */ class BenchmarkNetworkEntity$$serializer implements gk4<BenchmarkNetworkEntity> {
    public static final BenchmarkNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        BenchmarkNetworkEntity$$serializer benchmarkNetworkEntity$$serializer = new BenchmarkNetworkEntity$$serializer();
        INSTANCE = benchmarkNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.core.data.model.schedule.BenchmarkNetworkEntity", benchmarkNetworkEntity$$serializer, 6);
        o48Var.k("id", false);
        o48Var.k("name", false);
        o48Var.k("measure", false);
        o48Var.k("last_value", true);
        o48Var.k("units", false);
        o48Var.k("symbol", true);
        descriptor = o48Var;
    }

    private BenchmarkNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        ss5<KSerializer<Object>>[] ss5VarArr = BenchmarkNetworkEntity.z;
        o2a o2aVar = o2a.a;
        return new KSerializer[]{ig5.a, o2aVar, ss5VarArr[2].getValue(), ry0.a(n43.a), n2b.a, ry0.a(o2aVar)};
    }

    @Override // defpackage.sy2
    public final BenchmarkNetworkEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = BenchmarkNetworkEntity.z;
        boolean z = true;
        int i = 0;
        int iR = 0;
        String strC0 = null;
        BenchmarkMeasureTypeNetworkEntity benchmarkMeasureTypeNetworkEntity = null;
        Double d = null;
        UnitsNetworkEntity unitsNetworkEntity = null;
        String str = null;
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
                    benchmarkMeasureTypeNetworkEntity = (BenchmarkMeasureTypeNetworkEntity) rt1VarN.J(serialDescriptor, 2, ss5VarArr[2].getValue(), benchmarkMeasureTypeNetworkEntity);
                    i |= 4;
                    break;
                case 3:
                    d = (Double) rt1VarN.L(serialDescriptor, 3, n43.a, d);
                    i |= 8;
                    break;
                case 4:
                    unitsNetworkEntity = (UnitsNetworkEntity) rt1VarN.J(serialDescriptor, 4, n2b.a, unitsNetworkEntity);
                    i |= 16;
                    break;
                case 5:
                    str = (String) rt1VarN.L(serialDescriptor, 5, o2a.a, str);
                    i |= 32;
                    break;
                default:
                    ll.a(iG0);
                    return null;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new BenchmarkNetworkEntity(i, iR, strC0, benchmarkMeasureTypeNetworkEntity, d, unitsNetworkEntity, str);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, BenchmarkNetworkEntity benchmarkNetworkEntity) {
        encoder.getClass();
        benchmarkNetworkEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = BenchmarkNetworkEntity.z;
        int i = benchmarkNetworkEntity.t;
        String str = benchmarkNetworkEntity.y;
        Double d = benchmarkNetworkEntity.w;
        st1VarN.g(0, i, serialDescriptor);
        st1VarN.p(serialDescriptor, 1, benchmarkNetworkEntity.u);
        st1VarN.q(serialDescriptor, 2, ss5VarArr[2].getValue(), benchmarkNetworkEntity.v);
        if (st1VarN.C(serialDescriptor) || d != null) {
            st1VarN.z(serialDescriptor, 3, n43.a, d);
        }
        st1VarN.q(serialDescriptor, 4, n2b.a, benchmarkNetworkEntity.x);
        if (st1VarN.C(serialDescriptor) || str != null) {
            st1VarN.z(serialDescriptor, 5, o2a.a, str);
        }
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
