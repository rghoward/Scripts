package defpackage;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class w65 {
    public final pt7 a = new pt7(10);

    public final su6 a(ks3 ks3Var, u65.a aVar, int i) {
        pt7 pt7Var;
        int i2;
        int i3 = 0;
        su6 su6VarH1 = null;
        while (true) {
            int i4 = 0;
            while (true) {
                int i5 = i4 % 10;
                int i6 = i5 + 10;
                pt7Var = this.a;
                if (i5 == 0 && i4 != 0) {
                    byte[] bArr = pt7Var.a;
                    System.arraycopy(bArr, 10, bArr, 0, 9);
                }
                int i7 = i4 == 0 ? 10 : 1;
                try {
                    ks3Var.n(pt7Var.a, i6 - i7, i7);
                    pt7Var.M(i5);
                    pt7Var.L(i6);
                    if (pt7Var.a() < 3) {
                        hy1.a(pt7Var.b, pt7Var.c);
                        return null;
                    }
                    int iC = pt7Var.C();
                    i2 = pt7Var.b - 3;
                    pt7Var.b = i2;
                    if (iC == 4801587) {
                        break;
                    }
                    if (a07.a(pt7Var.i()) == -1) {
                        if (i4 == 0) {
                            pt7Var.c(20);
                        }
                        i4++;
                        if (i4 > i) {
                        }
                    }
                    ks3Var.l();
                    ks3Var.h(i3);
                    return su6VarH1;
                } catch (EOFException unused) {
                }
            }
            pt7Var.N(6);
            int iY = pt7Var.y();
            int i8 = iY + 10;
            if (su6VarH1 == null) {
                byte[] bArr2 = new byte[i8];
                System.arraycopy(pt7Var.a, i2, bArr2, 0, 10);
                ks3Var.n(bArr2, 10, iY);
                su6VarH1 = new u65(aVar).h1(bArr2, i8);
            } else {
                ks3Var.h(iY);
            }
            i3 += i8;
        }
    }
}
