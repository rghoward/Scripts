package com.hwpo_training_app.core.domain.model.auth;

import com.hwpo_training_app.core.data.model.user.UserNetworkEntity;
import com.hwpo_training_app.core.data.model.user.UserNetworkEntity$$serializer;
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
public final /* synthetic */ class AuthResponse$$serializer implements gk4<AuthResponse> {
    public static final AuthResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AuthResponse$$serializer authResponse$$serializer = new AuthResponse$$serializer();
        INSTANCE = authResponse$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.core.domain.model.auth.AuthResponse", authResponse$$serializer, 3);
        o48Var.k("access_token", false);
        o48Var.k("token_type", false);
        o48Var.k("current", false);
        descriptor = o48Var;
    }

    private AuthResponse$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        o2a o2aVar = o2a.a;
        return new KSerializer[]{o2aVar, o2aVar, UserNetworkEntity$$serializer.INSTANCE};
    }

    @Override // defpackage.sy2
    public final AuthResponse deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strC0 = null;
        String strC1 = null;
        UserNetworkEntity userNetworkEntity = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            if (iG0 == -1) {
                z = false;
            } else if (iG0 == 0) {
                strC0 = rt1VarN.c0(serialDescriptor, 0);
                i |= 1;
            } else if (iG0 == 1) {
                strC1 = rt1VarN.c0(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iG0 != 2) {
                    ll.a(iG0);
                    return null;
                }
                userNetworkEntity = (UserNetworkEntity) rt1VarN.J(serialDescriptor, 2, UserNetworkEntity$$serializer.INSTANCE, userNetworkEntity);
                i |= 4;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new AuthResponse(i, strC0, strC1, userNetworkEntity);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, AuthResponse authResponse) {
        encoder.getClass();
        authResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        st1VarN.p(serialDescriptor, 0, authResponse.a);
        st1VarN.p(serialDescriptor, 1, authResponse.b);
        st1VarN.q(serialDescriptor, 2, UserNetworkEntity$$serializer.INSTANCE, authResponse.c);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
