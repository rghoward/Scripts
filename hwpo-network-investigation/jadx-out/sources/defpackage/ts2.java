package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ts2 implements b97 {
    public final dr7 t;

    public ts2(dr7 dr7Var) {
        this.t = dr7Var;
    }

    @Override // defpackage.b97
    public final long B0(int i, long j) {
        if (i != 1) {
            return 0L;
        }
        dr7 dr7Var = this.t;
        if (Math.abs(dr7Var.l()) <= 1.0E-6d) {
            return 0L;
        }
        int i2 = (int) (j >> 32);
        if (Math.abs(Float.intBitsToFloat(i2)) <= 0.0f) {
            return 0L;
        }
        iq7 iq7VarN = dr7Var.n();
        float fL = dr7Var.l() * dr7Var.p();
        float fI = ((iq7VarN.i() + iq7VarN.g()) * (-Math.signum(dr7Var.l()))) + fL;
        if (dr7Var.l() > 0.0f) {
            fI = fL;
            fL = fI;
        }
        float f = uh8.f(Float.intBitsToFloat(i2), fL, fI);
        boolean zE = iq7VarN.e();
        ht2 ht2Var = dr7Var.k;
        return (((long) Float.floatToRawIntBits(zE ? ht2Var.e(f) : -ht2Var.e(-f))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L);
    }

    @Override // defpackage.b97
    public final long f0(long j, int i, long j2) {
        if (i != 2 || Float.intBitsToFloat((int) (j2 >> 32)) == 0.0f) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // defpackage.b97
    public final Object g0(long j, long j2, r02<? super rdb> r02Var) {
        return new rdb(rdb.a(0.0f, 0.0f, 1, j2));
    }
}
