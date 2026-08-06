package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class d64 implements r54<Object> {
    public final /* synthetic */ Object t;

    public d64(Object obj) {
        this.t = obj;
    }

    @Override // defpackage.r54
    public final Object collect(s54<? super Object> s54Var, r02<? super g2b> r02Var) {
        Object objEmit = s54Var.emit(this.t, r02Var);
        return objEmit == v72.t ? objEmit : g2b.a;
    }
}
