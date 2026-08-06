package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.datastore.core.MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1", f = "MultiProcessCoordinator.android.kt", l = {}, m = "invokeSuspend", v = 1)
public final class r07 extends p6a implements ci4<t72, r02<? super Integer>, Object> {
    public final /* synthetic */ q07 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r07(q07 q07Var, r02 r02Var) {
        super(2, r02Var);
        this.t = q07Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new r07(this.t, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super Integer> r02Var) {
        return ((r07) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        return new Integer(((xl9) this.t.i.getValue()).getValue());
    }
}
