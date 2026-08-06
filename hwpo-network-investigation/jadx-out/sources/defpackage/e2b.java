package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class e2b extends vx6<f2b> {
    public final j34 t;

    public e2b(j34 j34Var) {
        this.t = j34Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        f2b f2bVar = new f2b();
        f2bVar.J = this.t;
        return f2bVar;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        f2b f2bVar = (f2b) cVar;
        j34 j34Var = f2bVar.J;
        j34 j34Var2 = this.t;
        if (xj5.a(j34Var2, j34Var)) {
            return;
        }
        f2bVar.J = j34Var2;
        f2bVar.d2();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e2b) {
            return xj5.a(((e2b) obj).t, this.t);
        }
        return false;
    }

    public final int hashCode() {
        return this.t.hashCode();
    }
}
