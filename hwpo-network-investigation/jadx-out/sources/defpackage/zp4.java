package defpackage;

import com.hwpo_training_app.affiliated_gym.data.entity.GymFilterCityNetworkEntity$$serializer;
import com.hwpo_training_app.affiliated_gym.data.entity.response.GymFilterCitiesResponse;
import com.hwpo_training_app.core.data.model.user.UserNetworkEntity;
import com.hwpo_training_app.core.data.model.user.WeightUnitsNetworkEntity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zp4 implements mh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ zp4(int i) {
        this.t = i;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        switch (this.t) {
            case 0:
                GymFilterCitiesResponse.Companion companion = GymFilterCitiesResponse.Companion;
                return new m30(GymFilterCityNetworkEntity$$serializer.INSTANCE);
            default:
                UserNetworkEntity.Companion companion2 = UserNetworkEntity.Companion;
                return WeightUnitsNetworkEntity.Companion.serializer();
        }
    }
}
