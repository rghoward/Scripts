package defpackage;

import androidx.media3.exoplayer.d;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tk0 implements s28 {
    public final toa.c a = new toa.c();

    @Override // defpackage.s28
    public final boolean C() {
        d dVar = (d) this;
        return dVar.A() == 3 && dVar.k() && dVar.L() == 0;
    }

    @Override // defpackage.s28
    public final boolean H(int i) {
        d dVar = (d) this;
        dVar.E0();
        return dVar.S.a.a.get(i);
    }

    @Override // defpackage.s28
    public final void S() {
        int iE;
        d dVar = (d) this;
        if (dVar.N().p() || dVar.g()) {
            b0();
            return;
        }
        if (!Z()) {
            if (d0() && c0()) {
                f0(dVar.G(), -9223372036854775807L, false);
                return;
            } else {
                b0();
                return;
            }
        }
        toa toaVarN = dVar.N();
        if (toaVarN.p()) {
            iE = -1;
        } else {
            int iG = dVar.G();
            dVar.E0();
            int i = dVar.H;
            if (i == 1) {
                i = 0;
            }
            dVar.E0();
            iE = toaVarN.e(iG, dVar.I, i);
        }
        if (iE == -1) {
            b0();
        } else if (iE == dVar.G()) {
            f0(dVar.G(), -9223372036854775807L, true);
        } else {
            f0(iE, -9223372036854775807L, false);
        }
    }

    @Override // defpackage.s28
    public final void T() {
        d dVar = (d) this;
        dVar.E0();
        g0(12, dVar.l0);
    }

    @Override // defpackage.s28
    public final void V() {
        d dVar = (d) this;
        dVar.E0();
        g0(11, -dVar.k0);
    }

    public final boolean Z() {
        int iE;
        d dVar = (d) this;
        toa toaVarN = dVar.N();
        if (toaVarN.p()) {
            iE = -1;
        } else {
            int iG = dVar.G();
            dVar.E0();
            int i = dVar.H;
            if (i == 1) {
                i = 0;
            }
            dVar.E0();
            iE = toaVarN.e(iG, dVar.I, i);
        }
        return iE != -1;
    }

    public final boolean a0() {
        int iK;
        d dVar = (d) this;
        toa toaVarN = dVar.N();
        if (toaVarN.p()) {
            iK = -1;
        } else {
            int iG = dVar.G();
            dVar.E0();
            int i = dVar.H;
            if (i == 1) {
                i = 0;
            }
            dVar.E0();
            iK = toaVarN.k(iG, dVar.I, i);
        }
        return iK != -1;
    }

    @Override // defpackage.s28
    public final void b() {
        d dVar = (d) this;
        dVar.E0();
        dVar.B0(1, false);
    }

    public final void b0() {
        ((d) this).E0();
    }

    public final boolean c0() {
        d dVar = (d) this;
        toa toaVarN = dVar.N();
        return !toaVarN.p() && toaVarN.m(dVar.G(), this.a, 0L).i;
    }

    public final boolean d0() {
        d dVar = (d) this;
        toa toaVarN = dVar.N();
        return !toaVarN.p() && toaVarN.m(dVar.G(), this.a, 0L).a();
    }

    public final boolean e0() {
        d dVar = (d) this;
        toa toaVarN = dVar.N();
        return !toaVarN.p() && toaVarN.m(dVar.G(), this.a, 0L).h;
    }

    public abstract void f0(int i, long j, boolean z);

    public final void g0(int i, long j) {
        d dVar = (d) this;
        long jX = dVar.X() + j;
        long jO0 = dVar.o0();
        if (jO0 != -9223372036854775807L) {
            jX = Math.min(jX, jO0);
        }
        f0(dVar.G(), Math.max(jX, 0L), false);
    }

    @Override // defpackage.s28
    public final void h() {
        d dVar = (d) this;
        dVar.E0();
        dVar.B0(1, true);
    }

    public final void h0(co6 co6Var) {
        ul8 ul8VarV = k95.v(co6Var);
        d dVar = (d) this;
        dVar.E0();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < ul8VarV.w; i++) {
            arrayList.add(dVar.r.c((co6) ul8VarV.get(i)));
        }
        dVar.w0(arrayList, true);
    }

    @Override // defpackage.s28
    public final void j(int i, long j) {
        f0(i, j, false);
    }

    @Override // defpackage.s28
    public final co6 l() {
        d dVar = (d) this;
        toa toaVarN = dVar.N();
        if (toaVarN.p()) {
            return null;
        }
        return toaVarN.m(dVar.G(), this.a, 0L).c;
    }

    @Override // defpackage.s28
    public final long o() {
        d dVar = (d) this;
        toa toaVarN = dVar.N();
        if (toaVarN.p()) {
            return -9223372036854775807L;
        }
        return n6b.Z(toaVarN.m(dVar.G(), this.a, 0L).m);
    }

    @Override // defpackage.s28
    public final void s() {
        f0(((d) this).G(), -9223372036854775807L, false);
    }

    @Override // defpackage.s28
    public final void w(long j) {
        f0(((d) this).G(), j, false);
    }

    @Override // defpackage.s28
    public final void x() {
        int iK;
        int iK2;
        d dVar = (d) this;
        if (dVar.N().p() || dVar.g()) {
            b0();
            return;
        }
        boolean zA0 = a0();
        if (d0() && !e0()) {
            if (!zA0) {
                b0();
                return;
            }
            toa toaVarN = dVar.N();
            if (toaVarN.p()) {
                iK2 = -1;
            } else {
                int iG = dVar.G();
                dVar.E0();
                int i = dVar.H;
                if (i == 1) {
                    i = 0;
                }
                dVar.E0();
                iK2 = toaVarN.k(iG, dVar.I, i);
            }
            if (iK2 == -1) {
                b0();
                return;
            } else if (iK2 == dVar.G()) {
                f0(dVar.G(), -9223372036854775807L, true);
                return;
            } else {
                f0(iK2, -9223372036854775807L, false);
                return;
            }
        }
        if (zA0) {
            long jX = dVar.X();
            dVar.E0();
            if (jX <= dVar.m0) {
                toa toaVarN2 = dVar.N();
                if (toaVarN2.p()) {
                    iK = -1;
                } else {
                    int iG2 = dVar.G();
                    dVar.E0();
                    int i2 = dVar.H;
                    if (i2 == 1) {
                        i2 = 0;
                    }
                    dVar.E0();
                    iK = toaVarN2.k(iG2, dVar.I, i2);
                }
                if (iK == -1) {
                    b0();
                    return;
                } else if (iK == dVar.G()) {
                    f0(dVar.G(), -9223372036854775807L, true);
                    return;
                } else {
                    f0(iK, -9223372036854775807L, false);
                    return;
                }
            }
        }
        f0(dVar.G(), 0L, false);
    }
}
