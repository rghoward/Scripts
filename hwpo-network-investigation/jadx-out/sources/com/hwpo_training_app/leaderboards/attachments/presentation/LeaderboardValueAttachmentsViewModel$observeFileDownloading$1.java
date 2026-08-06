package com.hwpo_training_app.leaderboards.attachments.presentation;

import defpackage.ci4;
import defpackage.fk2;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.rma;
import defpackage.sk1;
import defpackage.th1;
import defpackage.w60;
import defpackage.wa;
import defpackage.ww3;
import defpackage.xd3;
import defpackage.xj5;
import defpackage.xm2;
import io.intercom.android.sdk.survey.SurveyViewModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsViewModel$observeFileDownloading$1", f = "LeaderboardValueAttachmentsViewModel.kt", l = {SurveyViewModel.ENTITY_TYPE, 86}, m = "invokeSuspend", v = 2)
final class LeaderboardValueAttachmentsViewModel$observeFileDownloading$1 extends p6a implements ci4<xd3<? extends Exception, ? extends ww3>, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ LeaderboardValueAttachmentsViewModel v;

    /* JADX INFO: renamed from: com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsViewModel$observeFileDownloading$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class AnonymousClass1 extends wa implements ci4<ww3, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(ww3 ww3Var, r02<? super g2b> r02Var) {
            Object obj;
            ww3 ww3Var2 = ww3Var;
            LeaderboardValueAttachmentsViewModel leaderboardValueAttachmentsViewModel = (LeaderboardValueAttachmentsViewModel) this.receiver;
            int i = LeaderboardValueAttachmentsViewModel.J;
            sk1.a aVar = (sk1.a) th1.A(leaderboardValueAttachmentsViewModel.b().c);
            if (aVar != null) {
                List<w60> list = aVar.k;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof w60.a) {
                        arrayList.add(obj2);
                    }
                }
                int size = arrayList.size();
                int i2 = 0;
                do {
                    if (i2 >= size) {
                        obj = null;
                        break;
                    }
                    obj = arrayList.get(i2);
                    i2++;
                } while (!xj5.a(((w60.a) obj).f, ww3Var2.a()));
                w60.a aVar2 = (w60.a) obj;
                if (aVar2 != null) {
                    leaderboardValueAttachmentsViewModel.e(new LeaderboardValueAttachmentsViewModel.Action.UpdateFileState(aVar2.b, fk2.a(ww3Var2)));
                }
            }
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsViewModel$observeFileDownloading$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class AnonymousClass2 extends wa implements ci4<Throwable, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(Throwable th, r02<? super g2b> r02Var) {
            ((rma.a) this.receiver).b(th);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardValueAttachmentsViewModel$observeFileDownloading$1(LeaderboardValueAttachmentsViewModel leaderboardValueAttachmentsViewModel, r02<? super LeaderboardValueAttachmentsViewModel$observeFileDownloading$1> r02Var) {
        super(2, r02Var);
        this.v = leaderboardValueAttachmentsViewModel;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        LeaderboardValueAttachmentsViewModel$observeFileDownloading$1 leaderboardValueAttachmentsViewModel$observeFileDownloading$1 = new LeaderboardValueAttachmentsViewModel$observeFileDownloading$1(this.v, r02Var);
        leaderboardValueAttachmentsViewModel$observeFileDownloading$1.u = obj;
        return leaderboardValueAttachmentsViewModel$observeFileDownloading$1;
    }

    @Override // defpackage.ci4
    public final Object invoke(xd3<? extends Exception, ? extends ww3> xd3Var, r02<? super g2b> r02Var) {
        return ((LeaderboardValueAttachmentsViewModel$observeFileDownloading$1) create(xd3Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (defpackage.yd3.a((defpackage.xd3) r14, r6, r13) == r5) goto L15;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.Object r0 = r13.u
            xd3 r0 = (defpackage.xd3) r0
            int r1 = r13.t
            r2 = 0
            r3 = 2
            r4 = 1
            v72 r5 = defpackage.v72.t
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L15
            defpackage.dv8.b(r14)
            goto L58
        L15:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r13)
            return r2
        L1b:
            defpackage.dv8.b(r14)
            goto L3c
        L1f:
            defpackage.dv8.b(r14)
            com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsViewModel$observeFileDownloading$1$1 r6 = new com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsViewModel$observeFileDownloading$1$1
            java.lang.String r11 = "updateAttachmentFileStatus(Lcom/hwpo_training_app/domain/entity/FileDownloadingStatus;)V"
            r12 = 4
            r7 = 2
            com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsViewModel r8 = r13.v
            java.lang.Class<com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsViewModel> r9 = com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsViewModel.class
            java.lang.String r10 = "updateAttachmentFileStatus"
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r13.u = r2
            r13.t = r4
            java.lang.Object r14 = defpackage.yd3.b(r0, r6, r13)
            if (r14 != r5) goto L3c
            goto L57
        L3c:
            xd3 r14 = (defpackage.xd3) r14
            com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsViewModel$observeFileDownloading$1$2 r6 = new com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsViewModel$observeFileDownloading$1$2
            rma$a r8 = defpackage.rma.a
            java.lang.String r11 = "e(Ljava/lang/Throwable;)V"
            r12 = 4
            r7 = 2
            java.lang.Class<rma$a> r9 = rma.a.class
            java.lang.String r10 = "e"
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r13.u = r2
            r13.t = r3
            java.lang.Object r13 = defpackage.yd3.a(r14, r6, r13)
            if (r13 != r5) goto L58
        L57:
            return r5
        L58:
            g2b r13 = defpackage.g2b.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsViewModel$observeFileDownloading$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
