package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class lt7 extends vx6<nt7> {
    public final float t;
    public final yz9<Integer> u;
    public final yz9<Integer> v;

    public lt7(bt7 bt7Var, bt7 bt7Var2, int i) {
        bt7Var = (i & 2) != 0 ? null : bt7Var;
        bt7Var2 = (i & 4) != 0 ? null : bt7Var2;
        this.t = 1.0f;
        this.u = bt7Var;
        this.v = bt7Var2;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        nt7 nt7Var = new nt7();
        nt7Var.H = this.t;
        nt7Var.I = this.u;
        nt7Var.J = this.v;
        return nt7Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        nt7 nt7Var = (nt7) cVar;
        nt7Var.H = this.t;
        nt7Var.I = this.u;
        nt7Var.J = this.v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt7)) {
            return false;
        }
        lt7 lt7Var = (lt7) obj;
        return this.t == lt7Var.t && xj5.a(this.u, lt7Var.u) && xj5.a(this.v, lt7Var.v);
    }

    public final int hashCode() {
        yz9<Integer> yz9Var = this.u;
        int iHashCode = (yz9Var != null ? yz9Var.hashCode() : 0) * 31;
        yz9<Integer> yz9Var2 = this.v;
        return Float.hashCode(this.t) + ((iHashCode + (yz9Var2 != null ? yz9Var2.hashCode() : 0)) * 31);
    }
}
