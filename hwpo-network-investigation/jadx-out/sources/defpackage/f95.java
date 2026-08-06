package defpackage;

import java.util.Arrays;
import org.msgpack.core.MessagePacker;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class f95 extends g1 implements e95 {
    public final byte t;
    public final byte[] u;

    public f95(byte b, byte[] bArr) {
        this.t = b;
        this.u = bArr;
    }

    @Override // defpackage.cs3
    public final byte d() {
        return this.t;
    }

    @Override // defpackage.x7b
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x7b)) {
            return false;
        }
        x7b x7bVar = (x7b) obj;
        if (!x7bVar.v()) {
            return false;
        }
        cs3 cs3VarE = x7bVar.E();
        return this.t == cs3VarE.d() && Arrays.equals(this.u, cs3VarE.getData());
    }

    @Override // defpackage.cs3
    public final byte[] getData() {
        return this.u;
    }

    public final int hashCode() {
        int i = this.t + 31;
        for (byte b : this.u) {
            i = (i * 31) + b;
        }
        return i;
    }

    @Override // defpackage.x7b
    public final void i(MessagePacker messagePacker) {
        byte[] bArr = this.u;
        messagePacker.packExtensionTypeHeader(this.t, bArr.length);
        messagePacker.writePayload(bArr);
    }

    @Override // defpackage.x7b
    public final String j() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(Byte.toString(this.t));
        sb.append(",\"");
        for (byte b : this.u) {
            sb.append(Integer.toString(b, 16));
        }
        sb.append("\"]");
        return sb.toString();
    }

    @Override // defpackage.x7b
    public final dbb p() {
        return dbb.C;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(Byte.toString(this.t));
        sb.append(",0x");
        for (byte b : this.u) {
            sb.append(Integer.toString(b, 16));
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // defpackage.g1, defpackage.x7b
    public final cs3 E() {
        return this;
    }

    @Override // defpackage.g1
    /* JADX INFO: renamed from: O */
    public final e95 E() {
        return this;
    }
}
