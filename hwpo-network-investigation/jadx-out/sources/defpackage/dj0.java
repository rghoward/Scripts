package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class dj0 {
    public final float[] b;
    public final boolean c;
    public int a = 0;
    public boolean d = false;
    public float e = 1.0f;

    public dj0(int i, boolean z) {
        this.b = new float[i];
        this.c = z;
    }

    public final void a(float f, float f2, float f3, float f4) {
        int i = this.a;
        int i2 = i + 1;
        this.a = i2;
        float[] fArr = this.b;
        fArr[i] = f;
        int i3 = i + 2;
        this.a = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.a = i4;
        fArr[i3] = f3;
        this.a = i + 4;
        fArr[i4] = f4;
    }
}
