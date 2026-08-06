package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mt implements omb {
    public final int a;
    public final String b;
    public final dt7 c = bl7.i(xd5.e);
    public final dt7 d = bl7.i(Boolean.TRUE);

    public mt(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.omb
    public final int a(tx2 tx2Var) {
        return e().b;
    }

    @Override // defpackage.omb
    public final int b(tx2 tx2Var, tq5 tq5Var) {
        return e().c;
    }

    @Override // defpackage.omb
    public final int c(tx2 tx2Var) {
        return e().d;
    }

    @Override // defpackage.omb
    public final int d(tx2 tx2Var, tq5 tq5Var) {
        return e().a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final xd5 e() {
        return (xd5) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mt) {
            return this.a == ((mt) obj).a;
        }
        return false;
    }

    public final void f(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }

    public final void g(umb umbVar, int i) {
        int i2 = this.a;
        if (i == 0 || (i & i2) != 0) {
            this.c.setValue(umbVar.a.i(i2));
            f(umbVar.a.u(i2));
        }
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append('(');
        sb.append(e().a);
        sb.append(", ");
        sb.append(e().b);
        sb.append(", ");
        sb.append(e().c);
        sb.append(", ");
        return e44.a(sb, e().d, ')');
    }
}
