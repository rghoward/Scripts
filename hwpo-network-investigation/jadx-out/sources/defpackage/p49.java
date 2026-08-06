package defpackage;

import com.hwpo_training_app.core.data.model.gym.GymTypeNetworkEntity;
import com.hwpo_training_app.core.data.model.schedule.score.ScheduleScoreNetworkEntity;
import com.hwpo_training_app.core.data.model.user.UserNetworkEntity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p49 implements mh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ p49(int i) {
        this.t = i;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        switch (this.t) {
            case 0:
                ScheduleScoreNetworkEntity.Companion companion = ScheduleScoreNetworkEntity.Companion;
                return new m30(o2a.a);
            default:
                UserNetworkEntity.Companion companion2 = UserNetworkEntity.Companion;
                return GymTypeNetworkEntity.Companion.serializer();
        }
    }
}
