package com.hwpo_training_app.notifications.data;

import com.hwpo_training_app.notifications.domain.NotificationsStorage;
import com.hwpo_training_app.notifications.domain.entity.ReadNotifications;
import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.v72;
import defpackage.xm2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.notifications.data.NotificationsRepositoryImpl$readNotifications$1", f = "NotificationsRepositoryImpl.kt", l = {27}, m = "invokeSuspend", v = 2)
public final class NotificationsRepositoryImpl$readNotifications$1 extends p6a implements ci4<ReadNotifications, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ NotificationsRepositoryImpl v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsRepositoryImpl$readNotifications$1(NotificationsRepositoryImpl notificationsRepositoryImpl, r02<? super NotificationsRepositoryImpl$readNotifications$1> r02Var) {
        super(2, r02Var);
        this.v = notificationsRepositoryImpl;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        NotificationsRepositoryImpl$readNotifications$1 notificationsRepositoryImpl$readNotifications$1 = new NotificationsRepositoryImpl$readNotifications$1(this.v, r02Var);
        notificationsRepositoryImpl$readNotifications$1.u = obj;
        return notificationsRepositoryImpl$readNotifications$1;
    }

    @Override // defpackage.ci4
    public final Object invoke(ReadNotifications readNotifications, r02<? super g2b> r02Var) {
        return ((NotificationsRepositoryImpl$readNotifications$1) create(readNotifications, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        ReadNotifications readNotifications = (ReadNotifications) this.u;
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            NotificationsStorage notificationsStorage = this.v.b;
            List<Long> list = readNotifications.a;
            this.u = null;
            this.t = 1;
            g2b g2bVarE = notificationsStorage.e(list);
            v72 v72Var = v72.t;
            if (g2bVarE == v72Var) {
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
