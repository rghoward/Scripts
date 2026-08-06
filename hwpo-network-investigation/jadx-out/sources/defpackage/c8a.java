package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class c8a extends vx6<d8a> {
    public final oh4<fnb, omb> t;

    public c8a(oh4 oh4Var) {
        this.t = oh4Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        d8a d8aVar = new d8a(gnb.a);
        d8aVar.K = this.t;
        return d8aVar;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        d8a d8aVar = (d8a) cVar;
        oh4<? super fnb, ? extends omb> oh4Var = d8aVar.K;
        oh4<fnb, omb> oh4Var2 = this.t;
        if (oh4Var != oh4Var2) {
            d8aVar.K = oh4Var2;
            fnb fnbVar = d8aVar.L;
            if (fnbVar != null) {
                omb ombVarInvoke = oh4Var2.invoke(fnbVar);
                if (xj5.a(ombVarInvoke, d8aVar.J)) {
                    return;
                }
                d8aVar.J = ombVarInvoke;
                d8aVar.d2();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c8a) {
            return this.t == ((c8a) obj).t;
        }
        return false;
    }

    public final int hashCode() {
        return this.t.hashCode();
    }
}
