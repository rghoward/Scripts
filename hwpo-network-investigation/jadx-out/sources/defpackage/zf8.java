package defpackage;

import com.hwpo_training_app.notifications.data.network.push.NotificationNetworkEntity;
import com.hwpo_training_app.notifications.domain.entity.NotificationModel;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zf8 extends g5b<String, NotificationModel> {
    public final sl5 a;

    public zf8(sl5 sl5Var) {
        sl5Var.getClass();
        this.a = sl5Var;
    }

    @Override // defpackage.g5b
    public final Object a(Object obj, g5b.b bVar) {
        KSerializer<NotificationNetworkEntity> kSerializerSerializer = NotificationNetworkEntity.Companion.serializer();
        return ((NotificationNetworkEntity) this.a.b(kSerializerSerializer, (String) obj)).a();
    }
}
