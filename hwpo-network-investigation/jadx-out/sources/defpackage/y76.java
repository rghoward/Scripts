package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class y76 implements omb {
    public final omb a;
    public final int b;

    public y76(omb ombVar, int i) {
        this.a = ombVar;
        this.b = i;
    }

    @Override // defpackage.omb
    public final int a(tx2 tx2Var) {
        if ((this.b & 16) != 0) {
            return this.a.a(tx2Var);
        }
        return 0;
    }

    @Override // defpackage.omb
    public final int b(tx2 tx2Var, tq5 tq5Var) {
        if (((tq5Var == tq5.t ? 4 : 1) & this.b) != 0) {
            return this.a.b(tx2Var, tq5Var);
        }
        return 0;
    }

    @Override // defpackage.omb
    public final int c(tx2 tx2Var) {
        if ((this.b & 32) != 0) {
            return this.a.c(tx2Var);
        }
        return 0;
    }

    @Override // defpackage.omb
    public final int d(tx2 tx2Var, tq5 tq5Var) {
        if (((tq5Var == tq5.t ? 8 : 2) & this.b) != 0) {
            return this.a.d(tx2Var, tq5Var);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y76)) {
            return false;
        }
        y76 y76Var = (y76) obj;
        return xj5.a(this.a, y76Var.a) && this.b == y76Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i = this.b;
        int i2 = h4c.a;
        if ((i & i2) == i2) {
            h4c.a("Start", sb3);
        }
        int i3 = h4c.c;
        if ((i & i3) == i3) {
            h4c.a("Left", sb3);
        }
        if ((i & 16) == 16) {
            h4c.a("Top", sb3);
        }
        int i4 = h4c.b;
        if ((i & i4) == i4) {
            h4c.a("End", sb3);
        }
        int i5 = h4c.d;
        if ((i & i5) == i5) {
            h4c.a("Right", sb3);
        }
        if ((i & 32) == 32) {
            h4c.a("Bottom", sb3);
        }
        sb2.append(sb3.toString());
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
