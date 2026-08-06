package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qfa implements fl6 {
    public final boolean a;
    public final jfa.b b;
    public final yea.b c;
    public final go7 d;
    public final float e;

    public qfa(boolean z, jfa.b bVar, yea.b bVar2, go7 go7Var, float f) {
        this.a = z;
        this.b = bVar;
        this.c = bVar2;
        this.d = go7Var;
        this.e = f;
    }

    public static int f(List list, int i, ci4 ci4Var) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (xj5.a(uo0.a((pj5) obj7), "TextField")) {
                int iIntValue = ((Number) ci4Var.invoke(obj7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (xj5.a(uo0.a((pj5) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                pj5 pj5Var = (pj5) obj2;
                int iIntValue2 = pj5Var != null ? ((Number) ci4Var.invoke(pj5Var, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (xj5.a(uo0.a((pj5) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                pj5 pj5Var2 = (pj5) obj3;
                int iIntValue3 = pj5Var2 != null ? ((Number) ci4Var.invoke(pj5Var2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (xj5.a(uo0.a((pj5) obj4), "Prefix")) {
                        break;
                    }
                    i5++;
                }
                pj5 pj5Var3 = (pj5) obj4;
                int iIntValue4 = pj5Var3 != null ? ((Number) ci4Var.invoke(pj5Var3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (xj5.a(uo0.a((pj5) obj5), "Suffix")) {
                        break;
                    }
                    i6++;
                }
                pj5 pj5Var4 = (pj5) obj5;
                int iIntValue5 = pj5Var4 != null ? ((Number) ci4Var.invoke(pj5Var4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (xj5.a(uo0.a((pj5) obj6), "Leading")) {
                        break;
                    }
                    i7++;
                }
                pj5 pj5Var5 = (pj5) obj6;
                int iIntValue6 = pj5Var5 != null ? ((Number) ci4Var.invoke(pj5Var5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                for (int i8 = 0; i8 < size7; i8++) {
                    Object obj8 = list.get(i8);
                    if (xj5.a(uo0.a((pj5) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                }
                pj5 pj5Var6 = (pj5) obj;
                int i9 = iIntValue4 + iIntValue5;
                return zx1.g(Math.max(iIntValue + i9, Math.max((pj5Var6 != null ? ((Number) ci4Var.invoke(pj5Var6, Integer.valueOf(i))).intValue() : 0) + i9, iIntValue2)) + iIntValue6 + iIntValue3, zx1.b(0, 0, 0, 0, 15));
            }
        }
        ab6.b("Collection contains no element matching the predicate.");
        fl.a();
        return 0;
    }

    public static final int h(qfa qfaVar, int i, int i2, jz7 jz7Var) {
        return qfaVar.a ? Math.round(((i - jz7Var.u) / 2.0f) * 1.0f) : i2;
    }

    @Override // defpackage.fl6
    public final int a(qj5 qj5Var, List<? extends pj5> list, int i) {
        return f(list, i, new mfa());
    }

    public final int b(qj5 qj5Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, boolean z, float f) {
        go7 go7Var = this.d;
        int iN1 = qj5Var.n1(go7Var.a() + go7Var.d());
        int[] iArr = {i7, i5, i6, z ? 0 : vk6.d(i2, f, 0)};
        for (int i9 = 0; i9 < 4; i9++) {
            i = Math.max(i, iArr[i9]);
        }
        int iMax = iN1 + ((i2 <= 0 || z) ? 0 : Math.max(qj5Var.n1(this.e * 2.0f), vk6.d(0, zy6.a.a(f), i2))) + i;
        if (!z) {
            i2 = 0;
        }
        return zx1.f(Math.max(i3, Math.max(i4, iMax)) + i2 + i8, j);
    }

    public final int c(qj5 qj5Var, List<? extends pj5> list, int i, ci4<? super pj5, ? super Integer, Integer> ci4Var) {
        pj5 pj5Var;
        int i2;
        int iIntValue;
        int iB;
        pj5 pj5Var2;
        int iIntValue2;
        pj5 pj5Var3;
        pj5 pj5Var4;
        int i3;
        pj5 pj5Var5;
        int i4;
        pj5 pj5Var6;
        pj5 pj5Var7;
        int size = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                pj5Var = null;
                break;
            }
            pj5Var = list.get(i5);
            if (xj5.a(uo0.a(pj5Var), "Leading")) {
                break;
            }
            i5++;
        }
        pj5 pj5Var8 = pj5Var;
        if (pj5Var8 != null) {
            i2 = i;
            iB = uo0.b(i2, pj5Var8.C(Integer.MAX_VALUE));
            iIntValue = ci4Var.invoke(pj5Var8, Integer.valueOf(i2)).intValue();
        } else {
            i2 = i;
            iIntValue = 0;
            iB = i2;
        }
        int size2 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                pj5Var2 = null;
                break;
            }
            pj5Var2 = list.get(i6);
            if (xj5.a(uo0.a(pj5Var2), "Trailing")) {
                break;
            }
            i6++;
        }
        pj5 pj5Var9 = pj5Var2;
        if (pj5Var9 != null) {
            iB = uo0.b(iB, pj5Var9.C(Integer.MAX_VALUE));
            iIntValue2 = ci4Var.invoke(pj5Var9, Integer.valueOf(i2)).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                pj5Var3 = null;
                break;
            }
            pj5Var3 = list.get(i7);
            if (xj5.a(uo0.a(pj5Var3), "Label")) {
                break;
            }
            i7++;
        }
        pj5 pj5Var10 = pj5Var3;
        int iIntValue3 = pj5Var10 != null ? ci4Var.invoke(pj5Var10, Integer.valueOf(iB)).intValue() : 0;
        int size4 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size4) {
                pj5Var4 = null;
                break;
            }
            pj5Var4 = list.get(i8);
            if (xj5.a(uo0.a(pj5Var4), "Prefix")) {
                break;
            }
            i8++;
        }
        pj5 pj5Var11 = pj5Var4;
        if (pj5Var11 != null) {
            int iIntValue4 = ci4Var.invoke(pj5Var11, Integer.valueOf(iB)).intValue();
            iB = uo0.b(iB, pj5Var11.C(Integer.MAX_VALUE));
            i3 = iIntValue4;
        } else {
            i3 = 0;
        }
        int size5 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size5) {
                pj5Var5 = null;
                break;
            }
            pj5Var5 = list.get(i9);
            if (xj5.a(uo0.a(pj5Var5), "Suffix")) {
                break;
            }
            i9++;
        }
        pj5 pj5Var12 = pj5Var5;
        if (pj5Var12 != null) {
            int iIntValue5 = ci4Var.invoke(pj5Var12, Integer.valueOf(iB)).intValue();
            iB = uo0.b(iB, pj5Var12.C(Integer.MAX_VALUE));
            i4 = iIntValue5;
        } else {
            i4 = 0;
        }
        int size6 = list.size();
        for (int i10 = 0; i10 < size6; i10++) {
            pj5 pj5Var13 = list.get(i10);
            if (xj5.a(uo0.a(pj5Var13), "TextField")) {
                int iIntValue6 = ci4Var.invoke(pj5Var13, Integer.valueOf(iB)).intValue();
                int size7 = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size7) {
                        pj5Var6 = null;
                        break;
                    }
                    pj5Var6 = list.get(i11);
                    if (xj5.a(uo0.a(pj5Var6), "Hint")) {
                        break;
                    }
                    i11++;
                }
                pj5 pj5Var14 = pj5Var6;
                int iIntValue7 = pj5Var14 != null ? ci4Var.invoke(pj5Var14, Integer.valueOf(iB)).intValue() : 0;
                int size8 = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size8) {
                        pj5Var7 = null;
                        break;
                    }
                    pj5Var7 = list.get(i12);
                    if (xj5.a(uo0.a(pj5Var7), "Supporting")) {
                        break;
                    }
                    i12++;
                }
                pj5 pj5Var15 = pj5Var7;
                return b(qj5Var, iIntValue6, iIntValue3, iIntValue, iIntValue2, i3, i4, iIntValue7, pj5Var15 != null ? ci4Var.invoke(pj5Var15, Integer.valueOf(i2)).intValue() : 0, zx1.b(0, 0, 0, 0, 15), false, this.c.invoke());
            }
        }
        ab6.b("Collection contains no element matching the predicate.");
        fl.a();
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v0, types: [gl6] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [T] */
    /* JADX WARN: Type inference failed for: r7v60 */
    @Override // defpackage.fl6
    public final gl6 d(final hl6 hl6Var, List<? extends cl6> list, long j) {
        jz7 jz7Var;
        cl6 cl6Var;
        cl6 cl6Var2;
        cl6 cl6Var3;
        cl6 cl6Var4;
        jz7 jz7Var2;
        cl6 cl6Var5;
        int i;
        cl6 cl6Var6;
        Object obj;
        gl8 gl8Var;
        int i2;
        int i3;
        int i4;
        jz7 jz7Var3;
        int i5;
        float f;
        int i6;
        float fInvoke = this.c.invoke();
        go7 go7Var = this.d;
        final int iN1 = hl6Var.n1(go7Var.d());
        int iN2 = hl6Var.n1(go7Var.a());
        long jA = xx1.a(0, 0, 0, 0, 10, j);
        int size = list.size();
        int i7 = 0;
        while (true) {
            jz7Var = null;
            if (i7 >= size) {
                cl6Var = null;
                break;
            }
            cl6Var = list.get(i7);
            if (xj5.a(yq5.c(cl6Var), "Leading")) {
                break;
            }
            i7++;
        }
        cl6 cl6Var7 = cl6Var;
        jz7 jz7VarE = cl6Var7 != null ? cl6Var7.E(jA) : null;
        int i8 = jz7VarE != null ? jz7VarE.t : 0;
        int iMax = Math.max(0, jz7VarE != null ? jz7VarE.u : 0);
        int size2 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size2) {
                cl6Var2 = null;
                break;
            }
            cl6Var2 = list.get(i9);
            if (xj5.a(yq5.c(cl6Var2), "Trailing")) {
                break;
            }
            i9++;
        }
        cl6 cl6Var8 = cl6Var2;
        jz7 jz7VarE2 = cl6Var8 != null ? cl6Var8.E(zx1.j(-i8, 0, 2, jA)) : null;
        int i10 = i8 + (jz7VarE2 != null ? jz7VarE2.t : 0);
        int iMax2 = Math.max(iMax, jz7VarE2 != null ? jz7VarE2.u : 0);
        int size3 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size3) {
                cl6Var3 = null;
                break;
            }
            cl6Var3 = list.get(i11);
            if (xj5.a(yq5.c(cl6Var3), "Prefix")) {
                break;
            }
            i11++;
        }
        cl6 cl6Var9 = cl6Var3;
        jz7 jz7VarE3 = cl6Var9 != null ? cl6Var9.E(zx1.j(-i10, 0, 2, jA)) : null;
        int i12 = (jz7VarE3 != null ? jz7VarE3.t : 0) + i10;
        int iMax3 = Math.max(iMax2, jz7VarE3 != null ? jz7VarE3.u : 0);
        int size4 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size4) {
                cl6Var4 = null;
                break;
            }
            cl6Var4 = list.get(i13);
            if (xj5.a(yq5.c(cl6Var4), "Suffix")) {
                break;
            }
            i13++;
        }
        cl6 cl6Var10 = cl6Var4;
        jz7 jz7VarE4 = cl6Var10 != null ? cl6Var10.E(zx1.j(-i12, 0, 2, jA)) : null;
        int i14 = i12 + (jz7VarE4 != null ? jz7VarE4.t : 0);
        int iMax4 = Math.max(iMax3, jz7VarE4 != null ? jz7VarE4.u : 0);
        boolean z = false;
        int size5 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size5) {
                jz7Var2 = jz7VarE3;
                cl6Var5 = null;
                break;
            }
            cl6Var5 = list.get(i15);
            jz7Var2 = jz7VarE3;
            if (xj5.a(yq5.c(cl6Var5), "Label")) {
                break;
            }
            i15++;
            jz7VarE3 = jz7Var2;
        }
        cl6 cl6Var11 = cl6Var5;
        gl8 gl8Var2 = new gl8();
        gl8Var2.t = cl6Var11 != null ? cl6Var11.E(zx1.i(jA, -i14, -iN2)) : 0;
        int size6 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size6) {
                i = iN2;
                cl6Var6 = null;
                break;
            }
            cl6Var6 = list.get(i16);
            i = iN2;
            if (xj5.a(yq5.c(cl6Var6), "Supporting")) {
                break;
            }
            i16++;
            iN2 = i;
        }
        cl6 cl6Var12 = cl6Var6;
        int iC0 = cl6Var12 != null ? cl6Var12.c0(xx1.j(j)) : 0;
        jz7 jz7Var4 = (jz7) gl8Var2.t;
        int i17 = (jz7Var4 != null ? jz7Var4.u : 0) + 0 + iN1;
        final jz7 jz7Var5 = jz7VarE;
        cl6 cl6Var13 = cl6Var12;
        jz7 jz7Var6 = jz7Var2;
        float f2 = fInvoke;
        jz7 jz7Var7 = jz7Var6;
        long jI = zx1.i(xx1.a(0, 0, 0, 0, 11, j), -i14, ((-i17) - i) - iC0);
        int size7 = list.size();
        int i18 = 0;
        while (i18 < size7) {
            cl6 cl6Var14 = list.get(i18);
            if (xj5.a(yq5.c(cl6Var14), "TextField")) {
                jz7 jz7VarE5 = cl6Var14.E(jI);
                long jA2 = xx1.a(0, 0, 0, 0, 14, jI);
                int size8 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size8) {
                        obj = jz7Var;
                        break;
                    }
                    obj = list.get(i19);
                    if (xj5.a(yq5.c((cl6) obj), "Hint")) {
                        break;
                    }
                    i19++;
                }
                cl6 cl6Var15 = (cl6) obj;
                jz7 jz7VarE6 = cl6Var15 != null ? cl6Var15.E(jA2) : jz7Var;
                int iMax5 = Math.max(iMax4, Math.max(jz7VarE5.u, jz7VarE6 != null ? jz7VarE6.u : 0) + i17 + i);
                int i20 = jz7Var5 != null ? jz7Var5.t : 0;
                int i21 = jz7VarE2 != null ? jz7VarE2.t : 0;
                int i22 = jz7Var7 != null ? jz7Var7.t : 0;
                int i23 = jz7VarE4 != null ? jz7VarE4.t : 0;
                int i24 = jz7VarE5.t;
                jz7 jz7Var8 = (jz7) gl8Var2.t;
                int i25 = i22 + i23;
                final int iG = zx1.g(Math.max(i24 + i25, Math.max((jz7VarE6 != null ? jz7VarE6.t : 0) + i25, jz7Var8 != null ? jz7Var8.t : 0)) + i20 + i21, j);
                final jz7 jz7VarE7 = cl6Var13 != null ? cl6Var13.E(xx1.a(0, iG, 0, 0, 9, zx1.j(0, -iMax5, 1, jA))) : jz7Var;
                int i26 = jz7VarE7 != null ? jz7VarE7.u : 0;
                jz7 jz7Var9 = jz7VarE5;
                int i27 = jz7Var9.u;
                jz7 jz7Var10 = (jz7) gl8Var2.t;
                int i28 = jz7Var10 != null ? jz7Var10.u : 0;
                int i29 = jz7Var5 != null ? jz7Var5.u : 0;
                int i30 = jz7VarE2 != null ? jz7VarE2.u : 0;
                int i31 = jz7Var7 != null ? jz7Var7.u : 0;
                final jz7 jz7Var11 = jz7VarE2;
                if (jz7VarE4 != null) {
                    i2 = jz7VarE4.u;
                    gl8Var = gl8Var2;
                } else {
                    gl8Var = r3;
                    i2 = 0;
                }
                final gl8 gl8Var3 = gl8Var;
                if (jz7VarE6 != null) {
                    int i32 = i30;
                    i4 = jz7VarE6.u;
                    i3 = i32;
                } else {
                    i3 = i30;
                    i4 = 0;
                }
                if (jz7VarE7 != null) {
                    jz7Var3 = jz7VarE6;
                    i5 = jz7VarE7.u;
                    f = f2;
                    i6 = 0;
                } else {
                    jz7Var3 = jz7VarE6;
                    i5 = 0;
                    f = f2;
                    i6 = 0;
                }
                final int iB = b(hl6Var, i27, i28, i29, i3, i31, i2, i4, i5, j, z, f);
                final int i33 = (iB - i26) + 0;
                int size9 = list.size();
                int i34 = i6;
                while (i34 < size9) {
                    cl6 cl6Var16 = list.get(i34);
                    if (xj5.a(yq5.c(cl6Var16), "Container")) {
                        final jz7 jz7VarE8 = cl6Var16.E(zx1.a(iG != 2147483647 ? iG : i6, iG, i33 != Integer.MAX_VALUE ? i33 : i6, i33));
                        final boolean z2 = z;
                        final float f3 = f;
                        final jz7 jz7Var12 = jz7Var7;
                        final jz7 jz7Var13 = jz7VarE4;
                        final jz7 jz7Var14 = jz7Var9;
                        final jz7 jz7Var15 = jz7Var3;
                        return hl6Var.y0(iG, iB, if3.t, new oh4() { // from class: nfa
                            /* JADX WARN: Code duplicated, block: B:42:0x00d5  */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                int i35;
                                int iN3;
                                int i36;
                                int i37;
                                jz7.a aVar = (jz7.a) obj2;
                                gl8 gl8Var4 = gl8Var3;
                                T t = gl8Var4.t;
                                qfa qfaVar = this;
                                hl6 hl6Var2 = hl6Var;
                                int i38 = iG;
                                int i39 = iB;
                                jz7 jz7Var16 = jz7Var14;
                                jz7 jz7Var17 = jz7Var15;
                                jz7 jz7Var18 = jz7Var5;
                                jz7 jz7Var19 = jz7Var11;
                                jz7 jz7Var20 = jz7Var12;
                                jz7 jz7Var21 = jz7Var13;
                                jz7 jz7Var22 = jz7VarE8;
                                jz7 jz7Var23 = jz7VarE7;
                                if (t != 0) {
                                    boolean z3 = z2;
                                    int i40 = iN1;
                                    if (z3) {
                                        i35 = i40;
                                        iN3 = 0;
                                    } else {
                                        i35 = i40;
                                        if (qfaVar.a) {
                                            iN3 = Math.round(((i33 - ((jz7) t).u) / 2.0f) * 1.0f);
                                        } else {
                                            iN3 = hl6Var2.n1(qfaVar.e) + i35;
                                        }
                                    }
                                    int i41 = z3 ? 0 : i35;
                                    jz7 jz7Var24 = (jz7) gl8Var4.t;
                                    int i42 = i35 + (z3 ? 0 : jz7Var24.u);
                                    tq5 layoutDirection = hl6Var2.getLayoutDirection();
                                    jfa.b bVar = qfaVar.b;
                                    int i43 = z3 ? jz7Var24.u : 0;
                                    aVar.l(jz7Var22, 0, i43, 0.0f);
                                    int i44 = (i39 - (jz7Var23 != null ? jz7Var23.u : 0)) - (z3 ? jz7Var24.u : 0);
                                    if (jz7Var18 != null) {
                                        jz7.a.t(aVar, jz7Var18, 0, Math.round(((i44 - jz7Var18.u) / 2.0f) * 1.0f) + i43);
                                    }
                                    float f4 = f3;
                                    int iD = vk6.d(iN3, f4, i41);
                                    if (z3) {
                                        aVar.l(jz7Var24, yea.e(bVar).a(jz7Var24.t, i38, layoutDirection), iD, 0.0f);
                                        i37 = i38;
                                    } else {
                                        if (layoutDirection == tq5.t) {
                                            if (jz7Var18 != null) {
                                                i36 = jz7Var18.t;
                                            } else {
                                                i36 = 0;
                                            }
                                        } else if (jz7Var19 != null) {
                                            i36 = jz7Var19.t;
                                        } else {
                                            i36 = 0;
                                        }
                                        int i45 = i36;
                                        i37 = i38;
                                        aVar.l(jz7Var24, vk6.d(yea.d(bVar).a(jz7Var24.t, (i38 - (jz7Var18 != null ? jz7Var18.t : 0)) - (jz7Var19 != null ? jz7Var19.t : 0), layoutDirection) + i45, f4, yea.e(bVar).a(jz7Var24.t, (i37 - (jz7Var18 != null ? jz7Var18.t : 0)) - (jz7Var19 != null ? jz7Var19.t : 0), layoutDirection) + i45), iD, 0.0f);
                                    }
                                    if (jz7Var20 != null) {
                                        jz7.a.t(aVar, jz7Var20, jz7Var18 != null ? jz7Var18.t : 0, i43 + i42);
                                    }
                                    int i46 = (jz7Var18 != null ? jz7Var18.t : 0) + (jz7Var20 != null ? jz7Var20.t : 0);
                                    int i47 = i43 + i42;
                                    jz7.a.t(aVar, jz7Var16, i46, i47);
                                    if (jz7Var17 != null) {
                                        jz7.a.t(aVar, jz7Var17, i46, i47);
                                    }
                                    if (jz7Var21 != null) {
                                        jz7.a.t(aVar, jz7Var21, (i37 - (jz7Var19 != null ? jz7Var19.t : 0)) - jz7Var21.t, i47);
                                    }
                                    if (jz7Var19 != null) {
                                        jz7.a.t(aVar, jz7Var19, i37 - jz7Var19.t, Math.round(((i44 - jz7Var19.u) / 2.0f) * 1.0f) + i43);
                                    }
                                    if (jz7Var23 != null) {
                                        jz7.a.t(aVar, jz7Var23, 0, i43 + i44);
                                    }
                                } else {
                                    float density = hl6Var2.getDensity();
                                    jz7.a.q(aVar, jz7Var22, 0L);
                                    int i48 = i39 - (jz7Var23 != null ? jz7Var23.u : 0);
                                    int iB2 = wk6.b(qfaVar.d.d() * density);
                                    if (jz7Var18 != null) {
                                        jz7.a.t(aVar, jz7Var18, 0, Math.round(((i48 - jz7Var18.u) / 2.0f) * 1.0f));
                                    }
                                    if (jz7Var20 != null) {
                                        jz7.a.t(aVar, jz7Var20, jz7Var18 != null ? jz7Var18.t : 0, qfa.h(qfaVar, i48, iB2, jz7Var20));
                                    }
                                    int i49 = (jz7Var18 != null ? jz7Var18.t : 0) + (jz7Var20 != null ? jz7Var20.t : 0);
                                    jz7.a.t(aVar, jz7Var16, i49, qfa.h(qfaVar, i48, iB2, jz7Var16));
                                    if (jz7Var17 != null) {
                                        jz7.a.t(aVar, jz7Var17, i49, qfa.h(qfaVar, i48, iB2, jz7Var17));
                                    }
                                    if (jz7Var21 != null) {
                                        jz7.a.t(aVar, jz7Var21, (i38 - (jz7Var19 != null ? jz7Var19.t : 0)) - jz7Var21.t, qfa.h(qfaVar, i48, iB2, jz7Var21));
                                    }
                                    if (jz7Var19 != null) {
                                        jz7.a.t(aVar, jz7Var19, i38 - jz7Var19.t, Math.round(((i48 - jz7Var19.u) / 2.0f) * 1.0f));
                                    }
                                    if (jz7Var23 != null) {
                                        jz7.a.t(aVar, jz7Var23, 0, i48);
                                    }
                                }
                                return g2b.a;
                            }
                        });
                    }
                    i34++;
                    jz7VarE7 = jz7VarE7;
                    jz7Var9 = jz7Var9;
                }
                ab6.b("Collection contains no element matching the predicate.");
                fl.a();
                return jz7Var;
            }
            i18++;
            f2 = f2;
            jz7Var7 = jz7Var7;
            z = z;
            jz7VarE4 = jz7VarE4;
            jz7VarE2 = jz7VarE2;
            jz7Var = jz7Var;
            jI = jI;
            cl6Var13 = cl6Var13;
        }
        ?? r28 = jz7Var;
        ab6.b("Collection contains no element matching the predicate.");
        fl.a();
        return r28;
    }

    @Override // defpackage.fl6
    public final int e(qj5 qj5Var, List<? extends pj5> list, int i) {
        return f(list, i, new lfa());
    }

    @Override // defpackage.fl6
    public final int g(qj5 qj5Var, List<? extends pj5> list, int i) {
        return c(qj5Var, list, i, new pfa());
    }

    @Override // defpackage.fl6
    public final int i(qj5 qj5Var, List<? extends pj5> list, int i) {
        return c(qj5Var, list, i, new ofa());
    }
}
