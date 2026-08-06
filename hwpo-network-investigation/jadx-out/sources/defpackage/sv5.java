package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sv5 {
    public final t72 a;
    public final jo4 b;
    public final wv5 c;
    public a04<Float> d;
    public a04<Float> e;
    public boolean f;
    public final dt7 g;
    public final dt7 h;
    public final dt7 i;
    public final dt7 j;
    public long k;
    public long l;
    public ko4 m;
    public final qt<bg5, cw> n;
    public final qt<Float, bw> o;
    public final dt7 p;
    public long q;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$1", f = "LazyLayoutItemAnimation.kt", l = {171}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;

        public a(r02<? super a> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return sv5.this.new a(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                qt<Float, bw> qtVar = sv5.this.o;
                Float f = new Float(1.0f);
                this.t = 1;
                Object objE = qtVar.e(this, f);
                v72 v72Var = v72.t;
                if (objE == v72Var) {
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

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2", f = "LazyLayoutItemAnimation.kt", l = {183, ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", v = 1)
    public static final class b extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ boolean u;
        public final /* synthetic */ sv5 v;
        public final /* synthetic */ a04<Float> w;
        public final /* synthetic */ ko4 x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, sv5 sv5Var, a04<Float> a04Var, ko4 ko4Var, r02<? super b> r02Var) {
            super(2, r02Var);
            this.u = z;
            this.v = sv5Var;
            this.w = a04Var;
            this.x = ko4Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new b(this.u, this.v, this.w, this.x, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((b) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        
            if (r13 == r5) goto L22;
         */
        @Override // defpackage.ak0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                r12 = this;
                int r0 = r12.t
                r1 = 0
                r2 = 2
                r3 = 1
                sv5 r4 = r12.v
                v72 r5 = defpackage.v72.t
                if (r0 == 0) goto L21
                if (r0 == r3) goto L1d
                if (r0 != r2) goto L16
                defpackage.dv8.b(r13)     // Catch: java.lang.Throwable -> L13
                goto L56
            L13:
                r0 = move-exception
                r12 = r0
                goto L5e
            L16:
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r12)
                r12 = 0
                return r12
            L1d:
                defpackage.dv8.b(r13)     // Catch: java.lang.Throwable -> L13
                goto L39
            L21:
                defpackage.dv8.b(r13)
                boolean r13 = r12.u     // Catch: java.lang.Throwable -> L13
                if (r13 == 0) goto L39
                qt<java.lang.Float, bw> r13 = r4.o     // Catch: java.lang.Throwable -> L13
                java.lang.Float r0 = new java.lang.Float     // Catch: java.lang.Throwable -> L13
                r6 = 0
                r0.<init>(r6)     // Catch: java.lang.Throwable -> L13
                r12.t = r3     // Catch: java.lang.Throwable -> L13
                java.lang.Object r13 = r13.e(r12, r0)     // Catch: java.lang.Throwable -> L13
                if (r13 != r5) goto L39
                goto L55
            L39:
                qt<java.lang.Float, bw> r6 = r4.o     // Catch: java.lang.Throwable -> L13
                java.lang.Float r7 = new java.lang.Float     // Catch: java.lang.Throwable -> L13
                r13 = 1065353216(0x3f800000, float:1.0)
                r7.<init>(r13)     // Catch: java.lang.Throwable -> L13
                a04<java.lang.Float> r8 = r12.w     // Catch: java.lang.Throwable -> L13
                ko4 r13 = r12.x     // Catch: java.lang.Throwable -> L13
                k0 r9 = new k0     // Catch: java.lang.Throwable -> L13
                r9.<init>(r3, r13, r4)     // Catch: java.lang.Throwable -> L13
                r12.t = r2     // Catch: java.lang.Throwable -> L13
                r11 = 4
                r10 = r12
                java.lang.Object r13 = defpackage.qt.c(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L13
                if (r13 != r5) goto L56
            L55:
                return r5
            L56:
                uv r13 = (defpackage.uv) r13     // Catch: java.lang.Throwable -> L13
                r4.e(r1)
                g2b r12 = defpackage.g2b.a
                return r12
            L5e:
                r4.e(r1)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: sv5.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$cancelPlacementAnimation$1", f = "LazyLayoutItemAnimation.kt", l = {106}, m = "invokeSuspend", v = 1)
    public static final class c extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;

        public c(r02<? super c> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return sv5.this.new c(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((c) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            sv5 sv5Var = sv5.this;
            if (i == 0) {
                dv8.b(obj);
                qt<bg5, cw> qtVar = sv5Var.n;
                bg5 bg5Var = new bg5(0L);
                this.t = 1;
                Object objE = qtVar.e(this, bg5Var);
                v72 v72Var = v72.t;
                if (objE == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            sv5Var.h(0L);
            sv5Var.g(false);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$1", f = "LazyLayoutItemAnimation.kt", l = {218}, m = "invokeSuspend", v = 1)
    public static final class d extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;

        public d(r02<? super d> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return sv5.this.new d(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((d) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                qt<bg5, cw> qtVar = sv5.this.n;
                this.t = 1;
                Object objF = qtVar.f(this);
                v72 v72Var = v72.t;
                if (objF == v72Var) {
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

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$2", f = "LazyLayoutItemAnimation.kt", l = {222}, m = "invokeSuspend", v = 1)
    public static final class e extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;

        public e(r02<? super e> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return sv5.this.new e(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((e) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                qt<Float, bw> qtVar = sv5.this.o;
                this.t = 1;
                Object objF = qtVar.f(this);
                v72 v72Var = v72.t;
                if (objF == v72Var) {
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

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$3", f = "LazyLayoutItemAnimation.kt", l = {226}, m = "invokeSuspend", v = 1)
    public static final class f extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;

        public f(r02<? super f> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return sv5.this.new f(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((f) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                qt<Float, bw> qtVar = sv5.this.o;
                this.t = 1;
                Object objF = qtVar.f(this);
                v72 v72Var = v72.t;
                if (objF == v72Var) {
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

    public sv5(t72 t72Var, jo4 jo4Var, wv5 wv5Var) {
        this.a = t72Var;
        this.b = jo4Var;
        this.c = wv5Var;
        Boolean bool = Boolean.FALSE;
        this.g = bl7.i(bool);
        this.h = bl7.i(bool);
        this.i = bl7.i(bool);
        this.j = bl7.i(bool);
        this.k = 9223372034707292159L;
        this.l = 0L;
        Object obj = null;
        this.m = jo4Var != null ? jo4Var.b() : null;
        int i = 12;
        this.n = new qt<>(new bg5(0L), b0a.B, obj, i);
        this.o = new qt<>(Float.valueOf(1.0f), b0a.v, obj, i);
        this.p = bl7.i(new bg5(0L));
        this.q = 9223372034707292159L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        ko4 ko4Var = this.m;
        a04<Float> a04Var = this.d;
        boolean zBooleanValue = ((Boolean) this.h.getValue()).booleanValue();
        t72 t72Var = this.a;
        if (zBooleanValue || a04Var == null || ko4Var == null) {
            if (c()) {
                if (ko4Var != null) {
                    ko4Var.e(1.0f);
                }
                oy0.d(t72Var, null, null, new a(null), 3);
                return;
            }
            return;
        }
        e(true);
        boolean zC = c();
        boolean z = !zC;
        if (!zC) {
            ko4Var.e(0.0f);
        }
        oy0.d(t72Var, null, null, new b(z, this, a04Var, ko4Var, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        if (((Boolean) this.g.getValue()).booleanValue()) {
            oy0.d(this.a, null, null, new c(null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        jo4 jo4Var;
        boolean zBooleanValue = ((Boolean) this.g.getValue()).booleanValue();
        t72 t72Var = this.a;
        if (zBooleanValue) {
            g(false);
            oy0.d(t72Var, null, null, new d(null), 3);
        }
        if (((Boolean) this.h.getValue()).booleanValue()) {
            e(false);
            oy0.d(t72Var, null, null, new e(null), 3);
        }
        if (c()) {
            f(false);
            oy0.d(t72Var, null, null, new f(null), 3);
        }
        this.f = false;
        h(0L);
        this.k = 9223372034707292159L;
        ko4 ko4Var = this.m;
        if (ko4Var != null && (jo4Var = this.b) != null) {
            jo4Var.a(ko4Var);
        }
        this.m = null;
        this.d = null;
        this.e = null;
    }

    public final void e(boolean z) {
        this.h.setValue(Boolean.valueOf(z));
    }

    public final void f(boolean z) {
        this.i.setValue(Boolean.valueOf(z));
    }

    public final void g(boolean z) {
        this.g.setValue(Boolean.valueOf(z));
    }

    public final void h(long j) {
        this.p.setValue(new bg5(j));
    }
}
