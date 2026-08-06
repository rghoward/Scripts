package io.intercom.android.sdk.api;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.intercom.twig.Twig;
import defpackage.th1;
import defpackage.xo;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.metrics.MetricTracker;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ErrorStringExtractorKt {
    private static final String extractErrorFromElement(JsonElement jsonElement) {
        if (jsonElement.isJsonPrimitive()) {
            String asString = jsonElement.getAsString();
            asString.getClass();
            return asString;
        }
        if (jsonElement.isJsonArray()) {
            JsonArray asJsonArray = jsonElement.getAsJsonArray();
            asJsonArray.getClass();
            return extractErrorFromJsonArray(asJsonArray);
        }
        if (!jsonElement.isJsonObject()) {
            return "Something went wrong";
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        asJsonObject.getClass();
        return extractErrorFromJsonObject(asJsonObject);
    }

    private static final String extractErrorFromJsonArray(JsonArray jsonArray) {
        return th1.F(jsonArray, " - ", null, null, new xo(1), 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence extractErrorFromJsonArray$lambda$0(JsonElement jsonElement) {
        if (jsonElement.isJsonPrimitive()) {
            String asString = jsonElement.getAsString();
            asString.getClass();
            return asString;
        }
        if (!jsonElement.isJsonObject()) {
            return "Something went wrong";
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        asJsonObject.getClass();
        return extractErrorFromJsonObject(asJsonObject);
    }

    private static final String extractErrorFromJsonObject(JsonObject jsonObject) {
        if (!jsonObject.has(MetricTracker.Object.MESSAGE)) {
            return "Something went wrong";
        }
        String asString = jsonObject.get(MetricTracker.Object.MESSAGE).getAsString();
        asString.getClass();
        return asString;
    }

    public static final String extractErrorString(ErrorObject errorObject) {
        String message;
        errorObject.getClass();
        Twig logger = LumberMill.getLogger();
        if (!errorObject.hasErrorBody() || errorObject.getErrorBody() == null) {
            return "Something went wrong";
        }
        try {
            JsonObject jsonObject = (JsonObject) Injector.get().getGson().fromJson(errorObject.getErrorBody(), JsonObject.class);
            if (jsonObject == null) {
                return "Something went wrong";
            }
            if (jsonObject.has("error")) {
                JsonElement jsonElement = jsonObject.get("error");
                jsonElement.getClass();
                return extractErrorFromElement(jsonElement);
            }
            if (!jsonObject.has("errors")) {
                return "Something went wrong";
            }
            JsonArray asJsonArray = jsonObject.getAsJsonArray("errors");
            asJsonArray.getClass();
            return extractErrorFromJsonArray(asJsonArray);
        } catch (Exception e) {
            logger.e(e);
            Throwable throwable = errorObject.getThrowable();
            return (throwable == null || (message = throwable.getMessage()) == null) ? "Something went wrong" : message;
        }
    }
}
