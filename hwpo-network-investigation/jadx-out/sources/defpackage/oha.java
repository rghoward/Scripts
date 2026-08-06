package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oha {
    public static final oha c = new oha(1.0f, 0.0f);
    public final float a;
    public final float b;

    public oha(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oha)) {
            return false;
        }
        oha ohaVar = (oha) obj;
        return this.a == ohaVar.a && this.b == ohaVar.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.a);
        sb.append(", skewX=");
        return ho.a(sb, this.b, ')');
    }

    public oha() {
        this(1.0f, 0.0f);
    }
}
