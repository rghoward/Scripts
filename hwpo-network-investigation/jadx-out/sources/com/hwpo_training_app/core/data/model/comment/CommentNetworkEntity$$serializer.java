package com.hwpo_training_app.core.data.model.comment;

import com.hwpo_training_app.core.data.model.attachments.SectionAttachmentNetworkEntity;
import com.hwpo_training_app.core.data.model.user.OpponentNetworkEntity;
import com.hwpo_training_app.core.data.model.user.OpponentNetworkEntity$$serializer;
import defpackage.gk4;
import defpackage.gy2;
import defpackage.is0;
import defpackage.ll;
import defpackage.o2a;
import defpackage.o48;
import defpackage.p48;
import defpackage.rt1;
import defpackage.ry0;
import defpackage.ss5;
import defpackage.st1;
import defpackage.ue6;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@gy2
public final /* synthetic */ class CommentNetworkEntity$$serializer implements gk4<CommentNetworkEntity> {
    public static final CommentNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CommentNetworkEntity$$serializer commentNetworkEntity$$serializer = new CommentNetworkEntity$$serializer();
        INSTANCE = commentNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.core.data.model.comment.CommentNetworkEntity", commentNetworkEntity$$serializer, 7);
        o48Var.k("id", false);
        o48Var.k("formatted_text", true);
        o48Var.k("read", true);
        o48Var.k("created_at", false);
        o48Var.k("owner", false);
        o48Var.k("attachments", true);
        o48Var.k("mentions", true);
        descriptor = o48Var;
    }

    private CommentNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        ss5<KSerializer<Object>>[] ss5VarArr = CommentNetworkEntity.A;
        KSerializer<?> kSerializerA = ry0.a(o2a.a);
        KSerializer<?> kSerializerA2 = ry0.a(is0.a);
        KSerializer<?> kSerializerA3 = ry0.a(ss5VarArr[5].getValue());
        KSerializer<?> kSerializerA4 = ry0.a(ss5VarArr[6].getValue());
        ue6 ue6Var = ue6.a;
        return new KSerializer[]{ue6Var, kSerializerA, kSerializerA2, ue6Var, OpponentNetworkEntity$$serializer.INSTANCE, kSerializerA3, kSerializerA4};
    }

    @Override // defpackage.sy2
    public final CommentNetworkEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = CommentNetworkEntity.A;
        long jG = 0;
        long jG2 = 0;
        boolean z = true;
        OpponentNetworkEntity opponentNetworkEntity = null;
        List list = null;
        List list2 = null;
        int i = 0;
        String str = null;
        Boolean bool = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            switch (iG0) {
                case -1:
                    z = false;
                    break;
                case 0:
                    jG = rt1VarN.G(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str = (String) rt1VarN.L(serialDescriptor, 1, o2a.a, str);
                    i |= 2;
                    break;
                case 2:
                    bool = (Boolean) rt1VarN.L(serialDescriptor, 2, is0.a, bool);
                    i |= 4;
                    break;
                case 3:
                    jG2 = rt1VarN.G(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    opponentNetworkEntity = (OpponentNetworkEntity) rt1VarN.J(serialDescriptor, 4, OpponentNetworkEntity$$serializer.INSTANCE, opponentNetworkEntity);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) rt1VarN.L(serialDescriptor, 5, ss5VarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                case 6:
                    list = (List) rt1VarN.L(serialDescriptor, 6, ss5VarArr[6].getValue(), list);
                    i |= 64;
                    break;
                default:
                    ll.a(iG0);
                    return null;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new CommentNetworkEntity(i, jG, str, bool, jG2, opponentNetworkEntity, list2, list);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, CommentNetworkEntity commentNetworkEntity) {
        encoder.getClass();
        commentNetworkEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = CommentNetworkEntity.A;
        long j = commentNetworkEntity.t;
        List<CommentMentionNetworkEntity> list = commentNetworkEntity.z;
        List<SectionAttachmentNetworkEntity> list2 = commentNetworkEntity.y;
        Boolean bool = commentNetworkEntity.v;
        String str = commentNetworkEntity.u;
        st1VarN.B(serialDescriptor, 0, j);
        if (st1VarN.C(serialDescriptor) || str != null) {
            st1VarN.z(serialDescriptor, 1, o2a.a, str);
        }
        if (st1VarN.C(serialDescriptor) || bool != null) {
            st1VarN.z(serialDescriptor, 2, is0.a, bool);
        }
        st1VarN.B(serialDescriptor, 3, commentNetworkEntity.w);
        st1VarN.q(serialDescriptor, 4, OpponentNetworkEntity$$serializer.INSTANCE, commentNetworkEntity.x);
        if (st1VarN.C(serialDescriptor) || list2 != null) {
            st1VarN.z(serialDescriptor, 5, ss5VarArr[5].getValue(), list2);
        }
        if (st1VarN.C(serialDescriptor) || list != null) {
            st1VarN.z(serialDescriptor, 6, ss5VarArr[6].getValue(), list);
        }
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
