package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class f99 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public f99 f;
    public f99 g;

    public f99(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    public final f99 a() {
        f99 f99Var = this.f;
        if (f99Var == this) {
            f99Var = null;
        }
        f99 f99Var2 = this.g;
        f99Var2.getClass();
        f99Var2.f = this.f;
        f99 f99Var3 = this.f;
        f99Var3.getClass();
        f99Var3.g = this.g;
        this.f = null;
        this.g = null;
        return f99Var;
    }

    public final void b(f99 f99Var) {
        f99Var.getClass();
        f99Var.g = this;
        f99Var.f = this.f;
        f99 f99Var2 = this.f;
        f99Var2.getClass();
        f99Var2.g = f99Var;
        this.f = f99Var;
    }

    public final f99 c() {
        this.d = true;
        return new f99(this.a, this.b, this.c, true, false);
    }

    public final void d(f99 f99Var, int i) {
        f99Var.getClass();
        byte[] bArr = f99Var.a;
        if (!f99Var.e) {
            aa0.c("only owner can write");
            return;
        }
        int i2 = f99Var.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (f99Var.d) {
                zn3.b();
                return;
            }
            int i4 = f99Var.b;
            if (i3 - i4 > 8192) {
                zn3.b();
                return;
            } else {
                gz3.d(0, i4, i2, bArr, bArr);
                f99Var.c -= f99Var.b;
                f99Var.b = 0;
            }
        }
        int i5 = f99Var.c;
        int i6 = this.b;
        gz3.d(i5, i6, i6 + i, this.a, bArr);
        f99Var.c += i;
        this.b += i;
    }

    public f99() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
}
