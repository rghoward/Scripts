package defpackage;

import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d3 implements js3 {
    public final e3 a = new e3("audio/ac3");
    public final pt7 b = new pt7(2786);
    public boolean c;

    @Override // defpackage.js3
    public final int c(ks3 ks3Var, o68 o68Var) {
        pt7 pt7Var = this.b;
        int i = ks3Var.read(pt7Var.a, 0, 2786);
        if (i == -1) {
            return -1;
        }
        pt7Var.M(0);
        pt7Var.L(i);
        boolean z = this.c;
        e3 e3Var = this.a;
        if (!z) {
            e3Var.n = 0L;
            this.c = true;
        }
        e3Var.a(pt7Var);
        return 0;
    }

    @Override // defpackage.js3
    public final boolean d(ks3 ks3Var) {
        zq2 zq2Var;
        int iA;
        pt7 pt7Var = new pt7(10);
        int i = 0;
        while (true) {
            zq2Var = (zq2) ks3Var;
            zq2Var.f(pt7Var.a, 0, 10, false);
            pt7Var.M(0);
            if (pt7Var.C() != 4801587) {
                break;
            }
            pt7Var.N(3);
            int iY = pt7Var.y();
            i += iY + 10;
            zq2Var.o(iY, false);
        }
        zq2Var.f = 0;
        zq2Var.o(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            zq2Var.f(pt7Var.a, 0, 6, false);
            pt7Var.M(0);
            if (pt7Var.G() != 2935) {
                zq2Var.f = 0;
                i3++;
                if (i3 - i >= 8192) {
                    break;
                }
                zq2Var.o(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = pt7Var.a;
                if (bArr.length < 6) {
                    iA = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iA = ((((bArr[2] & 7) << 8) | (bArr[3] & MessagePack.Code.EXT_TIMESTAMP)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    iA = f3.a((b & MessagePack.Code.NIL) >> 6, b & 63);
                }
                if (iA == -1) {
                    break;
                }
                zq2Var.o(iA - 6, false);
            }
        }
        return false;
    }

    @Override // defpackage.js3
    public final void e(long j, long j2) {
        this.c = false;
        this.a.c();
    }

    @Override // defpackage.js3
    public final void g(ls3 ls3Var) {
        this.a.f(ls3Var, new pya.c(0, 1));
        ls3Var.k();
        ls3Var.t(new t89.b(-9223372036854775807L));
    }

    @Override // defpackage.js3
    public final void a() {
    }
}
