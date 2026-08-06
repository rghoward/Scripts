package com.hwpo_training_app.notifications.presentation;

import defpackage.ci4;
import defpackage.dv8;
import defpackage.dx1;
import defpackage.ec6;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.notifications.presentation.NotificationsViewModel$observeNotificationsSocketConnectionState$2", f = "NotificationsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
final class NotificationsViewModel$observeNotificationsSocketConnectionState$2 extends p6a implements ci4<dx1, r02<? super g2b>, Object> {
    public final /* synthetic */ NotificationsViewModel t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsViewModel$observeNotificationsSocketConnectionState$2(NotificationsViewModel notificationsViewModel, r02<? super NotificationsViewModel$observeNotificationsSocketConnectionState$2> r02Var) {
        super(2, r02Var);
        this.t = notificationsViewModel;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new NotificationsViewModel$observeNotificationsSocketConnectionState$2(this.t, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(dx1 dx1Var, r02<? super g2b> r02Var) {
        return ((NotificationsViewModel$observeNotificationsSocketConnectionState$2) create(dx1Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        NotificationsViewModel.Companion companion = NotificationsViewModel.Companion;
        this.t.g(ec6.v, true);
        return g2b.a;
    }
}
