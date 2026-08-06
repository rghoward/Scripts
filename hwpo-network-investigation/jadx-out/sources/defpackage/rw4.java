package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rw4 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;
    public final int f;
    public final int g;
    public final mrb.a h;
    public float i;
    public float j;

    public rw4(float f, float f2, float f3, float f4, int i, mrb.a aVar) {
        this.e = -1;
        this.g = -1;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.f = i;
        this.h = aVar;
    }

    public final boolean a(rw4 rw4Var) {
        return rw4Var != null && this.f == rw4Var.f && this.a == rw4Var.a && this.g == rw4Var.g && this.e == rw4Var.e;
    }

    public final String toString() {
        return "Highlight, x: " + this.a + ", y: " + this.b + ", dataSetIndex: " + this.f + ", stackIndex (only stacked barentry): " + this.g;
    }

    public rw4(float f, float f2, float f3, float f4, int i, int i2, mrb.a aVar) {
        this(f, f2, f3, f4, i, aVar);
        this.g = i2;
    }
}
