package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class qo5 extends vx6<to5> {
    public final oh4<no5, Boolean> t;
    public final oh4<no5, Boolean> u;

    /* JADX WARN: Multi-variable type inference failed */
    public qo5(oh4<? super no5, Boolean> oh4Var, oh4<? super no5, Boolean> oh4Var2) {
        this.t = oh4Var;
        this.u = oh4Var2;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        to5 to5Var = new to5();
        to5Var.H = this.t;
        to5Var.I = this.u;
        return to5Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        to5 to5Var = (to5) cVar;
        to5Var.H = this.t;
        to5Var.I = this.u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qo5)) {
            return false;
        }
        qo5 qo5Var = (qo5) obj;
        return this.t == qo5Var.t && this.u == qo5Var.u;
    }

    public final int hashCode() {
        oh4<no5, Boolean> oh4Var = this.t;
        int iHashCode = (oh4Var != null ? oh4Var.hashCode() : 0) * 31;
        oh4<no5, Boolean> oh4Var2 = this.u;
        return iHashCode + (oh4Var2 != null ? oh4Var2.hashCode() : 0);
    }
}
