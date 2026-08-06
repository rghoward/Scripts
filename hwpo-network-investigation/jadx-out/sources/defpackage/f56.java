package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class f56 extends vx6<h56> {
    public final n56 t;
    public final u56 u;
    public final qga v;

    public f56(n56 n56Var, u56 u56Var, qga qgaVar) {
        this.t = n56Var;
        this.u = u56Var;
        this.v = qgaVar;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        return new h56(this.t, this.u, this.v);
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) throws Throwable {
        h56 h56Var = (h56) cVar;
        if (h56Var.G) {
            ((zo) h56Var.H).d();
            h56Var.H.j(h56Var);
        }
        n56 n56Var = this.t;
        h56Var.H = n56Var;
        if (h56Var.G) {
            if (n56Var.a != null) {
                xc5.c("Expected textInputModifierNode to be null");
            }
            n56Var.a = h56Var;
        }
        h56Var.I = this.u;
        h56Var.J = this.v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f56)) {
            return false;
        }
        f56 f56Var = (f56) obj;
        return xj5.a(this.t, f56Var.t) && xj5.a(this.u, f56Var.u) && xj5.a(this.v, f56Var.v);
    }

    public final int hashCode() {
        return this.v.hashCode() + ((this.u.hashCode() + (this.t.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.t + ", legacyTextFieldState=" + this.u + ", textFieldSelectionManager=" + this.v + ')';
    }
}
