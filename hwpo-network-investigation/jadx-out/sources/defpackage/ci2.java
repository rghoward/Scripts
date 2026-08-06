package defpackage;

import com.hwpo_training_app.core.data.model.schedule.score.ScoreMeasureTypeNetworkEntity;
import com.hwpo_training_app.core.data.model.schedule.score.ScoreSubValueNetworkEntity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ci2 implements mh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ ci2(int i) {
        this.t = i;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        switch (this.t) {
            case 0:
                return bl7.i(Boolean.FALSE);
            default:
                ScoreSubValueNetworkEntity.Companion companion = ScoreSubValueNetworkEntity.Companion;
                return ScoreMeasureTypeNetworkEntity.Companion.serializer();
        }
    }
}
