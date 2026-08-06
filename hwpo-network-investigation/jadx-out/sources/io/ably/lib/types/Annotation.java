package io.ably.lib.types;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import defpackage.h5a;
import defpackage.wu0;
import io.ably.lib.util.Log;
import io.ably.lib.util.Serialisation;
import java.lang.reflect.Type;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageUnpacker;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class Annotation extends BaseMessage {
    private static final String ACTION = "action";
    private static final String COUNT = "count";
    private static final String EXTRAS = "extras";
    private static final String MESSAGE_SERIAL = "messageSerial";
    private static final String NAME = "name";
    private static final String SERIAL = "serial";
    private static final String TAG = "io.ably.lib.types.Annotation";
    private static final String TYPE = "type";
    public AnnotationAction action;
    public Integer count;
    public MessageExtras extras;
    public String messageSerial;
    public String name;
    public String serial;
    public String type;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class ActionSerializer implements JsonSerializer<AnnotationAction>, JsonDeserializer<AnnotationAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public AnnotationAction deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            return AnnotationAction.tryFindByOrdinal(jsonElement.getAsInt());
        }

        @Override // com.google.gson.JsonSerializer
        public JsonElement serialize(AnnotationAction annotationAction, Type type, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(Integer.valueOf(annotationAction.ordinal()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class Serializer implements JsonSerializer<Annotation>, JsonDeserializer<Annotation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public Annotation deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            if (!jsonElement.isJsonObject()) {
                h5a.a(jsonElement.getClass(), "\".", "Expected an object but got \"");
                return null;
            }
            Annotation annotation = new Annotation();
            try {
                annotation.read((JsonObject) jsonElement);
                return annotation;
            } catch (MessageDecodeException e) {
                Log.e(Annotation.TAG, e.getMessage(), e);
                throw new JsonParseException("Failed to deserialize Message from JSON.", e);
            }
        }

        @Override // com.google.gson.JsonSerializer
        public JsonElement serialize(Annotation annotation, Type type, JsonSerializationContext jsonSerializationContext) {
            JsonObject jsonObject = BaseMessage.toJsonObject(annotation);
            AnnotationAction annotationAction = annotation.action;
            if (annotationAction != null) {
                jsonObject.addProperty(Annotation.ACTION, Integer.valueOf(annotationAction.ordinal()));
            }
            String str = annotation.serial;
            if (str != null) {
                jsonObject.addProperty(Annotation.SERIAL, str);
            }
            String str2 = annotation.messageSerial;
            if (str2 != null) {
                jsonObject.addProperty(Annotation.MESSAGE_SERIAL, str2);
            }
            String str3 = annotation.type;
            if (str3 != null) {
                jsonObject.addProperty(Annotation.TYPE, str3);
            }
            String str4 = annotation.name;
            if (str4 != null) {
                jsonObject.addProperty(Annotation.NAME, str4);
            }
            Integer num = annotation.count;
            if (num != null) {
                jsonObject.addProperty(Annotation.COUNT, num);
            }
            MessageExtras messageExtras = annotation.extras;
            if (messageExtras != null) {
                jsonObject.add(Annotation.EXTRAS, Serialisation.gson.toJsonTree(messageExtras));
            }
            return jsonObject;
        }
    }

    public static Annotation fromMsgpack(MessageUnpacker messageUnpacker) {
        return new Annotation().readMsgpack(messageUnpacker);
    }

    @Override // io.ably.lib.types.BaseMessage
    public void read(JsonObject jsonObject) throws MessageDecodeException {
        super.read(jsonObject);
        Integer num = readInt(jsonObject, ACTION);
        this.action = num == null ? null : AnnotationAction.tryFindByOrdinal(num.intValue());
        this.serial = readString(jsonObject, SERIAL);
        this.messageSerial = readString(jsonObject, MESSAGE_SERIAL);
        this.type = readString(jsonObject, TYPE);
        this.name = readString(jsonObject, NAME);
        this.count = readInt(jsonObject, COUNT);
        JsonElement jsonElement = jsonObject.get(EXTRAS);
        if (jsonElement != null) {
            if (jsonElement.isJsonObject()) {
                this.extras = MessageExtras.read((JsonObject) jsonElement);
                return;
            }
            throw MessageDecodeException.fromDescription("Message extras is of type \"" + jsonElement.getClass() + "\" when expected a JSON object.");
        }
    }

    public Annotation readMsgpack(MessageUnpacker messageUnpacker) {
        int iUnpackMapHeader = messageUnpacker.unpackMapHeader();
        for (int i = 0; i < iUnpackMapHeader; i++) {
            String strIntern = messageUnpacker.unpackString().intern();
            MessageFormat nextFormat = messageUnpacker.getNextFormat();
            if (nextFormat.equals(MessageFormat.NIL)) {
                messageUnpacker.unpackNil();
            } else if (!super.readField(messageUnpacker, strIntern, nextFormat)) {
                if (strIntern.equals(ACTION)) {
                    this.action = AnnotationAction.tryFindByOrdinal(messageUnpacker.unpackInt());
                } else if (strIntern.equals(SERIAL)) {
                    this.serial = messageUnpacker.unpackString();
                } else if (strIntern.equals(MESSAGE_SERIAL)) {
                    this.messageSerial = messageUnpacker.unpackString();
                } else if (strIntern.equals(TYPE)) {
                    this.type = messageUnpacker.unpackString();
                } else if (strIntern.equals(NAME)) {
                    this.name = messageUnpacker.unpackString();
                } else if (strIntern.equals(COUNT)) {
                    this.count = Integer.valueOf(messageUnpacker.unpackInt());
                } else if (strIntern.equals(EXTRAS)) {
                    this.extras = MessageExtras.read(messageUnpacker);
                } else {
                    Log.v(TAG, "Unexpected field: ".concat(strIntern));
                    messageUnpacker.skipValue();
                }
            }
        }
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        super.getDetails(sb);
        sb.append(" name=");
        sb.append(this.name);
        sb.append(" serial=");
        sb.append(this.serial);
        sb.append(" messageSerial=");
        sb.append(this.messageSerial);
        sb.append(" type=");
        return wu0.a(sb, this.type, '}');
    }

    public void writeMsgpack(MessagePacker messagePacker) {
        int iCountFields = super.countFields();
        if (this.action != null) {
            iCountFields++;
        }
        if (this.serial != null) {
            iCountFields++;
        }
        if (this.messageSerial != null) {
            iCountFields++;
        }
        if (this.type != null) {
            iCountFields++;
        }
        if (this.name != null) {
            iCountFields++;
        }
        if (this.count != null) {
            iCountFields++;
        }
        if (this.extras != null) {
            iCountFields++;
        }
        messagePacker.packMapHeader(iCountFields);
        super.writeFields(messagePacker);
        if (this.action != null) {
            messagePacker.packString(ACTION);
            messagePacker.packInt(this.action.ordinal());
        }
        if (this.serial != null) {
            messagePacker.packString(SERIAL);
            messagePacker.packString(this.serial);
        }
        if (this.messageSerial != null) {
            messagePacker.packString(MESSAGE_SERIAL);
            messagePacker.packString(this.messageSerial);
        }
        if (this.type != null) {
            messagePacker.packString(TYPE);
            messagePacker.packString(this.type);
        }
        if (this.name != null) {
            messagePacker.packString(NAME);
            messagePacker.packString(this.name);
        }
        if (this.count != null) {
            messagePacker.packString(COUNT);
            messagePacker.packInt(this.count.intValue());
        }
        if (this.extras != null) {
            messagePacker.packString(EXTRAS);
            this.extras.write(messagePacker);
        }
    }
}
