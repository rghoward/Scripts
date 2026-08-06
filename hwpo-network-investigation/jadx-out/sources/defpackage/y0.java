package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class y0 implements h72.a {
    public final h72.b<?> t;

    public y0(h72.b<?> bVar) {
        this.t = bVar;
    }

    @Override // defpackage.h72
    public final Object J(ci4 ci4Var, Object obj) {
        return ci4Var.invoke(obj, this);
    }

    @Override // defpackage.h72
    public /* bridge */ h72 N(h72.b<?> bVar) {
        return h72.a.C0100a.b(this, bVar);
    }

    @Override // defpackage.h72
    public final /* bridge */ h72 c0(h72 h72Var) {
        return h72.a.C0100a.c(this, h72Var);
    }

    @Override // defpackage.h72
    public /* bridge */ <E extends h72.a> E d0(h72.b<E> bVar) {
        return (E) h72.a.C0100a.a(this, bVar);
    }

    @Override // h72.a
    public final h72.b<?> getKey() {
        return this.t;
    }
}
