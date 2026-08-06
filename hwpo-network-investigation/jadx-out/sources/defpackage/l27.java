package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l27 {
    public ub6 a;
    public ub6 b;
    public ub6 c;

    public l27() {
        ub6.c cVar = ub6.c.c;
        this.a = cVar;
        this.b = cVar;
        this.c = cVar;
    }

    public final ub6 a(wb6 wb6Var) {
        wb6Var.getClass();
        int iOrdinal = wb6Var.ordinal();
        if (iOrdinal == 0) {
            return this.a;
        }
        if (iOrdinal == 1) {
            return this.b;
        }
        if (iOrdinal == 2) {
            return this.c;
        }
        u.b();
        return null;
    }

    public final void b(vb6 vb6Var) {
        vb6Var.getClass();
        this.a = vb6Var.a;
        this.c = vb6Var.c;
        this.b = vb6Var.b;
    }

    public final void c(wb6 wb6Var, ub6 ub6Var) {
        wb6Var.getClass();
        ub6Var.getClass();
        int iOrdinal = wb6Var.ordinal();
        if (iOrdinal == 0) {
            this.a = ub6Var;
            return;
        }
        if (iOrdinal == 1) {
            this.b = ub6Var;
        } else if (iOrdinal == 2) {
            this.c = ub6Var;
        } else {
            u.b();
        }
    }

    public final vb6 d() {
        return new vb6(this.a, this.b, this.c);
    }
}
