package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zz7 {
    public final int a;
    public final int b;

    public zz7(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zz7)) {
            return false;
        }
        zz7 zz7Var = (zz7) obj;
        return this.a == zz7Var.a && this.b == zz7Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return a30.b("PlanIdOptionId(planId=", ", optionId=", ")", this.a, this.b);
    }
}
