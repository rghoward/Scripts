package com.hwpo_training_app.core.data.model;

import defpackage.gk4;
import defpackage.gy2;
import defpackage.ll;
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
/* JADX INFO: loaded from: classes.dex */
@gy2
public final /* synthetic */ class ApiError$$serializer implements gk4<ApiError> {
    public static final ApiError$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ApiError$$serializer apiError$$serializer = new ApiError$$serializer();
        INSTANCE = apiError$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.core.data.model.ApiError", apiError$$serializer, 2);
        o48Var.k("detail", false);
        o48Var.k("placement", false);
        descriptor = o48Var;
    }

    private ApiError$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{o2a.a, ApiError.v[1].getValue()};
    }

    @Override // defpackage.sy2
    public final ApiError deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = ApiError.v;
        boolean z = true;
        int i = 0;
        String strC0 = null;
        ApiError.Placement placement = null;
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
                placement = (ApiError.Placement) rt1VarN.J(serialDescriptor, 1, ss5VarArr[1].getValue(), placement);
                i |= 2;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new ApiError(i, strC0, placement);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, ApiError apiError) {
        encoder.getClass();
        apiError.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = ApiError.v;
        st1VarN.p(serialDescriptor, 0, apiError.t);
        st1VarN.q(serialDescriptor, 1, ss5VarArr[1].getValue(), apiError.u);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
