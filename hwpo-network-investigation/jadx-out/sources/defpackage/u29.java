package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u29 implements i19<Object, Object> {
    public final /* synthetic */ ci4<k19, Object, Object> t;
    public final /* synthetic */ oh4<Object, Object> u;

    /* JADX WARN: Multi-variable type inference failed */
    public u29(ci4<? super k19, Object, Object> ci4Var, oh4<Object, Object> oh4Var) {
        this.t = ci4Var;
        this.u = oh4Var;
    }

    @Override // defpackage.i19
    public final Object a(Object obj) {
        return this.u.invoke(obj);
    }

    @Override // defpackage.i19
    public final Object c(k19 k19Var, Object obj) {
        return this.t.invoke(k19Var, obj);
    }
}
