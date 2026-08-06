package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.paging.SuspendingPagingSourceFactory$create$2", f = "SuspendingPagingSourceFactory.jvmAndAndroid.kt", l = {}, m = "invokeSuspend", v = 1)
public final class r6a extends p6a implements ci4<t72, r02<? super zr7<Object, Object>>, Object> {
    public final /* synthetic */ s6a<Object, Object> t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6a(s6a<Object, Object> s6aVar, r02<? super r6a> r02Var) {
        super(2, r02Var);
        this.t = s6aVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new r6a(this.t, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super zr7<Object, Object>> r02Var) throws Throwable {
        ((r6a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        throw null;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        this.t.getClass();
        throw null;
    }
}
