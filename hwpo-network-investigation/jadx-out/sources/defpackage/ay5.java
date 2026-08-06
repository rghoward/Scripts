package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ay5 extends ox6.c implements qb9 {
    public mh4<? extends hw5> H;
    public sx5 I;
    public fl7 J;
    public boolean K;
    public c69 L;
    public final yx5 M = new yx5(0, this);
    public c32 N;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2", f = "LazyLayoutSemantics.kt", l = {213}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ int v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, r02<? super a> r02Var) {
            super(2, r02Var);
            this.v = i;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ay5.this.new a(this.v, r02Var);
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
                sx5 sx5Var = ay5.this.I;
                this.t = 1;
                Object objF = sx5Var.f(this.v, this);
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

    public ay5(mh4 mh4Var, sx5 sx5Var, fl7 fl7Var, boolean z) {
        this.H = mh4Var;
        this.I = sx5Var;
        this.J = fl7Var;
        this.K = z;
        c2();
    }

    @Override // defpackage.qb9
    public final void E1(hc9 hc9Var) {
        ec9.h(hc9Var);
        hc9Var.d(ac9.N, this.M);
        fl7 fl7Var = this.J;
        c69 c69Var = this.L;
        if (fl7Var == fl7.t) {
            if (c69Var == null) {
                xj5.e("scrollAxisRange");
                throw null;
            }
            gc9<c69> gc9Var = ac9.w;
            ho5<Object> ho5Var = ec9.a[13];
            hc9Var.d(gc9Var, c69Var);
        } else {
            if (c69Var == null) {
                xj5.e("scrollAxisRange");
                throw null;
            }
            gc9<c69> gc9Var2 = ac9.v;
            ho5<Object> ho5Var2 = ec9.a[12];
            hc9Var.d(gc9Var2, c69Var);
        }
        c32 c32Var = this.N;
        if (c32Var != null) {
            hc9Var.d(kb9.f, new k3(null, c32Var));
        }
        hc9Var.d(kb9.C, new k3(null, new dc9(new d32(1, this))));
        ah1 ah1VarE = this.I.e();
        gc9<ah1> gc9Var3 = ac9.f;
        ho5<Object> ho5Var3 = ec9.a[24];
        hc9Var.d(gc9Var3, ah1VarE);
    }

    @Override // ox6.c
    public final boolean R1() {
        return false;
    }

    public final void c2() {
        this.L = new c69(new a32(1, this), new zx5(0, this));
        this.N = this.K ? new c32(1, this) : null;
    }
}
