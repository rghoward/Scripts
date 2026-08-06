package defpackage;

import com.hwpo_training_app.core.data.model.user.UserNetworkEntity;
import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface e6b {
    static /* synthetic */ Object a(e6b e6bVar, String str, String str2, String str3, String str4, String str5, String str6, LocalDate localDate, String str7, Integer num, String str8, u02 u02Var, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            str5 = null;
        }
        if ((i & 32) != 0) {
            str6 = null;
        }
        if ((i & 64) != 0) {
            localDate = null;
        }
        if ((i & 128) != 0) {
            str7 = null;
        }
        if ((i & 256) != 0) {
            num = null;
        }
        if ((i & 512) != 0) {
            str8 = null;
        }
        return e6bVar.b(str, str2, str3, str4, str5, str6, localDate, str7, num, str8, u02Var);
    }

    @vn7("users")
    @gd4
    Object b(@nu3("first_name") String str, @nu3("last_name") String str2, @nu3("gender") String str3, @nu3("country") String str4, @nu3("weight") String str5, @nu3("length") String str6, @nu3("birthdate") LocalDate localDate, @nu3("gym_type") String str7, @nu3("gym_id") Integer num, @nu3("client_language") String str8, r02<? super UserNetworkEntity> r02Var);
}
