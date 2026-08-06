package com.hwpo_training_app.notifications.data.network.response;

import defpackage.gk4;
import defpackage.gy2;
import defpackage.ll;
import defpackage.o48;
import defpackage.p48;
import defpackage.rt1;
import defpackage.ss5;
import defpackage.st1;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@gy2
public final /* synthetic */ class ReadNotificationsNetworkEntity$$serializer implements gk4<ReadNotificationsNetworkEntity> {
    public static final ReadNotificationsNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ReadNotificationsNetworkEntity$$serializer readNotificationsNetworkEntity$$serializer = new ReadNotificationsNetworkEntity$$serializer();
        INSTANCE = readNotificationsNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.notifications.data.network.response.ReadNotificationsNetworkEntity", readNotificationsNetworkEntity$$serializer, 1);
        o48Var.k("ids", false);
        descriptor = o48Var;
    }

    private ReadNotificationsNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{ReadNotificationsNetworkEntity.u[0].getValue()};
    }

    @Override // defpackage.sy2
    public final ReadNotificationsNetworkEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = ReadNotificationsNetworkEntity.u;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            if (iG0 == -1) {
                z = false;
            } else {
                if (iG0 != 0) {
                    ll.a(iG0);
                    return null;
                }
                list = (List) rt1VarN.J(serialDescriptor, 0, ss5VarArr[0].getValue(), list);
                i = 1;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new ReadNotificationsNetworkEntity(i, list);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, ReadNotificationsNetworkEntity readNotificationsNetworkEntity) {
        encoder.getClass();
        readNotificationsNetworkEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        st1VarN.q(serialDescriptor, 0, ReadNotificationsNetworkEntity.u[0].getValue(), readNotificationsNetworkEntity.t);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
