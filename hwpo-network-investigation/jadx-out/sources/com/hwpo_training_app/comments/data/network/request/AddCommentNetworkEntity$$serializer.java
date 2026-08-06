package com.hwpo_training_app.comments.data.network.request;

import defpackage.gk4;
import defpackage.gy2;
import defpackage.ll;
import defpackage.o2a;
import defpackage.o48;
import defpackage.p48;
import defpackage.rt1;
import defpackage.ry0;
import defpackage.ss5;
import defpackage.st1;
import io.intercom.android.sdk.models.AttributeType;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@gy2
public final /* synthetic */ class AddCommentNetworkEntity$$serializer implements gk4<AddCommentNetworkEntity> {
    public static final AddCommentNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AddCommentNetworkEntity$$serializer addCommentNetworkEntity$$serializer = new AddCommentNetworkEntity$$serializer();
        INSTANCE = addCommentNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.comments.data.network.request.AddCommentNetworkEntity", addCommentNetworkEntity$$serializer, 2);
        o48Var.k(AttributeType.TEXT, false);
        o48Var.k("attachment_ids", true);
        descriptor = o48Var;
    }

    private AddCommentNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{ry0.a(o2a.a), ry0.a(AddCommentNetworkEntity.c[1].getValue())};
    }

    @Override // defpackage.sy2
    public final AddCommentNetworkEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = AddCommentNetworkEntity.c;
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            if (iG0 == -1) {
                z = false;
            } else if (iG0 == 0) {
                str = (String) rt1VarN.L(serialDescriptor, 0, o2a.a, str);
                i |= 1;
            } else {
                if (iG0 != 1) {
                    ll.a(iG0);
                    return null;
                }
                list = (List) rt1VarN.L(serialDescriptor, 1, ss5VarArr[1].getValue(), list);
                i |= 2;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new AddCommentNetworkEntity(i, str, list);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, AddCommentNetworkEntity addCommentNetworkEntity) {
        encoder.getClass();
        addCommentNetworkEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = AddCommentNetworkEntity.c;
        o2a o2aVar = o2a.a;
        String str = addCommentNetworkEntity.a;
        List<Long> list = addCommentNetworkEntity.b;
        st1VarN.z(serialDescriptor, 0, o2aVar, str);
        if (st1VarN.C(serialDescriptor) || list != null) {
            st1VarN.z(serialDescriptor, 1, ss5VarArr[1].getValue(), list);
        }
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
