package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kz9<T> implements wv<T> {
    public final wv<T> a;
    public final long b;

    public kz9(a04 a04Var, long j) {
        this.a = a04Var;
        this.b = j;
    }

    @Override // defpackage.wv
    public final <V extends fw> edb<V> a(cza<T, V> czaVar) {
        return new lz9(this.a.a(czaVar), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kz9)) {
            return false;
        }
        kz9 kz9Var = (kz9) obj;
        return kz9Var.b == this.b && xj5.a(kz9Var.a, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
