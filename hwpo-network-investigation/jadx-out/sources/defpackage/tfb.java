package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tfb {
    public static final tfb d = new tfb(0, 0);
    public final int a;
    public final int b;
    public final float c;

    static {
        n6b.H(0);
        n6b.H(1);
        n6b.H(3);
    }

    public tfb(int i, int i2, float f) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tfb) {
            tfb tfbVar = (tfb) obj;
            if (this.a == tfbVar.a && this.b == tfbVar.b && this.c == tfbVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.c) + ((((217 + this.a) * 31) + this.b) * 31);
    }

    public tfb(int i, int i2) {
        this(i, i2, 1.0f);
    }
}
