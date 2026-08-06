package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend", v = 1)
public final class hk8 extends p6a implements ci4<gk8.d, r02<? super Boolean>, Object> {
    public /* synthetic */ Object t;

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        hk8 hk8Var = new hk8(2, r02Var);
        hk8Var.t = obj;
        return hk8Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(gk8.d dVar, r02<? super Boolean> r02Var) {
        return ((hk8) create(dVar, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        return Boolean.valueOf(((gk8.d) this.t) == gk8.d.t);
    }
}
