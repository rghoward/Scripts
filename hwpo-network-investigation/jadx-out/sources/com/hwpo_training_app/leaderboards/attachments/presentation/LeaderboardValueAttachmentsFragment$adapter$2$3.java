package com.hwpo_training_app.leaderboards.attachments.presentation;

import defpackage.g2b;
import defpackage.oh4;
import defpackage.oy0;
import defpackage.pi4;
import defpackage.rhb;
import defpackage.u;
import defpackage.w60;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class LeaderboardValueAttachmentsFragment$adapter$2$3 extends pi4 implements oh4<w60.a, g2b> {
    public final void e(w60.a aVar) {
        aVar.getClass();
        LeaderboardValueAttachmentsViewModel leaderboardValueAttachmentsViewModel = (LeaderboardValueAttachmentsViewModel) this.receiver;
        leaderboardValueAttachmentsViewModel.getClass();
        int iOrdinal = aVar.j.ordinal();
        if (iOrdinal == 0) {
            oy0.d(rhb.b(leaderboardValueAttachmentsViewModel), null, null, new LeaderboardValueAttachmentsViewModel$startFileLoading$1(aVar, null, leaderboardValueAttachmentsViewModel), 3);
            return;
        }
        if (iOrdinal == 1) {
            File file = new File(leaderboardValueAttachmentsViewModel.C.b(), aVar.g);
            String str = aVar.i;
            leaderboardValueAttachmentsViewModel.B.getClass();
            leaderboardValueAttachmentsViewModel.f(new LeaderboardValueAttachmentsEvents.OpenFile(file, str));
            g2b g2bVar = g2b.a;
            return;
        }
        if (iOrdinal == 2) {
            oy0.d(rhb.b(leaderboardValueAttachmentsViewModel), null, null, new LeaderboardValueAttachmentsViewModel$startFileLoading$1(aVar, null, leaderboardValueAttachmentsViewModel), 3);
        } else if (iOrdinal == 3) {
            oy0.d(rhb.b(leaderboardValueAttachmentsViewModel), null, null, new LeaderboardValueAttachmentsViewModel$cancelFileLoading$1(aVar, null, leaderboardValueAttachmentsViewModel), 3);
        } else {
            u.b();
        }
    }

    @Override // defpackage.oh4
    public final /* bridge */ /* synthetic */ g2b invoke(w60.a aVar) {
        e(aVar);
        return g2b.a;
    }
}
