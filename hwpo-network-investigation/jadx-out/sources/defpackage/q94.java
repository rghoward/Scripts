package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class q94 extends vx6<t94> {
    public final p94 t;

    public q94(p94 p94Var) {
        this.t = p94Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        t94 t94Var = new t94();
        t94Var.H = this.t;
        return t94Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        t94 t94Var = (t94) cVar;
        t94Var.H.a.n(t94Var);
        p94 p94Var = this.t;
        t94Var.H = p94Var;
        p94Var.a.d(t94Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q94) && xj5.a(this.t, ((q94) obj).t);
    }

    public final int hashCode() {
        return this.t.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.t + ')';
    }
}
