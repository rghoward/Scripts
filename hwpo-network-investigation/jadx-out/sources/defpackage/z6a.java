package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class z6a extends ox6.c implements v6a, i58, tx2 {
    public Object H;
    public Object I;
    public PointerInputEventHandler J;
    public dz9 K;
    public r48 L = t6a.a;
    public final k37<a<?>> M;
    public final k37 N;
    public final k37<a<?>> O;
    public r48 P;
    public long Q;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a<R> implements yg0, tx2, r02<R> {
        public final /* synthetic */ z6a t;
        public final e41 u;
        public e41 v;
        public s48 w = s48.u;
        public final ff3 x = ff3.t;

        public a(e41 e41Var) {
            this.t = z6a.this;
            this.u = e41Var;
        }

        @Override // defpackage.tx2
        public final long A0(float f) {
            return this.t.A0(f);
        }

        @Override // defpackage.tx2
        public final float C1(long j) {
            return this.t.C1(j);
        }

        @Override // defpackage.tx2
        public final float F0(int i) {
            return this.t.F0(i);
        }

        @Override // defpackage.yg0
        public final r48 I() {
            return z6a.this.L;
        }

        @Override // defpackage.tx2
        public final float I0(float f) {
            return f / this.t.getDensity();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.yg0
        public final Object K(long j, ci4 ci4Var, u02 u02Var) throws Throwable {
            y6a y6aVar;
            if (u02Var instanceof y6a) {
                y6aVar = (y6a) u02Var;
                int i = y6aVar.v;
                if ((i & Integer.MIN_VALUE) != 0) {
                    y6aVar.v = i - Integer.MIN_VALUE;
                } else {
                    y6aVar = new y6a(this, u02Var);
                }
            } else {
                y6aVar = new y6a(this, u02Var);
            }
            Object obj = y6aVar.t;
            int i2 = y6aVar.v;
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        dv8.b(obj);
                        return obj;
                    }
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
                y6aVar.v = 1;
                Object objW1 = w1(j, ci4Var, y6aVar);
                v72 v72Var = v72.t;
                return objW1 == v72Var ? v72Var : objW1;
            } catch (t48 unused) {
                return null;
            }
        }

        @Override // defpackage.tx2
        public final float N0() {
            return this.t.N0();
        }

        @Override // defpackage.tx2
        public final long O(float f) {
            return this.t.O(f);
        }

        @Override // defpackage.tx2
        public final long P(long j) {
            return this.t.P(j);
        }

        @Override // defpackage.tx2
        public final float U0(float f) {
            return this.t.getDensity() * f;
        }

        @Override // defpackage.yg0
        public final long Z0() {
            z6a z6aVar = z6a.this;
            long jZ1 = z6aVar.z1(ew2.f(z6aVar).T.d());
            long j = z6aVar.Q;
            return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jZ1 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jZ1 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
        }

        @Override // defpackage.yg0
        public final long a() {
            return z6a.this.Q;
        }

        @Override // defpackage.tx2
        public final float d0(long j) {
            return this.t.d0(j);
        }

        @Override // defpackage.r02
        public final h72 getContext() {
            return this.x;
        }

        @Override // defpackage.tx2
        public final float getDensity() {
            return this.t.getDensity();
        }

        @Override // defpackage.yg0
        public final lgb getViewConfiguration() {
            return ew2.f(z6a.this).T;
        }

        @Override // defpackage.yg0
        public final Object h1(s48 s48Var, ak0 ak0Var) {
            e41 e41Var = new e41(1, th0.e(ak0Var));
            e41Var.t();
            this.w = s48Var;
            this.v = e41Var;
            return e41Var.r();
        }

        @Override // defpackage.tx2
        public final int n1(float f) {
            return this.t.n1(f);
        }

        @Override // defpackage.r02
        public final void resumeWith(Object obj) {
            z6a z6aVar = z6a.this;
            synchronized (z6aVar.N) {
                z6aVar.M.n(this);
                g2b g2bVar = g2b.a;
            }
            this.u.resumeWith(obj);
        }

        @Override // defpackage.tx2
        public final long w0(int i) {
            return this.t.w0(i);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.yg0
        public final Object w1(long j, ci4 ci4Var, ak0 ak0Var) throws Throwable {
            w6a w6aVar;
            Throwable th;
            dz9 dz9Var;
            e41 e41Var;
            if (ak0Var instanceof w6a) {
                w6aVar = (w6a) ak0Var;
                int i = w6aVar.w;
                if ((i & Integer.MIN_VALUE) != 0) {
                    w6aVar.w = i - Integer.MIN_VALUE;
                } else {
                    w6aVar = new w6a(this, ak0Var);
                }
            } else {
                w6aVar = new w6a(this, ak0Var);
            }
            Object objInvoke = w6aVar.u;
            int i2 = w6aVar.w;
            if (i2 != 0) {
                if (i2 != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dz9Var = w6aVar.t;
                try {
                    dv8.b(objInvoke);
                    dz9Var.k(x31.u);
                    return objInvoke;
                } catch (Throwable th2) {
                    th = th2;
                    dz9Var.k(x31.u);
                    throw th;
                }
            }
            dv8.b(objInvoke);
            if (j <= 0 && (e41Var = this.v) != null) {
                e41Var.resumeWith(new av8.a(new t48(j)));
            }
            dz9 dz9VarD = oy0.d(z6a.this.Q1(), null, null, new x6a(j, this, null), 3);
            try {
                w6aVar.t = dz9VarD;
                w6aVar.w = 1;
                objInvoke = ci4Var.invoke(this, w6aVar);
                v72 v72Var = v72.t;
                if (objInvoke == v72Var) {
                    return v72Var;
                }
                dz9Var = dz9VarD;
                dz9Var.k(x31.u);
                return objInvoke;
            } catch (Throwable th3) {
                th = th3;
                dz9Var = dz9VarD;
                dz9Var.k(x31.u);
                throw th;
            }
        }

        @Override // defpackage.tx2
        public final long z1(long j) {
            return this.t.z1(j);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends wp5 implements oh4<Throwable, g2b> {
        public final /* synthetic */ a<R> u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a<R> aVar) {
            super(1);
            this.u = aVar;
        }

        @Override // defpackage.oh4
        public final g2b invoke(Throwable th) {
            Throwable th2 = th;
            a<R> aVar = this.u;
            e41 e41Var = aVar.v;
            if (e41Var != null) {
                e41Var.l(th2);
            }
            aVar.v = null;
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1", f = "SuspendingPointerInputFilter.kt", l = {718, 720}, m = "invokeSuspend", v = 1)
    public static final class c extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;

        public c(r02<? super c> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return z6a.this.new c(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((c) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                z6a z6aVar = z6a.this;
                PointerInputEventHandler pointerInputEventHandler = z6aVar.J;
                this.t = 2;
                Object objInvoke = pointerInputEventHandler.invoke(z6aVar, this);
                v72 v72Var = v72.t;
                if (objInvoke == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1 && i != 2) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    public z6a(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.H = obj;
        this.I = obj2;
        this.J = pointerInputEventHandler;
        k37<a<?>> k37Var = new k37<>(new a[16]);
        this.M = k37Var;
        this.N = k37Var;
        this.O = new k37<>(new a[16]);
        this.Q = 0L;
    }

    @Override // defpackage.g58
    public final void A1() {
        O1();
    }

    @Override // defpackage.tx2
    public final float N0() {
        return ew2.f(this).R.N0();
    }

    @Override // defpackage.i58
    public final <R> Object O0(ci4<? super yg0, ? super r02<? super R>, ? extends Object> ci4Var, r02<? super R> r02Var) {
        e41 e41Var = new e41(1, th0.e(r02Var));
        e41Var.t();
        a aVar = new a(e41Var);
        synchronized (this.N) {
            this.M.d(aVar);
            new nz8(th0.e(th0.d(aVar, aVar, ci4Var)), v72.t).resumeWith(g2b.a);
        }
        e41Var.v(new b(aVar));
        return e41Var.r();
    }

    @Override // defpackage.v6a
    public final void O1() {
        dz9 dz9Var = this.K;
        if (dz9Var != null) {
            dz9Var.A(new h58("Pointer input was reset", 2));
            this.K = null;
        }
    }

    @Override // ox6.c
    public final void V1() {
        O1();
    }

    @Override // defpackage.g58
    public final void c0(r48 r48Var, s48 s48Var, long j) {
        this.Q = j;
        if (s48Var == s48.t) {
            this.L = r48Var;
        }
        if (this.K == null) {
            this.K = oy0.d(Q1(), null, x72.w, new c(null), 1);
        }
        c2(r48Var, s48Var);
        List<a58> list = r48Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!z69.g(list.get(i))) {
                this.P = r48Var;
            }
        }
        r48Var = null;
        this.P = r48Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004c A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0020, B:17:0x0023, B:20:0x002f, B:22:0x0037, B:24:0x003b, B:25:0x0040, B:26:0x0043, B:28:0x004c, B:30:0x0054, B:32:0x0058), top: B:41:0x000d }] */
    public final void c2(r48 r48Var, s48 s48Var) {
        a<?>[] aVarArr;
        int i;
        int i2;
        a<?> aVar;
        e41 e41Var;
        e41 e41Var2;
        synchronized (this.N) {
            k37<a<?>> k37Var = this.O;
            k37Var.e(k37Var.v, this.M);
        }
        try {
            int iOrdinal = s48Var.ordinal();
            if (iOrdinal == 0) {
                k37<a<?>> k37Var2 = this.O;
                aVarArr = k37Var2.t;
                i = k37Var2.v;
                for (i2 = 0; i2 < i; i2++) {
                    aVar = aVarArr[i2];
                    if (s48Var != aVar.w && (e41Var = aVar.v) != null) {
                        aVar.v = null;
                        e41Var.resumeWith(r48Var);
                    }
                }
            } else if (iOrdinal == 1) {
                k37<a<?>> k37Var3 = this.O;
                int i3 = k37Var3.v - 1;
                a<?>[] aVarArr2 = k37Var3.t;
                if (i3 < aVarArr2.length) {
                    while (i3 >= 0) {
                        a<?> aVar2 = aVarArr2[i3];
                        if (s48Var == aVar2.w && (e41Var2 = aVar2.v) != null) {
                            aVar2.v = null;
                            e41Var2.resumeWith(r48Var);
                        }
                        i3--;
                    }
                }
            } else {
                if (iOrdinal != 2) {
                    throw new ib7();
                }
                k37<a<?>> k37Var4 = this.O;
                aVarArr = k37Var4.t;
                i = k37Var4.v;
                while (i2 < i) {
                    aVar = aVarArr[i2];
                    if (s48Var != aVar.w) {
                    }
                }
            }
            this.O.k();
        } catch (Throwable th) {
            this.O.k();
            throw th;
        }
    }

    @Override // defpackage.tx2
    public final float getDensity() {
        return ew2.f(this).R.getDensity();
    }

    @Override // defpackage.i58
    public final lgb getViewConfiguration() {
        return ew2.f(this).T;
    }

    @Override // defpackage.dw2
    public final void l() {
        O1();
    }

    @Override // defpackage.g58
    public final void t0() {
        r48 r48Var = this.P;
        if (r48Var == null) {
            return;
        }
        List<a58> list = r48Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    a58 a58Var = list.get(i2);
                    long j = a58Var.a;
                    long j2 = a58Var.c;
                    long j3 = a58Var.b;
                    float f = a58Var.e;
                    boolean z = a58Var.d;
                    arrayList.add(new a58(j, j3, j2, false, f, j3, j2, z, z, a58Var.i, 0L, 1.0f, 0L));
                }
                r48 r48Var2 = new r48(arrayList, null);
                this.L = r48Var2;
                c2(r48Var2, s48.t);
                c2(r48Var2, s48.u);
                c2(r48Var2, s48.v);
                this.P = null;
                return;
            }
        }
    }
}
