package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a84 implements f07, y74 {
    public final c30.e a;
    public final c30.l b;
    public final float c;
    public final nb2.b d;
    public final float e;
    public final w74 f;

    public a84(c30.e eVar, c30.l lVar, float f, nb2.b bVar, float f2, w74 w74Var) {
        this.a = eVar;
        this.b = lVar;
        this.c = f;
        this.d = bVar;
        this.e = f2;
        this.f = w74Var;
    }

    @Override // defpackage.f07
    public final int a(qj5 qj5Var, List<? extends List<? extends pj5>> list, int i) {
        List list2 = (List) th1.B(1, list);
        pj5 pj5Var = list2 != null ? (pj5) th1.A(list2) : null;
        List list3 = (List) th1.B(2, list);
        this.f.b(pj5Var, list3 != null ? (pj5) th1.A(list3) : null, zx1.b(0, 0, 0, i, 7));
        List list4 = (List) th1.A(list);
        if (list4 == null) {
            list4 = hf3.t;
        }
        int iN1 = qj5Var.n1(this.c);
        int size = list4.size();
        int i2 = 0;
        int iMax = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < size) {
            int iC = ((pj5) list4.get(i2)).C(i) + iN1;
            int i5 = i2 + 1;
            if (i5 - i3 == Integer.MAX_VALUE || i5 == list4.size()) {
                iMax = Math.max(iMax, (i4 + iC) - iN1);
                i3 = i2;
                i4 = 0;
            } else {
                i4 += iC;
            }
            i2 = i5;
        }
        return iMax;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x011f  */
    /* JADX WARN: Code duplicated, block: B:45:0x012b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0149  */
    /* JADX WARN: Code duplicated, block: B:49:0x0161  */
    /* JADX WARN: Code duplicated, block: B:52:0x016b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0174  */
    /* JADX WARN: Code duplicated, block: B:56:0x0180  */
    /* JADX WARN: Code duplicated, block: B:57:0x018a  */
    /* JADX WARN: Code duplicated, block: B:60:0x01cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [a84, y74] */
    /* JADX WARN: Type inference failed for: r0v3, types: [y74] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14, types: [T] */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r13v18, types: [T, jz7] */
    /* JADX WARN: Type inference failed for: r1v31, types: [T, jz7] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v37, types: [cl6, pj5] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r56v3, types: [pj5] */
    /* JADX WARN: Type inference failed for: r8v3, types: [jz7[]] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:67:0x020b
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // defpackage.f07
    public final defpackage.gl6 d(defpackage.hl6 r55, java.util.List<? extends java.util.List<? extends defpackage.cl6>> r56, long r57) {
        /*
            Method dump skipped, instruction units count: 1247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a84.d(hl6, java.util.List, long):gl6");
    }

    /* JADX WARN: Code duplicated, block: B:132:0x026a  */
    /* JADX WARN: Code duplicated, block: B:145:0x026e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x025a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0090  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.f07
    public final int e(qj5 qj5Var, List<? extends List<? extends pj5>> list, int i) {
        int i2;
        int[] iArr;
        int i3;
        long jA;
        int i4;
        sf5 sf5Var;
        t74.a aVar;
        int i5 = 1;
        List list2 = (List) th1.B(1, list);
        pj5 pj5Var = list2 != null ? (pj5) th1.A(list2) : null;
        List list3 = (List) th1.B(2, list);
        int i6 = 0;
        this.f.b(pj5Var, list3 != null ? (pj5) th1.A(list3) : null, zx1.b(0, 0, 0, i, 7));
        List list4 = (List) th1.A(list);
        if (list4 == null) {
            list4 = hf3.t;
        }
        int iN1 = qj5Var.n1(this.c);
        int iN2 = qj5Var.n1(this.e);
        if (list4.isEmpty()) {
            return 0;
        }
        int size = list4.size();
        int[] iArr2 = new int[size];
        int size2 = list4.size();
        int[] iArr3 = new int[size2];
        int size3 = list4.size();
        for (int i7 = 0; i7 < size3; i7++) {
            pj5 pj5Var2 = (pj5) list4.get(i7);
            int iA = pj5Var2.A(i);
            iArr2[i7] = iA;
            iArr3[i7] = pj5Var2.c0(iA);
        }
        int size4 = list4.size();
        w74 w74Var = this.f;
        t74.a aVar2 = t74.a.w;
        int i8 = Integer.MAX_VALUE;
        if (Integer.MAX_VALUE >= size4 || !((aVar = w74Var.a) == t74.a.v || aVar == aVar2)) {
            if (Integer.MAX_VALUE >= list4.size()) {
                w74Var.getClass();
                i2 = w74Var.a == aVar2 ? 1 : 0;
            }
        }
        int iMin = Math.min(Integer.MAX_VALUE - i2, list4.size());
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += iArr2[i10];
        }
        int size5 = ((list4.size() - 1) * iN1) + i9;
        if (size2 != 0) {
            int i11 = iArr3[0];
            int i12 = size2 - 1;
            if (1 <= i12) {
                int i13 = 1;
                while (true) {
                    int i14 = iArr3[i13];
                    if (i11 < i14) {
                        i11 = i14;
                    }
                    if (i13 == i12) {
                        break;
                    }
                    i13++;
                }
            }
            if (size != 0) {
                int i15 = iArr2[0];
                int i16 = size - 1;
                if (1 <= i16) {
                    int i17 = 1;
                    while (true) {
                        int i18 = iArr2[i17];
                        if (i15 < i18) {
                            i15 = i18;
                        }
                        if (i17 == i16) {
                            break;
                        }
                        i17++;
                    }
                }
                int i19 = size5;
                while (i15 <= i19 && i11 != i) {
                    int i20 = (i15 + i19) / 2;
                    int i21 = s74.a;
                    if (list4.isEmpty()) {
                        jA = sf5.a(i6, i6);
                        iArr = iArr2;
                    } else {
                        int i22 = i8;
                        o74 o74Var = new o74(w74Var, zx1.a(i6, i20, i6, i22), iN1, iN2);
                        pj5 pj5Var3 = (pj5) th1.B(i6, list4);
                        int i23 = pj5Var3 != null ? iArr3[i6] : i6;
                        int i24 = pj5Var3 != null ? iArr2[i6] : i6;
                        iArr = iArr2;
                        int i25 = 0;
                        if (o74Var.b(list4.size() > i5 ? i5 : 0, 0, sf5.a(i20, i22), pj5Var3 == null ? null : new sf5(sf5.a(i24, i23)), 0, 0, 0, false, false).b) {
                            sf5 sf5VarA = w74Var.a(0, pj5Var3 != null, 0);
                            jA = sf5.a(sf5VarA != null ? (int) (sf5VarA.a & 4294967295L) : 0, 0);
                        } else {
                            int size6 = list4.size();
                            int i26 = 0;
                            int i27 = 0;
                            int i28 = 0;
                            int i29 = i20;
                            int i30 = 0;
                            int i31 = 0;
                            while (true) {
                                if (i26 >= size6) {
                                    list4 = list4;
                                    iArr3 = iArr3;
                                    i3 = i27;
                                    break;
                                }
                                int i32 = i29 - i24;
                                i3 = i26 + 1;
                                int iMax = Math.max(i31, i23);
                                pj5 pj5Var4 = (pj5) th1.B(i3, list4);
                                i23 = pj5Var4 != null ? iArr3[i3] : 0;
                                int i33 = pj5Var4 != null ? iArr[i3] + iN1 : 0;
                                boolean z = i26 + 2 < list4.size();
                                int i34 = i3 - i28;
                                int i35 = i30;
                                long jA2 = sf5.a(i32, Integer.MAX_VALUE);
                                if (pj5Var4 == null) {
                                    i4 = i33;
                                    sf5Var = null;
                                } else {
                                    i4 = i33;
                                    sf5Var = new sf5(sf5.a(i4, i23));
                                }
                                o74.b bVarB = o74Var.b(z, i34, jA2, sf5Var, i35, i25, iMax, false, false);
                                if (bVarB.a) {
                                    int i36 = iMax + iN2 + i25;
                                    o74.a aVarA = o74Var.a(bVarB, pj5Var4 != null, i35, i36, i32, i34);
                                    int i37 = i4 - iN1;
                                    i30 = i35 + 1;
                                    if (bVarB.b) {
                                        if (aVarA != null) {
                                            long j = aVarA.c;
                                            if (!aVarA.d) {
                                                i36 = ((int) (j & 4294967295L)) + iN2 + i36;
                                            }
                                        }
                                        i25 = i36;
                                        break;
                                    }
                                    i28 = i3;
                                    i29 = i20;
                                    i24 = i37;
                                    i25 = i36;
                                    i31 = 0;
                                } else {
                                    i24 = i4;
                                    i29 = i32;
                                    i30 = i35;
                                    i31 = iMax;
                                }
                                i26 = i3;
                                i27 = i26;
                                iArr3 = iArr3;
                                list4 = list4;
                            }
                            jA = sf5.a(i25 - iN2, i3);
                        }
                        i11 = (int) (jA >> 32);
                        int i38 = (int) (jA & 4294967295L);
                        if (i11 <= i || i38 < iMin) {
                            i15 = i20 + 1;
                            if (i15 > i19) {
                                return i15;
                            }
                        } else {
                            if (i11 >= i) {
                                return i20;
                            }
                            i19 = i20 - 1;
                        }
                        iArr2 = iArr;
                        size5 = i20;
                        iArr3 = iArr3;
                        list4 = list4;
                        i5 = 1;
                        i6 = 0;
                        i8 = Integer.MAX_VALUE;
                    }
                    iArr3 = iArr3;
                    i11 = (int) (jA >> 32);
                    int i39 = (int) (jA & 4294967295L);
                    if (i11 <= i) {
                        i15 = i20 + 1;
                        if (i15 > i19) {
                            return i15;
                        }
                    } else {
                        i15 = i20 + 1;
                        if (i15 > i19) {
                            return i15;
                        }
                    }
                    iArr2 = iArr;
                    size5 = i20;
                    iArr3 = iArr3;
                    list4 = list4;
                    i5 = 1;
                    i6 = 0;
                    i8 = Integer.MAX_VALUE;
                }
                return size5;
            }
            vl.b();
        } else {
            vl.b();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a84)) {
            return false;
        }
        a84 a84Var = (a84) obj;
        return this.a.equals(a84Var.a) && this.b.equals(a84Var.b) && y43.e(this.c, a84Var.c) && this.d.equals(a84Var.d) && y43.e(this.e, a84Var.e) && xj5.a(this.f, a84Var.f);
    }

    @Override // defpackage.f07
    public final int g(qj5 qj5Var, List<? extends List<? extends pj5>> list, int i) {
        List list2 = (List) th1.B(1, list);
        pj5 pj5Var = list2 != null ? (pj5) th1.A(list2) : null;
        List list3 = (List) th1.B(2, list);
        this.f.b(pj5Var, list3 != null ? (pj5) th1.A(list3) : null, zx1.b(0, i, 0, 0, 13));
        List list4 = (List) th1.A(list);
        if (list4 == null) {
            list4 = hf3.t;
        }
        return o(list4, i, qj5Var.n1(this.c), qj5Var.n1(this.e), this.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + os2.a(Integer.MAX_VALUE, os2.a(Integer.MAX_VALUE, h44.a((this.d.a.hashCode() + h44.a((this.b.hashCode() + ((this.a.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, this.c, 31)) * 31, this.e, 31), 31), 31);
    }

    @Override // defpackage.f07
    public final int i(qj5 qj5Var, List<? extends List<? extends pj5>> list, int i) {
        List list2 = (List) th1.B(1, list);
        pj5 pj5Var = list2 != null ? (pj5) th1.A(list2) : null;
        List list3 = (List) th1.B(2, list);
        this.f.b(pj5Var, list3 != null ? (pj5) th1.A(list3) : null, zx1.b(0, i, 0, 0, 13));
        List list4 = (List) th1.A(list);
        if (list4 == null) {
            list4 = hf3.t;
        }
        return o(list4, i, qj5Var.n1(this.c), qj5Var.n1(this.e), this.f);
    }

    @Override // defpackage.y74
    public final nb2 k() {
        return this.d;
    }

    @Override // defpackage.y74
    public final c30.e l() {
        return this.a;
    }

    @Override // defpackage.y74
    public final c30.l m() {
        return this.b;
    }

    @Override // defpackage.y74
    public final boolean n() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r18v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v0, types: [o74] */
    public final int o(List list, int i, int i2, int i3, w74 w74Var) {
        long jA;
        int i4 = 0;
        if (list.isEmpty()) {
            jA = sf5.a(0, 0);
        } else {
            int i5 = Integer.MAX_VALUE;
            ?? o74Var = new o74(w74Var, zx1.a(0, i, 0, Integer.MAX_VALUE), i2, i3);
            pj5 pj5Var = (pj5) th1.B(0, list);
            int iC0 = pj5Var != null ? pj5Var.c0(i) : 0;
            int iA = pj5Var != null ? pj5Var.A(iC0) : 0;
            boolean z = true;
            if (list.size() <= 1) {
                z = false;
            }
            int i6 = 0;
            if (o74Var.b(z, 0, sf5.a(i, Integer.MAX_VALUE), pj5Var == null ? null : new sf5(sf5.a(iA, iC0)), 0, 0, 0, false, false).b) {
                sf5 sf5VarA = w74Var.a(0, pj5Var != null, 0);
                jA = sf5.a(sf5VarA != null ? (int) (sf5VarA.a & 4294967295L) : 0, 0);
            } else {
                int size = list.size();
                int i7 = i;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i8 < size) {
                    int i13 = i7 - iA;
                    int i14 = i8 + 1;
                    int iMax = Math.max(i12, iC0);
                    pj5 pj5Var2 = (pj5) th1.B(i14, list);
                    int iC1 = pj5Var2 != null ? pj5Var2.c0(i) : i4;
                    int iA2 = pj5Var2 != null ? pj5Var2.A(iC1) + i2 : i4;
                    int i15 = i14 - i10;
                    ?? r18 = i8 + 2 < list.size() ? z : i4;
                    int i16 = i11;
                    int i17 = iC1;
                    int i18 = iA2;
                    o74.b bVarB = o74Var.b(r18, i15, sf5.a(i13, i5), pj5Var2 == null ? null : new sf5(sf5.a(iA2, iC1)), i16, i6, iMax, false, false);
                    if (bVarB.a) {
                        int i19 = iMax + i3 + i6;
                        o74.a aVarA = o74Var.a(bVarB, pj5Var2 != null, i16, i19, i13, i15);
                        int i20 = i18 - i2;
                        i11 = i16 + 1;
                        if (bVarB.b) {
                            if (aVarA != null) {
                                long j = aVarA.c;
                                if (!aVarA.d) {
                                    i19 += ((int) (j & 4294967295L)) + i3;
                                }
                            }
                            i6 = i19;
                            i9 = i14;
                            break;
                        }
                        i10 = i14;
                        i6 = i19;
                        iA = i20;
                        i12 = 0;
                        i7 = i;
                    } else {
                        iA = i18;
                        i7 = i13;
                        i11 = i16;
                        i12 = iMax;
                    }
                    i8 = i14;
                    i9 = i8;
                    iC0 = i17;
                    i5 = Integer.MAX_VALUE;
                    i4 = 0;
                    z = true;
                }
                jA = sf5.a(i6 - i3, i9);
            }
        }
        return (int) (jA >> 32);
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.a + ", verticalArrangement=" + this.b + ", mainAxisSpacing=" + ((Object) y43.f(this.c)) + ", crossAxisAlignment=" + this.d + ", crossAxisArrangementSpacing=" + ((Object) y43.f(this.e)) + ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=" + this.f + ')';
    }
}
