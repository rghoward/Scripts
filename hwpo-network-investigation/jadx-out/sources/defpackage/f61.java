package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class f61 extends dmb {
    public final ArrayList<dmb> k;
    public int l;

    public f61(vx1 vx1Var, int i) {
        vx1 vx1Var2;
        super(vx1Var);
        ArrayList<dmb> arrayList = new ArrayList<>();
        this.k = arrayList;
        this.f = i;
        vx1 vx1Var3 = this.b;
        vx1 vx1VarK = vx1Var3.k(i);
        while (true) {
            vx1Var2 = vx1Var3;
            vx1Var3 = vx1VarK;
            if (vx1Var3 == null) {
                break;
            } else {
                vx1VarK = vx1Var3.k(this.f);
            }
        }
        this.b = vx1Var2;
        int i2 = this.f;
        arrayList.add(i2 == 0 ? vx1Var2.d : i2 == 1 ? vx1Var2.e : null);
        vx1 vx1VarJ = vx1Var2.j(this.f);
        while (vx1VarJ != null) {
            int i3 = this.f;
            arrayList.add(i3 == 0 ? vx1VarJ.d : i3 == 1 ? vx1VarJ.e : null);
            vx1VarJ = vx1VarJ.j(this.f);
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            dmb dmbVar = arrayList.get(i4);
            i4++;
            dmb dmbVar2 = dmbVar;
            int i5 = this.f;
            if (i5 == 0) {
                dmbVar2.b.b = this;
            } else if (i5 == 1) {
                dmbVar2.b.c = this;
            }
        }
        if (this.f == 0 && ((wx1) this.b.V).w0 && arrayList.size() > 1) {
            this.b = ((dmb) p51.b(1, arrayList)).b;
        }
        int i6 = this.f;
        vx1 vx1Var4 = this.b;
        this.l = i6 == 0 ? vx1Var4.k0 : vx1Var4.l0;
    }

    /* JADX WARN: Code duplicated, block: B:293:0x00ee A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e6 A[ADDED_TO_REGION] */
    @Override // defpackage.dmb, defpackage.by2
    public final void a(by2 by2Var) {
        int i;
        int i2;
        vx1.a aVar;
        boolean z;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f3;
        fy2 fy2Var = this.h;
        if (fy2Var.j) {
            fy2 fy2Var2 = this.i;
            if (fy2Var2.j) {
                vx1 vx1Var = this.b.V;
                boolean z2 = vx1Var instanceof wx1 ? ((wx1) vx1Var).w0 : false;
                int i13 = fy2Var2.g - fy2Var.g;
                ArrayList<dmb> arrayList = this.k;
                int size = arrayList.size();
                int i14 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i14 >= size) {
                        i14 = -1;
                        break;
                    } else if (arrayList.get(i14).b.i0 != 8) {
                        break;
                    } else {
                        i14++;
                    }
                }
                int i15 = size - 1;
                for (int i16 = i15; i16 >= 0; i16--) {
                    if (arrayList.get(i16).b.i0 != 8) {
                        i = i16;
                        break;
                    }
                }
                int i17 = 0;
                while (true) {
                    aVar = vx1.a.v;
                    if (i17 >= 2) {
                        z = z2;
                        f = 0.0f;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        break;
                    }
                    f = 0.0f;
                    int i18 = 0;
                    i5 = 0;
                    int i19 = 0;
                    int i20 = 0;
                    while (i18 < size) {
                        dmb dmbVar = arrayList.get(i18);
                        boolean z3 = z2;
                        vx1 vx1Var2 = dmbVar.b;
                        int i21 = i17;
                        if (vx1Var2.i0 != i2) {
                            i20++;
                            if (i18 > 0 && i18 >= i14) {
                                i5 += dmbVar.h.f;
                            }
                            t03 t03Var = dmbVar.e;
                            int i22 = t03Var.g;
                            boolean z4 = dmbVar.d != aVar;
                            if (z4) {
                                int i23 = this.f;
                                if (i23 == 0 && !vx1Var2.d.e.j) {
                                    return;
                                }
                                if (i23 == 1 && !vx1Var2.e.e.j) {
                                    return;
                                } else {
                                    i11 = i5;
                                }
                            } else {
                                i11 = i5;
                                if (dmbVar.a == 1 && i21 == 0) {
                                    i12 = t03Var.m;
                                    i19++;
                                } else {
                                    if (t03Var.j) {
                                        i12 = i22;
                                    }
                                    if (z4) {
                                        i5 = i11 + i12;
                                    } else {
                                        i19++;
                                        f3 = vx1Var2.m0[this.f];
                                        if (f3 >= 0.0f) {
                                            f += f3;
                                        }
                                        i5 = i11;
                                    }
                                    if (i18 >= i15 && i18 < i) {
                                        i5 += -dmbVar.i.f;
                                    }
                                }
                                z4 = true;
                                if (z4) {
                                    i19++;
                                    f3 = vx1Var2.m0[this.f];
                                    if (f3 >= 0.0f) {
                                        f += f3;
                                    }
                                    i5 = i11;
                                } else {
                                    i5 = i11 + i12;
                                }
                                if (i18 >= i15) {
                                }
                            }
                            i12 = i22;
                            if (z4) {
                                i19++;
                                f3 = vx1Var2.m0[this.f];
                                if (f3 >= 0.0f) {
                                    f += f3;
                                }
                                i5 = i11;
                            } else {
                                i5 = i11 + i12;
                            }
                            if (i18 >= i15) {
                            }
                        }
                        i18++;
                        z2 = z3;
                        i17 = i21;
                        i2 = 8;
                    }
                    z = z2;
                    int i24 = i17;
                    if (i5 < i13 || i19 == 0) {
                        i3 = i19;
                        i4 = i20;
                        break;
                    } else {
                        i17 = i24 + 1;
                        z2 = z;
                        i2 = 8;
                    }
                }
                int i25 = fy2Var.g;
                if (z) {
                    i25 = fy2Var2.g;
                }
                float f4 = 0.5f;
                if (i5 > i13) {
                    i25 = z ? i25 + ((int) (((i5 - i13) / 2.0f) + 0.5f)) : i25 - ((int) (((i5 - i13) / 2.0f) + 0.5f));
                }
                if (i3 > 0) {
                    float f5 = i13 - i5;
                    int i26 = (int) ((f5 / i3) + 0.5f);
                    int i27 = 0;
                    int i28 = 0;
                    while (i27 < size) {
                        float f6 = f4;
                        dmb dmbVar2 = arrayList.get(i27);
                        int i29 = i25;
                        vx1 vx1Var3 = dmbVar2.b;
                        int i30 = i3;
                        t03 t03Var2 = dmbVar2.e;
                        float f7 = f5;
                        int i31 = i26;
                        if (vx1Var3.i0 != 8 && dmbVar2.d == aVar && !t03Var2.j) {
                            int i32 = f > 0.0f ? (int) (((vx1Var3.m0[this.f] * f7) / f) + f6) : i31;
                            if (this.f == 0) {
                                i9 = vx1Var3.v;
                                i10 = vx1Var3.u;
                            } else {
                                i9 = vx1Var3.y;
                                i10 = vx1Var3.x;
                            }
                            int iMax = Math.max(i10, dmbVar2.a == 1 ? Math.min(i32, t03Var2.m) : i32);
                            if (i9 > 0) {
                                iMax = Math.min(i9, iMax);
                            }
                            if (iMax != i32) {
                                i28++;
                                i32 = iMax;
                            }
                            t03Var2.d(i32);
                        }
                        i27++;
                        i25 = i29;
                        f4 = f6;
                        i3 = i30;
                        f5 = f7;
                        i26 = i31;
                    }
                    i6 = i25;
                    f2 = f4;
                    int i33 = i3;
                    if (i28 > 0) {
                        i3 = i33 - i28;
                        i5 = 0;
                        for (int i34 = 0; i34 < size; i34++) {
                            dmb dmbVar3 = arrayList.get(i34);
                            if (dmbVar3.b.i0 != 8) {
                                if (i34 > 0 && i34 >= i14) {
                                    i5 += dmbVar3.h.f;
                                }
                                i5 += dmbVar3.e.g;
                                if (i34 < i15 && i34 < i) {
                                    i5 += -dmbVar3.i.f;
                                }
                            }
                        }
                    } else {
                        i3 = i33;
                    }
                    i8 = 2;
                    if (this.l == 2 && i28 == 0) {
                        i7 = 0;
                        this.l = 0;
                    } else {
                        i7 = 0;
                    }
                } else {
                    i6 = i25;
                    f2 = 0.5f;
                    i7 = 0;
                    i8 = 2;
                }
                if (i5 > i13) {
                    this.l = i8;
                }
                if (i4 > 0 && i3 == 0 && i14 == i) {
                    this.l = i8;
                }
                int i35 = this.l;
                if (i35 == 1) {
                    int i36 = i4 > 1 ? (i13 - i5) / (i4 - 1) : i4 == 1 ? (i13 - i5) / 2 : i7;
                    if (i3 > 0) {
                        i36 = i7;
                    }
                    int i37 = i6;
                    for (int i38 = i7; i38 < size; i38++) {
                        dmb dmbVar4 = arrayList.get(z ? size - (i38 + 1) : i38);
                        vx1 vx1Var4 = dmbVar4.b;
                        fy2 fy2Var3 = dmbVar4.i;
                        fy2 fy2Var4 = dmbVar4.h;
                        if (vx1Var4.i0 == 8) {
                            fy2Var4.d(i37);
                            fy2Var3.d(i37);
                        } else {
                            if (i38 > 0) {
                                i37 = z ? i37 - i36 : i37 + i36;
                            }
                            if (i38 > 0 && i38 >= i14) {
                                i37 = z ? i37 - fy2Var4.f : i37 + fy2Var4.f;
                            }
                            if (z) {
                                fy2Var3.d(i37);
                            } else {
                                fy2Var4.d(i37);
                            }
                            t03 t03Var3 = dmbVar4.e;
                            int i39 = t03Var3.g;
                            if (dmbVar4.d == aVar && dmbVar4.a == 1) {
                                i39 = t03Var3.m;
                            }
                            i37 = z ? i37 - i39 : i37 + i39;
                            if (z) {
                                fy2Var4.d(i37);
                            } else {
                                fy2Var3.d(i37);
                            }
                            dmbVar4.g = true;
                            if (i38 < i15 && i38 < i) {
                                i37 = z ? i37 - (-fy2Var3.f) : i37 + (-fy2Var3.f);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 0) {
                    int i40 = (i13 - i5) / (i4 + 1);
                    if (i3 > 0) {
                        i40 = i7;
                    }
                    int i41 = i6;
                    for (int i42 = i7; i42 < size; i42++) {
                        dmb dmbVar5 = arrayList.get(z ? size - (i42 + 1) : i42);
                        vx1 vx1Var5 = dmbVar5.b;
                        fy2 fy2Var5 = dmbVar5.i;
                        fy2 fy2Var6 = dmbVar5.h;
                        if (vx1Var5.i0 == 8) {
                            fy2Var6.d(i41);
                            fy2Var5.d(i41);
                        } else {
                            int i43 = z ? i41 - i40 : i41 + i40;
                            if (i42 > 0 && i42 >= i14) {
                                i43 = z ? i43 - fy2Var6.f : i43 + fy2Var6.f;
                            }
                            if (z) {
                                fy2Var5.d(i43);
                            } else {
                                fy2Var6.d(i43);
                            }
                            t03 t03Var4 = dmbVar5.e;
                            int iMin = t03Var4.g;
                            if (dmbVar5.d == aVar && dmbVar5.a == 1) {
                                iMin = Math.min(iMin, t03Var4.m);
                            }
                            i41 = z ? i43 - iMin : i43 + iMin;
                            if (z) {
                                fy2Var6.d(i41);
                            } else {
                                fy2Var5.d(i41);
                            }
                            if (i42 < i15 && i42 < i) {
                                i41 = z ? i41 - (-fy2Var5.f) : i41 + (-fy2Var5.f);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 2) {
                    int i44 = this.f;
                    vx1 vx1Var6 = this.b;
                    float f8 = i44 == 0 ? vx1Var6.f0 : vx1Var6.g0;
                    if (z) {
                        f8 = 1.0f - f8;
                    }
                    int i45 = (int) (((i13 - i5) * f8) + f2);
                    if (i45 < 0 || i3 > 0) {
                        i45 = i7;
                    }
                    int i46 = z ? i6 - i45 : i6 + i45;
                    for (int i47 = i7; i47 < size; i47++) {
                        dmb dmbVar6 = arrayList.get(z ? size - (i47 + 1) : i47);
                        vx1 vx1Var7 = dmbVar6.b;
                        fy2 fy2Var7 = dmbVar6.i;
                        fy2 fy2Var8 = dmbVar6.h;
                        if (vx1Var7.i0 == 8) {
                            fy2Var8.d(i46);
                            fy2Var7.d(i46);
                        } else {
                            if (i47 > 0 && i47 >= i14) {
                                i46 = z ? i46 - fy2Var8.f : i46 + fy2Var8.f;
                            }
                            if (z) {
                                fy2Var7.d(i46);
                            } else {
                                fy2Var8.d(i46);
                            }
                            t03 t03Var5 = dmbVar6.e;
                            int i48 = t03Var5.g;
                            if (dmbVar6.d == aVar && dmbVar6.a == 1) {
                                i48 = t03Var5.m;
                            }
                            i46 = z ? i46 - i48 : i46 + i48;
                            if (z) {
                                fy2Var8.d(i46);
                            } else {
                                fy2Var7.d(i46);
                            }
                            if (i47 < i15 && i47 < i) {
                                i46 = z ? i46 - (-fy2Var7.f) : i46 + (-fy2Var7.f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.dmb
    public final void d() {
        ArrayList<dmb> arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            dmb dmbVar = arrayList.get(i);
            i++;
            dmbVar.d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        vx1 vx1Var = arrayList.get(0).b;
        vx1 vx1Var2 = arrayList.get(size2 - 1).b;
        int i2 = this.f;
        fy2 fy2Var = this.i;
        fy2 fy2Var2 = this.h;
        if (i2 == 0) {
            sx1 sx1Var = vx1Var.J;
            sx1 sx1Var2 = vx1Var2.L;
            fy2 fy2VarI = dmb.i(sx1Var, 0);
            int iD = sx1Var.d();
            vx1 vx1VarM = m();
            if (vx1VarM != null) {
                iD = vx1VarM.J.d();
            }
            if (fy2VarI != null) {
                dmb.b(fy2Var2, fy2VarI, iD);
            }
            fy2 fy2VarI2 = dmb.i(sx1Var2, 0);
            int iD2 = sx1Var2.d();
            vx1 vx1VarN = n();
            if (vx1VarN != null) {
                iD2 = vx1VarN.L.d();
            }
            if (fy2VarI2 != null) {
                dmb.b(fy2Var, fy2VarI2, -iD2);
            }
        } else {
            sx1 sx1Var3 = vx1Var.K;
            sx1 sx1Var4 = vx1Var2.M;
            fy2 fy2VarI3 = dmb.i(sx1Var3, 1);
            int iD3 = sx1Var3.d();
            vx1 vx1VarM2 = m();
            if (vx1VarM2 != null) {
                iD3 = vx1VarM2.K.d();
            }
            if (fy2VarI3 != null) {
                dmb.b(fy2Var2, fy2VarI3, iD3);
            }
            fy2 fy2VarI4 = dmb.i(sx1Var4, 1);
            int iD4 = sx1Var4.d();
            vx1 vx1VarN2 = n();
            if (vx1VarN2 != null) {
                iD4 = vx1VarN2.M.d();
            }
            if (fy2VarI4 != null) {
                dmb.b(fy2Var, fy2VarI4, -iD4);
            }
        }
        fy2Var2.a = this;
        fy2Var.a = this;
    }

    @Override // defpackage.dmb
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList<dmb> arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            arrayList.get(i).e();
            i++;
        }
    }

    @Override // defpackage.dmb
    public final void f() {
        this.c = null;
        ArrayList<dmb> arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            dmb dmbVar = arrayList.get(i);
            i++;
            dmbVar.f();
        }
    }

    @Override // defpackage.dmb
    public final long j() {
        ArrayList<dmb> arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            dmb dmbVar = arrayList.get(i);
            j = ((long) dmbVar.i.f) + dmbVar.j() + j + ((long) dmbVar.h.f);
        }
        return j;
    }

    @Override // defpackage.dmb
    public final boolean k() {
        ArrayList<dmb> arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!arrayList.get(i).k()) {
                return false;
            }
        }
        return true;
    }

    public final vx1 m() {
        int i = 0;
        while (true) {
            ArrayList<dmb> arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            vx1 vx1Var = arrayList.get(i).b;
            if (vx1Var.i0 != 8) {
                return vx1Var;
            }
            i++;
        }
    }

    public final vx1 n() {
        ArrayList<dmb> arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            vx1 vx1Var = arrayList.get(size).b;
            if (vx1Var.i0 != 8) {
                return vx1Var;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        ArrayList<dmb> arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            dmb dmbVar = arrayList.get(i);
            i++;
            sb.append("<");
            sb.append(dmbVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
