package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vr5 {
    public final qr5 a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public hf6 q;
    public qr5.d d = qr5.d.x;
    public final el6 p = new el6(this);

    public vr5(qr5 qr5Var) {
        this.a = qr5Var;
    }

    public final mb7 a() {
        return this.a.Y.d;
    }

    public final void b() {
        qr5.d dVar = this.a.Z.d;
        qr5.d dVar2 = qr5.d.v;
        qr5.d dVar3 = qr5.d.w;
        if (dVar == dVar2 || dVar == dVar3) {
            if (this.p.U) {
                g(true);
            } else {
                f(true);
            }
        }
        if (dVar == dVar3) {
            hf6 hf6Var = this.q;
            if (hf6Var == null || !hf6Var.O) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j) {
        hf6 hf6Var = this.q;
        if (hf6Var != null) {
            vr5 vr5Var = hf6Var.y;
            vr5Var.d = qr5.d.u;
            qr5 qr5Var = vr5Var.a;
            vr5Var.e = false;
            hf6Var.S = j;
            un7 snapshotObserver = ur5.a(qr5Var).getSnapshotObserver();
            hf6.d dVar = hf6Var.T;
            snapshotObserver.a.d(qr5Var, snapshotObserver.b, dVar);
            vr5Var.f = true;
            vr5Var.g = true;
            boolean zD = x10.d(qr5Var);
            el6 el6Var = vr5Var.p;
            if (zD) {
                el6Var.P = true;
                el6Var.Q = true;
            } else {
                el6Var.O = true;
            }
            vr5Var.d = qr5.d.x;
        }
    }

    public final void d(int i) {
        int i2 = this.l;
        this.l = i;
        if ((i2 == 0) != (i == 0)) {
            qr5 qr5VarI = this.a.I();
            vr5 vr5Var = qr5VarI != null ? qr5VarI.Z : null;
            if (vr5Var != null) {
                int i3 = vr5Var.l;
                if (i == 0) {
                    vr5Var.d(i3 - 1);
                } else {
                    vr5Var.d(i3 + 1);
                }
            }
        }
    }

    public final void e(int i) {
        int i2 = this.o;
        this.o = i;
        if ((i2 == 0) != (i == 0)) {
            qr5 qr5VarI = this.a.I();
            vr5 vr5Var = qr5VarI != null ? qr5VarI.Z : null;
            if (vr5Var != null) {
                int i3 = vr5Var.o;
                if (i == 0) {
                    vr5Var.e(i3 - 1);
                } else {
                    vr5Var.e(i3 + 1);
                }
            }
        }
    }

    public final void f(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.j) {
                d(this.l + 1);
            } else {
                if (z || this.j) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.k) {
                d(this.l + 1);
            } else {
                if (z || this.k) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z && !this.m) {
                e(this.o + 1);
            } else {
                if (z || this.m) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void i(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.n) {
                e(this.o + 1);
            } else {
                if (z || this.n) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void j() {
        el6 el6Var = this.p;
        vr5 vr5Var = el6Var.y;
        Object obj = el6Var.L;
        qr5 qr5Var = this.a;
        if ((obj != null || vr5Var.a().g() != null) && el6Var.K) {
            el6Var.K = false;
            el6Var.L = vr5Var.a().g();
            qr5 qr5VarI = qr5Var.I();
            if (qr5VarI != null) {
                qr5.g0(qr5VarI, false, 7);
            }
        }
        hf6 hf6Var = this.q;
        if (hf6Var != null) {
            vr5 vr5Var2 = hf6Var.y;
            if (hf6Var.R == null) {
                ff6 ff6VarE1 = vr5Var2.a().e1();
                ff6VarE1.getClass();
                if (ff6VarE1.H.g() == null) {
                    return;
                }
            }
            if (hf6Var.Q) {
                hf6Var.Q = false;
                ff6 ff6VarE2 = vr5Var2.a().e1();
                ff6VarE2.getClass();
                hf6Var.R = ff6VarE2.H.g();
                if (x10.d(qr5Var)) {
                    qr5 qr5VarI2 = qr5Var.I();
                    if (qr5VarI2 != null) {
                        qr5.g0(qr5VarI2, false, 7);
                        return;
                    }
                    return;
                }
                qr5 qr5VarI3 = qr5Var.I();
                if (qr5VarI3 != null) {
                    qr5.e0(qr5VarI3, false, 7);
                }
            }
        }
    }
}
