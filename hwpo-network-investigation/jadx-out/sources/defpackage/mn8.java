package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mn8 {
    public static final mn8 c = new mn8(0, false);
    public final int a;
    public final boolean b;

    public mn8(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mn8.class != obj.getClass()) {
            return false;
        }
        mn8 mn8Var = (mn8) obj;
        return this.a == mn8Var.a && this.b == mn8Var.b;
    }

    public final int hashCode() {
        return (this.a << 1) + (this.b ? 1 : 0);
    }
}
