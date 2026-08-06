package io.ably.lib.objects.type.map;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import io.ably.lib.objects.type.counter.LiveCounter;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class LiveMapValue {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class BinaryValue extends LiveMapValue {
        private final byte[] value;

        public BinaryValue(byte[] bArr) {
            this.value = bArr;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public byte[] getAsBinary() {
            return this.value;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public Object getValue() {
            return this.value;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public boolean isBinary() {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class BooleanValue extends LiveMapValue {
        private final Boolean value;

        public BooleanValue(Boolean bool) {
            this.value = bool;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public Boolean getAsBoolean() {
            return this.value;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public Object getValue() {
            return this.value;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public boolean isBoolean() {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class JsonArrayValue extends LiveMapValue {
        private final JsonArray value;

        public JsonArrayValue(JsonArray jsonArray) {
            this.value = jsonArray;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public JsonArray getAsJsonArray() {
            return this.value;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public Object getValue() {
            return this.value;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public boolean isJsonArray() {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class JsonObjectValue extends LiveMapValue {
        private final JsonObject value;

        public JsonObjectValue(JsonObject jsonObject) {
            this.value = jsonObject;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public JsonObject getAsJsonObject() {
            return this.value;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public Object getValue() {
            return this.value;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public boolean isJsonObject() {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class LiveCounterValue extends LiveMapValue {
        private final LiveCounter value;

        public LiveCounterValue(LiveCounter liveCounter) {
            this.value = liveCounter;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public LiveCounter getAsLiveCounter() {
            return this.value;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public Object getValue() {
            return this.value;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public boolean isLiveCounter() {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class LiveMapValueWrapper extends LiveMapValue {
        private final LiveMap value;

        public LiveMapValueWrapper(LiveMap liveMap) {
            this.value = liveMap;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public LiveMap getAsLiveMap() {
            return this.value;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public Object getValue() {
            return this.value;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public boolean isLiveMap() {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class NumberValue extends LiveMapValue {
        private final Number value;

        public NumberValue(Number number) {
            this.value = number;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public Number getAsNumber() {
            return this.value;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public Object getValue() {
            return this.value;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public boolean isNumber() {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class StringValue extends LiveMapValue {
        private final String value;

        public StringValue(String str) {
            this.value = str;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public String getAsString() {
            return this.value;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public Object getValue() {
            return this.value;
        }

        @Override // io.ably.lib.objects.type.map.LiveMapValue
        public boolean isString() {
            return true;
        }
    }

    public static LiveMapValue of(Boolean bool) {
        return new BooleanValue(bool);
    }

    public byte[] getAsBinary() {
        throw new IllegalStateException("Not a Binary value");
    }

    public Boolean getAsBoolean() {
        throw new IllegalStateException("Not a Boolean value");
    }

    public JsonArray getAsJsonArray() {
        throw new IllegalStateException("Not a JsonArray value");
    }

    public JsonObject getAsJsonObject() {
        throw new IllegalStateException("Not a JsonObject value");
    }

    public LiveCounter getAsLiveCounter() {
        throw new IllegalStateException("Not a LiveCounter value");
    }

    public LiveMap getAsLiveMap() {
        throw new IllegalStateException("Not a LiveMap value");
    }

    public Number getAsNumber() {
        throw new IllegalStateException("Not a Number value");
    }

    public String getAsString() {
        throw new IllegalStateException("Not a String value");
    }

    public abstract Object getValue();

    public boolean isBinary() {
        return false;
    }

    public boolean isBoolean() {
        return false;
    }

    public boolean isJsonArray() {
        return false;
    }

    public boolean isJsonObject() {
        return false;
    }

    public boolean isLiveCounter() {
        return false;
    }

    public boolean isLiveMap() {
        return false;
    }

    public boolean isNumber() {
        return false;
    }

    public boolean isString() {
        return false;
    }

    public static LiveMapValue of(byte[] bArr) {
        return new BinaryValue(bArr);
    }

    public static LiveMapValue of(Number number) {
        return new NumberValue(number);
    }

    public static LiveMapValue of(String str) {
        return new StringValue(str);
    }

    public static LiveMapValue of(JsonArray jsonArray) {
        return new JsonArrayValue(jsonArray);
    }

    public static LiveMapValue of(JsonObject jsonObject) {
        return new JsonObjectValue(jsonObject);
    }

    public static LiveMapValue of(LiveCounter liveCounter) {
        return new LiveCounterValue(liveCounter);
    }

    public static LiveMapValue of(LiveMap liveMap) {
        return new LiveMapValueWrapper(liveMap);
    }
}
