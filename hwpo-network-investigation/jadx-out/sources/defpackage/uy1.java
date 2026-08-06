package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uy1 {
    public final int a;
    public final long b;
    public final vy1 c;
    public final nib d;

    public uy1(int i, long j, vy1 vy1Var, nib nibVar) {
        this.a = i;
        this.b = j;
        this.c = vy1Var;
        this.d = nibVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy1)) {
            return false;
        }
        uy1 uy1Var = (uy1) obj;
        return this.a == uy1Var.a && this.b == uy1Var.b && this.c == uy1Var.c && xj5.a(this.d, uy1Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + al.c(this.b, Integer.hashCode(this.a) * 31, 31)) * 31;
        nib nibVar = this.d;
        return iHashCode + (nibVar == null ? 0 : nibVar.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ')';
    }
}
