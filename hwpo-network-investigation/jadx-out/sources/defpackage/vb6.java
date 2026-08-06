package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vb6 {
    public static final vb6 d;
    public final ub6 a;
    public final ub6 b;
    public final ub6 c;

    static {
        ub6.c cVar = ub6.c.c;
        d = new vb6(cVar, cVar, cVar);
    }

    public vb6(ub6 ub6Var, ub6 ub6Var2, ub6 ub6Var3) {
        ub6Var.getClass();
        ub6Var2.getClass();
        ub6Var3.getClass();
        this.a = ub6Var;
        this.b = ub6Var2;
        this.c = ub6Var3;
    }

    public static vb6 a(vb6 vb6Var, int i) {
        int i2 = i & 1;
        ub6 ub6Var = ub6.c.c;
        ub6 ub6Var2 = i2 != 0 ? vb6Var.a : ub6Var;
        ub6 ub6Var3 = (i & 2) != 0 ? vb6Var.b : ub6Var;
        if ((i & 4) != 0) {
            ub6Var = vb6Var.c;
        }
        ub6Var2.getClass();
        ub6Var3.getClass();
        ub6Var.getClass();
        return new vb6(ub6Var2, ub6Var3, ub6Var);
    }

    public final vb6 b(wb6 wb6Var) {
        wb6Var.getClass();
        int iOrdinal = wb6Var.ordinal();
        if (iOrdinal == 0) {
            return a(this, 6);
        }
        if (iOrdinal == 1) {
            return a(this, 5);
        }
        if (iOrdinal == 2) {
            return a(this, 3);
        }
        u.b();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb6)) {
            return false;
        }
        vb6 vb6Var = (vb6) obj;
        return xj5.a(this.a, vb6Var.a) && xj5.a(this.b, vb6Var.b) && xj5.a(this.c, vb6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LoadStates(refresh=" + this.a + ", prepend=" + this.b + ", append=" + this.c + ')';
    }
}
