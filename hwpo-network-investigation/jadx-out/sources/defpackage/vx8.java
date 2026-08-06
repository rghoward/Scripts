package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vx8 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        dc4.b(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public vx8(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final float a() {
        return this.d - this.b;
    }

    public final float b() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx8)) {
            return false;
        }
        vx8 vx8Var = (vx8) obj;
        return Float.compare(this.a, vx8Var.a) == 0 && Float.compare(this.b, vx8Var.b) == 0 && Float.compare(this.c, vx8Var.c) == 0 && Float.compare(this.d, vx8Var.d) == 0 && c72.a(this.e, vx8Var.e) && c72.a(this.f, vx8Var.f) && c72.a(this.g, vx8Var.g) && c72.a(this.h, vx8Var.h);
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + al.c(this.g, al.c(this.f, al.c(this.e, h44.a(h44.a(h44.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), 31), 31), 31);
    }

    public final String toString() {
        String str = ds6.c(this.a) + ", " + ds6.c(this.b) + ", " + ds6.c(this.c) + ", " + ds6.c(this.d);
        long j = this.e;
        long j2 = this.f;
        boolean zA = c72.a(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (!zA || !c72.a(j2, j3) || !c72.a(j3, j4)) {
            StringBuilder sbA = aa.a("RoundRect(rect=", str, ", topLeft=");
            sbA.append((Object) c72.c(j));
            sbA.append(", topRight=");
            sbA.append((Object) c72.c(j2));
            sbA.append(", bottomRight=");
            sbA.append((Object) c72.c(j3));
            sbA.append(", bottomLeft=");
            sbA.append((Object) c72.c(j4));
            sbA.append(')');
            return sbA.toString();
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            StringBuilder sbA2 = aa.a("RoundRect(rect=", str, ", radius=");
            sbA2.append(ds6.c(Float.intBitsToFloat(i)));
            sbA2.append(')');
            return sbA2.toString();
        }
        StringBuilder sbA3 = aa.a("RoundRect(rect=", str, ", x=");
        sbA3.append(ds6.c(Float.intBitsToFloat(i)));
        sbA3.append(", y=");
        sbA3.append(ds6.c(Float.intBitsToFloat(i2)));
        sbA3.append(')');
        return sbA3.toString();
    }
}
