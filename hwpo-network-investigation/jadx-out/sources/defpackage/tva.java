package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tva<S> {
    public final l4c a;
    public final tva<?> b;
    public final String c;
    public final dt7 d;
    public final dt7 e;
    public final ct7 f;
    public final ct7 g;
    public final dt7 h;
    public final fv9<tva<S>.d<?, ?>> i;
    public final fv9<tva<?>> j;
    public final dt7 k;
    public final my2 l;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a<T, V extends fw> {
        public final dza a;
        public final dt7 b = bl7.i(null);

        /* JADX INFO: renamed from: tva$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public final class C0252a<T, V extends fw> implements yz9<T> {
            public final tva<S>.d<T, V> t;
            public oh4<? super b<S>, ? extends a04<T>> u;
            public oh4<? super S, ? extends T> v;

            public C0252a(tva<S>.d<T, V> dVar, oh4<? super b<S>, ? extends a04<T>> oh4Var, oh4<? super S, ? extends T> oh4Var2) {
                this.t = dVar;
                this.u = oh4Var;
                this.v = oh4Var2;
            }

            public final void d(b<S> bVar) {
                T tInvoke = this.v.invoke(bVar.f());
                boolean zG = tva.this.g();
                tva<S>.d<T, V> dVar = this.t;
                if (zG) {
                    dVar.l(this.v.invoke(bVar.d()), tInvoke, this.u.invoke(bVar));
                } else {
                    dVar.m(tInvoke, this.u.invoke(bVar));
                }
            }

            @Override // defpackage.yz9
            public final T getValue() {
                d(tva.this.f());
                return this.t.C.getValue();
            }
        }

        public a(dza dzaVar, String str) {
            this.a = dzaVar;
        }

        public final C0252a a(oh4 oh4Var, oh4 oh4Var2) {
            dt7 dt7Var = this.b;
            C0252a c0252a = (C0252a) dt7Var.getValue();
            tva<S> tvaVar = tva.this;
            if (c0252a == null) {
                Object objInvoke = oh4Var2.invoke(tvaVar.a.b());
                Object objInvoke2 = oh4Var2.invoke(tvaVar.a.b());
                dza dzaVar = this.a;
                fw fwVar = (fw) dzaVar.a().invoke(objInvoke2);
                fwVar.d();
                tva<S>.d<?, ?> dVar = tvaVar.new d<>(objInvoke, fwVar, dzaVar);
                c0252a = new C0252a(dVar, oh4Var, oh4Var2);
                dt7Var.setValue(c0252a);
                tvaVar.i.add(dVar);
            }
            c0252a.v = oh4Var2;
            c0252a.u = oh4Var;
            c0252a.d(tvaVar.f());
            return c0252a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b<S> {
        default boolean c(Enum r2, Enum r3) {
            return r2.equals(d()) && r3.equals(f());
        }

        S d();

        S f();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c<S> implements b<S> {
        public final S a;
        public final S b;

        public c(S s, S s2) {
            this.a = s;
            this.b = s2;
        }

        @Override // tva.b
        public final S d() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return xj5.a(this.a, bVar.d()) && xj5.a(this.b, bVar.f());
        }

        @Override // tva.b
        public final S f() {
            return this.b;
        }

        public final int hashCode() {
            S s = this.a;
            int iHashCode = (s != null ? s.hashCode() : 0) * 31;
            S s2 = this.b;
            return iHashCode + (s2 != null ? s2.hashCode() : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class d<T, V extends fw> implements yz9<T> {
        public final at7 A;
        public boolean B;
        public final dt7 C;
        public V D;
        public final ct7 E;
        public boolean F;
        public final ty9 G;
        public final cza<T, V> t;
        public final dt7 u;
        public final dt7 v;
        public final dt7 w;
        public w89.a x;
        public l9a<T, V> y;
        public final dt7 z;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Object obj, fw fwVar, cza czaVar) {
            this.t = czaVar;
            dt7 dt7VarI = bl7.i(obj);
            this.u = dt7VarI;
            T tInvoke = null;
            dt7 dt7VarI2 = bl7.i(xv.b(0.0f, 0.0f, null, 7));
            this.v = dt7VarI2;
            this.w = bl7.i(new l9a((a04) dt7VarI2.getValue(), czaVar, obj, dt7VarI.getValue(), fwVar));
            this.z = bl7.i(Boolean.TRUE);
            this.A = new at7(-1.0f);
            this.C = bl7.i(obj);
            this.D = fwVar;
            this.E = new ct7(d().c());
            Float f = njb.a.get(czaVar);
            if (f != null) {
                float fFloatValue = f.floatValue();
                V vInvoke = czaVar.a().invoke(obj);
                int iB = vInvoke.b();
                for (int i = 0; i < iB; i++) {
                    vInvoke.e(fFloatValue, i);
                }
                tInvoke = this.t.b().invoke(vInvoke);
            }
            this.G = xv.b(0.0f, 0.0f, tInvoke, 3);
        }

        public final l9a<T, V> d() {
            return (l9a) this.w.getValue();
        }

        public final void e(long j) {
            if (this.A.h() == -1.0f) {
                this.F = true;
                if (xj5.a(d().c, d().d)) {
                    f(d().c);
                } else {
                    f(d().g(j));
                    this.D = (V) d().e(j);
                }
            }
        }

        public final void f(T t) {
            this.C.setValue(t);
        }

        @Override // defpackage.yz9
        public final T getValue() {
            return this.C.getValue();
        }

        public final void i(T t, boolean z) {
            l9a<T, V> l9aVar = this.y;
            T t2 = l9aVar != null ? l9aVar.c : null;
            dt7 dt7Var = this.u;
            boolean zA = xj5.a(t2, dt7Var.getValue());
            ct7 ct7Var = this.E;
            dt7 dt7Var2 = this.w;
            if (zA) {
                dt7Var2.setValue(new l9a(this.G, this.t, t, t, this.D.c()));
                this.B = true;
                ct7Var.o(d().c());
                return;
            }
            dt7 dt7Var3 = this.v;
            a04 a04Var = (!z || this.F || (((a04) dt7Var3.getValue()) instanceof ty9)) ? (a04) dt7Var3.getValue() : this.G;
            tva<S> tvaVar = tva.this;
            long jE = tvaVar.e();
            dt7 dt7Var4 = tvaVar.h;
            dt7Var2.setValue(new l9a(jE <= 0 ? a04Var : new kz9(a04Var, tvaVar.e()), this.t, t, dt7Var.getValue(), this.D));
            ct7Var.o(d().c());
            this.B = false;
            dt7Var4.setValue(Boolean.TRUE);
            if (tvaVar.g()) {
                fv9<tva<S>.d<?, ?>> fv9Var = tvaVar.i;
                int size = fv9Var.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    tva<S>.d<?, ?> dVar = fv9Var.get(i);
                    jMax = Math.max(jMax, dVar.E.b());
                    dVar.e(0L);
                }
                dt7Var4.setValue(Boolean.FALSE);
            }
        }

        public final void l(T t, T t2, a04<T> a04Var) {
            this.u.setValue(t2);
            this.v.setValue(a04Var);
            if (xj5.a(d().d, t) && xj5.a(d().c, t2)) {
                return;
            }
            i(t, false);
        }

        public final void m(T t, a04<T> a04Var) {
            if (this.B) {
                l9a<T, V> l9aVar = this.y;
                if (xj5.a(t, l9aVar != null ? l9aVar.c : null)) {
                    return;
                }
            }
            dt7 dt7Var = this.u;
            boolean zA = xj5.a(dt7Var.getValue(), t);
            at7 at7Var = this.A;
            if (zA && at7Var.h() == -1.0f) {
                return;
            }
            dt7Var.setValue(t);
            this.v.setValue(a04Var);
            T value = at7Var.h() == -3.0f ? t : this.C.getValue();
            dt7 dt7Var2 = this.z;
            i(value, !((Boolean) dt7Var2.getValue()).booleanValue());
            dt7Var2.setValue(Boolean.valueOf(at7Var.h() == -3.0f));
            if (at7Var.h() >= 0.0f) {
                f(d().g((long) (at7Var.h() * d().c())));
            } else if (at7Var.h() == -3.0f) {
                f(t);
            }
            this.B = false;
            at7Var.g(-1.0f);
        }

        public final String toString() {
            return "current value: " + this.C.getValue() + ", target: " + this.u.getValue() + ", spec: " + ((a04) this.v.getValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.animation.core.Transition$animateTo$1$1$1", f = "Transition.kt", l = {1222}, m = "invokeSuspend", v = 1)
    public static final class e extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public float t;
        public int u;
        public /* synthetic */ Object v;
        public final /* synthetic */ tva<S> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(tva<S> tvaVar, r02<? super e> r02Var) {
            super(2, r02Var);
            this.w = tvaVar;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            e eVar = new e(this.w, r02Var);
            eVar.v = obj;
            return eVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((e) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            final float fH;
            t72 t72Var;
            int i = this.u;
            if (i == 0) {
                dv8.b(obj);
                t72 t72Var2 = (t72) this.v;
                fH = o6a.h(t72Var2.getCoroutineContext());
                t72Var = t72Var2;
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fH = this.t;
                t72Var = (t72) this.v;
                dv8.b(obj);
            }
            while (u72.e(t72Var)) {
                final tva<S> tvaVar = this.w;
                oh4 oh4Var = new oh4() { // from class: vva
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj2) {
                        long jLongValue = ((Long) obj2).longValue();
                        tva tvaVar2 = tvaVar;
                        boolean zG = tvaVar2.g();
                        ct7 ct7Var = tvaVar2.g;
                        if (!zG) {
                            if (ct7Var.b() == Long.MIN_VALUE) {
                                ct7Var.o(jLongValue);
                                ((dt7) tvaVar2.a.a).setValue(Boolean.TRUE);
                            }
                            long jB = jLongValue - ct7Var.b();
                            float f = fH;
                            if (f != 0.0f) {
                                jB = wk6.c(jB / ((double) f));
                            }
                            tvaVar2.n(jB);
                            tvaVar2.h(jB, f == 0.0f);
                        }
                        return g2b.a;
                    }
                };
                this.v = t72Var;
                this.t = fH;
                this.u = 1;
                Object objU = zx6.a(getContext()).u(oh4Var, this);
                v72 v72Var = v72.t;
                if (objU == v72Var) {
                    return v72Var;
                }
            }
            return g2b.a;
        }
    }

    public tva() {
        throw null;
    }

    public tva(l4c l4cVar, tva<?> tvaVar, String str) {
        this.a = l4cVar;
        this.b = tvaVar;
        this.c = str;
        this.d = bl7.i(l4cVar.b());
        this.e = bl7.i(new c(l4cVar.b(), l4cVar.b()));
        this.f = new ct7(0L);
        this.g = new ct7(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.h = bl7.i(bool);
        this.i = new fv9<>();
        this.j = new fv9<>();
        this.k = bl7.i(bool);
        this.l = bl7.f(new n05(1, this));
        l4cVar.g(this);
    }

    public final void a(S s, jt1 jt1Var, int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bj4VarO.J(s) : bj4VarO.j(s) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.J(this) ? 32 : 16;
        }
        int i3 = 1;
        if (!bj4VarO.A(i2 & 1, (i2 & 19) != 18)) {
            bj4VarO.u();
        } else if (g()) {
            bj4VarO.K(467722849);
            bj4VarO.U(false);
        } else {
            bj4VarO.K(466062241);
            p(s);
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (z || objF == c0187a) {
                objF = bl7.f(new bq1(5, this));
                bj4VarO.C(objF);
            }
            if (((Boolean) ((yz9) objF).getValue()).booleanValue()) {
                bj4VarO.K(466470356);
                Object objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    c33 c33Var = wd3.a;
                    objF2 = m78.a(bj4VarO.x(), bj4VarO);
                }
                final t72 t72Var = (t72) objF2;
                boolean zJ = (i4 == 32) | bj4VarO.j(t72Var);
                Object objF3 = bj4VarO.f();
                if (zJ || objF3 == c0187a) {
                    objF3 = new oh4() { // from class: qva
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            oy0.d(t72Var, null, x72.w, new tva.e(this, null), 1);
                            return new tva.f();
                        }
                    };
                    bj4VarO.C(objF3);
                }
                wd3.b(t72Var, this, (oh4) objF3, bj4VarO);
                bj4VarO.U(false);
            } else {
                bj4VarO.K(467712929);
                bj4VarO.U(false);
            }
            bj4VarO.U(false);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new yb4(i, i3, this, s);
        }
    }

    public final long b() {
        fv9<tva<S>.d<?, ?>> fv9Var = this.i;
        int size = fv9Var.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, fv9Var.get(i).E.b());
        }
        fv9<tva<?>> fv9Var2 = this.j;
        int size2 = fv9Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, fv9Var2.get(i2).b());
        }
        return jMax;
    }

    public final void c() {
        fv9<tva<S>.d<?, ?>> fv9Var = this.i;
        int size = fv9Var.size();
        for (int i = 0; i < size; i++) {
            tva<S>.d<?, ?> dVar = fv9Var.get(i);
            dVar.y = null;
            dVar.x = null;
            dVar.B = false;
        }
        fv9<tva<?>> fv9Var2 = this.j;
        int size2 = fv9Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            fv9Var2.get(i2).c();
        }
    }

    public final boolean d() {
        fv9<tva<S>.d<?, ?>> fv9Var = this.i;
        int size = fv9Var.size();
        for (int i = 0; i < size; i++) {
            if (fv9Var.get(i).x != null) {
                return true;
            }
        }
        fv9<tva<?>> fv9Var2 = this.j;
        int size2 = fv9Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (fv9Var2.get(i2).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        tva<?> tvaVar = this.b;
        return tvaVar != null ? tvaVar.e() : this.f.b();
    }

    public final b<S> f() {
        return (b) this.e.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11, types: [V extends fw, fw] */
    public final void h(long j, boolean z) {
        ct7 ct7Var = this.g;
        long jB = ct7Var.b();
        l4c l4cVar = this.a;
        if (jB == Long.MIN_VALUE) {
            ct7Var.o(j);
            ((dt7) l4cVar.a).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((dt7) l4cVar.a).getValue()).booleanValue()) {
            ((dt7) l4cVar.a).setValue(Boolean.TRUE);
        }
        this.h.setValue(Boolean.FALSE);
        fv9<tva<S>.d<?, ?>> fv9Var = this.i;
        int size = fv9Var.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            tva<S>.d<?, ?> dVar = fv9Var.get(i);
            dt7 dt7Var = dVar.z;
            dt7 dt7Var2 = dVar.z;
            if (!((Boolean) dt7Var.getValue()).booleanValue()) {
                long jC = z ? dVar.d().c() : j;
                dVar.f(dVar.d().g(jC));
                dVar.D = dVar.d().e(jC);
                if (dVar.d().f(jC)) {
                    dt7Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) dt7Var2.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        fv9<tva<?>> fv9Var2 = this.j;
        int size2 = fv9Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            tva<?> tvaVar = fv9Var2.get(i2);
            dt7 dt7Var3 = tvaVar.d;
            l4c l4cVar2 = tvaVar.a;
            if (!xj5.a(dt7Var3.getValue(), l4cVar2.b())) {
                tvaVar.h(j, z);
            }
            if (!xj5.a(tvaVar.d.getValue(), l4cVar2.b())) {
                z2 = false;
            }
        }
        if (z2) {
            i();
        }
    }

    public final void i() {
        this.g.o(Long.MIN_VALUE);
        l4c l4cVar = this.a;
        if (l4cVar instanceof j37) {
            ((j37) l4cVar).f(this.d.getValue());
        }
        n(0L);
        ((dt7) l4cVar.a).setValue(Boolean.FALSE);
        fv9<tva<?>> fv9Var = this.j;
        int size = fv9Var.size();
        for (int i = 0; i < size; i++) {
            fv9Var.get(i).i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(float f2) {
        fv9<tva<S>.d<?, ?>> fv9Var = this.i;
        int size = fv9Var.size();
        for (int i = 0; i < size; i++) {
            tva<S>.d<?, ?> dVar = fv9Var.get(i);
            dVar.getClass();
            if (f2 == -4.0f || f2 == -5.0f) {
                l9a<?, V> l9aVar = dVar.y;
                if (l9aVar != 0) {
                    dVar.d().a(l9aVar.c);
                    dVar.x = null;
                    dVar.y = null;
                }
                Object obj = f2 == -4.0f ? dVar.d().d : dVar.d().c;
                dVar.d().a(obj);
                dVar.d().i(obj);
                dVar.f(obj);
                dVar.E.o(dVar.d().c());
            } else {
                dVar.A.g(f2);
            }
        }
        fv9<tva<?>> fv9Var2 = this.j;
        int size2 = fv9Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            fv9Var2.get(i2).j(f2);
        }
    }

    public final void k(Object obj, Object obj2) {
        this.g.o(Long.MIN_VALUE);
        l4c l4cVar = this.a;
        ((dt7) l4cVar.a).setValue(Boolean.FALSE);
        boolean zG = g();
        dt7 dt7Var = this.d;
        if (!zG || !xj5.a(l4cVar.b(), obj) || !xj5.a(dt7Var.getValue(), obj2)) {
            if (!xj5.a(l4cVar.b(), obj) && (l4cVar instanceof j37)) {
                ((j37) l4cVar).f(obj);
            }
            dt7Var.setValue(obj2);
            this.k.setValue(Boolean.TRUE);
            this.e.setValue(new c(obj, obj2));
        }
        fv9<tva<?>> fv9Var = this.j;
        int size = fv9Var.size();
        for (int i = 0; i < size; i++) {
            tva<?> tvaVar = fv9Var.get(i);
            tvaVar.getClass();
            if (tvaVar.g()) {
                tvaVar.k(tvaVar.a.b(), tvaVar.d.getValue());
            }
        }
        fv9<tva<S>.d<?, ?>> fv9Var2 = this.i;
        int size2 = fv9Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            fv9Var2.get(i2).e(0L);
        }
    }

    public final void l(long j) {
        ct7 ct7Var = this.g;
        if (ct7Var.b() == Long.MIN_VALUE) {
            ct7Var.o(j);
        }
        n(j);
        this.h.setValue(Boolean.FALSE);
        fv9<tva<S>.d<?, ?>> fv9Var = this.i;
        int size = fv9Var.size();
        for (int i = 0; i < size; i++) {
            fv9Var.get(i).e(j);
        }
        fv9<tva<?>> fv9Var2 = this.j;
        int size2 = fv9Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            tva<?> tvaVar = fv9Var2.get(i2);
            if (!xj5.a(tvaVar.d.getValue(), tvaVar.a.b())) {
                tvaVar.l(j);
            }
        }
    }

    public final void m(w89.a aVar) {
        fv9<tva<S>.d<?, ?>> fv9Var = this.i;
        int size = fv9Var.size();
        for (int i = 0; i < size; i++) {
            tva<S>.d<?, ?> dVar = fv9Var.get(i);
            dt7 dt7Var = dVar.C;
            if (!xj5.a(dVar.d().c, dVar.d().d)) {
                dVar.y = dVar.d();
                dVar.x = aVar;
            }
            dVar.w.setValue(new l9a(dVar.G, dVar.t, dt7Var.getValue(), dt7Var.getValue(), dVar.D.c()));
            dVar.E.o(dVar.d().c());
            dVar.B = true;
        }
        fv9<tva<?>> fv9Var2 = this.j;
        int size2 = fv9Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            fv9Var2.get(i2).m(aVar);
        }
    }

    public final void n(long j) {
        if (this.b == null) {
            this.f.o(j);
        }
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
    public final void o() {
        lv lvVar;
        fv9<tva<S>.d<?, ?>> fv9Var = this.i;
        int size = fv9Var.size();
        for (int i = 0; i < size; i++) {
            tva<S>.d<?, ?> dVar = fv9Var.get(i);
            w89.a aVar = dVar.x;
            if (aVar != null && (lvVar = dVar.y) != null) {
                long jC = wk6.c(aVar.g * ((double) aVar.d));
                Object objG = lvVar.g(jC);
                if (dVar.B) {
                    dVar.d().i(objG);
                }
                dVar.d().a(objG);
                dVar.E.o(dVar.d().c());
                if (dVar.A.h() == -2.0f || dVar.B) {
                    dVar.f(objG);
                } else {
                    dVar.e(tva.this.e());
                }
                if (jC >= aVar.g) {
                    dVar.x = null;
                    dVar.y = null;
                } else {
                    aVar.c = false;
                }
            }
        }
        fv9<tva<?>> fv9Var2 = this.j;
        int size2 = fv9Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            fv9Var2.get(i2).o();
        }
    }

    public final void p(S s) {
        dt7 dt7Var = this.d;
        if (xj5.a(dt7Var.getValue(), s)) {
            return;
        }
        this.e.setValue(new c(dt7Var.getValue(), s));
        l4c l4cVar = this.a;
        if (!xj5.a(l4cVar.b(), dt7Var.getValue())) {
            l4cVar.f(dt7Var.getValue());
        }
        dt7Var.setValue(s);
        if (this.g.b() == Long.MIN_VALUE) {
            this.h.setValue(Boolean.TRUE);
        }
        fv9<tva<S>.d<?, ?>> fv9Var = this.i;
        int size = fv9Var.size();
        for (int i = 0; i < size; i++) {
            fv9Var.get(i).A.g(-2.0f);
        }
    }

    public final String toString() {
        fv9<tva<S>.d<?, ?>> fv9Var = this.i;
        int size = fv9Var.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + fv9Var.get(i) + ", ";
        }
        return str;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f implements b33 {
        @Override // defpackage.b33
        public final void dispose() {
        }
    }
}
