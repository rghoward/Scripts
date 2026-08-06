package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zu5 implements s79 {
    public static final au3 w = xa6.b(new uu5(), new vu5(0));
    public final xr2 a;
    public boolean b;
    public gu5 c;
    public final mu5 d;
    public final dt7 e;
    public final i27 f;
    public float g;
    public final ht2 h;
    public final boolean i;
    public fm8 j;
    public final yu5 k;
    public final xg0 l;
    public final vv5<hu5> m;
    public final kv5 n;
    public final lx5 o;
    public final xu5 p;
    public final kx5 q;
    public final h37<g2b> r;
    public final h37<g2b> s;
    public final dt7 t;
    public final dt7 u;
    public final nx5 v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.lazy.grid.LazyGridState", f = "LazyGridState.kt", l = {496, 498}, m = "scroll", v = 1)
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
            return zu5.this.c(null, null, this);
        }
    }

    public zu5(final int i, int i2, xr2 xr2Var) {
        this.a = xr2Var;
        this.d = new mu5(i, i2);
        this.e = new dt7(cv5.a, ha7.u);
        this.f = new i27();
        this.h = new ht2(new su5(0, this));
        this.i = true;
        this.k = new yu5(this);
        this.l = new xg0();
        this.m = new vv5<>();
        this.n = new kv5();
        this.o = new lx5(null, new oh4() { // from class: tu5
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                z87 z87Var = (z87) obj;
                xr2 xr2Var2 = this.t.a;
                hu9 hu9VarA = hu9.a.a();
                hu9.a.d(hu9VarA, hu9.a.b(hu9VarA), hu9VarA != null ? hu9VarA.e() : null);
                xr2Var2.getClass();
                int iB = z87Var.b() == -1 ? 2 : z87Var.b();
                for (int i3 = 0; i3 < iB; i3++) {
                    z87Var.a(i + i3);
                }
                return g2b.a;
            }
        });
        this.p = new xu5(this);
        this.q = new kx5();
        this.r = f18.a();
        this.s = f18.a();
        Boolean bool = Boolean.FALSE;
        this.t = bl7.i(bool);
        this.u = bl7.i(bool);
        this.v = new nx5();
    }

    @Override // defpackage.s79
    public final boolean a() {
        return this.h.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s79
    public final boolean b() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r6.h.c(r7, r8, r0) == r5) goto L23;
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
            boolean r0 = r9 instanceof zu5.a
            if (r0 == 0) goto L13
            r0 = r9
            zu5$a r0 = (zu5.a) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            zu5$a r0 = new zu5$a
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
            dt7 r9 = r6.e
            java.lang.Object r9 = r9.getValue()
            gu5 r1 = defpackage.cv5.a
            if (r9 != r1) goto L5b
            r0.t = r7
            r9 = r8
            p6a r9 = (defpackage.p6a) r9
            r0.u = r9
            r0.x = r4
            xg0 r9 = r6.l
            java.lang.Object r9 = r9.c(r0)
            if (r9 != r5) goto L5b
            goto L69
        L5b:
            r0.t = r2
            r0.u = r2
            r0.x = r3
            ht2 r6 = r6.h
            java.lang.Object r6 = r6.c(r7, r8, r0)
            if (r6 != r5) goto L6a
        L69:
            return r5
        L6a:
            g2b r6 = defpackage.g2b.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu5.c(o37, ci4, r02):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s79
    public final boolean d() {
        return ((Boolean) this.t.getValue()).booleanValue();
    }

    @Override // defpackage.s79
    public final float e(float f) {
        return this.h.e(f);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f6  */
    public final void f(gu5 gu5Var, boolean z, boolean z2) {
        Object obj;
        int i;
        int i2 = gu5Var.p;
        List<hu5> list = gu5Var.m;
        iu5 iu5Var = gu5Var.a;
        int i3 = gu5Var.b;
        this.o.f = list.size();
        hu5 hu5Var = null;
        mu5 mu5Var = this.d;
        nx5 nx5Var = this.v;
        if (!z && this.b) {
            this.c = gu5Var;
            hu9 hu9VarA = hu9.a.a();
            oh4<Object, g2b> oh4VarE = hu9VarA != null ? hu9VarA.e() : null;
            hu9 hu9VarB = hu9.a.b(hu9VarA);
            try {
                if (nx5Var.a() && i3 == mu5Var.b.k() && iu5Var != null) {
                    hu5[] hu5VarArr = iu5Var.b;
                    if (hu5VarArr.length != 0) {
                        hu5Var = hu5VarArr[0];
                    }
                    if (hu5Var != null && hu5Var.a == mu5Var.a.k()) {
                        nx5Var.b();
                    }
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
        this.g -= gu5Var.d;
        this.e.setValue(gu5Var);
        this.u.setValue(Boolean.valueOf(((iu5Var != null ? iu5Var.a : 0) == 0 && i3 == 0) ? false : true));
        this.t.setValue(Boolean.valueOf(gu5Var.c));
        if (z2) {
            mu5Var.getClass();
            if (i3 < 0.0f) {
                xc5.c("scrollOffset should be non-negative");
            }
            mu5Var.b.j(i3);
        } else {
            mu5Var.getClass();
            if (iu5Var != null) {
                hu5[] hu5VarArr2 = iu5Var.b;
                hu5 hu5Var2 = hu5VarArr2.length == 0 ? null : hu5VarArr2[0];
                if (hu5Var2 != null) {
                    obj = hu5Var2.b;
                } else {
                    obj = null;
                }
            } else {
                obj = null;
            }
            mu5Var.d = obj;
            if (mu5Var.c || i2 > 0) {
                mu5Var.c = true;
                if (i3 < 0.0f) {
                    xc5.c("scrollOffset should be non-negative (" + i3 + ')');
                }
                if (iu5Var != null) {
                    hu5[] hu5VarArr3 = iu5Var.b;
                    hu5Var = hu5VarArr3.length != 0 ? hu5VarArr3[0] : null;
                    if (hu5Var != null) {
                        i = hu5Var.a;
                    } else {
                        i = 0;
                    }
                } else {
                    i = 0;
                }
                mu5Var.a(i, i3);
            }
            if (this.i) {
                xr2 xr2Var = this.a;
                k37<lx5.b> k37Var = xr2Var.b;
                int i4 = xr2Var.a;
                boolean z3 = xr2Var.c;
                if (i4 != -1 && !list.isEmpty() && i4 != xr2.b(gu5Var, z3)) {
                    xr2Var.a = -1;
                    lx5.b[] bVarArr = k37Var.t;
                    int i5 = k37Var.v;
                    for (int i6 = 0; i6 < i5; i6++) {
                        bVarArr[i6].cancel();
                    }
                    k37Var.k();
                }
                int i7 = xr2Var.d;
                if (i7 != -1 && xr2Var.e != 0.0f && i7 != i2 && !list.isEmpty()) {
                    int iB = xr2.b(gu5Var, xr2Var.e < 0.0f);
                    int iA = xr2.a(gu5Var, xr2Var.e < 0.0f);
                    if (iA >= 0 && iA < i2 && iB != xr2Var.a && iB >= 0) {
                        xr2Var.a = iB;
                        k37Var.k();
                        k37Var.f(k37Var.v, this.p.a(iB));
                    }
                }
                xr2Var.d = i2;
            }
        }
        if (z) {
            nx5Var.c(gu5Var.f, gu5Var.i, gu5Var.h);
        }
    }

    public final cu5 g() {
        return (cu5) this.e.getValue();
    }

    public zu5(int i, int i2) {
        this(i, i2, new xr2());
    }

    public zu5() {
        this(0, 0, new xr2());
    }
}
