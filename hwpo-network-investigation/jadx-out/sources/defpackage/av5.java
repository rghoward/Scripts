package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.lazy.grid.LazyGridState$scrollToItem$2", f = "LazyGridState.kt", l = {}, m = "invokeSuspend", v = 1)
public final class av5 extends p6a implements ci4<t69, r02<? super g2b>, Object> {
    public final /* synthetic */ zu5 t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av5(zu5 zu5Var, int i, r02 r02Var) {
        super(2, r02Var);
        this.t = zu5Var;
        this.u = i;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new av5(this.t, this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t69 t69Var, r02<? super g2b> r02Var) {
        return ((av5) create(t69Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        zu5 zu5Var = this.t;
        mu5 mu5Var = zu5Var.d;
        int iK = mu5Var.a.k();
        int i = this.u;
        if (iK != i || mu5Var.b.k() != 0) {
            vv5<hu5> vv5Var = zu5Var.m;
            vv5Var.e();
            vv5Var.b = null;
            vv5Var.c = -1;
            xr2 xr2Var = zu5Var.a;
        }
        mu5Var.a(i, 0);
        mu5Var.d = null;
        fm8 fm8Var = zu5Var.j;
        if (fm8Var != null) {
            fm8Var.i();
        }
        return g2b.a;
    }
}
