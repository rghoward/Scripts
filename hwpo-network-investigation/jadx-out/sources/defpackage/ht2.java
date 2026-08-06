package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ht2 implements s79 {
    public final oh4<Float, Float> a;
    public final b b = new b();
    public final w37 c = new w37();
    public final dt7 d;
    public final dt7 e;
    public final dt7 f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", l = {208}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ o37 v;
        public final /* synthetic */ ci4<t69, r02<? super g2b>, Object> w;

        /* JADX INFO: renamed from: ht2$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", l = {211}, m = "invokeSuspend", v = 1)
        public static final class C0104a extends p6a implements ci4<t69, r02<? super g2b>, Object> {
            public int t;
            public /* synthetic */ Object u;
            public final /* synthetic */ ht2 v;
            public final /* synthetic */ ci4<t69, r02<? super g2b>, Object> w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0104a(ht2 ht2Var, ci4<? super t69, ? super r02<? super g2b>, ? extends Object> ci4Var, r02<? super C0104a> r02Var) {
                super(2, r02Var);
                this.v = ht2Var;
                this.w = ci4Var;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                C0104a c0104a = new C0104a(this.v, this.w, r02Var);
                c0104a.u = obj;
                return c0104a;
            }

            @Override // defpackage.ci4
            public final Object invoke(t69 t69Var, r02<? super g2b> r02Var) {
                return ((C0104a) create(t69Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                dt7 dt7Var = this.v.d;
                int i = this.t;
                try {
                    if (i == 0) {
                        dv8.b(obj);
                        t69 t69Var = (t69) this.u;
                        dt7Var.setValue(Boolean.TRUE);
                        ci4<t69, r02<? super g2b>, Object> ci4Var = this.w;
                        this.t = 1;
                        Object objInvoke = ci4Var.invoke(t69Var, this);
                        v72 v72Var = v72.t;
                        if (objInvoke == v72Var) {
                            return v72Var;
                        }
                    } else {
                        if (i != 1) {
                            aa0.c("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dv8.b(obj);
                    }
                    dt7Var.setValue(Boolean.FALSE);
                    return g2b.a;
                } catch (Throwable th) {
                    dt7Var.setValue(Boolean.FALSE);
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(o37 o37Var, ci4<? super t69, ? super r02<? super g2b>, ? extends Object> ci4Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.v = o37Var;
            this.w = ci4Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ht2.this.new a(this.v, this.w, r02Var);
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
                ht2 ht2Var = ht2.this;
                w37 w37Var = ht2Var.c;
                b bVar = ht2Var.b;
                C0104a c0104a = new C0104a(ht2Var, this.w, null);
                this.t = 1;
                w37Var.getClass();
                Object objD = u72.d(new v37(this.v, w37Var, c0104a, bVar, null), this);
                v72 v72Var = v72.t;
                if (objD == v72Var) {
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
    public static final class b implements t69 {
        public b() {
        }

        @Override // defpackage.t69
        public final float f(float f) {
            if (Float.isNaN(f)) {
                return 0.0f;
            }
            ht2 ht2Var = ht2.this;
            float fFloatValue = ht2Var.a.invoke(Float.valueOf(f)).floatValue();
            ht2Var.e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
            ht2Var.f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
            return fFloatValue;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ht2(oh4<? super Float, Float> oh4Var) {
        this.a = oh4Var;
        Boolean bool = Boolean.FALSE;
        this.d = bl7.i(bool);
        this.e = bl7.i(bool);
        this.f = bl7.i(bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s79
    public final boolean a() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // defpackage.s79
    public final Object c(o37 o37Var, ci4<? super t69, ? super r02<? super g2b>, ? extends Object> ci4Var, r02<? super g2b> r02Var) {
        Object objD = u72.d(new a(o37Var, ci4Var, null), r02Var);
        return objD == v72.t ? objD : g2b.a;
    }

    @Override // defpackage.s79
    public final float e(float f) {
        return this.a.invoke(Float.valueOf(f)).floatValue();
    }
}
