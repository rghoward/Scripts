package defpackage;

import com.hwpo_training_app.notifications.data.network.push.NotificationNetworkEntity;
import com.hwpo_training_app.notifications.data.network.push.NotificationTypeNetworkEntity;
import java.util.Arrays;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class yl5<T> implements KSerializer<T> {
    public final sd1 a;
    public final ld9 b;

    public yl5(sd1 sd1Var) {
        this.a = sd1Var;
        this.b = od9.c("JsonContentPolymorphicSerializer<" + sd1Var.c() + '>', p58.b.a, new SerialDescriptor[0]);
    }

    @Override // defpackage.sy2
    public final T deserialize(Decoder decoder) {
        String strD;
        KSerializer<NotificationNetworkEntity.LeaderboardCommentNotificationNetworkEntity> kSerializerSerializer;
        em5 em5VarF = hu1.f(decoder);
        JsonElement jsonElementM = em5VarF.M();
        jsonElementM.getClass();
        JsonElement jsonElement = (JsonElement) hm5.b(jsonElementM).get("notification_type");
        if (jsonElement == null || (strD = hm5.c(jsonElement).d()) == null) {
            throw new td9("key 'notification_type' not found or does not matches any module type");
        }
        NotificationTypeNetworkEntity.Companion.getClass();
        for (NotificationTypeNetworkEntity notificationTypeNetworkEntity : NotificationTypeNetworkEntity.values()) {
            if (notificationTypeNetworkEntity.t.equals(strD)) {
                int iOrdinal = notificationTypeNetworkEntity.ordinal();
                if (iOrdinal == 0) {
                    kSerializerSerializer = NotificationNetworkEntity.LeaderboardCommentNotificationNetworkEntity.Companion.serializer();
                } else if (iOrdinal == 1) {
                    kSerializerSerializer = NotificationNetworkEntity.LeaderboardCommentMentionedNotificationNetworkEntity.Companion.serializer();
                } else {
                    if (iOrdinal != 2) {
                        u.b();
                        return null;
                    }
                    kSerializerSerializer = NotificationNetworkEntity.ClientBonusPlanRemindNotificationNetworkEntity.Companion.serializer();
                }
                kSerializerSerializer.getClass();
                return (T) em5VarF.l0().a((KSerializer) kSerializerSerializer, jsonElementM);
            }
        }
        px1.b("Array contains no element matching the predicate.");
        return null;
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, T t) {
        t.getClass();
        ln4 ln4VarK = encoder.k();
        sd1 sd1Var = this.a;
        KSerializer kSerializerP0 = ln4VarK.P0(sd1Var, t);
        if (kSerializerP0 == null) {
            sd1 sd1VarA = ll8.a(t.getClass());
            KSerializer kSerializerA = v08.a(me3.b(sd1VarA), (KSerializer[]) Arrays.copyOf(new KSerializer[0], 0));
            if (kSerializerA == null) {
                kSerializerA = (KSerializer) n98.a.get(sd1VarA);
            }
            if (kSerializerA == null) {
                sd1 sd1VarA2 = ll8.a(t.getClass());
                String strC = sd1VarA2.c();
                if (strC == null) {
                    strC = String.valueOf(sd1VarA2);
                }
                throw new td9(op3.a("Class '", strC, "' is not registered for polymorphic serialization ", "in the scope of '" + sd1Var.c() + '\'', ".\nMark the base class as 'sealed' or register the serializer explicitly."));
            }
            kSerializerP0 = kSerializerA;
        }
        ((KSerializer) kSerializerP0).serialize(encoder, t);
    }
}
