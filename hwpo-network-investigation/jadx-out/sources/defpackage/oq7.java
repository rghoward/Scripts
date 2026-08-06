package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oq7 implements rw5 {
    public final /* synthetic */ dr7 a;
    public final /* synthetic */ go7 b;
    public final /* synthetic */ lp7 c;
    public final /* synthetic */ mh4<mq7> d;
    public final /* synthetic */ mh4<Integer> e;
    public final /* synthetic */ di.c f;
    public final /* synthetic */ du9 g;
    public final /* synthetic */ t72 h;

    public oq7(dr7 dr7Var, go7 go7Var, lp7 lp7Var, eo5 eo5Var, mh4 mh4Var, di.c cVar, du9 du9Var, t72 t72Var) {
        this.a = dr7Var;
        this.b = go7Var;
        this.c = lp7Var;
        this.d = eo5Var;
        this.e = mh4Var;
        this.f = cVar;
        this.g = du9Var;
        this.h = t72Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r24v10 */
    /* JADX WARN: Type inference failed for: r24v11 */
    /* JADX WARN: Type inference failed for: r24v9 */
    @Override // defpackage.rw5
    public final gl6 a(tw5 tw5Var, long j) {
        int i;
        int i2;
        di.c cVar;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        ll6 ll6Var;
        int i15;
        h30 h30Var;
        int i16;
        ArrayList arrayList;
        int i17;
        List list;
        int i18;
        int i19;
        ArrayList arrayList2;
        int i20;
        boolean z;
        int i21;
        g4a g4aVar;
        if3 if3Var;
        ArrayList arrayList3;
        int i22;
        h30 h30Var2;
        int i23;
        ArrayList arrayList4;
        ?? arrayList5;
        ?? r24;
        int i24;
        int i25;
        int i26;
        du9 du9Var;
        ArrayList arrayList6;
        int i27;
        Object obj;
        pq7 pq7Var;
        tw5 tw5Var2;
        h30 h30Var3;
        List<Integer> list2;
        List<Integer> list3;
        int iMax;
        oq7 oq7Var = this;
        dr7 dr7Var = oq7Var.a;
        dr7Var.A.getValue();
        fl7 fl7Var = fl7.u;
        hnb.a(j, fl7Var);
        g4a g4aVar2 = tw5Var.u;
        tq5 layoutDirection = g4aVar2.getLayoutDirection();
        go7 go7Var = oq7Var.b;
        int iN1 = g4aVar2.n1(eo7.e(go7Var, layoutDirection));
        int iN2 = g4aVar2.n1(eo7.d(go7Var, g4aVar2.getLayoutDirection()));
        int iN3 = g4aVar2.n1(go7Var.d());
        int iN4 = g4aVar2.n1(go7Var.a()) + iN3;
        int i28 = iN2 + iN1;
        int i29 = i28 - iN1;
        long jI = zx1.i(j, -i28, -iN4);
        dr7Var.n = tw5Var;
        int iN5 = g4aVar2.n1(0.0f);
        int iH = xx1.h(j) - i28;
        int i30 = iN5;
        int i31 = i28;
        long j2 = (((long) iN1) << 32) | (((long) iN3) & 4294967295L);
        oq7Var.c.a(iH);
        int i32 = iH < 0 ? 0 : iH;
        zx1.b(0, i32, 0, xx1.g(jI), 5);
        mq7 mq7VarInvoke = oq7Var.d.invoke();
        int i33 = iH + iN1 + i29;
        du9 du9Var2 = oq7Var.g;
        long j3 = j2;
        hu9 hu9VarA = hu9.a.a();
        oh4<Object, g2b> oh4VarE = hu9VarA != null ? hu9VarA.e() : null;
        long j4 = jI;
        hu9 hu9VarB = hu9.a.b(hu9VarA);
        try {
            int iK = dr7Var.k();
            int i34 = iH;
            sq7 sq7Var = dr7Var.d;
            g4a g4aVar3 = g4aVar2;
            int iB = iw5.b(iK, mq7VarInvoke, sq7Var.e);
            if (iK != iB) {
                sq7Var.b.j(iB);
                sq7Var.f.d(iK);
            }
            dr7Var.k();
            float fL = dr7Var.l();
            dr7Var.o();
            int i35 = i32 + i30;
            int iB2 = wk6.b(du9Var2.f(i33, i32, iN1, i29) - (fL * i35));
            g2b g2bVar = g2b.a;
            hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
            List<Integer> listA = qv5.a(mq7VarInvoke, dr7Var.y, dr7Var.u);
            e27 e27Var = ag5.a;
            mq7 mq7Var = mq7VarInvoke;
            e27 e27Var2 = new e27();
            int iIntValue = oq7Var.e.invoke().intValue();
            h37<g2b> h37Var = dr7Var.z;
            if (iN1 < 0) {
                xc5.a("negative beforeContentPadding");
            }
            if (i29 < 0) {
                xc5.a("negative afterContentPadding");
            }
            int i36 = i35 < 0 ? 0 : i35;
            int i37 = iIntValue < 0 ? iIntValue : 0;
            int i38 = iB2;
            long jB = zx1.b(0, i32, 0, xx1.g(j4), 5);
            int i39 = i35;
            if3 if3Var2 = if3.t;
            du9 du9Var3 = oq7Var.g;
            t72 t72Var = oq7Var.h;
            if (iIntValue <= 0) {
                pq7Var = new pq7(i32, i30, i29, -iN1, i34 + i29, i37, du9Var3, g4aVar3.y0(zx1.g(xx1.j(j4) + i31, j), zx1.f(xx1.i(j4) + iN4, j), if3Var2, new g67(1)), t72Var, tw5Var, jB);
                tw5Var2 = tw5Var;
            } else {
                long j5 = jB;
                int i40 = iIntValue;
                int i41 = i32;
                while (true) {
                    if (i2 <= 0) {
                        i = iN4;
                        i2 = iB;
                        break;
                    }
                    if (i38 <= 0) {
                        break;
                    }
                    i2--;
                    i38 -= i36;
                }
                int i42 = i38 * (-1);
                if (i2 >= i40) {
                    i2 = i40 - 1;
                    i42 = 0;
                }
                if3 if3Var3 = if3Var2;
                h30 h30Var4 = new h30();
                int i43 = -iN1;
                int i44 = (i30 < 0 ? i30 : 0) + i43;
                int i45 = i36;
                int i46 = i42 + i44;
                int iMax2 = 0;
                while (true) {
                    cVar = oq7Var.f;
                    if (i46 >= 0 || i2 <= 0) {
                        break;
                    }
                    i2--;
                    int i47 = iMax2;
                    int i48 = i41;
                    int i49 = i37;
                    long j6 = j3;
                    ll6 ll6VarA = nq7.a(tw5Var, i2, j5, mq7Var, j6, cVar, g4aVar3.getLayoutDirection(), i48, e27Var2);
                    i41 = i48;
                    h30Var4.add(0, ll6VarA);
                    i46 += i45;
                    listA = listA;
                    iN1 = iN1;
                    i30 = i30;
                    i40 = i40;
                    j4 = j4;
                    du9Var3 = du9Var3;
                    iMax2 = Math.max(i47, ll6VarA.i);
                    oq7Var = this;
                    mq7Var = mq7Var;
                    i = i;
                    i31 = i31;
                    i37 = i49;
                    j3 = j6;
                }
                int i50 = i37;
                du9 du9Var4 = du9Var3;
                di.c cVar2 = cVar;
                int iMax3 = iMax2;
                int i51 = i30;
                long j7 = j4;
                int i52 = i40;
                List<Integer> list4 = listA;
                long j8 = j3;
                int i53 = iN1;
                int i54 = i31;
                int i55 = i;
                mq7 mq7Var2 = mq7Var;
                if (i46 < i44) {
                    i46 = i44;
                }
                int i56 = i46 - i44;
                int i57 = i34 + i29;
                int i58 = i57 < 0 ? 0 : i57;
                int i59 = -i56;
                int i60 = i2;
                int i61 = 0;
                boolean z2 = false;
                while (i61 < h30Var4.v) {
                    if (i59 >= i58) {
                        h30Var4.e(i61);
                        g2b g2bVar2 = g2b.a;
                        z2 = true;
                    } else {
                        i60++;
                        i59 += i45;
                        i61++;
                    }
                }
                int i62 = i59;
                int i63 = i52;
                int i64 = i56;
                int i65 = i2;
                int i66 = i60;
                while (i66 < i63 && (i62 < i58 || i62 <= 0 || h30Var4.isEmpty())) {
                    int i67 = i58;
                    int i68 = i66;
                    int i69 = i57;
                    int i70 = i65;
                    int i71 = iMax3;
                    int i72 = i63;
                    long j9 = j5;
                    ll6 ll6VarA2 = nq7.a(tw5Var, i68, j9, mq7Var2, j8, cVar2, g4aVar3.getLayoutDirection(), i41, e27Var2);
                    int i73 = i72 - 1;
                    i62 += i68 == i73 ? i41 : i45;
                    if (i62 > i44 || i68 == i73) {
                        iMax = Math.max(i71, ll6VarA2.i);
                        h30Var4.addLast(ll6VarA2);
                    } else {
                        i64 -= i45;
                        g2b g2bVar3 = g2b.a;
                        i70 = i68 + 1;
                        iMax = i71;
                        z2 = true;
                    }
                    i57 = i69;
                    j5 = j9;
                    i63 = i72;
                    i65 = i70;
                    i66 = i68 + 1;
                    iMax3 = iMax;
                    i58 = i67;
                }
                if (i62 < i34) {
                    int i74 = i34 - i62;
                    int i75 = i62 + i74;
                    int i76 = i53;
                    int i77 = i64 - i74;
                    while (i77 < i76 && i65 > 0) {
                        i65--;
                        int i78 = i76;
                        ll6 ll6VarA3 = nq7.a(tw5Var, i65, j5, mq7Var2, j8, cVar2, g4aVar3.getLayoutDirection(), i41, e27Var2);
                        h30Var4.add(0, ll6VarA3);
                        iMax3 = Math.max(iMax3, ll6VarA3.i);
                        i76 = i78;
                        i75 = i75;
                        i77 += i45;
                        i66 = i66;
                    }
                    i3 = i66;
                    int i79 = i77;
                    i5 = i75;
                    i4 = i76;
                    if (i79 < 0) {
                        i5 += i79;
                        i6 = 0;
                    } else {
                        i6 = i79;
                    }
                } else {
                    i3 = i66;
                    int i80 = i62;
                    i4 = i53;
                    int i81 = i64;
                    i5 = i80;
                    i6 = i81;
                }
                if (i6 < 0) {
                    xc5.a("invalid currentFirstPageScrollOffset");
                }
                int i82 = -i6;
                ll6 ll6Var2 = (ll6) h30Var4.first();
                if (i4 > 0 || i51 < 0) {
                    int i83 = i6;
                    int iD = h30Var4.d();
                    ll6 ll6Var3 = ll6Var2;
                    int i84 = i83;
                    int i85 = 0;
                    while (true) {
                        if (i85 >= iD || i84 == 0) {
                            i7 = iMax3;
                            i8 = i45;
                            break;
                        }
                        i7 = iMax3;
                        i8 = i45;
                        if (i8 > i84) {
                            break;
                        }
                        int i86 = iD;
                        if (i85 == h30Var4.d() - 1) {
                            break;
                        }
                        i84 -= i8;
                        i85++;
                        ll6Var3 = (ll6) h30Var4.get(i85);
                        i45 = i8;
                        iMax3 = i7;
                        iD = i86;
                    }
                    ll6 ll6Var4 = ll6Var3;
                    i9 = i84;
                    ll6Var2 = ll6Var4;
                } else {
                    i9 = i6;
                    i7 = iMax3;
                    i8 = i45;
                }
                int iMax4 = Math.max(0, i65 - i50);
                int i87 = i65 - 1;
                if (iMax4 <= i87) {
                    ArrayList arrayList7 = null;
                    while (true) {
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                        }
                        i10 = i8;
                        arrayList = arrayList7;
                        i12 = i34;
                        ll6Var = ll6Var2;
                        i11 = i4;
                        i13 = i5;
                        i14 = iMax4;
                        i15 = i82;
                        h30Var = h30Var4;
                        i16 = i50;
                        arrayList.add(nq7.a(tw5Var, i87, j5, mq7Var2, j8, cVar2, g4aVar3.getLayoutDirection(), i41, e27Var2));
                        if (i87 == i14) {
                            break;
                        }
                        i87--;
                        i50 = i16;
                        iMax4 = i14;
                        ll6Var2 = ll6Var;
                        h30Var4 = h30Var;
                        i82 = i15;
                        i34 = i12;
                        i4 = i11;
                        i5 = i13;
                        arrayList7 = arrayList;
                        i8 = i10;
                    }
                } else {
                    i10 = i8;
                    i11 = i4;
                    i12 = i34;
                    i13 = i5;
                    i14 = iMax4;
                    ll6Var = ll6Var2;
                    i15 = i82;
                    h30Var = h30Var4;
                    i16 = i50;
                    arrayList = null;
                }
                int size = list4.size();
                ArrayList arrayList8 = arrayList;
                int i88 = 0;
                while (i88 < size) {
                    List<Integer> list5 = list4;
                    int i89 = size;
                    int iIntValue2 = list5.get(i88).intValue();
                    if (iIntValue2 < i14) {
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                        }
                        list3 = list5;
                        ArrayList arrayList9 = arrayList8;
                        arrayList9.add(nq7.a(tw5Var, iIntValue2, j5, mq7Var2, j8, cVar2, g4aVar3.getLayoutDirection(), i41, e27Var2));
                        arrayList8 = arrayList9;
                    } else {
                        list3 = list5;
                    }
                    i88++;
                    size = i89;
                    list4 = list3;
                }
                List<Integer> list6 = list4;
                List list7 = hf3.t;
                List list8 = arrayList8 == null ? list7 : arrayList8;
                int iMax5 = i7;
                int i90 = 0;
                for (int size2 = list8.size(); i90 < size2; size2 = size2) {
                    iMax5 = Math.max(iMax5, ((ll6) list8.get(i90)).i);
                    i90++;
                }
                int i91 = ((ll6) h30Var.last()).a;
                int iMin = Math.min(i16, (i63 - i91) - 1) + i91;
                int i92 = i91 + 1;
                if (i92 <= iMin) {
                    ArrayList arrayList10 = null;
                    while (true) {
                        if (arrayList10 == null) {
                            arrayList10 = new ArrayList();
                        }
                        list = list7;
                        arrayList2 = arrayList10;
                        i17 = iMax5;
                        i18 = i16;
                        i19 = iMin;
                        int i93 = i92;
                        arrayList2.add(nq7.a(tw5Var, i93, j5, mq7Var2, j8, cVar2, g4aVar3.getLayoutDirection(), i41, e27Var2));
                        if (i93 == i19) {
                            break;
                        }
                        i92 = i93 + 1;
                        iMin = i19;
                        iMax5 = i17;
                        i16 = i18;
                        arrayList10 = arrayList2;
                        list7 = list;
                    }
                } else {
                    i17 = iMax5;
                    list = list7;
                    i18 = i16;
                    i19 = iMin;
                    arrayList2 = null;
                }
                int size3 = list6.size();
                ArrayList arrayList11 = arrayList2;
                int i94 = 0;
                while (i94 < size3) {
                    List<Integer> list9 = list6;
                    int i95 = size3;
                    int iIntValue3 = list9.get(i94).intValue();
                    ArrayList arrayList12 = arrayList11;
                    if (i19 + 1 > iIntValue3 || iIntValue3 >= i63) {
                        list2 = list9;
                        arrayList11 = arrayList12;
                    } else {
                        ArrayList arrayList13 = arrayList12 == null ? new ArrayList() : arrayList12;
                        list2 = list9;
                        arrayList13.add(nq7.a(tw5Var, iIntValue3, j5, mq7Var2, j8, cVar2, g4aVar3.getLayoutDirection(), i41, e27Var2));
                        arrayList11 = arrayList13;
                    }
                    i94++;
                    j5 = j5;
                    list6 = list2;
                    i39 = i39;
                    if3Var3 = if3Var3;
                    cVar2 = cVar2;
                    size3 = i95;
                }
                ArrayList arrayList14 = arrayList11;
                if3 if3Var4 = if3Var3;
                int i96 = i39;
                long j10 = j5;
                List list10 = arrayList14 == null ? list : arrayList14;
                int size4 = list10.size();
                int iMax6 = i17;
                for (int i97 = 0; i97 < size4; i97++) {
                    iMax6 = Math.max(iMax6, ((ll6) list10.get(i97)).i);
                }
                boolean z3 = xj5.a(ll6Var, h30Var.first()) && list8.isEmpty() && list10.isEmpty();
                int i98 = i13;
                int iG = zx1.g(i98, j7);
                int iF = zx1.f(iMax6, j7);
                int i99 = i12;
                boolean z4 = i98 < Math.min(iG, i99);
                if (!z4 || i15 == 0) {
                    i20 = i15;
                } else {
                    StringBuilder sb = new StringBuilder("non-zero pagesScrollOffset=");
                    i20 = i15;
                    sb.append(i20);
                    xc5.c(sb.toString());
                }
                ArrayList arrayList15 = new ArrayList(list10.size() + list8.size() + h30Var.d());
                if (z4) {
                    if (!list8.isEmpty() || !list10.isEmpty()) {
                        xc5.a("No extra pages");
                    }
                    int iD2 = h30Var.d();
                    int[] iArr = new int[iD2];
                    for (int i100 = 0; i100 < iD2; i100++) {
                        iArr[i100] = i41;
                    }
                    int[] iArr2 = new int[iD2];
                    float fF0 = g4aVar3.F0(i51);
                    if3Var = if3Var4;
                    i21 = i51;
                    arrayList3 = arrayList15;
                    z = z3;
                    g4aVar = g4aVar3;
                    new c30.h(fF0, false, null).a(tw5Var, iG, iArr, tq5.t, iArr2);
                    i22 = iG;
                    fg5 fg5VarX = u30.x(iArr2);
                    int i101 = fg5VarX.u;
                    int i102 = fg5VarX.v;
                    if ((i102 <= 0 || i101 < 0) && (i102 >= 0 || i101 > 0)) {
                        h30Var2 = h30Var;
                    } else {
                        int i103 = 0;
                        while (true) {
                            int i104 = iArr2[i103];
                            int i105 = i102;
                            h30Var3 = h30Var;
                            int[] iArr3 = iArr2;
                            ll6 ll6Var5 = (ll6) h30Var3.get(i103);
                            ll6Var5.b(i104, i22, iF);
                            arrayList3.add(ll6Var5);
                            if (i103 == i101) {
                                break;
                            }
                            i103 += i105;
                            h30Var = h30Var3;
                            i102 = i105;
                            iArr2 = iArr3;
                        }
                        h30Var2 = h30Var3;
                    }
                } else {
                    z = z3;
                    i21 = i51;
                    g4aVar = g4aVar3;
                    if3Var = if3Var4;
                    arrayList3 = arrayList15;
                    i22 = iG;
                    h30 h30Var5 = h30Var;
                    int size5 = list8.size();
                    int i106 = i20;
                    int i107 = 0;
                    while (i107 < size5) {
                        int i108 = i107;
                        ll6 ll6Var6 = (ll6) list8.get(i107);
                        i106 -= i96;
                        ll6Var6.b(i106, i22, iF);
                        arrayList3.add(ll6Var6);
                        i107 = i108 + 1;
                    }
                    int iD3 = h30Var5.d();
                    int i109 = i106;
                    int i110 = 0;
                    while (i110 < iD3) {
                        h30 h30Var6 = h30Var5;
                        ll6 ll6Var7 = (ll6) h30Var5.get(i110);
                        ll6Var7.b(i109, i22, iF);
                        arrayList3.add(ll6Var7);
                        i109 += i96;
                        i110++;
                        h30Var5 = h30Var6;
                    }
                    h30Var2 = h30Var5;
                    int size6 = list10.size();
                    int i111 = i109;
                    for (int i112 = 0; i112 < size6; i112++) {
                        ll6 ll6Var8 = (ll6) list10.get(i112);
                        ll6Var8.b(i111, i22, iF);
                        arrayList3.add(ll6Var8);
                        i111 += i96;
                    }
                }
                if (z) {
                    i23 = i22;
                    arrayList4 = arrayList3;
                } else {
                    ArrayList arrayList16 = new ArrayList(arrayList3.size());
                    int size7 = arrayList3.size();
                    int i113 = 0;
                    while (i113 < size7) {
                        Object obj2 = arrayList3.get(i113);
                        ll6 ll6Var9 = (ll6) obj2;
                        int i114 = i22;
                        int i115 = size7;
                        if (ll6Var9.a >= ((ll6) h30Var2.first()).a && ll6Var9.a <= ((ll6) h30Var2.last()).a) {
                            arrayList16.add(obj2);
                        }
                        i113++;
                        i22 = i114;
                        size7 = i115;
                    }
                    i23 = i22;
                    arrayList4 = arrayList16;
                }
                if (list8.isEmpty()) {
                    arrayList5 = list;
                } else {
                    arrayList5 = new ArrayList(arrayList3.size());
                    int size8 = arrayList3.size();
                    for (int i116 = 0; i116 < size8; i116++) {
                        Object obj3 = arrayList3.get(i116);
                        if (((ll6) obj3).a < ((ll6) h30Var2.first()).a) {
                            arrayList5.add(obj3);
                        }
                    }
                }
                if (!list10.isEmpty()) {
                    ArrayList arrayList17 = new ArrayList(arrayList3.size());
                    int size9 = arrayList3.size();
                    for (int i117 = 0; i117 < size9; i117++) {
                        Object obj4 = arrayList3.get(i117);
                        if (((ll6) obj4).a > ((ll6) h30Var2.last()).a) {
                            arrayList17.add(obj4);
                        }
                    }
                    list = arrayList17;
                }
                if (arrayList4.isEmpty()) {
                    r24 = arrayList5;
                    i24 = i29;
                    i25 = i11;
                    i26 = i33;
                    du9Var = du9Var4;
                    obj = null;
                    arrayList6 = arrayList4;
                    i27 = iF;
                } else {
                    Object obj5 = arrayList4.get(0);
                    r24 = arrayList5;
                    i24 = i29;
                    i25 = i11;
                    i26 = i33;
                    du9Var = du9Var4;
                    float f = -Math.abs(((ll6) obj5).k - du9Var.f(i26, i41, i25, i24));
                    int size10 = arrayList4.size() - 1;
                    if (1 <= size10) {
                        obj = obj5;
                        float f2 = f;
                        int i118 = 1;
                        while (true) {
                            Object obj6 = arrayList4.get(i118);
                            arrayList6 = arrayList4;
                            i27 = iF;
                            float f3 = -Math.abs(((ll6) obj6).k - du9Var.f(i26, i41, i25, i24));
                            if (Float.compare(f2, f3) < 0) {
                                f2 = f3;
                                obj = obj6;
                            }
                            if (i118 == size10) {
                                break;
                            }
                            i118++;
                            arrayList4 = arrayList6;
                            iF = i27;
                        }
                    } else {
                        arrayList6 = arrayList4;
                        i27 = iF;
                        obj = obj5;
                    }
                }
                ll6 ll6Var10 = (ll6) obj;
                g4aVar3 = g4aVar;
                ArrayList arrayList18 = arrayList6;
                pq7Var = new pq7(arrayList18, i41, i21, i24, fl7Var, i43, i57, i18, ll6Var, ll6Var10, i10 != 0 ? uh8.f((du9Var.f(i26, i41, i25, i24) - (ll6Var10 != null ? ll6Var10.k : 0)) / i10, -0.5f, 0.5f) : 0.0f, i9, i3 < i63 || i98 > i99, du9Var, g4aVar.y0(zx1.g(i23 + i54, j), zx1.f(i27 + i55, j), if3Var, new wg0(1, h37Var, arrayList3)), z2, r24, list, t72Var, tw5Var, j10);
                tw5Var2 = tw5Var;
            }
            dr7Var.h(pq7Var, g4aVar3.P0(), false);
            tp7 tp7Var = dr7Var.t;
            List<ll6> list11 = pq7Var.a;
            Trace.beginSection("compose:pager:cache_window:keepAroundItems");
            try {
                if (tp7Var.b() && !list11.isEmpty()) {
                    int index = ((kp7) th1.y(list11)).getIndex();
                    int index2 = ((kp7) th1.G(list11)).getIndex();
                    for (int i119 = tp7Var.h; i119 < index; i119++) {
                        tw5Var2.e(i119);
                    }
                    int i120 = index2 + 1;
                    int i121 = tp7Var.i;
                    if (i120 <= i121) {
                        while (true) {
                            tw5Var2.e(i120);
                            if (i120 == i121) {
                                break;
                            }
                            i120++;
                        }
                    }
                }
                g2b g2bVar4 = g2b.a;
                return pq7Var;
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th) {
            hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
            throw th;
        }
    }
}
