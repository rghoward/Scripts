package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class an9 implements b97 {
    public final /* synthetic */ hn9 t;
    public final /* synthetic */ oh4<Float, g2b> u;

    public an9(hn9 hn9Var, oh4 oh4Var) {
        this.t = hn9Var;
        this.u = oh4Var;
    }

    @Override // defpackage.b97
    public final long B0(int i, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f || i != 1) {
            return 0L;
        }
        return a(this.t.d.d(fIntBitsToFloat));
    }

    public final long a(float f) {
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    @Override // defpackage.b97
    public final long f0(long j, int i, long j2) {
        if (i == 1) {
            return a(this.t.d.d(Float.intBitsToFloat((int) (4294967295L & j2))));
        }
        return 0L;
    }

    @Override // defpackage.b97
    public final Object g0(long j, long j2, r02<? super rdb> r02Var) {
        this.u.invoke(new Float(rdb.c(j2)));
        return new rdb(j2);
    }

    @Override // defpackage.b97
    public final Object t1(long j, r02<? super rdb> r02Var) {
        float fC = rdb.c(j);
        hn9 hn9Var = this.t;
        float fG = hn9Var.d.g();
        float fB = hn9Var.d.e().b();
        if (fC >= 0.0f || fG <= fB) {
            j = 0;
        } else {
            this.u.invoke(new Float(fC));
        }
        return new rdb(j);
    }
}
