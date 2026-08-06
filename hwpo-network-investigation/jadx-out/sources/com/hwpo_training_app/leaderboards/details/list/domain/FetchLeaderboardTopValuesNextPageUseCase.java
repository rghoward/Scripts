package com.hwpo_training_app.leaderboards.details.list.domain;

import com.hwpo_training_app.leaderboards.common.domain.entity.TopValueKind;
import com.hwpo_training_app.leaderboards.details.list.data.LeaderboardDetailsListRepositoryImpl;
import defpackage.aa0;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.g5b;
import defpackage.u02;
import defpackage.v72;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class FetchLeaderboardTopValuesNextPageUseCase extends g5b<Params, g2b> {
    public final LeaderboardDetailsListRepositoryImpl a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Params {
        public final int a;
        public final TopValueKind b;

        public Params(int i, TopValueKind topValueKind) {
            topValueKind.getClass();
            this.a = i;
            this.b = topValueKind;
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
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "Params(leaderboardId=" + this.a + ", topValueKind=" + this.b + ")";
        }
    }

    public FetchLeaderboardTopValuesNextPageUseCase(LeaderboardDetailsListRepositoryImpl leaderboardDetailsListRepositoryImpl) {
        this.a = leaderboardDetailsListRepositoryImpl;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(Params params, u02 u02Var) throws Throwable {
        FetchLeaderboardTopValuesNextPageUseCase$executeOnBackground$1 fetchLeaderboardTopValuesNextPageUseCase$executeOnBackground$1;
        if (u02Var instanceof FetchLeaderboardTopValuesNextPageUseCase$executeOnBackground$1) {
            fetchLeaderboardTopValuesNextPageUseCase$executeOnBackground$1 = (FetchLeaderboardTopValuesNextPageUseCase$executeOnBackground$1) u02Var;
            int i = fetchLeaderboardTopValuesNextPageUseCase$executeOnBackground$1.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchLeaderboardTopValuesNextPageUseCase$executeOnBackground$1.v = i - Integer.MIN_VALUE;
            } else {
                fetchLeaderboardTopValuesNextPageUseCase$executeOnBackground$1 = new FetchLeaderboardTopValuesNextPageUseCase$executeOnBackground$1(this, u02Var);
            }
        } else {
            fetchLeaderboardTopValuesNextPageUseCase$executeOnBackground$1 = new FetchLeaderboardTopValuesNextPageUseCase$executeOnBackground$1(this, u02Var);
        }
        Object obj = fetchLeaderboardTopValuesNextPageUseCase$executeOnBackground$1.t;
        int i2 = fetchLeaderboardTopValuesNextPageUseCase$executeOnBackground$1.v;
        if (i2 == 0) {
            dv8.b(obj);
            int i3 = params.a;
            TopValueKind topValueKind = params.b;
            fetchLeaderboardTopValuesNextPageUseCase$executeOnBackground$1.v = 1;
            Object objB = this.a.b(i3, topValueKind, false, fetchLeaderboardTopValuesNextPageUseCase$executeOnBackground$1);
            v72 v72Var = v72.t;
            if (objB != v72Var) {
                objB = g2b.a;
            }
            if (objB == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        return g2b.a;
    }
}
