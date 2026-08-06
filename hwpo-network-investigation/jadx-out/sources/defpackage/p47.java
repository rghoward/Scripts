package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class p47 {
    public final m77<Object> a;
    public final boolean b;
    public final boolean c;
    public final Object d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class a {
        public m77<Object> a;
        public boolean b;
        public Object c;
        public boolean d;
    }

    public p47(m77 m77Var, boolean z, Object obj, boolean z2) {
        if (!m77Var.isNullableAllowed() && z) {
            li.c(m77Var.getName(), " does not allow nullable values");
            throw null;
        }
        if (!z && z2 && obj == null) {
            ca0.c(m77Var.getName(), " has null value but is not nullable.", "Argument with type ");
            throw null;
        }
        this.a = m77Var;
        this.b = z;
        this.d = obj;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p47.class == obj.getClass()) {
            p47 p47Var = (p47) obj;
            if (this.b != p47Var.b || this.c != p47Var.c || !xj5.a(this.a, p47Var.a)) {
                return false;
            }
            Object obj2 = p47Var.d;
            Object obj3 = this.d;
            if (obj3 != null) {
                return xj5.a(obj3, obj2);
            }
            if (obj2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31;
        Object obj = this.d;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ll8.a(p47.class).c());
        sb.append(" Type: " + this.a);
        sb.append(" Nullable: " + this.b);
        if (this.c) {
            sb.append(" DefaultValue: " + this.d);
        }
        return sb.toString();
    }
}
