package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class us4 implements ce3 {
    public final l99 a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public hsa j;
    public a k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final e47 d = new e47(7);
    public final e47 e = new e47(8);
    public final e47 f = new e47(6);
    public long m = -9223372036854775807L;
    public final pt7 o = new pt7();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final hsa a;
        public final boolean b;
        public final boolean c;
        public final qt7 f;
        public byte[] g;
        public int h;
        public int i;
        public long j;
        public long l;
        public long p;
        public long q;
        public boolean r;
        public boolean s;
        public final SparseArray<f47.m> d = new SparseArray<>();
        public final SparseArray<f47.l> e = new SparseArray<>();
        public C0267a m = new C0267a();
        public C0267a n = new C0267a();
        public boolean k = false;
        public boolean o = false;

        /* JADX INFO: renamed from: us4$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0267a {
            public boolean a;
            public boolean b;
            public f47.m c;
            public int d;
            public int e;
            public int f;
            public int g;
            public boolean h;
            public boolean i;
            public boolean j;
            public boolean k;
            public int l;
            public int m;
            public int n;
            public int o;
            public int p;
        }

        public a(hsa hsaVar, boolean z, boolean z2) {
            this.a = hsaVar;
            this.b = z;
            this.c = z2;
            byte[] bArr = new byte[128];
            this.g = bArr;
            this.f = new qt7(bArr, 0, 0);
            C0267a c0267a = this.n;
            c0267a.b = false;
            c0267a.a = false;
        }
    }

    public us4(l99 l99Var, boolean z, boolean z2) {
        this.a = l99Var;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.ce3
    public final void a(pt7 pt7Var) {
        int i;
        this.j.getClass();
        String str = n6b.a;
        int i2 = pt7Var.b;
        int i3 = pt7Var.c;
        byte[] bArr = pt7Var.a;
        this.g += (long) pt7Var.a();
        this.j.e(pt7Var.a(), pt7Var);
        while (true) {
            int iB = f47.b(bArr, i2, i3, this.h);
            if (iB == i3) {
                g(bArr, i2, i3);
                return;
            }
            int i4 = bArr[iB + 3] & 31;
            if (iB <= 0 || bArr[iB - 1] != 0) {
                i = 3;
            } else {
                iB--;
                i = 4;
            }
            int i5 = iB;
            int i6 = i;
            int i7 = i5 - i2;
            if (i7 > 0) {
                g(bArr, i2, i5);
            }
            int i8 = i3 - i5;
            long j = this.g - ((long) i8);
            b(i8, i7 < 0 ? -i7 : 0, j, this.m);
            h(j, i4, this.m);
            i2 = i5 + i6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:66:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:73:0x0200  */
    /* JADX WARN: Code duplicated, block: B:92:0x023d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void b(int i, int i2, long j, long j2) {
        long j3;
        int i3;
        long j4;
        long j5;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        pn8 pn8Var = this.a.c;
        if (!this.l || this.k.c) {
            e47 e47Var = this.d;
            e47Var.b(i2);
            e47 e47Var2 = this.e;
            e47Var2.b(i2);
            boolean z4 = this.l;
            boolean z5 = e47Var.c;
            if (z4) {
                if (z5) {
                    f47.m mVarK = f47.k(e47Var.d, 3, e47Var.e);
                    pn8Var.c(mVarK.s);
                    this.k.d.append(mVarK.d, mVarK);
                    e47Var.c();
                } else if (e47Var2.c) {
                    qt7 qt7Var = new qt7(e47Var2.d, 4, e47Var2.e);
                    int iF = qt7Var.f();
                    int iF2 = qt7Var.f();
                    qt7Var.i();
                    this.k.e.append(iF, new f47.l(iF, qt7Var.d(), iF2));
                    e47Var2.c();
                }
            } else if (z5 && e47Var2.c) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(e47Var.d, e47Var.e));
                arrayList.add(Arrays.copyOf(e47Var2.d, e47Var2.e));
                f47.m mVarK2 = f47.k(e47Var.d, 3, e47Var.e);
                int i8 = mVarK2.s;
                qt7 qt7Var2 = new qt7(e47Var2.d, 4, e47Var2.e);
                int iF3 = qt7Var2.f();
                int iF4 = qt7Var2.f();
                qt7Var2.i();
                f47.l lVar = new f47.l(iF3, qt7Var2.d(), iF4);
                int i9 = mVarK2.a;
                int i10 = mVarK2.b;
                int i11 = mVarK2.c;
                byte[] bArr = og1.a;
                String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
                hsa hsaVar = this.j;
                id4.a aVar = new id4.a();
                aVar.a = this.i;
                aVar.m = fv6.n("video/mp2t");
                aVar.n = fv6.n("video/avc");
                aVar.j = str;
                aVar.u = mVarK2.e;
                aVar.v = mVarK2.f;
                aVar.D = new xh1(mVarK2.p, mVarK2.q, mVarK2.r, mVarK2.h + 8, mVarK2.i + 8, null);
                aVar.A = mVarK2.g;
                aVar.q = arrayList;
                aVar.p = i8;
                hy1.b(aVar, hsaVar);
                this.l = true;
                pn8Var.c(i8);
                this.k.d.append(mVarK2.d, mVarK2);
                this.k.e.append(iF3, lVar);
                e47Var.c();
                e47Var2.c();
            }
        }
        e47 e47Var3 = this.f;
        if (e47Var3.b(i2)) {
            int iM = f47.m(e47Var3.d, e47Var3.e);
            byte[] bArr2 = e47Var3.d;
            pt7 pt7Var = this.o;
            pt7Var.K(bArr2, iM);
            pt7Var.M(4);
            pn8Var.a(j2, pt7Var);
        }
        a aVar2 = this.k;
        boolean z6 = this.l;
        if (aVar2.i == 9) {
            if (z6 && aVar2.o) {
                j3 = aVar2.j;
                i3 = i + ((int) (j - j3));
                j4 = aVar2.q;
                if (j4 != -9223372036854775807L) {
                    j5 = aVar2.p;
                    if (j3 != j5) {
                        aVar2.a.a(j4, aVar2.r ? 1 : 0, (int) (j3 - j5), i3, null);
                    }
                }
            }
            aVar2.p = aVar2.j;
            aVar2.q = aVar2.l;
            aVar2.r = false;
            aVar2.o = true;
        } else if (aVar2.c) {
            a.C0267a c0267a = aVar2.n;
            a.C0267a c0267a2 = aVar2.m;
            if (c0267a.a) {
                if (c0267a2.a) {
                    f47.m mVar = c0267a.c;
                    mVar.getClass();
                    f47.m mVar2 = c0267a2.c;
                    mVar2.getClass();
                    int i12 = mVar2.m;
                    if (c0267a.f != c0267a2.f || c0267a.g != c0267a2.g || c0267a.h != c0267a2.h || ((c0267a.i && c0267a2.i && c0267a.j != c0267a2.j) || (((i5 = c0267a.d) != (i6 = c0267a2.d) && (i5 == 0 || i6 == 0)) || (((i7 = mVar.m) == 0 && i12 == 0 && (c0267a.m != c0267a2.m || c0267a.n != c0267a2.n)) || ((i7 == 1 && i12 == 1 && (c0267a.o != c0267a2.o || c0267a.p != c0267a2.p)) || (z3 = c0267a.k) != c0267a2.k || (z3 && c0267a.l != c0267a2.l)))))) {
                        if (z6) {
                            j3 = aVar2.j;
                            i3 = i + ((int) (j - j3));
                            j4 = aVar2.q;
                            if (j4 != -9223372036854775807L) {
                                j5 = aVar2.p;
                                if (j3 != j5) {
                                    aVar2.a.a(j4, aVar2.r ? 1 : 0, (int) (j3 - j5), i3, null);
                                }
                            }
                        }
                        aVar2.p = aVar2.j;
                        aVar2.q = aVar2.l;
                        aVar2.r = false;
                        aVar2.o = true;
                    }
                } else {
                    if (z6) {
                        j3 = aVar2.j;
                        i3 = i + ((int) (j - j3));
                        j4 = aVar2.q;
                        if (j4 != -9223372036854775807L) {
                            j5 = aVar2.p;
                            if (j3 != j5) {
                                aVar2.a.a(j4, aVar2.r ? 1 : 0, (int) (j3 - j5), i3, null);
                            }
                        }
                    }
                    aVar2.p = aVar2.j;
                    aVar2.q = aVar2.l;
                    aVar2.r = false;
                    aVar2.o = true;
                }
            }
        }
        if (aVar2.b) {
            a.C0267a c0267a3 = aVar2.n;
            z = c0267a3.b && ((i4 = c0267a3.e) == 7 || i4 == 2);
        } else {
            z = aVar2.s;
        }
        boolean z7 = aVar2.r;
        int i13 = aVar2.i;
        if (i13 == 5) {
            z2 = true;
        } else if (z) {
            z2 = true;
            if (i13 != 1) {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        boolean z8 = z7 | z2;
        aVar2.r = z8;
        aVar2.i = 24;
        if (z8) {
            this.n = false;
        }
    }

    @Override // defpackage.ce3
    public final void c() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        f47.a(this.h);
        this.d.c();
        this.e.c();
        this.f.c();
        this.a.c.b(0);
        a aVar = this.k;
        if (aVar != null) {
            aVar.k = false;
            aVar.o = false;
            a.C0267a c0267a = aVar.n;
            c0267a.b = false;
            c0267a.a = false;
        }
    }

    @Override // defpackage.ce3
    public final void d(boolean z) {
        this.j.getClass();
        String str = n6b.a;
        if (z) {
            this.a.c.b(0);
            b(0, 0, this.g, this.m);
            h(this.g, 9, this.m);
            b(0, 0, this.g, this.m);
        }
    }

    @Override // defpackage.ce3
    public final void e(int i, long j) {
        this.m = j;
        this.n = ((i & 2) != 0) | this.n;
    }

    @Override // defpackage.ce3
    public final void f(ls3 ls3Var, pya.c cVar) {
        cVar.a();
        cVar.b();
        this.i = cVar.e;
        cVar.b();
        hsa hsaVarP = ls3Var.p(cVar.d, 2);
        this.j = hsaVarP;
        this.k = new a(hsaVarP, this.b, this.c);
        this.a.a(ls3Var, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0104  */
    /* JADX WARN: Code duplicated, block: B:59:0x0106  */
    /* JADX WARN: Code duplicated, block: B:61:0x0109  */
    /* JADX WARN: Code duplicated, block: B:64:0x0110  */
    /* JADX WARN: Code duplicated, block: B:65:0x0115  */
    /* JADX WARN: Code duplicated, block: B:68:0x011a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0121  */
    /* JADX WARN: Code duplicated, block: B:81:0x013b  */
    public final void g(byte[] bArr, int i, int i2) {
        boolean zD;
        boolean zD2;
        boolean z;
        boolean z2;
        int iF;
        int i3;
        int iE;
        int i4;
        int iG;
        int iG2;
        if (!this.l || this.k.c) {
            this.d.a(bArr, i, i2);
            this.e.a(bArr, i, i2);
        }
        this.f.a(bArr, i, i2);
        a aVar = this.k;
        SparseArray<f47.l> sparseArray = aVar.e;
        qt7 qt7Var = aVar.f;
        if (aVar.k) {
            int i5 = i2 - i;
            byte[] bArr2 = aVar.g;
            int length = bArr2.length;
            int i6 = aVar.h + i5;
            if (length < i6) {
                aVar.g = Arrays.copyOf(bArr2, i6 * 2);
            }
            System.arraycopy(bArr, i, aVar.g, aVar.h, i5);
            int i7 = aVar.h + i5;
            aVar.h = i7;
            qt7Var.a = aVar.g;
            qt7Var.c = 0;
            qt7Var.d = 0;
            qt7Var.b = i7;
            qt7Var.e = 0;
            qt7Var.a();
            if (qt7Var.b(8)) {
                qt7Var.i();
                int iE2 = qt7Var.e(2);
                qt7Var.j(5);
                if (qt7Var.c()) {
                    qt7Var.f();
                    if (qt7Var.c()) {
                        int iF2 = qt7Var.f();
                        if (!aVar.c) {
                            aVar.k = false;
                            a.C0267a c0267a = aVar.n;
                            c0267a.e = iF2;
                            c0267a.b = true;
                            return;
                        }
                        if (qt7Var.c()) {
                            int iF3 = qt7Var.f();
                            if (sparseArray.indexOfKey(iF3) < 0) {
                                aVar.k = false;
                                return;
                            }
                            f47.l lVar = sparseArray.get(iF3);
                            SparseArray<f47.m> sparseArray2 = aVar.d;
                            int i8 = lVar.a;
                            boolean z3 = lVar.b;
                            f47.m mVar = sparseArray2.get(i8);
                            boolean z4 = mVar.j;
                            int i9 = mVar.n;
                            int i10 = mVar.l;
                            if (z4) {
                                if (!qt7Var.b(2)) {
                                    return;
                                } else {
                                    qt7Var.j(2);
                                }
                            }
                            if (qt7Var.b(i10)) {
                                int iE3 = qt7Var.e(i10);
                                if (!mVar.k) {
                                    if (qt7Var.b(1)) {
                                        zD = qt7Var.d();
                                        if (!zD) {
                                            zD2 = false;
                                        } else {
                                            if (!qt7Var.b(1)) {
                                                return;
                                            }
                                            zD2 = qt7Var.d();
                                            z = true;
                                        }
                                        if (aVar.i == 5) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            iF = 0;
                                        } else if (!qt7Var.c()) {
                                            return;
                                        } else {
                                            iF = qt7Var.f();
                                        }
                                        i3 = mVar.m;
                                        if (i3 != 0) {
                                            if (qt7Var.b(i9)) {
                                                iE = qt7Var.e(i9);
                                                if (!z3 && !zD) {
                                                    if (!qt7Var.c()) {
                                                        return;
                                                    }
                                                    iG2 = qt7Var.g();
                                                    i4 = 0;
                                                }
                                                iG = 0;
                                                a.C0267a c0267a2 = aVar.n;
                                                c0267a2.c = mVar;
                                                c0267a2.d = iE2;
                                                c0267a2.e = iF2;
                                                c0267a2.f = iE3;
                                                c0267a2.g = iF3;
                                                c0267a2.h = zD;
                                                c0267a2.i = z;
                                                c0267a2.j = zD2;
                                                c0267a2.k = z2;
                                                c0267a2.l = iF;
                                                c0267a2.m = iE;
                                                c0267a2.n = iG2;
                                                c0267a2.o = i4;
                                                c0267a2.p = iG;
                                                c0267a2.a = true;
                                                c0267a2.b = true;
                                                aVar.k = false;
                                            }
                                            return;
                                        }
                                        if (i3 == 1 || mVar.o) {
                                            iE = 0;
                                        } else {
                                            if (!qt7Var.c()) {
                                                return;
                                            }
                                            int iG3 = qt7Var.g();
                                            if (!z3 || zD) {
                                                i4 = iG3;
                                                iE = 0;
                                                iG2 = 0;
                                                iG = 0;
                                            } else {
                                                if (!qt7Var.c()) {
                                                    return;
                                                }
                                                iG = qt7Var.g();
                                                iG2 = 0;
                                                i4 = iG3;
                                                iE = 0;
                                            }
                                        }
                                        a.C0267a c0267a3 = aVar.n;
                                        c0267a3.c = mVar;
                                        c0267a3.d = iE2;
                                        c0267a3.e = iF2;
                                        c0267a3.f = iE3;
                                        c0267a3.g = iF3;
                                        c0267a3.h = zD;
                                        c0267a3.i = z;
                                        c0267a3.j = zD2;
                                        c0267a3.k = z2;
                                        c0267a3.l = iF;
                                        c0267a3.m = iE;
                                        c0267a3.n = iG2;
                                        c0267a3.o = i4;
                                        c0267a3.p = iG;
                                        c0267a3.a = true;
                                        c0267a3.b = true;
                                        aVar.k = false;
                                        i4 = 0;
                                        iG2 = 0;
                                        iG = 0;
                                        a.C0267a c0267a4 = aVar.n;
                                        c0267a4.c = mVar;
                                        c0267a4.d = iE2;
                                        c0267a4.e = iF2;
                                        c0267a4.f = iE3;
                                        c0267a4.g = iF3;
                                        c0267a4.h = zD;
                                        c0267a4.i = z;
                                        c0267a4.j = zD2;
                                        c0267a4.k = z2;
                                        c0267a4.l = iF;
                                        c0267a4.m = iE;
                                        c0267a4.n = iG2;
                                        c0267a4.o = i4;
                                        c0267a4.p = iG;
                                        c0267a4.a = true;
                                        c0267a4.b = true;
                                        aVar.k = false;
                                    }
                                    return;
                                }
                                zD = false;
                                zD2 = false;
                                z = zD2;
                                if (aVar.i == 5) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    iF = 0;
                                } else if (!qt7Var.c()) {
                                    return;
                                } else {
                                    iF = qt7Var.f();
                                }
                                i3 = mVar.m;
                                if (i3 != 0) {
                                    if (i3 == 1) {
                                    }
                                    iE = 0;
                                } else {
                                    if (qt7Var.b(i9)) {
                                        return;
                                    }
                                    iE = qt7Var.e(i9);
                                    if (!z3) {
                                    }
                                }
                                i4 = 0;
                                iG2 = 0;
                                iG = 0;
                                a.C0267a c0267a5 = aVar.n;
                                c0267a5.c = mVar;
                                c0267a5.d = iE2;
                                c0267a5.e = iF2;
                                c0267a5.f = iE3;
                                c0267a5.g = iF3;
                                c0267a5.h = zD;
                                c0267a5.i = z;
                                c0267a5.j = zD2;
                                c0267a5.k = z2;
                                c0267a5.l = iF;
                                c0267a5.m = iE;
                                c0267a5.n = iG2;
                                c0267a5.o = i4;
                                c0267a5.p = iG;
                                c0267a5.a = true;
                                c0267a5.b = true;
                                aVar.k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void h(long j, int i, long j2) {
        if (!this.l || this.k.c) {
            this.d.d(i);
            this.e.d(i);
        }
        this.f.d(i);
        a aVar = this.k;
        boolean z = this.n;
        aVar.i = i;
        aVar.l = j2;
        aVar.j = j;
        aVar.s = z;
        if (!aVar.b || i != 1) {
            if (!aVar.c) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        a.C0267a c0267a = aVar.m;
        aVar.m = aVar.n;
        aVar.n = c0267a;
        c0267a.b = false;
        c0267a.a = false;
        aVar.h = 0;
        aVar.k = true;
    }
}
