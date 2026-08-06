package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uy4 {
    public final qq5 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final t27<ox6.c> f = new t27<>((Object) null);
    public final wb7 g = new wb7();
    public final n27<t27<jb7>> h = new n27<>(10);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements mh4<g2b> {
        public final /* synthetic */ ox6.c v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ox6.c cVar) {
            super(0);
            this.v = cVar;
        }

        @Override // defpackage.mh4
        public final g2b invoke() {
            uy4.this.d(this.v);
            return g2b.a;
        }
    }

    public uy4(qq5 qq5Var) {
        this.a = qq5Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Multi-variable type inference failed */
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
    public final void a(long j, List<? extends ox6.c> list, boolean z) {
        n27<t27<jb7>> n27Var;
        long[] jArr;
        jb7 jb7Var;
        Object objD;
        jb7 jb7Var2;
        int size = list.size();
        wb7 wb7Var = this.g;
        wb7 wb7Var2 = wb7Var;
        boolean z2 = true;
        int i = 0;
        while (true) {
            n27Var = this.h;
            if (i >= size) {
                break;
            }
            ox6.c cVar = list.get(i);
            if (cVar.G) {
                cVar.F = new a(cVar);
                if (z2) {
                    k37<jb7> k37Var = wb7Var2.a;
                    jb7[] jb7VarArr = k37Var.t;
                    int i2 = k37Var.v;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= i2) {
                            jb7Var2 = null;
                            break;
                        }
                        jb7Var2 = jb7VarArr[i3];
                        if (xj5.a(jb7Var2.c, cVar)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    jb7Var = jb7Var2;
                    if (jb7Var != null) {
                        jb7Var.i = true;
                        jb7Var.d.a(j);
                        if (z) {
                            Object objD2 = n27Var.d(j);
                            if (objD2 == null) {
                                objD2 = new t27((Object) null);
                                n27Var.g(j, objD2);
                            }
                            ((t27) objD2).g(jb7Var);
                        }
                    } else {
                        z2 = false;
                        jb7Var = new jb7(cVar);
                        jb7Var.d.a(j);
                        if (z) {
                            objD = n27Var.d(j);
                            if (objD == null) {
                                objD = new t27((Object) null);
                                n27Var.g(j, objD);
                            }
                            ((t27) objD).g(jb7Var);
                        }
                        wb7Var2.a.d(jb7Var);
                    }
                } else {
                    jb7Var = new jb7(cVar);
                    jb7Var.d.a(j);
                    if (z) {
                        objD = n27Var.d(j);
                        if (objD == null) {
                            objD = new t27((Object) null);
                            n27Var.g(j, objD);
                        }
                        ((t27) objD).g(jb7Var);
                    }
                    wb7Var2.a.d(jb7Var);
                }
                wb7Var2 = jb7Var;
            }
            i++;
        }
        if (z) {
            long[] jArr2 = n27Var.b;
            Object[] objArr = n27Var.c;
            long[] jArr3 = n27Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j2 = jArr3[i4];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((255 & j2) < 128) {
                                int i8 = (i4 << 3) + i7;
                                long j3 = jArr2[i8];
                                t27<jb7> t27Var = (t27) objArr[i8];
                                k37<jb7> k37Var2 = wb7Var.a;
                                jb7[] jb7VarArr2 = k37Var2.t;
                                int i9 = k37Var2.v;
                                for (int i10 = 0; i10 < i9; i10++) {
                                    jb7VarArr2[i10].f(j3, t27Var);
                                }
                            }
                            j2 >>= i5;
                            i7++;
                            i5 = i5;
                            jArr2 = jArr2;
                        }
                        jArr = jArr2;
                        if (i6 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr2;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr2 = jArr;
                }
            }
        }
        n27Var.a();
    }

    public final boolean b(ij5 ij5Var, boolean z) {
        we6<a58> we6Var = ij5Var.a;
        qq5 qq5Var = this.a;
        wb7 wb7Var = this.g;
        boolean zA = wb7Var.a(we6Var, qq5Var, ij5Var, z);
        k37<jb7> k37Var = wb7Var.a;
        if (!zA) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        jb7[] jb7VarArr = k37Var.t;
        int i = k37Var.v;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = jb7VarArr[i2].e(ij5Var, z) || z3;
        }
        jb7[] jb7VarArr2 = k37Var.t;
        int i3 = k37Var.v;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = jb7VarArr2[i4].d(ij5Var) || z4;
        }
        wb7Var.b(ij5Var);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            t27<ox6.c> t27Var = this.f;
            int i5 = t27Var.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d(t27Var.b(i6));
            }
            t27Var.j();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            wb7Var.a.k();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        wb7 wb7Var = this.g;
        k37<jb7> k37Var = wb7Var.a;
        jb7[] jb7VarArr = k37Var.t;
        int i = k37Var.v;
        for (int i2 = 0; i2 < i; i2++) {
            jb7VarArr[i2].c();
        }
        if (this.d) {
            this.d = true;
        } else {
            wb7Var.a.k();
        }
    }

    public final void d(ox6.c cVar) {
        if (this.b) {
            this.e = true;
            this.f.g(cVar);
            return;
        }
        wb7 wb7Var = this.g;
        t27<wb7> t27Var = wb7Var.b;
        t27Var.j();
        t27Var.g(wb7Var);
        while (t27Var.e()) {
            wb7 wb7VarL = t27Var.l(t27Var.b - 1);
            int i = 0;
            while (true) {
                k37<jb7> k37Var = wb7VarL.a;
                if (i < k37Var.v) {
                    jb7 jb7Var = k37Var.t[i];
                    if (xj5.a(jb7Var.c, cVar)) {
                        wb7VarL.a.n(jb7Var);
                        jb7Var.c();
                    } else {
                        t27Var.g(jb7Var);
                        i++;
                    }
                }
            }
        }
    }
}
