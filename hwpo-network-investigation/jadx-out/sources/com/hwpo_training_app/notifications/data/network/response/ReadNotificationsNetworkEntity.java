package com.hwpo_training_app.notifications.data.network.response;

import com.hwpo_training_app.notifications.domain.entity.ReadNotifications;
import defpackage.ei8;
import defpackage.f93;
import defpackage.hl3;
import defpackage.hv5;
import defpackage.j26;
import defpackage.rd9;
import defpackage.ss5;
import defpackage.xj5;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class ReadNotificationsNetworkEntity implements f93<ReadNotifications> {
    public static final Companion Companion = new Companion(0);
    public static final ss5<KSerializer<Object>>[] u = {hv5.c(j26.t, new ei8())};
    public final List<Long> t;

    public /* synthetic */ ReadNotificationsNetworkEntity(int i, List list) {
        if (1 == (i & 1)) {
            this.t = list;
        } else {
            hl3.b(i, 1, ReadNotificationsNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    @Override // defpackage.f93
    public final ReadNotifications a() {
        return new ReadNotifications(this.t);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReadNotificationsNetworkEntity) && xj5.a(this.t, ((ReadNotificationsNetworkEntity) obj).t);
    }

    public final int hashCode() {
        return this.t.hashCode();
    }

    public final String toString() {
        return "ReadNotificationsNetworkEntity(unreadIds=" + this.t + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public final KSerializer<ReadNotificationsNetworkEntity> serializer() {
            return ReadNotificationsNetworkEntity$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
