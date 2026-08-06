package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class jj9 implements el0 {
    public final js7<sh9, Integer> a;
    public final boolean b;
    public final tf0 c;

    public jj9(js7<sh9, Integer> js7Var, boolean z, tf0 tf0Var) {
        tf0Var.getClass();
        this.a = js7Var;
        this.b = z;
        this.c = tf0Var;
    }

    public static jj9 a(jj9 jj9Var, js7 js7Var, tf0 tf0Var, int i) {
        if ((i & 1) != 0) {
            js7Var = jj9Var.a;
        }
        boolean z = (i & 2) != 0 ? jj9Var.b : true;
        if ((i & 4) != 0) {
            tf0Var = jj9Var.c;
        }
        jj9Var.getClass();
        tf0Var.getClass();
        return new jj9(js7Var, z, tf0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj9)) {
            return false;
        }
        jj9 jj9Var = (jj9) obj;
        return this.a.equals(jj9Var.a) && this.b == jj9Var.b && this.c == jj9Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + uo2.a(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return "SessionsSwipeContainerViewState(sessionsDays=" + this.a + ", isSwipeDirectionInitialized=" + this.b + ", availableDirection=" + this.c + ")";
    }
}
