package com.hwpo_training_app.notifications.presentation;

import com.hwpo_training_app.notifications.domain.FetchNotificationsUseCase;
import com.hwpo_training_app.notifications.presentation.NotificationsEvents;
import com.hwpo_training_app.notifications.presentation.NotificationsViewModel;
import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.ec6;
import defpackage.g2b;
import defpackage.g5b;
import defpackage.oh4;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.v72;
import defpackage.xd3;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.notifications.presentation.NotificationsViewModel$fetchNotifications$1", f = "NotificationsViewModel.kt", l = {102}, m = "invokeSuspend", v = 2)
final class NotificationsViewModel$fetchNotifications$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ ec6 u;
    public final /* synthetic */ NotificationsViewModel v;
    public final /* synthetic */ boolean w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ec6.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsViewModel$fetchNotifications$1(ec6 ec6Var, NotificationsViewModel notificationsViewModel, boolean z, r02<? super NotificationsViewModel$fetchNotifications$1> r02Var) {
        super(2, r02Var);
        this.u = ec6Var;
        this.v = notificationsViewModel;
        this.w = z;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new NotificationsViewModel$fetchNotifications$1(this.u, this.v, this.w, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((NotificationsViewModel$fetchNotifications$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        final NotificationsViewModel notificationsViewModel = this.v;
        final ec6 ec6Var = this.u;
        if (i == 0) {
            dv8.b(obj);
            if (ec6Var.compareTo(ec6.u) <= 0 && ec6Var.compareTo(ec6.t) >= 0) {
                NotificationsViewModel.Action.StartLoading startLoading = NotificationsViewModel.Action.StartLoading.a;
                NotificationsViewModel.Companion companion = NotificationsViewModel.Companion;
                notificationsViewModel.e(startLoading);
            }
            FetchNotificationsUseCase fetchNotificationsUseCase = notificationsViewModel.y;
            FetchNotificationsUseCase.Params params = new FetchNotificationsUseCase.Params(this.w);
            this.t = 1;
            fetchNotificationsUseCase.getClass();
            obj = g5b.b(fetchNotificationsUseCase, params, this);
            v72 v72Var = v72.t;
            if (obj == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        ((xd3) obj).a(new oh4() { // from class: ld7
            @Override // defpackage.oh4
            public final Object invoke(Object obj2) {
                int iOrdinal = ec6Var.ordinal();
                NotificationsViewModel notificationsViewModel2 = notificationsViewModel;
                if (iOrdinal == 0 || iOrdinal == 1) {
                    NotificationsViewModel.Action.FinishLoading finishLoading = NotificationsViewModel.Action.FinishLoading.a;
                    NotificationsViewModel.Companion companion2 = NotificationsViewModel.Companion;
                    notificationsViewModel2.e(finishLoading);
                } else {
                    if (iOrdinal != 2) {
                        u.b();
                        return null;
                    }
                    NotificationsEvents.StopRefreshing stopRefreshing = NotificationsEvents.StopRefreshing.b;
                    NotificationsViewModel.Companion companion3 = NotificationsViewModel.Companion;
                    notificationsViewModel2.f(stopRefreshing);
                }
                return g2b.a;
            }
        }, new oh4() { // from class: md7
            @Override // defpackage.oh4
            public final Object invoke(Object obj2) {
                NotificationsViewModel notificationsViewModel2 = notificationsViewModel;
                cm3 cm3Var = notificationsViewModel2.C;
                Exception exc = (Exception) obj2;
                int iOrdinal = ec6Var.ordinal();
                if (iOrdinal == 0) {
                    NotificationsViewModel.Action.FinishLoading finishLoading = NotificationsViewModel.Action.FinishLoading.a;
                    NotificationsViewModel.Companion companion2 = NotificationsViewModel.Companion;
                    notificationsViewModel2.e(finishLoading);
                    notificationsViewModel2.e(NotificationsViewModel.Action.ShowErrorPlaceHolder.a);
                } else if (iOrdinal == 1) {
                    NotificationsViewModel.Action.FinishLoading finishLoading2 = NotificationsViewModel.Action.FinishLoading.a;
                    NotificationsViewModel.Companion companion3 = NotificationsViewModel.Companion;
                    notificationsViewModel2.e(finishLoading2);
                    notificationsViewModel2.f(new NotificationsEvents.ShowError(cm3Var.a(exc)));
                } else {
                    if (iOrdinal != 2) {
                        u.b();
                        return null;
                    }
                    NotificationsEvents.StopRefreshing stopRefreshing = NotificationsEvents.StopRefreshing.b;
                    NotificationsViewModel.Companion companion4 = NotificationsViewModel.Companion;
                    notificationsViewModel2.f(stopRefreshing);
                    notificationsViewModel2.f(new NotificationsEvents.ShowError(cm3Var.a(exc)));
                }
                return g2b.a;
            }
        });
        return g2b.a;
    }
}
