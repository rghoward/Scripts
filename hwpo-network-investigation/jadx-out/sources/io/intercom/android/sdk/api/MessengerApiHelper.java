package io.intercom.android.sdk.api;

import com.google.gson.Gson;
import defpackage.if3;
import defpackage.n17;
import defpackage.ol8;
import defpackage.qp8;
import defpackage.wq6;
import io.intercom.android.sdk.Injector;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class MessengerApiHelper {
    public static final int $stable = 0;
    public static final MessengerApiHelper INSTANCE = new MessengerApiHelper();

    private MessengerApiHelper() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ qp8 getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper messengerApiHelper, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = if3.t;
        }
        return messengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release(map);
    }

    public final List<n17.c> getDefaultMultipartFields$intercom_sdk_base_release() {
        Injector injector = Injector.get();
        Map<String, Object> map = injector.getUserIdentity().toMap();
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        injector.getApi().addSecureHash(linkedHashMap);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            str.getClass();
            arrayList.add(n17.c.a.a(str, value.toString()));
        }
        return arrayList;
    }

    public final qp8 getDefaultRequestBody$intercom_sdk_base_release(Map<String, ? extends Object> map) {
        map.getClass();
        Injector injector = Injector.get();
        Map<String, Object> map2 = injector.getUserIdentity().toMap();
        injector.getApi().addSecureHash(map2);
        map2.putAll(map);
        return optionsMapToRequestBody(map2);
    }

    public final qp8 optionsMapToRequestBody(Map<String, ? extends Object> map) {
        map.getClass();
        qp8.a aVar = qp8.Companion;
        String json = new Gson().toJson(map);
        json.getClass();
        ol8 ol8Var = wq6.e;
        wq6 wq6VarA = wq6.a.a("application/json; charset=utf-8");
        aVar.getClass();
        return qp8.a.b(json, wq6VarA);
    }
}
