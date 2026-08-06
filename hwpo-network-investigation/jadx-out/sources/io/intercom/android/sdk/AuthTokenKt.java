package io.intercom.android.sdk;

import defpackage.ph1;
import defpackage.pi6;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AuthTokenKt {
    public static final Map<String, String> toMap(List<AuthToken> list) {
        list.getClass();
        int iG = pi6.g(ph1.n(list, 10));
        if (iG < 16) {
            iG = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
        for (AuthToken authToken : list) {
            linkedHashMap.put(authToken.getName(), authToken.getToken());
        }
        return linkedHashMap;
    }
}
