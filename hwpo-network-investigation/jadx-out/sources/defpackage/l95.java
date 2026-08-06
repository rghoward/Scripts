package defpackage;

import java.math.BigInteger;
import org.msgpack.core.MessagePacker;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class l95 extends g1 implements i95 {
    public final long t;

    public l95(long j) {
        this.t = j;
    }

    @Override // defpackage.i95
    public final long e() {
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
        if (!x7bVar.x()) {
            return false;
        }
        i95 i95VarQ = x7bVar.q();
        return i95VarQ.w() && this.t == i95VarQ.k();
    }

    public final int hashCode() {
        long j = this.t;
        return (-2147483648L > j || j > 2147483647L) ? (int) ((j >>> 32) ^ j) : (int) j;
    }

    @Override // defpackage.x7b
    public final void i(MessagePacker messagePacker) {
        messagePacker.packLong(this.t);
    }

    @Override // defpackage.x7b
    public final String j() {
        return Long.toString(this.t);
    }

    @Override // defpackage.xd7
    public final long k() {
        return this.t;
    }

    @Override // defpackage.x7b
    public final dbb p() {
        return dbb.w;
    }

    public final String toString() {
        return Long.toString(this.t);
    }

    @Override // defpackage.xd7
    public final BigInteger u() {
        return BigInteger.valueOf(this.t);
    }

    @Override // defpackage.i95
    public final boolean w() {
        return true;
    }

    @Override // defpackage.g1
    /* JADX INFO: renamed from: Q */
    public final i95 q() {
        return this;
    }

    @Override // defpackage.g1, defpackage.x7b
    public final i95 q() {
        return this;
    }
}
