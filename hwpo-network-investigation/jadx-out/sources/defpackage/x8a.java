package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$processTapGesture$3", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
public final class x8a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public final /* synthetic */ m88 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8a(m88 m88Var, r02<? super x8a> r02Var) {
        super(2, r02Var);
        this.t = m88Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new x8a(this.t, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((x8a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        this.t.f();
        return g2b.a;
    }
}
