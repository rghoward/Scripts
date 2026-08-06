package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cw4 extends dmb {
    @Override // defpackage.dmb, defpackage.by2
    public final void a(by2 by2Var) {
        rj0 rj0Var = (rj0) this.b;
        int i = rj0Var.t0;
        fy2 fy2Var = this.h;
        ArrayList arrayList = fy2Var.l;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            int i5 = ((fy2) obj).g;
            if (i3 == -1 || i5 < i3) {
                i3 = i5;
            }
            if (i2 < i5) {
                i2 = i5;
            }
        }
        if (i == 0 || i == 2) {
            fy2Var.d(i3 + rj0Var.v0);
        } else {
            fy2Var.d(i2 + rj0Var.v0);
        }
    }

    @Override // defpackage.dmb
    public final void d() {
        vx1 vx1Var = this.b;
        if (vx1Var instanceof rj0) {
            fy2 fy2Var = this.h;
            fy2Var.b = true;
            ArrayList arrayList = fy2Var.l;
            rj0 rj0Var = (rj0) vx1Var;
            int i = rj0Var.t0;
            boolean z = rj0Var.u0;
            int i2 = 0;
            if (i == 0) {
                fy2Var.e = fy2.a.w;
                while (i2 < rj0Var.s0) {
                    vx1 vx1Var2 = rj0Var.r0[i2];
                    if (z || vx1Var2.i0 != 8) {
                        fy2 fy2Var2 = vx1Var2.d.h;
                        fy2Var2.k.add(fy2Var);
                        arrayList.add(fy2Var2);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 1) {
                fy2Var.e = fy2.a.x;
                while (i2 < rj0Var.s0) {
                    vx1 vx1Var3 = rj0Var.r0[i2];
                    if (z || vx1Var3.i0 != 8) {
                        fy2 fy2Var3 = vx1Var3.d.i;
                        fy2Var3.k.add(fy2Var);
                        arrayList.add(fy2Var3);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 2) {
                fy2Var.e = fy2.a.y;
                while (i2 < rj0Var.s0) {
                    vx1 vx1Var4 = rj0Var.r0[i2];
                    if (z || vx1Var4.i0 != 8) {
                        fy2 fy2Var4 = vx1Var4.e.h;
                        fy2Var4.k.add(fy2Var);
                        arrayList.add(fy2Var4);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            fy2Var.e = fy2.a.z;
            while (i2 < rj0Var.s0) {
                vx1 vx1Var5 = rj0Var.r0[i2];
                if (z || vx1Var5.i0 != 8) {
                    fy2 fy2Var5 = vx1Var5.e.i;
                    fy2Var5.k.add(fy2Var);
                    arrayList.add(fy2Var5);
                }
                i2++;
            }
            m(this.b.e.h);
            m(this.b.e.i);
        }
    }

    @Override // defpackage.dmb
    public final void e() {
        vx1 vx1Var = this.b;
        if (vx1Var instanceof rj0) {
            int i = ((rj0) vx1Var).t0;
            fy2 fy2Var = this.h;
            if (i == 0 || i == 1) {
                vx1Var.a0 = fy2Var.g;
            } else {
                vx1Var.b0 = fy2Var.g;
            }
        }
    }

    @Override // defpackage.dmb
    public final void f() {
        this.c = null;
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
