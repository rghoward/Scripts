package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class iqb extends vx6<kqb> {
    public final d13 t;
    public final ci4<kg5, tq5, bg5> u;
    public final Object v;

    public iqb(d13 d13Var, ci4 ci4Var, Object obj) {
        this.t = d13Var;
        this.u = ci4Var;
        this.v = obj;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        kqb kqbVar = new kqb();
        kqbVar.H = this.t;
        kqbVar.I = this.u;
        return kqbVar;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        kqb kqbVar = (kqb) cVar;
        kqbVar.H = this.t;
        kqbVar.I = this.u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iqb.class != obj.getClass()) {
            return false;
        }
        iqb iqbVar = (iqb) obj;
        return this.t == iqbVar.t && xj5.a(this.v, iqbVar.v);
    }

    public final int hashCode() {
        return this.v.hashCode() + uo2.a(this.t.hashCode() * 31, false, 31);
    }
}
