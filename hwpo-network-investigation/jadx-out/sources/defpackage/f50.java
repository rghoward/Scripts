package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class f50 extends es7 implements im8 {
    public static final e50 N = new e50();
    public a D;
    public es7 E;
    public oh4<? super a, ? extends a> F;
    public oh4<? super a, g2b> G;
    public nz1 H;
    public int I;
    public boolean J;
    public final dt7 K;
    public final dt7 L;
    public final dt7 M;
    public o02 y;
    public final a0a z = b0a.b(new cr9(0));
    public final dt7 A = bl7.i(null);
    public final at7 B = new at7(1.0f);
    public final dt7 C = bl7.i(null);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class a {

        /* JADX INFO: renamed from: f50$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0085a extends a {
            public static final C0085a a = new C0085a();

            @Override // f50.a
            public final es7 a() {
                return null;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0085a);
            }

            public final int hashCode() {
                return -1515560141;
            }

            public final String toString() {
                return "Empty";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class b extends a {
            public final es7 a;
            public final dm3 b;

            public b(es7 es7Var, dm3 dm3Var) {
                this.a = es7Var;
                this.b = dm3Var;
            }

            @Override // f50.a
            public final es7 a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return xj5.a(this.a, bVar.a) && xj5.a(this.b, bVar.b);
            }

            public final int hashCode() {
                es7 es7Var = this.a;
                return this.b.hashCode() + ((es7Var == null ? 0 : es7Var.hashCode()) * 31);
            }

            public final String toString() {
                return "Error(painter=" + this.a + ", result=" + this.b + ')';
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class c extends a {
            public final es7 a;

            public c(es7 es7Var) {
                this.a = es7Var;
            }

            @Override // f50.a
            public final es7 a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && xj5.a(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                es7 es7Var = this.a;
                if (es7Var == null) {
                    return 0;
                }
                return es7Var.hashCode();
            }

            public final String toString() {
                return "Loading(painter=" + this.a + ')';
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class d extends a {
            public final es7 a;
            public final f5a b;

            public d(es7 es7Var, f5a f5aVar) {
                this.a = es7Var;
                this.b = f5aVar;
            }

            @Override // f50.a
            public final es7 a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return xj5.a(this.a, dVar.a) && xj5.a(this.b, dVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Success(painter=" + this.a + ", result=" + this.b + ')';
            }
        }

        public abstract es7 a();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "coil.compose.AsyncImagePainter$onRemembered$1$1", f = "AsyncImagePainter.kt", l = {308}, m = "invokeSuspend")
    public static final class b extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "coil.compose.AsyncImagePainter$onRemembered$1$1$2", f = "AsyncImagePainter.kt", l = {307}, m = "invokeSuspend")
        public static final class a extends p6a implements ci4<k85, r02<? super a>, Object> {
            public int t;
            public /* synthetic */ Object u;
            public final /* synthetic */ f50 v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f50 f50Var, r02<? super a> r02Var) {
                super(2, r02Var);
                this.v = f50Var;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                a aVar = new a(this.v, r02Var);
                aVar.u = obj;
                return aVar;
            }

            @Override // defpackage.ci4
            public final Object invoke(k85 k85Var, r02<? super a> r02Var) {
                return ((a) create(k85Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                f50 f50Var;
                int i = this.t;
                if (i == 0) {
                    dv8.b(obj);
                    k85 k85Var = (k85) this.u;
                    f50 f50Var2 = this.v;
                    b85 b85Var = (b85) f50Var2.M.getValue();
                    k85.a aVarA = k85.a(k85Var);
                    aVarA.d = new h50(f50Var2);
                    aVarA.d();
                    xv2 xv2Var = k85Var.F;
                    if (xv2Var.a == null) {
                        aVarA.t = new j50(f50Var2);
                        aVarA.d();
                    }
                    if (xv2Var.b == null) {
                        nz1 nz1Var = f50Var2.H;
                        hj8 hj8Var = x6b.b;
                        aVarA.u = (xj5.a(nz1Var, nz1.a.b) || xj5.a(nz1Var, nz1.a.e)) ? s39.u : s39.t;
                    }
                    if (xv2Var.d != x68.t) {
                        aVarA.h = x68.u;
                    }
                    k85 k85VarA = aVarA.a();
                    this.u = f50Var2;
                    this.t = 1;
                    obj = b85Var.c(k85VarA, this);
                    v72 v72Var = v72.t;
                    if (obj == v72Var) {
                        return v72Var;
                    }
                    f50Var = f50Var2;
                } else {
                    if (i != 1) {
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f50Var = (f50) this.u;
                    dv8.b(obj);
                }
                l85 l85Var = (l85) obj;
                f50Var.getClass();
                if (l85Var instanceof f5a) {
                    f5a f5aVar = (f5a) l85Var;
                    return new a.d(f50Var.j(f5aVar.a), f5aVar);
                }
                if (!(l85Var instanceof dm3)) {
                    u.b();
                    return null;
                }
                dm3 dm3Var = (dm3) l85Var;
                Drawable drawable = dm3Var.a;
                return new a.b(drawable != null ? f50Var.j(drawable) : null, dm3Var);
            }
        }

        /* JADX INFO: renamed from: f50$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public /* synthetic */ class C0086b implements s54, mi4 {
            public final /* synthetic */ f50 t;

            public C0086b(f50 f50Var) {
                this.t = f50Var;
            }

            @Override // defpackage.mi4
            public final di4<?> b() {
                return new wa(2, this.t, f50.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V", 4);
            }

            @Override // defpackage.s54
            public final Object emit(Object obj, r02 r02Var) {
                this.t.k((a) obj);
                return g2b.a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof s54) && (obj instanceof mi4)) {
                    return xj5.a(b(), ((mi4) obj).b());
                }
                return false;
            }

            public final int hashCode() {
                return b().hashCode();
            }
        }

        public b(r02<? super b> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return f50.this.new b(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((b) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                final f50 f50Var = f50.this;
                oz8 oz8VarK = bl7.k(new mh4() { // from class: g50
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return (k85) f50Var.L.getValue();
                    }
                });
                a aVar = new a(f50Var, null);
                int i2 = a74.a;
                ba1 ba1Var = new ba1(new z64(aVar, null), oz8VarK, ff3.t, -2, xx0.t);
                C0086b c0086b = new C0086b(f50Var);
                this.t = 1;
                Object objCollect = ba1Var.collect(c0086b, this);
                v72 v72Var = v72.t;
                if (objCollect == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    public f50(k85 k85Var, b85 b85Var) {
        a.C0085a c0085a = a.C0085a.a;
        this.D = c0085a;
        this.F = N;
        this.H = nz1.a.b;
        this.I = 1;
        this.K = bl7.i(c0085a);
        this.L = bl7.i(k85Var);
        this.M = bl7.i(b85Var);
    }

    @Override // defpackage.es7
    public final boolean a(float f) {
        this.B.g(f);
        return true;
    }

    @Override // defpackage.im8
    public final void b() {
        o02 o02Var = this.y;
        if (o02Var != null) {
            u72.c(o02Var, null);
        }
        this.y = null;
        Object obj = this.E;
        im8 im8Var = obj instanceof im8 ? (im8) obj : null;
        if (im8Var != null) {
            im8Var.b();
        }
    }

    @Override // defpackage.im8
    public final void c() {
        o02 o02Var = this.y;
        if (o02Var != null) {
            u72.c(o02Var, null);
        }
        this.y = null;
        Object obj = this.E;
        im8 im8Var = obj instanceof im8 ? (im8) obj : null;
        if (im8Var != null) {
            im8Var.c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.im8
    public final void d() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            if (this.y == null) {
                k5a k5aVarB = od3.b();
                et2 et2Var = i23.a;
                o02 o02VarA = u72.a(h72.a.C0100a.c(k5aVarB, ag6.a.x0()));
                this.y = o02VarA;
                Object obj = this.E;
                im8 im8Var = obj instanceof im8 ? (im8) obj : null;
                if (im8Var != null) {
                    im8Var.d();
                }
                if (this.J) {
                    k85.a aVarA = k85.a((k85) this.L.getValue());
                    aVarA.b = ((b85) this.M.getValue()).b();
                    aVarA.x = null;
                    k85 k85VarA = aVarA.a();
                    Drawable drawableB = q.b(k85VarA, k85VarA.C, k85VarA.B, k85VarA.G.j);
                    k(new a.c(drawableB != null ? j(drawableB) : null));
                } else {
                    oy0.d(o02VarA, null, null, new b(null), 3);
                }
            }
            g2b g2bVar = g2b.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.es7
    public final boolean e(wh1 wh1Var) {
        this.C.setValue(wh1Var);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.es7
    public final long h() {
        es7 es7Var = (es7) this.A.getValue();
        if (es7Var != null) {
            return es7Var.h();
        }
        return 9205357640488583168L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.es7
    public final void i(d73 d73Var) {
        cr9 cr9Var = new cr9(d73Var.c());
        a0a a0aVar = this.z;
        a0aVar.getClass();
        a0aVar.l(null, cr9Var);
        es7 es7Var = (es7) this.A.getValue();
        if (es7Var != null) {
            es7Var.g(d73Var, d73Var.c(), this.B.h(), (wh1) this.C.getValue());
        }
    }

    public final es7 j(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? gz3.a(new po(((BitmapDrawable) drawable).getBitmap()), this.I) : new r73(drawable.mutate());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0096  */
    /* JADX WARN: Code duplicated, block: B:41:0x009b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    public final void k(a aVar) {
        l85 l85Var;
        es7 es7VarA;
        oh4<? super a, g2b> oh4Var;
        Object objA;
        im8 im8Var;
        im8 im8Var2;
        a aVar2 = this.D;
        a aVarInvoke = this.F.invoke(aVar);
        this.D = aVarInvoke;
        this.K.setValue(aVarInvoke);
        if (!(aVarInvoke instanceof a.d)) {
            if (aVarInvoke instanceof a.b) {
                l85Var = ((a.b) aVarInvoke).b;
            } else {
                es7VarA = null;
            }
            if (es7VarA == null) {
                es7VarA = aVarInvoke.a();
            }
            this.E = es7VarA;
            this.A.setValue(es7VarA);
            if (this.y != null && aVar2.a() != aVarInvoke.a()) {
                objA = aVar2.a();
                if (objA instanceof im8) {
                    im8Var = (im8) objA;
                } else {
                    im8Var = null;
                }
                if (im8Var != null) {
                    im8Var.c();
                }
                Object objA2 = aVarInvoke.a();
                im8Var2 = objA2 instanceof im8 ? (im8) objA2 : null;
                if (im8Var2 != null) {
                    im8Var2.d();
                }
            }
            oh4Var = this.G;
            if (oh4Var != null) {
                oh4Var.invoke(aVarInvoke);
            }
        }
        l85Var = ((a.d) aVarInvoke).b;
        xva xvaVarA = l85Var.b().j.a(k50.a, l85Var);
        if (xvaVarA instanceof bc2) {
            es7VarA = new ac2(aVar2 instanceof a.c ? aVar2.a() : null, aVarInvoke.a(), this.H, ((bc2) xvaVarA).c, ((l85Var instanceof f5a) && ((f5a) l85Var).g) ? false : true);
        } else {
            es7VarA = null;
        }
        if (es7VarA == null) {
            es7VarA = aVarInvoke.a();
        }
        this.E = es7VarA;
        this.A.setValue(es7VarA);
        if (this.y != null) {
            objA = aVar2.a();
            if (objA instanceof im8) {
                im8Var = (im8) objA;
            } else {
                im8Var = null;
            }
            if (im8Var != null) {
                im8Var.c();
            }
            Object objA3 = aVarInvoke.a();
            if (objA3 instanceof im8) {
            }
            if (im8Var2 != null) {
                im8Var2.d();
            }
        }
        oh4Var = this.G;
        if (oh4Var != null) {
            oh4Var.invoke(aVarInvoke);
        }
    }
}
