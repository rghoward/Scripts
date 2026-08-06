package com.hwpo_training_app.notifications.presentation;

import com.hwpo_training_app.notifications.presentation.entity.NotificationUiEntity;
import defpackage.a87;
import defpackage.aa0;
import defpackage.ci4;
import defpackage.dm9;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.v72;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.notifications.presentation.NotificationsViewModel$navigateToLeaderboardValueCommentsScreen$1", f = "NotificationsViewModel.kt", l = {181}, m = "invokeSuspend", v = 2)
final class NotificationsViewModel$navigateToLeaderboardValueCommentsScreen$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ NotificationsViewModel u;
    public final /* synthetic */ NotificationUiEntity.LeaderboardValueCommentCreated v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsViewModel$navigateToLeaderboardValueCommentsScreen$1(NotificationsViewModel notificationsViewModel, NotificationUiEntity.LeaderboardValueCommentCreated leaderboardValueCommentCreated, r02<? super NotificationsViewModel$navigateToLeaderboardValueCommentsScreen$1> r02Var) {
        super(2, r02Var);
        this.u = notificationsViewModel;
        this.v = leaderboardValueCommentCreated;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new NotificationsViewModel$navigateToLeaderboardValueCommentsScreen$1(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((NotificationsViewModel$navigateToLeaderboardValueCommentsScreen$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            dm9 dm9Var = this.u.x;
            NotificationUiEntity.LeaderboardValueCommentCreated leaderboardValueCommentCreated = this.v;
            a87.e eVar = new a87.e(leaderboardValueCommentCreated.h, leaderboardValueCommentCreated.i);
            this.t = 1;
            Object objA = dm9Var.a(eVar, this);
            v72 v72Var = v72.t;
            if (objA == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        return g2b.a;
    }
}
