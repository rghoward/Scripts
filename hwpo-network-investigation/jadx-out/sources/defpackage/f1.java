package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import org.msgpack.core.MessagePack;
import org.msgpack.core.MessageStringCodingException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f1 extends g1 implements x7b {
    public static final char[] w = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final byte[] t;
    public volatile String u;
    public volatile CharacterCodingException v;

    public f1(String str) {
        this.u = str;
        this.t = str.getBytes(MessagePack.UTF8);
    }

    public static void T(String str, StringBuilder sb) {
        sb.append("\"");
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < ' ') {
                switch (cCharAt) {
                    case '\b':
                        sb.append("\\b");
                        break;
                    case '\t':
                        sb.append("\\t");
                        break;
                    case '\n':
                        sb.append("\\n");
                        break;
                    case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    default:
                        W(cCharAt, sb);
                        break;
                    case '\f':
                        sb.append("\\f");
                        break;
                    case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        sb.append("\\r");
                        break;
                }
            } else if (cCharAt <= 127) {
                if (cCharAt == '\"') {
                    sb.append("\\\"");
                } else if (cCharAt != '\\') {
                    sb.append(cCharAt);
                } else {
                    sb.append("\\\\");
                }
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                sb.append(cCharAt);
            } else {
                W(cCharAt, sb);
            }
        }
        sb.append("\"");
    }

    public static void W(int i, StringBuilder sb) {
        sb.append("\\u");
        char[] cArr = w;
        sb.append(cArr[(i >> 12) & 15]);
        sb.append(cArr[(i >> 8) & 15]);
        sb.append(cArr[(i >> 4) & 15]);
        sb.append(cArr[i & 15]);
    }

    public final String U() {
        if (this.u == null) {
            V();
        }
        if (this.v == null) {
            return this.u;
        }
        throw new MessageStringCodingException(this.v);
    }

    public final void V() {
        synchronized (this.t) {
            if (this.u != null) {
                return;
            }
            try {
                CharsetDecoder charsetDecoderNewDecoder = MessagePack.UTF8.newDecoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                this.u = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(this.t).asReadOnlyBuffer()).toString();
            } catch (CharacterCodingException e) {
                try {
                    CharsetDecoder charsetDecoderNewDecoder2 = MessagePack.UTF8.newDecoder();
                    CodingErrorAction codingErrorAction2 = CodingErrorAction.REPLACE;
                    this.u = charsetDecoderNewDecoder2.onMalformedInput(codingErrorAction2).onUnmappableCharacter(codingErrorAction2).decode(ByteBuffer.wrap(this.t).asReadOnlyBuffer()).toString();
                    this.v = e;
                } catch (CharacterCodingException e2) {
                    throw new MessageStringCodingException(e2);
                }
            }
        }
    }

    @Override // defpackage.x7b
    public final String j() {
        StringBuilder sb = new StringBuilder();
        T(toString(), sb);
        return sb.toString();
    }

    public final String toString() {
        if (this.u == null) {
            V();
        }
        return this.u;
    }

    public f1(byte[] bArr) {
        this.t = bArr;
    }
}
