package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cx0 extends dl0<ex0, ax0> {
    public static final /* synthetic */ int z = 0;
    public final ol4 x;
    public final bu8 y;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.core.presentation.dialog.browser.BrowserDialogViewModel$userToken$1", f = "BrowserDialogViewModel.kt", l = {24}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<t72, r02<? super String>, Object> {
        public int t;

        public a(r02<? super a> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return cx0.this.new a(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super String> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                ol4 ol4Var = cx0.this.x;
                g2b g2bVar = g2b.a;
                this.t = 1;
                ol4Var.getClass();
                obj = g5b.b(ol4Var, g2bVar, this);
                v72 v72Var = v72.t;
                if (obj == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return yd3.f((xd3) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx0(ol4 ol4Var, bu8 bu8Var) {
        super(ex0.b);
        ol4Var.getClass();
        bu8Var.getClass();
        ex0.Companion.getClass();
        this.x = ol4Var;
        this.y = bu8Var;
        oy0.b(rhb.b(this), null, new a(null), 3);
        oh7.a(this.u, new bx0(0));
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (!(bl0Var instanceof ax0.a)) {
            return b();
        }
        b();
        throw null;
    }
}
