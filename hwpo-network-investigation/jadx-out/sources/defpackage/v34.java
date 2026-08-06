package defpackage;

import java.util.Arrays;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class v34 extends u1a {
    public x34 n;
    public a o;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements ig7 {
        public x34 a;
        public x34.a b;
        public long c;
        public long d;

        @Override // defpackage.ig7
        public final long a(ks3 ks3Var) {
            long j = this.d;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.d = -1L;
            return j2;
        }

        @Override // defpackage.ig7
        public final t89 b() {
            xl7.r(this.c != -1);
            return new w34(this.a, this.c);
        }

        @Override // defpackage.ig7
        public final void c(long j) {
            long[] jArr = this.b.a;
            this.d = jArr[n6b.f(jArr, j, true)];
        }
    }

    @Override // defpackage.u1a
    public final long b(pt7 pt7Var) {
        byte[] bArr = pt7Var.a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & MessagePack.Code.EXT_TIMESTAMP) >> 4;
        if (i == 6 || i == 7) {
            pt7Var.N(4);
            pt7Var.H();
        }
        int iB = t34.b(i, pt7Var);
        pt7Var.M(0);
        return iB;
    }

    @Override // defpackage.u1a
    public final boolean c(pt7 pt7Var, long j, u1a.a aVar) {
        byte[] bArr = pt7Var.a;
        x34 x34Var = this.n;
        if (x34Var == null) {
            x34 x34Var2 = new x34(bArr, 17);
            this.n = x34Var2;
            id4.a aVarA = x34Var2.c(Arrays.copyOfRange(bArr, 9, pt7Var.c), null).a();
            aVarA.m = fv6.n("audio/ogg");
            aVar.a = new id4(aVarA);
            return true;
        }
        byte b = bArr[0];
        if ((b & 127) != 3) {
            if (b != -1) {
                return true;
            }
            a aVar2 = this.o;
            if (aVar2 != null) {
                aVar2.c = j;
                aVar.b = aVar2;
            }
            aVar.a.getClass();
            return false;
        }
        x34.a aVarA2 = u34.a(pt7Var);
        x34 x34Var3 = new x34(x34Var.a, x34Var.b, x34Var.c, x34Var.d, x34Var.e, x34Var.g, x34Var.h, x34Var.j, aVarA2, x34Var.l);
        this.n = x34Var3;
        a aVar3 = new a();
        aVar3.a = x34Var3;
        aVar3.b = aVarA2;
        aVar3.c = -1L;
        aVar3.d = -1L;
        this.o = aVar3;
        return true;
    }

    @Override // defpackage.u1a
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}
