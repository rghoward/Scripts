package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class g86 implements jb4 {
    public final float a;

    public g86(float f) {
        this.a = f;
    }

    @Override // defpackage.jb4
    public final float a(float f) {
        return f / this.a;
    }

    @Override // defpackage.jb4
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g86) && Float.compare(this.a, ((g86) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return ho.a(new StringBuilder("LinearFontScaleConverter(fontScale="), this.a, ')');
    }
}
