package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u48 extends vx6<v48> {
    public final eq t;

    public u48(eq eqVar) {
        this.t = eqVar;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        return new v48(this.t);
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        v48 v48Var = (v48) cVar;
        w48 w48Var = v48Var.I;
        eq eqVar = this.t;
        if (xj5.a(w48Var, eqVar)) {
            return;
        }
        v48Var.I = eqVar;
        if (v48Var.J) {
            v48Var.e2();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u48) && xj5.a(this.t, ((u48) obj).t);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.t.hashCode() * 31);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.t + ", overrideDescendants=false)";
    }
}
