package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class cda extends vx6<eda> {
    public final mqa t;
    public final jga u;
    public final kga v;
    public final hga w;

    public cda(mqa mqaVar, jga jgaVar, kga kgaVar, hga hgaVar) {
        this.t = mqaVar;
        this.u = jgaVar;
        this.v = kgaVar;
        this.w = hgaVar;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        return new eda(this.t, this.u, this.v, this.w);
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        eda edaVar = (eda) cVar;
        edaVar.J.a = null;
        mqa mqaVar = this.t;
        edaVar.J = mqaVar;
        mqaVar.a = edaVar;
        mqaVar.b = edaVar.G ? lqa.v : lqa.u;
        edaVar.K = this.u;
        edaVar.L = this.v;
        edaVar.M = this.w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cda)) {
            return false;
        }
        cda cdaVar = (cda) obj;
        return this.t == cdaVar.t && this.u == cdaVar.u && this.v == cdaVar.v && this.w == cdaVar.w;
    }

    public final int hashCode() {
        int iHashCode = this.t.hashCode() * 31;
        jga jgaVar = this.u;
        int iHashCode2 = (iHashCode + (jgaVar != null ? jgaVar.hashCode() : 0)) * 31;
        kga kgaVar = this.v;
        return hashCode() + ((iHashCode2 + (kgaVar != null ? kgaVar.hashCode() : 0)) * 31);
    }
}
