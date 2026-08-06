package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class we2 {
    public final ve2 a;
    public final ve2 b;
    public final double c;

    public we2(ve2 ve2Var, ve2 ve2Var2, double d) {
        ve2Var.getClass();
        ve2Var2.getClass();
        this.a = ve2Var;
        this.b = ve2Var2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we2)) {
            return false;
        }
        we2 we2Var = (we2) obj;
        return this.a == we2Var.a && this.b == we2Var.b && Double.compare(this.c, we2Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.a + ", crashlytics=" + this.b + ", sessionSamplingRate=" + this.c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public we2() {
        ve2 ve2Var = ve2.COLLECTION_SDK_NOT_INSTALLED;
        this(ve2Var, ve2Var, 1.0d);
    }
}
