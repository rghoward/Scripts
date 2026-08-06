package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class li8<T> implements zz9<T>, r54, ri4<T> {
    private final el5 job;
    public final /* synthetic */ a0a t;

    public li8(a0a a0aVar, dz9 dz9Var) {
        this.t = a0aVar;
        this.job = dz9Var;
    }

    @Override // defpackage.zl9
    public final List<T> a() {
        return this.t.a();
    }

    @Override // defpackage.ri4
    public final r54<T> b(h72 h72Var, int i, xx0 xx0Var) {
        return (((i < 0 || i >= 2) && i != -2) || xx0Var != xx0.u) ? ty1.f(this, h72Var, i, xx0Var) : this;
    }

    @Override // defpackage.r54
    public final Object collect(s54<? super T> s54Var, r02<?> r02Var) throws Throwable {
        this.t.collect(s54Var, r02Var);
        return v72.t;
    }

    @Override // defpackage.zz9
    public final T getValue() {
        return (T) this.t.getValue();
    }
}
