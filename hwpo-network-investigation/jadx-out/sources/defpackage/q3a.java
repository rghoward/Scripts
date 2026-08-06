package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q3a extends vx6<r3a> {
    public final eq t = aa7.b;
    public final d53 u;

    public q3a(d53 d53Var) {
        this.u = d53Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        return new r3a(this.t, this.u);
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        r3a r3aVar = (r3a) cVar;
        w48 w48Var = r3aVar.I;
        eq eqVar = this.t;
        if (!xj5.a(w48Var, eqVar)) {
            r3aVar.I = eqVar;
            if (r3aVar.J) {
                r3aVar.e2();
            }
        }
        r3aVar.H = this.u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3a)) {
            return false;
        }
        q3a q3aVar = (q3a) obj;
        return xj5.a(this.t, q3aVar.t) && xj5.a(this.u, q3aVar.u);
    }

    public final int hashCode() {
        int iA = uo2.a(this.t.b * 31, false, 31);
        d53 d53Var = this.u;
        return iA + (d53Var != null ? d53Var.hashCode() : 0);
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + this.t + ", overrideDescendants=false, touchBoundsExpansion=" + this.u + ')';
    }
}
