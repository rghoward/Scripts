package com.hwpo_training_app.notifications.data.network.response;

import com.hwpo_training_app.core.data.model.pagination.CursorPaginationNetworkEntity;
import com.hwpo_training_app.notifications.data.network.push.NotificationNetworkEntity;
import defpackage.hl3;
import defpackage.hv5;
import defpackage.j26;
import defpackage.rd9;
import defpackage.ss5;
import defpackage.xj5;
import defpackage.yn0;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class NotificationsResponse {
    public static final Companion Companion = new Companion(0);
    public static final ss5<KSerializer<Object>>[] c = {hv5.c(j26.t, new yn0(1)), null};
    public final List<NotificationNetworkEntity> a;
    public final CursorPaginationNetworkEntity b;

    public /* synthetic */ NotificationsResponse(int i, List list, CursorPaginationNetworkEntity cursorPaginationNetworkEntity) {
        if (2 != (i & 2)) {
            hl3.b(i, 2, NotificationsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
        this.b = cursorPaginationNetworkEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsResponse)) {
            return false;
        }
        NotificationsResponse notificationsResponse = (NotificationsResponse) obj;
        return xj5.a(this.a, notificationsResponse.a) && xj5.a(this.b, notificationsResponse.b);
    }

    public final int hashCode() {
        List<NotificationNetworkEntity> list = this.a;
        return this.b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "NotificationsResponse(items=" + this.a + ", paginationNetworkEntity=" + this.b + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public final KSerializer<NotificationsResponse> serializer() {
            return NotificationsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
