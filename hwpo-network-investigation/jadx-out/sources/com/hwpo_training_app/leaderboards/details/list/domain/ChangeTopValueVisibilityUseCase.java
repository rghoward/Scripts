package com.hwpo_training_app.leaderboards.details.list.domain;

import com.hwpo_training_app.leaderboards.details.list.data.LeaderboardDetailsListRepositoryImpl;
import defpackage.aa0;
import defpackage.dv8;
import defpackage.g5b;
import defpackage.u02;
import defpackage.v72;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ChangeTopValueVisibilityUseCase extends g5b<Params, Boolean> {
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
            return "Params(topValueId=" + this.a + ", isHidden=" + this.b + ")";
        }
    }

    public ChangeTopValueVisibilityUseCase(LeaderboardDetailsListRepositoryImpl leaderboardDetailsListRepositoryImpl) {
        this.a = leaderboardDetailsListRepositoryImpl;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(Params params, u02 u02Var) throws Throwable {
        ChangeTopValueVisibilityUseCase$executeOnBackground$1 changeTopValueVisibilityUseCase$executeOnBackground$1;
        if (u02Var instanceof ChangeTopValueVisibilityUseCase$executeOnBackground$1) {
            changeTopValueVisibilityUseCase$executeOnBackground$1 = (ChangeTopValueVisibilityUseCase$executeOnBackground$1) u02Var;
            int i = changeTopValueVisibilityUseCase$executeOnBackground$1.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                changeTopValueVisibilityUseCase$executeOnBackground$1.w = i - Integer.MIN_VALUE;
            } else {
                changeTopValueVisibilityUseCase$executeOnBackground$1 = new ChangeTopValueVisibilityUseCase$executeOnBackground$1(this, u02Var);
            }
        } else {
            changeTopValueVisibilityUseCase$executeOnBackground$1 = new ChangeTopValueVisibilityUseCase$executeOnBackground$1(this, u02Var);
        }
        Object obj = changeTopValueVisibilityUseCase$executeOnBackground$1.u;
        int i2 = changeTopValueVisibilityUseCase$executeOnBackground$1.w;
        if (i2 == 0) {
            dv8.b(obj);
            int i3 = params.a;
            boolean z = !params.b;
            changeTopValueVisibilityUseCase$executeOnBackground$1.t = params;
            changeTopValueVisibilityUseCase$executeOnBackground$1.w = 1;
            Object objA = this.a.a(i3, z, changeTopValueVisibilityUseCase$executeOnBackground$1);
            v72 v72Var = v72.t;
            if (objA == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            params = changeTopValueVisibilityUseCase$executeOnBackground$1.t;
            dv8.b(obj);
        }
        return Boolean.valueOf(!params.b);
    }
}
