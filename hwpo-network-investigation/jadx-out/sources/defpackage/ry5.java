package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ry5 implements rw5 {
    public final /* synthetic */ nz5 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ go7 c;
    public final /* synthetic */ mh4<iy5> d;
    public final /* synthetic */ c30.l e;
    public final /* synthetic */ c30.e f;
    public final /* synthetic */ t72 g;
    public final /* synthetic */ jo4 h;
    public final /* synthetic */ e1a i;
    public final /* synthetic */ di.b j;
    public final /* synthetic */ di.c k;

    public ry5(nz5 nz5Var, boolean z, go7 go7Var, eo5 eo5Var, c30.l lVar, c30.e eVar, t72 t72Var, jo4 jo4Var, e1a.a.C0074a c0074a, di.b bVar, di.c cVar) {
        this.a = nz5Var;
        this.b = z;
        this.c = go7Var;
        this.d = eo5Var;
        this.e = lVar;
        this.f = eVar;
        this.g = t72Var;
        this.h = jo4Var;
        this.i = c0074a;
        this.j = bVar;
        this.k = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:304:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:305:0x06da  */
    /* JADX WARN: Code duplicated, block: B:308:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:309:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:312:0x0707  */
    /* JADX WARN: Code duplicated, block: B:314:0x070f  */
    /* JADX WARN: Code duplicated, block: B:315:0x0716  */
    /* JADX WARN: Code duplicated, block: B:316:0x0718  */
    /* JADX WARN: Code duplicated, block: B:318:0x0720  */
    /* JADX WARN: Code duplicated, block: B:320:0x0728  */
    /* JADX WARN: Code duplicated, block: B:322:0x0730  */
    /* JADX WARN: Code duplicated, block: B:324:0x073b  */
    /* JADX WARN: Code duplicated, block: B:325:0x0741  */
    /* JADX WARN: Code duplicated, block: B:327:0x0749  */
    /* JADX WARN: Code duplicated, block: B:334:0x0774  */
    /* JADX WARN: Code duplicated, block: B:335:0x0779  */
    /* JADX WARN: Code duplicated, block: B:337:0x077c  */
    /* JADX WARN: Code duplicated, block: B:338:0x0781  */
    /* JADX WARN: Code duplicated, block: B:341:0x0788  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rw5
    public final gl6 a(tw5 tw5Var, long j) {
        float fMo1getSpacingD9Ej5fM;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f;
        List arrayList;
        int i8;
        int i9;
        List arrayList2;
        int i10;
        vv5<yy5> vv5Var;
        float f2;
        boolean z;
        boolean z2;
        int i11;
        yy5 yy5Var;
        int i12;
        yy5 yy5Var2;
        int i13;
        yy5 yy5Var3;
        Integer numValueOf;
        yy5 yy5Var4;
        Integer numValueOf2;
        int iIntValue;
        int iIntValue2;
        xy5 xy5Var;
        g4a g4aVar;
        yy5 yy5Var5;
        yy5 yy5Var6;
        int[] iArr;
        int i14;
        g4a g4aVar2 = tw5Var.u;
        nz5 nz5Var = this.a;
        nz5Var.t.getValue();
        boolean z3 = true;
        boolean z4 = nz5Var.b || g4aVar2.P0();
        fl7 fl7Var = fl7.u;
        fl7 fl7Var2 = fl7.t;
        boolean z5 = this.b;
        hnb.a(j, z5 ? fl7Var2 : fl7Var);
        go7 go7Var = this.c;
        int iN1 = z5 ? g4aVar2.n1(go7Var.b(g4aVar2.getLayoutDirection())) : g4aVar2.n1(eo7.e(go7Var, g4aVar2.getLayoutDirection()));
        int iN2 = z5 ? g4aVar2.n1(go7Var.c(g4aVar2.getLayoutDirection())) : g4aVar2.n1(eo7.d(go7Var, g4aVar2.getLayoutDirection()));
        int iN3 = g4aVar2.n1(go7Var.d());
        int iN4 = g4aVar2.n1(go7Var.a()) + iN3;
        int i15 = iN1 + iN2;
        int i16 = z5 ? iN4 : i15;
        int i17 = z5 ? iN3 : !z5 ? iN1 : iN2;
        int i18 = i16 - i17;
        long jI = zx1.i(j, -i15, -iN4);
        iy5 iy5VarInvoke = this.d.invoke();
        gv5 gv5VarI = iy5VarInvoke.i();
        int iH = xx1.h(jI);
        int iG = xx1.g(jI);
        gv5VarI.a.j(iH);
        gv5VarI.b.j(iG);
        c30.e eVar = this.f;
        c30.l lVar = this.e;
        if (z5) {
            if (lVar == null) {
                throw x70.a("null verticalArrangement when isVertical == true");
            }
            fMo1getSpacingD9Ej5fM = lVar.mo1getSpacingD9Ej5fM();
        } else {
            if (eVar == null) {
                throw x70.a("null horizontalAlignment when isVertical == false");
            }
            fMo1getSpacingD9Ej5fM = eVar.mo1getSpacingD9Ej5fM();
        }
        int iN5 = g4aVar2.n1(fMo1getSpacingD9Ej5fM);
        int iB = iy5VarInvoke.b();
        long j2 = (((long) iN1) << 32) | (((long) iN3) & 4294967295L);
        int iG2 = z5 ? xx1.g(j) - iN4 : xx1.h(j) - i15;
        int i19 = i17;
        qy5 qy5Var = new qy5(jI, this.b, iy5VarInvoke, tw5Var, iB, iN5, this.j, this.k, i19, i18, j2, this.a);
        int i20 = iB;
        hu9 hu9VarA = hu9.a.a();
        oh4<Object, g2b> oh4VarE = hu9VarA != null ? hu9VarA.e() : null;
        hu9 hu9VarB = hu9.a.b(hu9VarA);
        try {
            int iH2 = nz5Var.h();
            cz5 cz5Var = nz5Var.e;
            int iB2 = iw5.b(iH2, iy5VarInvoke, cz5Var.d);
            if (iH2 != iB2) {
                cz5Var.a.j(iB2);
                cz5Var.e.d(iH2);
            }
            int i21 = nz5Var.i();
            g2b g2bVar = g2b.a;
            hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
            List<Integer> listA = qv5.a(iy5VarInvoke, nz5Var.s, nz5Var.p);
            float fFloatValue = (g4aVar2.P0() || !z4) ? nz5Var.h : ((Number) nz5Var.x.b.u.getValue()).floatValue();
            vv5<yy5> vv5Var2 = nz5Var.o;
            final boolean zP0 = g4aVar2.P0();
            final h37<g2b> h37Var = nz5Var.w;
            boolean z6 = nz5Var.i;
            if (i19 < 0) {
                xc5.a("invalid beforeContentPadding");
            }
            if (i18 < 0) {
                xc5.a("invalid afterContentPadding");
            }
            if3 if3Var = if3.t;
            iy5 iy5Var = qy5Var.b;
            int i22 = i21;
            boolean z7 = this.b;
            t72 t72Var = this.g;
            jo4 jo4Var = this.h;
            hf3 hf3Var = hf3.t;
            if (i20 <= 0) {
                int iJ = xx1.j(jI);
                int i23 = xx1.i(jI);
                vv5Var2.d(0, iJ, i23, new ArrayList(), iy5Var.a(), qy5Var, z7, zP0, 1, z4, 0, 0, t72Var, jo4Var);
                if (!zP0) {
                    long jB = vv5Var2.b();
                    if (!kg5.b(jB, 0L)) {
                        iJ = zx1.g((int) (jB >> 32), jI);
                        i23 = zx1.f((int) (jB & 4294967295L), jI);
                    }
                }
                g4aVar = g4aVar2;
                xy5Var = new xy5(null, 0, false, 0.0f, g4aVar2.y0(zx1.g(iJ + i15, j), zx1.f(i23 + iN4, j), if3Var, new m32(3)), 0.0f, false, t72Var, tw5Var, qy5Var.d, hf3Var, -i19, iG2 + i18, 0, z7 ? fl7Var2 : fl7Var, i18, iN5);
            } else {
                int i24 = iG2;
                if (iB2 >= i20) {
                    iB2 = i20 - 1;
                    i22 = 0;
                }
                int iRound = Math.round(fFloatValue);
                int i25 = i22 - iRound;
                if (iB2 == 0 && i25 < 0) {
                    iRound += i25;
                    i25 = 0;
                }
                h30 h30Var = new h30();
                int i26 = -i19;
                float f3 = fFloatValue;
                int i27 = i26 + (r1 < 0 ? r1 : 0);
                if3 if3Var2 = if3Var;
                int i28 = i25 + i27;
                int i29 = iB2;
                int iMax = 0;
                while (i28 < 0 && i29 > 0) {
                    int i30 = i26;
                    int i31 = i29 - 1;
                    boolean z8 = z6;
                    yy5 yy5VarV = zy5.v(qy5Var, i31);
                    i29 = i31;
                    h30Var.add(0, yy5VarV);
                    iMax = Math.max(iMax, yy5VarV.s);
                    i28 += yy5VarV.r;
                    z6 = z8;
                    i26 = i30;
                }
                int i32 = i26;
                boolean z9 = z6;
                if (i28 < i27) {
                    iRound -= i27 - i28;
                    i28 = i27;
                }
                int i33 = iRound;
                int i34 = i28 - i27;
                int i35 = i24 + i18;
                int i36 = iMax;
                if (i35 < 0) {
                    i2 = i35;
                    i = 0;
                } else {
                    i = i35;
                    i2 = i;
                }
                int i37 = i34;
                int i38 = -i34;
                int i39 = i29;
                int i40 = 0;
                boolean z10 = false;
                while (i40 < h30Var.v) {
                    if (i38 >= i) {
                        h30Var.e(i40);
                        g2b g2bVar2 = g2b.a;
                        z10 = true;
                    } else {
                        i39++;
                        i38 += ((yy5) h30Var.get(i40)).r;
                        i40++;
                    }
                }
                int iMax2 = i36;
                int i41 = i39;
                boolean z11 = z10;
                while (i41 < i20 && (i38 < i || i38 <= 0 || h30Var.isEmpty())) {
                    int i42 = i;
                    yy5 yy5VarV2 = zy5.v(qy5Var, i41);
                    int i43 = i20;
                    int i44 = yy5VarV2.r;
                    i38 += i44;
                    if (i38 <= i27) {
                        i14 = i27;
                        if (i41 != i43 - 1) {
                            i37 -= i44;
                            g2b g2bVar3 = g2b.a;
                            i29 = i41 + 1;
                            z11 = true;
                        }
                        i41++;
                        i = i42;
                        i27 = i14;
                        i20 = i43;
                    } else {
                        i14 = i27;
                    }
                    int iMax3 = Math.max(iMax2, yy5VarV2.s);
                    h30Var.addLast(yy5VarV2);
                    iMax2 = iMax3;
                    i41++;
                    i = i42;
                    i27 = i14;
                    i20 = i43;
                }
                int i45 = i20;
                if (i38 < i24) {
                    int i46 = i24 - i38;
                    int i47 = i38 + i46;
                    int i48 = i37 - i46;
                    while (i48 < i19 && i29 > 0) {
                        int i49 = i29 - 1;
                        int i50 = i46;
                        yy5 yy5VarV3 = zy5.v(qy5Var, i49);
                        h30Var.add(0, yy5VarV3);
                        iMax2 = Math.max(iMax2, yy5VarV3.s);
                        i48 += yy5VarV3.r;
                        i29 = i49;
                        i46 = i50;
                        i47 = i47;
                    }
                    int i51 = i47;
                    i4 = i33 + i46;
                    if (i48 < 0) {
                        i4 += i48;
                        i3 = i51 + i48;
                        i5 = i29;
                        i6 = 0;
                    } else {
                        i6 = i48;
                        i5 = i29;
                        i3 = i51;
                    }
                } else {
                    i3 = i38;
                    i4 = i33;
                    i5 = i29;
                    i6 = i37;
                }
                int i52 = iMax2;
                float f4 = (Integer.signum(Math.round(f3)) != Integer.signum(i4) || Math.abs(Math.round(f3)) < Math.abs(i4)) ? f3 : i4;
                float f5 = f3 - f4;
                float f6 = 0.0f;
                if (zP0 && i4 > i33 && f5 <= 0.0f) {
                    f6 = (i4 - i33) + f5;
                }
                float f7 = f6;
                if (i6 < 0) {
                    xc5.a("negative currentFirstItemScrollOffset");
                }
                int i53 = -i6;
                yy5 yy5Var7 = (yy5) h30Var.first();
                if (i19 > 0 || r1 < 0) {
                    int iD = h30Var.d();
                    yy5 yy5Var8 = yy5Var7;
                    int i54 = i6;
                    int i55 = 0;
                    while (i55 < iD) {
                        int i56 = iD;
                        int i57 = ((yy5) h30Var.get(i55)).r;
                        if (i54 == 0 || i57 > i54 || i55 == h30Var.d() - 1) {
                            break;
                        }
                        i54 -= i57;
                        i55++;
                        yy5Var8 = (yy5) h30Var.get(i55);
                        iD = i56;
                    }
                    i7 = i54;
                    yy5Var7 = yy5Var8;
                } else {
                    i7 = i6;
                }
                int iMax4 = Math.max(0, i5);
                int i58 = i5 - 1;
                if (iMax4 <= i58) {
                    arrayList = null;
                    while (true) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        f = f7;
                        arrayList.add(zy5.v(qy5Var, i58));
                        if (i58 == iMax4) {
                            break;
                        }
                        i58--;
                        f7 = f;
                    }
                } else {
                    f = f7;
                    arrayList = null;
                }
                int size = listA.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i59 = size - 1;
                        int iIntValue3 = listA.get(size).intValue();
                        if (iIntValue3 < iMax4) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(zy5.v(qy5Var, iIntValue3));
                        }
                        if (i59 < 0) {
                            break;
                        }
                        size = i59;
                    }
                }
                if (arrayList == null) {
                    arrayList = hf3Var;
                }
                int iMax5 = i52;
                int i60 = 0;
                for (int size2 = arrayList.size(); i60 < size2; size2 = size2) {
                    iMax5 = Math.max(iMax5, ((yy5) arrayList.get(i60)).s);
                    i60++;
                }
                int iMin = Math.min(((yy5) th1.G(h30Var)).a, i45 - 1);
                int i61 = ((yy5) th1.G(h30Var)).a + 1;
                if (i61 <= iMin) {
                    List arrayList3 = null;
                    while (true) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        i8 = i41;
                        i9 = iMax5;
                        arrayList2 = arrayList3;
                        arrayList2.add(zy5.v(qy5Var, i61));
                        if (i61 == iMin) {
                            break;
                        }
                        i61++;
                        arrayList3 = arrayList2;
                        iMax5 = i9;
                        i41 = i8;
                    }
                } else {
                    i8 = i41;
                    i9 = iMax5;
                    arrayList2 = null;
                }
                if (arrayList2 != null && ((yy5) th1.G(arrayList2)).a > iMin) {
                    iMin = ((yy5) th1.G(arrayList2)).a;
                }
                int size3 = listA.size();
                int i62 = 0;
                while (i62 < size3) {
                    List<Integer> list = listA;
                    int iIntValue4 = listA.get(i62).intValue();
                    if (iIntValue4 > iMin) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(zy5.v(qy5Var, iIntValue4));
                    }
                    i62++;
                    listA = list;
                }
                if (arrayList2 == null) {
                    arrayList2 = hf3Var;
                }
                int size4 = arrayList2.size();
                int iMax6 = i9;
                for (int i63 = 0; i63 < size4; i63++) {
                    iMax6 = Math.max(iMax6, ((yy5) arrayList2.get(i63)).s);
                }
                boolean z12 = xj5.a(yy5Var7, h30Var.first()) && arrayList.isEmpty() && arrayList2.isEmpty();
                int iG3 = zx1.g(z7 ? iMax6 : i3, jI);
                if (z7) {
                    iMax6 = i3;
                }
                int iF = zx1.f(iMax6, jI);
                int iG4 = iG3;
                if (z7) {
                    iG3 = iF;
                }
                boolean z13 = i3 < Math.min(iG3, i24);
                if (z13 && i53 != 0) {
                    xc5.c("non-zero itemsScrollOffset");
                }
                int i64 = i3;
                boolean z14 = z13;
                final ArrayList arrayList4 = new ArrayList(arrayList2.size() + arrayList.size() + h30Var.d());
                if (z14) {
                    if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
                        xc5.a("no extra items");
                    }
                    int iD2 = h30Var.d();
                    int[] iArr2 = new int[iD2];
                    int i65 = 0;
                    while (i65 < iD2) {
                        iArr2[i65] = ((yy5) h30Var.get(i65)).p;
                        i65++;
                        i24 = i24;
                    }
                    int i66 = i24;
                    int[] iArr3 = new int[iD2];
                    if (z7) {
                        if (lVar == null) {
                            throw x70.a("null verticalArrangement when isVertical == true");
                        }
                        lVar.arrange(tw5Var, iG3, iArr2, iArr3);
                        iArr = iArr3;
                    } else {
                        if (eVar == null) {
                            throw x70.a("null horizontalArrangement when isVertical == false");
                        }
                        iArr = iArr3;
                        eVar.a(tw5Var, iG3, iArr2, tq5.t, iArr);
                    }
                    fg5 fg5VarX = u30.x(iArr);
                    int i67 = fg5VarX.u;
                    int i68 = fg5VarX.v;
                    if ((i68 > 0 && i67 >= 0) || (i68 < 0 && i67 <= 0)) {
                        int i69 = 0;
                        while (true) {
                            int i70 = iArr[i69];
                            yy5 yy5Var9 = (yy5) h30Var.get(i69);
                            yy5Var9.k(i70, iG4, iF);
                            arrayList4.add(yy5Var9);
                            if (i69 == i67) {
                                break;
                            }
                            i69 += i68;
                        }
                    }
                    iG4 = r6;
                    i24 = i66;
                } else {
                    yy5Var7 = yy5Var7;
                    if3Var2 = if3Var2;
                    int size5 = arrayList.size();
                    int i71 = i53;
                    int i72 = 0;
                    while (i72 < size5) {
                        int i73 = size5;
                        yy5 yy5Var10 = (yy5) arrayList.get(i72);
                        i71 -= yy5Var10.r;
                        yy5Var10.k(i71, iG4, iF);
                        arrayList4.add(yy5Var10);
                        i72++;
                        size5 = i73;
                    }
                    int iD3 = h30Var.d();
                    int i74 = i53;
                    for (int i75 = 0; i75 < iD3; i75++) {
                        yy5 yy5Var11 = (yy5) h30Var.get(i75);
                        yy5Var11.k(i74, iG4, iF);
                        arrayList4.add(yy5Var11);
                        i74 += yy5Var11.r;
                    }
                    int size6 = arrayList2.size();
                    for (int i76 = 0; i76 < size6; i76++) {
                        yy5 yy5Var12 = (yy5) arrayList2.get(i76);
                        yy5Var12.k(i74, iG4, iF);
                        arrayList4.add(yy5Var12);
                        i74 += yy5Var12.r;
                    }
                }
                if (z9) {
                    i10 = iF;
                    vv5Var = vv5Var2;
                } else {
                    vv5Var = vv5Var2;
                    vv5Var.d((int) f4, iG4, iF, arrayList4, iy5Var.a(), qy5Var, z7, zP0, 1, z4, i7, i64, t72Var, jo4Var);
                    i10 = iF;
                }
                if (zP0) {
                    f2 = f4;
                    z = z7;
                    z2 = z12;
                } else {
                    float f8 = f4;
                    z = z7;
                    long jB2 = vv5Var.b();
                    z2 = z12;
                    f2 = f8;
                    if (!kg5.b(jB2, 0L)) {
                        int i77 = z ? i10 : iG4;
                        iG4 = zx1.g(Math.max(iG4, (int) (jB2 >> 32)), jI);
                        int iF2 = zx1.f(Math.max(i10, (int) (jB2 & 4294967295L)), jI);
                        int i78 = z ? iF2 : iG4;
                        if (i78 != i77) {
                            int size7 = arrayList4.size();
                            for (int i79 = 0; i79 < size7; i79++) {
                                yy5 yy5Var13 = (yy5) arrayList4.get(i79);
                                yy5Var13.u = i78;
                                yy5Var13.w = yy5Var13.h + i78;
                            }
                        }
                        i11 = iF2;
                    }
                    int i80 = iG4;
                    yy5Var = (yy5) h30Var.j();
                    if (yy5Var != null) {
                        i12 = yy5Var.a;
                    } else {
                        i12 = 0;
                    }
                    yy5Var2 = (yy5) h30Var.l();
                    if (yy5Var2 != null) {
                        i13 = yy5Var2.a;
                    } else {
                        i13 = 0;
                    }
                    final List listB = by5.b(this.i, i12, i13, arrayList4, iy5Var.c(), i19, i18, i80, i11, new vy5(0, qy5Var));
                    if (z2) {
                        yy5Var6 = (yy5) th1.A(arrayList4);
                        if (yy5Var6 != null) {
                            numValueOf = Integer.valueOf(yy5Var6.a);
                        } else {
                            numValueOf = null;
                        }
                    } else {
                        yy5Var3 = (yy5) h30Var.j();
                        if (yy5Var3 != null) {
                            numValueOf = Integer.valueOf(yy5Var3.a);
                        } else {
                            numValueOf = null;
                        }
                    }
                    if (z2) {
                        yy5Var5 = (yy5) th1.H(arrayList4);
                        if (yy5Var5 != null) {
                            numValueOf2 = Integer.valueOf(yy5Var5.a);
                        } else {
                            numValueOf2 = null;
                        }
                    } else {
                        yy5Var4 = (yy5) h30Var.l();
                        if (yy5Var4 != null) {
                            numValueOf2 = Integer.valueOf(yy5Var4.a);
                        } else {
                            numValueOf2 = null;
                        }
                    }
                    if (i8 >= i45 && i64 <= i24) {
                        z3 = false;
                    }
                    gl6 gl6VarY0 = g4aVar2.y0(zx1.g(i80 + i15, j), zx1.f(i11 + iN4, j), if3Var2, new oh4() { // from class: wy5
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            boolean z15;
                            jz7.a aVar = (jz7.a) obj;
                            aVar.t = true;
                            ArrayList arrayList5 = arrayList4;
                            int size8 = arrayList5.size();
                            int i81 = 0;
                            while (true) {
                                z15 = zP0;
                                if (i81 >= size8) {
                                    break;
                                }
                                ((yy5) arrayList5.get(i81)).e(aVar, z15);
                                i81++;
                            }
                            List list2 = listB;
                            int size9 = list2.size();
                            for (int i82 = 0; i82 < size9; i82++) {
                                ((yy5) list2.get(i82)).e(aVar, z15);
                            }
                            g2b g2bVar4 = g2b.a;
                            aVar.t = false;
                            h37Var.getValue();
                            return g2b.a;
                        }
                    });
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (numValueOf2 != null) {
                        iIntValue2 = numValueOf2.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    List listB2 = ww5.b(iIntValue, iIntValue2, arrayList4, listB);
                    if (z) {
                        fl7Var = fl7Var2;
                    }
                    g4aVar = g4aVar2;
                    xy5Var = new xy5(yy5Var7, i7, z3, f2, gl6VarY0, f, z11, t72Var, tw5Var, qy5Var.d, listB2, i32, i2, i45, fl7Var, i18, r1);
                }
                i11 = i10;
                int i81 = iG4;
                yy5Var = (yy5) h30Var.j();
                if (yy5Var != null) {
                    i12 = yy5Var.a;
                } else {
                    i12 = 0;
                }
                yy5Var2 = (yy5) h30Var.l();
                if (yy5Var2 != null) {
                    i13 = yy5Var2.a;
                } else {
                    i13 = 0;
                }
                final List listB3 = by5.b(this.i, i12, i13, arrayList4, iy5Var.c(), i19, i18, i81, i11, new vy5(0, qy5Var));
                if (z2) {
                    yy5Var6 = (yy5) th1.A(arrayList4);
                    if (yy5Var6 != null) {
                        numValueOf = Integer.valueOf(yy5Var6.a);
                    } else {
                        numValueOf = null;
                    }
                } else {
                    yy5Var3 = (yy5) h30Var.j();
                    if (yy5Var3 != null) {
                        numValueOf = Integer.valueOf(yy5Var3.a);
                    } else {
                        numValueOf = null;
                    }
                }
                if (z2) {
                    yy5Var5 = (yy5) th1.H(arrayList4);
                    if (yy5Var5 != null) {
                        numValueOf2 = Integer.valueOf(yy5Var5.a);
                    } else {
                        numValueOf2 = null;
                    }
                } else {
                    yy5Var4 = (yy5) h30Var.l();
                    if (yy5Var4 != null) {
                        numValueOf2 = Integer.valueOf(yy5Var4.a);
                    } else {
                        numValueOf2 = null;
                    }
                }
                if (i8 >= i45) {
                    z3 = false;
                }
                gl6 gl6VarY1 = g4aVar2.y0(zx1.g(i81 + i15, j), zx1.f(i11 + iN4, j), if3Var2, new oh4() { // from class: wy5
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        boolean z15;
                        jz7.a aVar = (jz7.a) obj;
                        aVar.t = true;
                        ArrayList arrayList5 = arrayList4;
                        int size8 = arrayList5.size();
                        int i82 = 0;
                        while (true) {
                            z15 = zP0;
                            if (i82 >= size8) {
                                break;
                            }
                            ((yy5) arrayList5.get(i82)).e(aVar, z15);
                            i82++;
                        }
                        List list2 = listB3;
                        int size9 = list2.size();
                        for (int i83 = 0; i83 < size9; i83++) {
                            ((yy5) list2.get(i83)).e(aVar, z15);
                        }
                        g2b g2bVar4 = g2b.a;
                        aVar.t = false;
                        h37Var.getValue();
                        return g2b.a;
                    }
                });
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                } else {
                    iIntValue = 0;
                }
                if (numValueOf2 != null) {
                    iIntValue2 = numValueOf2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                List listB4 = ww5.b(iIntValue, iIntValue2, arrayList4, listB3);
                if (z) {
                    fl7Var = fl7Var2;
                }
                g4aVar = g4aVar2;
                xy5Var = new xy5(yy5Var7, i7, z3, f2, gl6VarY1, f, z11, t72Var, tw5Var, qy5Var.d, listB4, i32, i2, i45, fl7Var, i18, r1);
            }
            nz5Var.g(xy5Var, g4aVar.P0(), false);
            zr2 zr2Var = nz5Var.a;
            return xy5Var;
        } catch (Throwable th) {
            hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
            throw th;
        }
    }
}
