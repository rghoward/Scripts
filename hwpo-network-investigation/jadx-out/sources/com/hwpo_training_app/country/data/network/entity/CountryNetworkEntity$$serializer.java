package com.hwpo_training_app.country.data.network.entity;

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
public final /* synthetic */ class CountryNetworkEntity$$serializer implements gk4<CountryNetworkEntity> {
    public static final CountryNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CountryNetworkEntity$$serializer countryNetworkEntity$$serializer = new CountryNetworkEntity$$serializer();
        INSTANCE = countryNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.country.data.network.entity.CountryNetworkEntity", countryNetworkEntity$$serializer, 2);
        o48Var.k("code", false);
        o48Var.k("name", false);
        descriptor = o48Var;
    }

    private CountryNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        o2a o2aVar = o2a.a;
        return new KSerializer[]{o2aVar, o2aVar};
    }

    @Override // defpackage.sy2
    public final CountryNetworkEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strC0 = null;
        String strC1 = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            if (iG0 == -1) {
                z = false;
            } else if (iG0 == 0) {
                strC0 = rt1VarN.c0(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iG0 != 1) {
                    ll.a(iG0);
                    return null;
                }
                strC1 = rt1VarN.c0(serialDescriptor, 1);
                i |= 2;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new CountryNetworkEntity(i, strC0, strC1);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, CountryNetworkEntity countryNetworkEntity) {
        encoder.getClass();
        countryNetworkEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        st1VarN.p(serialDescriptor, 0, countryNetworkEntity.a);
        st1VarN.p(serialDescriptor, 1, countryNetworkEntity.b);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
