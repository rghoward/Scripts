package defpackage;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hg7 {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final pt7 g = new pt7(255);

    public final boolean a(ks3 ks3Var, boolean z) throws ut7, EOFException {
        boolean zF;
        boolean zF2;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        pt7 pt7Var = this.g;
        pt7Var.J(27);
        try {
            zF = ks3Var.f(pt7Var.a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zF = false;
        }
        if (zF && pt7Var.B() == 1332176723) {
            if (pt7Var.z() == 0) {
                this.a = pt7Var.z();
                this.b = pt7Var.p();
                pt7Var.q();
                pt7Var.q();
                pt7Var.q();
                int iZ = pt7Var.z();
                this.c = iZ;
                this.d = iZ + 27;
                pt7Var.J(iZ);
                try {
                    zF2 = ks3Var.f(pt7Var.a, 0, this.c, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    zF2 = false;
                }
                if (zF2) {
                    for (int i = 0; i < this.c; i++) {
                        int iZ2 = pt7Var.z();
                        this.f[i] = iZ2;
                        this.e += iZ2;
                    }
                    return true;
                }
            } else if (!z) {
                throw ut7.c("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final boolean b(ks3 ks3Var, long j) {
        boolean zF;
        xl7.g(ks3Var.getPosition() == ks3Var.g());
        pt7 pt7Var = this.g;
        pt7Var.J(4);
        while (true) {
            if (j != -1 && ks3Var.getPosition() + 4 >= j) {
                break;
            }
            try {
                zF = ks3Var.f(pt7Var.a, 0, 4, true);
            } catch (EOFException unused) {
                zF = false;
            }
            if (!zF) {
                break;
            }
            pt7Var.M(0);
            if (pt7Var.B() == 1332176723) {
                ks3Var.l();
                return true;
            }
            ks3Var.m(1);
        }
        do {
            if (j != -1 && ks3Var.getPosition() >= j) {
                break;
            }
        } while (ks3Var.i(1) != -1);
        return false;
    }
}
