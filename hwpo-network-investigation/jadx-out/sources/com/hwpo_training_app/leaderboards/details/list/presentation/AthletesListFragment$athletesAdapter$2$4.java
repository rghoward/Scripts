package com.hwpo_training_app.leaderboards.details.list.presentation;

import defpackage.g2b;
import defpackage.oh4;
import defpackage.oy0;
import defpackage.pi4;
import defpackage.rhb;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AthletesListFragment$athletesAdapter$2$4 extends pi4 implements oh4<Integer, g2b> {
    public final void invoke(int i) {
        AthletesListViewModel athletesListViewModel = (AthletesListViewModel) this.receiver;
        if (athletesListViewModel.b().b || athletesListViewModel.b().c || i + 5 < athletesListViewModel.b().a.size()) {
            return;
        }
        oy0.d(rhb.b(athletesListViewModel), null, null, new AthletesListViewModel$fetchLeaderboardTopValuesNextPage$1(athletesListViewModel, null), 3);
    }

    @Override // defpackage.oh4
    public final /* bridge */ /* synthetic */ g2b invoke(Integer num) {
        invoke(num.intValue());
        return g2b.a;
    }
}
