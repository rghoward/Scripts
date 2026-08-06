package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ft3<T> {
    public final T a;
    public final fr1 b;

    /* JADX WARN: Multi-variable type inference failed */
    public ft3(ms9 ms9Var, fr1 fr1Var) {
        this.a = ms9Var;
        this.b = fr1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ft3) {
            ft3 ft3Var = (ft3) obj;
            return xj5.a(this.a, ft3Var.a) && this.b == ft3Var.b;
        }
        return false;
    }

    public final int hashCode() {
        T t = this.a;
        return this.b.hashCode() + ((t == null ? 0 : t.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.a + ", transition=" + this.b + ')';
    }
}
