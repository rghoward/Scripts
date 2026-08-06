package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wp4 extends dmb {
    @Override // defpackage.dmb, defpackage.by2
    public final void a(by2 by2Var) {
        fy2 fy2Var = this.h;
        if (fy2Var.c && !fy2Var.j) {
            fy2Var.d((int) ((((fy2) fy2Var.l.get(0)).g * ((vp4) this.b).r0) + 0.5f));
        }
    }

    @Override // defpackage.dmb
    public final void d() {
        vx1 vx1Var = this.b;
        vp4 vp4Var = (vp4) vx1Var;
        int i = vp4Var.s0;
        int i2 = vp4Var.t0;
        int i3 = vp4Var.v0;
        fy2 fy2Var = this.h;
        if (i3 == 1) {
            if (i != -1) {
                fy2Var.l.add(vx1Var.V.d.h);
                this.b.V.d.h.k.add(fy2Var);
                fy2Var.f = i;
            } else if (i2 != -1) {
                fy2Var.l.add(vx1Var.V.d.i);
                this.b.V.d.i.k.add(fy2Var);
                fy2Var.f = -i2;
            } else {
                fy2Var.b = true;
                fy2Var.l.add(vx1Var.V.d.i);
                this.b.V.d.i.k.add(fy2Var);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            fy2Var.l.add(vx1Var.V.e.h);
            this.b.V.e.h.k.add(fy2Var);
            fy2Var.f = i;
        } else if (i2 != -1) {
            fy2Var.l.add(vx1Var.V.e.i);
            this.b.V.e.i.k.add(fy2Var);
            fy2Var.f = -i2;
        } else {
            fy2Var.b = true;
            fy2Var.l.add(vx1Var.V.e.i);
            this.b.V.e.i.k.add(fy2Var);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    @Override // defpackage.dmb
    public final void e() {
        vx1 vx1Var = this.b;
        int i = ((vp4) vx1Var).v0;
        fy2 fy2Var = this.h;
        if (i == 1) {
            vx1Var.a0 = fy2Var.g;
        } else {
            vx1Var.b0 = fy2Var.g;
        }
    }

    @Override // defpackage.dmb
    public final void f() {
        this.h.c();
    }

    @Override // defpackage.dmb
    public final boolean k() {
        return false;
    }

    public final void m(fy2 fy2Var) {
        fy2 fy2Var2 = this.h;
        fy2Var2.k.add(fy2Var);
        fy2Var.l.add(fy2Var2);
    }
}
