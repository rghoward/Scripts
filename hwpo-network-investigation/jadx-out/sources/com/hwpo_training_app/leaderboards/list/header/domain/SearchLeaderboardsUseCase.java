package com.hwpo_training_app.leaderboards.list.header.domain;

import com.hwpo_training_app.leaderboards.filter.list.data.LeaderboardFiltersRepositoryImpl;
import defpackage.g2b;
import defpackage.g5b;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SearchLeaderboardsUseCase extends g5b<String, g2b> {
    public final LeaderboardFiltersRepositoryImpl a;

    public SearchLeaderboardsUseCase(LeaderboardFiltersRepositoryImpl leaderboardFiltersRepositoryImpl) {
        this.a = leaderboardFiltersRepositoryImpl;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (r0.a(r1, r2) == r7) goto L22;
     */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r21, defpackage.r02<? super defpackage.g2b> r22) throws java.lang.Throwable {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof com.hwpo_training_app.leaderboards.list.header.domain.SearchLeaderboardsUseCase$executeOnBackground$1
            if (r2 == 0) goto L17
            r2 = r1
            com.hwpo_training_app.leaderboards.list.header.domain.SearchLeaderboardsUseCase$executeOnBackground$1 r2 = (com.hwpo_training_app.leaderboards.list.header.domain.SearchLeaderboardsUseCase$executeOnBackground$1) r2
            int r3 = r2.w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.w = r3
            goto L1e
        L17:
            com.hwpo_training_app.leaderboards.list.header.domain.SearchLeaderboardsUseCase$executeOnBackground$1 r2 = new com.hwpo_training_app.leaderboards.list.header.domain.SearchLeaderboardsUseCase$executeOnBackground$1
            u02 r1 = (defpackage.u02) r1
            r2.<init>(r0, r1)
        L1e:
            java.lang.Object r1 = r2.u
            int r3 = r2.w
            r4 = 0
            com.hwpo_training_app.leaderboards.filter.list.data.LeaderboardFiltersRepositoryImpl r0 = r0.a
            r5 = 2
            r6 = 1
            v72 r7 = defpackage.v72.t
            if (r3 == 0) goto L41
            if (r3 == r6) goto L39
            if (r3 != r5) goto L33
            defpackage.dv8.b(r1)
            goto L72
        L33:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r0)
            return r4
        L39:
            java.lang.String r3 = r2.t
            defpackage.dv8.b(r1)
        L3e:
            r16 = r3
            goto L53
        L41:
            defpackage.dv8.b(r1)
            r54<com.hwpo_training_app.leaderboards.filter.list.domain.entity.LeaderboardFiltersModel> r1 = r0.b
            r3 = r21
            r2.t = r3
            r2.w = r6
            java.lang.Object r1 = defpackage.yk2.k(r1, r2)
            if (r1 != r7) goto L3e
            goto L71
        L53:
            r8 = r1
            com.hwpo_training_app.leaderboards.filter.list.domain.entity.LeaderboardFiltersModel r8 = (com.hwpo_training_app.leaderboards.filter.list.domain.entity.LeaderboardFiltersModel) r8
            r18 = 0
            r19 = 7167(0x1bff, float:1.0043E-41)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            com.hwpo_training_app.leaderboards.filter.list.domain.entity.LeaderboardFiltersModel r1 = com.hwpo_training_app.leaderboards.filter.list.domain.entity.LeaderboardFiltersModel.d(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r2.t = r4
            r2.w = r5
            java.lang.Object r0 = r0.a(r1, r2)
            if (r0 != r7) goto L72
        L71:
            return r7
        L72:
            g2b r0 = defpackage.g2b.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hwpo_training_app.leaderboards.list.header.domain.SearchLeaderboardsUseCase.a(java.lang.String, r02):java.lang.Object");
    }
}
