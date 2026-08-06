package io.ably.lib.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import defpackage.ct1;
import defpackage.dbb;
import defpackage.o95;
import defpackage.ru3;
import defpackage.v85;
import defpackage.x7b;
import io.ably.lib.http.HttpConstants;
import io.ably.lib.http.HttpCore;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.Annotation;
import io.ably.lib.types.AnnotationAction;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.Message;
import io.ably.lib.types.MessageAnnotations;
import io.ably.lib.types.MessageExtras;
import io.ably.lib.types.MessageVersion;
import io.ably.lib.types.PresenceMessage;
import io.ably.lib.types.ProtocolMessage;
import io.ably.lib.types.Summary;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.msgpack.core.MessagePack;
import org.msgpack.core.MessagePacker;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class Serialisation {
    public static final Gson gson;
    public static final GsonBuilder gsonBuilder;
    public static final JsonParser gsonParser = new JsonParser();
    public static HttpBodyHandler<JsonElement> httpBodyHandler;
    public static HttpResponseHandler<JsonElement> httpResponseHandler;
    public static final MessagePack.PackerConfig msgpackPackerConfig;
    public static final MessagePack.UnpackerConfig msgpackUnpackerConfig;

    /* JADX INFO: renamed from: io.ably.lib.util.Serialisation$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$msgpack$value$ValueType;

        static {
            int[] iArr = new int[dbb.values().length];
            $SwitchMap$org$msgpack$value$ValueType = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface FromJsonElement<T> {
        T fromJsonElement(JsonElement jsonElement);
    }

    static {
        GsonBuilder gsonBuilder2 = new GsonBuilder();
        gsonBuilder = gsonBuilder2;
        gsonBuilder2.registerTypeAdapter(Message.class, new Message.Serializer());
        gsonBuilder2.registerTypeAdapter(MessageExtras.class, new MessageExtras.Serializer());
        gsonBuilder2.registerTypeAdapter(PresenceMessage.class, new PresenceMessage.Serializer());
        gsonBuilder2.registerTypeAdapter(PresenceMessage.Action.class, new PresenceMessage.ActionSerializer());
        gsonBuilder2.registerTypeAdapter(ProtocolMessage.Action.class, new ProtocolMessage.ActionSerializer());
        gsonBuilder2.registerTypeAdapter(MessageVersion.class, new MessageVersion.Serializer());
        gsonBuilder2.registerTypeAdapter(Annotation.class, new Annotation.Serializer());
        gsonBuilder2.registerTypeAdapter(AnnotationAction.class, new Annotation.ActionSerializer());
        gsonBuilder2.registerTypeAdapter(MessageAnnotations.class, new MessageAnnotations.Serializer());
        gsonBuilder2.registerTypeAdapter(Summary.class, new Summary.Serializer());
        gson = gsonBuilder2.create();
        msgpackPackerConfig = new MessagePack.PackerConfig().withSmallStringOptimizationThreshold(Integer.MAX_VALUE);
        msgpackUnpackerConfig = MessagePack.DEFAULT_UNPACKER_CONFIG;
        httpResponseHandler = new HttpResponseHandler<>();
        httpBodyHandler = new HttpBodyHandler<>();
    }

    private static void gsonToMsgpack(JsonPrimitive jsonPrimitive, MessagePacker messagePacker) {
        try {
            if (jsonPrimitive.isBoolean()) {
                messagePacker.packBoolean(jsonPrimitive.getAsBoolean());
                return;
            }
            if (!jsonPrimitive.isNumber()) {
                messagePacker.packString(jsonPrimitive.getAsString());
                return;
            }
            Number asNumber = jsonPrimitive.getAsNumber();
            if (!(asNumber instanceof BigDecimal) && !(asNumber instanceof Double)) {
                if (asNumber instanceof Float) {
                    messagePacker.packFloat(asNumber.floatValue());
                    return;
                }
                if (!(asNumber instanceof BigInteger) && !(asNumber instanceof Long)) {
                    if (asNumber instanceof Integer) {
                        messagePacker.packInt(asNumber.intValue());
                        return;
                    }
                    if (asNumber instanceof Short) {
                        messagePacker.packShort(asNumber.shortValue());
                        return;
                    } else if (asNumber instanceof Byte) {
                        messagePacker.packByte(asNumber.byteValue());
                        return;
                    } else {
                        messagePacker.packString(jsonPrimitive.getAsString());
                        return;
                    }
                }
                messagePacker.packLong(asNumber.longValue());
                return;
            }
            messagePacker.packDouble(asNumber.doubleValue());
        } catch (IOException unused) {
        }
    }

    public static <T> T jsonBytesToGson(byte[] bArr, Class<T> cls) {
        try {
            return (T) gson.fromJson(new String(bArr, "UTF-8"), (Class) cls);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static JsonElement msgpackToGson(x7b x7bVar) {
        switch (x7bVar.p().ordinal()) {
            case 0:
                return JsonNull.INSTANCE;
            case 1:
                return new JsonPrimitive(Boolean.valueOf(x7bVar.n().t));
            case 2:
                return new JsonPrimitive(Long.valueOf(x7bVar.q().e()));
            case 3:
                return new JsonPrimitive(Double.valueOf(x7bVar.r().t));
            case 4:
                return new JsonPrimitive(x7bVar.C().U());
            case 5:
                byte[] bArr = x7bVar.D().t;
                return new JsonPrimitive(Base64Coder.encodeToString(Arrays.copyOf(bArr, bArr.length)));
            case 6:
                JsonArray jsonArray = new JsonArray();
                Iterator<x7b> it = ((v85) x7bVar.l()).iterator();
                while (true) {
                    v85.a aVar = (v85.a) it;
                    if (!aVar.hasNext()) {
                        return jsonArray;
                    }
                    jsonArray.add(msgpackToGson((x7b) aVar.next()));
                }
                break;
            case 7:
                JsonObject jsonObject = new JsonObject();
                Iterator<Map.Entry<x7b, x7b>> it2 = x7bVar.t().entrySet().iterator();
                while (true) {
                    o95.b bVar = (o95.b) it2;
                    if (!bVar.hasNext()) {
                        return jsonObject;
                    }
                    Map.Entry<x7b, x7b> next = bVar.next();
                    jsonObject.add(next.getKey().C().U(), msgpackToGson(next.getValue()));
                }
                break;
            default:
                return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class HttpBodyHandler<T> implements HttpCore.BodyHandler<T> {
        private final FromJsonElement<T> converter;
        private final Class<T[]> klass;

        public HttpBodyHandler(Class<T[]> cls, FromJsonElement<T> fromJsonElement) {
            this.klass = cls;
            this.converter = fromJsonElement;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.ably.lib.http.HttpCore.BodyHandler
        public T[] handleResponseBody(String str, byte[] bArr) throws AblyException {
            JsonArray jsonArray;
            if (HttpConstants.ContentTypes.JSON.equals(str)) {
                Class<T[]> cls = this.klass;
                if (cls != null) {
                    return (T[]) ((Object[]) Serialisation.jsonBytesToGson(bArr, cls));
                }
                jsonArray = (JsonArray) Serialisation.jsonBytesToGson(bArr, JsonArray.class);
            } else {
                if (!"application/x-msgpack".equals(str)) {
                    throw AblyException.fromThrowable(new Exception(ct1.a("unknown content type ", str)));
                }
                jsonArray = (JsonArray) Serialisation.msgpackToGson(bArr);
            }
            Class<T[]> cls2 = this.klass;
            T[] tArrCast = cls2.cast(Array.newInstance(cls2.getComponentType(), jsonArray.size()));
            int i = 0;
            for (JsonElement jsonElement : jsonArray) {
                FromJsonElement<T> fromJsonElement = this.converter;
                if (fromJsonElement != null) {
                    tArrCast[i] = fromJsonElement.fromJsonElement(jsonElement);
                } else {
                    tArrCast[i] = jsonElement;
                }
                i++;
            }
            return tArrCast;
        }

        public <U extends JsonElement> HttpBodyHandler() {
            this(null, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class HttpResponseHandler<T> implements HttpCore.ResponseHandler<T> {
        private final FromJsonElement<T> converter;
        private final Class<T> klass;

        public HttpResponseHandler(Class<T> cls, FromJsonElement<T> fromJsonElement) {
            this.klass = cls;
            this.converter = fromJsonElement;
        }

        @Override // io.ably.lib.http.HttpCore.ResponseHandler
        public T handleResponse(HttpCore.Response response, ErrorInfo errorInfo) throws AblyException {
            if (errorInfo != null) {
                throw AblyException.fromErrorInfo(errorInfo);
            }
            if (HttpConstants.ContentTypes.JSON.equals(response.contentType)) {
                Class<T> cls = this.klass;
                byte[] bArr = response.body;
                return cls != null ? (T) Serialisation.jsonBytesToGson(bArr, cls) : (T) Serialisation.jsonBytesToGson(bArr);
            }
            if ("application/x-msgpack".equals(response.contentType)) {
                FromJsonElement<T> fromJsonElement = this.converter;
                byte[] bArr2 = response.body;
                return fromJsonElement != null ? fromJsonElement.fromJsonElement(Serialisation.msgpackToGson(bArr2)) : (T) Serialisation.msgpackToGson(bArr2);
            }
            throw AblyException.fromThrowable(new Exception("unknown content type " + response.contentType));
        }

        public <U extends JsonElement> HttpResponseHandler() {
            this(null, null);
        }
    }

    public static JsonElement jsonBytesToGson(byte[] bArr) {
        return (JsonElement) jsonBytesToGson(bArr, JsonElement.class);
    }

    public static void gsonToMsgpack(JsonElement jsonElement, MessagePacker messagePacker) {
        if (jsonElement.isJsonArray()) {
            gsonToMsgpack((JsonArray) jsonElement, messagePacker);
            return;
        }
        if (jsonElement.isJsonObject()) {
            gsonToMsgpack((JsonObject) jsonElement, messagePacker);
            return;
        }
        if (jsonElement.isJsonNull()) {
            gsonToMsgpack((JsonNull) jsonElement, messagePacker);
        } else if (jsonElement.isJsonPrimitive()) {
            gsonToMsgpack((JsonPrimitive) jsonElement, messagePacker);
        } else {
            ru3.d("unreachable");
        }
    }

    private static void gsonToMsgpack(JsonArray jsonArray, MessagePacker messagePacker) {
        try {
            messagePacker.packArrayHeader(jsonArray.size());
            Iterator<JsonElement> it = jsonArray.iterator();
            while (it.hasNext()) {
                gsonToMsgpack(it.next(), messagePacker);
            }
        } catch (IOException unused) {
        }
    }

    private static void gsonToMsgpack(JsonObject jsonObject, MessagePacker messagePacker) {
        try {
            Set<Map.Entry<String, JsonElement>> setEntrySet = jsonObject.entrySet();
            messagePacker.packMapHeader(setEntrySet.size());
            for (Map.Entry<String, JsonElement> entry : setEntrySet) {
                messagePacker.packString(entry.getKey());
                gsonToMsgpack(entry.getValue(), messagePacker);
            }
        } catch (IOException unused) {
        }
    }

    private static void gsonToMsgpack(JsonNull jsonNull, MessagePacker messagePacker) {
        try {
            messagePacker.packNil();
        } catch (IOException unused) {
        }
    }

    public static byte[] gsonToMsgpack(JsonElement jsonElement) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            MessagePacker messagePackerNewPacker = msgpackPackerConfig.newPacker(byteArrayOutputStream);
            gsonToMsgpack(jsonElement, messagePackerNewPacker);
            messagePackerNewPacker.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            return null;
        }
    }

    public static JsonElement msgpackToGson(byte[] bArr) {
        try {
            return msgpackToGson(msgpackUnpackerConfig.newUnpacker(bArr).unpackValue());
        } catch (IOException unused) {
            return null;
        }
    }
}
