package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xm7 implements fl6 {
    public final oh4<cr9, g2b> a;
    public final boolean b;
    public final jfa.b c;
    public final yea.b d;
    public final go7 e;
    public final float f;

    public xm7() {
        throw null;
    }

    public xm7(oh4 oh4Var, boolean z, jfa.b bVar, yea.b bVar2, go7 go7Var, float f) {
        this.a = oh4Var;
        this.b = z;
        this.c = bVar;
        this.d = bVar2;
        this.e = go7Var;
        this.f = f;
    }

    public static final int j(int i, xm7 xm7Var, int i2, int i3, jz7 jz7Var, jz7 jz7Var2) {
        if (xm7Var.b) {
            i3 = Math.round(((i2 - jz7Var2.u) / 2.0f) * 1.0f);
        }
        int i4 = i + i3;
        jfa.b bVar = xm7Var.c;
        return Math.max(i4, (jz7Var != null ? jz7Var.u : 0) / 2);
    }

    @Override // defpackage.fl6
    public final int a(qj5 qj5Var, List<? extends pj5> list, int i) {
        return h(qj5Var, list, i, new tm7());
    }

    public final int b(qj5 qj5Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, boolean z, float f) {
        int[] iArr = {i7, i3, i4, z ? 0 : vk6.d(i6, f, 0)};
        for (int i9 = 0; i9 < 4; i9++) {
            i5 = Math.max(i5, iArr[i9]);
        }
        go7 go7Var = this.e;
        float fU0 = qj5Var.U0(go7Var.d());
        if (!z) {
            fU0 = vk6.c(fU0, Math.max(fU0, i6 / 2.0f), f);
        }
        float fU1 = fU0 + i5 + qj5Var.U0(go7Var.a());
        if (!z) {
            i6 = 0;
        }
        return zx1.f(Math.max(i, Math.max(i2, wk6.b(fU1))) + i6 + i8, j);
    }

    public final int c(qj5 qj5Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, float f) {
        int i8 = i3 + i4;
        int iMax = Math.max(i5 + i8, Math.max(i7 + i8, vk6.d(i6, f, 0))) + i + i2;
        go7 go7Var = this.e;
        tq5 tq5Var = tq5.t;
        return zx1.g(Math.max(iMax, wk6.b((i6 + qj5Var.U0(go7Var.c(tq5Var) + go7Var.b(tq5Var))) * f)), j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, jz7] */
    @Override // defpackage.fl6
    public final gl6 d(final hl6 hl6Var, List<? extends cl6> list, long j) {
        cl6 cl6Var;
        cl6 cl6Var2;
        cl6 cl6Var3;
        cl6 cl6Var4;
        cl6 cl6Var5;
        cl6 cl6Var6;
        int i;
        cl6 cl6Var7;
        jz7 jz7Var;
        int i2;
        gl8 gl8Var;
        int i3;
        gl8 gl8Var2;
        int i4;
        int i5;
        List<? extends cl6> list2 = list;
        final float fInvoke = this.d.invoke();
        go7 go7Var = this.e;
        int iN1 = hl6Var.n1(go7Var.a());
        long jA = xx1.a(0, 0, 0, 0, 10, j);
        int size = list2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                cl6Var = null;
                break;
            }
            cl6Var = list2.get(i6);
            if (xj5.a(yq5.c(cl6Var), "Leading")) {
                break;
            }
            i6++;
        }
        cl6 cl6Var8 = cl6Var;
        jz7 jz7VarE = cl6Var8 != null ? cl6Var8.E(jA) : null;
        int i7 = jz7VarE != null ? jz7VarE.t : 0;
        int iMax = Math.max(0, jz7VarE != null ? jz7VarE.u : 0);
        int size2 = list2.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size2) {
                cl6Var2 = null;
                break;
            }
            cl6Var2 = list2.get(i8);
            if (xj5.a(yq5.c(cl6Var2), "Trailing")) {
                break;
            }
            i8++;
        }
        cl6 cl6Var9 = cl6Var2;
        jz7 jz7VarE2 = cl6Var9 != null ? cl6Var9.E(zx1.j(-i7, 0, 2, jA)) : null;
        int i9 = i7 + (jz7VarE2 != null ? jz7VarE2.t : 0);
        int iMax2 = Math.max(iMax, jz7VarE2 != null ? jz7VarE2.u : 0);
        int size3 = list2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size3) {
                cl6Var3 = null;
                break;
            }
            cl6Var3 = list2.get(i10);
            int i11 = size3;
            if (xj5.a(yq5.c(cl6Var3), "Prefix")) {
                break;
            }
            i10++;
            size3 = i11;
        }
        cl6 cl6Var10 = cl6Var3;
        jz7 jz7VarE3 = cl6Var10 != null ? cl6Var10.E(zx1.j(-i9, 0, 2, jA)) : null;
        int i12 = i9 + (jz7VarE3 != null ? jz7VarE3.t : 0);
        int iMax3 = Math.max(iMax2, jz7VarE3 != null ? jz7VarE3.u : 0);
        int size4 = list2.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size4) {
                cl6Var4 = null;
                break;
            }
            cl6Var4 = list2.get(i13);
            int i14 = size4;
            if (xj5.a(yq5.c(cl6Var4), "Suffix")) {
                break;
            }
            i13++;
            size4 = i14;
        }
        cl6 cl6Var11 = cl6Var4;
        jz7 jz7VarE4 = cl6Var11 != null ? cl6Var11.E(zx1.j(-i12, 0, 2, jA)) : null;
        int i15 = i12 + (jz7VarE4 != null ? jz7VarE4.t : 0);
        int iMax4 = Math.max(iMax3, jz7VarE4 != null ? jz7VarE4.u : 0);
        boolean z = false;
        int size5 = list2.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size5) {
                cl6Var5 = null;
                break;
            }
            cl6Var5 = list2.get(i16);
            int i17 = size5;
            if (xj5.a(yq5.c(cl6Var5), "Label")) {
                break;
            }
            i16++;
            size5 = i17;
        }
        cl6 cl6Var12 = cl6Var5;
        gl8 gl8Var3 = new gl8();
        oh4<cr9, g2b> oh4Var = this.a;
        long jFloatToRawIntBits = 0;
        int iN2 = hl6Var.n1(go7Var.c(hl6Var.getLayoutDirection())) + hl6Var.n1(go7Var.b(hl6Var.getLayoutDirection()));
        ?? E = cl6Var12 != null ? cl6Var12.E(zx1.i(jA, -vk6.d(i15 + iN2, fInvoke, iN2), -iN1)) : 0;
        gl8Var3.t = E;
        if (E != 0) {
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(E.t)) << 32) | (((long) Float.floatToRawIntBits(E.u)) & 4294967295L);
        }
        oh4Var.invoke(new cr9(jFloatToRawIntBits));
        int size6 = list2.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size6) {
                cl6Var6 = null;
                break;
            }
            cl6Var6 = list2.get(i18);
            if (xj5.a(yq5.c(cl6Var6), "Supporting")) {
                break;
            }
            i18++;
        }
        cl6 cl6Var13 = cl6Var6;
        int iC0 = cl6Var13 != null ? cl6Var13.c0(xx1.j(j)) : 0;
        jz7 jz7Var2 = (jz7) gl8Var3.t;
        int iMax5 = Math.max((jz7Var2 != null ? jz7Var2.u : 0) / 2, hl6Var.n1(go7Var.d()));
        long j2 = j;
        long jA2 = xx1.a(0, 0, 0, 0, 11, zx1.i(j2, -i15, (((-iN1) - iMax5) + 0) - iC0));
        int size7 = list2.size();
        cl6 cl6Var14 = cl6Var13;
        int i19 = 0;
        while (i19 < size7) {
            int i20 = i19;
            cl6 cl6Var15 = list2.get(i19);
            int i21 = iMax5;
            if (xj5.a(yq5.c(cl6Var15), "TextField")) {
                final jz7 jz7VarE5 = cl6Var15.E(jA2);
                long jA3 = xx1.a(0, 0, 0, 0, 14, jA2);
                int size8 = list2.size();
                int i22 = 0;
                while (true) {
                    if (i22 >= size8) {
                        i = iN1;
                        cl6Var7 = null;
                        break;
                    }
                    cl6Var7 = list2.get(i22);
                    i = iN1;
                    int i23 = size8;
                    if (xj5.a(yq5.c(cl6Var7), "Hint")) {
                        break;
                    }
                    i22++;
                    size8 = i23;
                    iN1 = i;
                }
                cl6 cl6Var16 = cl6Var7;
                jz7 jz7VarE6 = cl6Var16 != null ? cl6Var16.E(jA3) : null;
                int iMax6 = Math.max(iMax4, Math.max(jz7VarE5.u, jz7VarE6 != null ? jz7VarE6.u : 0) + i21 + i);
                int i24 = jz7VarE != 0 ? jz7VarE.t : 0;
                jz7 jz7Var3 = jz7VarE2;
                int i25 = jz7VarE2 != null ? jz7Var3.t : 0;
                final jz7 jz7Var4 = jz7VarE3;
                int i26 = jz7VarE3 != 0 ? jz7Var4.t : 0;
                int i27 = i24;
                if (jz7VarE4 != null) {
                    i2 = jz7VarE4.t;
                    jz7Var = jz7Var3;
                } else {
                    jz7Var = jz7Var3;
                    i2 = 0;
                }
                int i28 = jz7VarE5.t;
                jz7 jz7Var5 = (jz7) gl8Var3.t;
                if (jz7Var5 != null) {
                    gl8 gl8Var4 = gl8Var3;
                    i3 = jz7Var5.t;
                    gl8Var = gl8Var4;
                } else {
                    gl8Var = gl8Var3;
                    i3 = 0;
                }
                if (jz7VarE6 != null) {
                    gl8Var2 = gl8Var;
                    i4 = jz7VarE6.t;
                    i5 = i27;
                } else {
                    gl8Var2 = gl8Var;
                    i4 = 0;
                    i5 = i27;
                }
                final int iC = c(hl6Var, i5, i25, i26, i2, i28, i3, i4, j2, r27);
                jz7 jz7VarE7 = cl6Var14 != 0 ? cl6Var14.E(xx1.a(0, iC, 0, 0, 9, zx1.j(0, -iMax6, 1, jA))) : null;
                int i29 = jz7VarE7 != null ? jz7VarE7.u : 0;
                final jz7 jz7Var6 = jz7VarE;
                int i30 = jz7VarE != null ? jz7Var6.u : 0;
                final jz7 jz7Var7 = jz7Var;
                int i31 = jz7Var != null ? jz7Var7.u : 0;
                int i32 = jz7Var4 != null ? jz7Var4.u : 0;
                final jz7 jz7Var8 = jz7VarE4;
                int i33 = jz7Var8 != null ? jz7Var8.u : 0;
                int i34 = jz7VarE5.u;
                final gl8 gl8Var5 = gl8Var2;
                jz7 jz7Var9 = (jz7) gl8Var5.t;
                final jz7 jz7Var10 = jz7VarE6;
                final int iB = b(hl6Var, i30, i31, i32, i33, i34, jz7Var9 != null ? jz7Var9.u : 0, jz7Var10 != null ? jz7Var10.u : 0, jz7VarE7 != null ? jz7VarE7.u : 0, j, z, r27);
                int i35 = (iB - i29) + 0;
                int size9 = list.size();
                int i36 = 0;
                while (i36 < size9) {
                    cl6 cl6Var17 = list.get(i36);
                    if (xj5.a(yq5.c(cl6Var17), "Container")) {
                        final jz7 jz7VarE8 = cl6Var17.E(zx1.a(iC != Integer.MAX_VALUE ? iC : 0, iC, i35 != Integer.MAX_VALUE ? i35 : 0, i35));
                        final jz7 jz7Var11 = jz7VarE7;
                        final boolean z2 = z;
                        return hl6Var.y0(iC, iB, if3.t, new oh4() { // from class: um7
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                int i37;
                                int i38;
                                int i39;
                                xm7 xm7Var;
                                float f;
                                int iRound;
                                float f2;
                                float f3;
                                float f4;
                                jz7.a aVar = (jz7.a) obj;
                                jz7 jz7Var12 = (jz7) gl8Var5.t;
                                hl6 hl6Var2 = hl6Var;
                                float density = hl6Var2.getDensity();
                                tq5 layoutDirection = hl6Var2.getLayoutDirection();
                                xm7 xm7Var2 = this.t;
                                float fU0 = hl6Var2.U0(xm7Var2.f);
                                jfa.b bVar = xm7Var2.c;
                                go7 go7Var2 = xm7Var2.e;
                                boolean z3 = z2;
                                int i40 = (!z3 || jz7Var12 == null) ? 0 : jz7Var12.u;
                                aVar.l(jz7VarE8, 0, i40, 0.0f);
                                jz7 jz7Var13 = jz7Var11;
                                int i41 = (iB - (jz7Var13 != null ? jz7Var13.u : 0)) - ((!z3 || jz7Var12 == null) ? 0 : jz7Var12.u);
                                int iB2 = wk6.b(go7Var2.d() * density);
                                jz7 jz7Var14 = jz7Var6;
                                if (jz7Var14 != null) {
                                    jz7.a.t(aVar, jz7Var14, 0, Math.round(((i41 - jz7Var14.u) / 2.0f) * 1.0f) + i40);
                                }
                                int i42 = iC;
                                jz7 jz7Var15 = jz7Var7;
                                if (jz7Var12 != null) {
                                    if (z3) {
                                        f = density;
                                        iRound = 0;
                                    } else {
                                        f = density;
                                        iRound = xm7Var2.b ? Math.round(((i41 - jz7Var12.u) / 2.0f) * 1.0f) : iB2;
                                    }
                                    int i43 = z3 ? 0 : -(jz7Var12.u / 2);
                                    float f5 = fInvoke;
                                    int iD = vk6.d(iRound, f5, i43);
                                    if (z3) {
                                        aVar.l(jz7Var12, yea.e(bVar).a(jz7Var12.t, i42, layoutDirection), iD, 0.0f);
                                        i42 = i42;
                                    } else {
                                        float fE = eo7.e(go7Var2, layoutDirection) * f;
                                        float fD = eo7.d(go7Var2, layoutDirection) * f;
                                        if (jz7Var14 == null) {
                                            f2 = 0.0f;
                                            f3 = fE;
                                        } else {
                                            f2 = 0.0f;
                                            float f6 = jz7Var14.t;
                                            float f7 = fE - fU0;
                                            if (f7 < 0.0f) {
                                                f7 = 0.0f;
                                            }
                                            f3 = f6 + f7;
                                        }
                                        if (jz7Var15 == null) {
                                            f4 = fD;
                                        } else {
                                            float f8 = jz7Var15.t;
                                            float f9 = fD - fU0;
                                            if (f9 < f2) {
                                                f9 = f2;
                                            }
                                            f4 = f8 + f9;
                                        }
                                        tq5 tq5Var = tq5.t;
                                        aVar.l(jz7Var12, wk6.b(vk6.c(yea.d(bVar).a(jz7Var12.t, i42 - wk6.b(f3 + f4), layoutDirection) + (layoutDirection == tq5Var ? f3 : f4), yea.e(bVar).a(jz7Var12.t, i42 - wk6.b(fE + fD), layoutDirection) + (layoutDirection == tq5Var ? fE : fD), f5)), iD, f2);
                                    }
                                } else {
                                    i42 = i42;
                                    xm7Var2 = xm7Var2;
                                }
                                jz7 jz7Var16 = jz7Var4;
                                if (jz7Var16 != null) {
                                    i37 = i40;
                                    i38 = iB2;
                                    i39 = i41;
                                    xm7Var = xm7Var2;
                                    jz7.a.t(aVar, jz7Var16, jz7Var14 != null ? jz7Var14.t : 0, xm7.j(i37, xm7Var, i39, i38, jz7Var12, jz7Var16));
                                } else {
                                    i37 = i40;
                                    i38 = iB2;
                                    i39 = i41;
                                    xm7Var = xm7Var2;
                                }
                                int i44 = (jz7Var14 != null ? jz7Var14.t : 0) + (jz7Var16 != null ? jz7Var16.t : 0);
                                jz7 jz7Var17 = jz7VarE5;
                                jz7.a.t(aVar, jz7Var17, i44, xm7.j(i37, xm7Var, i39, i38, jz7Var12, jz7Var17));
                                jz7 jz7Var18 = jz7Var10;
                                if (jz7Var18 != null) {
                                    jz7.a.t(aVar, jz7Var18, i44, xm7.j(i37, xm7Var, i39, i38, jz7Var12, jz7Var18));
                                }
                                jz7 jz7Var19 = jz7Var8;
                                if (jz7Var19 != null) {
                                    jz7.a.t(aVar, jz7Var19, (i42 - (jz7Var15 != null ? jz7Var15.t : 0)) - jz7Var19.t, xm7.j(i37, xm7Var, i39, i38, jz7Var12, jz7Var19));
                                }
                                if (jz7Var15 != null) {
                                    jz7.a.t(aVar, jz7Var15, i42 - jz7Var15.t, Math.round(((i39 - jz7Var15.u) / 2.0f) * 1.0f) + i37);
                                }
                                if (jz7Var13 != null) {
                                    jz7.a.t(aVar, jz7Var13, 0, i37 + i39);
                                }
                                return g2b.a;
                            }
                        });
                    }
                    i36++;
                    iB = iB;
                    z = z;
                }
                ab6.b("Collection contains no element matching the predicate.");
                fl.a();
                return null;
            }
            i19 = i20 + 1;
            iMax5 = i21;
            gl8Var3 = gl8Var3;
            j2 = j;
            cl6Var14 = cl6Var14;
            list2 = list2;
            iN1 = iN1;
        }
        ab6.b("Collection contains no element matching the predicate.");
        fl.a();
        return null;
    }

    @Override // defpackage.fl6
    public final int e(qj5 qj5Var, List<? extends pj5> list, int i) {
        return h(qj5Var, list, i, new wm7());
    }

    public final int f(qj5 qj5Var, List<? extends pj5> list, int i, ci4<? super pj5, ? super Integer, Integer> ci4Var) {
        pj5 pj5Var;
        int iB;
        int iIntValue;
        pj5 pj5Var2;
        int iIntValue2;
        pj5 pj5Var3;
        pj5 pj5Var4;
        int iIntValue3;
        pj5 pj5Var5;
        int iIntValue4;
        pj5 pj5Var6;
        pj5 pj5Var7;
        xm7 xm7Var = this;
        float fInvoke = xm7Var.d.invoke();
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                pj5Var = null;
                break;
            }
            pj5Var = list.get(i2);
            if (xj5.a(uo0.a(pj5Var), "Leading")) {
                break;
            }
            i2++;
        }
        pj5 pj5Var8 = pj5Var;
        if (pj5Var8 != null) {
            iB = uo0.b(i, pj5Var8.C(Integer.MAX_VALUE));
            iIntValue = ci4Var.invoke(pj5Var8, Integer.valueOf(i)).intValue();
        } else {
            iB = i;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                pj5Var2 = null;
                break;
            }
            pj5Var2 = list.get(i3);
            if (xj5.a(uo0.a(pj5Var2), "Trailing")) {
                break;
            }
            i3++;
        }
        pj5 pj5Var9 = pj5Var2;
        if (pj5Var9 != null) {
            iB = uo0.b(iB, pj5Var9.C(Integer.MAX_VALUE));
            iIntValue2 = ci4Var.invoke(pj5Var9, Integer.valueOf(i)).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                pj5Var3 = null;
                break;
            }
            pj5Var3 = list.get(i4);
            if (xj5.a(uo0.a(pj5Var3), "Label")) {
                break;
            }
            i4++;
        }
        pj5 pj5Var10 = pj5Var3;
        int iIntValue5 = pj5Var10 != null ? ci4Var.invoke(pj5Var10, Integer.valueOf(vk6.d(iB, fInvoke, i))).intValue() : 0;
        int size4 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size4) {
                pj5Var4 = null;
                break;
            }
            pj5Var4 = list.get(i5);
            if (xj5.a(uo0.a(pj5Var4), "Prefix")) {
                break;
            }
            i5++;
        }
        pj5 pj5Var11 = pj5Var4;
        if (pj5Var11 != null) {
            iIntValue3 = ci4Var.invoke(pj5Var11, Integer.valueOf(iB)).intValue();
            iB = uo0.b(iB, pj5Var11.C(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size5) {
                pj5Var5 = null;
                break;
            }
            pj5Var5 = list.get(i6);
            if (xj5.a(uo0.a(pj5Var5), "Suffix")) {
                break;
            }
            i6++;
        }
        pj5 pj5Var12 = pj5Var5;
        if (pj5Var12 != null) {
            iIntValue4 = ci4Var.invoke(pj5Var12, Integer.valueOf(iB)).intValue();
            iB = uo0.b(iB, pj5Var12.C(Integer.MAX_VALUE));
        } else {
            iIntValue4 = 0;
        }
        int size6 = list.size();
        int i7 = 0;
        while (i7 < size6) {
            pj5 pj5Var13 = list.get(i7);
            if (xj5.a(uo0.a(pj5Var13), "TextField")) {
                int iIntValue6 = ci4Var.invoke(pj5Var13, Integer.valueOf(iB)).intValue();
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        pj5Var6 = null;
                        break;
                    }
                    pj5Var6 = list.get(i8);
                    if (xj5.a(uo0.a(pj5Var6), "Hint")) {
                        break;
                    }
                    i8++;
                }
                pj5 pj5Var14 = pj5Var6;
                int iIntValue7 = pj5Var14 != null ? ci4Var.invoke(pj5Var14, Integer.valueOf(iB)).intValue() : 0;
                int size8 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size8) {
                        pj5Var7 = null;
                        break;
                    }
                    pj5Var7 = list.get(i9);
                    if (xj5.a(uo0.a(pj5Var7), "Supporting")) {
                        break;
                    }
                    i9++;
                }
                pj5 pj5Var15 = pj5Var7;
                return xm7Var.b(qj5Var, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue6, iIntValue5, iIntValue7, pj5Var15 != null ? ci4Var.invoke(pj5Var15, Integer.valueOf(i)).intValue() : 0, zx1.b(0, 0, 0, 0, 15), false, fInvoke);
            }
            i7++;
            iIntValue4 = iIntValue4;
            xm7Var = this;
            iIntValue3 = iIntValue3;
        }
        ab6.b("Collection contains no element matching the predicate.");
        fl.a();
        return 0;
    }

    @Override // defpackage.fl6
    public final int g(qj5 qj5Var, List<? extends pj5> list, int i) {
        return f(qj5Var, list, i, new vm7());
    }

    public final int h(qj5 qj5Var, List<? extends pj5> list, int i, ci4<? super pj5, ? super Integer, Integer> ci4Var) {
        pj5 pj5Var;
        pj5 pj5Var2;
        pj5 pj5Var3;
        pj5 pj5Var4;
        pj5 pj5Var5;
        pj5 pj5Var6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            pj5 pj5Var7 = list.get(i2);
            if (xj5.a(uo0.a(pj5Var7), "TextField")) {
                int iIntValue = ci4Var.invoke(pj5Var7, Integer.valueOf(i)).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    pj5Var = null;
                    if (i3 >= size2) {
                        pj5Var2 = null;
                        break;
                    }
                    pj5Var2 = list.get(i3);
                    if (xj5.a(uo0.a(pj5Var2), "Label")) {
                        break;
                    }
                    i3++;
                }
                pj5 pj5Var8 = pj5Var2;
                int iIntValue2 = pj5Var8 != null ? ci4Var.invoke(pj5Var8, Integer.valueOf(i)).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        pj5Var3 = null;
                        break;
                    }
                    pj5Var3 = list.get(i4);
                    if (xj5.a(uo0.a(pj5Var3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                pj5 pj5Var9 = pj5Var3;
                int iIntValue3 = pj5Var9 != null ? ci4Var.invoke(pj5Var9, Integer.valueOf(i)).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        pj5Var4 = null;
                        break;
                    }
                    pj5Var4 = list.get(i5);
                    if (xj5.a(uo0.a(pj5Var4), "Leading")) {
                        break;
                    }
                    i5++;
                }
                pj5 pj5Var10 = pj5Var4;
                int iIntValue4 = pj5Var10 != null ? ci4Var.invoke(pj5Var10, Integer.valueOf(i)).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        pj5Var5 = null;
                        break;
                    }
                    pj5Var5 = list.get(i6);
                    if (xj5.a(uo0.a(pj5Var5), "Prefix")) {
                        break;
                    }
                    i6++;
                }
                pj5 pj5Var11 = pj5Var5;
                int iIntValue5 = pj5Var11 != null ? ci4Var.invoke(pj5Var11, Integer.valueOf(i)).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        pj5Var6 = null;
                        break;
                    }
                    pj5Var6 = list.get(i7);
                    if (xj5.a(uo0.a(pj5Var6), "Suffix")) {
                        break;
                    }
                    i7++;
                }
                pj5 pj5Var12 = pj5Var6;
                int iIntValue6 = pj5Var12 != null ? ci4Var.invoke(pj5Var12, Integer.valueOf(i)).intValue() : 0;
                int size7 = list.size();
                for (int i8 = 0; i8 < size7; i8++) {
                    pj5 pj5Var13 = list.get(i8);
                    if (xj5.a(uo0.a(pj5Var13), "Hint")) {
                        pj5Var = pj5Var13;
                        break;
                    }
                }
                pj5 pj5Var14 = pj5Var;
                return c(qj5Var, iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, pj5Var14 != null ? ci4Var.invoke(pj5Var14, Integer.valueOf(i)).intValue() : 0, zx1.b(0, 0, 0, 0, 15), this.d.invoke());
            }
        }
        ab6.b("Collection contains no element matching the predicate.");
        fl.a();
        return 0;
    }

    @Override // defpackage.fl6
    public final int i(qj5 qj5Var, List<? extends pj5> list, int i) {
        return f(qj5Var, list, i, new sm7(0));
    }
}
