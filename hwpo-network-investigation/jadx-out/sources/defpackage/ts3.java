package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ts3 extends oe7.a {
    public static final oe7<ts3> d;
    public float b;
    public float c;

    static {
        oe7<ts3> oe7VarA = oe7.a(256, new ts3(0));
        d = oe7VarA;
        oe7VarA.f = 0.5f;
    }

    public ts3(int i) {
        this.b = 0.0f;
        this.c = 0.0f;
    }

    @Override // oe7.a
    public final oe7.a a() {
        return new ts3(0);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof ts3) {
            ts3 ts3Var = (ts3) obj;
            if (this.b == ts3Var.b && this.c == ts3Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.c) ^ Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return this.b + "x" + this.c;
    }

    public ts3() {
    }
}
