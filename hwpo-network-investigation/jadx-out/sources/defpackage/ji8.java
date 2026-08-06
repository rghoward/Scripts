package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ji8<T> implements zl9<T>, r54, ri4<T> {
    private final el5 job;
    public final /* synthetic */ zl9<T> t;

    public ji8(zl9 zl9Var, dz9 dz9Var) {
        this.t = zl9Var;
        this.job = dz9Var;
    }

    @Override // defpackage.zl9
    public final List<T> a() {
        return this.t.a();
    }

    @Override // defpackage.ri4
    public final r54<T> b(h72 h72Var, int i, xx0 xx0Var) {
        return ty1.f(this, h72Var, i, xx0Var);
    }

    @Override // defpackage.r54
    public final Object collect(s54<? super T> s54Var, r02<?> r02Var) {
        return this.t.collect(s54Var, r02Var);
    }
}
