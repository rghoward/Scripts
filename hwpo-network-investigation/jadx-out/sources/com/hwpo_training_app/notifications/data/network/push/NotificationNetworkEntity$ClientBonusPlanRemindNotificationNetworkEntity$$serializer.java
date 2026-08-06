package com.hwpo_training_app.notifications.data.network.push;

import com.hwpo_training_app.core.data.model.schedule.PlanNetworkEntity;
import com.hwpo_training_app.core.data.model.schedule.PlanNetworkEntity$$serializer;
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
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.Participant;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@gy2
public final /* synthetic */ class NotificationNetworkEntity$ClientBonusPlanRemindNotificationNetworkEntity$$serializer implements gk4<NotificationNetworkEntity.ClientBonusPlanRemindNotificationNetworkEntity> {
    public static final NotificationNetworkEntity$ClientBonusPlanRemindNotificationNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        NotificationNetworkEntity$ClientBonusPlanRemindNotificationNetworkEntity$$serializer notificationNetworkEntity$ClientBonusPlanRemindNotificationNetworkEntity$$serializer = new NotificationNetworkEntity$ClientBonusPlanRemindNotificationNetworkEntity$$serializer();
        INSTANCE = notificationNetworkEntity$ClientBonusPlanRemindNotificationNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.notifications.data.network.push.NotificationNetworkEntity.ClientBonusPlanRemindNotificationNetworkEntity", notificationNetworkEntity$ClientBonusPlanRemindNotificationNetworkEntity$$serializer, 10);
        o48Var.k("id", false);
        o48Var.k("read", false);
        o48Var.k("notification_type", false);
        o48Var.k("user_type", false);
        o48Var.k("activity_type", false);
        o48Var.k("plan", true);
        o48Var.k("created_at", false);
        o48Var.k("title", false);
        o48Var.k(AttributeType.TEXT, false);
        o48Var.k(Participant.USER_TYPE, false);
        descriptor = o48Var;
    }

    private NotificationNetworkEntity$ClientBonusPlanRemindNotificationNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        ss5<KSerializer<Object>>[] ss5VarArr = NotificationNetworkEntity.ClientBonusPlanRemindNotificationNetworkEntity.D;
        ue6 ue6Var = ue6.a;
        o2a o2aVar = o2a.a;
        return new KSerializer[]{ue6Var, is0.a, ss5VarArr[2].getValue(), ry0.a(o2aVar), ry0.a(o2aVar), ry0.a(PlanNetworkEntity$$serializer.INSTANCE), ue6Var, ry0.a(o2aVar), ry0.a(o2aVar), OpponentNetworkEntity$$serializer.INSTANCE};
    }

    @Override // defpackage.sy2
    public final NotificationNetworkEntity.ClientBonusPlanRemindNotificationNetworkEntity deserialize(Decoder decoder) {
        ss5<KSerializer<Object>>[] ss5VarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr2 = NotificationNetworkEntity.ClientBonusPlanRemindNotificationNetworkEntity.D;
        long jG = 0;
        long jG2 = 0;
        OpponentNetworkEntity opponentNetworkEntity = null;
        boolean z = true;
        PlanNetworkEntity planNetworkEntity = null;
        String str = null;
        String str2 = null;
        int i = 0;
        boolean zA0 = false;
        NotificationTypeNetworkEntity notificationTypeNetworkEntity = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            switch (iG0) {
                case -1:
                    ss5VarArr = ss5VarArr2;
                    z = false;
                    break;
                case 0:
                    ss5VarArr = ss5VarArr2;
                    jG = rt1VarN.G(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    ss5VarArr = ss5VarArr2;
                    zA0 = rt1VarN.a0(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    ss5VarArr = ss5VarArr2;
                    notificationTypeNetworkEntity = (NotificationTypeNetworkEntity) rt1VarN.J(serialDescriptor, 2, ss5VarArr[2].getValue(), notificationTypeNetworkEntity);
                    i |= 4;
                    break;
                case 3:
                    ss5VarArr = ss5VarArr2;
                    str3 = (String) rt1VarN.L(serialDescriptor, 3, o2a.a, str3);
                    i |= 8;
                    break;
                case 4:
                    ss5VarArr = ss5VarArr2;
                    str4 = (String) rt1VarN.L(serialDescriptor, 4, o2a.a, str4);
                    i |= 16;
                    break;
                case 5:
                    ss5VarArr = ss5VarArr2;
                    planNetworkEntity = (PlanNetworkEntity) rt1VarN.L(serialDescriptor, 5, PlanNetworkEntity$$serializer.INSTANCE, planNetworkEntity);
                    i |= 32;
                    break;
                case 6:
                    ss5VarArr = ss5VarArr2;
                    jG2 = rt1VarN.G(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    ss5VarArr = ss5VarArr2;
                    str2 = (String) rt1VarN.L(serialDescriptor, 7, o2a.a, str2);
                    i |= 128;
                    break;
                case 8:
                    ss5VarArr = ss5VarArr2;
                    str = (String) rt1VarN.L(serialDescriptor, 8, o2a.a, str);
                    i |= 256;
                    break;
                case 9:
                    ss5VarArr = ss5VarArr2;
                    opponentNetworkEntity = (OpponentNetworkEntity) rt1VarN.J(serialDescriptor, 9, OpponentNetworkEntity$$serializer.INSTANCE, opponentNetworkEntity);
                    i |= 512;
                    break;
                default:
                    ll.a(iG0);
                    return null;
            }
            ss5VarArr2 = ss5VarArr;
        }
        rt1VarN.i(serialDescriptor);
        return new NotificationNetworkEntity.ClientBonusPlanRemindNotificationNetworkEntity(i, jG, zA0, notificationTypeNetworkEntity, str3, str4, planNetworkEntity, jG2, str2, str, opponentNetworkEntity);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, NotificationNetworkEntity.ClientBonusPlanRemindNotificationNetworkEntity clientBonusPlanRemindNotificationNetworkEntity) {
        encoder.getClass();
        clientBonusPlanRemindNotificationNetworkEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = NotificationNetworkEntity.ClientBonusPlanRemindNotificationNetworkEntity.D;
        long j = clientBonusPlanRemindNotificationNetworkEntity.t;
        PlanNetworkEntity planNetworkEntity = clientBonusPlanRemindNotificationNetworkEntity.y;
        st1VarN.B(serialDescriptor, 0, j);
        st1VarN.o(serialDescriptor, 1, clientBonusPlanRemindNotificationNetworkEntity.u);
        st1VarN.q(serialDescriptor, 2, ss5VarArr[2].getValue(), clientBonusPlanRemindNotificationNetworkEntity.v);
        o2a o2aVar = o2a.a;
        st1VarN.z(serialDescriptor, 3, o2aVar, clientBonusPlanRemindNotificationNetworkEntity.w);
        st1VarN.z(serialDescriptor, 4, o2aVar, clientBonusPlanRemindNotificationNetworkEntity.x);
        if (st1VarN.C(serialDescriptor) || planNetworkEntity != null) {
            st1VarN.z(serialDescriptor, 5, PlanNetworkEntity$$serializer.INSTANCE, planNetworkEntity);
        }
        st1VarN.B(serialDescriptor, 6, clientBonusPlanRemindNotificationNetworkEntity.z);
        st1VarN.z(serialDescriptor, 7, o2aVar, clientBonusPlanRemindNotificationNetworkEntity.A);
        st1VarN.z(serialDescriptor, 8, o2aVar, clientBonusPlanRemindNotificationNetworkEntity.B);
        st1VarN.q(serialDescriptor, 9, OpponentNetworkEntity$$serializer.INSTANCE, clientBonusPlanRemindNotificationNetworkEntity.C);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
