package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class al7 extends u1a {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(pt7 pt7Var, byte[] bArr) {
        if (pt7Var.a() < bArr.length) {
            return false;
        }
        int i = pt7Var.b;
        byte[] bArr2 = new byte[bArr.length];
        pt7Var.k(bArr2, 0, bArr.length);
        pt7Var.M(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.u1a
    public final long b(pt7 pt7Var) {
        byte[] bArr = pt7Var.a;
        return (((long) this.i) * bl7.h(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // defpackage.u1a
    public final boolean c(pt7 pt7Var, long j, u1a.a aVar) {
        if (e(pt7Var, o)) {
            byte[] bArrCopyOf = Arrays.copyOf(pt7Var.a, pt7Var.c);
            int i = bArrCopyOf[9] & MessagePack.Code.EXT_TIMESTAMP;
            ArrayList arrayListB = bl7.b(bArrCopyOf);
            if (aVar.a == null) {
                id4.a aVar2 = new id4.a();
                aVar2.m = fv6.n("audio/ogg");
                aVar2.n = fv6.n("audio/opus");
                aVar2.F = i;
                aVar2.G = 48000;
                aVar2.q = arrayListB;
                aVar.a = new id4(aVar2);
                return true;
            }
        } else {
            if (!e(pt7Var, p)) {
                aVar.a.getClass();
                return false;
            }
            aVar.a.getClass();
            if (!this.n) {
                this.n = true;
                pt7Var.N(8);
                su6 su6VarA = ujb.a(k95.r(ujb.b(pt7Var, false, false).a));
                if (su6VarA != null) {
                    id4.a aVarA = aVar.a.a();
                    aVarA.k = su6VarA.b(aVar.a.l);
                    aVar.a = new id4(aVarA);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // defpackage.u1a
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = false;
        }
    }
}
