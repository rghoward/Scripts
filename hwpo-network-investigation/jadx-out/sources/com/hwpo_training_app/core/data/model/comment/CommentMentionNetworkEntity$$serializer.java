package com.hwpo_training_app.core.data.model.comment;

import defpackage.gk4;
import defpackage.gy2;
import defpackage.ig5;
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
public final /* synthetic */ class CommentMentionNetworkEntity$$serializer implements gk4<CommentMentionNetworkEntity> {
    public static final CommentMentionNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CommentMentionNetworkEntity$$serializer commentMentionNetworkEntity$$serializer = new CommentMentionNetworkEntity$$serializer();
        INSTANCE = commentMentionNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.core.data.model.comment.CommentMentionNetworkEntity", commentMentionNetworkEntity$$serializer, 2);
        o48Var.k("id", false);
        o48Var.k("name", false);
        descriptor = o48Var;
    }

    private CommentMentionNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{ig5.a, o2a.a};
    }

    @Override // defpackage.sy2
    public final CommentMentionNetworkEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iR = 0;
        String strC0 = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            if (iG0 == -1) {
                z = false;
            } else if (iG0 == 0) {
                iR = rt1VarN.R(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iG0 != 1) {
                    ll.a(iG0);
                    return null;
                }
                strC0 = rt1VarN.c0(serialDescriptor, 1);
                i |= 2;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new CommentMentionNetworkEntity(i, iR, strC0);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, CommentMentionNetworkEntity commentMentionNetworkEntity) {
        encoder.getClass();
        commentMentionNetworkEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        st1VarN.g(0, commentMentionNetworkEntity.t, serialDescriptor);
        st1VarN.p(serialDescriptor, 1, commentMentionNetworkEntity.u);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
