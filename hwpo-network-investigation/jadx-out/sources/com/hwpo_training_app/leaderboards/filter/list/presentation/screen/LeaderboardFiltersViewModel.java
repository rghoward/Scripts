package com.hwpo_training_app.leaderboards.filter.list.presentation.screen;

import com.hwpo_training_app.leaderboards.filter.list.domain.ApplyFiltersUseCase;
import com.hwpo_training_app.leaderboards.filter.list.domain.ObserveLeaderboardFiltersFlowUseCase;
import com.hwpo_training_app.leaderboards.filter.list.domain.entity.LeaderboardFiltersExtensionsKt;
import com.hwpo_training_app.leaderboards.filter.list.domain.entity.LeaderboardFiltersModel;
import com.hwpo_training_app.leaderboards.filter.list.presentation.screen.entity.LeaderboardFiltersUiEntityMapperKt;
import defpackage.bl0;
import defpackage.cq2;
import defpackage.dl0;
import defpackage.el0;
import defpackage.g2b;
import defpackage.hc3;
import defpackage.ic3;
import defpackage.k74;
import defpackage.mk0;
import defpackage.oh7;
import defpackage.oy0;
import defpackage.rhb;
import defpackage.s36;
import defpackage.se;
import defpackage.sx;
import defpackage.t36;
import defpackage.te;
import defpackage.tx;
import defpackage.u36;
import defpackage.uk4;
import defpackage.v36;
import defpackage.vv2;
import defpackage.w36;
import defpackage.xj5;
import defpackage.yk2;
import defpackage.yq6;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardFiltersViewModel extends dl0<LeaderboardFiltersViewState, Action> {
    public static final /* synthetic */ int O = 0;
    public final vv2 A;
    public LeaderboardFiltersModel B;
    public LeaderboardFiltersModel C;
    public final yq6 D;
    public final yq6 E;
    public final yq6 F;
    public final yq6 G;
    public final yq6 H;
    public final yq6 I;
    public final yq6 J;
    public final yq6 K;
    public final yq6 L;
    public final yq6 M;
    public final yq6 N;
    public final s36 x;
    public final ApplyFiltersUseCase y;
    public final uk4 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public LeaderboardFiltersViewModel(s36 s36Var, ApplyFiltersUseCase applyFiltersUseCase, ObserveLeaderboardFiltersFlowUseCase observeLeaderboardFiltersFlowUseCase, uk4 uk4Var) {
        s36Var.getClass();
        applyFiltersUseCase.getClass();
        observeLeaderboardFiltersFlowUseCase.getClass();
        uk4Var.getClass();
        LeaderboardFiltersModel.Companion.getClass();
        LeaderboardFiltersModel leaderboardFiltersModel = LeaderboardFiltersModel.k;
        super(LeaderboardFiltersUiEntityMapperKt.a(leaderboardFiltersModel, false));
        this.x = s36Var;
        this.y = applyFiltersUseCase;
        this.z = uk4Var;
        this.A = oy0.b(rhb.b(this), null, new LeaderboardFiltersViewModel$ableToChooseMyGym$1(this, null), 3);
        this.B = leaderboardFiltersModel;
        this.C = leaderboardFiltersModel;
        this.D = oh7.a(this.u, new t36(0));
        this.E = oh7.a(this.u, new w36(0));
        this.F = oh7.a(this.u, new sx(1));
        this.G = oh7.a(this.u, new tx(1));
        this.H = oh7.a(this.u, new hc3(2));
        this.I = oh7.a(this.u, new se(3));
        this.J = oh7.a(this.u, new te(3));
        this.K = oh7.a(this.u, new mk0(3));
        this.L = oh7.a(this.u, new ic3(1));
        this.M = oh7.a(this.u, new u36());
        this.N = oh7.a(this.u, new v36());
        yk2.o(new k74(observeLeaderboardFiltersFlowUseCase.b(g2b.a), new LeaderboardFiltersViewModel$observeLeaderboardFiltersState$1(this, null)), rhb.b(this));
        g();
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (!(bl0Var instanceof Action.FiltersStateChanged)) {
            return bl0Var instanceof Action.SetInputIncorrect ? LeaderboardFiltersViewState.a(b(), null, false, false, null, null, null, null, null, false, false, ((Action.SetInputIncorrect) bl0Var).a, 1023) : b();
        }
        Action.FiltersStateChanged filtersStateChanged = (Action.FiltersStateChanged) bl0Var;
        LeaderboardFiltersViewState leaderboardFiltersViewStateB = b();
        LeaderboardFiltersViewState leaderboardFiltersViewState = filtersStateChanged.a;
        return LeaderboardFiltersViewState.a(leaderboardFiltersViewStateB, leaderboardFiltersViewState.a, leaderboardFiltersViewState.b, leaderboardFiltersViewState.c, leaderboardFiltersViewState.d, leaderboardFiltersViewState.e, leaderboardFiltersViewState.f, leaderboardFiltersViewState.g, leaderboardFiltersViewState.h, leaderboardFiltersViewState.i, filtersStateChanged.b, false, 1024);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0023  */
    public final void g() {
        boolean z;
        LeaderboardFiltersModel leaderboardFiltersModel = this.C;
        if (leaderboardFiltersModel.g) {
            Integer num = leaderboardFiltersModel.e;
            int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            Integer num2 = this.C.f;
            if (iIntValue > (num2 != null ? num2.intValue() : Integer.MAX_VALUE)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        e(new Action.SetInputIncorrect(z));
        oy0.d(rhb.b(this), null, null, new LeaderboardFiltersViewModel$updateFiltersState$1(this, LeaderboardFiltersExtensionsKt.a(this.C, this.B), z, null), 3);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class Action implements bl0 {

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class FiltersStateChanged extends Action {
            public final LeaderboardFiltersViewState a;
            public final boolean b;

            public FiltersStateChanged(LeaderboardFiltersViewState leaderboardFiltersViewState, boolean z) {
                super(0);
                this.a = leaderboardFiltersViewState;
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
        public static final class SetInputIncorrect extends Action {
            public final boolean a;

            public SetInputIncorrect(boolean z) {
                super(0);
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SetInputIncorrect) && this.a == ((SetInputIncorrect) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return cq2.a("SetInputIncorrect(isIncorrect=", ")", this.a);
            }
        }

        public /* synthetic */ Action(int i) {
            this();
        }

        private Action() {
        }
    }
}
