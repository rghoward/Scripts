package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class xg3 extends vx6<sh3> {
    public final lo4 A;
    public final tva<wg3> t;
    public final tva<wg3>.a<kg5, cw> u;
    public final tva<wg3>.a<bg5, cw> v;
    public final tva<wg3>.a<bg5, cw> w;
    public final th3 x;
    public final jo3 y;
    public final mh4<Boolean> z;

    public xg3(tva<wg3> tvaVar, tva<wg3>.a<kg5, cw> aVar, tva<wg3>.a<bg5, cw> aVar2, tva<wg3>.a<bg5, cw> aVar3, th3 th3Var, jo3 jo3Var, mh4<Boolean> mh4Var, lo4 lo4Var) {
        this.t = tvaVar;
        this.u = aVar;
        this.v = aVar2;
        this.w = aVar3;
        this.x = th3Var;
        this.y = jo3Var;
        this.z = mh4Var;
        this.A = lo4Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        return new sh3(this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A);
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        sh3 sh3Var = (sh3) cVar;
        sh3Var.H = this.t;
        sh3Var.I = this.u;
        sh3Var.J = this.v;
        sh3Var.K = this.w;
        sh3Var.L = this.x;
        sh3Var.M = this.y;
        sh3Var.N = this.z;
        sh3Var.O = this.A;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xg3)) {
            return false;
        }
        xg3 xg3Var = (xg3) obj;
        return xj5.a(xg3Var.t, this.t) && xj5.a(xg3Var.u, this.u) && xj5.a(xg3Var.v, this.v) && xj5.a(xg3Var.w, this.w) && xj5.a(xg3Var.x, this.x) && xj5.a(xg3Var.y, this.y) && xg3Var.z == this.z && xj5.a(xg3Var.A, this.A);
    }

    public final int hashCode() {
        int iHashCode = this.t.hashCode() * 31;
        tva<wg3>.a<kg5, cw> aVar = this.u;
        int iHashCode2 = (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        tva<wg3>.a<bg5, cw> aVar2 = this.v;
        int iHashCode3 = (iHashCode2 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        tva<wg3>.a<bg5, cw> aVar3 = this.w;
        return this.A.hashCode() + ((this.z.hashCode() + ((this.y.hashCode() + ((this.x.hashCode() + ((iHashCode3 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
