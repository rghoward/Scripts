package com.hwpo_training_app.comments.data.network.request;

import defpackage.gk4;
import defpackage.gy2;
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
/* JADX INFO: loaded from: classes.dex */
@gy2
public final /* synthetic */ class AddCommentRequest$$serializer implements gk4<AddCommentRequest> {
    public static final AddCommentRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AddCommentRequest$$serializer addCommentRequest$$serializer = new AddCommentRequest$$serializer();
        INSTANCE = addCommentRequest$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.comments.data.network.request.AddCommentRequest", addCommentRequest$$serializer, 1);
        o48Var.k("comment", false);
        descriptor = o48Var;
    }

    private AddCommentRequest$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{AddCommentNetworkEntity$$serializer.INSTANCE};
    }

    @Override // defpackage.sy2
    public final AddCommentRequest deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        boolean z = true;
        int i = 0;
        AddCommentNetworkEntity addCommentNetworkEntity = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            if (iG0 == -1) {
                z = false;
            } else {
                if (iG0 != 0) {
                    ll.a(iG0);
                    return null;
                }
                addCommentNetworkEntity = (AddCommentNetworkEntity) rt1VarN.J(serialDescriptor, 0, AddCommentNetworkEntity$$serializer.INSTANCE, addCommentNetworkEntity);
                i = 1;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new AddCommentRequest(i, addCommentNetworkEntity);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, AddCommentRequest addCommentRequest) {
        encoder.getClass();
        addCommentRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        st1VarN.q(serialDescriptor, 0, AddCommentNetworkEntity$$serializer.INSTANCE, addCommentRequest.a);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
