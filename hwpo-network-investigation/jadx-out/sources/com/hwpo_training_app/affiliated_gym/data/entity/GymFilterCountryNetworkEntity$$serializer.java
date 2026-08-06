package com.hwpo_training_app.affiliated_gym.data.entity;

import defpackage.gk4;
import defpackage.gy2;
import defpackage.ll;
import defpackage.o2a;
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
public final /* synthetic */ class GymFilterCountryNetworkEntity$$serializer implements gk4<GymFilterCountryNetworkEntity> {
    public static final GymFilterCountryNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        GymFilterCountryNetworkEntity$$serializer gymFilterCountryNetworkEntity$$serializer = new GymFilterCountryNetworkEntity$$serializer();
        INSTANCE = gymFilterCountryNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.affiliated_gym.data.entity.GymFilterCountryNetworkEntity", gymFilterCountryNetworkEntity$$serializer, 1);
        o48Var.k("country", false);
        descriptor = o48Var;
    }

    private GymFilterCountryNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{o2a.a};
    }

    @Override // defpackage.sy2
    public final GymFilterCountryNetworkEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strC0 = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            if (iG0 == -1) {
                z = false;
            } else {
                if (iG0 != 0) {
                    ll.a(iG0);
                    return null;
                }
                strC0 = rt1VarN.c0(serialDescriptor, 0);
                i = 1;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new GymFilterCountryNetworkEntity(i, strC0);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, GymFilterCountryNetworkEntity gymFilterCountryNetworkEntity) {
        encoder.getClass();
        gymFilterCountryNetworkEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        st1VarN.p(serialDescriptor, 0, gymFilterCountryNetworkEntity.t);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
