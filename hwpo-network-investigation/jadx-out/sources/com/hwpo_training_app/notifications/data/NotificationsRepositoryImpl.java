package com.hwpo_training_app.notifications.data;

import com.hwpo_training_app.notifications.data.network.api.NotificationsApi;
import com.hwpo_training_app.notifications.domain.NotificationsRepository;
import com.hwpo_training_app.notifications.domain.NotificationsSocketService;
import com.hwpo_training_app.notifications.domain.NotificationsStorage;
import com.hwpo_training_app.notifications.domain.entity.NotificationModel;
import defpackage.g2b;
import defpackage.k74;
import defpackage.r02;
import defpackage.r54;
import defpackage.v72;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class NotificationsRepositoryImpl implements NotificationsRepository {
    public static final Companion Companion = new Companion(0);
    public final NotificationsApi a;
    public final NotificationsStorage b;
    public final r54<List<NotificationModel>> c;
    public final k74 d;
    public final k74 e;

    public NotificationsRepositoryImpl(NotificationsApi notificationsApi, NotificationsStorage notificationsStorage, NotificationsSocketService notificationsSocketService) {
        notificationsApi.getClass();
        notificationsStorage.getClass();
        notificationsSocketService.getClass();
        this.a = notificationsApi;
        this.b = notificationsStorage;
        this.c = notificationsStorage.a();
        this.d = new k74(notificationsSocketService.a(), new NotificationsRepositoryImpl$socketNotifications$1(this, null));
        this.e = new k74(notificationsSocketService.b(), new NotificationsRepositoryImpl$readNotifications$1(this, null));
    }

    @Override // com.hwpo_training_app.notifications.domain.NotificationsRepository
    public final r54<List<NotificationModel>> a() {
        return this.c;
    }

    @Override // com.hwpo_training_app.notifications.domain.NotificationsRepository
    public final k74 b() {
        return this.e;
    }

    @Override // com.hwpo_training_app.notifications.domain.NotificationsRepository
    public final k74 c() {
        return this.d;
    }

    @Override // com.hwpo_training_app.notifications.domain.NotificationsRepository
    public final Object d(r02<? super g2b> r02Var) {
        g2b g2bVarClear = this.b.clear();
        return g2bVarClear == v72.t ? g2bVarClear : g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0094, code lost:
    
        if (r7.c(r12) == r9) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a2, code lost:
    
        if (r7.f(r12) == r9) goto L43;
     */
    @Override // com.hwpo_training_app.notifications.domain.NotificationsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(boolean r13, defpackage.u02 r14) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.hwpo_training_app.notifications.data.NotificationsRepositoryImpl$fetchNotifications$1
            if (r0 == 0) goto L13
            r0 = r14
            com.hwpo_training_app.notifications.data.NotificationsRepositoryImpl$fetchNotifications$1 r0 = (com.hwpo_training_app.notifications.data.NotificationsRepositoryImpl$fetchNotifications$1) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            com.hwpo_training_app.notifications.data.NotificationsRepositoryImpl$fetchNotifications$1 r0 = new com.hwpo_training_app.notifications.data.NotificationsRepositoryImpl$fetchNotifications$1
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.u
            int r1 = r0.w
            r2 = -9223372036854775808
            r4 = 3
            r5 = 2
            r6 = 1
            com.hwpo_training_app.notifications.domain.NotificationsStorage r7 = r12.b
            r8 = 0
            v72 r9 = defpackage.v72.t
            if (r1 == 0) goto L43
            if (r1 == r6) goto L3d
            if (r1 == r5) goto L39
            if (r1 != r4) goto L33
            defpackage.dv8.b(r14)
            goto La5
        L33:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r12)
            return r8
        L39:
            defpackage.dv8.b(r14)
            goto L97
        L3d:
            boolean r13 = r0.t
            defpackage.dv8.b(r14)
            goto L6e
        L43:
            defpackage.dv8.b(r14)
            if (r13 != 0) goto L4c
            java.lang.Long r8 = r7.b()
        L4c:
            if (r8 != 0) goto L4f
            goto L5a
        L4f:
            long r10 = r8.longValue()
            int r14 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r14 != 0) goto L5a
            g2b r12 = defpackage.g2b.a
            return r12
        L5a:
            java.lang.Integer r14 = new java.lang.Integer
            r1 = 20
            r14.<init>(r1)
            r0.t = r13
            r0.w = r6
            com.hwpo_training_app.notifications.data.network.api.NotificationsApi r12 = r12.a
            java.lang.Object r14 = r12.a(r8, r14, r0)
            if (r14 != r9) goto L6e
            goto La4
        L6e:
            com.hwpo_training_app.notifications.data.network.response.NotificationsResponse r14 = (com.hwpo_training_app.notifications.data.network.response.NotificationsResponse) r14
            java.util.List<com.hwpo_training_app.notifications.data.network.push.NotificationNetworkEntity> r12 = r14.a
            java.util.List r12 = defpackage.g93.a(r12)
            com.hwpo_training_app.core.data.model.pagination.CursorPaginationNetworkEntity r14 = r14.b
            java.lang.Long r14 = r14.b
            boolean r1 = r12.isEmpty()
            if (r1 == 0) goto L87
            if (r14 != 0) goto L87
            java.lang.Long r14 = new java.lang.Long
            r14.<init>(r2)
        L87:
            r7.d(r14)
            if (r13 == 0) goto L9a
            r0.t = r13
            r0.w = r5
            g2b r12 = r7.c(r12)
            if (r12 != r9) goto L97
            goto La4
        L97:
            g2b r12 = defpackage.g2b.a
            return r12
        L9a:
            r0.t = r13
            r0.w = r4
            g2b r12 = r7.f(r12)
            if (r12 != r9) goto La5
        La4:
            return r9
        La5:
            g2b r12 = defpackage.g2b.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hwpo_training_app.notifications.data.NotificationsRepositoryImpl.e(boolean, u02):java.lang.Object");
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }
}
