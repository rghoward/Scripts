package defpackage;

import java.io.Serializable;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xt4 {
    public static final char[] t = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends xt4 implements Serializable {
        public final byte[] u;

        public a(byte[] bArr) {
            bArr.getClass();
            this.u = bArr;
        }

        @Override // defpackage.xt4
        public final int a() {
            byte[] bArr = this.u;
            boolean z = bArr.length >= 4;
            int length = bArr.length;
            if (z) {
                return ((bArr[3] & MessagePack.Code.EXT_TIMESTAMP) << 24) | (bArr[0] & MessagePack.Code.EXT_TIMESTAMP) | ((bArr[1] & MessagePack.Code.EXT_TIMESTAMP) << 8) | ((bArr[2] & MessagePack.Code.EXT_TIMESTAMP) << 16);
            }
            aa0.c(p2a.a("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
            return 0;
        }

        @Override // defpackage.xt4
        public final int b() {
            return this.u.length * 8;
        }

        @Override // defpackage.xt4
        public final boolean c(xt4 xt4Var) {
            byte[] bArr = this.u;
            if (bArr.length != xt4Var.d().length) {
                return false;
            }
            boolean z = true;
            for (int i = 0; i < bArr.length; i++) {
                z &= bArr[i] == xt4Var.d()[i];
            }
            return z;
        }

        @Override // defpackage.xt4
        public final byte[] d() {
            return this.u;
        }
    }

    public abstract int a();

    public abstract int b();

    public abstract boolean c(xt4 xt4Var);

    public abstract byte[] d();

    public final boolean equals(Object obj) {
        if (!(obj instanceof xt4)) {
            return false;
        }
        xt4 xt4Var = (xt4) obj;
        return b() == xt4Var.b() && c(xt4Var);
    }

    public final int hashCode() {
        if (b() >= 32) {
            return a();
        }
        byte[] bArrD = d();
        int i = bArrD[0] & MessagePack.Code.EXT_TIMESTAMP;
        for (int i2 = 1; i2 < bArrD.length; i2++) {
            i |= (bArrD[i2] & MessagePack.Code.EXT_TIMESTAMP) << (i2 * 8);
        }
        return i;
    }

    public final String toString() {
        byte[] bArrD = d();
        StringBuilder sb = new StringBuilder(bArrD.length * 2);
        for (byte b : bArrD) {
            char[] cArr = t;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
