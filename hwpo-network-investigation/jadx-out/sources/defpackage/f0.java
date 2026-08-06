package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class f0<T> extends sk7<T> {
    public static final f0<Object> t = new f0<>();

    @Override // defpackage.sk7
    public final T a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.sk7
    public final boolean b() {
        return false;
    }

    @Override // defpackage.sk7
    public final Object c(nrc nrcVar) {
        return nrcVar.get();
    }

    @Override // defpackage.sk7
    public final T d() {
        return null;
    }

    @Override // defpackage.sk7
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // defpackage.sk7
    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
