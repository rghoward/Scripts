package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.animation.core.TransitionKt$rememberTransition$1$1$snapshotStateObserver$1$1", f = "Transition.kt", l = {}, m = "invokeSuspend", v = 1)
public final class jwa extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public final /* synthetic */ mh4<g2b> t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwa(mh4<g2b> mh4Var, r02<? super jwa> r02Var) {
        super(2, r02Var);
        this.t = mh4Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new jwa(this.t, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((jwa) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        this.t.invoke();
        return g2b.a;
    }
}
