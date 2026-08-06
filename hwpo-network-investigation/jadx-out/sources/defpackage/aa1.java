package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class aa1<T> extends z91<T, T> {
    public aa1(r54 r54Var, h72 h72Var, int i, xx0 xx0Var, int i2) {
        super((i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? xx0.t : xx0Var, (i2 & 2) != 0 ? ff3.t : h72Var, r54Var);
    }

    @Override // defpackage.u91
    public final u91<T> j(h72 h72Var, int i, xx0 xx0Var) {
        return new aa1(i, xx0Var, h72Var, this.w);
    }

    @Override // defpackage.u91
    public final r54<T> k() {
        return (r54<T>) this.w;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.z91
    public final Object m(s54<? super T> s54Var, r02<? super g2b> r02Var) {
        Object objCollect = this.w.collect((s54<? super S>) s54Var, r02Var);
        return objCollect == v72.t ? objCollect : g2b.a;
    }
}
