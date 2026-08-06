package com.hwpo_training_app.notifications.data.network.response;

import com.hwpo_training_app.core.data.model.pagination.CursorPaginationNetworkEntity;
import com.hwpo_training_app.core.data.model.pagination.CursorPaginationNetworkEntity$$serializer;
import com.hwpo_training_app.notifications.data.network.push.NotificationNetworkEntity;
import defpackage.gk4;
import defpackage.gy2;
import defpackage.ll;
import defpackage.o48;
import defpackage.p48;
import defpackage.rt1;
import defpackage.ry0;
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
public final /* synthetic */ class NotificationsResponse$$serializer implements gk4<NotificationsResponse> {
    public static final NotificationsResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        NotificationsResponse$$serializer notificationsResponse$$serializer = new NotificationsResponse$$serializer();
        INSTANCE = notificationsResponse$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.notifications.data.network.response.NotificationsResponse", notificationsResponse$$serializer, 2);
        o48Var.k("items", true);
        o48Var.k("pagination", false);
        descriptor = o48Var;
    }

    private NotificationsResponse$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{ry0.a(NotificationsResponse.c[0].getValue()), CursorPaginationNetworkEntity$$serializer.INSTANCE};
    }

    @Override // defpackage.sy2
    public final NotificationsResponse deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = NotificationsResponse.c;
        boolean z = true;
        int i = 0;
        List list = null;
        CursorPaginationNetworkEntity cursorPaginationNetworkEntity = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            if (iG0 == -1) {
                z = false;
            } else if (iG0 == 0) {
                list = (List) rt1VarN.L(serialDescriptor, 0, ss5VarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iG0 != 1) {
                    ll.a(iG0);
                    return null;
                }
                cursorPaginationNetworkEntity = (CursorPaginationNetworkEntity) rt1VarN.J(serialDescriptor, 1, CursorPaginationNetworkEntity$$serializer.INSTANCE, cursorPaginationNetworkEntity);
                i |= 2;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new NotificationsResponse(i, list, cursorPaginationNetworkEntity);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, NotificationsResponse notificationsResponse) {
        encoder.getClass();
        notificationsResponse.getClass();
        List<NotificationNetworkEntity> list = notificationsResponse.a;
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = NotificationsResponse.c;
        if (st1VarN.C(serialDescriptor) || list != null) {
            st1VarN.z(serialDescriptor, 0, ss5VarArr[0].getValue(), list);
        }
        st1VarN.q(serialDescriptor, 1, CursorPaginationNetworkEntity$$serializer.INSTANCE, notificationsResponse.b);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
