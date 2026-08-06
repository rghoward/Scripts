package io.intercom.android.nexus;

import com.intercom.twig.BuildConfig;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class EventData extends HashMap<String, Object> {
    public EventData() {
    }

    public long optLong(String str, long j) {
        Object obj = get(str);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return obj instanceof Long ? ((Long) obj).longValue() : j;
    }

    public String optString(String str, String str2) {
        Object obj = get(str);
        return obj instanceof String ? (String) obj : str2;
    }

    public EventData(int i) {
        super(i);
    }

    public String optString(String str) {
        return optString(str, BuildConfig.FLAVOR);
    }

    public long optLong(String str) {
        return optLong(str, -1L);
    }
}
