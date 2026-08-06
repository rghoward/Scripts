package org.msgpack.core;

import defpackage.c95;
import defpackage.dbb;
import defpackage.f95;
import defpackage.h4c;
import defpackage.l95;
import defpackage.lcb;
import defpackage.o95;
import defpackage.p95;
import defpackage.pp2;
import defpackage.s95;
import defpackage.sk0;
import defpackage.t95;
import defpackage.u95;
import defpackage.v85;
import defpackage.w85;
import defpackage.x7b;
import defpackage.x85;
import defpackage.z85;
import defpackage.z90;
import defpackage.z97;
import io.ably.lib.util.Crypto;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.models.AttributeType;
import j$.time.Instant;
import java.io.Closeable;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.MessageBufferInput;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class MessageUnpacker implements Closeable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final MessageBuffer EMPTY_BUFFER = MessageBuffer.wrap(new byte[0]);
    private static final String EMPTY_STRING = "";
    private static final int GRADUAL_ALLOCATION_THRESHOLD = 67108864;
    private final CodingErrorAction actionOnMalformedString;
    private final CodingErrorAction actionOnUnmappableString;
    private final boolean allowReadingBinaryAsString;
    private final boolean allowReadingStringAsBinary;
    private CharBuffer decodeBuffer;
    private StringBuilder decodeStringBuffer;
    private CharsetDecoder decoder;
    private MessageBufferInput in;
    private int nextReadPosition;
    private int position;
    private final int stringDecoderBufferSize;
    private final int stringSizeLimit;
    private long totalReadBytes;
    private MessageBuffer buffer = EMPTY_BUFFER;
    private final MessageBuffer numberBuffer = MessageBuffer.allocate(8);

    /* JADX INFO: renamed from: org.msgpack.core.MessageUnpacker$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$msgpack$core$MessageFormat;
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
            int[] iArr2 = new int[MessageFormat.values().length];
            $SwitchMap$org$msgpack$core$MessageFormat = iArr2;
            try {
                iArr2[MessageFormat.POSFIXINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.NEGFIXINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.NIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXMAP.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXARRAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXSTR.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.INT8.ordinal()] = 8;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.UINT8.ordinal()] = 9;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.INT16.ordinal()] = 10;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.UINT16.ordinal()] = 11;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.INT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FLOAT32.ordinal()] = 14;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.INT64.ordinal()] = 15;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.UINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FLOAT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.BIN8.ordinal()] = 18;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.STR8.ordinal()] = 19;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.BIN16.ordinal()] = 20;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.STR16.ordinal()] = 21;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.BIN32.ordinal()] = 22;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.STR32.ordinal()] = 23;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXEXT1.ordinal()] = 24;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXEXT2.ordinal()] = 25;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXEXT4.ordinal()] = 26;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXEXT8.ordinal()] = 27;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXEXT16.ordinal()] = 28;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.EXT8.ordinal()] = 29;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.EXT16.ordinal()] = 30;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.EXT32.ordinal()] = 31;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.ARRAY16.ordinal()] = 32;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.ARRAY32.ordinal()] = 33;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.MAP16.ordinal()] = 34;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.MAP32.ordinal()] = 35;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.NEVER_USED.ordinal()] = 36;
            } catch (NoSuchFieldError unused45) {
            }
        }
    }

    public MessageUnpacker(MessageBufferInput messageBufferInput, MessagePack.UnpackerConfig unpackerConfig) {
        this.in = (MessageBufferInput) Preconditions.checkNotNull(messageBufferInput, "MessageBufferInput is null");
        this.allowReadingStringAsBinary = unpackerConfig.getAllowReadingStringAsBinary();
        this.allowReadingBinaryAsString = unpackerConfig.getAllowReadingBinaryAsString();
        this.actionOnMalformedString = unpackerConfig.getActionOnMalformedString();
        this.actionOnUnmappableString = unpackerConfig.getActionOnUnmappableString();
        this.stringSizeLimit = unpackerConfig.getStringSizeLimit();
        this.stringDecoderBufferSize = unpackerConfig.getStringDecoderBufferSize();
    }

    private String decodeStringFastPath(int i) {
        CodingErrorAction codingErrorAction = this.actionOnMalformedString;
        CodingErrorAction codingErrorAction2 = CodingErrorAction.REPLACE;
        if (codingErrorAction == codingErrorAction2 && this.actionOnUnmappableString == codingErrorAction2 && this.buffer.hasArray()) {
            String str = new String(this.buffer.array(), this.buffer.arrayOffset() + this.position, i, MessagePack.UTF8);
            this.position += i;
            return str;
        }
        try {
            CharBuffer charBufferDecode = this.decoder.decode(this.buffer.sliceAsByteBuffer(this.position, i));
            this.position += i;
            return charBufferDecode.toString();
        } catch (CharacterCodingException e) {
            throw new MessageStringCodingException(e);
        }
    }

    private boolean ensureBuffer() {
        while (this.buffer.size() <= this.position) {
            MessageBuffer next = this.in.next();
            if (next == null) {
                return false;
            }
            this.totalReadBytes += (long) this.buffer.size();
            this.buffer = next;
            this.position = 0;
        }
        return true;
    }

    private MessageBuffer getNextBuffer() {
        MessageBuffer next = this.in.next();
        if (next == null) {
            throw new MessageInsufficientBufferException();
        }
        this.totalReadBytes += (long) this.buffer.size();
        return next;
    }

    private void handleCoderError(CoderResult coderResult) throws CharacterCodingException {
        if ((coderResult.isMalformed() && this.actionOnMalformedString == CodingErrorAction.REPORT) || (coderResult.isUnmappable() && this.actionOnUnmappableString == CodingErrorAction.REPORT)) {
            coderResult.throwException();
        }
    }

    private void nextBuffer() {
        this.buffer = getNextBuffer();
        this.position = 0;
    }

    private static MessageIntegerOverflowException overflowI16(short s) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(s));
    }

    private static MessageIntegerOverflowException overflowI32(int i) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(i));
    }

    private static MessageIntegerOverflowException overflowI64(long j) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(j));
    }

    private static MessageIntegerOverflowException overflowU16(short s) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(s & 65535));
    }

    private static MessageIntegerOverflowException overflowU32(int i) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(((long) (i & Integer.MAX_VALUE)) + 2147483648L));
    }

    private static MessageSizeException overflowU32Size(int i) {
        return new MessageSizeException(((long) (i & Integer.MAX_VALUE)) + 2147483648L);
    }

    private static MessageIntegerOverflowException overflowU64(long j) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(j - Long.MIN_VALUE).setBit(63));
    }

    private static MessageIntegerOverflowException overflowU8(byte b) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(b & MessagePack.Code.EXT_TIMESTAMP));
    }

    private MessageBuffer prepareNumberBuffer(int i) {
        int size = this.buffer.size();
        int i2 = this.position;
        int i3 = size - i2;
        if (i3 >= i) {
            this.nextReadPosition = i2;
            this.position = i2 + i;
            return this.buffer;
        }
        if (i3 > 0) {
            this.numberBuffer.putMessageBuffer(0, this.buffer, i2, i3);
            i -= i3;
        } else {
            i3 = 0;
        }
        while (true) {
            nextBuffer();
            int size2 = this.buffer.size();
            MessageBuffer messageBuffer = this.numberBuffer;
            if (size2 >= i) {
                messageBuffer.putMessageBuffer(i3, this.buffer, 0, i);
                this.position = i;
                this.nextReadPosition = 0;
                return this.numberBuffer;
            }
            messageBuffer.putMessageBuffer(i3, this.buffer, 0, size2);
            i -= size2;
            i3 += size2;
        }
    }

    private byte readByte() {
        int size = this.buffer.size();
        int i = this.position;
        if (size > i) {
            byte b = this.buffer.getByte(i);
            this.position++;
            return b;
        }
        nextBuffer();
        if (this.buffer.size() <= 0) {
            return readByte();
        }
        byte b2 = this.buffer.getByte(0);
        this.position = 1;
        return b2;
    }

    private double readDouble() {
        return prepareNumberBuffer(8).getDouble(this.nextReadPosition);
    }

    private float readFloat() {
        return prepareNumberBuffer(4).getFloat(this.nextReadPosition);
    }

    private int readInt() {
        return prepareNumberBuffer(4).getInt(this.nextReadPosition);
    }

    private long readLong() {
        return prepareNumberBuffer(8).getLong(this.nextReadPosition);
    }

    private int readNextLength16() {
        return readShort() & 65535;
    }

    private int readNextLength32() {
        int i = readInt();
        if (i >= 0) {
            return i;
        }
        throw overflowU32Size(i);
    }

    private int readNextLength8() {
        return readByte() & MessagePack.Code.EXT_TIMESTAMP;
    }

    private byte[] readPayloadGradually(int i) {
        ArrayList arrayList = new ArrayList();
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int size = this.buffer.size() - this.position;
            if (size == 0) {
                MessageBuffer next = this.in.next();
                if (next == null) {
                    throw new MessageSizeException(String.format("Payload declared %,d bytes but input ended after %,d bytes", Integer.valueOf(i), Integer.valueOf(i3)), i);
                }
                this.totalReadBytes += (long) this.buffer.size();
                this.buffer = next;
                this.position = 0;
                size = next.size();
            }
            int iMin = Math.min(i2, size);
            byte[] bArr = new byte[iMin];
            this.buffer.getBytes(this.position, bArr, 0, iMin);
            arrayList.add(bArr);
            i3 += iMin;
            this.position += iMin;
            i2 -= iMin;
        }
        if (arrayList.size() == 1) {
            return (byte[]) arrayList.get(0);
        }
        byte[] bArr2 = new byte[i];
        int size2 = arrayList.size();
        int length = 0;
        int i4 = 0;
        while (i4 < size2) {
            Object obj = arrayList.get(i4);
            i4++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        return bArr2;
    }

    private short readShort() {
        return prepareNumberBuffer(2).getShort(this.nextReadPosition);
    }

    private void resetDecoder() {
        CharsetDecoder charsetDecoder = this.decoder;
        if (charsetDecoder == null) {
            this.decodeBuffer = CharBuffer.allocate(this.stringDecoderBufferSize);
            this.decoder = MessagePack.UTF8.newDecoder().onMalformedInput(this.actionOnMalformedString).onUnmappableCharacter(this.actionOnUnmappableString);
        } else {
            charsetDecoder.reset();
        }
        StringBuilder sb = this.decodeStringBuffer;
        if (sb == null) {
            this.decodeStringBuffer = new StringBuilder();
        } else {
            sb.setLength(0);
        }
    }

    private void skipPayload(int i) {
        if (i < 0) {
            z90.a(pp2.a(i, "payload size must be >= 0: "));
            return;
        }
        while (true) {
            int size = this.buffer.size();
            int i2 = this.position;
            int i3 = size - i2;
            if (i3 >= i) {
                this.position = i2 + i;
                return;
            } else {
                this.position = i2 + i3;
                i -= i3;
                nextBuffer();
            }
        }
    }

    private int tryReadBinaryHeader(byte b) {
        switch (b) {
            case -60:
                return readNextLength8();
            case -59:
                return readNextLength16();
            case -58:
                return readNextLength32();
            default:
                return -1;
        }
    }

    private int tryReadStringHeader(byte b) {
        switch (b) {
            case -39:
                return readNextLength8();
            case -38:
                return readNextLength16();
            case -37:
                return readNextLength32();
            default:
                return -1;
        }
    }

    private static MessagePackException unexpected(String str, byte b) {
        MessageFormat messageFormatValueOf = MessageFormat.valueOf(b);
        if (messageFormatValueOf == MessageFormat.NEVER_USED) {
            return new MessageNeverUsedFormatException(sk0.c("Expected ", str, ", but encountered 0xC1 \"NEVER_USED\" byte"));
        }
        String strName = messageFormatValueOf.getValueType().name();
        return new MessageTypeException(String.format("Expected %s, but got %s (%02x)", str, strName.substring(0, 1) + strName.substring(1).toLowerCase(), Byte.valueOf(b)));
    }

    private static MessagePackException unexpectedExtension(String str, int i, int i2) {
        return new MessageTypeException(String.format("Expected extension type %s (%d), but got extension type %d", str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    private static int utf8MultibyteCharacterSize(byte b) {
        return Integer.numberOfLeadingZeros((~(b & MessagePack.Code.EXT_TIMESTAMP)) << 24);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.totalReadBytes += (long) this.position;
        this.buffer = EMPTY_BUFFER;
        this.position = 0;
        this.in.close();
    }

    public MessageFormat getNextFormat() {
        if (ensureBuffer()) {
            return MessageFormat.valueOf(this.buffer.getByte(this.position));
        }
        throw new MessageInsufficientBufferException();
    }

    public long getTotalReadBytes() {
        return this.totalReadBytes + ((long) this.position);
    }

    public boolean hasNext() {
        return ensureBuffer();
    }

    public void readPayload(ByteBuffer byteBuffer) {
        while (true) {
            int iRemaining = byteBuffer.remaining();
            int size = this.buffer.size();
            int i = this.position;
            int i2 = size - i;
            MessageBuffer messageBuffer = this.buffer;
            if (i2 >= iRemaining) {
                messageBuffer.getBytes(i, iRemaining, byteBuffer);
                this.position += iRemaining;
                return;
            } else {
                messageBuffer.getBytes(i, i2, byteBuffer);
                this.position += i2;
                nextBuffer();
            }
        }
    }

    public MessageBuffer readPayloadAsReference(int i) {
        int size = this.buffer.size();
        int i2 = this.position;
        if (size - i2 >= i) {
            MessageBuffer messageBufferSlice = this.buffer.slice(i2, i);
            this.position += i;
            return messageBufferSlice;
        }
        MessageBuffer messageBufferAllocate = MessageBuffer.allocate(i);
        readPayload(messageBufferAllocate, 0, i);
        return messageBufferAllocate;
    }

    public MessageBufferInput reset(MessageBufferInput messageBufferInput) {
        MessageBufferInput messageBufferInput2 = (MessageBufferInput) Preconditions.checkNotNull(messageBufferInput, "MessageBufferInput is null");
        MessageBufferInput messageBufferInput3 = this.in;
        this.in = messageBufferInput2;
        this.buffer = EMPTY_BUFFER;
        this.position = 0;
        this.totalReadBytes = 0L;
        return messageBufferInput3;
    }

    public void skipValue(int i) {
        int nextLength16;
        int nextLength17;
        while (i > 0) {
            byte b = readByte();
            switch (AnonymousClass1.$SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.valueOf(b).ordinal()]) {
                case 5:
                    nextLength16 = b & 15;
                    i += nextLength16 * 2;
                    i--;
                    break;
                case 6:
                    nextLength17 = b & 15;
                    i += nextLength17;
                    i--;
                    break;
                case 7:
                    skipPayload(b & 31);
                    i--;
                    break;
                case 8:
                case 9:
                    skipPayload(1);
                    i--;
                    break;
                case 10:
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    skipPayload(2);
                    i--;
                    break;
                case 12:
                case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                case 14:
                    skipPayload(4);
                    i--;
                    break;
                case h4c.e /* 15 */:
                case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                case 17:
                    skipPayload(8);
                    i--;
                    break;
                case 18:
                case 19:
                    skipPayload(readNextLength8());
                    i--;
                    break;
                case InboxPagingSource.PAGE_SIZE /* 20 */:
                case 21:
                    skipPayload(readNextLength16());
                    i--;
                    break;
                case 22:
                case 23:
                    skipPayload(readNextLength32());
                    i--;
                    break;
                case 24:
                    skipPayload(2);
                    i--;
                    break;
                case 25:
                    skipPayload(3);
                    i--;
                    break;
                case 26:
                    skipPayload(5);
                    i--;
                    break;
                case 27:
                    skipPayload(9);
                    i--;
                    break;
                case 28:
                    skipPayload(17);
                    i--;
                    break;
                case 29:
                    skipPayload(readNextLength8() + 1);
                    i--;
                    break;
                case 30:
                    skipPayload(readNextLength16() + 1);
                    i--;
                    break;
                case 31:
                    int nextLength32 = readNextLength32();
                    skipPayload(1);
                    skipPayload(nextLength32);
                    i--;
                    break;
                case 32:
                    nextLength17 = readNextLength16();
                    i += nextLength17;
                    i--;
                    break;
                case 33:
                    nextLength17 = readNextLength32();
                    i += nextLength17;
                    i--;
                    break;
                case 34:
                    nextLength16 = readNextLength16();
                    i += nextLength16 * 2;
                    i--;
                    break;
                case 35:
                    nextLength16 = readNextLength32();
                    i += nextLength16 * 2;
                    i--;
                    break;
                case 36:
                    throw new MessageNeverUsedFormatException("Encountered 0xC1 \"NEVER_USED\" byte");
                default:
                    i--;
                    break;
            }
        }
    }

    public boolean tryUnpackNil() {
        if (!ensureBuffer()) {
            throw new MessageInsufficientBufferException();
        }
        if (this.buffer.getByte(this.position) != -64) {
            return false;
        }
        readByte();
        return true;
    }

    public int unpackArrayHeader() {
        byte b = readByte();
        if (MessagePack.Code.isFixedArray(b)) {
            return b & 15;
        }
        if (b == -36) {
            return readNextLength16();
        }
        if (b == -35) {
            return readNextLength32();
        }
        throw unexpected("Array", b);
    }

    public BigInteger unpackBigInteger() {
        byte b = readByte();
        if (MessagePack.Code.isFixInt(b)) {
            return BigInteger.valueOf(b);
        }
        switch (b) {
            case -52:
                return BigInteger.valueOf(readByte() & MessagePack.Code.EXT_TIMESTAMP);
            case -51:
                return BigInteger.valueOf(readShort() & 65535);
            case -50:
                int i = readInt();
                return i < 0 ? BigInteger.valueOf(((long) (i & Integer.MAX_VALUE)) + 2147483648L) : BigInteger.valueOf(i);
            case -49:
                long j = readLong();
                return j < 0 ? BigInteger.valueOf(j - Long.MIN_VALUE).setBit(63) : BigInteger.valueOf(j);
            case -48:
                return BigInteger.valueOf(readByte());
            case -47:
                return BigInteger.valueOf(readShort());
            case -46:
                return BigInteger.valueOf(readInt());
            case -45:
                return BigInteger.valueOf(readLong());
            default:
                throw unexpected("Integer", b);
        }
    }

    public int unpackBinaryHeader() {
        int iTryReadStringHeader;
        byte b = readByte();
        if (MessagePack.Code.isFixedRaw(b)) {
            return b & 31;
        }
        int iTryReadBinaryHeader = tryReadBinaryHeader(b);
        if (iTryReadBinaryHeader >= 0) {
            return iTryReadBinaryHeader;
        }
        if (!this.allowReadingStringAsBinary || (iTryReadStringHeader = tryReadStringHeader(b)) < 0) {
            throw unexpected("Binary", b);
        }
        return iTryReadStringHeader;
    }

    public boolean unpackBoolean() {
        byte b = readByte();
        if (b == -62) {
            return false;
        }
        if (b == -61) {
            return true;
        }
        throw unexpected(AttributeType.BOOLEAN, b);
    }

    public byte unpackByte() {
        long j;
        byte b = readByte();
        if (MessagePack.Code.isFixInt(b)) {
            return b;
        }
        switch (b) {
            case -52:
                byte b2 = readByte();
                if (b2 >= 0) {
                    return b2;
                }
                throw overflowU8(b2);
            case -51:
                short s = readShort();
                if (s < 0 || s > 127) {
                    throw overflowU16(s);
                }
                return (byte) s;
            case -50:
                int i = readInt();
                if (i < 0 || i > 127) {
                    throw overflowU32(i);
                }
                return (byte) i;
            case -49:
                j = readLong();
                if (j < 0 || j > 127) {
                    throw overflowU64(j);
                }
                break;
            case -48:
                return readByte();
            case -47:
                short s2 = readShort();
                if (s2 < -128 || s2 > 127) {
                    throw overflowI16(s2);
                }
                return (byte) s2;
            case -46:
                int i2 = readInt();
                if (i2 < -128 || i2 > 127) {
                    throw overflowI32(i2);
                }
                return (byte) i2;
            case -45:
                j = readLong();
                if (j < -128 || j > 127) {
                    throw overflowI64(j);
                }
                break;
            default:
                throw unexpected("Integer", b);
        }
        return (byte) j;
    }

    public double unpackDouble() {
        byte b = readByte();
        if (b == -54) {
            return readFloat();
        }
        if (b == -53) {
            return readDouble();
        }
        throw unexpected("Float", b);
    }

    public ExtensionTypeHeader unpackExtensionTypeHeader() {
        byte b = readByte();
        switch (b) {
            case -57:
                MessageBuffer messageBufferPrepareNumberBuffer = prepareNumberBuffer(2);
                return new ExtensionTypeHeader(messageBufferPrepareNumberBuffer.getByte(this.nextReadPosition + 1), messageBufferPrepareNumberBuffer.getByte(this.nextReadPosition) & MessagePack.Code.EXT_TIMESTAMP);
            case -56:
                MessageBuffer messageBufferPrepareNumberBuffer2 = prepareNumberBuffer(3);
                return new ExtensionTypeHeader(messageBufferPrepareNumberBuffer2.getByte(this.nextReadPosition + 2), messageBufferPrepareNumberBuffer2.getShort(this.nextReadPosition) & 65535);
            case -55:
                MessageBuffer messageBufferPrepareNumberBuffer3 = prepareNumberBuffer(5);
                int i = messageBufferPrepareNumberBuffer3.getInt(this.nextReadPosition);
                if (i >= 0) {
                    return new ExtensionTypeHeader(messageBufferPrepareNumberBuffer3.getByte(this.nextReadPosition + 4), i);
                }
                throw overflowU32Size(i);
            default:
                switch (b) {
                    case -44:
                        return new ExtensionTypeHeader(readByte(), 1);
                    case -43:
                        return new ExtensionTypeHeader(readByte(), 2);
                    case -42:
                        return new ExtensionTypeHeader(readByte(), 4);
                    case -41:
                        return new ExtensionTypeHeader(readByte(), 8);
                    case -40:
                        return new ExtensionTypeHeader(readByte(), 16);
                    default:
                        throw unexpected("Ext", b);
                }
        }
    }

    public float unpackFloat() {
        byte b = readByte();
        if (b == -54) {
            return readFloat();
        }
        if (b == -53) {
            return (float) readDouble();
        }
        throw unexpected("Float", b);
    }

    public int unpackInt() {
        byte b = readByte();
        if (MessagePack.Code.isFixInt(b)) {
            return b;
        }
        switch (b) {
            case -52:
                return readByte() & MessagePack.Code.EXT_TIMESTAMP;
            case -51:
                return readShort() & 65535;
            case -50:
                int i = readInt();
                if (i >= 0) {
                    return i;
                }
                throw overflowU32(i);
            case -49:
                long j = readLong();
                if (j < 0 || j > 2147483647L) {
                    throw overflowU64(j);
                }
                return (int) j;
            case -48:
                return readByte();
            case -47:
                return readShort();
            case -46:
                return readInt();
            case -45:
                long j2 = readLong();
                if (j2 < -2147483648L || j2 > 2147483647L) {
                    throw overflowI64(j2);
                }
                return (int) j2;
            default:
                throw unexpected("Integer", b);
        }
    }

    public long unpackLong() {
        byte b = readByte();
        if (MessagePack.Code.isFixInt(b)) {
            return b;
        }
        switch (b) {
            case -52:
                return readByte() & MessagePack.Code.EXT_TIMESTAMP;
            case -51:
                return readShort() & 65535;
            case -50:
                int i = readInt();
                return i < 0 ? ((long) (i & Integer.MAX_VALUE)) + 2147483648L : i;
            case -49:
                long j = readLong();
                if (j >= 0) {
                    return j;
                }
                throw overflowU64(j);
            case -48:
                return readByte();
            case -47:
                return readShort();
            case -46:
                return readInt();
            case -45:
                return readLong();
            default:
                throw unexpected("Integer", b);
        }
    }

    public int unpackMapHeader() {
        byte b = readByte();
        if (MessagePack.Code.isFixedMap(b)) {
            return b & 15;
        }
        if (b == -34) {
            return readNextLength16();
        }
        if (b == -33) {
            return readNextLength32();
        }
        throw unexpected("Map", b);
    }

    public void unpackNil() {
        byte b = readByte();
        if (b != -64) {
            throw unexpected("Nil", b);
        }
    }

    public int unpackRawStringHeader() {
        int iTryReadBinaryHeader;
        byte b = readByte();
        if (MessagePack.Code.isFixedRaw(b)) {
            return b & 31;
        }
        int iTryReadStringHeader = tryReadStringHeader(b);
        if (iTryReadStringHeader >= 0) {
            return iTryReadStringHeader;
        }
        if (!this.allowReadingBinaryAsString || (iTryReadBinaryHeader = tryReadBinaryHeader(b)) < 0) {
            throw unexpected("String", b);
        }
        return iTryReadBinaryHeader;
    }

    public short unpackShort() {
        int i;
        long j;
        byte b = readByte();
        if (MessagePack.Code.isFixInt(b)) {
            return b;
        }
        switch (b) {
            case -52:
                i = readByte() & MessagePack.Code.EXT_TIMESTAMP;
                return (short) i;
            case -51:
                short s = readShort();
                if (s >= 0) {
                    return s;
                }
                throw overflowU16(s);
            case -50:
                int i2 = readInt();
                if (i2 < 0 || i2 > 32767) {
                    throw overflowU32(i2);
                }
                return (short) i2;
            case -49:
                j = readLong();
                if (j < 0 || j > 32767) {
                    throw overflowU64(j);
                }
                i = (int) j;
                return (short) i;
            case -48:
                i = readByte();
                return (short) i;
            case -47:
                return readShort();
            case -46:
                int i3 = readInt();
                if (i3 < -32768 || i3 > 32767) {
                    throw overflowI32(i3);
                }
                return (short) i3;
            case -45:
                j = readLong();
                if (j < -32768 || j > 32767) {
                    throw overflowI64(j);
                }
                i = (int) j;
                return (short) i;
            default:
                throw unexpected("Integer", b);
        }
    }

    public String unpackString() {
        int iRemaining;
        MessageBuffer messageBuffer;
        int iUnpackRawStringHeader = unpackRawStringHeader();
        if (iUnpackRawStringHeader == 0) {
            return "";
        }
        if (iUnpackRawStringHeader > this.stringSizeLimit) {
            throw new MessageSizeException(String.format("cannot unpack a String of size larger than %,d: %,d", Integer.valueOf(this.stringSizeLimit), Integer.valueOf(iUnpackRawStringHeader)), iUnpackRawStringHeader);
        }
        resetDecoder();
        if (this.buffer.size() - this.position >= iUnpackRawStringHeader) {
            return decodeStringFastPath(iUnpackRawStringHeader);
        }
        while (iUnpackRawStringHeader > 0) {
            try {
                int size = this.buffer.size();
                int i = this.position;
                int i2 = size - i;
                if (i2 >= iUnpackRawStringHeader) {
                    this.decodeStringBuffer.append(decodeStringFastPath(iUnpackRawStringHeader));
                    break;
                }
                if (i2 == 0) {
                    nextBuffer();
                } else {
                    ByteBuffer byteBufferSliceAsByteBuffer = this.buffer.sliceAsByteBuffer(i, i2);
                    int iPosition = byteBufferSliceAsByteBuffer.position();
                    this.decodeBuffer.clear();
                    CoderResult coderResultDecode = this.decoder.decode(byteBufferSliceAsByteBuffer, this.decodeBuffer, false);
                    int iPosition2 = byteBufferSliceAsByteBuffer.position() - iPosition;
                    this.position += iPosition2;
                    iUnpackRawStringHeader -= iPosition2;
                    this.decodeStringBuffer.append(this.decodeBuffer.flip());
                    if (coderResultDecode.isError()) {
                        handleCoderError(coderResultDecode);
                    }
                    if (coderResultDecode.isUnderflow() && iPosition2 < i2) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(utf8MultibyteCharacterSize(this.buffer.getByte(this.position)));
                        MessageBuffer messageBuffer2 = this.buffer;
                        messageBuffer2.getBytes(this.position, messageBuffer2.size() - this.position, byteBufferAllocate);
                        while (true) {
                            nextBuffer();
                            iRemaining = byteBufferAllocate.remaining();
                            int size2 = this.buffer.size();
                            messageBuffer = this.buffer;
                            if (size2 >= iRemaining) {
                                break;
                            }
                            messageBuffer.getBytes(0, messageBuffer.size(), byteBufferAllocate);
                            this.position = this.buffer.size();
                        }
                        messageBuffer.getBytes(0, iRemaining, byteBufferAllocate);
                        this.position = iRemaining;
                        byteBufferAllocate.position(0);
                        this.decodeBuffer.clear();
                        CoderResult coderResultDecode2 = this.decoder.decode(byteBufferAllocate, this.decodeBuffer, false);
                        if (coderResultDecode2.isError()) {
                            handleCoderError(coderResultDecode2);
                        }
                        if (coderResultDecode2.isOverflow() || (coderResultDecode2.isUnderflow() && byteBufferAllocate.position() < byteBufferAllocate.limit())) {
                            try {
                                coderResultDecode2.throwException();
                                throw new MessageFormatException("Unexpected UTF-8 multibyte sequence");
                            } catch (Exception e) {
                                throw new MessageFormatException("Unexpected UTF-8 multibyte sequence", e);
                            }
                        }
                        iUnpackRawStringHeader -= byteBufferAllocate.limit();
                        this.decodeStringBuffer.append(this.decodeBuffer.flip());
                    }
                }
            } catch (CharacterCodingException e2) {
                throw new MessageStringCodingException(e2);
            }
        }
        return this.decodeStringBuffer.toString();
    }

    public Instant unpackTimestamp(ExtensionTypeHeader extensionTypeHeader) {
        if (extensionTypeHeader.getType() != -1) {
            throw unexpectedExtension("Timestamp", -1, extensionTypeHeader.getType());
        }
        int length = extensionTypeHeader.getLength();
        if (length == 4) {
            return Instant.ofEpochSecond(((long) readInt()) & 4294967295L);
        }
        if (length == 8) {
            long j = readLong();
            return Instant.ofEpochSecond(j & 17179869183L, (int) (j >>> 34));
        }
        if (length != 12) {
            throw new MessageFormatException(String.format("Timestamp extension type (%d) expects 4, 8, or 12 bytes of payload but got %d bytes", (byte) -1, Integer.valueOf(extensionTypeHeader.getLength())));
        }
        return Instant.ofEpochSecond(readLong(), ((long) readInt()) & 4294967295L);
    }

    public u95 unpackValue() {
        MessageFormat nextFormat = getNextFormat();
        int i = 0;
        switch (nextFormat.getValueType().ordinal()) {
            case 0:
                readByte();
                return p95.t;
            case 1:
                return unpackBoolean() ? z85.u : z85.v;
            case 2:
                return nextFormat == MessageFormat.UINT64 ? new w85(unpackBigInteger()) : new l95(unpackLong());
            case 3:
                return new c95(unpackDouble());
            case 4:
                int iUnpackRawStringHeader = unpackRawStringHeader();
                if (iUnpackRawStringHeader <= this.stringSizeLimit) {
                    return new s95(readPayload(iUnpackRawStringHeader));
                }
                throw new MessageSizeException(String.format("cannot unpack a String of size larger than %,d: %,d", Integer.valueOf(this.stringSizeLimit), Integer.valueOf(iUnpackRawStringHeader)), iUnpackRawStringHeader);
            case 5:
                return new x85(readPayload(unpackBinaryHeader()));
            case 6:
                int iUnpackArrayHeader = unpackArrayHeader();
                x7b[] x7bVarArr = new x7b[iUnpackArrayHeader];
                while (i < iUnpackArrayHeader) {
                    x7bVarArr[i] = unpackValue();
                    i++;
                }
                return iUnpackArrayHeader == 0 ? v85.u : new v85(x7bVarArr);
            case 7:
                int iUnpackMapHeader = unpackMapHeader() * 2;
                x7b[] x7bVarArr2 = new x7b[iUnpackMapHeader];
                while (i < iUnpackMapHeader) {
                    x7bVarArr2[i] = unpackValue();
                    x7bVarArr2[i + 1] = unpackValue();
                    i += 2;
                }
                return iUnpackMapHeader == 0 ? o95.u : new o95(x7bVarArr2);
            case 8:
                ExtensionTypeHeader extensionTypeHeaderUnpackExtensionTypeHeader = unpackExtensionTypeHeader();
                return extensionTypeHeaderUnpackExtensionTypeHeader.getType() != -1 ? new f95(extensionTypeHeaderUnpackExtensionTypeHeader.getType(), readPayload(extensionTypeHeaderUnpackExtensionTypeHeader.getLength())) : new t95(unpackTimestamp(extensionTypeHeaderUnpackExtensionTypeHeader));
            default:
                throw new MessageNeverUsedFormatException("Unknown value type");
        }
    }

    public void readPayload(MessageBuffer messageBuffer, int i, int i2) {
        while (true) {
            int size = this.buffer.size();
            int i3 = this.position;
            int i4 = size - i3;
            MessageBuffer messageBuffer2 = this.buffer;
            if (i4 >= i2) {
                messageBuffer.putMessageBuffer(i, messageBuffer2, i3, i2);
                this.position += i2;
                return;
            } else {
                messageBuffer.putMessageBuffer(i, messageBuffer2, i3, i4);
                i += i4;
                i2 -= i4;
                this.position += i4;
                nextBuffer();
            }
        }
    }

    public void readPayload(byte[] bArr) {
        readPayload(bArr, 0, bArr.length);
    }

    public byte[] readPayload(int i) {
        if (i <= GRADUAL_ALLOCATION_THRESHOLD) {
            byte[] bArr = new byte[i];
            readPayload(bArr);
            return bArr;
        }
        return readPayloadGradually(i);
    }

    public void readPayload(byte[] bArr, int i, int i2) {
        while (true) {
            int size = this.buffer.size();
            int i3 = this.position;
            int i4 = size - i3;
            MessageBuffer messageBuffer = this.buffer;
            if (i4 >= i2) {
                messageBuffer.getBytes(i3, bArr, i, i2);
                this.position += i2;
                return;
            } else {
                messageBuffer.getBytes(i3, bArr, i, i4);
                i += i4;
                i2 -= i4;
                this.position += i4;
                nextBuffer();
            }
        }
    }

    public Instant unpackTimestamp() {
        return unpackTimestamp(unpackExtensionTypeHeader());
    }

    public void skipValue() {
        skipValue(1);
    }

    public lcb unpackValue(lcb lcbVar) {
        MessageFormat nextFormat = getNextFormat();
        int i = 0;
        switch (AnonymousClass1.$SwitchMap$org$msgpack$value$ValueType[nextFormat.getValueType().ordinal()]) {
            case 1:
                readByte();
                throw null;
            case 2:
                unpackBoolean();
                throw null;
            case 3:
                if (AnonymousClass1.$SwitchMap$org$msgpack$core$MessageFormat[nextFormat.ordinal()] != 16) {
                    unpackLong();
                    throw null;
                }
                unpackBigInteger();
                throw null;
            case 4:
                unpackDouble();
                throw null;
            case 5:
                int iUnpackRawStringHeader = unpackRawStringHeader();
                if (iUnpackRawStringHeader > this.stringSizeLimit) {
                    throw new MessageSizeException(String.format("cannot unpack a String of size larger than %,d: %,d", Integer.valueOf(this.stringSizeLimit), Integer.valueOf(iUnpackRawStringHeader)), iUnpackRawStringHeader);
                }
                readPayload(iUnpackRawStringHeader);
                throw null;
            case 6:
                readPayload(unpackBinaryHeader());
                throw null;
            case 7:
                int iUnpackArrayHeader = unpackArrayHeader();
                x7b[] x7bVarArr = new x7b[iUnpackArrayHeader];
                while (i < iUnpackArrayHeader) {
                    x7bVarArr[i] = unpackValue();
                    i++;
                }
                throw null;
            case 8:
                int iUnpackMapHeader = unpackMapHeader() * 2;
                x7b[] x7bVarArr2 = new x7b[iUnpackMapHeader];
                while (i < iUnpackMapHeader) {
                    x7bVarArr2[i] = unpackValue();
                    x7bVarArr2[i + 1] = unpackValue();
                    i += 2;
                }
                throw null;
            case 9:
                ExtensionTypeHeader extensionTypeHeaderUnpackExtensionTypeHeader = unpackExtensionTypeHeader();
                if (extensionTypeHeaderUnpackExtensionTypeHeader.getType() != -1) {
                    extensionTypeHeaderUnpackExtensionTypeHeader.getType();
                    readPayload(extensionTypeHeaderUnpackExtensionTypeHeader.getLength());
                    throw null;
                }
                unpackTimestamp(extensionTypeHeaderUnpackExtensionTypeHeader);
                throw null;
            default:
                throw new MessageFormatException("Unknown value type");
        }
    }
}
