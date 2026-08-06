package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.navigation.compose.NavHostKt$NavHost$28$1", f = "NavHost.kt", l = {628}, m = "invokeSuspend")
public final class a77 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ w89<r47> u;
    public final /* synthetic */ h37 v;
    public final /* synthetic */ b27 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a77(w89 w89Var, h37 h37Var, b27 b27Var, r02 r02Var) {
        super(2, r02Var);
        this.u = w89Var;
        this.v = h37Var;
        this.w = b27Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new a77(this.u, this.v, this.w, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((a77) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            h37 h37Var = this.v;
            if (((List) h37Var.getValue()).size() > 1) {
                r47 r47Var = (r47) ((List) h37Var.getValue()).get(((List) h37Var.getValue()).size() - 2);
                float fH = this.w.h();
                this.t = 1;
                Object objB = this.u.B(fH, r47Var, this);
                v72 v72Var = v72.t;
                if (objB == v72Var) {
                    return v72Var;
                }
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
