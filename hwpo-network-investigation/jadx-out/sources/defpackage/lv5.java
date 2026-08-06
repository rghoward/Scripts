package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class lv5 extends vx6<ov5> {
    public final pv5 t;
    public final kv5 u;
    public final fl7 v;

    public lv5(pv5 pv5Var, kv5 kv5Var, fl7 fl7Var) {
        this.t = pv5Var;
        this.u = kv5Var;
        this.v = fl7Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        ov5 ov5Var = new ov5();
        ov5Var.H = this.t;
        ov5Var.I = this.u;
        ov5Var.J = this.v;
        return ov5Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        ov5 ov5Var = (ov5) cVar;
        ov5Var.H = this.t;
        ov5Var.I = this.u;
        ov5Var.J = this.v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lv5)) {
            return false;
        }
        lv5 lv5Var = (lv5) obj;
        return xj5.a(this.t, lv5Var.t) && xj5.a(this.u, lv5Var.u) && this.v == lv5Var.v;
    }

    public final int hashCode() {
        return this.v.hashCode() + uo2.a((this.u.hashCode() + (this.t.hashCode() * 31)) * 31, false, 31);
    }
}
