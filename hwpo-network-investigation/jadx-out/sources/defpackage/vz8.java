package defpackage;

import android.util.SparseArray;
import java.io.EOFException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class vz8 implements hsa {
    public boolean B;
    public id4 C;
    public id4 D;
    public long E;
    public boolean G;
    public long H;
    public boolean I;
    public final uz8 a;
    public final k83 d;
    public final j83.a e;
    public c f;
    public id4 g;
    public i83 h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean y;
    public final a b = new a();
    public int i = 1000;
    public long[] j = new long[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public hsa.a[] o = new hsa.a[1000];
    public final cx9<b> c = new cx9<>(new hp2());
    public long t = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public long w = Long.MIN_VALUE;
    public boolean A = true;
    public boolean z = true;
    public boolean F = true;
    public long u = Long.MIN_VALUE;
    public int x = -1;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public int a;
        public long b;
        public hsa.a c;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final id4 a;
        public final k83.b b;

        public b(id4 id4Var, k83.b bVar) {
            this.a = id4Var;
            this.b = bVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface c {
        void r();
    }

    public vz8(ki kiVar, k83 k83Var, j83.a aVar) {
        this.d = k83Var;
        this.e = aVar;
        this.a = new uz8(kiVar);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x007c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean A(long r11, boolean r13) throws java.lang.Throwable {
        /*
            r10 = this;
            monitor-enter(r10)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L6d
            r0 = 0
            r10.s = r0     // Catch: java.lang.Throwable -> L75
            uz8 r1 = r10.a     // Catch: java.lang.Throwable -> L75
            uz8$a r2 = r1.d     // Catch: java.lang.Throwable -> L75
            r1.e = r2     // Catch: java.lang.Throwable -> L75
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L72
            int r4 = r10.q(r0)     // Catch: java.lang.Throwable -> L68
            long r1 = r10.u     // Catch: java.lang.Throwable -> L68
            r5 = -9223372036854775808
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            long r5 = r10.w
            if (r3 == 0) goto L24
            long r5 = java.lang.Math.min(r5, r1)     // Catch: java.lang.Throwable -> L1f
            goto L24
        L1f:
            r0 = move-exception
            r11 = r0
            r3 = r10
            goto L7e
        L24:
            int r1 = r10.s     // Catch: java.lang.Throwable -> L6d
            int r2 = r10.p     // Catch: java.lang.Throwable -> L6d
            r9 = 1
            if (r1 == r2) goto L2d
            r3 = r9
            goto L2e
        L2d:
            r3 = r0
        L2e:
            if (r3 == 0) goto L3e
            long[] r3 = r10.n     // Catch: java.lang.Throwable -> L68
            r7 = r3[r4]     // Catch: java.lang.Throwable -> L68
            int r3 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r3 < 0) goto L3e
            int r3 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r3 <= 0) goto L40
            if (r13 != 0) goto L40
        L3e:
            r3 = r10
            goto L6b
        L40:
            boolean r3 = r10.F     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L51
            int r5 = r2 - r1
            r3 = r10
            r6 = r11
            r8 = r13
            int r10 = r3.l(r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L4e
            goto L5a
        L4e:
            r0 = move-exception
        L4f:
            r11 = r0
            goto L7e
        L51:
            r3 = r10
            r6 = r11
            int r5 = r2 - r1
            r8 = 1
            int r10 = r3.m(r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L4e
        L5a:
            r11 = -1
            if (r10 != r11) goto L5f
            monitor-exit(r3)
            return r0
        L5f:
            r3.t = r6     // Catch: java.lang.Throwable -> L4e
            int r11 = r3.s     // Catch: java.lang.Throwable -> L4e
            int r11 = r11 + r10
            r3.s = r11     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r3)
            return r9
        L68:
            r0 = move-exception
            r3 = r10
            goto L4f
        L6b:
            monitor-exit(r3)
            return r0
        L6d:
            r0 = move-exception
            r3 = r10
        L6f:
            r10 = r0
            r11 = r10
            goto L7e
        L72:
            r0 = move-exception
            r3 = r10
            goto L6f
        L75:
            r0 = move-exception
            r3 = r10
        L77:
            r10 = r0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7c
            throw r10     // Catch: java.lang.Throwable -> L7a
        L7a:
            r0 = move-exception
            goto L6f
        L7c:
            r0 = move-exception
            goto L77
        L7e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4e
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vz8.A(long, boolean):boolean");
    }

    public final synchronized void B(long j) throws Throwable {
        Throwable th;
        vz8 vz8Var;
        long j2;
        int iL;
        try {
            try {
                if (j == this.u) {
                    return;
                }
                int i = -1;
                if (j != Long.MIN_VALUE) {
                    if (j <= this.w) {
                        vz8Var = this;
                        j2 = j;
                        iL = vz8Var.l(this.r, this.p, j2, false);
                    } else {
                        vz8Var = this;
                        j2 = j;
                        iL = -1;
                    }
                    if (iL != -1) {
                        i = vz8Var.q + iL;
                    }
                    vz8Var.x = i;
                    vz8Var.u = j2;
                    return;
                }
                try {
                    this.x = -1;
                    return;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    public final synchronized void C(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.s + i <= this.p) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z = false;
        }
        xl7.g(z);
        this.s += i;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0172 A[Catch: all -> 0x00de, TryCatch #1 {all -> 0x00de, blocks: (B:69:0x00c0, B:71:0x00c4, B:75:0x00da, B:78:0x00e1, B:82:0x00e9, B:84:0x00fb, B:88:0x0103, B:89:0x010a, B:94:0x0139, B:117:0x01aa, B:119:0x01b3, B:96:0x0152, B:98:0x015b, B:100:0x0160, B:102:0x0172, B:106:0x017b, B:107:0x0180, B:109:0x0186, B:113:0x0194, B:115:0x0199, B:116:0x01a7, B:99:0x015e), top: B:125:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0178  */
    /* JADX WARN: Code duplicated, block: B:105:0x017a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0186 A[Catch: all -> 0x00de, TryCatch #1 {all -> 0x00de, blocks: (B:69:0x00c0, B:71:0x00c4, B:75:0x00da, B:78:0x00e1, B:82:0x00e9, B:84:0x00fb, B:88:0x0103, B:89:0x010a, B:94:0x0139, B:117:0x01aa, B:119:0x01b3, B:96:0x0152, B:98:0x015b, B:100:0x0160, B:102:0x0172, B:106:0x017b, B:107:0x0180, B:109:0x0186, B:113:0x0194, B:115:0x0199, B:116:0x01a7, B:99:0x015e), top: B:125:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0191  */
    /* JADX WARN: Code duplicated, block: B:112:0x0193  */
    /* JADX WARN: Code duplicated, block: B:115:0x0199 A[Catch: all -> 0x00de, TryCatch #1 {all -> 0x00de, blocks: (B:69:0x00c0, B:71:0x00c4, B:75:0x00da, B:78:0x00e1, B:82:0x00e9, B:84:0x00fb, B:88:0x0103, B:89:0x010a, B:94:0x0139, B:117:0x01aa, B:119:0x01b3, B:96:0x0152, B:98:0x015b, B:100:0x0160, B:102:0x0172, B:106:0x017b, B:107:0x0180, B:109:0x0186, B:113:0x0194, B:115:0x0199, B:116:0x01a7, B:99:0x015e), top: B:125:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code duplicated, block: B:96:0x0152 A[Catch: all -> 0x00de, TryCatch #1 {all -> 0x00de, blocks: (B:69:0x00c0, B:71:0x00c4, B:75:0x00da, B:78:0x00e1, B:82:0x00e9, B:84:0x00fb, B:88:0x0103, B:89:0x010a, B:94:0x0139, B:117:0x01aa, B:119:0x01b3, B:96:0x0152, B:98:0x015b, B:100:0x0160, B:102:0x0172, B:106:0x017b, B:107:0x0180, B:109:0x0186, B:113:0x0194, B:115:0x0199, B:116:0x01a7, B:99:0x015e), top: B:125:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x015b A[Catch: all -> 0x00de, TryCatch #1 {all -> 0x00de, blocks: (B:69:0x00c0, B:71:0x00c4, B:75:0x00da, B:78:0x00e1, B:82:0x00e9, B:84:0x00fb, B:88:0x0103, B:89:0x010a, B:94:0x0139, B:117:0x01aa, B:119:0x01b3, B:96:0x0152, B:98:0x015b, B:100:0x0160, B:102:0x0172, B:106:0x017b, B:107:0x0180, B:109:0x0186, B:113:0x0194, B:115:0x0199, B:116:0x01a7, B:99:0x015e), top: B:125:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x015e A[Catch: all -> 0x00de, TryCatch #1 {all -> 0x00de, blocks: (B:69:0x00c0, B:71:0x00c4, B:75:0x00da, B:78:0x00e1, B:82:0x00e9, B:84:0x00fb, B:88:0x0103, B:89:0x010a, B:94:0x0139, B:117:0x01aa, B:119:0x01b3, B:96:0x0152, B:98:0x015b, B:100:0x0160, B:102:0x0172, B:106:0x017b, B:107:0x0180, B:109:0x0186, B:113:0x0194, B:115:0x0199, B:116:0x01a7, B:99:0x015e), top: B:125:0x00c0 }] */
    @Override // defpackage.hsa
    public void a(long j, int i, int i2, int i3, hsa.a aVar) {
        int i4;
        l83 l83Var;
        cx9<b> cx9Var;
        int i5;
        SparseArray<b> sparseArray;
        int iKeyAt;
        boolean z;
        boolean z2;
        boolean z3;
        if (this.B) {
            id4 id4Var = this.C;
            id4Var.getClass();
            g(id4Var);
        }
        int i6 = i & 1;
        boolean z4 = i6 != 0;
        if (this.z) {
            if (!z4) {
                return;
            } else {
                this.z = false;
            }
        }
        long j2 = j + this.H;
        if (!this.F) {
            i4 = i;
        } else {
            if (j2 < this.t) {
                return;
            }
            if (i6 == 0) {
                if (!this.G) {
                    md6.g("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.D);
                    this.G = true;
                }
                i4 = i | 1;
            } else {
                i4 = i;
            }
        }
        if (this.I) {
            if (!z4) {
                return;
            }
            synchronized (this) {
                if (this.p == 0) {
                    z3 = j2 > this.v;
                } else {
                    synchronized (this) {
                        long jMax = Math.max(this.v, o(this.s));
                        if (jMax >= j2) {
                            z3 = false;
                        } else {
                            int i7 = this.p;
                            int iQ = q(i7 - 1);
                            while (i7 > this.s && this.n[iQ] >= j2) {
                                i7--;
                                iQ--;
                                if (iQ == -1) {
                                    iQ = this.i - 1;
                                }
                            }
                            k(this.q + i7);
                            z3 = true;
                        }
                    }
                }
            }
            if (!z3) {
                return;
            } else {
                this.I = false;
            }
        }
        long j3 = (this.a.g - ((long) i2)) - ((long) i3);
        synchronized (this) {
            try {
                int i8 = this.p;
                if (i8 > 0) {
                    int iQ2 = q(i8 - 1);
                    xl7.g(this.k[iQ2] + ((long) this.l[iQ2]) <= j3);
                }
                this.y = (536870912 & i4) != 0;
                this.w = Math.max(this.w, j2);
                long j4 = this.u;
                if (j4 != Long.MIN_VALUE && this.x == -1 && j2 >= j4) {
                    this.x = this.q + this.p;
                }
                int iQ3 = q(this.p);
                this.n[iQ3] = j2;
                this.k[iQ3] = j3;
                this.l[iQ3] = i2;
                this.m[iQ3] = i4;
                this.o[iQ3] = aVar;
                this.j[iQ3] = this.E;
                if (this.c.b.size() == 0) {
                    id4 id4Var2 = this.D;
                    id4Var2.getClass();
                    if (this.d != null) {
                        l83Var = k83.b.a;
                    } else {
                        l83Var = k83.b.a;
                    }
                    cx9Var = this.c;
                    i5 = this.q + this.p;
                    b bVar = new b(id4Var2, l83Var);
                    sparseArray = cx9Var.b;
                    if (cx9Var.a == -1) {
                        if (sparseArray.size() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        xl7.r(z2);
                        cx9Var.a = 0;
                    }
                    if (sparseArray.size() > 0) {
                        iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                        if (i5 >= iKeyAt) {
                            z = true;
                        } else {
                            z = false;
                        }
                        xl7.g(z);
                        if (iKeyAt == i5) {
                            cx9Var.c.accept(sparseArray.valueAt(sparseArray.size() - 1));
                        }
                    }
                    sparseArray.append(i5, bVar);
                } else {
                    SparseArray<b> sparseArray2 = this.c.b;
                    if (!sparseArray2.valueAt(sparseArray2.size() - 1).a.equals(this.D)) {
                        id4 id4Var3 = this.D;
                        id4Var3.getClass();
                        if (this.d != null) {
                            l83Var = k83.b.a;
                        } else {
                            l83Var = k83.b.a;
                        }
                        cx9Var = this.c;
                        i5 = this.q + this.p;
                        b bVar2 = new b(id4Var3, l83Var);
                        sparseArray = cx9Var.b;
                        if (cx9Var.a == -1) {
                            if (sparseArray.size() == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            xl7.r(z2);
                            cx9Var.a = 0;
                        }
                        if (sparseArray.size() > 0) {
                            iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                            if (i5 >= iKeyAt) {
                                z = true;
                            } else {
                                z = false;
                            }
                            xl7.g(z);
                            if (iKeyAt == i5) {
                                cx9Var.c.accept(sparseArray.valueAt(sparseArray.size() - 1));
                            }
                        }
                        sparseArray.append(i5, bVar2);
                    }
                }
                int i9 = this.p + 1;
                this.p = i9;
                int i10 = this.i;
                if (i9 == i10) {
                    int i11 = i10 + 1000;
                    long[] jArr = new long[i11];
                    long[] jArr2 = new long[i11];
                    long[] jArr3 = new long[i11];
                    int[] iArr = new int[i11];
                    int[] iArr2 = new int[i11];
                    hsa.a[] aVarArr = new hsa.a[i11];
                    int i12 = this.r;
                    int i13 = i10 - i12;
                    System.arraycopy(this.k, i12, jArr2, 0, i13);
                    System.arraycopy(this.n, this.r, jArr3, 0, i13);
                    System.arraycopy(this.m, this.r, iArr, 0, i13);
                    System.arraycopy(this.l, this.r, iArr2, 0, i13);
                    System.arraycopy(this.o, this.r, aVarArr, 0, i13);
                    System.arraycopy(this.j, this.r, jArr, 0, i13);
                    int i14 = this.r;
                    System.arraycopy(this.k, 0, jArr2, i13, i14);
                    System.arraycopy(this.n, 0, jArr3, i13, i14);
                    System.arraycopy(this.m, 0, iArr, i13, i14);
                    System.arraycopy(this.l, 0, iArr2, i13, i14);
                    System.arraycopy(this.o, 0, aVarArr, i13, i14);
                    System.arraycopy(this.j, 0, jArr, i13, i14);
                    this.k = jArr2;
                    this.n = jArr3;
                    this.m = iArr;
                    this.l = iArr2;
                    this.o = aVarArr;
                    this.j = jArr;
                    this.r = 0;
                    this.i = i11;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hsa
    public final void b(pt7 pt7Var, int i, int i2) {
        while (true) {
            uz8 uz8Var = this.a;
            if (i <= 0) {
                uz8Var.getClass();
                return;
            }
            int iB = uz8Var.b(i);
            uz8.a aVar = uz8Var.f;
            ji jiVar = aVar.c;
            pt7Var.k(jiVar.a, ((int) (uz8Var.g - aVar.a)) + jiVar.b, iB);
            i -= iB;
            long j = uz8Var.g + ((long) iB);
            uz8Var.g = j;
            uz8.a aVar2 = uz8Var.f;
            if (j == aVar2.b) {
                uz8Var.f = aVar2.d;
            }
        }
    }

    @Override // defpackage.hsa
    public final int c(ef2 ef2Var, int i, boolean z) throws EOFException {
        uz8 uz8Var = this.a;
        int iB = uz8Var.b(i);
        uz8.a aVar = uz8Var.f;
        ji jiVar = aVar.c;
        int i2 = ef2Var.read(jiVar.a, ((int) (uz8Var.g - aVar.a)) + jiVar.b, iB);
        if (i2 == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = uz8Var.g + ((long) i2);
        uz8Var.g = j;
        uz8.a aVar2 = uz8Var.f;
        if (j == aVar2.b) {
            uz8Var.f = aVar2.d;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0053 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:4:0x000a, B:8:0x0016, B:13:0x0026, B:15:0x003d, B:19:0x0055, B:21:0x0063, B:25:0x006c, B:18:0x0053), top: B:35:0x000a }] */
    @Override // defpackage.hsa
    public final void g(id4 id4Var) {
        id4 id4VarN = n(id4Var);
        boolean z = false;
        this.B = false;
        this.C = id4Var;
        synchronized (this) {
            try {
                this.A = false;
                if (!Objects.equals(id4VarN, this.D)) {
                    if (this.c.b.size() == 0) {
                        this.D = id4VarN;
                    } else {
                        SparseArray<b> sparseArray = this.c.b;
                        if (sparseArray.valueAt(sparseArray.size() - 1).a.equals(id4VarN)) {
                            SparseArray<b> sparseArray2 = this.c.b;
                            this.D = sparseArray2.valueAt(sparseArray2.size() - 1).a;
                        } else {
                            this.D = id4VarN;
                        }
                    }
                    boolean z2 = this.F;
                    id4 id4Var2 = this.D;
                    String str = id4Var2.o;
                    this.F = z2 & (fv6.h(str) == 1 && fv6.a(str, id4Var2.k));
                    this.G = false;
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c cVar = this.f;
        if (cVar == null || !z) {
            return;
        }
        cVar.r();
    }

    public final long h(int i) {
        this.v = Math.max(this.v, o(i));
        this.p -= i;
        int i2 = this.q + i;
        this.q = i2;
        int i3 = this.r + i;
        this.r = i3;
        int i4 = this.i;
        if (i3 >= i4) {
            this.r = i3 - i4;
        }
        int i5 = this.s - i;
        this.s = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.s = 0;
        }
        cx9<b> cx9Var = this.c;
        SparseArray<b> sparseArray = cx9Var.b;
        while (i6 < sparseArray.size() - 1) {
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            cx9Var.c.accept(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = cx9Var.a;
            if (i8 > 0) {
                cx9Var.a = i8 - 1;
            }
            i6 = i7;
        }
        if (this.p != 0) {
            return this.k[this.r];
        }
        int i9 = this.r;
        if (i9 == 0) {
            i9 = this.i;
        }
        int i10 = i9 - 1;
        return this.k[i10] + ((long) this.l[i10]);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public final void i(long j, boolean z, boolean z2) throws Throwable {
        Throwable th;
        uz8 uz8Var = this.a;
        synchronized (this) {
            try {
                try {
                    int i = this.p;
                    long jH = -1;
                    if (i != 0) {
                        long[] jArr = this.n;
                        int i2 = this.r;
                        if (j >= jArr[i2]) {
                            if (z2) {
                                try {
                                    int i3 = this.s;
                                    if (i3 != i) {
                                        i = i3 + 1;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            int iM = m(i2, i, j, z);
                            if (iM != -1) {
                                jH = h(iM);
                            }
                        }
                    }
                    uz8Var.a(jH);
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }

    public final void j() {
        long jH;
        uz8 uz8Var = this.a;
        synchronized (this) {
            int i = this.p;
            jH = i == 0 ? -1L : h(i);
        }
        uz8Var.a(jH);
    }

    public final long k(int i) {
        int i2 = this.q;
        int i3 = this.p;
        int i4 = (i2 + i3) - i;
        boolean z = false;
        xl7.g(i4 >= 0 && i4 <= i3 - this.s);
        int i5 = this.p - i4;
        this.p = i5;
        this.w = Math.max(this.v, o(i5));
        if (i4 == 0 && this.y) {
            z = true;
        }
        this.y = z;
        int i6 = this.x;
        if (i6 != -1 && i < i6) {
            this.x = -1;
        }
        cx9<b> cx9Var = this.c;
        SparseArray<b> sparseArray = cx9Var.b;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            cx9Var.c.accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        cx9Var.a = sparseArray.size() > 0 ? Math.min(cx9Var.a, sparseArray.size() - 1) : -1;
        int i7 = this.p;
        if (i7 == 0) {
            return 0L;
        }
        int iQ = q(i7 - 1);
        return this.k[iQ] + ((long) this.l[iQ]);
    }

    public final int l(int i, int i2, long j, boolean z) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.n[i] >= j) {
                return i3;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        if (z) {
            return i2;
        }
        return -1;
    }

    public final int m(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.n[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.m[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        return i3;
    }

    public id4 n(id4 id4Var) {
        if (this.H == 0 || id4Var.t == Long.MAX_VALUE) {
            return id4Var;
        }
        id4.a aVarA = id4Var.a();
        aVarA.s = id4Var.t + this.H;
        return new id4(aVarA);
    }

    public final long o(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iQ = q(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.n[iQ]);
            if ((this.m[iQ] & 1) != 0) {
                return jMax;
            }
            iQ--;
            if (iQ == -1) {
                iQ = this.i - 1;
            }
        }
        return jMax;
    }

    public final int p() {
        return this.q + this.s;
    }

    public final int q(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final synchronized int r(long j, boolean z) throws Throwable {
        try {
            try {
                int iQ = q(this.s);
                int i = this.s;
                int i2 = this.p;
                if (!(i != i2) || j < this.n[iQ]) {
                    return 0;
                }
                if (j > this.w && z) {
                    return i2 - i;
                }
                int iM = m(iQ, i2 - i, j, true);
                if (iM == -1) {
                    return 0;
                }
                return iM;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized id4 s() {
        return this.A ? null : this.D;
    }

    public final synchronized boolean t(boolean z) {
        id4 id4Var;
        int iP = p();
        int i = this.x;
        boolean z2 = true;
        if (i != -1 && iP >= i) {
            return true;
        }
        if (this.s != this.p) {
            if (this.c.a(iP).a != this.g) {
                return true;
            }
            return u(q(this.s));
        }
        if (!z && !this.y && ((id4Var = this.D) == null || id4Var == this.g)) {
            z2 = false;
        }
        return z2;
    }

    public final boolean u(int i) {
        i83 i83Var = this.h;
        if (i83Var == null || i83Var.getState() == 4) {
            return true;
        }
        return (this.m[i] & 1073741824) == 0 && this.h.b();
    }

    public final void v(id4 id4Var, jd4 jd4Var) {
        id4 id4Var2;
        id4 id4Var3 = this.g;
        boolean z = id4Var3 == null;
        h83 h83Var = id4Var3 == null ? null : id4Var3.s;
        this.g = id4Var;
        h83 h83Var2 = id4Var.s;
        k83 k83Var = this.d;
        if (k83Var != null) {
            int iG = k83Var.g(id4Var);
            id4.a aVarA = id4Var.a();
            aVarA.O = iG;
            id4Var2 = new id4(aVarA);
        } else {
            id4Var2 = id4Var;
        }
        jd4Var.b = id4Var2;
        jd4Var.a = this.h;
        if (k83Var == null) {
            return;
        }
        if (z || !Objects.equals(h83Var, h83Var2)) {
            i83 i83Var = this.h;
            j83.a aVar = this.e;
            i83 i83VarE = k83Var.e(aVar, id4Var);
            this.h = i83VarE;
            jd4Var.a = i83VarE;
            if (i83Var != null) {
                i83Var.c(aVar);
            }
        }
    }

    public final synchronized long w() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.s != this.p ? this.j[q(this.s)] : this.E;
    }

    public final int x(jd4 jd4Var, nn2 nn2Var, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        a aVar = this.b;
        synchronized (this) {
            nn2Var.x = false;
            int iP = p();
            int i3 = this.x;
            boolean z3 = i3 != -1 && iP >= i3;
            i2 = -5;
            if ((this.s != this.p) && !z3) {
                id4 id4Var = this.c.a(iP).a;
                if (z2 || id4Var != this.g) {
                    v(id4Var, jd4Var);
                } else {
                    int iQ = q(this.s);
                    if (u(iQ)) {
                        nn2Var.t = this.m[iQ];
                        if (this.s == this.p - 1 && (z || this.y)) {
                            nn2Var.h(536870912);
                        }
                        nn2Var.y = this.n[iQ];
                        aVar.a = this.l[iQ];
                        aVar.b = this.k[iQ];
                        aVar.c = this.o[iQ];
                        i2 = -4;
                    } else {
                        nn2Var.x = true;
                        i2 = -3;
                    }
                }
            } else if (z || this.y || z3) {
                nn2Var.t = 4;
                nn2Var.y = Long.MIN_VALUE;
                i2 = -4;
            } else {
                id4 id4Var2 = this.D;
                if (id4Var2 == null || (!z2 && id4Var2 == this.g)) {
                    i2 = -3;
                } else {
                    v(id4Var2, jd4Var);
                }
            }
        }
        if (i2 == -4 && !nn2Var.i(4)) {
            boolean z4 = (i & 1) != 0;
            if ((i & 4) == 0) {
                uz8 uz8Var = this.a;
                a aVar2 = this.b;
                if (z4) {
                    uz8.e(uz8Var.e, nn2Var, aVar2, uz8Var.c);
                } else {
                    uz8Var.e = uz8.e(uz8Var.e, nn2Var, aVar2, uz8Var.c);
                }
            }
            if (!z4) {
                this.s++;
            }
        }
        return i2;
    }

    public final void y(boolean z) {
        uz8 uz8Var = this.a;
        uz8.a aVar = uz8Var.d;
        ki kiVar = uz8Var.a;
        if (aVar.c != null) {
            kiVar.a(aVar);
            aVar.c = null;
            aVar.d = null;
        }
        uz8.a aVar2 = uz8Var.d;
        int i = uz8Var.b;
        xl7.r(aVar2.c == null);
        aVar2.a = 0L;
        aVar2.b = i;
        uz8.a aVar3 = uz8Var.d;
        uz8Var.e = aVar3;
        uz8Var.f = aVar3;
        uz8Var.g = 0L;
        kiVar.d();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = -1;
        this.z = true;
        this.t = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = Long.MIN_VALUE;
        this.y = false;
        cx9<b> cx9Var = this.c;
        SparseArray<b> sparseArray = cx9Var.b;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            cx9Var.c.accept(sparseArray.valueAt(i2));
        }
        cx9Var.a = -1;
        sparseArray.clear();
        if (z) {
            this.C = null;
            this.D = null;
            this.A = true;
            this.F = true;
        }
    }

    public final synchronized boolean z(int i) {
        synchronized (this) {
            this.s = 0;
            uz8 uz8Var = this.a;
            uz8Var.e = uz8Var.d;
        }
        int i2 = this.q;
        if (i >= i2 && i <= this.p + i2) {
            int i3 = this.x;
            if (i3 != -1 && i >= i3) {
                return false;
            }
            this.t = Long.MIN_VALUE;
            this.s = i - i2;
            return true;
        }
        return false;
    }
}
