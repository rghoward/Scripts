package io.ably.lib.types;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import defpackage.ac4;
import defpackage.n95;
import defpackage.s95;
import defpackage.u95;
import defpackage.x7b;
import io.ably.lib.util.Serialisation;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Objects;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageUnpacker;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class MessageExtras {
    private static final String DELTA = "delta";
    private static final String TAG = "io.ably.lib.types.MessageExtras";
    private final DeltaExtras delta;
    private final JsonObject jsonObject;

    private MessageExtras(JsonObject jsonObject, DeltaExtras deltaExtras) {
        if (jsonObject == null) {
            ac4.c("jsonObject cannot be null.");
            throw null;
        }
        this.jsonObject = jsonObject;
        this.delta = deltaExtras;
    }

    public static MessageExtras read(MessageUnpacker messageUnpacker) throws IOException {
        DeltaExtras deltaExtras;
        x7b x7bVar;
        u95 u95VarUnpackValue = messageUnpacker.unpackValue();
        if (!(u95VarUnpackValue instanceof n95) || (x7bVar = ((n95) u95VarUnpackValue).I().get(new s95(DELTA))) == null) {
            deltaExtras = null;
        } else {
            if (!(x7bVar instanceof n95)) {
                throw new IOException("The delta extras unpacked to the wrong type \"" + x7bVar.getClass() + "\" when expected a map.");
            }
            deltaExtras = DeltaExtras.read(((n95) x7bVar).I());
        }
        JsonElement jsonElementMsgpackToGson = Serialisation.msgpackToGson(u95VarUnpackValue);
        if (jsonElementMsgpackToGson instanceof JsonObject) {
            return new MessageExtras((JsonObject) jsonElementMsgpackToGson, deltaExtras);
        }
        throw new IOException("The extras unpacked to the wrong type \"" + jsonElementMsgpackToGson.getClass() + "\" when expected a JsonObject.");
    }

    public JsonObject asJsonObject() {
        return this.jsonObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MessageExtras.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.jsonObject, ((MessageExtras) obj).jsonObject);
    }

    public DeltaExtras getDelta() {
        return this.delta;
    }

    public int hashCode() {
        return Objects.hashCode(this.jsonObject);
    }

    public String toString() {
        return "MessageExtras{delta=" + this.delta + ", raw=" + this.jsonObject + '}';
    }

    public void write(MessagePacker messagePacker) {
        Serialisation.gsonToMsgpack((JsonElement) this.jsonObject, messagePacker);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class Serializer implements JsonSerializer<MessageExtras> {
        @Override // com.google.gson.JsonSerializer
        public JsonElement serialize(MessageExtras messageExtras, Type type, JsonSerializationContext jsonSerializationContext) {
            return messageExtras.jsonObject;
        }
    }

    public MessageExtras(JsonObject jsonObject) {
        this(jsonObject, null);
    }

    public static MessageExtras read(JsonObject jsonObject) throws MessageDecodeException {
        DeltaExtras deltaExtras;
        JsonElement jsonElement = jsonObject.get(DELTA);
        if (jsonElement instanceof JsonObject) {
            deltaExtras = DeltaExtras.read((JsonObject) jsonElement);
        } else {
            if (jsonElement != null) {
                throw MessageDecodeException.fromDescription("The value under the delta key is of the wrong type \"" + jsonElement.getClass() + "\" when expected a map.");
            }
            deltaExtras = null;
        }
        return new MessageExtras(jsonObject, deltaExtras);
    }
}
