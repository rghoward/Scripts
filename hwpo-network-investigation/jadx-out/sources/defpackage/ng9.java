package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ng9 {
    public final yg9 a;
    public final l20 b;

    public ng9(yg9 yg9Var, l20 l20Var) {
        this.a = yg9Var;
        this.b = l20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng9)) {
            return false;
        }
        ng9 ng9Var = (ng9) obj;
        return this.a.equals(ng9Var.a) && this.b.equals(ng9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + (dn3.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + dn3.SESSION_START + ", sessionData=" + this.a + ", applicationInfo=" + this.b + ')';
    }
}
