package com.hwpo_training_app.tracking.data.entity;

import defpackage.gk4;
import defpackage.gy2;
import defpackage.ig5;
import defpackage.is0;
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
public final /* synthetic */ class ChartPaginationNetworkEntity$$serializer implements gk4<ChartPaginationNetworkEntity> {
    public static final ChartPaginationNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChartPaginationNetworkEntity$$serializer chartPaginationNetworkEntity$$serializer = new ChartPaginationNetworkEntity$$serializer();
        INSTANCE = chartPaginationNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.tracking.data.entity.ChartPaginationNetworkEntity", chartPaginationNetworkEntity$$serializer, 4);
        o48Var.k("size", false);
        o48Var.k("has_more", false);
        o48Var.k("has_less", false);
        o48Var.k("limit", false);
        descriptor = o48Var;
    }

    private ChartPaginationNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        ig5 ig5Var = ig5.a;
        is0 is0Var = is0.a;
        return new KSerializer[]{ig5Var, is0Var, is0Var, ig5Var};
    }

    @Override // defpackage.sy2
    public final ChartPaginationNetworkEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iR = 0;
        int iR2 = 0;
        boolean zA0 = false;
        boolean zA1 = false;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            if (iG0 == -1) {
                z = false;
            } else if (iG0 == 0) {
                iR = rt1VarN.R(serialDescriptor, 0);
                i |= 1;
            } else if (iG0 == 1) {
                zA0 = rt1VarN.a0(serialDescriptor, 1);
                i |= 2;
            } else if (iG0 == 2) {
                zA1 = rt1VarN.a0(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iG0 != 3) {
                    ll.a(iG0);
                    return null;
                }
                iR2 = rt1VarN.R(serialDescriptor, 3);
                i |= 8;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new ChartPaginationNetworkEntity(i, iR, iR2, zA0, zA1);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, ChartPaginationNetworkEntity chartPaginationNetworkEntity) {
        encoder.getClass();
        chartPaginationNetworkEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        st1VarN.g(0, chartPaginationNetworkEntity.a, serialDescriptor);
        st1VarN.o(serialDescriptor, 1, chartPaginationNetworkEntity.b);
        st1VarN.o(serialDescriptor, 2, chartPaginationNetworkEntity.c);
        st1VarN.g(3, chartPaginationNetworkEntity.d, serialDescriptor);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
