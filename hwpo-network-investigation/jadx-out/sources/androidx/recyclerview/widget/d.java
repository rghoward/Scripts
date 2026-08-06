package androidx.recyclerview.widget;

import defpackage.tn0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {
    public final /* synthetic */ List t;
    public final /* synthetic */ List u;
    public final /* synthetic */ int v;
    public final /* synthetic */ e w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends m.b {
        public a() {
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final boolean a(int i, int i2) {
            d dVar = d.this;
            Object obj = dVar.t.get(i);
            Object obj2 = dVar.u.get(i2);
            if (obj != null && obj2 != null) {
                return dVar.w.b.b.a((T) obj, (T) obj2);
            }
            if (obj == null && obj2 == null) {
                return true;
            }
            throw new AssertionError();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final boolean b(int i, int i2) {
            d dVar = d.this;
            Object obj = dVar.t.get(i);
            Object obj2 = dVar.u.get(i2);
            if (obj == null || obj2 == null) {
                return obj == null && obj2 == null;
            }
            return dVar.w.b.b.b((T) obj, (T) obj2);
        }

        public final void c(int i, int i2) {
            d dVar = d.this;
            Object obj = dVar.t.get(i);
            Object obj2 = dVar.u.get(i2);
            if (obj == null || obj2 == null) {
                throw new AssertionError();
            }
            Object obj3 = dVar.w.b.b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b implements Runnable {
        public final /* synthetic */ m.d t;

        public b(m.d dVar) {
            this.t = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            int i;
            m.d dVar;
            int i2;
            int i3;
            d dVar2 = d.this;
            e eVar = dVar2.w;
            if (eVar.g == dVar2.v) {
                List<T> list = dVar2.u;
                List list2 = eVar.f;
                eVar.e = list;
                eVar.f = Collections.unmodifiableList(list);
                androidx.recyclerview.widget.b bVar = eVar.a;
                m.d dVar3 = this.t;
                int[] iArr = dVar3.b;
                ArrayList arrayList = dVar3.a;
                int i4 = dVar3.e;
                a aVar = dVar3.d;
                tn0 tn0Var = new tn0(bVar);
                ArrayDeque arrayDeque = new ArrayDeque();
                int i5 = dVar3.f;
                int i6 = 1;
                int size = arrayList.size() - 1;
                int i7 = i5;
                int i8 = i4;
                while (size >= 0) {
                    m.c cVar = (m.c) arrayList.get(size);
                    int i9 = cVar.a;
                    int i10 = cVar.c;
                    int i11 = i6;
                    int i12 = i9 + i10;
                    int i13 = cVar.b;
                    int[] iArr2 = iArr;
                    int i14 = i13 + i10;
                    ArrayList arrayList2 = arrayList;
                    while (true) {
                        i = 0;
                        if (i8 <= i12) {
                            break;
                        }
                        i8--;
                        int i15 = iArr2[i8];
                        if ((i15 & 12) != 0) {
                            int i16 = i4;
                            int i17 = i15 >> 4;
                            m.f fVarA = m.d.a(arrayDeque, i17, false);
                            if (fVarA != null) {
                                int i18 = (i16 - fVarA.b) - 1;
                                tn0Var.a(i8, i18);
                                if ((i15 & 4) != 0) {
                                    aVar.c(i8, i17);
                                    tn0Var.d(i18, i11);
                                }
                            } else {
                                arrayDeque.add(new m.f(i8, i11, (i16 - i8) - 1));
                            }
                            i4 = i16;
                        } else {
                            i7 = i7;
                            tn0Var.c(i8, i11);
                            i4--;
                        }
                        i7 = i7;
                        i11 = 1;
                    }
                    while (i7 > i14) {
                        i7--;
                        int i19 = dVar3.c[i7];
                        if ((i19 & 12) != 0) {
                            int i20 = i19 >> 4;
                            dVar = dVar3;
                            i2 = i14;
                            m.f fVarA2 = m.d.a(arrayDeque, i20, true);
                            if (fVarA2 == null) {
                                arrayDeque.add(new m.f(i7, false, i4 - i8));
                                i3 = 0;
                            } else {
                                i3 = 0;
                                tn0Var.a((i4 - fVarA2.b) - 1, i8);
                                if ((i19 & 4) != 0) {
                                    aVar.c(i20, i7);
                                    tn0Var.d(i8, 1);
                                }
                            }
                        } else {
                            dVar = dVar3;
                            i2 = i14;
                            i3 = i;
                            tn0Var.b(i8, 1);
                            i4++;
                        }
                        i = i3;
                        dVar3 = dVar;
                        i14 = i2;
                    }
                    m.d dVar4 = dVar3;
                    int i21 = i13;
                    int i22 = i9;
                    while (i < i10) {
                        if ((iArr2[i22] & 15) == 2) {
                            aVar.c(i22, i21);
                            tn0Var.d(i22, 1);
                        }
                        i22++;
                        i21++;
                        i++;
                    }
                    size--;
                    i6 = 1;
                    i7 = i13;
                    i8 = i9;
                    iArr = iArr2;
                    arrayList = arrayList2;
                    dVar3 = dVar4;
                }
                tn0Var.e();
                eVar.a(list2);
            }
        }
    }

    public d(e eVar, List list, List list2, int i) {
        this.w = eVar;
        this.t = list;
        this.u = list2;
        this.v = i;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:33:0x00df  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:44:0x0104  */
    /* JADX WARN: Code duplicated, block: B:46:0x010c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0129  */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        m.h hVar;
        int i2;
        m.g gVar;
        m.c cVar;
        int i3;
        int i4;
        m.h hVar2;
        m.h hVar3;
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
        int i15;
        int i16;
        int i17;
        int i18;
        a aVar = new a();
        int size = this.t.size();
        int size2 = this.u.size();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m.g gVar2 = new m.g();
        int i19 = 0;
        gVar2.a = 0;
        gVar2.b = size;
        gVar2.c = 0;
        gVar2.d = size2;
        arrayList2.add(gVar2);
        int i20 = size + size2;
        int i21 = 1;
        int i22 = (((i20 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i22];
        int i23 = i22 / 2;
        int[] iArr2 = new int[i22];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            m.g gVar3 = (m.g) arrayList2.remove(arrayList2.size() - i21);
            if (gVar3.b() >= i21 && gVar3.a() >= i21) {
                int iA = ((gVar3.a() + gVar3.b()) + i21) / 2;
                int i24 = i21 + i23;
                iArr[i24] = gVar3.a;
                iArr2[i24] = gVar3.b;
                int i25 = i19;
                while (true) {
                    if (i25 >= iA) {
                        i = i23;
                        hVar = null;
                        break;
                    }
                    int i26 = Math.abs(gVar3.b() - gVar3.a()) % 2 == i21 ? i21 : i19;
                    int iB = gVar3.b() - gVar3.a();
                    int i27 = -i25;
                    int i28 = i27;
                    while (true) {
                        if (i28 > i25) {
                            i3 = i19;
                            i = i23;
                            i4 = iA;
                            hVar2 = null;
                            break;
                        }
                        if (i28 != i27) {
                            if (i28 != i25) {
                                i9 = i28;
                                if (iArr[i28 + 1 + i23] > iArr[(i28 - 1) + i23]) {
                                }
                                i = i23;
                                i12 = ((i11 - gVar3.a) + gVar3.c) - i9;
                                if (i25 == 0 && i11 == i10) {
                                    i13 = i12 - 1;
                                } else {
                                    i13 = i12;
                                }
                                int i29 = iA;
                                i14 = i12;
                                i15 = i11;
                                i4 = i29;
                                i16 = i26;
                                while (i15 < gVar3.b && i14 < gVar3.d && aVar.b(i15, i14)) {
                                    i15++;
                                    i14++;
                                }
                                iArr[i9 + i] = i15;
                                if (i16 != 0) {
                                    i18 = iB - i9;
                                    i17 = iB;
                                    if (i18 >= i27 + 1 && i18 <= i25 - 1 && iArr2[i18 + i] <= i15) {
                                        hVar2 = new m.h();
                                        hVar2.a = i10;
                                        hVar2.b = i13;
                                        hVar2.c = i15;
                                        hVar2.d = i14;
                                        i3 = 0;
                                        hVar2.e = false;
                                        break;
                                    }
                                } else {
                                    i17 = iB;
                                }
                                i19 = 0;
                                i28 = i9 + 2;
                                i23 = i;
                                iA = i4;
                                i26 = i16;
                                iB = i17;
                            } else {
                                i9 = i28;
                            }
                            i10 = iArr[(i9 - 1) + i23];
                            i11 = i10 + 1;
                            i = i23;
                            i12 = ((i11 - gVar3.a) + gVar3.c) - i9;
                            if (i25 == 0) {
                                i13 = i12;
                            } else {
                                i13 = i12;
                            }
                            int i210 = iA;
                            i14 = i12;
                            i15 = i11;
                            i4 = i210;
                            i16 = i26;
                            while (i15 < gVar3.b) {
                                i15++;
                                i14++;
                            }
                            iArr[i9 + i] = i15;
                            if (i16 != 0) {
                                i18 = iB - i9;
                                i17 = iB;
                                if (i18 >= i27 + 1) {
                                    hVar2 = new m.h();
                                    hVar2.a = i10;
                                    hVar2.b = i13;
                                    hVar2.c = i15;
                                    hVar2.d = i14;
                                    i3 = 0;
                                    hVar2.e = false;
                                    break;
                                }
                            } else {
                                i17 = iB;
                            }
                            i19 = 0;
                            i28 = i9 + 2;
                            i23 = i;
                            iA = i4;
                            i26 = i16;
                            iB = i17;
                        } else {
                            i9 = i28;
                        }
                        i10 = iArr[i9 + 1 + i23];
                        i11 = i10;
                        i = i23;
                        i12 = ((i11 - gVar3.a) + gVar3.c) - i9;
                        if (i25 == 0) {
                            i13 = i12;
                        } else {
                            i13 = i12;
                        }
                        int i211 = iA;
                        i14 = i12;
                        i15 = i11;
                        i4 = i211;
                        i16 = i26;
                        while (i15 < gVar3.b) {
                            i15++;
                            i14++;
                        }
                        iArr[i9 + i] = i15;
                        if (i16 != 0) {
                            i18 = iB - i9;
                            i17 = iB;
                            if (i18 >= i27 + 1) {
                                hVar2 = new m.h();
                                hVar2.a = i10;
                                hVar2.b = i13;
                                hVar2.c = i15;
                                hVar2.d = i14;
                                i3 = 0;
                                hVar2.e = false;
                                break;
                            }
                        } else {
                            i17 = iB;
                        }
                        i19 = 0;
                        i28 = i9 + 2;
                        i23 = i;
                        iA = i4;
                        i26 = i16;
                        iB = i17;
                    }
                    if (hVar2 != null) {
                        hVar = hVar2;
                        break;
                    }
                    int i30 = (gVar3.b() - gVar3.a()) % 2 == 0 ? 1 : i3;
                    int iB2 = gVar3.b() - gVar3.a();
                    int i31 = i27;
                    while (true) {
                        if (i31 > i25) {
                            hVar3 = null;
                            break;
                        }
                        if (i31 == i27 || (i31 != i25 && iArr2[i31 + 1 + i] < iArr2[(i31 - 1) + i])) {
                            i5 = iArr2[i31 + 1 + i];
                            i6 = i5;
                        } else {
                            i5 = iArr2[(i31 - 1) + i];
                            i6 = i5 - 1;
                        }
                        int i32 = gVar3.d - ((gVar3.b - i6) - i31);
                        if (i25 != 0 && i6 == i5) {
                            i32++;
                        }
                        int i33 = i30;
                        int i34 = i6;
                        int i35 = i32;
                        int i36 = iB2;
                        while (true) {
                            if (i34 > gVar3.a && i35 > gVar3.c) {
                                i7 = i31;
                                if (!aVar.b(i34 - 1, i35 - 1)) {
                                    break;
                                }
                                i34--;
                                i35--;
                                i31 = i7;
                            } else {
                                i7 = i31;
                                break;
                            }
                        }
                        iArr2[i7 + i] = i34;
                        if (i33 != 0 && (i8 = i36 - i7) >= i27 && i8 <= i25 && iArr[i8 + i] >= i34) {
                            hVar3 = new m.h();
                            hVar3.a = i34;
                            hVar3.b = i35;
                            hVar3.c = i5;
                            hVar3.d = i32;
                            hVar3.e = true;
                            break;
                        }
                        i31 = i7 + 2;
                        i30 = i33;
                        iB2 = i36;
                    }
                    if (hVar3 != null) {
                        hVar = hVar3;
                        break;
                    }
                    i25++;
                    i23 = i;
                    iA = i4;
                    i21 = 1;
                    i19 = 0;
                }
            } else {
                i = i23;
                hVar = null;
                break;
            }
            if (hVar != null) {
                if (hVar.a() > 0) {
                    int i37 = hVar.d;
                    int i38 = hVar.b;
                    int i39 = i37 - i38;
                    int i40 = hVar.c;
                    int i41 = hVar.a;
                    int i42 = i40 - i41;
                    if (i39 == i42) {
                        cVar = new m.c(i41, i38, i42);
                    } else if (hVar.e) {
                        cVar = new m.c(i41, i38, hVar.a());
                    } else {
                        cVar = i39 > i42 ? new m.c(i41, i38 + 1, hVar.a()) : new m.c(i41 + 1, i38, hVar.a());
                    }
                    arrayList.add(cVar);
                }
                if (arrayList3.isEmpty()) {
                    gVar = new m.g();
                    i2 = 1;
                } else {
                    i2 = 1;
                    gVar = (m.g) arrayList3.remove(arrayList3.size() - 1);
                }
                gVar.a = gVar3.a;
                gVar.c = gVar3.c;
                gVar.b = hVar.a;
                gVar.d = hVar.b;
                arrayList2.add(gVar);
                gVar3.b = gVar3.b;
                gVar3.d = gVar3.d;
                gVar3.a = hVar.c;
                gVar3.c = hVar.d;
                arrayList2.add(gVar3);
            } else {
                i2 = 1;
                arrayList3.add(gVar3);
            }
            i21 = i2;
            i23 = i;
            i19 = 0;
        }
        Collections.sort(arrayList, m.a);
        this.w.c.execute(new b(new m.d(aVar, arrayList, iArr, iArr2)));
    }
}
