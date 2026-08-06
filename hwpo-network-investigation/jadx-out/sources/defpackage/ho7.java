package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class ho7 extends vx6<io7> {
    public final go7 t;

    public ho7(go7 go7Var) {
        this.t = go7Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        io7 io7Var = new io7();
        io7Var.J = this.t;
        return io7Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        io7 io7Var = (io7) cVar;
        go7 go7Var = io7Var.J;
        go7 go7Var2 = this.t;
        if (xj5.a(go7Var2, go7Var)) {
            return;
        }
        io7Var.J = go7Var2;
        io7Var.d2();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ho7) {
            return xj5.a(((ho7) obj).t, this.t);
        }
        return false;
    }

    public final int hashCode() {
        return this.t.hashCode();
    }
}
