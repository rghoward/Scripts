package com.hwpo_training_app.core.data.model.pagination;

import defpackage.gk4;
import defpackage.gy2;
import defpackage.ig5;
import defpackage.ll;
import defpackage.o48;
import defpackage.p48;
import defpackage.rt1;
import defpackage.ry0;
import defpackage.st1;
import defpackage.ue6;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@gy2
public final /* synthetic */ class CursorPaginationNetworkEntity$$serializer implements gk4<CursorPaginationNetworkEntity> {
    public static final CursorPaginationNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CursorPaginationNetworkEntity$$serializer cursorPaginationNetworkEntity$$serializer = new CursorPaginationNetworkEntity$$serializer();
        INSTANCE = cursorPaginationNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.core.data.model.pagination.CursorPaginationNetworkEntity", cursorPaginationNetworkEntity$$serializer, 4);
        o48Var.k("after", false);
        o48Var.k("before", false);
        o48Var.k("size", false);
        o48Var.k("limit", false);
        descriptor = o48Var;
    }

    private CursorPaginationNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        ue6 ue6Var = ue6.a;
        KSerializer<?> kSerializerA = ry0.a(ue6Var);
        KSerializer<?> kSerializerA2 = ry0.a(ue6Var);
        ig5 ig5Var = ig5.a;
        return new KSerializer[]{kSerializerA, kSerializerA2, ig5Var, ig5Var};
    }

    @Override // defpackage.sy2
    public final CursorPaginationNetworkEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iR = 0;
        int iR2 = 0;
        Long l = null;
        Long l2 = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            if (iG0 == -1) {
                z = false;
            } else if (iG0 == 0) {
                l = (Long) rt1VarN.L(serialDescriptor, 0, ue6.a, l);
                i |= 1;
            } else if (iG0 == 1) {
                l2 = (Long) rt1VarN.L(serialDescriptor, 1, ue6.a, l2);
                i |= 2;
            } else if (iG0 == 2) {
                iR = rt1VarN.R(serialDescriptor, 2);
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
        return new CursorPaginationNetworkEntity(i, l, l2, iR, iR2);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, CursorPaginationNetworkEntity cursorPaginationNetworkEntity) {
        encoder.getClass();
        cursorPaginationNetworkEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        ue6 ue6Var = ue6.a;
        st1VarN.z(serialDescriptor, 0, ue6Var, cursorPaginationNetworkEntity.a);
        st1VarN.z(serialDescriptor, 1, ue6Var, cursorPaginationNetworkEntity.b);
        st1VarN.g(2, cursorPaginationNetworkEntity.c, serialDescriptor);
        st1VarN.g(3, cursorPaginationNetworkEntity.d, serialDescriptor);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
