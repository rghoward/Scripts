package com.hwpo_training_app.leaderboards.details.list.presentation;

import com.hwpo_training_app.leaderboards.details.list.presentation.entity.AthleteResultUiEntity;
import defpackage.el0;
import defpackage.hf3;
import defpackage.uo2;
import defpackage.vz7;
import defpackage.xj5;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AthletesListViewState implements el0 {
    public static final Companion Companion = new Companion(0);
    public static final AthletesListViewState e = new AthletesListViewState(new vz7(0, false, false, null, null, null, 127), hf3.t, true, false);
    public final List<AthleteResultUiEntity> a;
    public final boolean b;
    public final boolean c;
    public final vz7 d;

    public AthletesListViewState(vz7 vz7Var, List list, boolean z, boolean z2) {
        list.getClass();
        vz7Var.getClass();
        this.a = list;
        this.b = z;
        this.c = z2;
        this.d = vz7Var;
    }

    public static AthletesListViewState a(AthletesListViewState athletesListViewState, List list, boolean z, boolean z2, vz7 vz7Var, int i) {
        if ((i & 1) != 0) {
            list = athletesListViewState.a;
        }
        if ((i & 2) != 0) {
            z = athletesListViewState.b;
        }
        if ((i & 4) != 0) {
            z2 = athletesListViewState.c;
        }
        if ((i & 8) != 0) {
            vz7Var = athletesListViewState.d;
        }
        athletesListViewState.getClass();
        list.getClass();
        vz7Var.getClass();
        return new AthletesListViewState(vz7Var, list, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AthletesListViewState)) {
            return false;
        }
        AthletesListViewState athletesListViewState = (AthletesListViewState) obj;
        return xj5.a(this.a, athletesListViewState.a) && this.b == athletesListViewState.b && this.c == athletesListViewState.c && xj5.a(this.d, athletesListViewState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + uo2.a(uo2.a(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return "AthletesListViewState(athletesResultsList=" + this.a + ", isLoading=" + this.b + ", isPaginationProgress=" + this.c + ", placeholderState=" + this.d + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }
}
