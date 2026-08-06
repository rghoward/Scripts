package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jy9 implements r44 {
    public final i44 a;

    public jy9(tx2 tx2Var) {
        this.a = new i44(ky9.a, tx2Var);
    }

    @Override // defpackage.r44
    public final float a() {
        return 0.0f;
    }

    @Override // defpackage.r44
    public final float b(float f, long j) {
        long j2 = j / 1000000;
        i44.a aVarA = this.a.a(f);
        long j3 = aVarA.c;
        return (((Math.signum(aVarA.a) * io.a(j3 > 0 ? j2 / j3 : 1.0f).b) * aVarA.b) / j3) * 1000.0f;
    }

    @Override // defpackage.r44
    public final float c(float f, float f2, long j) {
        long j2 = j / 1000000;
        i44.a aVarA = this.a.a(f2);
        long j3 = aVarA.c;
        return (Math.signum(aVarA.a) * aVarA.b * io.a(j3 > 0 ? j2 / j3 : 1.0f).a) + f;
    }

    @Override // defpackage.r44
    public final long d(float f) {
        return ((long) (Math.exp(this.a.b(f) / (((double) j44.a) - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // defpackage.r44
    public final float e(float f, float f2) {
        i44 i44Var = this.a;
        double dB = i44Var.b(f2);
        double d = j44.a;
        return (Math.signum(f2) * ((float) (Math.exp((d / (d - 1.0d)) * dB) * ((double) (i44Var.a * i44Var.c))))) + f;
    }
}
