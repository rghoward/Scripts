package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t41 {
    public final /* synthetic */ s41.b a;

    public t41(s41.b bVar) {
        this.a = bVar;
    }

    public final void a(cu7 cu7Var) {
        this.a.a().i(cu7Var);
    }

    public final void b(float f, float f2, float f3, float f4, int i) {
        this.a.a().m(f, f2, f3, f4, i);
    }

    public final void c(float f, float f2, float f3, float f4) {
        s41.b bVar = this.a;
        n41 n41VarA = bVar.a();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.d() >> 32)) - (f3 + f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (bVar.d() & 4294967295L)) - (f4 + f2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            tc5.a("Width and height must be greater than or equal to zero");
        }
        bVar.h(jFloatToRawIntBits);
        n41VarA.n(f, f2);
    }

    public final void d(float f, long j) {
        n41 n41VarA = this.a.a();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        n41VarA.n(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        n41VarA.e(f);
        n41VarA.n(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public final void e(float f, float f2, long j) {
        n41 n41VarA = this.a.a();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        n41VarA.n(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        n41VarA.d(f, f2);
        n41VarA.n(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public final void f(float f, float f2) {
        this.a.a().n(f, f2);
    }
}
