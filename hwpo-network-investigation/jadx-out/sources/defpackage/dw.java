package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dw extends fw {
    public float a;
    public float b;
    public float c;
    public final int d = 3;

    public dw(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.fw
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.c;
    }

    @Override // defpackage.fw
    public final int b() {
        return this.d;
    }

    @Override // defpackage.fw
    public final fw c() {
        return new dw(0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.fw
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
    }

    @Override // defpackage.fw
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        } else if (i == 1) {
            this.b = f;
        } else {
            if (i != 2) {
                return;
            }
            this.c = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dw)) {
            return false;
        }
        dw dwVar = (dw) obj;
        return dwVar.a == this.a && dwVar.b == this.b && dwVar.c == this.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + h44.a(Float.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c;
    }
}
