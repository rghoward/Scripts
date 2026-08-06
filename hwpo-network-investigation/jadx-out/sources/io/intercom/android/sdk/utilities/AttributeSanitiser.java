package io.intercom.android.sdk.utilities;

import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class AttributeSanitiser {
    private static final String EMAIL = "email";
    private static final String USER_ID = "user_id";
    private static final Twig twig = LumberMill.getLogger();

    public static void anonymousSanitisation(Map<String, ?> map) {
        if (map.containsKey("email")) {
            twig.e(String.format("You cannot update the email of an anonymous user. Please call registerIdentified user instead. The email: %s was NOT applied", map.remove("email")), new Object[0]);
        }
        if (map.containsKey(USER_ID)) {
            twig.e(String.format("You cannot update the user_id of an anonymous user. Please call registerIdentified user instead. The user_id: %s was NOT applied", map.remove(USER_ID)), new Object[0]);
        }
    }
}
