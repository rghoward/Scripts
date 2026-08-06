package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class k77 {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public String j;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public boolean a;
        public boolean b;
        public int c;
        public String d;
        public boolean e;
        public boolean f;
        public int g;
        public int h;

        public final k77 a() {
            String str = this.d;
            boolean z = this.a;
            if (str == null) {
                return new k77(z, this.b, this.c, this.e, this.f, this.g, this.h);
            }
            boolean z2 = this.b;
            boolean z3 = this.e;
            boolean z4 = this.f;
            int i = this.g;
            int i2 = this.h;
            int i3 = c67.x;
            k77 k77Var = new k77(z, z2, "android-app://androidx.navigation/".concat(str).hashCode(), z3, z4, i, i2);
            k77Var.j = str;
            return k77Var;
        }

        public final void b(int i, boolean z, boolean z2) {
            this.c = i;
            this.d = null;
            this.e = z;
            this.f = z2;
        }
    }

    public k77() {
        throw null;
    }

    public k77(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = z3;
        this.e = z4;
        this.f = i2;
        this.g = i3;
        this.h = -1;
        this.i = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k77)) {
            return false;
        }
        k77 k77Var = (k77) obj;
        return this.a == k77Var.a && this.b == k77Var.b && this.c == k77Var.c && xj5.a(this.j, k77Var.j) && this.d == k77Var.d && this.e == k77Var.e && this.f == k77Var.f && this.g == k77Var.g && this.h == k77Var.h && this.i == k77Var.i;
    }

    public final int hashCode() {
        int i = (((((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + this.c) * 31;
        String str = this.j;
        return ((((((((((((i + (str != null ? str.hashCode() : 0)) * 29791) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i;
    }

    public final String toString() {
        String str = this.j;
        StringBuilder sb = new StringBuilder();
        sb.append(k77.class.getSimpleName());
        sb.append("(");
        if (this.a) {
            sb.append("launchSingleTop ");
        }
        if (this.b) {
            sb.append("restoreState ");
        }
        if ((str != null || this.c != -1) && str != null) {
            sb.append("popUpTo(");
            sb.append(str);
            if (this.d) {
                sb.append(" inclusive");
            }
            if (this.e) {
                sb.append(" saveState");
            }
            sb.append(")");
        }
        int i = this.i;
        int i2 = this.h;
        int i3 = this.g;
        int i4 = this.f;
        if (i4 != -1 || i3 != -1 || i2 != -1 || i != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i4));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i3));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(i2));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(i));
            sb.append(")");
        }
        return sb.toString();
    }
}
