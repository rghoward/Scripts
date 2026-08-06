package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ey2 {
    public wx1 a;
    public boolean b;
    public boolean c;
    public wx1 d;
    public ArrayList<dmb> e;
    public ll0.b f;
    public ll0.a g;
    public ArrayList<yy8> h;

    public final void a(fy2 fy2Var, int i, ArrayList arrayList, yy8 yy8Var) {
        dmb dmbVar = fy2Var.d;
        yy8 yy8Var2 = dmbVar.c;
        fy2 fy2Var2 = dmbVar.i;
        fy2 fy2Var3 = dmbVar.h;
        if (yy8Var2 == null) {
            wx1 wx1Var = this.a;
            if (dmbVar == wx1Var.d || dmbVar == wx1Var.e) {
                return;
            }
            if (yy8Var == null) {
                yy8Var = new yy8();
                yy8Var.a = null;
                yy8Var.b = new ArrayList<>();
                yy8Var.a = dmbVar;
                arrayList.add(yy8Var);
            }
            dmbVar.c = yy8Var;
            yy8Var.b.add(dmbVar);
            ArrayList arrayList2 = fy2Var3.k;
            int size = arrayList2.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                by2 by2Var = (by2) obj;
                if (by2Var instanceof fy2) {
                    a((fy2) by2Var, i, arrayList, yy8Var);
                }
            }
            ArrayList arrayList3 = fy2Var2.k;
            int size2 = arrayList3.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                by2 by2Var2 = (by2) obj2;
                if (by2Var2 instanceof fy2) {
                    a((fy2) by2Var2, i, arrayList, yy8Var);
                }
            }
            if (i == 1 && (dmbVar instanceof meb)) {
                ArrayList arrayList4 = ((meb) dmbVar).k.k;
                int size3 = arrayList4.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj3 = arrayList4.get(i5);
                    i5++;
                    by2 by2Var3 = (by2) obj3;
                    if (by2Var3 instanceof fy2) {
                        a((fy2) by2Var3, i, arrayList, yy8Var);
                    }
                }
            }
            ArrayList arrayList5 = fy2Var3.l;
            int size4 = arrayList5.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList5.get(i6);
                i6++;
                a((fy2) obj4, i, arrayList, yy8Var);
            }
            ArrayList arrayList6 = fy2Var2.l;
            int size5 = arrayList6.size();
            int i7 = 0;
            while (i7 < size5) {
                Object obj5 = arrayList6.get(i7);
                i7++;
                a((fy2) obj5, i, arrayList, yy8Var);
            }
            if (i == 1 && (dmbVar instanceof meb)) {
                ArrayList arrayList7 = ((meb) dmbVar).k.l;
                int size6 = arrayList7.size();
                while (i2 < size6) {
                    Object obj6 = arrayList7.get(i2);
                    i2++;
                    a((fy2) obj6, i, arrayList, yy8Var);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:136:0x030f  */
    /* JADX WARN: Code duplicated, block: B:138:0x0321  */
    public final void b(wx1 wx1Var) {
        vx1.a[] aVarArr;
        int i;
        vx1.a aVar;
        vx1.a aVar2;
        int iO;
        int i2;
        vx1.a aVar3;
        vx1.a aVar4;
        vx1.a aVar5;
        vx1.a aVar6;
        int i3;
        vx1.a aVar7;
        ArrayList<vx1> arrayList = wx1Var.r0;
        vx1.a[] aVarArr2 = wx1Var.U;
        int size = arrayList.size();
        char c = 0;
        int i4 = 0;
        while (i4 < size) {
            vx1 vx1Var = arrayList.get(i4);
            i4++;
            vx1 vx1Var2 = vx1Var;
            vx1.a[] aVarArr3 = vx1Var2.U;
            sx1[] sx1VarArr = vx1Var2.R;
            sx1 sx1Var = vx1Var2.M;
            sx1 sx1Var2 = vx1Var2.K;
            sx1 sx1Var3 = vx1Var2.L;
            sx1 sx1Var4 = vx1Var2.J;
            vx1.a aVar8 = aVarArr3[c];
            vx1.a aVar9 = aVarArr3[1];
            c = c;
            if (vx1Var2.i0 == 8) {
                vx1Var2.a = true;
            } else {
                float f = vx1Var2.w;
                vx1.a aVar10 = vx1.a.v;
                if (f < 1.0f && aVar8 == aVar10) {
                    vx1Var2.r = 2;
                }
                float f2 = vx1Var2.z;
                if (f2 < 1.0f && aVar9 == aVar10) {
                    vx1Var2.s = 2;
                }
                float f3 = vx1Var2.Y;
                vx1.a aVar11 = vx1.a.u;
                ArrayList<vx1> arrayList2 = arrayList;
                vx1.a aVar12 = vx1.a.t;
                if (f3 <= 0.0f) {
                    aVarArr = aVarArr2;
                } else if (aVar8 == aVar10 && (aVar9 == aVar11 || aVar9 == aVar12)) {
                    aVarArr = aVarArr2;
                    vx1Var2.r = 3;
                } else {
                    aVarArr = aVarArr2;
                    if (aVar9 == aVar10 && (aVar8 == aVar11 || aVar8 == aVar12)) {
                        vx1Var2.s = 3;
                    } else {
                        if (aVar8 == aVar10 && aVar9 == aVar10) {
                            i = size;
                            if (vx1Var2.r == 0) {
                                vx1Var2.r = 3;
                            }
                            if (vx1Var2.s == 0) {
                                vx1Var2.s = 3;
                            }
                        }
                        if (aVar8 == aVar10 && vx1Var2.r == 1 && (sx1Var4.f == null || sx1Var3.f == null)) {
                            aVar8 = aVar11;
                        }
                        if (aVar9 == aVar10 && vx1Var2.s == 1 && (sx1Var2.f == null || sx1Var.f == null)) {
                            aVar9 = aVar11;
                        }
                        o15 o15Var = vx1Var2.d;
                        o15Var.d = aVar8;
                        int i5 = vx1Var2.r;
                        o15Var.a = i5;
                        meb mebVar = vx1Var2.e;
                        mebVar.d = aVar9;
                        int i6 = vx1Var2.s;
                        mebVar.a = i6;
                        aVar = vx1.a.w;
                        if ((aVar8 != aVar || aVar8 == aVar12 || aVar8 == aVar11) && (aVar9 == aVar || aVar9 == aVar12 || aVar9 == aVar11)) {
                            aVar2 = aVar8;
                            iO = vx1Var2.o();
                            if (aVar2 == aVar) {
                                iO = (wx1Var.o() - sx1Var4.g) - sx1Var3.g;
                                aVar2 = aVar12;
                            }
                            i2 = vx1Var2.i();
                            if (aVar9 == aVar) {
                                i2 = (wx1Var.i() - sx1Var2.g) - sx1Var.g;
                                aVar3 = aVar12;
                            } else {
                                aVar3 = aVar9;
                            }
                            f(vx1Var2, aVar2, iO, aVar3, i2);
                            vx1Var2.d.e.d(vx1Var2.o());
                            vx1Var2.e.e.d(vx1Var2.i());
                            vx1Var2.a = true;
                        } else {
                            if (aVar8 != aVar10 || (aVar9 != aVar11 && aVar9 != aVar12)) {
                                aVar4 = aVar11;
                                aVar5 = aVar9;
                            } else if (i5 == 3) {
                                if (aVar9 == aVar11) {
                                    f(vx1Var2, aVar11, 0, aVar11, 0);
                                }
                                int i7 = vx1Var2.i();
                                f(vx1Var2, aVar12, (int) ((i7 * vx1Var2.Y) + 0.5f), aVar12, i7);
                                vx1Var2.d.e.d(vx1Var2.o());
                                vx1Var2.e.e.d(vx1Var2.i());
                                vx1Var2.a = true;
                            } else {
                                aVar4 = aVar11;
                                if (i5 == 1) {
                                    f(vx1Var2, aVar4, 0, aVar9, 0);
                                    vx1Var2.d.e.m = vx1Var2.o();
                                } else {
                                    vx1.a aVar13 = aVar9;
                                    if (i5 == 2) {
                                        vx1.a aVar14 = aVarArr[c];
                                        if (aVar14 == aVar12 || aVar14 == aVar) {
                                            f(vx1Var2, aVar12, (int) ((f * wx1Var.o()) + 0.5f), aVar13, vx1Var2.i());
                                            vx1Var2.d.e.d(vx1Var2.o());
                                            vx1Var2.e.e.d(vx1Var2.i());
                                            vx1Var2.a = true;
                                        } else {
                                            aVar5 = aVar13;
                                        }
                                    } else {
                                        aVar5 = aVar13;
                                        if (sx1VarArr[c].f == null || sx1VarArr[1].f == null) {
                                            aVar12 = aVar12;
                                            aVar12 = aVar12;
                                            f(vx1Var2, aVar4, 0, aVar5, 0);
                                            vx1Var2.d.e.d(vx1Var2.o());
                                            vx1Var2.e.e.d(vx1Var2.i());
                                            vx1Var2.a = true;
                                        }
                                    }
                                }
                            }
                            if (aVar5 != aVar10 || (aVar8 != aVar4 && aVar8 != aVar12)) {
                                aVar12 = aVar12;
                                aVar6 = aVar4;
                                i3 = 1;
                                aVar12 = aVar12;
                                aVar7 = aVar8;
                            } else if (i6 == 3) {
                                if (aVar8 == aVar4) {
                                    f(vx1Var2, aVar4, 0, aVar4, 0);
                                }
                                int iO2 = vx1Var2.o();
                                float f4 = vx1Var2.Y;
                                if (vx1Var2.Z == -1) {
                                    f4 = 1.0f / f4;
                                }
                                f(vx1Var2, aVar12, iO2, aVar12, (int) ((iO2 * f4) + 0.5f));
                                vx1Var2.d.e.d(vx1Var2.o());
                                vx1Var2.e.e.d(vx1Var2.i());
                                vx1Var2.a = true;
                            } else if (i6 == 1) {
                                f(vx1Var2, aVar8, 0, aVar4, 0);
                                vx1Var2.e.e.m = vx1Var2.i();
                            } else {
                                aVar6 = aVar4;
                                vx1.a aVar15 = aVar8;
                                if (i6 == 2) {
                                    vx1.a aVar16 = aVarArr[1];
                                    if (aVar16 == aVar12 || aVar16 == aVar) {
                                        f(vx1Var2, aVar15, vx1Var2.o(), aVar12, (int) ((f2 * wx1Var.i()) + 0.5f));
                                        vx1Var2.d.e.d(vx1Var2.o());
                                        vx1Var2.e.e.d(vx1Var2.i());
                                        vx1Var2.a = true;
                                    } else {
                                        aVar7 = aVar15;
                                        i3 = 1;
                                    }
                                } else {
                                    aVar7 = aVar15;
                                    if (sx1VarArr[2].f == null || sx1VarArr[3].f == null) {
                                        f(vx1Var2, aVar6, 0, aVar5, 0);
                                        vx1Var2.d.e.d(vx1Var2.o());
                                        vx1Var2.e.e.d(vx1Var2.i());
                                        vx1Var2.a = true;
                                    } else {
                                        i3 = 1;
                                    }
                                }
                            }
                            if (aVar7 == aVar10 && aVar5 == aVar10) {
                                if (i5 == i3 || i6 == i3) {
                                    vx1.a aVar17 = aVar6;
                                    f(vx1Var2, aVar17, 0, aVar17, 0);
                                    vx1Var2.d.e.m = vx1Var2.o();
                                    vx1Var2.e.e.m = vx1Var2.i();
                                } else if (i6 == 2 && i5 == 2 && aVarArr[c] == aVar12 && aVarArr[i3] == aVar12) {
                                    f(vx1Var2, aVar12, (int) ((f * wx1Var.o()) + 0.5f), aVar12, (int) ((f2 * wx1Var.i()) + 0.5f));
                                    vx1Var2.d.e.d(vx1Var2.o());
                                    vx1Var2.e.e.d(vx1Var2.i());
                                    vx1Var2.a = true;
                                }
                            }
                        }
                        aVarArr2 = aVarArr;
                        arrayList = arrayList2;
                        size = i;
                    }
                }
                i = size;
                if (aVar8 == aVar10) {
                    aVar8 = aVar11;
                }
                if (aVar9 == aVar10) {
                    aVar9 = aVar11;
                }
                o15 o15Var2 = vx1Var2.d;
                o15Var2.d = aVar8;
                int i8 = vx1Var2.r;
                o15Var2.a = i8;
                meb mebVar2 = vx1Var2.e;
                mebVar2.d = aVar9;
                int i9 = vx1Var2.s;
                mebVar2.a = i9;
                aVar = vx1.a.w;
                if (aVar8 != aVar) {
                    aVar2 = aVar8;
                    iO = vx1Var2.o();
                    if (aVar2 == aVar) {
                        iO = (wx1Var.o() - sx1Var4.g) - sx1Var3.g;
                        aVar2 = aVar12;
                    }
                    i2 = vx1Var2.i();
                    if (aVar9 == aVar) {
                        i2 = (wx1Var.i() - sx1Var2.g) - sx1Var.g;
                        aVar3 = aVar12;
                    } else {
                        aVar3 = aVar9;
                    }
                    f(vx1Var2, aVar2, iO, aVar3, i2);
                    vx1Var2.d.e.d(vx1Var2.o());
                    vx1Var2.e.e.d(vx1Var2.i());
                    vx1Var2.a = true;
                } else {
                    aVar2 = aVar8;
                    iO = vx1Var2.o();
                    if (aVar2 == aVar) {
                        iO = (wx1Var.o() - sx1Var4.g) - sx1Var3.g;
                        aVar2 = aVar12;
                    }
                    i2 = vx1Var2.i();
                    if (aVar9 == aVar) {
                        i2 = (wx1Var.i() - sx1Var2.g) - sx1Var.g;
                        aVar3 = aVar12;
                    } else {
                        aVar3 = aVar9;
                    }
                    f(vx1Var2, aVar2, iO, aVar3, i2);
                    vx1Var2.d.e.d(vx1Var2.o());
                    vx1Var2.e.e.d(vx1Var2.i());
                    vx1Var2.a = true;
                }
                aVarArr2 = aVarArr;
                arrayList = arrayList2;
                size = i;
            }
        }
    }

    public final void c() {
        wx1 wx1Var = this.a;
        ArrayList<yy8> arrayList = this.h;
        ArrayList<dmb> arrayList2 = this.e;
        arrayList2.clear();
        wx1 wx1Var2 = this.d;
        wx1Var2.d.f();
        wx1Var2.e.f();
        arrayList2.add(wx1Var2.d);
        arrayList2.add(wx1Var2.e);
        ArrayList<vx1> arrayList3 = wx1Var2.r0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i = 0;
        while (i < size) {
            vx1 vx1Var = arrayList3.get(i);
            i++;
            vx1 vx1Var2 = vx1Var;
            if (vx1Var2 instanceof vp4) {
                wp4 wp4Var = new wp4(vx1Var2);
                vx1Var2.d.f();
                vx1Var2.e.f();
                wp4Var.f = ((vp4) vx1Var2).v0;
                arrayList2.add(wp4Var);
            } else {
                if (vx1Var2.v()) {
                    if (vx1Var2.b == null) {
                        vx1Var2.b = new f61(vx1Var2, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(vx1Var2.b);
                } else {
                    arrayList2.add(vx1Var2.d);
                }
                if (vx1Var2.w()) {
                    if (vx1Var2.c == null) {
                        vx1Var2.c = new f61(vx1Var2, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(vx1Var2.c);
                } else {
                    arrayList2.add(vx1Var2.e);
                }
                if (vx1Var2 instanceof dw4) {
                    arrayList2.add(new cw4(vx1Var2));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            dmb dmbVar = arrayList2.get(i2);
            i2++;
            dmbVar.f();
        }
        int size3 = arrayList2.size();
        int i3 = 0;
        while (i3 < size3) {
            dmb dmbVar2 = arrayList2.get(i3);
            i3++;
            dmb dmbVar3 = dmbVar2;
            if (dmbVar3.b != wx1Var2) {
                dmbVar3.d();
            }
        }
        arrayList.clear();
        e(wx1Var.d, 0, arrayList);
        e(wx1Var.e, 1, arrayList);
        this.b = false;
    }

    public final int d(wx1 wx1Var, int i) {
        ArrayList<yy8> arrayList;
        int i2;
        long j;
        float f;
        long j2;
        ArrayList<yy8> arrayList2 = this.h;
        int size = arrayList2.size();
        long j3 = 0;
        int i3 = 0;
        long jMax = 0;
        while (i3 < size) {
            dmb dmbVar = arrayList2.get(i3).a;
            if (!(dmbVar instanceof f61) ? !(i != 0 ? (dmbVar instanceof meb) : (dmbVar instanceof o15)) : ((f61) dmbVar).f != i) {
                fy2 fy2Var = (i == 0 ? wx1Var.d : wx1Var.e).h;
                fy2 fy2Var2 = (i == 0 ? wx1Var.d : wx1Var.e).i;
                fy2 fy2Var3 = dmbVar.h;
                fy2 fy2Var4 = dmbVar.i;
                boolean zContains = fy2Var3.l.contains(fy2Var);
                boolean zContains2 = fy2Var4.l.contains(fy2Var2);
                long j4 = dmbVar.j();
                if (zContains && zContains2) {
                    long jB = yy8.b(fy2Var3, j3);
                    arrayList = arrayList2;
                    long jA = yy8.a(fy2Var4, j3);
                    long j5 = jB - j4;
                    int i4 = fy2Var4.f;
                    i2 = i3;
                    if (j5 >= (-i4)) {
                        j5 += (long) i4;
                    }
                    long j6 = fy2Var3.f;
                    long j7 = ((-jA) - j4) - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    vx1 vx1Var = dmbVar.b;
                    if (i == 0) {
                        f = vx1Var.f0;
                    } else if (i == 1) {
                        f = vx1Var.g0;
                    } else {
                        vx1Var.getClass();
                        f = -1.0f;
                    }
                    if (f > 0.0f) {
                        j2 = (long) ((j5 / (1.0f - f)) + (j7 / f));
                    } else {
                        j2 = 0;
                    }
                    float f2 = j2;
                    j = (((long) fy2Var3.f) + ((((long) ((f2 * f) + 0.5f)) + j4) + ((long) go.a(1.0f, f, f2, 0.5f)))) - ((long) fy2Var4.f);
                } else {
                    arrayList = arrayList2;
                    i2 = i3;
                    if (zContains) {
                        j = Math.max(yy8.b(fy2Var3, fy2Var3.f), ((long) fy2Var3.f) + j4);
                    } else if (zContains2) {
                        j = Math.max(-yy8.a(fy2Var4, fy2Var4.f), ((long) (-fy2Var4.f)) + j4);
                    } else {
                        j = (dmbVar.j() + ((long) fy2Var3.f)) - ((long) fy2Var4.f);
                    }
                }
            } else {
                arrayList = arrayList2;
                j = j3;
                i2 = i3;
            }
            jMax = Math.max(jMax, j);
            i3 = i2 + 1;
            arrayList2 = arrayList;
            j3 = 0;
        }
        return (int) jMax;
    }

    public final void e(dmb dmbVar, int i, ArrayList<yy8> arrayList) {
        fy2 fy2Var = dmbVar.h;
        fy2 fy2Var2 = dmbVar.i;
        ArrayList arrayList2 = fy2Var.k;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            by2 by2Var = (by2) obj;
            if (by2Var instanceof fy2) {
                a((fy2) by2Var, i, arrayList, null);
            } else if (by2Var instanceof dmb) {
                a(((dmb) by2Var).h, i, arrayList, null);
            }
        }
        ArrayList arrayList3 = fy2Var2.k;
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            by2 by2Var2 = (by2) obj2;
            if (by2Var2 instanceof fy2) {
                a((fy2) by2Var2, i, arrayList, null);
            } else if (by2Var2 instanceof dmb) {
                a(((dmb) by2Var2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            ArrayList arrayList4 = ((meb) dmbVar).k.k;
            int size3 = arrayList4.size();
            while (i2 < size3) {
                Object obj3 = arrayList4.get(i2);
                i2++;
                by2 by2Var3 = (by2) obj3;
                if (by2Var3 instanceof fy2) {
                    a((fy2) by2Var3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(vx1 vx1Var, vx1.a aVar, int i, vx1.a aVar2, int i2) {
        ll0.a aVar3 = this.g;
        aVar3.a = aVar;
        aVar3.b = aVar2;
        aVar3.c = i;
        aVar3.d = i2;
        ((ConstraintLayout.b) this.f).b(vx1Var, aVar3);
        vx1Var.K(aVar3.e);
        vx1Var.H(aVar3.f);
        vx1Var.E = aVar3.h;
        int i3 = aVar3.g;
        vx1Var.c0 = i3;
        vx1Var.E = i3 > 0;
    }

    public final void g() {
        fl0 fl0Var;
        ey2 ey2Var = this;
        ArrayList<vx1> arrayList = ey2Var.a.r0;
        int size = arrayList.size();
        char c = 0;
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            vx1 vx1Var = arrayList.get(i);
            if (!vx1Var.a) {
                vx1.a[] aVarArr = vx1Var.U;
                vx1.a aVar = aVarArr[c];
                vx1.a aVar2 = aVarArr[1];
                int i3 = vx1Var.r;
                int i4 = vx1Var.s;
                vx1.a aVar3 = vx1.a.v;
                vx1.a aVar4 = vx1.a.u;
                char c2 = (aVar == aVar4 || (aVar == aVar3 && i3 == 1)) ? (char) 1 : c;
                char c3 = (aVar2 == aVar4 || (aVar2 == aVar3 && i4 == 1)) ? (char) 1 : c;
                t03 t03Var = vx1Var.d.e;
                boolean z = t03Var.j;
                t03 t03Var2 = vx1Var.e.e;
                boolean z2 = t03Var2.j;
                char c4 = c2;
                vx1.a aVar5 = vx1.a.t;
                if (z && z2) {
                    ey2Var.f(vx1Var, aVar5, t03Var.g, aVar5, t03Var2.g);
                    vx1Var.a = true;
                } else if (z && c3 != 0) {
                    f(vx1Var, aVar5, t03Var.g, aVar4, t03Var2.g);
                    meb mebVar = vx1Var.e;
                    if (aVar2 == aVar3) {
                        mebVar.e.m = vx1Var.i();
                    } else {
                        mebVar.e.d(vx1Var.i());
                        vx1Var.a = true;
                    }
                } else if (z2 && c4 != 0) {
                    f(vx1Var, aVar4, t03Var.g, aVar5, t03Var2.g);
                    o15 o15Var = vx1Var.d;
                    if (aVar == aVar3) {
                        o15Var.e.m = vx1Var.o();
                    } else {
                        o15Var.e.d(vx1Var.o());
                        vx1Var.a = true;
                    }
                }
                if (vx1Var.a && (fl0Var = vx1Var.e.l) != null) {
                    fl0Var.d(vx1Var.c0);
                }
                c = 0;
                ey2Var = this;
            }
            i = i2;
        }
    }
}
