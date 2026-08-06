package defpackage;

import com.hwpo_training_app.core.data.model.user.UserNetworkEntity;
import com.hwpo_training_app.core.domain.model.auth.AuthResponse;
import com.hwpo_training_app.core.domain.model.response.MessageResponse;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface ga0 {
    public static final a Companion = a.a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final /* synthetic */ a a = new a();
    }

    @wn7("users/sign_in")
    @gd4
    Object a(@nu3("client_id") String str, @nu3("client_secret") String str2, @nu3("email") String str3, @nu3("password") String str4, r02<? super ru8<AuthResponse>> r02Var);

    @ui4("users/me")
    Object b(r02<? super UserNetworkEntity> r02Var);

    @wd2("users/sign_out")
    Object c(r02<? super ru8<g2b>> r02Var);

    @wn7("devices")
    @gd4
    Object d(@nu3("token") String str, @nu3("environment") String str2, r02<? super g2b> r02Var);

    @wn7("users/password")
    @gd4
    Object e(@nu3("email") String str, r02<? super MessageResponse> r02Var);
}
