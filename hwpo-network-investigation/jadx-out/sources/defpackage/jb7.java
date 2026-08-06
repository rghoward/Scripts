package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jb7 extends wb7 {
    public final ox6.c c;
    public final z48 d;
    public final we6<a58> e;
    public mb7 f;
    public r48 g;
    public boolean h;
    public boolean i;
    public boolean j;

    public jb7(ox6.c cVar) {
        this.c = cVar;
        z48 z48Var = new z48();
        z48Var.b = new long[2];
        this.d = z48Var;
        this.e = new we6<>(2);
        this.i = true;
        this.j = true;
    }

    /* JADX WARN: Code duplicated, block: B:161:0x02f5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r5v0, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r5v1, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r5v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [k37] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22, types: [k37] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    @Override // defpackage.wb7
    public final boolean a(we6<a58> we6Var, qq5 qq5Var, ij5 ij5Var, boolean z) {
        z48 z48Var;
        we6<a58> we6Var2;
        Object obj;
        boolean z2;
        boolean z3;
        r48 r48Var;
        int i;
        int i2;
        boolean z4;
        boolean zA = super.a(we6Var, qq5Var, ij5Var, z);
        ?? B = this.c;
        boolean z5 = true;
        if (B.G) {
            ?? k37Var = 0;
            while (B != 0) {
                if (B instanceof g58) {
                    this.f = ew2.d((g58) B, 16);
                } else if ((B.v & 16) != 0 && (B instanceof gw2)) {
                    ox6.c cVar = ((gw2) B).I;
                    int i3 = 0;
                    while (cVar != null) {
                        if ((cVar.v & 16) != 0) {
                            i3++;
                            if (i3 == 1) {
                                B = B;
                                k37Var = k37Var;
                                k37Var = k37Var;
                                B = cVar;
                            } else {
                                if (k37Var == 0) {
                                    k37Var = new k37(new ox6.c[16]);
                                }
                                if (B != 0) {
                                    k37Var.d(B);
                                    B = 0;
                                }
                                k37Var.d(cVar);
                            }
                        } else {
                            B = B;
                            k37Var = k37Var;
                        }
                        cVar = cVar.y;
                        B = B;
                        k37Var = k37Var;
                    }
                    if (i3 == 1) {
                        B = B;
                        k37Var = k37Var;
                    } else {
                        B = B;
                        k37Var = k37Var;
                    }
                }
                B = ew2.b(k37Var);
            }
            if (this.f != null) {
                int iH = we6Var.h();
                int i4 = 0;
                while (true) {
                    z48Var = this.d;
                    we6Var2 = this.e;
                    if (i4 >= iH) {
                        break;
                    }
                    long jE = we6Var.e(i4);
                    a58 a58VarI = we6Var.i(i4);
                    if (z48Var.b(jE)) {
                        boolean z6 = z5;
                        long j = a58VarI.g;
                        List<ty4> list = a58VarI.m;
                        long j2 = a58VarI.c;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z4 = z6;
                            hf3 hf3Var = hf3.t;
                            ArrayList arrayList = new ArrayList((list == null ? hf3Var : list).size());
                            List<ty4> list2 = list == null ? hf3Var : list;
                            int size = list2.size();
                            int i5 = 0;
                            while (i5 < size) {
                                List<ty4> list3 = list2;
                                ty4 ty4Var = list2.get(i5);
                                we6<a58> we6Var3 = we6Var2;
                                long j3 = jE;
                                long j4 = ty4Var.b;
                                if ((((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    long j5 = ty4Var.a;
                                    mb7 mb7Var = this.f;
                                    mb7Var.getClass();
                                    arrayList.add(new ty4(j5, mb7Var.U(qq5Var, j4), ty4Var.c, ty4Var.d, ty4Var.e));
                                }
                                i5++;
                                size = size;
                                list2 = list3;
                                we6Var2 = we6Var3;
                                jE = j3;
                                a58VarI = a58VarI;
                            }
                            we6<a58> we6Var4 = we6Var2;
                            long j6 = jE;
                            mb7 mb7Var2 = this.f;
                            mb7Var2.getClass();
                            long jU = mb7Var2.U(qq5Var, j);
                            mb7 mb7Var3 = this.f;
                            mb7Var3.getClass();
                            a58 a58Var = new a58(a58VarI.a, a58VarI.b, mb7Var3.U(qq5Var, j2), a58VarI.d, a58VarI.e, a58VarI.f, jU, a58VarI.h, a58VarI.i, arrayList, a58VarI.j, a58VarI.k, a58VarI.l, a58VarI.n);
                            a58 a58Var2 = a58VarI.q;
                            if (a58Var2 == null) {
                                a58Var2 = a58VarI;
                            }
                            a58Var.q = a58Var2;
                            a58 a58Var3 = a58VarI.q;
                            if (a58Var3 != null) {
                                a58VarI = a58Var3;
                            }
                            a58Var.q = a58VarI;
                            we6Var4.f(j6, a58Var);
                        } else {
                            z4 = z6;
                        }
                    } else {
                        z4 = z5;
                    }
                    i4++;
                    iH = iH;
                    z5 = z4;
                    zA = zA;
                }
                boolean z7 = zA;
                boolean z8 = z5;
                if (we6Var2.d()) {
                    z48Var.a = 0;
                    this.a.k();
                    return z8;
                }
                int i6 = z48Var.a;
                while (true) {
                    i6--;
                    if (-1 >= i6) {
                        break;
                    }
                    if (we6Var.c(z48Var.b[i6]) < 0 && i6 < (i2 = z48Var.a)) {
                        int i7 = i2 - 1;
                        int i8 = i6;
                        while (i8 < i7) {
                            long[] jArr = z48Var.b;
                            int i9 = i8 + 1;
                            jArr[i8] = jArr[i9];
                            i8 = i9;
                        }
                        z48Var.a--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(we6Var2.h());
                int iH2 = we6Var2.h();
                for (int i10 = 0; i10 < iH2; i10++) {
                    arrayList2.add(we6Var2.i(i10));
                }
                r48 r48Var2 = new r48(arrayList2, ij5Var);
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i11);
                    if (ij5Var.a(((a58) obj).a)) {
                        break;
                    }
                    i11++;
                }
                a58 a58Var4 = (a58) obj;
                if (a58Var4 != null) {
                    boolean z9 = a58Var4.d;
                    if (z) {
                        z2 = false;
                        if (!this.i && (z9 || a58Var4.h)) {
                            mb7 mb7Var4 = this.f;
                            mb7Var4.getClass();
                            long j7 = mb7Var4.v;
                            long j8 = a58Var4.c;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L));
                            int i12 = (int) (j7 >> 32);
                            this.i = !((fIntBitsToFloat2 > ((float) ((int) (j7 & 4294967295L))) ? z8 : false) | (fIntBitsToFloat > ((float) i12) ? z8 : false) | (fIntBitsToFloat < 0.0f ? z8 : false) | (fIntBitsToFloat2 < 0.0f ? z8 : false));
                        }
                    } else {
                        z2 = false;
                        this.i = false;
                    }
                    boolean z10 = this.i;
                    boolean z11 = this.h;
                    if (z10 == z11 || !((i = r48Var2.f) == 3 || i == 4 || i == 5)) {
                        int i13 = r48Var2.f;
                        if (i13 == 4 && z11 && !this.j) {
                            r48Var2.f = 3;
                        } else if (i13 == 5 && z10 && z9) {
                            r48Var2.f = 3;
                        }
                    } else {
                        r48Var2.f = z10 ? 4 : 5;
                    }
                } else {
                    z2 = false;
                }
                if (!z7 && r48Var2.f == 3 && (r48Var = this.g) != null) {
                    List<a58> list4 = r48Var.a;
                    int size3 = list4.size();
                    List<a58> list5 = r48Var2.a;
                    if (size3 != list5.size()) {
                        z3 = z8;
                        break;
                    }
                    int size4 = list5.size();
                    ?? r6 = z2;
                    while (true) {
                        if (r6 >= size4) {
                            z3 = z2;
                            break;
                        }
                        if (!vf7.b(list4.get(r6).c, list5.get(r6).c)) {
                            z3 = z8;
                            break;
                        }
                        r6++;
                    }
                } else {
                    z3 = z8;
                    break;
                }
                this.g = r48Var2;
                return z3;
            }
        }
        return true;
    }

    @Override // defpackage.wb7
    public final void b(ij5 ij5Var) {
        super.b(ij5Var);
        r48 r48Var = this.g;
        if (r48Var == null) {
            return;
        }
        this.h = this.i;
        List<a58> list = r48Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a58 a58Var = list.get(i);
            boolean z = a58Var.d;
            long j = a58Var.a;
            boolean zA = ij5Var.a(j);
            boolean z2 = this.i;
            if ((!z && !zA) || (!z && !z2)) {
                this.d.c(j);
            }
        }
        this.i = false;
        this.j = r48Var.f == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [k37] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [k37] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r8v1, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void c() {
        k37<jb7> k37Var = this.a;
        jb7[] jb7VarArr = k37Var.t;
        int i = k37Var.v;
        for (int i2 = 0; i2 < i; i2++) {
            jb7VarArr[i2].c();
        }
        ?? B = this.c;
        ?? k37Var2 = 0;
        while (B != 0) {
            if (B instanceof g58) {
                ((g58) B).t0();
            } else if ((B.v & 16) != 0 && (B instanceof gw2)) {
                ox6.c cVar = ((gw2) B).I;
                int i3 = 0;
                k37Var2 = k37Var2;
                B = B;
                while (cVar != null) {
                    if ((cVar.v & 16) != 0) {
                        i3++;
                        if (i3 == 1) {
                            k37Var2 = k37Var2;
                            B = cVar;
                        } else {
                            if (k37Var2 == 0) {
                                k37Var2 = new k37(new ox6.c[16]);
                            }
                            if (B != 0) {
                                k37Var2.d(B);
                                B = 0;
                            }
                            k37Var2.d(cVar);
                        }
                    }
                    cVar = cVar.y;
                    k37Var2 = k37Var2;
                    B = B;
                }
                if (i3 == 1) {
                }
            }
            B = ew2.b(k37Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [k37] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [k37] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(ij5 ij5Var) {
        qr5 qr5Var;
        we6<a58> we6Var = this.e;
        boolean z = false;
        z = false;
        z = false;
        if (!we6Var.d()) {
            ox6.c cVar = this.c;
            if (cVar.G) {
                mb7 mb7Var = cVar.A;
                if ((mb7Var == null || (qr5Var = mb7Var.H) == null) ? false : qr5Var.j()) {
                    r48 r48Var = this.g;
                    r48Var.getClass();
                    mb7 mb7Var2 = this.f;
                    mb7Var2.getClass();
                    long j = mb7Var2.v;
                    ?? B = cVar;
                    ?? k37Var = 0;
                    while (B != 0) {
                        if (B instanceof g58) {
                            ((g58) B).c0(r48Var, s48.v, j);
                        } else if ((B.v & 16) != 0 && (B instanceof gw2)) {
                            ox6.c cVar2 = ((gw2) B).I;
                            int i = 0;
                            while (cVar2 != null) {
                                if ((cVar2.v & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        B = B;
                                        k37Var = k37Var;
                                        k37Var = k37Var;
                                        B = cVar2;
                                    } else {
                                        if (k37Var == 0) {
                                            k37Var = new k37(new ox6.c[16]);
                                        }
                                        if (B != 0) {
                                            k37Var.d(B);
                                            B = 0;
                                        }
                                        k37Var.d(cVar2);
                                    }
                                } else {
                                    B = B;
                                    k37Var = k37Var;
                                }
                                cVar2 = cVar2.y;
                                B = B;
                                k37Var = k37Var;
                            }
                            if (i == 1) {
                                B = B;
                                k37Var = k37Var;
                            } else {
                                B = B;
                                k37Var = k37Var;
                            }
                        }
                        B = ew2.b(k37Var);
                    }
                    if (cVar.G) {
                        k37<jb7> k37Var2 = this.a;
                        jb7[] jb7VarArr = k37Var2.t;
                        int i2 = k37Var2.v;
                        for (int i3 = 0; i3 < i2; i3++) {
                            jb7VarArr[i3].d(ij5Var);
                        }
                    }
                    z = true;
                }
            }
        }
        b(ij5Var);
        we6Var.a();
        this.f = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r0v3, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [k37] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [k37] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r6v10, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [k37] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [k37] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(ij5 ij5Var, boolean z) {
        qr5 qr5Var;
        if (!this.e.d()) {
            ?? B = this.c;
            if (B.G) {
                mb7 mb7Var = B.A;
                if ((mb7Var == null || (qr5Var = mb7Var.H) == null) ? false : qr5Var.j()) {
                    r48 r48Var = this.g;
                    r48Var.getClass();
                    mb7 mb7Var2 = this.f;
                    mb7Var2.getClass();
                    long j = mb7Var2.v;
                    ?? B2 = B;
                    ?? k37Var = 0;
                    while (B2 != 0) {
                        if (B2 instanceof g58) {
                            ((g58) B2).c0(r48Var, s48.t, j);
                        } else if ((B2.v & 16) != 0 && (B2 instanceof gw2)) {
                            ox6.c cVar = ((gw2) B2).I;
                            int i = 0;
                            while (cVar != null) {
                                if ((cVar.v & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        B2 = B2;
                                        k37Var = k37Var;
                                        k37Var = k37Var;
                                        B2 = cVar;
                                    } else {
                                        if (k37Var == 0) {
                                            k37Var = new k37(new ox6.c[16]);
                                        }
                                        if (B2 != 0) {
                                            k37Var.d(B2);
                                            B2 = 0;
                                        }
                                        k37Var.d(cVar);
                                    }
                                } else {
                                    B2 = B2;
                                    k37Var = k37Var;
                                }
                                cVar = cVar.y;
                                B2 = B2;
                                k37Var = k37Var;
                            }
                            if (i == 1) {
                                B2 = B2;
                                k37Var = k37Var;
                            } else {
                                B2 = B2;
                                k37Var = k37Var;
                            }
                        }
                        B2 = ew2.b(k37Var);
                    }
                    if (B.G) {
                        k37<jb7> k37Var2 = this.a;
                        jb7[] jb7VarArr = k37Var2.t;
                        int i2 = k37Var2.v;
                        for (int i3 = 0; i3 < i2; i3++) {
                            jb7 jb7Var = jb7VarArr[i3];
                            this.f.getClass();
                            jb7Var.e(ij5Var, z);
                        }
                    }
                    if (B.G) {
                        ?? k37Var3 = 0;
                        while (B != 0) {
                            if (B instanceof g58) {
                                ((g58) B).c0(r48Var, s48.u, j);
                            } else if ((B.v & 16) != 0 && (B instanceof gw2)) {
                                ox6.c cVar2 = ((gw2) B).I;
                                int i4 = 0;
                                while (cVar2 != null) {
                                    if ((cVar2.v & 16) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            B = B;
                                            k37Var3 = k37Var3;
                                            k37Var3 = k37Var3;
                                            B = cVar2;
                                        } else {
                                            if (k37Var3 == 0) {
                                                k37Var3 = new k37(new ox6.c[16]);
                                            }
                                            if (B != 0) {
                                                k37Var3.d(B);
                                                B = 0;
                                            }
                                            k37Var3.d(cVar2);
                                        }
                                    } else {
                                        B = B;
                                        k37Var3 = k37Var3;
                                    }
                                    cVar2 = cVar2.y;
                                    B = B;
                                    k37Var3 = k37Var3;
                                }
                                if (i4 == 1) {
                                    B = B;
                                    k37Var3 = k37Var3;
                                } else {
                                    B = B;
                                    k37Var3 = k37Var3;
                                }
                            }
                            B = ew2.b(k37Var3);
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void f(long j, t27<jb7> t27Var) {
        z48 z48Var = this.d;
        if (z48Var.b(j) && t27Var.c(this) < 0) {
            z48Var.c(j);
            this.e.g(j);
        }
        k37<jb7> k37Var = this.a;
        jb7[] jb7VarArr = k37Var.t;
        int i = k37Var.v;
        for (int i2 = 0; i2 < i; i2++) {
            jb7VarArr[i2].f(j, t27Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ')';
    }
}
