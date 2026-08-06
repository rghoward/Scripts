package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d4b implements h72.a {
    public final d4b t;
    public final xf2<?> u;

    public d4b(d4b d4bVar, xf2<?> xf2Var) {
        this.t = d4bVar;
        this.u = xf2Var;
    }

    @Override // defpackage.h72
    public final Object J(ci4 ci4Var, Object obj) {
        return ci4Var.invoke(obj, this);
    }

    @Override // defpackage.h72
    public final /* bridge */ h72 N(h72.b<?> bVar) {
        return h72.a.C0100a.b(this, bVar);
    }

    public final void a(xf2 xf2Var) {
        if (this.u == xf2Var) {
            aa0.c("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
            return;
        }
        d4b d4bVar = this.t;
        if (d4bVar != null) {
            d4bVar.a(xf2Var);
        }
    }

    @Override // defpackage.h72
    public final /* bridge */ h72 c0(h72 h72Var) {
        return h72.a.C0100a.c(this, h72Var);
    }

    @Override // defpackage.h72
    public final /* bridge */ <E extends h72.a> E d0(h72.b<E> bVar) {
        return (E) h72.a.C0100a.a(this, bVar);
    }

    @Override // h72.a
    public final h72.b<?> getKey() {
        return c4b.t;
    }
}
