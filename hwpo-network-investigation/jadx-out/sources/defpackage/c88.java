package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;
import lx5.a;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c88 {
    public final ew5 a;
    public final f4a b;
    public final g88 c;
    public boolean d = true;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a implements lx5.b, e88, lx5.c {
        public final int a;
        public final d88 b;
        public final oh4<lx5.c, g2b> c;
        public xx1 d;
        public f4a.b e;
        public f4a.a f;
        public boolean g;
        public boolean h;
        public boolean i;
        public Object j;
        public boolean k;
        public C0037a l;
        public boolean m;
        public long n;
        public long o;
        public long p;
        public boolean q;

        /* JADX INFO: renamed from: c88$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public final class C0037a {
            public final List<lx5> a;
            public final List<e88>[] b;
            public int c;
            public int d;
            public boolean e;

            public C0037a(List<lx5> list) {
                this.a = list;
                this.b = new List[list.size()];
                if (list.isEmpty()) {
                    xc5.a("NestedPrefetchController shouldn't be created with no states");
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i, d88 d88Var, s98 s98Var, oh4<? super lx5.c, g2b> oh4Var) {
            this.a = i;
            this.b = d88Var;
            this.c = oh4Var;
            int i2 = ay6.b;
            this.p = System.nanoTime() - ay6.a;
        }

        @Override // lx5.c
        public final long a(int i) {
            f4a.b bVar = this.e;
            if (bVar != null) {
                return bVar.a(i);
            }
            return 0L;
        }

        @Override // lx5.c
        public final int b() {
            f4a.b bVar = this.e;
            if (bVar != null) {
                return bVar.b();
            }
            return 0;
        }

        @Override // lx5.b
        public final void c() {
            this.m = true;
        }

        @Override // lx5.b
        public final void cancel() {
            if (this.h) {
                return;
            }
            this.h = true;
            e();
        }

        @Override // defpackage.e88
        public final boolean d(f88 f88Var) {
            boolean zF;
            if (!c88.this.d) {
                return false;
            }
            if (this.m) {
                Trace.beginSection("compose:lazy:prefetch:execute:urgent");
                try {
                    zF = f(f88Var);
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                zF = f(f88Var);
            }
            qs.a(-1L, "compose:lazy:prefetch:execute:item");
            return zF;
        }

        public final void e() {
            f4a.a aVar = this.f;
            if (aVar != null) {
                aVar.cancel();
            }
            this.f = null;
            f4a.b bVar = this.e;
            if (bVar != null) {
                bVar.dispose();
            }
            this.e = null;
            this.l = null;
        }

        /* JADX WARN: Code duplicated, block: B:108:0x01dd  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v1, types: [a88] */
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
        public final boolean f(f88 f88Var) {
            boolean z;
            List<e88> list;
            int i = this.a;
            long j = i;
            qs.a(j, "compose:lazy:prefetch:execute:item");
            hw5 hw5Var = (hw5) c88.this.a.b.invoke();
            if (!this.h) {
                int iB = hw5Var.b();
                if (i >= 0 && i < iB) {
                    Object objF = hw5Var.f(i);
                    Object obj = this.j;
                    if (obj != null && !objF.equals(obj)) {
                        e();
                        return false;
                    }
                    Object objG = hw5Var.g(i);
                    d88 d88Var = this.b;
                    pg0 pg0Var = d88Var.c;
                    if (d88Var.b != objG || pg0Var == null) {
                        c37<Object, pg0> c37Var = d88Var.a;
                        pg0 pg0VarD = c37Var.d(objG);
                        if (pg0VarD == null) {
                            pg0VarD = new pg0();
                            c37Var.m(objG, pg0VarD);
                        }
                        pg0Var = pg0VarD;
                        d88Var.b = objG;
                        d88Var.c = pg0Var;
                    }
                    g();
                    long jA = f88Var.a();
                    this.n = jA;
                    int i2 = ay6.b;
                    this.p = System.nanoTime() - ay6.a;
                    this.o = 0L;
                    qs.a(jA, "compose:lazy:prefetch:available_time_nanos");
                    if (!g()) {
                        if (i(this.n, pg0Var.a + pg0Var.b)) {
                            Trace.beginSection("compose:lazy:prefetch:compose");
                            try {
                                h(objF, objG, pg0Var);
                                g2b g2bVar = g2b.a;
                                Trace.endSection();
                            } catch (Throwable th) {
                                Trace.endSection();
                                throw th;
                            }
                        }
                        if (!g()) {
                            return true;
                        }
                    }
                    if (this.f != null) {
                        if (!i(this.n, pg0Var.c)) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:apply");
                        try {
                            f4a.a aVar = this.f;
                            if (aVar == null) {
                                throw new IllegalArgumentException("Nothing to apply!");
                            }
                            this.e = aVar.apply();
                            this.f = null;
                            this.i = true;
                            g2b g2bVar2 = g2b.a;
                            Trace.endSection();
                            j();
                            pg0Var.c = pg0.a(this.o, pg0Var.c);
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    }
                    if (!this.k) {
                        if (this.n <= r11) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                        try {
                            f4a.b bVar = this.e;
                            if (bVar == 0) {
                                throw x70.a("Should precompose before resolving nested prefetch states");
                            }
                            final gl8 gl8Var = new gl8();
                            bVar.d(new oh4() { // from class: a88
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    T tJ;
                                    txa txaVar = (txa) obj2;
                                    txaVar.getClass();
                                    lx5 lx5Var = ((vxa) txaVar).H;
                                    gl8 gl8Var2 = gl8Var;
                                    List list2 = (List) gl8Var2.t;
                                    if (list2 != null) {
                                        list2.add(lx5Var);
                                        tJ = list2;
                                    } else {
                                        tJ = ws0.j(lx5Var);
                                    }
                                    gl8Var2.t = tJ;
                                    return sxa.u;
                                }
                            });
                            List list2 = (List) gl8Var.t;
                            this.l = list2 != null ? new C0037a(list2) : null;
                            this.k = true;
                            g2b g2bVar3 = g2b.a;
                            Trace.endSection();
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    }
                    C0037a c0037a = this.l;
                    if (c0037a != null) {
                        int i3 = pg0Var.e;
                        boolean z2 = this.m;
                        List<e88>[] listArr = c0037a.b;
                        int i4 = c0037a.c;
                        List<lx5> list3 = c0037a.a;
                        if (i4 < list3.size()) {
                            if (a.this.h) {
                                xc5.c("Should not execute nested prefetch on canceled request");
                            }
                            Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                            try {
                                int size = list3.size();
                                for (int i5 = 0; i5 < size; i5++) {
                                    list3.get(i5).e = i3;
                                }
                                g2b g2bVar4 = g2b.a;
                                Trace.endSection();
                                Trace.beginSection("compose:lazy:prefetch:nested");
                                while (c0037a.c < list3.size()) {
                                    try {
                                        if (listArr[c0037a.c] == null) {
                                            if (f88Var.a() <= r11) {
                                                Trace.endSection();
                                                return true;
                                            }
                                            int i6 = c0037a.c;
                                            lx5 lx5Var = list3.get(i6);
                                            oh4<? super z87, g2b> oh4Var = lx5Var.b;
                                            if (oh4Var == null) {
                                                list = hf3.t;
                                            } else {
                                                lx5.a aVar2 = lx5Var.new a(lx5Var.e);
                                                oh4Var.invoke(aVar2);
                                                ArrayList arrayList = aVar2.b;
                                                lx5Var.g = arrayList.size();
                                                list = arrayList;
                                            }
                                            listArr[i6] = list;
                                        }
                                        List<e88> list4 = listArr[c0037a.c];
                                        list4.getClass();
                                        while (c0037a.d < list4.size()) {
                                            e88 e88Var = list4.get(c0037a.d);
                                            if (z2) {
                                                a aVar3 = e88Var instanceof a ? (a) e88Var : null;
                                                if (aVar3 != null) {
                                                    z = true;
                                                    aVar3.m = true;
                                                } else {
                                                    z = true;
                                                }
                                            } else {
                                                z = true;
                                            }
                                            c0037a.e = z;
                                            if (e88Var.d(f88Var)) {
                                                Trace.endSection();
                                                return z;
                                            }
                                            c0037a.d++;
                                        }
                                        c0037a.d = 0;
                                        c0037a.c++;
                                    } catch (Throwable th4) {
                                        Trace.endSection();
                                        throw th4;
                                    }
                                }
                                g2b g2bVar5 = g2b.a;
                                Trace.endSection();
                            } catch (Throwable th5) {
                                Trace.endSection();
                                throw th5;
                            }
                        }
                    }
                    C0037a c0037a2 = this.l;
                    if (c0037a2 != null && c0037a2.e) {
                        j();
                        qs.a(j, "compose:lazy:prefetch:execute:item");
                        C0037a c0037a3 = this.l;
                        if (c0037a3 != null) {
                            c0037a3.e = false;
                        }
                    }
                    xx1 xx1Var = this.d;
                    if (!this.g && xx1Var != null) {
                        if (!i(this.n, pg0Var.d)) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:measure");
                        try {
                            long j2 = xx1Var.a;
                            if (this.h) {
                                xc5.a("Callers should check whether the request is still valid before calling performMeasure()");
                            }
                            if (this.g) {
                                xc5.a("Request was already measured!");
                            }
                            this.g = true;
                            f4a.b bVar2 = this.e;
                            if (bVar2 == null) {
                                throw x70.a("performComposition() must be called before performMeasure()");
                            }
                            int iB2 = bVar2.b();
                            for (int i7 = 0; i7 < iB2; i7++) {
                                bVar2.c(i7, j2);
                            }
                            g2b g2bVar6 = g2b.a;
                            Trace.endSection();
                            j();
                            pg0Var.d = pg0.a(this.o, pg0Var.d);
                            oh4<lx5.c, g2b> oh4Var2 = this.c;
                            if (oh4Var2 != null) {
                                oh4Var2.invoke(this);
                            }
                        } catch (Throwable th6) {
                            Trace.endSection();
                            throw th6;
                        }
                    }
                    C0037a c0037a4 = this.l;
                    if (this.g && this.k && c0037a4 != null) {
                        List<lx5> list5 = c0037a4.a;
                        int size2 = list5.size();
                        int iMin = Integer.MAX_VALUE;
                        for (int i8 = 0; i8 < size2; i8++) {
                            iMin = Math.min(iMin, list5.get(i8).f);
                        }
                        if (iMin == Integer.MAX_VALUE) {
                            iMin = 0;
                        }
                        int i9 = pg0Var.e;
                        pg0Var.e = i9 == -1 ? iMin : ((i9 * 3) + iMin) / 4;
                        int size3 = list5.size();
                        int iMin2 = Integer.MAX_VALUE;
                        for (int i10 = 0; i10 < size3; i10++) {
                            iMin2 = Math.min(iMin2, list5.get(i10).g);
                        }
                        if (iMin2 == Integer.MAX_VALUE) {
                            iMin2 = 0;
                        }
                        if (iMin2 < iMin) {
                            pg0Var.d = 0L;
                        }
                    }
                    return false;
                }
            }
            e();
            return false;
        }

        public final boolean g() {
            f4a.a aVar;
            return this.i || ((aVar = this.f) != null && aVar.c());
        }

        @Override // lx5.c
        public final int getIndex() {
            return this.a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v5, types: [b88] */
        public final void h(Object obj, Object obj2, final pg0 pg0Var) {
            f4a.a bs5Var;
            f4a.a aVar = this.f;
            f4a.a aVar2 = aVar;
            if (aVar == null) {
                c88 c88Var = c88.this;
                ci4<jt1, Integer, g2b> ci4VarA = c88Var.a.a(this.a, obj, obj2);
                xr5 xr5VarA = c88Var.b.a();
                if (xr5VarA.t.e()) {
                    xr5VarA.k(obj, ci4VarA, true);
                    bs5Var = new bs5(xr5VarA, obj);
                } else {
                    bs5Var = new as5(xr5VarA, obj);
                }
                f4a.a aVar3 = bs5Var;
                this.f = aVar3;
                this.j = obj;
                aVar2 = aVar3;
            }
            this.q = false;
            while (!aVar2.c() && !this.q) {
                aVar2.a(new yn9() { // from class: b88
                    @Override // defpackage.yn9
                    public final boolean a() {
                        c88.a aVar4 = this.a;
                        if (!aVar4.q) {
                            aVar4.j();
                            long j = aVar4.o;
                            pg0 pg0Var2 = pg0Var;
                            long jA = pg0.a(j, pg0Var2.a);
                            pg0Var2.a = jA;
                            aVar4.q = !aVar4.i(aVar4.n, jA + pg0Var2.b);
                        }
                        return aVar4.q;
                    }
                });
            }
            j();
            boolean z = this.q;
            long j = this.o;
            if (z) {
                pg0Var.b = pg0.a(j, pg0Var.b);
            } else {
                pg0Var.a = pg0.a(j, pg0Var.a);
            }
        }

        public final boolean i(long j, long j2) {
            if (this.m) {
                j2 = 0;
            }
            return j > j2;
        }

        public final void j() {
            long j;
            int i = ay6.b;
            long jNanoTime = System.nanoTime() - ay6.a;
            long j2 = this.p;
            long jG = 0;
            if (((j2 - 1) | 1) == Long.MAX_VALUE) {
                if (jNanoTime == j2) {
                    l93.a aVar = l93.u;
                } else {
                    jG = l93.k(j2 < 0 ? l93.w : l93.v);
                }
            } else if ((1 | (jNanoTime - 1)) == Long.MAX_VALUE) {
                jG = jNanoTime < 0 ? l93.w : l93.v;
            } else {
                long j3 = jNanoTime - j2;
                long j4 = (j3 ^ jNanoTime) & (~(j3 ^ j2));
                q93 q93Var = q93.NANOSECONDS;
                if (j4 < 0) {
                    q93 q93Var2 = q93.MILLISECONDS;
                    if (q93Var.compareTo(q93Var2) < 0) {
                        long j5 = (jNanoTime / 1000000) - (j2 / 1000000);
                        long j6 = (jNanoTime % 1000000) - (j2 % 1000000);
                        l93.a aVar2 = l93.u;
                        jG = l93.i(o93.g(j5, q93Var2), o93.g(j6, q93Var));
                    } else {
                        jG = l93.k(j3 < 0 ? l93.w : l93.v);
                    }
                } else {
                    jG = o93.g(j3, q93Var);
                }
            }
            long j7 = jG >> 1;
            l93.a aVar3 = l93.u;
            if ((1 & ((int) jG)) == 0) {
                j = j7;
            } else if (j7 > 9223372036854L) {
                j = Long.MAX_VALUE;
            } else {
                j = j7 < -9223372036854L ? Long.MIN_VALUE : j7 * 1000000;
            }
            this.o = j;
            long j8 = this.n - j;
            this.n = j8;
            this.p = jNanoTime;
            qs.a(j8, "compose:lazy:prefetch:available_time_nanos");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
            sb.append(this.a);
            sb.append(", constraints = ");
            sb.append(this.d);
            sb.append(", isComposed = ");
            sb.append(g());
            sb.append(", isMeasured = ");
            sb.append(this.g);
            sb.append(", isCanceled = ");
            return fz.c(sb, this.h, " }");
        }
    }

    public c88(ew5 ew5Var, f4a f4aVar, g88 g88Var) {
        this.a = ew5Var;
        this.b = f4aVar;
        this.c = g88Var;
    }
}
