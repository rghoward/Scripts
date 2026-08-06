package defpackage;

import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zz6 implements ce3 {
    public final pt7 a;
    public final a07.a b;
    public final String c;
    public final int d;
    public final String e;
    public hsa f;
    public String g;
    public int h = 0;
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public long n;

    public zz6(String str, int i, String str2) {
        pt7 pt7Var = new pt7(4);
        this.a = pt7Var;
        pt7Var.a[0] = -1;
        this.b = new a07.a();
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // defpackage.ce3
    public final void a(pt7 pt7Var) {
        this.f.getClass();
        while (pt7Var.a() > 0) {
            int i = this.h;
            pt7 pt7Var2 = this.a;
            if (i == 0) {
                byte[] bArr = pt7Var.a;
                int i2 = pt7Var.b;
                int i3 = pt7Var.c;
                while (true) {
                    if (i2 >= i3) {
                        pt7Var.M(i3);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z = (b & MessagePack.Code.EXT_TIMESTAMP) == 255;
                    boolean z2 = this.k && (b & MessagePack.Code.NEGFIXINT_PREFIX) == 224;
                    this.k = z;
                    if (z2) {
                        pt7Var.M(i2 + 1);
                        this.k = false;
                        pt7Var2.a[1] = bArr[i2];
                        this.i = 2;
                        this.h = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i == 1) {
                int iMin = Math.min(pt7Var.a(), 4 - this.i);
                pt7Var.k(pt7Var2.a, this.i, iMin);
                int i4 = this.i + iMin;
                this.i = i4;
                if (i4 >= 4) {
                    pt7Var2.M(0);
                    int iM = pt7Var2.m();
                    a07.a aVar = this.b;
                    if (aVar.a(iM)) {
                        this.m = aVar.c;
                        if (!this.j) {
                            this.l = (((long) aVar.g) * 1000000) / ((long) aVar.d);
                            id4.a aVar2 = new id4.a();
                            aVar2.a = this.g;
                            aVar2.m = fv6.n(this.e);
                            aVar2.n = fv6.n(aVar.b);
                            aVar2.o = 4096;
                            aVar2.F = aVar.e;
                            aVar2.G = aVar.d;
                            aVar2.d = this.c;
                            aVar2.f = this.d;
                            this.f.g(new id4(aVar2));
                            this.j = true;
                        }
                        pt7Var2.M(0);
                        this.f.e(4, pt7Var2);
                        this.h = 2;
                    } else {
                        this.i = 0;
                        this.h = 1;
                    }
                }
            } else {
                if (i != 2) {
                    d43.c();
                    return;
                }
                int iMin2 = Math.min(pt7Var.a(), this.m - this.i);
                this.f.e(iMin2, pt7Var);
                int i5 = this.i + iMin2;
                this.i = i5;
                if (i5 >= this.m) {
                    xl7.r(this.n != -9223372036854775807L);
                    this.f.a(this.n, 1, this.m, 0, null);
                    this.n += this.l;
                    this.i = 0;
                    this.h = 0;
                }
            }
        }
    }

    @Override // defpackage.ce3
    public final void c() {
        this.h = 0;
        this.i = 0;
        this.k = false;
        this.n = -9223372036854775807L;
    }

    @Override // defpackage.ce3
    public final void e(int i, long j) {
        this.n = j;
    }

    @Override // defpackage.ce3
    public final void f(ls3 ls3Var, pya.c cVar) {
        cVar.a();
        cVar.b();
        this.g = cVar.e;
        cVar.b();
        this.f = ls3Var.p(cVar.d, 1);
    }

    @Override // defpackage.ce3
    public final void d(boolean z) {
    }
}
