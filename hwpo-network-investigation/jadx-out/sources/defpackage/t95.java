package defpackage;

import j$.time.Instant;
import java.util.Arrays;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.buffer.MessageBuffer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class t95 extends g1 implements e95, cpa {
    public final Instant t;
    public byte[] u;

    public t95(Instant instant) {
        this.t = instant;
    }

    @Override // defpackage.cs3
    public final byte d() {
        return (byte) -1;
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
        if (cs3VarE instanceof cpa) {
            return this.t.equals(((cpa) cs3VarE).toInstant());
        }
        return -1 == cs3VarE.d() && Arrays.equals(getData(), cs3VarE.getData());
    }

    @Override // defpackage.cs3
    public final byte[] getData() {
        byte[] bArr;
        if (this.u == null) {
            Instant instant = this.t;
            long epochSecond = instant.getEpochSecond();
            int nano = instant.getNano();
            if ((epochSecond >>> 34) == 0) {
                long j = (((long) nano) << 34) | epochSecond;
                if (((-4294967296L) & j) == 0) {
                    bArr = new byte[4];
                    MessageBuffer.wrap(bArr).putInt(0, (int) epochSecond);
                } else {
                    bArr = new byte[8];
                    MessageBuffer.wrap(bArr).putLong(0, j);
                }
            } else {
                byte[] bArr2 = new byte[12];
                MessageBuffer messageBufferWrap = MessageBuffer.wrap(bArr2);
                messageBufferWrap.putInt(0, nano);
                messageBufferWrap.putLong(4, epochSecond);
                bArr = bArr2;
            }
            this.u = bArr;
        }
        return this.u;
    }

    public final int hashCode() {
        return this.t.hashCode();
    }

    @Override // defpackage.x7b
    public final void i(MessagePacker messagePacker) {
        messagePacker.packTimestamp(this.t);
    }

    @Override // defpackage.x7b
    public final String j() {
        return "\"" + this.t.toString() + "\"";
    }

    @Override // defpackage.x7b
    public final dbb p() {
        return dbb.C;
    }

    @Override // defpackage.cpa
    public final Instant toInstant() {
        return this.t;
    }

    public final String toString() {
        return this.t.toString();
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
