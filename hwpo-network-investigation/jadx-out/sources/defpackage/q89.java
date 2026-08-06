package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q89 implements pya {
    public final p89 a;
    public final pt7 b = new pt7(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public q89(p89 p89Var) {
        this.a = p89Var;
    }

    @Override // defpackage.pya
    public final void a(int i, pt7 pt7Var) {
        int iZ;
        boolean z = (i & 1) != 0;
        if (z) {
            iZ = pt7Var.b + pt7Var.z();
        } else {
            iZ = -1;
        }
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            pt7Var.M(iZ);
            this.d = 0;
        }
        while (pt7Var.a() > 0) {
            int i2 = this.d;
            pt7 pt7Var2 = this.b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iZ2 = pt7Var.z();
                    pt7Var.M(pt7Var.b - 1);
                    if (iZ2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(pt7Var.a(), 3 - this.d);
                pt7Var.k(pt7Var2.a, this.d, iMin);
                int i3 = this.d + iMin;
                this.d = i3;
                if (i3 == 3) {
                    pt7Var2.M(0);
                    pt7Var2.L(3);
                    pt7Var2.N(1);
                    int iZ3 = pt7Var2.z();
                    int iZ4 = pt7Var2.z();
                    this.e = (iZ3 & 128) != 0;
                    int i4 = (((iZ3 & 15) << 8) | iZ4) + 3;
                    this.c = i4;
                    byte[] bArr = pt7Var2.a;
                    if (bArr.length < i4) {
                        pt7Var2.c(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(pt7Var.a(), this.c - this.d);
                pt7Var.k(pt7Var2.a, this.d, iMin2);
                int i5 = this.d + iMin2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.e) {
                        pt7Var2.L(i6);
                    } else {
                        if (n6b.o(0, pt7Var2.a, i6, -1) != 0) {
                            this.f = true;
                            return;
                        }
                        pt7Var2.L(this.c - 4);
                    }
                    pt7Var2.M(0);
                    this.a.a(pt7Var2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // defpackage.pya
    public final void b(apa apaVar, ls3 ls3Var, pya.c cVar) {
        this.a.b(apaVar, ls3Var, cVar);
        this.f = true;
    }

    @Override // defpackage.pya
    public final void c() {
        this.f = true;
    }
}
