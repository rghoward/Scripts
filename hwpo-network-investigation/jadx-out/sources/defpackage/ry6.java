package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ry6 implements su6.a {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public ry6(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ry6 ry6Var = (ry6) obj;
            if (this.a == ry6Var.a && this.b == ry6Var.b && this.c == ry6Var.c && this.d == ry6Var.d && this.e == ry6Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return bf6.b(this.e) + ((bf6.b(this.d) + ((bf6.b(this.c) + ((bf6.b(this.b) + ((bf6.b(this.a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }
}
