package com.hwpo_training_app.core.data.model.user;

import defpackage.gk4;
import defpackage.gy2;
import defpackage.ig5;
import defpackage.ll;
import defpackage.o2a;
import defpackage.o48;
import defpackage.p48;
import defpackage.rt1;
import defpackage.ry0;
import defpackage.st1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@gy2
public final /* synthetic */ class OpponentNetworkEntity$$serializer implements gk4<OpponentNetworkEntity> {
    public static final OpponentNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        OpponentNetworkEntity$$serializer opponentNetworkEntity$$serializer = new OpponentNetworkEntity$$serializer();
        INSTANCE = opponentNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.core.data.model.user.OpponentNetworkEntity", opponentNetworkEntity$$serializer, 5);
        o48Var.k("id", false);
        o48Var.k("full_name", false);
        o48Var.k("first_name", false);
        o48Var.k("last_name", false);
        o48Var.k("avatar_url", false);
        descriptor = o48Var;
    }

    private OpponentNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        o2a o2aVar = o2a.a;
        return new KSerializer[]{ig5.a, o2aVar, ry0.a(o2aVar), ry0.a(o2aVar), ry0.a(o2aVar)};
    }

    @Override // defpackage.sy2
    public final OpponentNetworkEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iR = 0;
        String strC0 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
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
                str = (String) rt1VarN.L(serialDescriptor, 2, o2a.a, str);
                i |= 4;
            } else if (iG0 == 3) {
                str2 = (String) rt1VarN.L(serialDescriptor, 3, o2a.a, str2);
                i |= 8;
            } else {
                if (iG0 != 4) {
                    ll.a(iG0);
                    return null;
                }
                str3 = (String) rt1VarN.L(serialDescriptor, 4, o2a.a, str3);
                i |= 16;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new OpponentNetworkEntity(strC0, str, str2, str3, i, iR);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, OpponentNetworkEntity opponentNetworkEntity) {
        encoder.getClass();
        opponentNetworkEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        st1VarN.g(0, opponentNetworkEntity.t, serialDescriptor);
        st1VarN.p(serialDescriptor, 1, opponentNetworkEntity.u);
        o2a o2aVar = o2a.a;
        st1VarN.z(serialDescriptor, 2, o2aVar, opponentNetworkEntity.v);
        st1VarN.z(serialDescriptor, 3, o2aVar, opponentNetworkEntity.w);
        st1VarN.z(serialDescriptor, 4, o2aVar, opponentNetworkEntity.x);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
