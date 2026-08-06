package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$2$1$1$1", f = "DatePicker.kt", l = {1653}, m = "invokeSuspend")
public final class nj2 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ nz5 u;
    public final /* synthetic */ int v;
    public final /* synthetic */ fg5 w;
    public final /* synthetic */ l21 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj2(nz5 nz5Var, int i, fg5 fg5Var, l21 l21Var, r02<? super nj2> r02Var) {
        super(2, r02Var);
        this.u = nz5Var;
        this.v = i;
        this.w = fg5Var;
        this.x = l21Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new nj2(this.u, this.v, this.w, this.x, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((nj2) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            int i2 = (((this.v - this.w.t) * 12) + this.x.b) - 1;
            this.t = 1;
            Object objK = nz5.k(this.u, i2, this);
            v72 v72Var = v72.t;
            if (objK == v72Var) {
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
