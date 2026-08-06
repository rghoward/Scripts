package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wp6 {
    public final bq6.b a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public wp6(bq6.b bVar, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        xl7.g(!z5 || z3);
        xl7.g(!z4 || z3);
        if (z2 && (z3 || z4 || z5)) {
            z6 = false;
        }
        xl7.g(z6);
        this.a = bVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
    }

    public final wp6 a(long j) {
        if (j == this.d) {
            return this;
        }
        return new wp6(this.a, this.b, this.c, j, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    public final wp6 b(long j, long j2) {
        if (j == this.b && j2 == this.c) {
            return this;
        }
        return new wp6(this.a, j, j2, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wp6.class == obj.getClass()) {
            wp6 wp6Var = (wp6) obj;
            if (this.b == wp6Var.b && this.d == wp6Var.d && this.e == wp6Var.e && this.f == wp6Var.f && this.g == wp6Var.g && this.h == wp6Var.h && this.i == wp6Var.i && this.j == wp6Var.j && this.k == wp6Var.k && Objects.equals(this.a, wp6Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31) + (this.k ? 1 : 0);
    }
}
