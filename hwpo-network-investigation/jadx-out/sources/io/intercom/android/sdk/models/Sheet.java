package io.intercom.android.sdk.models;

import com.google.gson.JsonObject;
import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class Sheet {
    private final String body;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Builder {
        JsonObject sheet_request_body;
        String sheet_title;

        public Sheet build() {
            return new Sheet(this);
        }
    }

    public Sheet(Builder builder) {
        JsonObject jsonObject = builder.sheet_request_body;
        this.body = jsonObject == null ? BuildConfig.FLAVOR : jsonObject.toString();
    }

    public String getBody() {
        return this.body;
    }
}
