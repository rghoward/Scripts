package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bw5 {
    public static final sv5[] a = new sv5[0];
    public static final String[] b = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};
    public static final String[] c = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};

    public static final byte a(char c2) {
        if (c2 < '~') {
            return oa1.b[c2];
        }
        return (byte) 0;
    }

    public static final boolean b(iw iwVar) {
        int length = iwVar.u.length();
        List<iw.c<? extends iw.a>> list = iwVar.t;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                iw.c<? extends iw.a> cVar = list.get(i);
                if ((cVar.a instanceof l86) && lw.b(0, length, cVar.b, cVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final String c(byte b2) {
        if (b2 == 1) {
            return "quotation mark '\"'";
        }
        if (b2 == 2) {
            return "string escape sequence '\\'";
        }
        if (b2 == 4) {
            return "comma ','";
        }
        if (b2 == 5) {
            return "colon ':'";
        }
        if (b2 == 6) {
            return "start of the object '{'";
        }
        if (b2 == 7) {
            return "end of the object '}'";
        }
        if (b2 == 8) {
            return "start of the array '['";
        }
        if (b2 == 9) {
            return "end of the array ']'";
        }
        if (b2 == 10) {
            return "end of the input";
        }
        return b2 == 127 ? "invalid token" : "valid token";
    }
}
