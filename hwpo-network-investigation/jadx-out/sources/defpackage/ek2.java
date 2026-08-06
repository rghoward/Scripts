package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ek2<T> implements s54 {
    public final /* synthetic */ nz5 t;
    public final /* synthetic */ oh4<Long, g2b> u;
    public final /* synthetic */ i21 v;
    public final /* synthetic */ fg5 w;

    /* JADX WARN: Multi-variable type inference failed */
    public ek2(nz5 nz5Var, oh4<? super Long, g2b> oh4Var, i21 i21Var, fg5 fg5Var) {
        this.t = nz5Var;
        this.u = oh4Var;
        this.v = i21Var;
        this.w = fg5Var;
    }

    @Override // defpackage.s54
    public final Object emit(Object obj, r02 r02Var) {
        ((Number) obj).intValue();
        nz5 nz5Var = this.t;
        int iH = nz5Var.h() / 12;
        int iH2 = (nz5Var.h() % 12) + 1;
        this.u.invoke(new Long(this.v.e(this.w.t + iH, iH2).e));
        return g2b.a;
    }
}
