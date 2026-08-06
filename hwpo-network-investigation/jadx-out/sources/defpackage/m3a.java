package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class m3a extends vx6<o3a> {
    public final mh4<g2b> t;

    public m3a(mh4<g2b> mh4Var) {
        this.t = mh4Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        return new o3a(this.t);
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        ((o3a) cVar).J = this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m3a) {
            return this.t == ((m3a) obj).t;
        }
        return false;
    }

    public final int hashCode() {
        return this.t.hashCode();
    }
}
