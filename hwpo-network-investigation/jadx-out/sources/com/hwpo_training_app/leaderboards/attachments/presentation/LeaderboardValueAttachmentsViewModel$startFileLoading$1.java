package com.hwpo_training_app.leaderboards.attachments.presentation;

import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.w60;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsViewModel$startFileLoading$1", f = "LeaderboardValueAttachmentsViewModel.kt", l = {158, 159}, m = "invokeSuspend", v = 2)
final class LeaderboardValueAttachmentsViewModel$startFileLoading$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ w60.a u;
    public final /* synthetic */ LeaderboardValueAttachmentsViewModel v;

    /* JADX INFO: renamed from: com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsViewModel$startFileLoading$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsViewModel$startFileLoading$1$1", f = "LeaderboardValueAttachmentsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends p6a implements ci4<Exception, r02<? super g2b>, Object> {
        public /* synthetic */ Object t;
        public final /* synthetic */ LeaderboardValueAttachmentsViewModel u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LeaderboardValueAttachmentsViewModel leaderboardValueAttachmentsViewModel, r02<? super AnonymousClass1> r02Var) {
            super(2, r02Var);
            this.u = leaderboardValueAttachmentsViewModel;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.u, r02Var);
            anonymousClass1.t = obj;
            return anonymousClass1;
        }

        @Override // defpackage.ci4
        public final Object invoke(Exception exc, r02<? super g2b> r02Var) {
            return ((AnonymousClass1) create(exc, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            Exception exc = (Exception) this.t;
            dv8.b(obj);
            new LeaderboardValueAttachmentsEvents.ShowError(this.u.E.a(exc));
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardValueAttachmentsViewModel$startFileLoading$1(w60.a aVar, r02 r02Var, LeaderboardValueAttachmentsViewModel leaderboardValueAttachmentsViewModel) {
        super(2, r02Var);
        this.u = aVar;
        this.v = leaderboardValueAttachmentsViewModel;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new LeaderboardValueAttachmentsViewModel$startFileLoading$1(this.u, r02Var, this.v);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((LeaderboardValueAttachmentsViewModel$startFileLoading$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (defpackage.yd3.a((defpackage.xd3) r9, r0, r8) == r5) goto L15;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            int r0 = r8.t
            com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsViewModel r1 = r8.v
            r2 = 2
            r3 = 1
            r4 = 0
            v72 r5 = defpackage.v72.t
            if (r0 == 0) goto L1d
            if (r0 == r3) goto L19
            if (r0 != r2) goto L13
            defpackage.dv8.b(r9)
            goto L49
        L13:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r8)
            return r4
        L19:
            defpackage.dv8.b(r9)
            goto L39
        L1d:
            defpackage.dv8.b(r9)
            mz9$a r9 = new mz9$a
            w60$a r0 = r8.u
            long r6 = r0.h
            java.lang.String r0 = r0.f
            r9.<init>(r6, r0)
            mz9 r0 = r1.y
            r8.t = r3
            r0.getClass()
            java.lang.Object r9 = defpackage.g5b.b(r0, r9, r8)
            if (r9 != r5) goto L39
            goto L48
        L39:
            xd3 r9 = (defpackage.xd3) r9
            com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsViewModel$startFileLoading$1$1 r0 = new com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsViewModel$startFileLoading$1$1
            r0.<init>(r1, r4)
            r8.t = r2
            java.lang.Object r8 = defpackage.yd3.a(r9, r0, r8)
            if (r8 != r5) goto L49
        L48:
            return r5
        L49:
            g2b r8 = defpackage.g2b.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsViewModel$startFileLoading$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
