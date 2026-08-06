package defpackage;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gg7 {
    public final hg7 a = new hg7();
    public final pt7 b = new pt7(new byte[65025], 0);
    public int c = -1;
    public int d;
    public boolean e;

    public final int a(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            hg7 hg7Var = this.a;
            if (i5 >= hg7Var.c) {
                break;
            }
            int[] iArr = hg7Var.f;
            this.d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final boolean b(ks3 ks3Var) {
        int i;
        xl7.r(ks3Var != null);
        boolean z = this.e;
        pt7 pt7Var = this.b;
        if (z) {
            this.e = false;
            pt7Var.J(0);
        }
        while (!this.e) {
            int i2 = this.c;
            hg7 hg7Var = this.a;
            if (i2 < 0) {
                if (hg7Var.b(ks3Var, -1L) && hg7Var.a(ks3Var, true)) {
                    int iA = hg7Var.d;
                    if ((hg7Var.a & 1) == 1 && pt7Var.c == 0) {
                        iA += a(0);
                        i = this.d;
                    } else {
                        i = 0;
                    }
                    try {
                        ks3Var.m(iA);
                        this.c = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA2 = a(this.c);
            int i3 = this.c + this.d;
            if (iA2 > 0) {
                pt7Var.c(pt7Var.c + iA2);
                try {
                    ks3Var.readFully(pt7Var.a, pt7Var.c, iA2);
                    pt7Var.L(pt7Var.c + iA2);
                    this.e = hg7Var.f[i3 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i3 == hg7Var.c) {
                i3 = -1;
            }
            this.c = i3;
        }
        return true;
    }
}
