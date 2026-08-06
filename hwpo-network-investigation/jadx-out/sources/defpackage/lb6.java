package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lb6 implements fi8 {
    public final /* synthetic */ k27<Object> a;

    public lb6(k27<Object> k27Var) {
        this.a = k27Var;
    }

    @Override // defpackage.fi8
    public final Object a(Object obj, ho5<?> ho5Var) {
        obj.getClass();
        ho5Var.getClass();
        Object objD = this.a.d();
        if (objD != null) {
            return objD;
        }
        aa0.c("Required value was null.");
        return null;
    }
}
