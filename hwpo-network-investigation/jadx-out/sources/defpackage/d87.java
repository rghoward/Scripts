package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d87 {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public d87(float f, float f2, float f3, int i, long j) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d87.class == obj.getClass()) {
            d87 d87Var = (d87) obj;
            return this.c == d87Var.c && this.d == d87Var.d && this.b == d87Var.b && this.a == d87Var.a && this.e == d87Var.e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + os2.a(this.a, h44.a(h44.a(Float.hashCode(this.c) * 31, this.d, 31), this.b, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigationEvent(touchX=");
        sb.append(this.c);
        sb.append(", touchY=");
        sb.append(this.d);
        sb.append(", progress=");
        sb.append(this.b);
        sb.append(", swipeEdge=");
        sb.append(this.a);
        sb.append(", frameTimeMillis=");
        return fh0.b(sb, this.e, ')');
    }

    public d87() {
        this(0.0f, 0.0f, 0.0f, 2, 0L);
    }
}
