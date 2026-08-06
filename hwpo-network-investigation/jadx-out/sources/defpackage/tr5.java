package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tr5 implements d73, cz1 {
    public final s41 t = new s41();
    public a73 u;

    @Override // defpackage.tx2
    public final long A0(float f) {
        return this.t.A0(f);
    }

    @Override // defpackage.tx2
    public final float C1(long j) {
        return this.t.C1(j);
    }

    @Override // defpackage.d73
    public final void D(cu7 cu7Var, long j, e73 e73Var, wh1 wh1Var) {
        this.t.D(cu7Var, j, e73Var, wh1Var);
    }

    @Override // defpackage.tx2
    public final float F0(int i) {
        return this.t.F0(i);
    }

    @Override // defpackage.d73
    public final void H1(long j, long j2, long j3, float f, int i, int i2) {
        this.t.H1(j, j2, j3, f, i, i2);
    }

    @Override // defpackage.tx2
    public final float I0(float f) {
        return f / this.t.getDensity();
    }

    @Override // defpackage.d73
    public final void J1(fx0 fx0Var, long j, long j2, float f, e73 e73Var, wh1 wh1Var, int i) {
        this.t.J1(fx0Var, j, j2, f, e73Var, wh1Var, i);
    }

    @Override // defpackage.cz1
    public final void K1() {
        s41 s41Var = this.t;
        n41 n41VarA = s41Var.u.a();
        a73 a73Var = this.u;
        if (a73Var == null) {
            throw ik.a("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        ox6.c cVarB = a73Var.q().y;
        if (cVarB != null && (cVarB.w & 4) != 0) {
            while (true) {
                if (cVarB != null) {
                    int i = cVarB.v;
                    if ((i & 2) == 0) {
                        if ((i & 4) != 0) {
                            break;
                        } else {
                            cVarB = cVarB.y;
                        }
                    }
                }
                cVarB = null;
                break;
            }
        } else {
            cVarB = null;
            break;
        }
        if (cVarB == null) {
            mb7 mb7VarD = ew2.d(a73Var, 4);
            if (mb7VarD.g1() == a73Var.q()) {
                mb7VarD = mb7VarD.K;
                mb7VarD.getClass();
            }
            mb7VarD.S1(n41VarA, s41Var.u.b);
            return;
        }
        k37 k37Var = null;
        while (cVarB != null) {
            if (cVarB instanceof a73) {
                a73 a73Var2 = (a73) cVarB;
                ko4 ko4Var = s41Var.u.b;
                mb7 mb7VarD2 = ew2.d(a73Var2, 4);
                long jC = c43.c(mb7VarD2.v);
                qr5 qr5Var = mb7VarD2.H;
                qr5Var.getClass();
                ur5.a(qr5Var).getSharedDrawScope().e(n41VarA, jC, mb7VarD2, a73Var2, ko4Var);
            } else if ((cVarB.v & 4) != 0 && (cVarB instanceof gw2)) {
                int i2 = 0;
                for (ox6.c cVar = ((gw2) cVarB).I; cVar != null; cVar = cVar.y) {
                    if ((cVar.v & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            cVarB = cVar;
                        } else {
                            if (k37Var == null) {
                                k37Var = new k37(new ox6.c[16]);
                            }
                            if (cVarB != null) {
                                k37Var.d(cVarB);
                                cVarB = null;
                            }
                            k37Var.d(cVar);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            cVarB = ew2.b(k37Var);
        }
    }

    @Override // defpackage.d73
    public final void M1(long j, float f, float f2, long j2, long j3, e73 e73Var) {
        this.t.M1(j, f, f2, j2, j3, e73Var);
    }

    @Override // defpackage.tx2
    public final float N0() {
        return this.t.N0();
    }

    @Override // defpackage.tx2
    public final long O(float f) {
        return this.t.O(f);
    }

    @Override // defpackage.tx2
    public final long P(long j) {
        return this.t.P(j);
    }

    @Override // defpackage.d73
    public final void S0(long j, long j2, long j3, long j4, e73 e73Var) {
        this.t.S0(j, j2, j3, j4, e73Var);
    }

    @Override // defpackage.d73
    public final void T0(fx0 fx0Var, long j, long j2, float f, float f2) {
        this.t.T0(fx0Var, j, j2, f, f2);
    }

    @Override // defpackage.tx2
    public final float U0(float f) {
        return this.t.getDensity() * f;
    }

    @Override // defpackage.d73
    public final void X(long j, long j2, long j3, float f, e73 e73Var, int i) {
        this.t.X(j, j2, j3, f, e73Var, i);
    }

    @Override // defpackage.d73
    public final void Y(l75 l75Var, long j, long j2, long j3, long j4, float f, e73 e73Var, wh1 wh1Var, int i, int i2) {
        this.t.Y(l75Var, j, j2, j3, j4, f, e73Var, wh1Var, i, i2);
    }

    @Override // defpackage.d73
    public final s41.b Y0() {
        return this.t.u;
    }

    @Override // defpackage.d73
    public final long c() {
        return this.t.c();
    }

    @Override // defpackage.tx2
    public final float d0(long j) {
        return this.t.d0(j);
    }

    public final void e(n41 n41Var, long j, mb7 mb7Var, a73 a73Var, ko4 ko4Var) {
        a73 a73Var2 = this.u;
        this.u = a73Var;
        tq5 tq5Var = mb7Var.H.S;
        s41 s41Var = this.t;
        tx2 tx2VarB = s41Var.u.b();
        s41.b bVar = s41Var.u;
        tq5 tq5VarC = bVar.c();
        n41 n41VarA = bVar.a();
        long jD = bVar.d();
        ko4 ko4Var2 = bVar.b;
        bVar.f(mb7Var);
        bVar.g(tq5Var);
        bVar.e(n41Var);
        bVar.h(j);
        bVar.b = ko4Var;
        n41Var.f();
        try {
            a73Var.t(this);
            n41Var.o();
            bVar.f(tx2VarB);
            bVar.g(tq5VarC);
            bVar.e(n41VarA);
            bVar.h(jD);
            bVar.b = ko4Var2;
            this.u = a73Var2;
        } catch (Throwable th) {
            n41Var.o();
            bVar.f(tx2VarB);
            bVar.g(tq5VarC);
            bVar.e(n41VarA);
            bVar.h(jD);
            bVar.b = ko4Var2;
            throw th;
        }
    }

    @Override // defpackage.tx2
    public final float getDensity() {
        return this.t.getDensity();
    }

    @Override // defpackage.d73
    public final tq5 getLayoutDirection() {
        return this.t.t.b;
    }

    @Override // defpackage.d73
    public final void l1(l75 l75Var, long j, float f, e73 e73Var, wh1 wh1Var, int i) {
        this.t.l1(l75Var, j, f, e73Var, wh1Var, i);
    }

    @Override // defpackage.d73
    public final void m1(cu7 cu7Var, fx0 fx0Var, float f, e73 e73Var, wh1 wh1Var, int i) {
        this.t.m1(cu7Var, fx0Var, f, e73Var, wh1Var, i);
    }

    @Override // defpackage.tx2
    public final int n1(float f) {
        return this.t.n1(f);
    }

    @Override // defpackage.d73
    public final void r1(long j, float f, long j2, e73 e73Var, int i) {
        this.t.r1(j, f, j2, e73Var, i);
    }

    @Override // defpackage.d73
    public final long u1() {
        return this.t.u1();
    }

    @Override // defpackage.tx2
    public final long w0(int i) {
        return this.t.w0(i);
    }

    @Override // defpackage.d73
    public final void y1(fx0 fx0Var, long j, long j2, long j3, float f, e73 e73Var, wh1 wh1Var, int i) {
        this.t.y1(fx0Var, j, j2, j3, f, e73Var, wh1Var, i);
    }

    @Override // defpackage.tx2
    public final long z1(long j) {
        return this.t.z1(j);
    }
}
