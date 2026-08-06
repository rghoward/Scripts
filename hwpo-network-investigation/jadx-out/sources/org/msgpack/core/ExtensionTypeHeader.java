package org.msgpack.core;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class ExtensionTypeHeader {
    private final int length;
    private final byte type;

    public ExtensionTypeHeader(byte b, int i) {
        Preconditions.checkArgument(i >= 0, "length must be >= 0");
        this.type = b;
        this.length = i;
    }

    public static byte checkedCastToByte(int i) {
        Preconditions.checkArgument(-128 <= i && i <= 127, "Extension type code must be within the range of byte");
        return (byte) i;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ExtensionTypeHeader) {
            ExtensionTypeHeader extensionTypeHeader = (ExtensionTypeHeader) obj;
            if (this.type == extensionTypeHeader.type && this.length == extensionTypeHeader.length) {
                return true;
            }
        }
        return false;
    }

    public int getLength() {
        return this.length;
    }

    public byte getType() {
        return this.type;
    }

    public int hashCode() {
        return ((this.type + 31) * 31) + this.length;
    }

    public boolean isTimestampType() {
        return this.type == -1;
    }

    public String toString() {
        return String.format("ExtensionTypeHeader(type:%d, length:%,d)", Byte.valueOf(this.type), Integer.valueOf(this.length));
    }
}
