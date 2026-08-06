package defpackage;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ac2 extends es7 {
    public final nz1 A;
    public final int B;
    public final boolean C;
    public boolean F;
    public es7 y;
    public final es7 z;
    public final bt7 D = new bt7(0);
    public long E = -1;
    public final at7 G = new at7(1.0f);
    public final dt7 H = bl7.i(null);

    public ac2(es7 es7Var, es7 es7Var2, nz1 nz1Var, int i, boolean z) {
        this.y = es7Var;
        this.z = es7Var2;
        this.A = nz1Var;
        this.B = i;
        this.C = z;
    }

    @Override // defpackage.es7
    public final boolean a(float f) {
        this.G.g(f);
        return true;
    }

    @Override // defpackage.es7
    public final boolean e(wh1 wh1Var) {
        this.H.setValue(wh1Var);
        return true;
    }

    @Override // defpackage.es7
    public final long h() {
        es7 es7Var = this.y;
        long jH = es7Var != null ? es7Var.h() : 0L;
        es7 es7Var2 = this.z;
        long jH2 = es7Var2 != null ? es7Var2.h() : 0L;
        boolean z = jH != 9205357640488583168L;
        boolean z2 = jH2 != 9205357640488583168L;
        if (z && z2) {
            return p50.b(Math.max(cr9.d(jH), cr9.d(jH2)), Math.max(cr9.b(jH), cr9.b(jH2)));
        }
        return 9205357640488583168L;
    }

    @Override // defpackage.es7
    public final void i(d73 d73Var) {
        boolean z = this.F;
        es7 es7Var = this.z;
        at7 at7Var = this.G;
        if (z) {
            j(d73Var, es7Var, at7Var.h());
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.E == -1) {
            this.E = jUptimeMillis;
        }
        float f = (jUptimeMillis - this.E) / this.B;
        float fH = at7Var.h() * uh8.f(f, 0.0f, 1.0f);
        float fH2 = this.C ? at7Var.h() - fH : at7Var.h();
        this.F = f >= 1.0f;
        j(d73Var, this.y, fH2);
        j(d73Var, es7Var, fH);
        if (this.F) {
            this.y = null;
        } else {
            bt7 bt7Var = this.D;
            bt7Var.j(bt7Var.k() + 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(d73 d73Var, es7 es7Var, float f) {
        if (es7Var == null || f <= 0.0f) {
            return;
        }
        long jC = d73Var.c();
        long jH = es7Var.h();
        long jB = (jH == 9205357640488583168L || cr9.e(jH) || jC == 9205357640488583168L || cr9.e(jC)) ? jC : f.b(jH, this.A.a(jH, jC));
        dt7 dt7Var = this.H;
        if (jC == 9205357640488583168L || cr9.e(jC)) {
            es7Var.g(d73Var, jB, f, (wh1) dt7Var.getValue());
            return;
        }
        float fD = (cr9.d(jC) - cr9.d(jB)) / 2.0f;
        float fB = (cr9.b(jC) - cr9.b(jB)) / 2.0f;
        d73Var.Y0().a.c(fD, fB, fD, fB);
        es7Var.g(d73Var, jB, f, (wh1) dt7Var.getValue());
        t41 t41Var = d73Var.Y0().a;
        float f2 = -fD;
        float f3 = -fB;
        t41Var.c(f2, f3, f2, f3);
    }
}
