package com.hwpo_training_app.leaderboards.filter.list.presentation.flow;

import defpackage.bl0;
import defpackage.dl0;
import defpackage.el0;
import defpackage.s36;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardFiltersFlowViewModel extends dl0<State, Action> {
    public final s36 x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class Action implements bl0 {
        private Action() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class State implements el0 {
        public static final State a = new State();

        private State() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardFiltersFlowViewModel(s36 s36Var) {
        super(State.a);
        s36Var.getClass();
        this.x = s36Var;
        s36Var.a();
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        return b();
    }
}
