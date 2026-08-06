package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1", f = "CoreTextField.kt", l = {363}, m = "invokeSuspend", v = 1)
public final class g62 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ u56 u;
    public final /* synthetic */ h37 v;
    public final /* synthetic */ xha w;
    public final /* synthetic */ qga x;
    public final /* synthetic */ s85 y;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements s54 {
        public final /* synthetic */ u56 t;
        public final /* synthetic */ xha u;
        public final /* synthetic */ qga v;
        public final /* synthetic */ s85 w;

        public a(u56 u56Var, xha xhaVar, qga qgaVar, s85 s85Var) {
            this.t = u56Var;
            this.u = xhaVar;
            this.v = qgaVar;
            this.w = s85Var;
        }

        @Override // defpackage.s54
        public final Object emit(Object obj, r02 r02Var) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            u56 u56Var = this.t;
            if (zBooleanValue && u56Var.b()) {
                qga qgaVar = this.v;
                m62.g(this.u, u56Var, qgaVar.n(), this.w, qgaVar.b);
            } else {
                m62.e(u56Var);
            }
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g62(u56 u56Var, h37 h37Var, xha xhaVar, qga qgaVar, s85 s85Var, r02 r02Var) {
        super(2, r02Var);
        this.u = u56Var;
        this.v = h37Var;
        this.w = xhaVar;
        this.x = qgaVar;
        this.y = s85Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new g62(this.u, this.v, this.w, this.x, this.y, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((g62) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        u56 u56Var = this.u;
        try {
            if (i == 0) {
                dv8.b(obj);
                oz8 oz8VarK = bl7.k(new aq1(1, this.v));
                a aVar = new a(u56Var, this.w, this.x, this.y);
                this.t = 1;
                Object objCollect = oz8VarK.collect(aVar, this);
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
            m62.e(u56Var);
            return g2b.a;
        } catch (Throwable th) {
            m62.e(u56Var);
            throw th;
        }
    }
}
