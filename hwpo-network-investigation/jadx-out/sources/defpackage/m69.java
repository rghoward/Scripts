package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2", f = "ScrollExtensions.kt", l = {}, m = "invokeSuspend", v = 1)
public final class m69 extends p6a implements ci4<t69, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ dl8 u;
    public final /* synthetic */ float v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m69(dl8 dl8Var, float f, r02<? super m69> r02Var) {
        super(2, r02Var);
        this.u = dl8Var;
        this.v = f;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        m69 m69Var = new m69(this.u, this.v, r02Var);
        m69Var.t = obj;
        return m69Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(t69 t69Var, r02<? super g2b> r02Var) {
        return ((m69) create(t69Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        this.u.t = ((t69) this.t).f(this.v);
        return g2b.a;
    }
}
