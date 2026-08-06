package io.ably.lib.types;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.intercom.twig.BuildConfig;
import defpackage.dbb;
import defpackage.g7b;
import defpackage.j7b;
import defpackage.wx2;
import io.ably.lib.util.AgentHeaderCreator;
import io.ably.lib.util.Base64Coder;
import io.ably.lib.util.Crypto;
import io.ably.lib.util.Log;
import io.ably.lib.util.Serialisation;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageUnpacker;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class BaseMessage implements Cloneable {
    private static final String CLIENT_ID = "clientId";
    private static final String CONNECTION_ID = "connectionId";
    private static final String DATA = "data";
    private static final String ENCODING = "encoding";
    private static final String ID = "id";
    private static final String TAG;
    private static final String TIMESTAMP = "timestamp";
    private static final g7b vcdiffDecoder;
    private static Pattern xformPattern;
    public String clientId;
    public String connectionId;
    public Object data;
    public String encoding;
    public String id;
    public long timestamp;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class EncodedMessageData {
        public final Object data;
        public final String encoding;

        public EncodedMessageData(Object obj, String str) {
            this.data = obj;
            this.encoding = str;
        }
    }

    static {
        wx2 wx2Var = new wx2();
        j7b j7bVar = new j7b();
        synchronized (wx2Var) {
            if (j7bVar.o) {
                throw new IllegalStateException("setAllowVcdTarget() called after startDecoding()");
            }
            j7bVar.p = true;
        }
        vcdiffDecoder = new g7b(j7bVar);
        xformPattern = Pattern.compile("([\\-\\w]+)(\\+([\\-\\w]+))?");
        TAG = BaseMessage.class.getName();
    }

    private String join(String[] strArr, char c, int i, int i2) {
        StringBuilder sb = new StringBuilder(strArr[i]);
        for (int i3 = i + 1; i3 < i2; i3++) {
            sb.append(c);
            sb.append(strArr[i3]);
        }
        return sb.toString();
    }

    public static JsonObject toJsonObject(BaseMessage baseMessage) {
        JsonObject jsonObject = new JsonObject();
        Object obj = baseMessage.data;
        String strConcat = baseMessage.encoding;
        if (obj != null) {
            if (obj instanceof byte[]) {
                jsonObject.addProperty(DATA, new String(Base64Coder.encode((byte[]) obj)));
                strConcat = strConcat == null ? "base64" : strConcat.concat("/base64");
            } else {
                jsonObject.addProperty(DATA, obj.toString());
            }
            if (strConcat != null) {
                jsonObject.addProperty(ENCODING, strConcat);
            }
        }
        String str = baseMessage.id;
        if (str != null) {
            jsonObject.addProperty(ID, str);
        }
        String str2 = baseMessage.clientId;
        if (str2 != null) {
            jsonObject.addProperty("clientId", str2);
        }
        String str3 = baseMessage.connectionId;
        if (str3 != null) {
            jsonObject.addProperty("connectionId", str3);
        }
        return jsonObject;
    }

    private static byte[] vcdiffApply(byte[] bArr, byte[] bArr2) throws MessageDecodeException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            g7b g7bVar = vcdiffDecoder;
            g7bVar.getClass();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr2);
            ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr);
            j7b j7bVar = g7bVar.a;
            j7bVar.g(byteBufferWrap);
            j7bVar.a(byteBufferWrap2, byteArrayOutputStream);
            j7bVar.b();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            throw MessageDecodeException.fromThrowableAndErrorInfo(th, new ErrorInfo("VCDIFF delta decode failed", CarouselScreenFragment.CAROUSEL_ANIMATION_MS, 40018));
        }
    }

    public int countFields() {
        int i = this.timestamp > 0 ? 1 : 0;
        if (this.id != null) {
            i++;
        }
        if (this.clientId != null) {
            i++;
        }
        if (this.connectionId != null) {
            i++;
        }
        if (this.encoding != null) {
            i++;
        }
        return this.data != null ? i + 1 : i;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void decode(ChannelOptions channelOptions, DecodingContext decodingContext) {
        Object objVcdiffApply = this.data;
        String str = this.encoding;
        if (str != null) {
            String[] strArrSplit = str.split("\\/");
            int length = strArrSplit.length;
            while (true) {
                if (length > 0) {
                    try {
                        int i = length - 1;
                        Matcher matcher = xformPattern.matcher(strArrSplit[i]);
                        if (matcher.matches()) {
                            String strGroup = matcher.group(1);
                            switch (strGroup.hashCode()) {
                                case -1396204209:
                                    if (strGroup.equals("base64")) {
                                        try {
                                            byte[] bArrDecode = Base64Coder.decode((String) this.data);
                                            this.data = bArrDecode;
                                            if (length == strArrSplit.length) {
                                                objVcdiffApply = bArrDecode;
                                            }
                                            length = i;
                                        } catch (IllegalArgumentException unused) {
                                            throw MessageDecodeException.fromDescription("Invalid base64 data received");
                                        }
                                    }
                                    break;
                                case -1360271861:
                                    if (strGroup.equals("cipher")) {
                                        if (channelOptions == null || !channelOptions.encrypted) {
                                            throw MessageDecodeException.fromDescription("Encrypted message received but encryption is not set up");
                                        }
                                        try {
                                            this.data = Crypto.createChannelDecipher(channelOptions.getCipherParamsOrDefault()).decrypt((byte[]) this.data);
                                            length = i;
                                        } catch (AblyException e) {
                                            throw MessageDecodeException.fromDescription(e.errorInfo.message);
                                        }
                                    }
                                    break;
                                case -822215630:
                                    if (strGroup.equals(DeltaExtras.FORMAT_VCDIFF)) {
                                        objVcdiffApply = vcdiffApply((byte[]) this.data, decodingContext.getLastMessageData());
                                        this.data = objVcdiffApply;
                                        length = i;
                                    }
                                    break;
                                case 3271912:
                                    if (strGroup.equals("json")) {
                                        try {
                                            this.data = Serialisation.gsonParser.parse(((String) this.data).trim());
                                            length = i;
                                        } catch (JsonParseException unused2) {
                                            throw MessageDecodeException.fromDescription("Invalid JSON data received");
                                        }
                                    }
                                    break;
                                case 111607186:
                                    if (strGroup.equals("utf-8")) {
                                        try {
                                            this.data = new String((byte[]) this.data, "UTF-8");
                                        } catch (UnsupportedEncodingException | ClassCastException unused3) {
                                        }
                                        length = i;
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                    } catch (Throwable th) {
                        this.encoding = length > 0 ? join(strArrSplit, '/', 0, length) : null;
                        throw th;
                    }
                }
            }
            this.encoding = length > 0 ? join(strArrSplit, '/', 0, length) : null;
        }
        if (objVcdiffApply instanceof String) {
            decodingContext.setLastMessageData((String) objVcdiffApply);
        } else if (objVcdiffApply instanceof byte[]) {
            decodingContext.setLastMessageData((byte[]) objVcdiffApply);
        } else if (objVcdiffApply != null) {
            throw MessageDecodeException.fromDescription("Message data neither String nor byte[]. Unsupported message data type.");
        }
    }

    public void encode(ChannelOptions channelOptions) {
        EncodedMessageData encodedMessageDataEncodeData = encodeData(channelOptions);
        this.data = encodedMessageDataEncodeData.data;
        this.encoding = encodedMessageDataEncodeData.encoding;
    }

    public EncodedMessageData encodeData(ChannelOptions channelOptions) throws AblyException {
        Object objEncrypt = this.data;
        String string = this.encoding;
        String strConcat = BuildConfig.FLAVOR;
        if (objEncrypt != null) {
            if (objEncrypt instanceof JsonElement) {
                objEncrypt = Serialisation.gson.toJson((JsonElement) objEncrypt);
                string = (string == null ? BuildConfig.FLAVOR : string.concat(AgentHeaderCreator.AGENT_DIVIDER)).concat("json");
            }
            if (objEncrypt instanceof String) {
                if (channelOptions != null && channelOptions.encrypted) {
                    try {
                        objEncrypt = ((String) objEncrypt).getBytes("UTF-8");
                    } catch (UnsupportedEncodingException unused) {
                    }
                    string = (string == null ? BuildConfig.FLAVOR : string.concat(AgentHeaderCreator.AGENT_DIVIDER)).concat("utf-8");
                }
            } else if (!(objEncrypt instanceof byte[])) {
                Log.d(TAG, "Message data must be either `byte[]`, `String` or `JSONElement`; implicit coercion of other types to String is deprecated");
                throw AblyException.fromErrorInfo(new ErrorInfo("Invalid message data or encoding", CarouselScreenFragment.CAROUSEL_ANIMATION_MS, 40013));
            }
        }
        if (channelOptions != null && channelOptions.encrypted) {
            Crypto.EncryptingChannelCipher encryptingChannelCipherCreateChannelEncipher = Crypto.createChannelEncipher(channelOptions.getCipherParamsOrDefault());
            objEncrypt = encryptingChannelCipherCreateChannelEncipher.encrypt((byte[]) objEncrypt);
            StringBuilder sb = new StringBuilder();
            if (string != null) {
                strConcat = string.concat(AgentHeaderCreator.AGENT_DIVIDER);
            }
            sb.append(strConcat);
            sb.append("cipher+");
            sb.append(encryptingChannelCipherCreateChannelEncipher.getAlgorithm());
            string = sb.toString();
        }
        return new EncodedMessageData(objEncrypt, string);
    }

    public void getDetails(StringBuilder sb) {
        if (this.clientId != null) {
            sb.append(" clientId=");
            sb.append(this.clientId);
        }
        if (this.connectionId != null) {
            sb.append(" connectionId=");
            sb.append(this.connectionId);
        }
        if (this.data != null) {
            sb.append(" data=");
            sb.append(this.data);
        }
        if (this.encoding != null) {
            sb.append(" encoding=");
            sb.append(this.encoding);
        }
        if (this.id != null) {
            sb.append(" id=");
            sb.append(this.id);
        }
    }

    public void read(JsonObject jsonObject) {
        Long l = readLong(jsonObject, TIMESTAMP);
        if (l != null) {
            this.timestamp = l.longValue();
        }
        this.id = readString(jsonObject, ID);
        this.clientId = readString(jsonObject, "clientId");
        this.connectionId = readString(jsonObject, "connectionId");
        this.encoding = readString(jsonObject, ENCODING);
        this.data = readString(jsonObject, DATA);
    }

    public boolean readField(MessageUnpacker messageUnpacker, String str, MessageFormat messageFormat) {
        str.getClass();
        switch (str) {
            case "id":
                this.id = messageUnpacker.unpackString();
                return true;
            case "data":
                dbb valueType = messageFormat.getValueType();
                valueType.getClass();
                if (valueType != dbb.z) {
                    this.data = messageUnpacker.unpackString();
                    return true;
                }
                byte[] bArr = new byte[messageUnpacker.unpackBinaryHeader()];
                messageUnpacker.readPayload(bArr);
                this.data = bArr;
                return true;
            case "timestamp":
                this.timestamp = messageUnpacker.unpackLong();
                return true;
            case "clientId":
                this.clientId = messageUnpacker.unpackString();
                return true;
            case "encoding":
                this.encoding = messageUnpacker.unpackString();
                return true;
            case "connectionId":
                this.connectionId = messageUnpacker.unpackString();
                return true;
            default:
                return false;
        }
    }

    public Integer readInt(JsonObject jsonObject, String str) {
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement == null || (jsonElement instanceof JsonNull)) {
            return null;
        }
        return Integer.valueOf(jsonElement.getAsInt());
    }

    public Long readLong(JsonObject jsonObject, String str) {
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement == null || (jsonElement instanceof JsonNull)) {
            return null;
        }
        return Long.valueOf(jsonElement.getAsLong());
    }

    public String readString(JsonObject jsonObject, String str) {
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement == null || (jsonElement instanceof JsonNull)) {
            return null;
        }
        return jsonElement.getAsString();
    }

    public void writeFields(MessagePacker messagePacker) {
        if (this.timestamp > 0) {
            messagePacker.packString(TIMESTAMP);
            messagePacker.packLong(this.timestamp);
        }
        if (this.id != null) {
            messagePacker.packString(ID);
            messagePacker.packString(this.id);
        }
        if (this.clientId != null) {
            messagePacker.packString("clientId");
            messagePacker.packString(this.clientId);
        }
        if (this.connectionId != null) {
            messagePacker.packString("connectionId");
            messagePacker.packString(this.connectionId);
        }
        if (this.encoding != null) {
            messagePacker.packString(ENCODING);
            messagePacker.packString(this.encoding);
        }
        if (this.data != null) {
            messagePacker.packString(DATA);
            Object obj = this.data;
            if (!(obj instanceof byte[])) {
                messagePacker.packString(obj.toString());
                return;
            }
            byte[] bArr = (byte[]) obj;
            messagePacker.packBinaryHeader(bArr.length);
            messagePacker.writePayload(bArr);
        }
    }

    public void decode(ChannelOptions channelOptions) {
        decode(channelOptions, new DecodingContext());
    }
}
