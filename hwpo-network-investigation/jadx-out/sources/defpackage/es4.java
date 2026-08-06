package defpackage;

import com.hwpo_training_app.affiliated_gym.data.entity.response.GymFilterCitiesResponse;
import com.hwpo_training_app.affiliated_gym.data.entity.response.GymFilterCountriesResponse;
import com.hwpo_training_app.affiliated_gym.data.entity.response.GymsListResponse;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface es4 {
    @ui4("athlete/settings/gyms")
    Object a(@gg8("q[name_or_city_cont]") String str, @gg8("page") Integer num, @gg8("per_page") int i, @gg8("country") String str2, @gg8("city") String str3, r02<? super GymsListResponse> r02Var);

    @ui4("athlete/settings/countries")
    Object b(@gg8("page") Integer num, @gg8("per_page") int i, r02<? super GymFilterCountriesResponse> r02Var);

    @ui4("athlete/settings/cities")
    Object c(@gg8("country") String str, @gg8("page") Integer num, @gg8("per_page") int i, r02<? super GymFilterCitiesResponse> r02Var);
}
