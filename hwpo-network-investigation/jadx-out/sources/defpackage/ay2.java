package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ay2 {
    public final fg8<?> a;
    public final int b;
    public final int c;

    public ay2(fg8<?> fg8Var, int i, int i2) {
        yl7.b(fg8Var, "Null dependency anInterface.");
        this.a = fg8Var;
        this.b = i;
        this.c = i2;
    }

    public static ay2 a(Class<?> cls) {
        return new ay2(0, 1, cls);
    }

    public static ay2 b(fg8<?> fg8Var) {
        return new ay2(fg8Var, 1, 0);
    }

    public static ay2 c(Class<?> cls) {
        return new ay2(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ay2)) {
            return false;
        }
        ay2 ay2Var = (ay2) obj;
        return this.a.equals(ay2Var.a) && this.b == ay2Var.b && this.c == ay2Var.c;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        if (i == 1) {
            str = "required";
        } else {
            str = i == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i2 = this.c;
        if (i2 == 0) {
            str2 = "direct";
        } else if (i2 == 1) {
            str2 = "provider";
        } else {
            if (i2 != 2) {
                sx0.a(pp2.a(i2, "Unsupported injection: "));
                return null;
            }
            str2 = "deferred";
        }
        return av.a(sb, str2, "}");
    }

    public ay2(int i, int i2, Class cls) {
        this((fg8<?>) fg8.a(cls), i, i2);
    }
}
