package com.hwpo_training_app.leaderboards.filter.details.presentation.screen;

import com.hwpo_training_app.leaderboards.filter.details.domain.ApplyDetailsFiltersUseCase;
import com.hwpo_training_app.leaderboards.filter.details.domain.ObserveLeaderboardDetailsFiltersFlowUseCase;
import com.hwpo_training_app.leaderboards.filter.details.domain.entity.LeaderboardDetailsFiltersModel;
import com.hwpo_training_app.leaderboards.filter.details.presentation.screen.entity.AgeRangeStateUiEntity;
import com.hwpo_training_app.leaderboards.filter.details.presentation.screen.entity.LeaderboardDetailsFiltersUiEntityMapperKt;
import defpackage.av;
import defpackage.bl0;
import defpackage.cq2;
import defpackage.d21;
import defpackage.dl0;
import defpackage.dz9;
import defpackage.el0;
import defpackage.g2b;
import defpackage.h62;
import defpackage.k74;
import defpackage.oh7;
import defpackage.oy0;
import defpackage.rhb;
import defpackage.s36;
import defpackage.uk4;
import defpackage.vv2;
import defpackage.w26;
import defpackage.x26;
import defpackage.xj5;
import defpackage.y26;
import defpackage.yk2;
import defpackage.yq6;
import defpackage.z26;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardDetailsFiltersViewModel extends dl0<LeaderboardDetailsFiltersViewState, Action> {
    public static final /* synthetic */ int J = 0;
    public final vv2 A;
    public LeaderboardDetailsFiltersModel B;
    public LeaderboardDetailsFiltersModel C;
    public final yq6 D;
    public final yq6 E;
    public final yq6 F;
    public final yq6 G;
    public final yq6 H;
    public final yq6 I;
    public final s36 x;
    public final ApplyDetailsFiltersUseCase y;
    public final uk4 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public LeaderboardDetailsFiltersViewModel(s36 s36Var, ApplyDetailsFiltersUseCase applyDetailsFiltersUseCase, ObserveLeaderboardDetailsFiltersFlowUseCase observeLeaderboardDetailsFiltersFlowUseCase, uk4 uk4Var) {
        s36Var.getClass();
        applyDetailsFiltersUseCase.getClass();
        observeLeaderboardDetailsFiltersFlowUseCase.getClass();
        uk4Var.getClass();
        LeaderboardDetailsFiltersModel.Companion.getClass();
        LeaderboardDetailsFiltersModel leaderboardDetailsFiltersModel = LeaderboardDetailsFiltersModel.j;
        super(LeaderboardDetailsFiltersUiEntityMapperKt.a(leaderboardDetailsFiltersModel, false));
        this.x = s36Var;
        this.y = applyDetailsFiltersUseCase;
        this.z = uk4Var;
        this.A = oy0.b(rhb.b(this), null, new LeaderboardDetailsFiltersViewModel$ableToChooseMyGym$1(this, null), 3);
        this.B = leaderboardDetailsFiltersModel;
        this.C = leaderboardDetailsFiltersModel;
        this.D = oh7.a(this.u, new d21(1));
        this.E = oh7.a(this.u, new w26());
        this.F = oh7.a(this.u, new x26(0));
        this.G = oh7.a(this.u, new y26());
        this.H = oh7.a(this.u, new z26(0));
        this.I = oh7.a(this.u, new h62(2));
        yk2.o(new k74(observeLeaderboardDetailsFiltersFlowUseCase.b(g2b.a), new LeaderboardDetailsFiltersViewModel$observeLeaderboardDetailsFiltersState$1(this, null)), rhb.b(this));
        g();
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (bl0Var instanceof Action.FiltersStateChanged) {
            LeaderboardDetailsFiltersViewState leaderboardDetailsFiltersViewStateB = b();
            Action.FiltersStateChanged filtersStateChanged = (Action.FiltersStateChanged) bl0Var;
            LeaderboardDetailsFiltersViewState leaderboardDetailsFiltersViewState = filtersStateChanged.a;
            return LeaderboardDetailsFiltersViewState.a(leaderboardDetailsFiltersViewStateB, leaderboardDetailsFiltersViewState.a, leaderboardDetailsFiltersViewState.b, null, leaderboardDetailsFiltersViewState.d, leaderboardDetailsFiltersViewState.e, filtersStateChanged.b, 4);
        }
        if (bl0Var instanceof Action.ResetFiltersState) {
            LeaderboardDetailsFiltersViewState leaderboardDetailsFiltersViewStateB2 = b();
            LeaderboardDetailsFiltersViewState leaderboardDetailsFiltersViewState2 = ((Action.ResetFiltersState) bl0Var).a;
            return LeaderboardDetailsFiltersViewState.a(leaderboardDetailsFiltersViewStateB2, leaderboardDetailsFiltersViewState2.a, leaderboardDetailsFiltersViewState2.b, leaderboardDetailsFiltersViewState2.c, null, false, false, 24);
        }
        if (!(bl0Var instanceof Action.AgeRageExpandStateChanged)) {
            return bl0Var instanceof Action.ChangeApplyButtonState ? LeaderboardDetailsFiltersViewState.a(b(), null, null, null, null, false, ((Action.ChangeApplyButtonState) bl0Var).a, 31) : b();
        }
        Action.AgeRageExpandStateChanged ageRageExpandStateChanged = (Action.AgeRageExpandStateChanged) bl0Var;
        return LeaderboardDetailsFiltersViewState.a(b(), null, null, new AgeRangeStateUiEntity(ageRageExpandStateChanged.b, ageRageExpandStateChanged.c, ageRageExpandStateChanged.a), null, false, false, 59);
    }

    public final dz9 g() {
        return oy0.d(rhb.b(this), null, null, new LeaderboardDetailsFiltersViewModel$updateFiltersState$1(this, null), 3);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class Action implements bl0 {

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class AgeRageExpandStateChanged extends Action {
            public final boolean a;
            public final String b;
            public final String c;

            public AgeRageExpandStateChanged(String str, String str2, boolean z) {
                super(0);
                this.a = z;
                this.b = str;
                this.c = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AgeRageExpandStateChanged)) {
                    return false;
                }
                AgeRageExpandStateChanged ageRageExpandStateChanged = (AgeRageExpandStateChanged) obj;
                return this.a == ageRageExpandStateChanged.a && xj5.a(this.b, ageRageExpandStateChanged.b) && xj5.a(this.c, ageRageExpandStateChanged.c);
            }

            public final int hashCode() {
                int iHashCode = Boolean.hashCode(this.a) * 31;
                String str = this.b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.c;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AgeRageExpandStateChanged(isExpanded=");
                sb.append(this.a);
                sb.append(", minAge=");
                sb.append(this.b);
                sb.append(", maxAge=");
                return av.a(sb, this.c, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class ChangeApplyButtonState extends Action {
            public final boolean a;

            public ChangeApplyButtonState(boolean z) {
                super(0);
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeApplyButtonState) && this.a == ((ChangeApplyButtonState) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return cq2.a("ChangeApplyButtonState(isEnabled=", ")", this.a);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class FiltersStateChanged extends Action {
            public final LeaderboardDetailsFiltersViewState a;
            public final boolean b;

            public FiltersStateChanged(LeaderboardDetailsFiltersViewState leaderboardDetailsFiltersViewState, boolean z) {
                super(0);
                this.a = leaderboardDetailsFiltersViewState;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FiltersStateChanged)) {
                    return false;
                }
                FiltersStateChanged filtersStateChanged = (FiltersStateChanged) obj;
                return xj5.a(this.a, filtersStateChanged.a) && this.b == filtersStateChanged.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "FiltersStateChanged(filtersState=" + this.a + ", isApplyButtonEnabled=" + this.b + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class ResetFiltersState extends Action {
            public final LeaderboardDetailsFiltersViewState a;

            public ResetFiltersState(LeaderboardDetailsFiltersViewState leaderboardDetailsFiltersViewState) {
                super(0);
                this.a = leaderboardDetailsFiltersViewState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ResetFiltersState) && xj5.a(this.a, ((ResetFiltersState) obj).a);
            }

            public final int hashCode() {
                return Boolean.hashCode(false) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "ResetFiltersState(filtersState=" + this.a + ", isApplyButtonEnabled=false)";
            }
        }

        public /* synthetic */ Action(int i) {
            this();
        }

        private Action() {
        }
    }
}
