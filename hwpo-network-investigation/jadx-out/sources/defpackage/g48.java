package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.player.presentation.PlayerViewModel$getCurrentLanguage$2", f = "PlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g48 extends p6a implements ci4<s10, r02<? super xd3<? extends Exception, ? extends s10>>, Object> {
    public /* synthetic */ Object t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a = new int[s10.values().length];
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        g48 g48Var = new g48(2, r02Var);
        g48Var.t = obj;
        return g48Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(s10 s10Var, r02<? super xd3<? extends Exception, ? extends s10>> r02Var) {
        return ((g48) create(s10Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        s10 s10Var = (s10) this.t;
        dv8.b(obj);
        return (s10Var == null ? -1 : a.a[s10Var.ordinal()]) == -1 ? new xd3.a(new IllegalStateException("Language can't be null")) : new xd3.b(s10Var);
    }
}
