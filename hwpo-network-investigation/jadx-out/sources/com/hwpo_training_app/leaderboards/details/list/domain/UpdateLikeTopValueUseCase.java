package com.hwpo_training_app.leaderboards.details.list.domain;

import com.hwpo_training_app.leaderboards.details.list.data.LeaderboardDetailsListRepositoryImpl;
import defpackage.g2b;
import defpackage.g5b;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class UpdateLikeTopValueUseCase extends g5b<Params, g2b> {
    public final LeaderboardDetailsListRepositoryImpl a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Params {
        public final int a;
        public final boolean b;

        public Params(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return this.a == params.a && this.b == params.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "Params(topValueId=" + this.a + ", isLiked=" + this.b + ")";
        }
    }

    public UpdateLikeTopValueUseCase(LeaderboardDetailsListRepositoryImpl leaderboardDetailsListRepositoryImpl) {
        this.a = leaderboardDetailsListRepositoryImpl;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r4.c(r5, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r4.d(r5, r0) == r1) goto L25;
     */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.hwpo_training_app.leaderboards.details.list.domain.UpdateLikeTopValueUseCase.Params r5, defpackage.u02 r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.hwpo_training_app.leaderboards.details.list.domain.UpdateLikeTopValueUseCase$executeOnBackground$1
            if (r0 == 0) goto L13
            r0 = r6
            com.hwpo_training_app.leaderboards.details.list.domain.UpdateLikeTopValueUseCase$executeOnBackground$1 r0 = (com.hwpo_training_app.leaderboards.details.list.domain.UpdateLikeTopValueUseCase$executeOnBackground$1) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            com.hwpo_training_app.leaderboards.details.list.domain.UpdateLikeTopValueUseCase$executeOnBackground$1 r0 = new com.hwpo_training_app.leaderboards.details.list.domain.UpdateLikeTopValueUseCase$executeOnBackground$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.t
            int r1 = r0.v
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L33
            if (r1 == r3) goto L2f
            if (r1 != r2) goto L28
            defpackage.dv8.b(r6)
            goto L55
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r4)
            r4 = 0
            return r4
        L2f:
            defpackage.dv8.b(r6)
            goto L49
        L33:
            defpackage.dv8.b(r6)
            boolean r6 = r5.b
            int r5 = r5.a
            v72 r1 = defpackage.v72.t
            com.hwpo_training_app.leaderboards.details.list.data.LeaderboardDetailsListRepositoryImpl r4 = r4.a
            if (r6 == 0) goto L4c
            r0.v = r3
            java.lang.Object r4 = r4.c(r5, r0)
            if (r4 != r1) goto L49
            goto L54
        L49:
            g2b r4 = defpackage.g2b.a
            return r4
        L4c:
            r0.v = r2
            java.lang.Object r4 = r4.d(r5, r0)
            if (r4 != r1) goto L55
        L54:
            return r1
        L55:
            g2b r4 = defpackage.g2b.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hwpo_training_app.leaderboards.details.list.domain.UpdateLikeTopValueUseCase.a(com.hwpo_training_app.leaderboards.details.list.domain.UpdateLikeTopValueUseCase$Params, u02):java.lang.Object");
    }
}
