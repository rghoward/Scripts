package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.animation.core.Animatable$stop$2", f = "Animatable.kt", l = {}, m = "invokeSuspend", v = 1)
public final class rt extends p6a implements oh4<r02<? super g2b>, Object> {
    public final /* synthetic */ qt<Object, fw> t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt(qt<Object, fw> qtVar, r02<? super rt> r02Var) {
        super(1, r02Var);
        this.t = qtVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(r02<?> r02Var) {
        return new rt(this.t, r02Var);
    }

    @Override // defpackage.oh4
    public final Object invoke(r02<? super g2b> r02Var) {
        return ((rt) create(r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        qt.b(this.t);
        return g2b.a;
    }
}
