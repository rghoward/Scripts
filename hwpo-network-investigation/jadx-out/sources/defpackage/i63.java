package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class i63<T> extends vx6<k63<T>> {
    public final wj<T> t;
    public final ci4<kg5, xx1, js7<g63<T>, T>> u;
    public final fl7 v = fl7.t;

    public i63(wj wjVar, ci4 ci4Var) {
        this.t = wjVar;
        this.u = ci4Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        k63 k63Var = new k63();
        k63Var.H = this.t;
        k63Var.I = this.u;
        k63Var.J = this.v;
        return k63Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        k63 k63Var = (k63) cVar;
        k63Var.H = this.t;
        k63Var.I = this.u;
        k63Var.J = this.v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i63)) {
            return false;
        }
        i63 i63Var = (i63) obj;
        return xj5.a(this.t, i63Var.t) && this.u == i63Var.u && this.v == i63Var.v;
    }

    public final int hashCode() {
        return this.v.hashCode() + ((this.u.hashCode() + (this.t.hashCode() * 31)) * 31);
    }
}
