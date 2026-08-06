package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cw extends fw {
    public float a;
    public float b;
    public final int c = 2;

    public cw(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.fw
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.b;
    }

    @Override // defpackage.fw
    public final int b() {
        return this.c;
    }

    @Override // defpackage.fw
    public final fw c() {
        return new cw(0.0f, 0.0f);
    }

    @Override // defpackage.fw
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    @Override // defpackage.fw
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cw)) {
            return false;
        }
        cw cwVar = (cw) obj;
        return cwVar.a == this.a && cwVar.b == this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
