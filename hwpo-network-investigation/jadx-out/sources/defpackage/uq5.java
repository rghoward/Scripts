package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class uq5 extends vx6<jr5> {
    public final ei4<hl6, cl6, xx1, gl6> t;

    /* JADX WARN: Multi-variable type inference failed */
    public uq5(ei4<? super hl6, ? super cl6, ? super xx1, ? extends gl6> ei4Var) {
        this.t = ei4Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        jr5 jr5Var = new jr5();
        jr5Var.H = this.t;
        return jr5Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        ((jr5) cVar).H = this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uq5) {
            return this.t == ((uq5) obj).t;
        }
        return false;
    }

    public final int hashCode() {
        return this.t.hashCode();
    }
}
