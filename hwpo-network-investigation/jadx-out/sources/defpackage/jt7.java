package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jt7 extends vx6<it7> {
    public final fn0 t;

    public jt7(fn0 fn0Var) {
        this.t = fn0Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        return new it7(this.t);
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        it7 it7Var = (it7) cVar;
        it7Var.H = this.t;
        ew2.f(it7Var).R();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jt7) {
            return this.t == ((jt7) obj).t;
        }
        return false;
    }

    public final int hashCode() {
        return hashCode();
    }
}
