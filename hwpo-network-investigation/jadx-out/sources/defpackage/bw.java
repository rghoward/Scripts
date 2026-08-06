package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bw extends fw {
    public float a;
    public final int b = 1;

    public bw(float f) {
        this.a = f;
    }

    @Override // defpackage.fw
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // defpackage.fw
    public final int b() {
        return this.b;
    }

    @Override // defpackage.fw
    public final fw c() {
        return new bw(0.0f);
    }

    @Override // defpackage.fw
    public final void d() {
        this.a = 0.0f;
    }

    @Override // defpackage.fw
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bw) && ((bw) obj).a == this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
