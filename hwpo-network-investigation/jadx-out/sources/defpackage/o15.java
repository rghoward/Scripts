package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o15 extends dmb {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x026a  */
    /* JADX WARN: Code duplicated, block: B:118:0x027a  */
    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    @Override // defpackage.dmb, defpackage.by2
    public final void a(by2 by2Var) {
        float f;
        int iG;
        int i;
        int iG2;
        float f2;
        float f3;
        float f4;
        int i2;
        if (this.j.ordinal() == 3) {
            vx1 vx1Var = this.b;
            l(vx1Var.J, vx1Var.L, 0);
            return;
        }
        t03 t03Var = this.e;
        boolean z = t03Var.j;
        vx1.a aVar = vx1.a.v;
        fy2 fy2Var = this.h;
        fy2 fy2Var2 = this.i;
        if (z || this.d != aVar) {
            f = 0.5f;
        } else {
            vx1 vx1Var2 = this.b;
            int i3 = vx1Var2.r;
            if (i3 == 2) {
                f = 0.5f;
                vx1 vx1Var3 = vx1Var2.V;
                if (vx1Var3 != null) {
                    t03 t03Var2 = vx1Var3.d.e;
                    if (t03Var2.j) {
                        t03Var.d((int) ((t03Var2.g * vx1Var2.w) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = vx1Var2.s;
                if (i4 == 0 || i4 == 3) {
                    meb mebVar = vx1Var2.e;
                    fy2 fy2Var3 = mebVar.h;
                    fy2 fy2Var4 = mebVar.i;
                    boolean z2 = vx1Var2.J.f != null;
                    boolean z3 = vx1Var2.K.f != null;
                    boolean z4 = vx1Var2.L.f != null;
                    boolean z5 = vx1Var2.M.f != null;
                    f = 0.5f;
                    int i5 = vx1Var2.Z;
                    if (z2 && z3 && z4 && z5) {
                        float f5 = vx1Var2.Y;
                        boolean z6 = fy2Var3.j;
                        ArrayList arrayList = fy2Var3.l;
                        int[] iArr = k;
                        if (z6 && fy2Var4.j) {
                            if (fy2Var.c && fy2Var2.c) {
                                m(iArr, ((fy2) fy2Var.l.get(0)).g + fy2Var.f, ((fy2) fy2Var2.l.get(0)).g - fy2Var2.f, fy2Var3.g + fy2Var3.f, fy2Var4.g - fy2Var4.f, f5, i5);
                                t03Var.d(iArr[0]);
                                this.b.e.e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (fy2Var.j && fy2Var2.j) {
                            if (!fy2Var3.c || !fy2Var4.c) {
                                return;
                            }
                            m(iArr, fy2Var.g + fy2Var.f, fy2Var2.g - fy2Var2.f, ((fy2) arrayList.get(0)).g + fy2Var3.f, ((fy2) fy2Var4.l.get(0)).g - fy2Var4.f, f5, i5);
                            t03Var.d(iArr[0]);
                            this.b.e.e.d(iArr[1]);
                        }
                        if (!fy2Var.c || !fy2Var2.c || !fy2Var3.c || !fy2Var4.c) {
                            return;
                        }
                        m(iArr, ((fy2) fy2Var.l.get(0)).g + fy2Var.f, ((fy2) fy2Var2.l.get(0)).g - fy2Var2.f, ((fy2) arrayList.get(0)).g + fy2Var3.f, ((fy2) fy2Var4.l.get(0)).g - fy2Var4.f, f5, i5);
                        t03Var.d(iArr[0]);
                        this.b.e.e.d(iArr[1]);
                    } else if (z2 && z4) {
                        if (!fy2Var.c || !fy2Var2.c) {
                            return;
                        }
                        float f6 = vx1Var2.Y;
                        int i6 = ((fy2) fy2Var.l.get(0)).g + fy2Var.f;
                        int i7 = ((fy2) fy2Var2.l.get(0)).g - fy2Var2.f;
                        if (i5 == -1 || i5 == 0) {
                            int iG3 = g(i7 - i6, 0);
                            int i8 = (int) ((iG3 * f6) + 0.5f);
                            int iG4 = g(i8, 1);
                            if (i8 != iG4) {
                                iG3 = (int) ((iG4 / f6) + 0.5f);
                            }
                            t03Var.d(iG3);
                            this.b.e.e.d(iG4);
                        } else if (i5 == 1) {
                            int iG5 = g(i7 - i6, 0);
                            int i9 = (int) ((iG5 / f6) + 0.5f);
                            int iG6 = g(i9, 1);
                            if (i9 != iG6) {
                                iG5 = (int) ((iG6 * f6) + 0.5f);
                            }
                            t03Var.d(iG5);
                            this.b.e.e.d(iG6);
                        }
                    } else if (z3 && z5) {
                        if (!fy2Var3.c || !fy2Var4.c) {
                            return;
                        }
                        float f7 = vx1Var2.Y;
                        int i10 = ((fy2) fy2Var3.l.get(0)).g + fy2Var3.f;
                        int i11 = ((fy2) fy2Var4.l.get(0)).g - fy2Var4.f;
                        if (i5 == -1) {
                            iG = g(i11 - i10, 1);
                            i = (int) ((iG / f7) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * f7) + 0.5f);
                            }
                            t03Var.d(iG2);
                            this.b.e.e.d(iG);
                        } else if (i5 == 0) {
                            int iG7 = g(i11 - i10, 1);
                            int i12 = (int) ((iG7 * f7) + 0.5f);
                            int iG8 = g(i12, 0);
                            if (i12 != iG8) {
                                iG7 = (int) ((iG8 / f7) + 0.5f);
                            }
                            t03Var.d(iG8);
                            this.b.e.e.d(iG7);
                        } else if (i5 == 1) {
                            iG = g(i11 - i10, 1);
                            i = (int) ((iG / f7) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * f7) + 0.5f);
                            }
                            t03Var.d(iG2);
                            this.b.e.e.d(iG);
                        }
                    }
                } else {
                    int i13 = vx1Var2.Z;
                    if (i13 != -1) {
                        if (i13 == 0) {
                            f4 = vx1Var2.e.e.g / vx1Var2.Y;
                            i2 = (int) (f4 + 0.5f);
                        } else if (i13 != 1) {
                            i2 = 0;
                        } else {
                            f2 = vx1Var2.e.e.g;
                            f3 = vx1Var2.Y;
                        }
                        t03Var.d(i2);
                        f = 0.5f;
                    } else {
                        f2 = vx1Var2.e.e.g;
                        f3 = vx1Var2.Y;
                    }
                    f4 = f2 * f3;
                    i2 = (int) (f4 + 0.5f);
                    t03Var.d(i2);
                    f = 0.5f;
                }
            } else {
                f = 0.5f;
            }
        }
        boolean z7 = fy2Var.c;
        ArrayList arrayList2 = fy2Var.l;
        if (z7) {
            boolean z8 = fy2Var2.c;
            ArrayList arrayList3 = fy2Var2.l;
            if (z8) {
                if (fy2Var.j && fy2Var2.j && t03Var.j) {
                    return;
                }
                if (!t03Var.j && this.d == aVar) {
                    vx1 vx1Var4 = this.b;
                    if (vx1Var4.r == 0 && !vx1Var4.v()) {
                        fy2 fy2Var5 = (fy2) arrayList2.get(0);
                        fy2 fy2Var6 = (fy2) arrayList3.get(0);
                        int i14 = fy2Var5.g + fy2Var.f;
                        int i15 = fy2Var6.g + fy2Var2.f;
                        fy2Var.d(i14);
                        fy2Var2.d(i15);
                        t03Var.d(i15 - i14);
                        return;
                    }
                }
                if (!t03Var.j && this.d == aVar && this.a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((fy2) arrayList3.get(0)).g + fy2Var2.f) - (((fy2) arrayList2.get(0)).g + fy2Var.f), t03Var.m);
                    vx1 vx1Var5 = this.b;
                    int i16 = vx1Var5.v;
                    int iMax = Math.max(vx1Var5.u, iMin);
                    if (i16 > 0) {
                        iMax = Math.min(i16, iMax);
                    }
                    t03Var.d(iMax);
                }
                if (t03Var.j) {
                    fy2 fy2Var7 = (fy2) arrayList2.get(0);
                    fy2 fy2Var8 = (fy2) arrayList3.get(0);
                    int i17 = fy2Var7.g;
                    int i18 = fy2Var.f + i17;
                    int i19 = fy2Var8.g;
                    int i20 = fy2Var2.f + i19;
                    float f8 = this.b.f0;
                    if (fy2Var7 == fy2Var8) {
                        f8 = f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    fy2Var.d((int) ((((i19 - i17) - t03Var.g) * f8) + i17 + f));
                    fy2Var2.d(fy2Var.g + t03Var.g);
                }
            }
        }
    }

    @Override // defpackage.dmb
    public final void d() {
        vx1 vx1Var;
        vx1 vx1Var2;
        vx1.a aVar;
        vx1 vx1Var3;
        vx1 vx1Var4;
        vx1.a aVar2;
        vx1 vx1Var5 = this.b;
        boolean z = vx1Var5.a;
        t03 t03Var = this.e;
        if (z) {
            t03Var.d(vx1Var5.o());
        }
        boolean z2 = t03Var.j;
        ArrayList arrayList = t03Var.k;
        ArrayList arrayList2 = t03Var.l;
        vx1.a aVar3 = vx1.a.w;
        vx1.a aVar4 = vx1.a.v;
        vx1.a aVar5 = vx1.a.t;
        fy2 fy2Var = this.i;
        fy2 fy2Var2 = this.h;
        if (!z2) {
            vx1 vx1Var6 = this.b;
            vx1.a aVar6 = vx1Var6.U[0];
            this.d = aVar6;
            if (aVar6 != aVar4) {
                if (aVar6 == aVar3 && (vx1Var4 = vx1Var6.V) != null && ((aVar2 = vx1Var4.U[0]) == aVar5 || aVar2 == aVar3)) {
                    int iO = (vx1Var4.o() - this.b.J.d()) - this.b.L.d();
                    dmb.b(fy2Var2, vx1Var4.d.h, this.b.J.d());
                    dmb.b(fy2Var, vx1Var4.d.i, -this.b.L.d());
                    t03Var.d(iO);
                    return;
                }
                if (aVar6 == aVar5) {
                    t03Var.d(vx1Var6.o());
                }
            }
        } else if (this.d == aVar3 && (vx1Var2 = (vx1Var = this.b).V) != null && ((aVar = vx1Var2.U[0]) == aVar5 || aVar == aVar3)) {
            dmb.b(fy2Var2, vx1Var2.d.h, vx1Var.J.d());
            dmb.b(fy2Var, vx1Var2.d.i, -this.b.L.d());
            return;
        }
        if (t03Var.j) {
            vx1 vx1Var7 = this.b;
            if (vx1Var7.a) {
                sx1[] sx1VarArr = vx1Var7.R;
                sx1 sx1Var = sx1VarArr[0];
                sx1 sx1Var2 = sx1Var.f;
                if (sx1Var2 != null && sx1VarArr[1].f != null) {
                    boolean zV = vx1Var7.v();
                    vx1 vx1Var8 = this.b;
                    if (zV) {
                        fy2Var2.f = vx1Var8.R[0].d();
                        fy2Var.f = -this.b.R[1].d();
                        return;
                    }
                    fy2 fy2VarH = dmb.h(vx1Var8.R[0]);
                    if (fy2VarH != null) {
                        dmb.b(fy2Var2, fy2VarH, this.b.R[0].d());
                    }
                    fy2 fy2VarH2 = dmb.h(this.b.R[1]);
                    if (fy2VarH2 != null) {
                        dmb.b(fy2Var, fy2VarH2, -this.b.R[1].d());
                    }
                    fy2Var2.b = true;
                    fy2Var.b = true;
                    return;
                }
                if (sx1Var2 != null) {
                    fy2 fy2VarH3 = dmb.h(sx1Var);
                    if (fy2VarH3 != null) {
                        dmb.b(fy2Var2, fy2VarH3, this.b.R[0].d());
                        dmb.b(fy2Var, fy2Var2, t03Var.g);
                        return;
                    }
                    return;
                }
                sx1 sx1Var3 = sx1VarArr[1];
                if (sx1Var3.f != null) {
                    fy2 fy2VarH4 = dmb.h(sx1Var3);
                    if (fy2VarH4 != null) {
                        dmb.b(fy2Var, fy2VarH4, -this.b.R[1].d());
                        dmb.b(fy2Var2, fy2Var, -t03Var.g);
                        return;
                    }
                    return;
                }
                if ((vx1Var7 instanceof dw4) || vx1Var7.V == null || vx1Var7.g(sx1.a.y).f != null) {
                    return;
                }
                vx1 vx1Var9 = this.b;
                dmb.b(fy2Var2, vx1Var9.V.d.h, vx1Var9.p());
                dmb.b(fy2Var, fy2Var2, t03Var.g);
                return;
            }
        }
        if (this.d == aVar4) {
            vx1 vx1Var10 = this.b;
            int i = vx1Var10.r;
            if (i == 2) {
                vx1 vx1Var11 = vx1Var10.V;
                if (vx1Var11 != null) {
                    t03 t03Var2 = vx1Var11.e.e;
                    arrayList2.add(t03Var2);
                    t03Var2.k.add(t03Var);
                    t03Var.b = true;
                    arrayList.add(fy2Var2);
                    arrayList.add(fy2Var);
                }
            } else if (i == 3) {
                if (vx1Var10.s == 3) {
                    fy2Var2.a = this;
                    fy2Var.a = this;
                    meb mebVar = vx1Var10.e;
                    mebVar.h.a = this;
                    mebVar.i.a = this;
                    t03Var.a = this;
                    if (vx1Var10.w()) {
                        arrayList2.add(this.b.e.e);
                        this.b.e.e.k.add(t03Var);
                        meb mebVar2 = this.b.e;
                        mebVar2.e.a = this;
                        arrayList2.add(mebVar2.h);
                        arrayList2.add(this.b.e.i);
                        this.b.e.h.k.add(t03Var);
                        this.b.e.i.k.add(t03Var);
                    } else {
                        boolean zV2 = this.b.v();
                        vx1 vx1Var12 = this.b;
                        if (zV2) {
                            vx1Var12.e.e.l.add(t03Var);
                            arrayList.add(this.b.e.e);
                        } else {
                            vx1Var12.e.e.l.add(t03Var);
                        }
                    }
                } else {
                    t03 t03Var3 = vx1Var10.e.e;
                    arrayList2.add(t03Var3);
                    t03Var3.k.add(t03Var);
                    this.b.e.h.k.add(t03Var);
                    this.b.e.i.k.add(t03Var);
                    t03Var.b = true;
                    arrayList.add(fy2Var2);
                    arrayList.add(fy2Var);
                    fy2Var2.l.add(t03Var);
                    fy2Var.l.add(t03Var);
                }
            }
        }
        vx1 vx1Var13 = this.b;
        sx1[] sx1VarArr2 = vx1Var13.R;
        sx1 sx1Var4 = sx1VarArr2[0];
        sx1 sx1Var5 = sx1Var4.f;
        if (sx1Var5 != null && sx1VarArr2[1].f != null) {
            boolean zV3 = vx1Var13.v();
            vx1 vx1Var14 = this.b;
            if (zV3) {
                fy2Var2.f = vx1Var14.R[0].d();
                fy2Var.f = -this.b.R[1].d();
                return;
            }
            fy2 fy2VarH5 = dmb.h(vx1Var14.R[0]);
            fy2 fy2VarH6 = dmb.h(this.b.R[1]);
            if (fy2VarH5 != null) {
                fy2VarH5.b(this);
            }
            if (fy2VarH6 != null) {
                fy2VarH6.b(this);
            }
            this.j = dmb.a.u;
            return;
        }
        if (sx1Var5 != null) {
            fy2 fy2VarH7 = dmb.h(sx1Var4);
            if (fy2VarH7 != null) {
                dmb.b(fy2Var2, fy2VarH7, this.b.R[0].d());
                c(fy2Var, fy2Var2, 1, t03Var);
                return;
            }
            return;
        }
        sx1 sx1Var6 = sx1VarArr2[1];
        if (sx1Var6.f != null) {
            fy2 fy2VarH8 = dmb.h(sx1Var6);
            if (fy2VarH8 != null) {
                dmb.b(fy2Var, fy2VarH8, -this.b.R[1].d());
                c(fy2Var2, fy2Var, -1, t03Var);
                return;
            }
            return;
        }
        if ((vx1Var13 instanceof dw4) || (vx1Var3 = vx1Var13.V) == null) {
            return;
        }
        dmb.b(fy2Var2, vx1Var3.d.h, vx1Var13.p());
        c(fy2Var, fy2Var2, 1, t03Var);
    }

    @Override // defpackage.dmb
    public final void e() {
        fy2 fy2Var = this.h;
        if (fy2Var.j) {
            this.b.a0 = fy2Var.g;
        }
    }

    @Override // defpackage.dmb
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.dmb
    public final boolean k() {
        return this.d != vx1.a.v || this.b.r == 0;
    }

    public final void n() {
        this.g = false;
        fy2 fy2Var = this.h;
        fy2Var.c();
        fy2Var.j = false;
        fy2 fy2Var2 = this.i;
        fy2Var2.c();
        fy2Var2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.j0;
    }
}
