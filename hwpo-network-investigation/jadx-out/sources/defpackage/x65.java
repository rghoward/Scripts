package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class x65 implements ce3 {
    public hsa b;
    public boolean c;
    public int e;
    public int f;
    public final pt7 a = new pt7(10);
    public long d = -9223372036854775807L;

    @Override // defpackage.ce3
    public final void a(pt7 pt7Var) {
        this.b.getClass();
        if (this.c) {
            int iA = pt7Var.a();
            int i = this.f;
            if (i < 10) {
                int iMin = Math.min(iA, 10 - i);
                byte[] bArr = pt7Var.a;
                int i2 = pt7Var.b;
                pt7 pt7Var2 = this.a;
                System.arraycopy(bArr, i2, pt7Var2.a, this.f, iMin);
                if (this.f + iMin == 10) {
                    pt7Var2.M(0);
                    if (73 != pt7Var2.z() || 68 != pt7Var2.z() || 51 != pt7Var2.z()) {
                        md6.g("Id3Reader", "Discarding invalid ID3 tag");
                        this.c = false;
                        return;
                    } else {
                        pt7Var2.N(3);
                        this.e = pt7Var2.y() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.e - this.f);
            this.b.e(iMin2, pt7Var);
            this.f += iMin2;
        }
    }

    @Override // defpackage.ce3
    public final void c() {
        this.c = false;
        this.d = -9223372036854775807L;
    }

    @Override // defpackage.ce3
    public final void d(boolean z) {
        int i;
        this.b.getClass();
        if (this.c && (i = this.e) != 0 && this.f == i) {
            xl7.r(this.d != -9223372036854775807L);
            this.b.a(this.d, 1, this.e, 0, null);
            this.c = false;
        }
    }

    @Override // defpackage.ce3
    public final void e(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        this.d = j;
        this.e = 0;
        this.f = 0;
    }

    @Override // defpackage.ce3
    public final void f(ls3 ls3Var, pya.c cVar) {
        cVar.a();
        cVar.b();
        hsa hsaVarP = ls3Var.p(cVar.d, 5);
        this.b = hsaVarP;
        id4.a aVar = new id4.a();
        cVar.b();
        aVar.a = cVar.e;
        aVar.m = fv6.n("video/mp2t");
        aVar.n = fv6.n("application/id3");
        hy1.b(aVar, hsaVarP);
    }
}
