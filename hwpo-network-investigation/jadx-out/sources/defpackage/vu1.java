package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vu1<T> implements oab<T> {
    public final oh4<iu1, T> a;

    /* JADX WARN: Multi-variable type inference failed */
    public vu1(oh4<? super iu1, ? extends T> oh4Var) {
        this.a = oh4Var;
    }

    @Override // defpackage.oab
    public final T a(kw7 kw7Var) {
        return this.a.invoke(kw7Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vu1) && xj5.a(this.a, ((vu1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ')';
    }
}
