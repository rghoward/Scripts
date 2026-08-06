package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jj1 {
    public final ub6 a;
    public final ub6 b;
    public final ub6 c;
    public final vb6 d;
    public final vb6 e;

    public jj1(ub6 ub6Var, ub6 ub6Var2, ub6 ub6Var3, vb6 vb6Var, vb6 vb6Var2) {
        ub6Var.getClass();
        ub6Var2.getClass();
        ub6Var3.getClass();
        vb6Var.getClass();
        this.a = ub6Var;
        this.b = ub6Var2;
        this.c = ub6Var3;
        this.d = vb6Var;
        this.e = vb6Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jj1.class != obj.getClass()) {
            return false;
        }
        jj1 jj1Var = (jj1) obj;
        return xj5.a(this.a, jj1Var.a) && xj5.a(this.b, jj1Var.b) && xj5.a(this.c, jj1Var.c) && xj5.a(this.d, jj1Var.d) && xj5.a(this.e, jj1Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        vb6 vb6Var = this.e;
        return iHashCode + (vb6Var != null ? vb6Var.hashCode() : 0);
    }

    public final String toString() {
        return "CombinedLoadStates(refresh=" + this.a + ", prepend=" + this.b + ", append=" + this.c + ", source=" + this.d + ", mediator=" + this.e + ')';
    }
}
