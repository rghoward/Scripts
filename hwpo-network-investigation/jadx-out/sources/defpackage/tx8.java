package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tx8 {
    public final float a;
    public final float b;
    public final long c;
    public final int d;

    public tx8(float f, float f2, int i, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tx8)) {
            return false;
        }
        tx8 tx8Var = (tx8) obj;
        return tx8Var.a == this.a && tx8Var.b == this.b && tx8Var.c == this.c && tx8Var.d == this.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + al.c(this.c, h44.a(Float.hashCode(this.a) * 31, this.b, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RotaryScrollEvent(verticalScrollPixels=");
        sb.append(this.a);
        sb.append(",horizontalScrollPixels=");
        sb.append(this.b);
        sb.append(",uptimeMillis=");
        sb.append(this.c);
        sb.append(",deviceId=");
        return e44.a(sb, this.d, ')');
    }
}
