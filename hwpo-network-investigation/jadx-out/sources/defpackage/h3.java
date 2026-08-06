package defpackage;

import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h3 implements js3 {
    public final i3 a = new i3(null, 0, "audio/ac4");
    public final pt7 b = new pt7(16384);
    public boolean c;

    @Override // defpackage.js3
    public final int c(ks3 ks3Var, o68 o68Var) {
        pt7 pt7Var = this.b;
        int i = ks3Var.read(pt7Var.a, 0, 16384);
        if (i == -1) {
            return -1;
        }
        pt7Var.M(0);
        pt7Var.L(i);
        boolean z = this.c;
        i3 i3Var = this.a;
        if (!z) {
            i3Var.n = 0L;
            this.c = true;
        }
        i3Var.a(pt7Var);
        return 0;
    }

    @Override // defpackage.js3
    public final boolean d(ks3 ks3Var) {
        zq2 zq2Var;
        int i;
        pt7 pt7Var = new pt7(10);
        int i2 = 0;
        while (true) {
            zq2Var = (zq2) ks3Var;
            zq2Var.f(pt7Var.a, 0, 10, false);
            pt7Var.M(0);
            if (pt7Var.C() != 4801587) {
                break;
            }
            pt7Var.N(3);
            int iY = pt7Var.y();
            i2 += iY + 10;
            zq2Var.o(iY, false);
        }
        zq2Var.f = 0;
        zq2Var.o(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            zq2Var.f(pt7Var.a, 0, 7, false);
            pt7Var.M(0);
            int iG = pt7Var.G();
            if (iG == 44096 || iG == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = pt7Var.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & MessagePack.Code.EXT_TIMESTAMP) << 8) | (bArr[3] & MessagePack.Code.EXT_TIMESTAMP);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & MessagePack.Code.EXT_TIMESTAMP) << 16) | ((bArr[5] & MessagePack.Code.EXT_TIMESTAMP) << 8) | (bArr[6] & MessagePack.Code.EXT_TIMESTAMP);
                    } else {
                        i5 = 4;
                    }
                    if (iG == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    break;
                }
                zq2Var.o(i - 7, false);
            } else {
                zq2Var.f = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    break;
                }
                zq2Var.o(i4, false);
                i3 = 0;
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
