package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e11 {
    public final ar7 a;
    public final e27<List<lx5.b>> b;
    public final f27 c;
    public final c27 d;
    public final e27<h11> e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public int m;

    public e11(ar7 ar7Var) {
        this.a = ar7Var;
        e27 e27Var = ag5.a;
        this.b = new e27<>();
        this.c = jg5.a();
        int i = rf5.a;
        this.d = new c27();
        this.e = new e27<>();
        this.g = -1;
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MIN_VALUE;
    }

    public final int a(final f11 f11Var, int i, boolean z) {
        List<lx5.b> listB;
        List<lx5.b> listB2;
        e27<h11> e27Var = this.e;
        if (e27Var.a(i)) {
            h11 h11VarB = e27Var.b(i);
            h11VarB.getClass();
            return h11VarB.b;
        }
        e27<List<lx5.b>> e27Var2 = this.b;
        int i2 = 0;
        if (e27Var2.a(i)) {
            if (!z || (listB2 = e27Var2.b(i)) == null) {
                return -1;
            }
            int size = listB2.size();
            while (i2 < size) {
                listB2.get(i2).c();
                i2++;
            }
            return -1;
        }
        e27Var2.i(i, f11Var.a(i, new ci4() { // from class: c11
            @Override // defpackage.ci4
            public final Object invoke(Object obj, Object obj2) {
                this.t.c(f11Var, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                return g2b.a;
            }
        }));
        if (!z || (listB = e27Var2.b(i)) == null) {
            return -1;
        }
        int size2 = listB.size();
        while (i2 < size2) {
            listB.get(i2).c();
            i2++;
        }
        return -1;
    }

    public final boolean b() {
        return (this.h == Integer.MAX_VALUE || this.i == Integer.MIN_VALUE) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    public final void c(f11 f11Var, int i, int i2) {
        int i3;
        e27<h11> e27Var = this.e;
        h11 h11VarB = e27Var.b(i);
        h11.a aVar = h11.c;
        if (h11VarB != null) {
            h11VarB.b = i2;
            h11VarB.a = aVar;
        } else {
            h11VarB = new h11();
            h11VarB.a = aVar;
            h11VarB.b = i2;
        }
        e27Var.i(i, h11VarB);
        if (i > this.i) {
            this.i = i;
            this.k -= i2;
        } else if (i < this.h) {
            this.h = i;
            this.j -= i2;
        }
        if (Math.signum(this.f) <= 0.0f) {
            if (this.k > 0) {
                i3 = this.i + 1;
            } else {
                i3 = -1;
            }
        } else if (Math.signum(this.f) <= 0.0f || this.j <= 0) {
            i3 = -1;
        } else {
            i3 = this.h - 1;
        }
        if (i3 > 0) {
            f11Var.b(i3);
            if (i3 != -1) {
                f11Var.b(i3);
                if (i3 < this.m) {
                    this.b.i(i3, f11Var.a(i3, new d11(0, this, f11Var)));
                }
            }
        }
        g();
    }

    public final void d(f11 f11Var, int i, int i2, int i3, int i4, int i5, float f, boolean z) {
        int i6;
        boolean z2 = Math.signum(f) == Math.signum(this.f);
        if (!z) {
            if (!z2 || this.l) {
                this.j = i3 - i5;
                this.h = i;
            } else {
                int iB = wk6.b(Math.abs(f)) + this.j;
                int i7 = i3 - i5;
                if (iB > i7) {
                    iB = i7;
                }
                this.j = iB;
            }
            while (this.j > 0 && (i6 = this.h) > 0) {
                int iA = a(f11Var, this.h - 1, i6 + (-1) == i + (-1) && ((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) != 0) && Math.abs(f) >= ((float) i5));
                if (iA == -1) {
                    return;
                }
                this.h--;
                this.j -= iA;
            }
            return;
        }
        if (!z2 || this.l) {
            this.k = i3 - i4;
            this.i = i2;
        } else {
            int iB2 = wk6.b(Math.abs(f)) + this.k;
            int i8 = i3 - i4;
            if (iB2 > i8) {
                iB2 = i8;
            }
            this.k = iB2;
        }
        while (this.k > 0) {
            int i9 = this.i;
            f11Var.b(i9);
            if (i9 == -1) {
                return;
            }
            int i10 = this.i;
            f11Var.b(i10);
            if (i10 >= this.m - 1) {
                return;
            }
            int iA2 = a(f11Var, this.i + 1, this.i + 1 == i2 + 1 && ((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) != 0) && Math.abs(f) >= ((float) i4));
            if (iA2 == -1) {
                return;
            }
            this.i++;
            this.k -= iA2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00f5 A[EDGE_INSN: B:102:0x00f5->B:59:0x00f5 BREAK  A[LOOP:4: B:45:0x00c1->B:58:0x00f2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[LOOP:0: B:5:0x0020->B:18:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f2 A[LOOP:4: B:45:0x00c1->B:58:0x00f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x0063 A[EDGE_INSN: B:88:0x0063->B:20:0x0063 BREAK  A[LOOP:0: B:5:0x0020->B:18:0x0056], SYNTHETIC] */
    public final void e(int i, int i2) {
        char c;
        long j;
        long j2;
        long j3;
        char c2;
        int[] iArr;
        long[] jArr;
        int i3;
        char c3;
        int i4;
        f27 f27Var = this.c;
        f27Var.b();
        e27<List<lx5.b>> e27Var = this.b;
        int[] iArr2 = e27Var.b;
        long[] jArr2 = e27Var.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i5 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j4 = jArr2[i5];
                c = 7;
                j3 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i5 != length) {
                        break;
                        break;
                    }
                    i5++;
                } else {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((j4 & 255) < 128 && i <= (i4 = iArr2[(i5 << 3) + i7]) && i4 <= i2) {
                            f27Var.a(i4);
                        }
                        j4 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    } else if (i5 != length) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
        }
        c27 c27Var = this.d;
        int[] iArr3 = c27Var.b;
        long[] jArr3 = c27Var.a;
        int length2 = jArr3.length - 2;
        if (length2 >= 0) {
            int i8 = 0;
            while (true) {
                long j5 = jArr3[i8];
                if ((((~j5) << c) & j5 & j3) != j3) {
                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j5 & j2) < j) {
                            c3 = c;
                            int i11 = iArr3[(i8 << 3) + i10];
                            if (i <= i11 && i11 <= i2) {
                                f27Var.a(i11);
                            }
                        } else {
                            c3 = c;
                        }
                        j5 >>= 8;
                        i10++;
                        c = c3;
                    }
                    c2 = c;
                    if (i9 != 8) {
                        break;
                    }
                } else {
                    c2 = c;
                }
                if (i8 == length2) {
                    break;
                }
                i8++;
                c = c2;
            }
        } else {
            c2 = c;
        }
        e27<h11> e27Var2 = this.e;
        int[] iArr4 = e27Var2.b;
        long[] jArr4 = e27Var2.a;
        int length3 = jArr4.length - 2;
        if (length3 >= 0) {
            int i12 = 0;
            while (true) {
                long j6 = jArr4[i12];
                if ((((~j6) << c2) & j6 & j3) == j3) {
                    if (i12 != length3) {
                        break;
                        break;
                    }
                    i12++;
                } else {
                    int i13 = 8 - ((~(i12 - length3)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((j6 & j2) < j && i <= (i3 = iArr4[(i12 << 3) + i14]) && i3 <= i2) {
                            f27Var.a(i3);
                        }
                        j6 >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    } else if (i12 != length3) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        }
        int[] iArr5 = f27Var.b;
        long[] jArr5 = f27Var.a;
        int length4 = jArr5.length - 2;
        if (length4 < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j7 = jArr5[i15];
            if ((((~j7) << c2) & j7 & j3) != j3) {
                int i16 = 8 - ((~(i15 - length4)) >>> 31);
                int i17 = 0;
                while (i17 < i16) {
                    if ((j7 & j2) < j) {
                        int i18 = iArr5[(i15 << 3) + i17];
                        List<lx5.b> listG = e27Var.g(i18);
                        if (listG != null) {
                            int size = listG.size();
                            for (int i19 = 0; i19 < size; i19++) {
                                listG.get(i19).cancel();
                            }
                        }
                        int iC = c27Var.c(i18);
                        if (iC >= 0) {
                            c27Var.e--;
                            long[] jArr6 = c27Var.a;
                            int i20 = c27Var.d;
                            int i21 = iC >> 3;
                            int i22 = (iC & 7) << 3;
                            long j8 = (jArr6[i21] & (~(j2 << i22))) | (254 << i22);
                            jArr6[i21] = j8;
                            jArr6[(((iC - 7) & i20) + (i20 & 7)) >> 3] = j8;
                        }
                        e27Var2.g(i18);
                    } else {
                        iArr5 = iArr5;
                        jArr5 = jArr5;
                    }
                    j7 >>= 8;
                    i17++;
                    iArr5 = iArr5;
                    jArr5 = jArr5;
                }
                iArr = iArr5;
                jArr = jArr5;
                if (i16 != 8) {
                    return;
                }
            } else {
                iArr = iArr5;
                jArr = jArr5;
            }
            if (i15 == length4) {
                return;
            }
            i15++;
            iArr5 = iArr;
            jArr5 = jArr;
        }
    }

    public final void f() {
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MIN_VALUE;
        this.j = 0;
        this.k = 0;
        this.l = false;
        this.d.a();
        this.e.c();
        e27<List<lx5.b>> e27Var = this.b;
        long[] jArr = e27Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = e27Var.b[i4];
                        List list = (List) e27Var.c[i4];
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ((lx5.b) list.get(i6)).cancel();
                        }
                        e27Var.h(i4);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void g() {
        qs.a(this.j, "prefetchWindowStartExtraSpace");
        qs.a(this.k, "prefetchWindowEndExtraSpace");
        qs.a(this.h, "prefetchWindowStartIndex");
        qs.a(this.i, "prefetchWindowEndIndex");
    }
}
