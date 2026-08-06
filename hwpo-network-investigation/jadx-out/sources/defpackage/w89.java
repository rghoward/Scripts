package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class w89<S> extends l4c {
    public static final bw s = new bw(0.0f);
    public static final bw t = new bw(1.0f);
    public final dt7 b;
    public final dt7 c;
    public S d;
    public tva<S> e;
    public long f;
    public final dv4 g;
    public jv9 h;
    public final at7 i;
    public e41 j;
    public final a47 k;
    public final s37 l;
    public long m;
    public final t27<a> n;
    public a o;
    public final ev4 p;
    public float q;
    public final nl7 r;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public long a;
        public jdb b;
        public boolean c;
        public float d;
        public final bw e = new bw(0.0f);
        public bw f;
        public long g;
        public long h;

        public final String toString() {
            return "progress nanos: " + this.a + ", animationSpec: " + this.b + ", isComplete: " + this.c + ", value: " + this.d + ", start: " + this.e + ", initialVelocity: " + this.f + ", durationNanos: " + this.g + ", animationSpecDuration: " + this.h;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w89(r47 r47Var) {
        super(5);
        this.b = bl7.i(r47Var);
        this.c = bl7.i(r47Var);
        this.d = r47Var;
        this.g = new dv4(1, this);
        this.i = new at7(0.0f);
        this.k = new a47();
        this.l = new s37();
        this.m = Long.MIN_VALUE;
        this.n = new t27<>((Object) null);
        this.p = new ev4(1, this);
        this.r = new nl7(2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A(a aVar, long j) {
        long j2 = aVar.a + j;
        aVar.a = j2;
        long j3 = aVar.h;
        if (j2 >= j3) {
            aVar.d = 1.0f;
            return;
        }
        jdb jdbVar = aVar.b;
        bw bwVar = aVar.e;
        if (jdbVar == null) {
            float f = j2 / j3;
            aVar.d = (f * 1.0f) + ((1.0f - f) * bwVar.a(0));
            return;
        }
        bw bwVar2 = aVar.f;
        if (bwVar2 == null) {
            bwVar2 = s;
        }
        aVar.d = uh8.f(((bw) jdbVar.g(j2, bwVar, t, bwVar2)).a(0), 0.0f, 1.0f);
    }

    public static final void u(w89 w89Var) {
        at7 at7Var = w89Var.i;
        tva<S> tvaVar = w89Var.e;
        if (tvaVar == null) {
            return;
        }
        a aVar = w89Var.o;
        if (aVar == null) {
            if (w89Var.f <= 0 || at7Var.h() == 1.0f || xj5.a(w89Var.c.getValue(), w89Var.b.getValue())) {
                aVar = null;
            } else {
                aVar = new a();
                aVar.d = at7Var.h();
                long j = w89Var.f;
                aVar.g = j;
                aVar.h = wk6.c((1.0d - ((double) at7Var.h())) * j);
                aVar.e.e(at7Var.h(), 0);
            }
        }
        if (aVar != null) {
            aVar.g = w89Var.f;
            w89Var.n.g(aVar);
            tvaVar.m(aVar);
        }
        w89Var.o = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object v(w89 w89Var, u02 u02Var) throws Throwable {
        y89 y89Var;
        t27<a> t27Var = w89Var.n;
        if (u02Var instanceof y89) {
            y89Var = (y89) u02Var;
            int i = y89Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                y89Var.v = i - Integer.MIN_VALUE;
            } else {
                y89Var = new y89(w89Var, u02Var);
            }
        } else {
            y89Var = new y89(w89Var, u02Var);
        }
        Object obj = y89Var.t;
        int i2 = y89Var.v;
        Object obj2 = v72.t;
        if (i2 == 0) {
            dv8.b(obj);
            if (t27Var.d() && w89Var.o == null) {
                return g2b.a;
            }
            if (o6a.h(y89Var.getContext()) == 0.0f) {
                w89Var.z();
                w89Var.m = Long.MIN_VALUE;
                return g2b.a;
            }
            if (w89Var.m == Long.MIN_VALUE) {
                ev4 ev4Var = w89Var.p;
                y89Var.v = 1;
                if (zx6.a(y89Var.getContext()).u(ev4Var, y89Var) != obj2) {
                }
            }
            return obj2;
        }
        if (i2 != 1 && i2 != 2) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(obj);
        do {
            if (!t27Var.e() && w89Var.o == null) {
                w89Var.m = Long.MIN_VALUE;
                return g2b.a;
            }
            y89Var.v = 2;
        } while (w89Var.y(y89Var) != obj2);
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object w(w89 w89Var, u02 u02Var) throws Throwable {
        b99 b99Var;
        Object value;
        Object obj;
        a47 a47Var = w89Var.k;
        if (u02Var instanceof b99) {
            b99Var = (b99) u02Var;
            int i = b99Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                b99Var.w = i - Integer.MIN_VALUE;
            } else {
                b99Var = new b99(w89Var, u02Var);
            }
        } else {
            b99Var = new b99(w89Var, u02Var);
        }
        Object obj2 = b99Var.u;
        int i2 = b99Var.w;
        v72 v72Var = v72.t;
        if (i2 == 0) {
            dv8.b(obj2);
            value = w89Var.b.getValue();
            b99Var.t = value;
            b99Var.w = 1;
            if (a47Var.b(b99Var) != v72Var) {
            }
            return v72Var;
        }
        if (i2 == 1) {
            Object obj3 = b99Var.t;
            dv8.b(obj2);
            value = obj3;
        } else {
            if (i2 != 2) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = b99Var.t;
            dv8.b(obj2);
        }
        if (xj5.a(obj2, obj)) {
            return g2b.a;
        }
        w89Var.m = Long.MIN_VALUE;
        throw new CancellationException("targetState while waiting for composition");
        b99Var.t = value;
        b99Var.w = 2;
        e41 e41Var = new e41(1, th0.e(b99Var));
        e41Var.t();
        w89Var.j = e41Var;
        a47Var.c(null);
        Object objR = e41Var.r();
        if (objR != v72Var) {
            obj = value;
            obj2 = objR;
            if (xj5.a(obj2, obj)) {
                return g2b.a;
            }
            w89Var.m = Long.MIN_VALUE;
            throw new CancellationException("targetState while waiting for composition");
        }
        return v72Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x0084, please report this as an issue */
    public static final Object x(w89 w89Var, u02 u02Var) throws Throwable {
        c99 c99Var;
        Object value;
        Object obj;
        a47 a47Var = w89Var.k;
        if (u02Var instanceof c99) {
            c99Var = (c99) u02Var;
            int i = c99Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                c99Var.w = i - Integer.MIN_VALUE;
            } else {
                c99Var = new c99(w89Var, u02Var);
            }
        } else {
            c99Var = new c99(w89Var, u02Var);
        }
        Object obj2 = c99Var.u;
        int i2 = c99Var.w;
        v72 v72Var = v72.t;
        if (i2 == 0) {
            dv8.b(obj2);
            value = w89Var.b.getValue();
            c99Var.t = value;
            c99Var.w = 1;
            if (a47Var.b(c99Var) != v72Var) {
            }
            return v72Var;
        }
        if (i2 == 1) {
            Object obj3 = c99Var.t;
            dv8.b(obj2);
            value = obj3;
        } else {
            if (i2 != 2) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = c99Var.t;
            dv8.b(obj2);
        }
        if (!xj5.a(obj2, obj)) {
            w89Var.m = Long.MIN_VALUE;
            throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
        }
        return g2b.a;
        if (!xj5.a(value, w89Var.d)) {
            c99Var.t = value;
            c99Var.w = 2;
            e41 e41Var = new e41(1, th0.e(c99Var));
            e41Var.t();
            w89Var.j = e41Var;
            a47Var.c(null);
            Object objR = e41Var.r();
            if (objR != v72Var) {
                obj = value;
                obj2 = objR;
                if (!xj5.a(obj2, obj)) {
                    w89Var.m = Long.MIN_VALUE;
                    throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                }
            }
            return v72Var;
        }
        a47Var.c(null);
        return g2b.a;
    }

    public final Object B(float f, Object obj, p6a p6aVar) {
        if (0.0f > f || f > 1.0f) {
            e78.a("Expecting fraction between 0 and 1. Got " + f);
        }
        tva<S> tvaVar = this.e;
        if (tvaVar == null) {
            return g2b.a;
        }
        Object objA = s37.a(this.l, new z89(obj, this.b.getValue(), this, tvaVar, f, null), p6aVar);
        return objA == v72.t ? objA : g2b.a;
    }

    public final void C() {
        tva<S> tvaVar = this.e;
        if (tvaVar == null) {
            return;
        }
        tvaVar.l(wk6.c(((double) this.i.h()) * ((Number) tvaVar.l.getValue()).longValue()));
    }

    public final void D(float f) {
        this.i.g(f);
    }

    public final void E(jv9 jv9Var) {
        gu9 gu9Var;
        if (xj5.a(this.h, jv9Var)) {
            return;
        }
        jv9 jv9Var2 = this.h;
        if (jv9Var2 != null) {
            jv9Var2.b(this);
        }
        jv9 jv9Var3 = this.h;
        if (jv9Var3 != null && (gu9Var = jv9Var3.h) != null) {
            gu9Var.a();
        }
        this.h = jv9Var;
        if (jv9Var != null) {
            jv9Var.e();
        }
        jv9 jv9Var4 = this.h;
        if (jv9Var4 != null) {
            jv9Var4.d(this, owa.a, this.g);
        }
    }

    @Override // defpackage.l4c
    public final S b() {
        return (S) this.c.getValue();
    }

    @Override // defpackage.l4c
    public final S d() {
        return (S) this.b.getValue();
    }

    @Override // defpackage.l4c
    public final void f(S s2) {
        this.c.setValue(s2);
    }

    @Override // defpackage.l4c
    public final void g(tva<S> tvaVar) {
        tva<S> tvaVar2 = this.e;
        if (tvaVar2 != null && tvaVar != tvaVar2) {
            e78.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.e + ", new instance: " + tvaVar);
        }
        this.e = tvaVar;
    }

    @Override // defpackage.l4c
    public final void h() {
        this.e = null;
        jv9 jv9Var = this.h;
        if (jv9Var != null) {
            jv9Var.b(this);
        }
    }

    public final Object y(u02 u02Var) {
        float fH = o6a.h(u02Var.getContext());
        if (fH <= 0.0f) {
            z();
            return g2b.a;
        }
        this.q = fH;
        Object objU = zx6.a(u02Var.getContext()).u(this.r, u02Var);
        return objU == v72.t ? objU : g2b.a;
    }

    public final void z() {
        tva<S> tvaVar = this.e;
        if (tvaVar != null) {
            tvaVar.c();
        }
        this.n.j();
        if (this.o != null) {
            this.o = null;
            D(1.0f);
            C();
        }
    }
}
