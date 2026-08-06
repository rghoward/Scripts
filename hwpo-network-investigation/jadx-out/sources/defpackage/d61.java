package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d61 {
    /* JADX WARN: Code duplicated, block: B:190:0x0292  */
    /* JADX WARN: Code duplicated, block: B:207:0x02da  */
    /* JADX WARN: Code duplicated, block: B:209:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:211:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:213:0x0304  */
    /* JADX WARN: Code duplicated, block: B:236:0x0372  */
    /* JADX WARN: Code duplicated, block: B:238:0x038c  */
    /* JADX WARN: Code duplicated, block: B:240:0x0391  */
    /* JADX WARN: Code duplicated, block: B:244:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:254:0x0422  */
    /* JADX WARN: Code duplicated, block: B:410:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:413:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:414:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:417:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:418:0x06be  */
    /* JADX WARN: Code duplicated, block: B:420:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:422:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:425:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:427:0x06d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:437:0x06f2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:75:0x0117  */
    public static void a(wx1 wx1Var, j86 j86Var, ArrayList<vx1> arrayList, int i) {
        int i2;
        e61[] e61VarArr;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        int i5;
        vx1 vx1Var;
        j86 j86Var2;
        vx1 vx1Var2;
        bw9 bw9Var;
        sx1 sx1Var;
        bw9 bw9Var2;
        vx1 vx1Var3;
        int i6;
        sx1[] sx1VarArr;
        sx1 sx1Var2;
        bw9 bw9Var3;
        int i7;
        sx1[] sx1VarArr2;
        int i8;
        sx1 sx1Var3;
        sx1 sx1Var4;
        bw9 bw9Var4;
        sx1 sx1Var5;
        bw9 bw9Var5;
        int size;
        ArrayList<vx1> arrayList2;
        float f;
        float f2;
        float f3;
        bw9 bw9Var6;
        bw9 bw9Var7;
        bw9 bw9Var8;
        bw9 bw9Var9;
        q30 q30VarL;
        float f4;
        sx1 sx1Var6;
        vx1 vx1Var4;
        int i9;
        int i10;
        int i11;
        vx1 vx1Var5;
        float f5;
        wx1 wx1Var2 = wx1Var;
        if (i == 0) {
            i2 = wx1Var2.A0;
            e61VarArr = wx1Var2.D0;
            i3 = 0;
        } else {
            i2 = wx1Var2.B0;
            e61VarArr = wx1Var2.C0;
            i3 = 2;
        }
        int i12 = i2;
        e61[] e61VarArr2 = e61VarArr;
        int i13 = 0;
        while (i13 < i12) {
            e61 e61Var = e61VarArr2[i13];
            boolean z4 = e61Var.q;
            vx1 vx1Var6 = e61Var.a;
            sx1[] sx1VarArr3 = vx1Var6.R;
            vx1.a aVar = vx1.a.v;
            int i14 = 8;
            float f6 = 0.0f;
            if (z4) {
                i4 = i13;
            } else {
                int i15 = e61Var.l;
                int i16 = i15 * 2;
                vx1 vx1Var7 = vx1Var6;
                vx1 vx1Var8 = vx1Var7;
                boolean z5 = false;
                while (!z5) {
                    e61Var.i++;
                    vx1[] vx1VarArr = vx1Var7.o0;
                    sx1[] sx1VarArr4 = vx1Var7.R;
                    vx1VarArr[i15] = null;
                    vx1Var7.n0[i15] = null;
                    if (vx1Var7.i0 != i14) {
                        vx1Var7.h(i15);
                        sx1VarArr4[i16].d();
                        int i17 = i16 + 1;
                        sx1VarArr4[i17].d();
                        sx1VarArr4[i16].d();
                        sx1VarArr4[i17].d();
                        if (e61Var.b == null) {
                            e61Var.b = vx1Var7;
                        }
                        e61Var.d = vx1Var7;
                        vx1.a aVar2 = vx1Var7.U[i15];
                        if (aVar2 == aVar) {
                            int i18 = vx1Var7.t[i15];
                            i10 = i13;
                            if (i18 == 0 || i18 == 3 || i18 == 2) {
                                e61Var.j++;
                                float f7 = vx1Var7.m0[i15];
                                if (f7 > 0.0f) {
                                    f5 = f7;
                                    e61Var.k += f5;
                                } else {
                                    f5 = f7;
                                }
                                i11 = i15;
                                if (vx1Var7.i0 != 8 && aVar2 == aVar && (i18 == 0 || i18 == 3)) {
                                    if (f5 < 0.0f) {
                                        e61Var.n = true;
                                    } else {
                                        e61Var.o = true;
                                    }
                                    if (e61Var.h == null) {
                                        e61Var.h = new ArrayList<>();
                                    }
                                    e61Var.h.add(vx1Var7);
                                }
                                if (e61Var.f == null) {
                                    e61Var.f = vx1Var7;
                                }
                                vx1 vx1Var9 = e61Var.g;
                                if (vx1Var9 != null) {
                                    vx1Var9.n0[i11] = vx1Var7;
                                }
                                e61Var.g = vx1Var7;
                            } else {
                                i11 = i15;
                            }
                            if (i11 == 0) {
                                if (vx1Var7.r == 0 && vx1Var7.u == 0) {
                                    int i19 = vx1Var7.v;
                                }
                            } else if (vx1Var7.s == 0 && vx1Var7.x == 0) {
                                int i20 = vx1Var7.y;
                            }
                        } else {
                            i10 = i13;
                            i11 = i15;
                        }
                    } else {
                        i10 = i13;
                        i11 = i15;
                    }
                    vx1 vx1Var10 = vx1Var8;
                    if (vx1Var10 != vx1Var7) {
                        vx1Var10.o0[i11] = vx1Var7;
                    }
                    sx1 sx1Var7 = sx1VarArr4[i16 + 1].f;
                    if (sx1Var7 != null) {
                        vx1Var5 = sx1Var7.d;
                        sx1 sx1Var8 = vx1Var5.R[i16].f;
                        if (sx1Var8 == null || sx1Var8.d != vx1Var7) {
                            vx1Var5 = null;
                        }
                    } else {
                        vx1Var5 = null;
                    }
                    if (vx1Var5 == null) {
                        vx1Var5 = vx1Var7;
                        z5 = true;
                    }
                    vx1Var8 = vx1Var7;
                    i15 = i11;
                    i14 = 8;
                    vx1Var7 = vx1Var5;
                    i13 = i10;
                }
                i4 = i13;
                int i21 = i15;
                vx1 vx1Var11 = e61Var.b;
                if (vx1Var11 != null) {
                    vx1Var11.R[i16].d();
                }
                vx1 vx1Var12 = e61Var.d;
                if (vx1Var12 != null) {
                    vx1Var12.R[i16 + 1].d();
                }
                e61Var.c = vx1Var7;
                if (i21 == 0 && e61Var.m) {
                    e61Var.e = vx1Var7;
                } else {
                    e61Var.e = vx1Var6;
                }
                e61Var.p = e61Var.o && e61Var.n;
            }
            e61Var.q = true;
            if (arrayList == 0 || arrayList.contains(vx1Var6)) {
                vx1 vx1Var13 = e61Var.c;
                vx1 vx1Var14 = e61Var.b;
                vx1 vx1Var15 = e61Var.d;
                vx1 vx1Var16 = e61Var.e;
                float f8 = e61Var.k;
                vx1.a[] aVarArr = wx1Var2.U;
                sx1[] sx1VarArr5 = sx1VarArr3;
                sx1[] sx1VarArr6 = wx1Var2.R;
                boolean z6 = aVarArr[i] == vx1.a.u;
                if (i == 0) {
                    int i22 = vx1Var16.k0;
                    boolean z7 = i22 == 0;
                    z2 = i22 == 1;
                    z3 = i22 == 2;
                    z = z7;
                } else {
                    int i23 = vx1Var16.l0;
                    z = i23 == 0;
                    z2 = i23 == 1;
                    z3 = i23 == 2;
                }
                boolean z8 = z2;
                boolean z9 = false;
                while (!z9) {
                    sx1[] sx1VarArr7 = vx1Var6.R;
                    vx1.a[] aVarArr2 = vx1Var6.U;
                    sx1 sx1Var9 = sx1VarArr7[i3];
                    int i24 = z3 ? 1 : 4;
                    int iD = sx1Var9.d();
                    boolean z10 = z3;
                    boolean z11 = aVarArr2[i] == aVar && vx1Var6.t[i] == 0;
                    sx1 sx1Var10 = sx1Var9.f;
                    if (sx1Var10 != null && vx1Var6 != vx1Var6) {
                        iD = sx1Var10.d() + iD;
                    }
                    int i25 = iD;
                    if (z10 && vx1Var6 != vx1Var6 && vx1Var6 != vx1Var14) {
                        i24 = 8;
                    }
                    vx1 vx1Var17 = vx1Var6;
                    sx1 sx1Var11 = sx1Var9.f;
                    if (sx1Var11 != null) {
                        bw9 bw9Var10 = sx1Var9.i;
                        bw9 bw9Var11 = sx1Var11.i;
                        if (vx1Var6 == vx1Var14) {
                            j86Var.f(bw9Var10, bw9Var11, i25, 6);
                        } else {
                            j86Var.f(bw9Var10, bw9Var11, i25, 8);
                        }
                        if (z11 && !z10) {
                            i24 = 5;
                        }
                        j86Var.e(sx1Var9.i, sx1Var9.f.i, i25, (vx1Var6 == vx1Var14 && z10 && vx1Var6.T[i]) ? 5 : i24);
                    } else {
                        i12 = i12;
                    }
                    if (z6) {
                        if (vx1Var6.i0 == 8 || aVarArr2[i] != aVar) {
                            i9 = 0;
                        } else {
                            i9 = 0;
                            j86Var.f(sx1VarArr7[i3 + 1].i, sx1VarArr7[i3].i, 0, 5);
                        }
                        j86Var.f(sx1VarArr7[i3].i, sx1VarArr6[i3].i, i9, 8);
                    }
                    sx1 sx1Var12 = sx1VarArr7[i3 + 1].f;
                    if (sx1Var12 != null) {
                        vx1Var4 = sx1Var12.d;
                        sx1 sx1Var13 = vx1Var4.R[i3].f;
                        if (sx1Var13 == null || sx1Var13.d != vx1Var6) {
                            vx1Var4 = null;
                        }
                    } else {
                        vx1Var4 = null;
                    }
                    if (vx1Var4 != null) {
                        vx1Var6 = vx1Var4;
                    } else {
                        z9 = true;
                    }
                    vx1Var6 = vx1Var17;
                    z3 = z10;
                    i12 = i12;
                }
                boolean z12 = z3;
                i5 = i12;
                if (vx1Var15 != null) {
                    int i26 = i3 + 1;
                    if (vx1Var13.R[i26].f != null) {
                        sx1 sx1Var14 = vx1Var15.R[i26];
                        if (vx1Var15.U[i] == aVar && vx1Var15.t[i] == 0 && !z12) {
                            sx1 sx1Var15 = sx1Var14.f;
                            if (sx1Var15.d == wx1Var2) {
                                j86Var.e(sx1Var14.i, sx1Var15.i, -sx1Var14.d(), 5);
                            } else if (z12) {
                                sx1Var6 = sx1Var14.f;
                                if (sx1Var6.d == wx1Var2) {
                                    j86Var.e(sx1Var14.i, sx1Var6.i, -sx1Var14.d(), 4);
                                }
                            }
                        } else if (z12) {
                            sx1Var6 = sx1Var14.f;
                            if (sx1Var6.d == wx1Var2) {
                                j86Var.e(sx1Var14.i, sx1Var6.i, -sx1Var14.d(), 4);
                            }
                        }
                        j86Var.g(sx1Var14.i, vx1Var13.R[i26].f.i, -sx1Var14.d(), 6);
                    }
                }
                if (z6 != 0) {
                    int i27 = i3 + 1;
                    bw9 bw9Var12 = sx1VarArr6[i27].i;
                    sx1 sx1Var16 = vx1Var13.R[i27];
                    j86Var.f(bw9Var12, sx1Var16.i, sx1Var16.d(), 8);
                }
                ArrayList<vx1> arrayList3 = e61Var.h;
                if (arrayList3 != null && (size = arrayList3.size()) > 1) {
                    float f9 = (!e61Var.n || e61Var.p) ? f8 : e61Var.j;
                    vx1 vx1Var18 = null;
                    float f10 = 0.0f;
                    int i28 = 0;
                    while (i28 < size) {
                        vx1 vx1Var19 = arrayList3.get(i28);
                        float[] fArr = vx1Var19.m0;
                        sx1[] sx1VarArr8 = vx1Var19.R;
                        float f11 = fArr[i];
                        if (f11 >= f6) {
                            arrayList2 = arrayList3;
                            if (f11 == f6) {
                                j86Var.e(sx1VarArr8[i3 + 1].i, sx1VarArr8[i3].i, 0, 8);
                                size = size;
                                f2 = f6;
                                f3 = f9;
                            } else {
                                i28 = i28;
                                if (vx1Var18 != null) {
                                    sx1[] sx1VarArr9 = vx1Var18.R;
                                    bw9Var6 = sx1VarArr9[i3].i;
                                    int i29 = i3 + 1;
                                    bw9Var7 = sx1VarArr9[i29].i;
                                    bw9Var8 = sx1VarArr8[i3].i;
                                    bw9Var9 = sx1VarArr8[i29].i;
                                    q30VarL = j86Var.l();
                                    f4 = f6;
                                    q30VarL.b = f4;
                                    f2 = f4;
                                    if (f9 != f4 || f10 == f11) {
                                        f3 = f9;
                                        f = f11;
                                        q30VarL.d.k(bw9Var6, 1.0f);
                                        q30VarL.d.k(bw9Var7, -1.0f);
                                        q30VarL.d.k(bw9Var9, 1.0f);
                                        q30VarL.d.k(bw9Var8, -1.0f);
                                    } else {
                                        q30.a aVar3 = q30VarL.d;
                                        if (f10 == f2) {
                                            f3 = f9;
                                            aVar3.k(bw9Var6, 1.0f);
                                            q30VarL.d.k(bw9Var7, -1.0f);
                                            f = f11;
                                        } else {
                                            f3 = f9;
                                            f = f11;
                                            if (f11 == f6) {
                                                aVar3.k(bw9Var8, 1.0f);
                                                q30VarL.d.k(bw9Var9, -1.0f);
                                            } else {
                                                float f12 = (f10 / f3) / (f / f3);
                                                aVar3.k(bw9Var6, 1.0f);
                                                q30VarL.d.k(bw9Var7, -1.0f);
                                                q30VarL.d.k(bw9Var9, f12);
                                                q30VarL.d.k(bw9Var8, -f12);
                                            }
                                        }
                                    }
                                    j86Var.c(q30VarL);
                                } else {
                                    f = f11;
                                    f2 = f6;
                                    f3 = f9;
                                }
                                vx1Var18 = vx1Var19;
                                f10 = f;
                            }
                        } else {
                            if (e61Var.p) {
                                arrayList2 = arrayList3;
                                j86Var.e(sx1VarArr8[i3 + 1].i, sx1VarArr8[i3].i, 0, 4);
                            } else {
                                f11 = 1.0f;
                                arrayList2 = arrayList3;
                                if (f11 == f6) {
                                    j86Var.e(sx1VarArr8[i3 + 1].i, sx1VarArr8[i3].i, 0, 8);
                                } else {
                                    i28 = i28;
                                    if (vx1Var18 != null) {
                                        sx1[] sx1VarArr10 = vx1Var18.R;
                                        bw9Var6 = sx1VarArr10[i3].i;
                                        int i210 = i3 + 1;
                                        bw9Var7 = sx1VarArr10[i210].i;
                                        bw9Var8 = sx1VarArr8[i3].i;
                                        bw9Var9 = sx1VarArr8[i210].i;
                                        q30VarL = j86Var.l();
                                        f4 = f6;
                                        q30VarL.b = f4;
                                        f2 = f4;
                                        if (f9 != f4) {
                                            f3 = f9;
                                            f = f11;
                                            q30VarL.d.k(bw9Var6, 1.0f);
                                            q30VarL.d.k(bw9Var7, -1.0f);
                                            q30VarL.d.k(bw9Var9, 1.0f);
                                            q30VarL.d.k(bw9Var8, -1.0f);
                                        } else {
                                            f3 = f9;
                                            f = f11;
                                            q30VarL.d.k(bw9Var6, 1.0f);
                                            q30VarL.d.k(bw9Var7, -1.0f);
                                            q30VarL.d.k(bw9Var9, 1.0f);
                                            q30VarL.d.k(bw9Var8, -1.0f);
                                        }
                                        j86Var.c(q30VarL);
                                    } else {
                                        f = f11;
                                        f2 = f6;
                                        f3 = f9;
                                    }
                                    vx1Var18 = vx1Var19;
                                    f10 = f;
                                }
                            }
                            size = size;
                            f2 = f6;
                            f3 = f9;
                        }
                        i28++;
                        f9 = f3;
                        arrayList3 = arrayList2;
                        size = size;
                        f6 = f2;
                    }
                }
                if (vx1Var14 == null || !(vx1Var14 == vx1Var15 || z12)) {
                    vx1Var = vx1Var15;
                    if (z && vx1Var14 != null) {
                        int i30 = e61Var.j;
                        boolean z13 = i30 > 0 && e61Var.i == i30;
                        vx1 vx1Var20 = vx1Var14;
                        vx1 vx1Var21 = vx1Var20;
                        while (true) {
                            sx1[] sx1VarArr11 = vx1Var21.R;
                            if (vx1Var20 == null) {
                                break;
                            }
                            sx1[] sx1VarArr12 = vx1Var20.R;
                            vx1 vx1Var22 = vx1Var20.o0[i];
                            while (true) {
                                if (vx1Var22 == null) {
                                    i6 = 8;
                                    break;
                                }
                                i6 = 8;
                                if (vx1Var22.i0 != 8) {
                                    break;
                                } else {
                                    vx1Var22 = vx1Var22.o0[i];
                                }
                            }
                            if (vx1Var22 != null || vx1Var20 == vx1Var) {
                                sx1 sx1Var17 = sx1VarArr12[i3];
                                bw9 bw9Var13 = sx1Var17.i;
                                sx1 sx1Var18 = sx1Var17.f;
                                bw9 bw9Var14 = sx1Var18 != null ? sx1Var18.i : null;
                                if (vx1Var21 != vx1Var20) {
                                    bw9Var14 = sx1VarArr11[i3 + 1].i;
                                } else if (vx1Var20 == vx1Var14) {
                                    sx1 sx1Var19 = sx1VarArr5[i3].f;
                                    bw9Var14 = sx1Var19 != null ? sx1Var19.i : null;
                                }
                                int iD2 = sx1Var17.d();
                                int i31 = i3 + 1;
                                int iD3 = sx1VarArr12[i31].d();
                                if (vx1Var22 != null) {
                                    sx1Var2 = vx1Var22.R[i3];
                                    sx1VarArr = sx1VarArr11;
                                    bw9Var3 = sx1Var2.i;
                                } else {
                                    sx1VarArr = sx1VarArr11;
                                    sx1Var2 = vx1Var13.R[i31].f;
                                    bw9Var3 = sx1Var2 != null ? sx1Var2.i : null;
                                }
                                bw9 bw9Var15 = sx1VarArr12[i31].i;
                                if (sx1Var2 != null) {
                                    iD3 += sx1Var2.d();
                                }
                                int iD4 = sx1VarArr[i31].d() + iD2;
                                if (bw9Var13 == null || bw9Var14 == null || bw9Var3 == null || bw9Var15 == null) {
                                    i7 = 8;
                                } else {
                                    if (vx1Var20 == vx1Var14) {
                                        iD4 = vx1Var14.R[i3].d();
                                    }
                                    int i32 = iD4;
                                    if (vx1Var20 == vx1Var) {
                                        iD3 = vx1Var.R[i31].d();
                                    }
                                    i7 = 8;
                                    j86Var.b(bw9Var13, bw9Var14, i32, 0.5f, bw9Var3, bw9Var15, iD3, z13 ? 8 : 5);
                                }
                            } else {
                                i7 = i6;
                            }
                            if (vx1Var20.i0 != i7) {
                                vx1Var21 = vx1Var20;
                            }
                            vx1Var20 = vx1Var22;
                            vx1Var21 = vx1Var21;
                            sx1VarArr5 = sx1VarArr5;
                        }
                    } else {
                        int i33 = 8;
                        if (z8 && vx1Var14 != null) {
                            int i34 = e61Var.j;
                            boolean z14 = i34 > 0 && e61Var.i == i34;
                            vx1 vx1Var23 = vx1Var14;
                            vx1 vx1Var24 = vx1Var23;
                            while (true) {
                                sx1[] sx1VarArr13 = vx1Var23.R;
                                if (vx1Var24 == null) {
                                    break;
                                }
                                sx1[] sx1VarArr14 = vx1Var24.R;
                                vx1 vx1Var25 = vx1Var24.o0[i];
                                while (vx1Var25 != null && vx1Var25.i0 == i33) {
                                    vx1Var25 = vx1Var25.o0[i];
                                }
                                if (vx1Var24 == vx1Var14 || vx1Var24 == vx1Var || vx1Var25 == null) {
                                    vx1Var2 = vx1Var23;
                                } else {
                                    if (vx1Var25 == vx1Var) {
                                        vx1Var25 = null;
                                    }
                                    sx1 sx1Var20 = sx1VarArr14[i3];
                                    bw9 bw9Var16 = sx1Var20.i;
                                    int i35 = i3 + 1;
                                    bw9 bw9Var17 = sx1VarArr13[i35].i;
                                    int iD5 = sx1Var20.d();
                                    int iD6 = sx1VarArr14[i35].d();
                                    if (vx1Var25 != null) {
                                        sx1Var = vx1Var25.R[i3];
                                        bw9Var = sx1Var.i;
                                        vx1Var2 = vx1Var23;
                                        sx1 sx1Var21 = sx1Var.f;
                                        bw9Var2 = sx1Var21 != null ? sx1Var21.i : null;
                                    } else {
                                        vx1Var2 = vx1Var23;
                                        sx1 sx1Var22 = vx1Var.R[i3];
                                        bw9Var = sx1Var22 != null ? sx1Var22.i : null;
                                        bw9 bw9Var18 = sx1VarArr14[i35].i;
                                        sx1Var = sx1Var22;
                                        bw9Var2 = bw9Var18;
                                    }
                                    if (sx1Var != null) {
                                        iD6 += sx1Var.d();
                                    }
                                    int iD7 = sx1VarArr13[i35].d() + iD5;
                                    vx1 vx1Var26 = vx1Var25;
                                    int i36 = iD6;
                                    int i37 = z14 ? 8 : 4;
                                    if (bw9Var16 == null || bw9Var17 == null || bw9Var == null || bw9Var2 == null) {
                                        vx1Var3 = vx1Var26;
                                    } else {
                                        bw9 bw9Var19 = bw9Var;
                                        vx1Var3 = vx1Var26;
                                        j86Var.b(bw9Var16, bw9Var17, iD7, 0.5f, bw9Var19, bw9Var2, i36, i37);
                                    }
                                    vx1Var25 = vx1Var3;
                                }
                                i33 = 8;
                                if (vx1Var24.i0 != 8) {
                                    vx1Var2 = vx1Var24;
                                }
                                vx1Var24 = vx1Var25;
                                vx1Var23 = vx1Var2;
                            }
                            j86Var2 = j86Var;
                            sx1 sx1Var23 = vx1Var14.R[i3];
                            sx1 sx1Var24 = sx1VarArr5[i3].f;
                            int i38 = i3 + 1;
                            sx1 sx1Var25 = vx1Var.R[i38];
                            sx1 sx1Var26 = vx1Var13.R[i38].f;
                            if (sx1Var24 != null) {
                                if (vx1Var14 != vx1Var) {
                                    j86Var2.e(sx1Var23.i, sx1Var24.i, sx1Var23.d(), 5);
                                } else if (sx1Var26 != null) {
                                    j86Var2.b(sx1Var23.i, sx1Var24.i, sx1Var23.d(), 0.5f, sx1Var25.i, sx1Var26.i, sx1Var25.d(), 5);
                                }
                            }
                            if (sx1Var26 != null && vx1Var14 != vx1Var) {
                                j86Var2.e(sx1Var25.i, sx1Var26.i, -sx1Var25.d(), 5);
                            }
                        }
                        if ((z || z8) && vx1Var14 != null && vx1Var14 != vx1Var) {
                            sx1VarArr2 = vx1Var14.R;
                            sx1 sx1Var27 = sx1VarArr2[i3];
                            if (vx1Var == null) {
                                vx1Var = vx1Var14;
                            }
                            sx1[] sx1VarArr15 = vx1Var.R;
                            i8 = i3 + 1;
                            sx1Var3 = sx1VarArr15[i8];
                            sx1Var4 = sx1Var27.f;
                            if (sx1Var4 != null) {
                                bw9Var4 = sx1Var4.i;
                            } else {
                                bw9Var4 = null;
                            }
                            sx1Var5 = sx1Var3.f;
                            if (sx1Var5 != null) {
                                bw9Var5 = sx1Var5.i;
                            } else {
                                bw9Var5 = null;
                            }
                            if (vx1Var13 != vx1Var) {
                                sx1 sx1Var28 = vx1Var13.R[i8].f;
                                bw9Var5 = sx1Var28 != null ? sx1Var28.i : null;
                            }
                            if (vx1Var14 == vx1Var) {
                                sx1Var3 = sx1VarArr2[i8];
                            }
                            if (bw9Var4 == null && bw9Var5 != null) {
                                j86Var2.b(sx1Var27.i, bw9Var4, sx1Var27.d(), 0.5f, bw9Var5, sx1Var3.i, sx1VarArr15[i8].d(), 5);
                            }
                        }
                    }
                } else {
                    sx1 sx1Var29 = sx1VarArr5[i3];
                    int i39 = i3 + 1;
                    sx1 sx1Var30 = vx1Var13.R[i39];
                    sx1 sx1Var31 = sx1Var29.f;
                    bw9 bw9Var20 = sx1Var31 != null ? sx1Var31.i : null;
                    sx1 sx1Var32 = sx1Var30.f;
                    bw9 bw9Var21 = sx1Var32 != null ? sx1Var32.i : null;
                    sx1 sx1Var33 = vx1Var14.R[i3];
                    if (vx1Var15 != null) {
                        sx1Var30 = vx1Var15.R[i39];
                    }
                    if (bw9Var20 == null || bw9Var21 == null) {
                        vx1Var = vx1Var15;
                    } else {
                        float f13 = i == 0 ? vx1Var16.f0 : vx1Var16.g0;
                        int iD8 = sx1Var33.d();
                        int iD9 = sx1Var30.d();
                        bw9 bw9Var22 = sx1Var33.i;
                        bw9 bw9Var23 = sx1Var30.i;
                        bw9 bw9Var24 = bw9Var20;
                        vx1Var = vx1Var15;
                        j86Var.b(bw9Var22, bw9Var24, iD8, f13, bw9Var21, bw9Var23, iD9, 7);
                    }
                }
                j86Var2 = j86Var;
                if (z) {
                    sx1VarArr2 = vx1Var14.R;
                    sx1 sx1Var210 = sx1VarArr2[i3];
                    if (vx1Var == null) {
                        vx1Var = vx1Var14;
                    }
                    sx1[] sx1VarArr16 = vx1Var.R;
                    i8 = i3 + 1;
                    sx1Var3 = sx1VarArr16[i8];
                    sx1Var4 = sx1Var210.f;
                    if (sx1Var4 != null) {
                        bw9Var4 = sx1Var4.i;
                    } else {
                        bw9Var4 = null;
                    }
                    sx1Var5 = sx1Var3.f;
                    if (sx1Var5 != null) {
                        bw9Var5 = sx1Var5.i;
                    } else {
                        bw9Var5 = null;
                    }
                    if (vx1Var13 != vx1Var) {
                        sx1 sx1Var211 = vx1Var13.R[i8].f;
                        bw9Var5 = sx1Var211 != null ? sx1Var211.i : null;
                    }
                    if (vx1Var14 == vx1Var) {
                        sx1Var3 = sx1VarArr2[i8];
                    }
                    if (bw9Var4 == null) {
                    }
                } else {
                    sx1VarArr2 = vx1Var14.R;
                    sx1 sx1Var212 = sx1VarArr2[i3];
                    if (vx1Var == null) {
                        vx1Var = vx1Var14;
                    }
                    sx1[] sx1VarArr17 = vx1Var.R;
                    i8 = i3 + 1;
                    sx1Var3 = sx1VarArr17[i8];
                    sx1Var4 = sx1Var212.f;
                    if (sx1Var4 != null) {
                        bw9Var4 = sx1Var4.i;
                    } else {
                        bw9Var4 = null;
                    }
                    sx1Var5 = sx1Var3.f;
                    if (sx1Var5 != null) {
                        bw9Var5 = sx1Var5.i;
                    } else {
                        bw9Var5 = null;
                    }
                    if (vx1Var13 != vx1Var) {
                        sx1 sx1Var213 = vx1Var13.R[i8].f;
                        bw9Var5 = sx1Var213 != null ? sx1Var213.i : null;
                    }
                    if (vx1Var14 == vx1Var) {
                        sx1Var3 = sx1VarArr2[i8];
                    }
                    if (bw9Var4 == null) {
                    }
                }
            } else {
                i5 = i12;
            }
            i13 = i4 + 1;
            wx1Var2 = wx1Var;
            i12 = i5;
        }
    }
}
