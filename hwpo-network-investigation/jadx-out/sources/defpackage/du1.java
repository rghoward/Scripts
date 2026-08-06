package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class du1 implements bu1, hk7, h72.a {
    public static final a u = new a();
    public final bj4 t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements h72.b<du1> {
        public final String toString() {
            return "CompositionErrorContext";
        }
    }

    public du1(bj4 bj4Var) {
        this.t = bj4Var;
    }

    @Override // defpackage.h72
    public final Object J(ci4 ci4Var, Object obj) {
        return ci4Var.invoke(obj, this);
    }

    @Override // defpackage.h72
    public final /* bridge */ h72 N(h72.b<?> bVar) {
        return h72.a.C0100a.b(this, bVar);
    }

    @Override // defpackage.hk7
    public final List<at1> a(Integer num) {
        return this.t.h0();
    }

    @Override // defpackage.bu1
    public final boolean b(Object obj, Throwable th) {
        return nt3.e(th, new cu1(0, this, obj));
    }

    @Override // defpackage.hk7
    public final boolean c() {
        return this.t.C;
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
        return u;
    }
}
