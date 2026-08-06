package defpackage;

import com.hwpo_training_app.affiliated_gym.data.entity.GymFilterCountryNetworkEntity$$serializer;
import com.hwpo_training_app.affiliated_gym.data.entity.response.GymFilterCountriesResponse;
import com.hwpo_training_app.core.data.model.user.UserNetworkEntity;
import com.hwpo_training_app.multilanguage.data.model.AppLanguageNetworkEntity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bq4 implements mh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ bq4(int i) {
        this.t = i;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        switch (this.t) {
            case 0:
                GymFilterCountriesResponse.Companion companion = GymFilterCountriesResponse.Companion;
                return new m30(GymFilterCountryNetworkEntity$$serializer.INSTANCE);
            default:
                UserNetworkEntity.Companion companion2 = UserNetworkEntity.Companion;
                return AppLanguageNetworkEntity.Companion.serializer();
        }
    }
}
