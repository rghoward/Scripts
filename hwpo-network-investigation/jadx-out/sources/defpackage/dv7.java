package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dv7 implements e72 {
    public final float a;

    public dv7(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            xc5.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.e72
    public final float a(long j, tx2 tx2Var) {
        return (this.a / 100.0f) * cr9.c(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dv7) && Float.compare(this.a, ((dv7) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
