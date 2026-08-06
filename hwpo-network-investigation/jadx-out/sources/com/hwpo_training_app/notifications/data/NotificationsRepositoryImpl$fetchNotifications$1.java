package com.hwpo_training_app.notifications.data;

import defpackage.u02;
import defpackage.xm2;
import io.intercom.android.sdk.models.carousel.Carousel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.notifications.data.NotificationsRepositoryImpl", f = "NotificationsRepositoryImpl.kt", l = {33, Carousel.ENTITY_TYPE, 46}, m = "fetchNotifications", v = 2)
final class NotificationsRepositoryImpl$fetchNotifications$1 extends u02 {
    public boolean t;
    public /* synthetic */ Object u;
    public final /* synthetic */ NotificationsRepositoryImpl v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsRepositoryImpl$fetchNotifications$1(NotificationsRepositoryImpl notificationsRepositoryImpl, u02 u02Var) {
        super(u02Var);
        this.v = notificationsRepositoryImpl;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.e(false, this);
    }
}
