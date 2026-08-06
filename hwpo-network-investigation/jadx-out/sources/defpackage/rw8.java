package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rw8 {
    public final long a = uh1.k;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rw8) {
            return uh1.c(this.a, ((rw8) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i = uh1.l;
        return Long.hashCode(this.a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) uh1.i(this.a)) + ", rippleAlpha=null)";
    }
}
