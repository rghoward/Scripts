package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nz5 implements s79 {
    public static final au3 y = xa6.b(new fz5(), new zj2(1));
    public final zr2 a;
    public boolean b;
    public xy5 c;
    public boolean d;
    public final cz5 e;
    public final dt7 f;
    public final i27 g;
    public float h;
    public boolean i;
    public final ht2 j;
    public final boolean k;
    public fm8 l;
    public final mz5 m;
    public final xg0 n;
    public final vv5<yy5> o;
    public final kv5 p;
    public final lx5 q;
    public final lz5 r;
    public final kx5 s;
    public final h37<g2b> t;
    public final dt7 u;
    public final dt7 v;
    public final h37<g2b> w;
    public final nx5 x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.lazy.LazyListState", f = "LazyListState.kt", l = {464, 466}, m = "scroll", v = 1)
    public static final class a extends u02 {
        public o37 t;
        public p6a u;
        public /* synthetic */ Object v;
        public int x;

        public a(r02<? super a> r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.v = obj;
            this.x |= Integer.MIN_VALUE;
            return nz5.this.c(null, null, this);
        }
    }

    public nz5(final int i, int i2, zr2 zr2Var) {
        this.a = zr2Var;
        this.e = new cz5(i, i2);
        this.f = new dt7(qz5.a, ha7.u);
        this.g = new i27();
        this.j = new ht2(new gz5(0, this));
        this.k = true;
        this.m = new mz5(this);
        this.n = new xg0();
        this.o = new vv5<>();
        this.p = new kv5();
        this.q = new lx5(null, new oh4() { // from class: hz5
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                z87 z87Var = (z87) obj;
                zr2 zr2Var2 = this.t.a;
                hu9 hu9VarA = hu9.a.a();
                hu9.a.d(hu9VarA, hu9.a.b(hu9VarA), hu9VarA != null ? hu9VarA.e() : null);
                zr2Var2.getClass();
                int iB = z87Var.b() == -1 ? 2 : z87Var.b();
                for (int i3 = 0; i3 < iB; i3++) {
                    z87Var.a(i + i3);
                }
                return g2b.a;
            }
        });
        this.r = new lz5(this);
        this.s = new kx5();
        this.t = f18.a();
        Boolean bool = Boolean.FALSE;
        this.u = bl7.i(bool);
        this.v = bl7.i(bool);
        this.w = f18.a();
        this.x = new nx5();
    }

    public static Object k(nz5 nz5Var, int i, p6a p6aVar) throws Throwable {
        nz5Var.getClass();
        Object objC = nz5Var.c(o37.t, new oz5(nz5Var, i, null), p6aVar);
        return objC == v72.t ? objC : g2b.a;
    }

    @Override // defpackage.s79
    public final boolean a() {
        return this.j.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s79
    public final boolean b() {
        return ((Boolean) this.v.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r6.j.c(r7, r8, r0) == r5) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.s79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.o37 r7, defpackage.ci4<? super defpackage.t69, ? super defpackage.r02<? super defpackage.g2b>, ? extends java.lang.Object> r8, defpackage.r02<? super defpackage.g2b> r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof nz5.a
            if (r0 == 0) goto L13
            r0 = r9
            nz5$a r0 = (nz5.a) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            nz5$a r0 = new nz5$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.v
            int r1 = r0.x
            r2 = 0
            r3 = 2
            r4 = 1
            v72 r5 = defpackage.v72.t
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.dv8.b(r9)
            goto L6a
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r6)
            return r2
        L31:
            p6a r7 = r0.u
            r8 = r7
            ci4 r8 = (defpackage.ci4) r8
            o37 r7 = r0.t
            defpackage.dv8.b(r9)
            goto L5b
        L3c:
            defpackage.dv8.b(r9)
            dt7 r9 = r6.f
            java.lang.Object r9 = r9.getValue()
            xy5 r1 = defpackage.qz5.a
            if (r9 != r1) goto L5b
            r0.t = r7
            r9 = r8
            p6a r9 = (defpackage.p6a) r9
            r0.u = r9
            r0.x = r4
            xg0 r9 = r6.n
            java.lang.Object r9 = r9.c(r0)
            if (r9 != r5) goto L5b
            goto L69
        L5b:
            r0.t = r2
            r0.u = r2
            r0.x = r3
            ht2 r6 = r6.j
            java.lang.Object r6 = r6.c(r7, r8, r0)
            if (r6 != r5) goto L6a
        L69:
            return r5
        L6a:
            g2b r6 = defpackage.g2b.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nz5.c(o37, ci4, r02):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s79
    public final boolean d() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    @Override // defpackage.s79
    public final float e(float f) {
        return this.j.e(f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [g2b, java.lang.Object] */
    public final Object f(int i, int i2, u02 u02Var) throws Throwable {
        iz5 iz5Var;
        if (u02Var instanceof iz5) {
            iz5Var = (iz5) u02Var;
            int i3 = iz5Var.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iz5Var.v = i3 - Integer.MIN_VALUE;
            } else {
                iz5Var = new iz5(this, u02Var);
            }
        } else {
            iz5Var = new iz5(this, u02Var);
        }
        Object obj = iz5Var.t;
        int i4 = iz5Var.v;
        try {
            if (i4 == 0) {
                dv8.b(obj);
                this.i = true;
                jz5 jz5Var = new jz5(this, i, i2, null);
                iz5Var.v = 1;
                Object objC = c(o37.t, jz5Var, iz5Var);
                v72 v72Var = v72.t;
                if (objC == v72Var) {
                    return v72Var;
                }
            } else {
                if (i4 != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            this.i = false;
            this = g2b.a;
            return this;
        } catch (Throwable th) {
            this.i = false;
            throw th;
        }
    }

    public final void g(xy5 xy5Var, boolean z, boolean z2) {
        int i = xy5Var.n;
        List<yy5> list = xy5Var.k;
        int i2 = xy5Var.b;
        yy5 yy5Var = xy5Var.a;
        this.q.f = list.size();
        nx5 nx5Var = this.x;
        cz5 cz5Var = this.e;
        if (!z && this.b) {
            this.c = xy5Var;
            hu9 hu9VarA = hu9.a.a();
            oh4<Object, g2b> oh4VarE = hu9VarA != null ? hu9VarA.e() : null;
            hu9 hu9VarB = hu9.a.b(hu9VarA);
            try {
                if (nx5Var.a() && yy5Var != null && yy5Var.a == cz5Var.a.k() && i2 == cz5Var.b.k()) {
                    nx5Var.b();
                }
                g2b g2bVar = g2b.a;
                return;
            } finally {
                hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
            }
        }
        if (z) {
            this.b = true;
        }
        this.v.setValue(Boolean.valueOf(((yy5Var != null ? yy5Var.a : 0) == 0 && i2 == 0) ? false : true));
        this.u.setValue(Boolean.valueOf(xy5Var.c));
        this.h -= xy5Var.d;
        this.f.setValue(xy5Var);
        if (z2) {
            cz5Var.getClass();
            if (i2 < 0.0f) {
                xc5.c("scrollOffset should be non-negative");
            }
            cz5Var.b.j(i2);
        } else {
            yy5 yy5Var2 = (yy5) th1.A(list);
            yy5 yy5Var3 = (yy5) th1.H(list);
            qs.a(yy5Var2 != null ? yy5Var2.a : -1L, "firstVisibleItem:index");
            qs.a(yy5Var3 != null ? yy5Var3.a : -1L, "lastVisibleItem:index");
            cz5Var.getClass();
            cz5Var.d = yy5Var != null ? yy5Var.k : null;
            if (cz5Var.c || i > 0) {
                cz5Var.c = true;
                if (i2 < 0.0f) {
                    xc5.c("scrollOffset should be non-negative");
                }
                cz5Var.a(yy5Var != null ? yy5Var.a : 0, i2);
            }
            if (this.k) {
                zr2 zr2Var = this.a;
                int i3 = zr2Var.a;
                boolean z3 = zr2Var.c;
                if (i3 != -1 && !list.isEmpty() && i3 != zr2.a(xy5Var, z3)) {
                    zr2Var.a = -1;
                    lx5.b bVar = zr2Var.b;
                    if (bVar != null) {
                        bVar.cancel();
                    }
                    zr2Var.b = null;
                }
                int i4 = zr2Var.d;
                if (i4 != -1 && zr2Var.e != 0.0f && i4 != i && !list.isEmpty()) {
                    int iA = zr2.a(xy5Var, zr2Var.e < 0.0f);
                    if (iA >= 0 && iA < i) {
                        zr2Var.a = iA;
                        zr2Var.b = this.r.a(iA);
                    }
                }
                zr2Var.d = i;
            }
        }
        if (z) {
            nx5Var.c(xy5Var.f, xy5Var.i, xy5Var.h);
        }
    }

    public final int h() {
        return this.e.a.k();
    }

    public final int i() {
        return this.e.b.k();
    }

    public final ty5 j() {
        return (ty5) this.f.getValue();
    }

    public final void l(int i, int i2) {
        cz5 cz5Var = this.e;
        if (cz5Var.a.k() != i || cz5Var.b.k() != i2) {
            vv5<yy5> vv5Var = this.o;
            vv5Var.e();
            vv5Var.b = null;
            vv5Var.c = -1;
        }
        cz5Var.a(i, i2);
        cz5Var.d = null;
        fm8 fm8Var = this.l;
        if (fm8Var != null) {
            fm8Var.i();
        }
    }

    public nz5(int i, int i2) {
        zr2 zr2Var = new zr2();
        zr2Var.a = -1;
        zr2Var.d = -1;
        this(i, i2, zr2Var);
    }

    public nz5() {
        zr2 zr2Var = new zr2();
        zr2Var.a = -1;
        zr2Var.d = -1;
        this(0, 0, zr2Var);
    }
}
