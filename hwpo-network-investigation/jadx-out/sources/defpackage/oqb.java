package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$2$2$1", f = "Wrapper.android.kt", l = {128}, m = "invokeSuspend", v = 1)
public final class oqb extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ qqb u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqb(qqb qqbVar, r02<? super oqb> r02Var) {
        super(2, r02Var);
        this.u = qqbVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new oqb(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((oqb) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            cm cmVar = this.u.t;
            this.t = 1;
            Object objA = cmVar.T.a(this);
            v72 v72Var = v72.t;
            if (objA != v72Var) {
                objA = g2b.a;
            }
            if (objA == v72Var) {
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
