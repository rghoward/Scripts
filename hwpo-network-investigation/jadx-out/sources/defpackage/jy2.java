package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jy2 {
    public final hy2 a = new hy2();
    public final hy2 b = new hy2();
    public final hy2 c = new hy2();

    public final void a(qr5 qr5Var, jk5 jk5Var) {
        int iOrdinal = jk5Var.ordinal();
        hy2 hy2Var = this.a;
        hy2 hy2Var2 = this.c;
        if (iOrdinal == 0) {
            hy2Var.a(qr5Var);
            hy2Var2.a(qr5Var);
            return;
        }
        hy2 hy2Var3 = this.b;
        if (iOrdinal == 1) {
            hy2Var3.a(qr5Var);
            hy2Var2.a(qr5Var);
            return;
        }
        if (iOrdinal == 2) {
            if (qr5Var.A != null) {
                hy2Var2.a(qr5Var);
                return;
            } else {
                hy2Var.a(qr5Var);
                return;
            }
        }
        if (iOrdinal != 3) {
            u.b();
        } else if (qr5Var.A != null) {
            hy2Var2.a(qr5Var);
        } else {
            hy2Var3.a(qr5Var);
        }
    }

    public final boolean b(qr5 qr5Var) {
        return !(qr5Var.A == null) && (this.a.a.contains(qr5Var) || this.b.a.contains(qr5Var));
    }

    public final boolean c() {
        return !(this.a.a.isEmpty() && this.c.a.isEmpty() && this.b.a.isEmpty());
    }
}
