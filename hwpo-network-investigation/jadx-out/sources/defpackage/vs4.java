package defpackage;

import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vs4 implements ce3 {
    public final l99 a;
    public String b;
    public hsa c;
    public a d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final e47 g = new e47(32);
    public final e47 h = new e47(33);
    public final e47 i = new e47(34);
    public final e47 j = new e47(39);
    public final e47 k = new e47(40);
    public long m = -9223372036854775807L;
    public final pt7 n = new pt7();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final hsa a;
        public long b;
        public boolean c;
        public int d;
        public long e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public long k;
        public long l;
        public boolean m;

        public a(hsa hsaVar) {
            this.a = hsaVar;
        }

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
        public final void a(int i) {
            long j = this.l;
            if (j != -9223372036854775807L) {
                long j2 = this.b;
                long j3 = this.k;
                if (j2 == j3) {
                    return;
                }
                int i2 = (int) (j2 - j3);
                this.a.a(j, this.m ? 1 : 0, i2, i, null);
            }
        }
    }

    public vs4(l99 l99Var) {
        this.a = l99Var;
    }

    @Override // defpackage.ce3
    public final void a(pt7 pt7Var) {
        int i;
        this.c.getClass();
        String str = n6b.a;
        while (pt7Var.a() > 0) {
            int i2 = pt7Var.b;
            int i3 = pt7Var.c;
            byte[] bArr = pt7Var.a;
            this.l += (long) pt7Var.a();
            this.c.e(pt7Var.a(), pt7Var);
            while (i2 < i3) {
                int iB = f47.b(bArr, i2, i3, this.f);
                if (iB == i3) {
                    g(bArr, i2, i3);
                    return;
                }
                int i4 = (bArr[iB + 3] & 126) >> 1;
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
                long j = this.l - ((long) i8);
                b(i8, i7 < 0 ? -i7 : 0, j, this.m);
                h(i8, i4, j, this.m);
                i2 = i5 + i6;
            }
        }
    }

    public final void b(int i, int i2, long j, long j2) {
        pn8 pn8Var = this.a.c;
        a aVar = this.d;
        boolean z = this.e;
        if (aVar.j && aVar.g) {
            aVar.m = aVar.c;
            aVar.j = false;
        } else if (aVar.h || aVar.g) {
            if (z && aVar.i) {
                aVar.a(i + ((int) (j - aVar.b)));
            }
            aVar.k = aVar.b;
            aVar.l = aVar.e;
            aVar.m = aVar.c;
            aVar.i = true;
        }
        if (!this.e) {
            e47 e47Var = this.g;
            e47Var.b(i2);
            e47 e47Var2 = this.h;
            e47Var2.b(i2);
            e47 e47Var3 = this.i;
            e47Var3.b(i2);
            if (e47Var.c && e47Var2.c && e47Var3.c) {
                String str = this.b;
                int i3 = e47Var.e;
                byte[] bArr = new byte[e47Var2.e + i3 + e47Var3.e];
                System.arraycopy(e47Var.d, 0, bArr, 0, i3);
                System.arraycopy(e47Var2.d, 0, bArr, e47Var.e, e47Var2.e);
                System.arraycopy(e47Var3.d, 0, bArr, e47Var.e + e47Var2.e, e47Var3.e);
                f47.h hVarI = f47.i(e47Var2.d, 3, e47Var2.e, null);
                f47.c cVar = hVarI.b;
                String strA = cVar != null ? og1.a(cVar.a, cVar.b, cVar.c, cVar.d, cVar.e, cVar.f) : null;
                id4.a aVar2 = new id4.a();
                aVar2.a = str;
                aVar2.m = fv6.n("video/mp2t");
                aVar2.n = fv6.n("video/hevc");
                aVar2.j = strA;
                aVar2.u = hVarI.e;
                aVar2.v = hVarI.f;
                aVar2.w = hVarI.g;
                aVar2.x = hVarI.h;
                aVar2.D = new xh1(hVarI.k, hVarI.l, hVarI.m, hVarI.c + 8, hVarI.d + 8, null);
                aVar2.A = hVarI.i;
                aVar2.p = hVarI.j;
                aVar2.E = hVarI.a + 1;
                aVar2.q = Collections.singletonList(bArr);
                id4 id4Var = new id4(aVar2);
                this.c.g(id4Var);
                int i4 = id4Var.q;
                xl7.r(i4 != -1);
                pn8Var.c(i4);
                this.e = true;
            }
        }
        e47 e47Var4 = this.j;
        boolean zB = e47Var4.b(i2);
        pt7 pt7Var = this.n;
        if (zB) {
            pt7Var.K(e47Var4.d, f47.m(e47Var4.d, e47Var4.e));
            pt7Var.N(5);
            pn8Var.a(j2, pt7Var);
        }
        e47 e47Var5 = this.k;
        if (e47Var5.b(i2)) {
            pt7Var.K(e47Var5.d, f47.m(e47Var5.d, e47Var5.e));
            pt7Var.N(5);
            pn8Var.a(j2, pt7Var);
        }
    }

    @Override // defpackage.ce3
    public final void c() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        f47.a(this.f);
        this.g.c();
        this.h.c();
        this.i.c();
        this.j.c();
        this.k.c();
        this.a.c.b(0);
        a aVar = this.d;
        if (aVar != null) {
            aVar.f = false;
            aVar.g = false;
            aVar.h = false;
            aVar.i = false;
            aVar.j = false;
        }
    }

    @Override // defpackage.ce3
    public final void d(boolean z) {
        this.c.getClass();
        String str = n6b.a;
        if (z) {
            this.a.c.b(0);
            b(0, 0, this.l, this.m);
            h(0, 48, this.l, this.m);
        }
    }

    @Override // defpackage.ce3
    public final void e(int i, long j) {
        this.m = j;
    }

    @Override // defpackage.ce3
    public final void f(ls3 ls3Var, pya.c cVar) {
        cVar.a();
        cVar.b();
        this.b = cVar.e;
        cVar.b();
        hsa hsaVarP = ls3Var.p(cVar.d, 2);
        this.c = hsaVarP;
        this.d = new a(hsaVarP);
        this.a.a(ls3Var, cVar);
    }

    public final void g(byte[] bArr, int i, int i2) {
        a aVar = this.d;
        if (aVar.f) {
            int i3 = aVar.d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                aVar.g = (bArr[i4] & 128) != 0;
                aVar.f = false;
            } else {
                aVar.d = (i2 - i) + i3;
            }
        }
        if (!this.e) {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    public final void h(int i, int i2, long j, long j2) {
        a aVar = this.d;
        boolean z = this.e;
        aVar.g = false;
        aVar.h = false;
        aVar.e = j2;
        aVar.d = 0;
        aVar.b = j;
        if (i2 >= 32 && i2 != 40) {
            if (aVar.i && !aVar.j) {
                if (z) {
                    aVar.a(i);
                }
                aVar.i = false;
            }
            if ((32 <= i2 && i2 <= 35) || i2 == 39) {
                aVar.h = !aVar.j;
                aVar.j = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        aVar.c = z2;
        aVar.f = z2 || i2 <= 9;
        if (!this.e) {
            this.g.d(i2);
            this.h.d(i2);
            this.i.d(i2);
        }
        this.j.d(i2);
        this.k.d(i2);
    }
}
