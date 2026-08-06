package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m68 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;

    /* JADX WARN: Illegal instructions before constructor call */
    public m68(boolean z, s89 s89Var, boolean z2, int i) {
        u93 u93Var = fq.a;
        int i2 = !z ? 262152 : 262144;
        i2 = s89Var == s89.u ? i2 | 8192 : i2;
        this(z2 ? i2 : i2 | 512, s89Var == s89.t);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m68)) {
            return false;
        }
        m68 m68Var = (m68) obj;
        return this.a == m68Var.a && this.b == m68Var.b && this.c == m68Var.c && this.d == m68Var.d && this.e == m68Var.e && this.f == m68Var.f;
    }

    public final int hashCode() {
        return (uo2.a(uo2.a(uo2.a(uo2.a(uo2.a(this.a * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), false, 31) + this.f) * 31;
    }

    public m68(boolean z) {
        this(z, s89.t, true, 0);
    }

    public m68(int i, boolean z) {
        this.a = i;
        this.b = z;
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = 1002;
    }
}
