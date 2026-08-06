package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vab implements omb {
    public final String a;
    public final dt7 b;

    public vab(le5 le5Var, String str) {
        this.a = str;
        this.b = bl7.i(le5Var);
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
    public final le5 e() {
        return (le5) this.b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vab) {
            return xj5.a(e(), ((vab) obj).e());
        }
        return false;
    }

    public final void f(le5 le5Var) {
        this.b.setValue(le5Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("(left=");
        sb.append(e().a);
        sb.append(", top=");
        sb.append(e().b);
        sb.append(", right=");
        sb.append(e().c);
        sb.append(", bottom=");
        return e44.a(sb, e().d, ')');
    }
}
