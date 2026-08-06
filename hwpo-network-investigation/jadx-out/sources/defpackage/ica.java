package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class ica extends vx6<kca> {
    public final iga t;

    public ica(iga igaVar) {
        this.t = igaVar;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        return new kca(this.t);
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        ((kca) cVar).J = this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ica) {
            return this.t == ((ica) obj).t;
        }
        return false;
    }

    public final int hashCode() {
        iga igaVar = this.t;
        if (igaVar != null) {
            return igaVar.hashCode();
        }
        return 0;
    }
}
