package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ar9 {
    public static final ar9 c = new ar9(-1, -1);
    public final int a;
    public final int b;

    static {
        new ar9(0, 0);
        n6b.H(0);
        n6b.H(1);
    }

    public ar9(int i, int i2) {
        xl7.g((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof ar9) {
            ar9 ar9Var = (ar9) obj;
            if (this.a == ar9Var.a && this.b == ar9Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i << 16;
        return this.b ^ ((i >>> 16) | i2);
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
