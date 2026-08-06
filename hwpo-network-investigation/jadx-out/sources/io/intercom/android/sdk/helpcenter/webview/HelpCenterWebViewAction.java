package io.intercom.android.sdk.helpcenter.webview;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class HelpCenterWebViewAction {
    private final String type;
    private final Map<String, Object> value;

    public HelpCenterWebViewAction(String str, Map<String, Object> map) {
        this.type = str;
        this.value = map;
    }

    public String getType() {
        return this.type;
    }

    public Map<String, Object> getValue() {
        return this.value;
    }
}
