package defpackage;

import com.hwpo_training_app.notifications.domain.entity.NotificationModel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.host.presentation.HostActivityViewModel$navigateToNeededNotificationScreen$1", f = "HostActivityViewModel.kt", l = {175, 175}, m = "invokeSuspend", v = 2)
public final class l25 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ e25 u;
    public final /* synthetic */ String v;
    public final /* synthetic */ boolean w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.host.presentation.HostActivityViewModel$navigateToNeededNotificationScreen$1$1", f = "HostActivityViewModel.kt", l = {179, 184}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<NotificationModel, r02<? super g2b>, Object> {
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ e25 v;
        public final /* synthetic */ boolean w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e25 e25Var, boolean z, r02<? super a> r02Var) {
            super(2, r02Var);
            this.v = e25Var;
            this.w = z;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(this.v, this.w, r02Var);
            aVar.u = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(NotificationModel notificationModel, r02<? super g2b> r02Var) {
            return ((a) create(notificationModel, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        
            if (defpackage.e25.g(r5, r8, r1, r7) == r6) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
        
            if (defpackage.e25.g(r5, r8, r1, r7) == r6) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        
            return r6;
         */
        @Override // defpackage.ak0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = r7.u
                com.hwpo_training_app.notifications.domain.entity.NotificationModel r0 = (com.hwpo_training_app.notifications.domain.entity.NotificationModel) r0
                int r1 = r7.t
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L1a
                if (r1 == r3) goto L16
                if (r1 != r2) goto L10
                goto L16
            L10:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r7)
                return r4
            L16:
                defpackage.dv8.b(r8)
                goto L49
            L1a:
                defpackage.dv8.b(r8)
                boolean r8 = r0 instanceof com.hwpo_training_app.notifications.domain.entity.NotificationModel.LeaderboardCommentCreated
                boolean r1 = r7.w
                e25 r5 = r7.v
                v72 r6 = defpackage.v72.t
                if (r8 == 0) goto L36
                com.hwpo_training_app.notifications.domain.entity.NotificationModel$LeaderboardCommentCreated r0 = (com.hwpo_training_app.notifications.domain.entity.NotificationModel.LeaderboardCommentCreated) r0
                com.hwpo_training_app.notifications.domain.entity.LeaderboardScoreModel r8 = r0.j
                r7.u = r4
                r7.t = r3
                java.lang.Object r7 = defpackage.e25.g(r5, r8, r1, r7)
                if (r7 != r6) goto L49
                goto L48
            L36:
                boolean r8 = r0 instanceof com.hwpo_training_app.notifications.domain.entity.NotificationModel.LeaderboardCommentMentioned
                if (r8 == 0) goto L49
                com.hwpo_training_app.notifications.domain.entity.NotificationModel$LeaderboardCommentMentioned r0 = (com.hwpo_training_app.notifications.domain.entity.NotificationModel.LeaderboardCommentMentioned) r0
                com.hwpo_training_app.notifications.domain.entity.LeaderboardScoreModel r8 = r0.j
                r7.u = r4
                r7.t = r2
                java.lang.Object r7 = defpackage.e25.g(r5, r8, r1, r7)
                if (r7 != r6) goto L49
            L48:
                return r6
            L49:
                g2b r7 = defpackage.g2b.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: l25.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l25(e25 e25Var, String str, boolean z, r02<? super l25> r02Var) {
        super(2, r02Var);
        this.u = e25Var;
        this.v = str;
        this.w = z;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new l25(this.u, this.v, this.w, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((l25) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (defpackage.yd3.b((defpackage.xd3) r7, r0, r6) == r5) goto L15;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = r6.t
            r1 = 0
            e25 r2 = r6.u
            r3 = 2
            r4 = 1
            v72 r5 = defpackage.v72.t
            if (r0 == 0) goto L1d
            if (r0 == r4) goto L19
            if (r0 != r3) goto L13
            defpackage.dv8.b(r7)
            goto L42
        L13:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r6)
            return r1
        L19:
            defpackage.dv8.b(r7)
            goto L30
        L1d:
            defpackage.dv8.b(r7)
            zf8 r7 = r2.E
            r6.t = r4
            r7.getClass()
            java.lang.String r0 = r6.v
            java.lang.Object r7 = defpackage.g5b.b(r7, r0, r6)
            if (r7 != r5) goto L30
            goto L41
        L30:
            xd3 r7 = (defpackage.xd3) r7
            l25$a r0 = new l25$a
            boolean r4 = r6.w
            r0.<init>(r2, r4, r1)
            r6.t = r3
            java.lang.Object r6 = defpackage.yd3.b(r7, r0, r6)
            if (r6 != r5) goto L42
        L41:
            return r5
        L42:
            g2b r6 = defpackage.g2b.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l25.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
