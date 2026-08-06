package defpackage;

import java.math.BigInteger;
import org.msgpack.core.MessageIntegerOverflowException;
import org.msgpack.core.MessagePacker;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class w85 extends g1 implements i95 {
    public static final BigInteger u;
    public static final BigInteger v;
    public static final BigInteger w;
    public static final BigInteger x;
    public final BigInteger t;

    static {
        BigInteger.valueOf(-128L);
        BigInteger.valueOf(127L);
        BigInteger.valueOf(-32768L);
        BigInteger.valueOf(32767L);
        u = BigInteger.valueOf(-2147483648L);
        v = BigInteger.valueOf(2147483647L);
        w = BigInteger.valueOf(Long.MIN_VALUE);
        x = BigInteger.valueOf(Long.MAX_VALUE);
    }

    public w85(BigInteger bigInteger) {
        this.t = bigInteger;
    }

    @Override // defpackage.i95
    public final long e() {
        boolean zW = w();
        BigInteger bigInteger = this.t;
        if (zW) {
            return bigInteger.longValue();
        }
        throw new MessageIntegerOverflowException(bigInteger);
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
        return this.t.equals(x7bVar.q().u());
    }

    public final int hashCode() {
        long jLongValue;
        BigInteger bigInteger = u;
        BigInteger bigInteger2 = this.t;
        if (bigInteger.compareTo(bigInteger2) <= 0 && bigInteger2.compareTo(v) <= 0) {
            jLongValue = bigInteger2.longValue();
        } else {
            if (w.compareTo(bigInteger2) > 0 || bigInteger2.compareTo(x) > 0) {
                return bigInteger2.hashCode();
            }
            long jLongValue2 = bigInteger2.longValue();
            jLongValue = jLongValue2 ^ (jLongValue2 >>> 32);
        }
        return (int) jLongValue;
    }

    @Override // defpackage.x7b
    public final void i(MessagePacker messagePacker) {
        messagePacker.packBigInteger(this.t);
    }

    @Override // defpackage.x7b
    public final String j() {
        return this.t.toString();
    }

    @Override // defpackage.xd7
    public final long k() {
        return this.t.longValue();
    }

    @Override // defpackage.x7b
    public final dbb p() {
        return dbb.w;
    }

    public final String toString() {
        return this.t.toString();
    }

    @Override // defpackage.xd7
    public final BigInteger u() {
        return this.t;
    }

    @Override // defpackage.i95
    public final boolean w() {
        BigInteger bigInteger = w;
        BigInteger bigInteger2 = this.t;
        return bigInteger2.compareTo(bigInteger) >= 0 && bigInteger2.compareTo(x) <= 0;
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
