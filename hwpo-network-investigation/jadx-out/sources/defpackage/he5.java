package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class he5 extends vx6<je5> {
    public final omb t;

    public he5(omb ombVar) {
        this.t = ombVar;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        return new je5(this.t);
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        je5 je5Var = (je5) cVar;
        omb ombVar = je5Var.J;
        omb ombVar2 = this.t;
        if (xj5.a(ombVar2, ombVar)) {
            return;
        }
        je5Var.J = ombVar2;
        je5Var.d2();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof he5) {
            return xj5.a(((he5) obj).t, this.t);
        }
        return false;
    }

    public final int hashCode() {
        return this.t.hashCode();
    }
}
