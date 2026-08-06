package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class meb extends dmb {
    public fy2 k;
    public fl0 l;

    @Override // defpackage.dmb, defpackage.by2
    public final void a(by2 by2Var) {
        float f;
        float f2;
        float f3;
        int i;
        if (this.j.ordinal() == 3) {
            vx1 vx1Var = this.b;
            l(vx1Var.K, vx1Var.M, 1);
            return;
        }
        t03 t03Var = this.e;
        boolean z = t03Var.c;
        vx1.a aVar = vx1.a.v;
        if (z && !t03Var.j && this.d == aVar) {
            vx1 vx1Var2 = this.b;
            int i2 = vx1Var2.s;
            if (i2 == 2) {
                vx1 vx1Var3 = vx1Var2.V;
                if (vx1Var3 != null) {
                    t03 t03Var2 = vx1Var3.e.e;
                    if (t03Var2.j) {
                        t03Var.d((int) ((t03Var2.g * vx1Var2.z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                t03 t03Var3 = vx1Var2.d.e;
                if (t03Var3.j) {
                    int i3 = vx1Var2.Z;
                    if (i3 != -1) {
                        if (i3 == 0) {
                            f3 = t03Var3.g * vx1Var2.Y;
                            i = (int) (f3 + 0.5f);
                        } else if (i3 != 1) {
                            i = 0;
                        } else {
                            f = t03Var3.g;
                            f2 = vx1Var2.Y;
                        }
                        t03Var.d(i);
                    } else {
                        f = t03Var3.g;
                        f2 = vx1Var2.Y;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    t03Var.d(i);
                }
            }
        }
        fy2 fy2Var = this.h;
        boolean z2 = fy2Var.c;
        ArrayList arrayList = fy2Var.l;
        if (z2) {
            fy2 fy2Var2 = this.i;
            boolean z3 = fy2Var2.c;
            ArrayList arrayList2 = fy2Var2.l;
            if (z3) {
                if (fy2Var.j && fy2Var2.j && t03Var.j) {
                    return;
                }
                if (!t03Var.j && this.d == aVar) {
                    vx1 vx1Var4 = this.b;
                    if (vx1Var4.r == 0 && !vx1Var4.w()) {
                        fy2 fy2Var3 = (fy2) arrayList.get(0);
                        fy2 fy2Var4 = (fy2) arrayList2.get(0);
                        int i4 = fy2Var3.g + fy2Var.f;
                        int i5 = fy2Var4.g + fy2Var2.f;
                        fy2Var.d(i4);
                        fy2Var2.d(i5);
                        t03Var.d(i5 - i4);
                        return;
                    }
                }
                if (!t03Var.j && this.d == aVar && this.a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    fy2 fy2Var5 = (fy2) arrayList.get(0);
                    int i6 = (((fy2) arrayList2.get(0)).g + fy2Var2.f) - (fy2Var5.g + fy2Var.f);
                    int i7 = t03Var.m;
                    if (i6 < i7) {
                        t03Var.d(i6);
                    } else {
                        t03Var.d(i7);
                    }
                }
                if (t03Var.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    fy2 fy2Var6 = (fy2) arrayList.get(0);
                    fy2 fy2Var7 = (fy2) arrayList2.get(0);
                    int i8 = fy2Var6.g;
                    int i9 = fy2Var.f + i8;
                    int i10 = fy2Var7.g;
                    int i11 = fy2Var2.f + i10;
                    float f4 = this.b.g0;
                    if (fy2Var6 == fy2Var7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    fy2Var.d((int) ((((i10 - i8) - t03Var.g) * f4) + i8 + 0.5f));
                    fy2Var2.d(fy2Var.g + t03Var.g);
                }
            }
        }
    }

    @Override // defpackage.dmb
    public final void d() {
        vx1 vx1Var;
        vx1 vx1Var2;
        vx1 vx1Var3;
        vx1 vx1Var4;
        fy2 fy2Var = this.k;
        vx1 vx1Var5 = this.b;
        boolean z = vx1Var5.a;
        t03 t03Var = this.e;
        if (z) {
            t03Var.d(vx1Var5.i());
        }
        boolean z2 = t03Var.j;
        ArrayList arrayList = t03Var.k;
        ArrayList arrayList2 = t03Var.l;
        vx1.a aVar = vx1.a.w;
        vx1.a aVar2 = vx1.a.t;
        vx1.a aVar3 = vx1.a.v;
        fy2 fy2Var2 = this.i;
        fy2 fy2Var3 = this.h;
        if (!z2) {
            vx1 vx1Var6 = this.b;
            this.d = vx1Var6.U[1];
            if (vx1Var6.E) {
                this.l = new fl0(this);
            }
            vx1.a aVar4 = this.d;
            if (aVar4 != aVar3) {
                if (aVar4 == aVar && (vx1Var4 = this.b.V) != null && vx1Var4.U[1] == aVar2) {
                    int i = (vx1Var4.i() - this.b.K.d()) - this.b.M.d();
                    dmb.b(fy2Var3, vx1Var4.e.h, this.b.K.d());
                    dmb.b(fy2Var2, vx1Var4.e.i, -this.b.M.d());
                    t03Var.d(i);
                    return;
                }
                if (aVar4 == aVar2) {
                    t03Var.d(this.b.i());
                }
            }
        } else if (this.d == aVar && (vx1Var2 = (vx1Var = this.b).V) != null && vx1Var2.U[1] == aVar2) {
            dmb.b(fy2Var3, vx1Var2.e.h, vx1Var.K.d());
            dmb.b(fy2Var2, vx1Var2.e.i, -this.b.M.d());
            return;
        }
        boolean z3 = t03Var.j;
        if (z3) {
            vx1 vx1Var7 = this.b;
            if (vx1Var7.a) {
                sx1[] sx1VarArr = vx1Var7.R;
                sx1 sx1Var = sx1VarArr[2];
                sx1 sx1Var2 = sx1Var.f;
                if (sx1Var2 != null && sx1VarArr[3].f != null) {
                    boolean zW = vx1Var7.w();
                    vx1 vx1Var8 = this.b;
                    if (zW) {
                        fy2Var3.f = vx1Var8.R[2].d();
                        fy2Var2.f = -this.b.R[3].d();
                    } else {
                        fy2 fy2VarH = dmb.h(vx1Var8.R[2]);
                        if (fy2VarH != null) {
                            dmb.b(fy2Var3, fy2VarH, this.b.R[2].d());
                        }
                        fy2 fy2VarH2 = dmb.h(this.b.R[3]);
                        if (fy2VarH2 != null) {
                            dmb.b(fy2Var2, fy2VarH2, -this.b.R[3].d());
                        }
                        fy2Var3.b = true;
                        fy2Var2.b = true;
                    }
                    vx1 vx1Var9 = this.b;
                    if (vx1Var9.E) {
                        dmb.b(fy2Var, fy2Var3, vx1Var9.c0);
                        return;
                    }
                    return;
                }
                if (sx1Var2 != null) {
                    fy2 fy2VarH3 = dmb.h(sx1Var);
                    if (fy2VarH3 != null) {
                        dmb.b(fy2Var3, fy2VarH3, this.b.R[2].d());
                        dmb.b(fy2Var2, fy2Var3, t03Var.g);
                        vx1 vx1Var10 = this.b;
                        if (vx1Var10.E) {
                            dmb.b(fy2Var, fy2Var3, vx1Var10.c0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                sx1 sx1Var3 = sx1VarArr[3];
                if (sx1Var3.f != null) {
                    fy2 fy2VarH4 = dmb.h(sx1Var3);
                    if (fy2VarH4 != null) {
                        dmb.b(fy2Var2, fy2VarH4, -this.b.R[3].d());
                        dmb.b(fy2Var3, fy2Var2, -t03Var.g);
                    }
                    vx1 vx1Var11 = this.b;
                    if (vx1Var11.E) {
                        dmb.b(fy2Var, fy2Var3, vx1Var11.c0);
                        return;
                    }
                    return;
                }
                sx1 sx1Var4 = sx1VarArr[4];
                if (sx1Var4.f != null) {
                    fy2 fy2VarH5 = dmb.h(sx1Var4);
                    if (fy2VarH5 != null) {
                        dmb.b(fy2Var, fy2VarH5, 0);
                        dmb.b(fy2Var3, fy2Var, -this.b.c0);
                        dmb.b(fy2Var2, fy2Var3, t03Var.g);
                        return;
                    }
                    return;
                }
                if ((vx1Var7 instanceof dw4) || vx1Var7.V == null || vx1Var7.g(sx1.a.y).f != null) {
                    return;
                }
                vx1 vx1Var12 = this.b;
                dmb.b(fy2Var3, vx1Var12.V.e.h, vx1Var12.q());
                dmb.b(fy2Var2, fy2Var3, t03Var.g);
                vx1 vx1Var13 = this.b;
                if (vx1Var13.E) {
                    dmb.b(fy2Var, fy2Var3, vx1Var13.c0);
                    return;
                }
                return;
            }
        }
        if (z3 || this.d != aVar3) {
            t03Var.b(this);
        } else {
            vx1 vx1Var14 = this.b;
            int i2 = vx1Var14.s;
            if (i2 == 2) {
                vx1 vx1Var15 = vx1Var14.V;
                if (vx1Var15 != null) {
                    t03 t03Var2 = vx1Var15.e.e;
                    arrayList2.add(t03Var2);
                    t03Var2.k.add(t03Var);
                    t03Var.b = true;
                    arrayList.add(fy2Var3);
                    arrayList.add(fy2Var2);
                }
            } else if (i2 == 3 && !vx1Var14.w()) {
                vx1 vx1Var16 = this.b;
                if (vx1Var16.r != 3) {
                    t03 t03Var3 = vx1Var16.d.e;
                    arrayList2.add(t03Var3);
                    t03Var3.k.add(t03Var);
                    t03Var.b = true;
                    arrayList.add(fy2Var3);
                    arrayList.add(fy2Var2);
                }
            }
        }
        vx1 vx1Var17 = this.b;
        sx1[] sx1VarArr2 = vx1Var17.R;
        sx1 sx1Var5 = sx1VarArr2[2];
        sx1 sx1Var6 = sx1Var5.f;
        if (sx1Var6 != null && sx1VarArr2[3].f != null) {
            boolean zW2 = vx1Var17.w();
            vx1 vx1Var18 = this.b;
            if (zW2) {
                fy2Var3.f = vx1Var18.R[2].d();
                fy2Var2.f = -this.b.R[3].d();
            } else {
                fy2 fy2VarH6 = dmb.h(vx1Var18.R[2]);
                fy2 fy2VarH7 = dmb.h(this.b.R[3]);
                if (fy2VarH6 != null) {
                    fy2VarH6.b(this);
                }
                if (fy2VarH7 != null) {
                    fy2VarH7.b(this);
                }
                this.j = dmb.a.u;
            }
            if (this.b.E) {
                c(fy2Var, fy2Var3, 1, this.l);
            }
        } else if (sx1Var6 != null) {
            fy2 fy2VarH8 = dmb.h(sx1Var5);
            if (fy2VarH8 != null) {
                dmb.b(fy2Var3, fy2VarH8, this.b.R[2].d());
                c(fy2Var2, fy2Var3, 1, t03Var);
                if (this.b.E) {
                    c(fy2Var, fy2Var3, 1, this.l);
                }
                if (this.d == aVar3) {
                    vx1 vx1Var19 = this.b;
                    if (vx1Var19.Y > 0.0f) {
                        o15 o15Var = vx1Var19.d;
                        if (o15Var.d == aVar3) {
                            o15Var.e.k.add(t03Var);
                            arrayList2.add(this.b.d.e);
                            t03Var.a = this;
                        }
                    }
                }
            }
        } else {
            sx1 sx1Var7 = sx1VarArr2[3];
            if (sx1Var7.f != null) {
                fy2 fy2VarH9 = dmb.h(sx1Var7);
                if (fy2VarH9 != null) {
                    dmb.b(fy2Var2, fy2VarH9, -this.b.R[3].d());
                    c(fy2Var3, fy2Var2, -1, t03Var);
                    if (this.b.E) {
                        c(fy2Var, fy2Var3, 1, this.l);
                    }
                }
            } else {
                sx1 sx1Var8 = sx1VarArr2[4];
                if (sx1Var8.f != null) {
                    fy2 fy2VarH10 = dmb.h(sx1Var8);
                    if (fy2VarH10 != null) {
                        dmb.b(fy2Var, fy2VarH10, 0);
                        c(fy2Var3, fy2Var, -1, this.l);
                        c(fy2Var2, fy2Var3, 1, t03Var);
                    }
                } else if (!(vx1Var17 instanceof dw4) && (vx1Var3 = vx1Var17.V) != null) {
                    dmb.b(fy2Var3, vx1Var3.e.h, vx1Var17.q());
                    c(fy2Var2, fy2Var3, 1, t03Var);
                    if (this.b.E) {
                        c(fy2Var, fy2Var3, 1, this.l);
                    }
                    if (this.d == aVar3) {
                        vx1 vx1Var20 = this.b;
                        if (vx1Var20.Y > 0.0f) {
                            o15 o15Var2 = vx1Var20.d;
                            if (o15Var2.d == aVar3) {
                                o15Var2.e.k.add(t03Var);
                                arrayList2.add(this.b.d.e);
                                t03Var.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            t03Var.c = true;
        }
    }

    @Override // defpackage.dmb
    public final void e() {
        fy2 fy2Var = this.h;
        if (fy2Var.j) {
            this.b.b0 = fy2Var.g;
        }
    }

    @Override // defpackage.dmb
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.dmb
    public final boolean k() {
        return this.d != vx1.a.v || this.b.s == 0;
    }

    public final void m() {
        this.g = false;
        fy2 fy2Var = this.h;
        fy2Var.c();
        fy2Var.j = false;
        fy2 fy2Var2 = this.i;
        fy2Var2.c();
        fy2Var2.j = false;
        fy2 fy2Var3 = this.k;
        fy2Var3.c();
        fy2Var3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.j0;
    }
}
