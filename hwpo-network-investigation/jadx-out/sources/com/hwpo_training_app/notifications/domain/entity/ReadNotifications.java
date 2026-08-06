package com.hwpo_training_app.notifications.domain.entity;

import defpackage.xj5;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ReadNotifications {
    public final List<Long> a;

    public ReadNotifications(List<Long> list) {
        list.getClass();
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReadNotifications) && xj5.a(this.a, ((ReadNotifications) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ReadNotifications(notificationsIds=" + this.a + ")";
    }
}
