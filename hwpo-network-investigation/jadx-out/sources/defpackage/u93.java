package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u93<T> extends hf8<T> {
    public final wu9<T> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u93(mh4 mh4Var) {
        super(mh4Var);
        d3a d3aVar = d3a.u;
        this.b = d3aVar;
    }

    @Override // defpackage.hf8
    public final kf8<T> a(T t) {
        return new kf8<>(this, t, t == null, this.b, true);
    }
}
