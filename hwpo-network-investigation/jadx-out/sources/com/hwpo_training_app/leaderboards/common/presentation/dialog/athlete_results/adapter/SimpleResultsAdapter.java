package com.hwpo_training_app.leaderboards.common.presentation.dialog.athlete_results.adapter;

import androidx.recyclerview.widget.m;
import com.hwpo_training_app.leaderboards.common.presentation.dialog.athlete_results.adapter.delegate.SimpleResultDelegateKt$simpleResultDelegate$$inlined$adapterDelegateViewBinding$default$1;
import com.hwpo_training_app.leaderboards.common.presentation.dialog.athlete_results.adapter.delegate.SimpleResultDelegateKt$simpleResultDelegate$$inlined$adapterDelegateViewBinding$default$2;
import com.hwpo_training_app.leaderboards.common.presentation.entity.SimpleAthleteResultUiEntity;
import defpackage.e93;
import defpackage.ej3;
import defpackage.n50;
import defpackage.qp9;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SimpleResultsAdapter extends n50<SimpleAthleteResultUiEntity> {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class SimpleResultsDiffCallback extends m.e<SimpleAthleteResultUiEntity> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean a(SimpleAthleteResultUiEntity simpleAthleteResultUiEntity, SimpleAthleteResultUiEntity simpleAthleteResultUiEntity2) {
            return simpleAthleteResultUiEntity.equals(simpleAthleteResultUiEntity2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean b(SimpleAthleteResultUiEntity simpleAthleteResultUiEntity, SimpleAthleteResultUiEntity simpleAthleteResultUiEntity2) {
            return xj5.a(simpleAthleteResultUiEntity.t, simpleAthleteResultUiEntity2.t);
        }
    }

    public SimpleResultsAdapter() {
        super(new SimpleResultsDiffCallback());
        this.d.b(new e93(new qp9(), new SimpleResultDelegateKt$simpleResultDelegate$$inlined$adapterDelegateViewBinding$default$1(), new ej3(1), SimpleResultDelegateKt$simpleResultDelegate$$inlined$adapterDelegateViewBinding$default$2.u));
    }
}
