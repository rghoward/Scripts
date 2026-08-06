package io.intercom.android.sdk.sheets;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class SheetWebViewAction {
    private final Map<String, Object> metaData;
    private final Map<String, Object> payload;
    private final String type;

    public SheetWebViewAction(String str, Map<String, Object> map, Map<String, Object> map2) {
        this.type = str;
        this.payload = map;
        this.metaData = map2;
    }

    public Map<String, Object> getMetaData() {
        return this.metaData;
    }

    public Map<String, Object> getPayload() {
        return this.payload;
    }

    public String getType() {
        return this.type;
    }
}
