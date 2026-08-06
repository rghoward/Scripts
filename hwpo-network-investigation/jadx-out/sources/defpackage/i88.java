package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class i88<T> extends sk7<T> {
    public final T t;

    public i88(T t) {
        this.t = t;
    }

    @Override // defpackage.sk7
    public final T a() {
        return this.t;
    }

    @Override // defpackage.sk7
    public final boolean b() {
        return true;
    }

    @Override // defpackage.sk7
    public final Object c(nrc nrcVar) {
        return this.t;
    }

    @Override // defpackage.sk7
    public final T d() {
        return this.t;
    }

    @Override // defpackage.sk7
    public final boolean equals(Object obj) {
        if (obj instanceof i88) {
            return this.t.equals(((i88) obj).t);
        }
        return false;
    }

    @Override // defpackage.sk7
    public final int hashCode() {
        return this.t.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.t + ")";
    }
}
