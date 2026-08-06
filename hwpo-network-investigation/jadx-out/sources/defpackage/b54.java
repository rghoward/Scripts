package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$1$1", f = "FloatingActionButton.kt", l = {641}, m = "invokeSuspend")
public final class b54 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ h54 u;
    public final /* synthetic */ e54 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b54(h54 h54Var, e54 e54Var, r02<? super b54> r02Var) {
        super(2, r02Var);
        this.u = h54Var;
        this.v = e54Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new b54(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((b54) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            e54 e54Var = this.v;
            float f = e54Var.a;
            float f2 = e54Var.b;
            float f3 = e54Var.d;
            float f4 = e54Var.c;
            this.t = 1;
            h54 h54Var = this.u;
            h54Var.a = f;
            h54Var.b = f2;
            h54Var.c = f3;
            h54Var.d = f4;
            Object objB = h54Var.b(this);
            v72 v72Var = v72.t;
            if (objB != v72Var) {
                objB = g2b.a;
            }
            if (objB == v72Var) {
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
