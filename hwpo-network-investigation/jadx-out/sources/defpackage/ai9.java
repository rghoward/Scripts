package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ai9 extends gm3<tf0> {
    public final tf0 b;
    public final xi9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai9(tf0 tf0Var, xi9 xi9Var) {
        super(tf0Var);
        xi9Var.getClass();
        this.b = tf0Var;
        this.c = xi9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai9)) {
            return false;
        }
        ai9 ai9Var = (ai9) obj;
        return this.b == ai9Var.b && xj5.a(this.c, ai9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateSwipeContainerDirections(directions=" + this.b + ", source=" + this.c + ")";
    }
}
