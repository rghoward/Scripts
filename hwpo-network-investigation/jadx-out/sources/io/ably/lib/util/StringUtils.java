package io.ably.lib.util;

import com.google.gson.JsonElement;
import io.ably.lib.http.HttpCore;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class StringUtils {
    public static Serialisation.FromJsonElement<String> fromJsonElement;
    public static HttpCore.BodyHandler<String> httpBodyHandler;
    public static HttpCore.ResponseHandler<String> httpResponseHandler;

    static {
        Serialisation.FromJsonElement<String> fromJsonElement2 = new Serialisation.FromJsonElement<String>() { // from class: io.ably.lib.util.StringUtils.1
            @Override // io.ably.lib.util.Serialisation.FromJsonElement
            public String fromJsonElement(JsonElement jsonElement) {
                return jsonElement.getAsJsonPrimitive().getAsString();
            }
        };
        fromJsonElement = fromJsonElement2;
        httpResponseHandler = new Serialisation.HttpResponseHandler(String.class, fromJsonElement2);
        httpBodyHandler = new Serialisation.HttpBodyHandler(String[].class, fromJsonElement);
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }
}
