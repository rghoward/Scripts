package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tp5 implements Comparable<tp5> {
    public static final tp5 u = new tp5();
    public final int t = 131861;

    @Override // java.lang.Comparable
    public final int compareTo(tp5 tp5Var) {
        tp5 tp5Var2 = tp5Var;
        tp5Var2.getClass();
        return this.t - tp5Var2.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        tp5 tp5Var = obj instanceof tp5 ? (tp5) obj : null;
        return tp5Var != null && this.t == tp5Var.t;
    }

    public final int hashCode() {
        return this.t;
    }

    public final String toString() {
        return "2.3.21";
    }
}
