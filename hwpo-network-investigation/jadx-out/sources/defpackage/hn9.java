package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hn9 {
    public final boolean a;
    public final oh4<in9, Boolean> b;
    public wv<Float> c;
    public final wj<in9> d;
    public a04<Float> e;
    public a04<Float> f;

    public hn9(boolean z, mh4 mh4Var, mh4 mh4Var2, in9 in9Var, oh4 oh4Var) {
        this.a = z;
        this.b = oh4Var;
        if (z && in9Var == in9.v) {
            z90.a("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
            throw null;
        }
        this.c = dn9.a;
        int i = 2;
        this.d = new wj<>(in9Var, new wo0(i, mh4Var), mh4Var2, new rj(i, this), oh4Var);
        this.e = new fu9();
        this.f = new fu9();
    }

    public static Object a(hn9 hn9Var, in9 in9Var, a04 a04Var, p6a p6aVar) throws Throwable {
        Object objB = hn9Var.d.b(in9Var, o37.t, new gn9(hn9Var, hn9Var.d.k.h(), a04Var, null), p6aVar);
        return objB == v72.t ? objB : g2b.a;
    }

    public final Object b(p6a p6aVar) throws Throwable {
        oh4<in9, Boolean> oh4Var = this.b;
        in9 in9Var = in9.u;
        if (!oh4Var.invoke(in9Var).booleanValue()) {
            return g2b.a;
        }
        Object objA = a(this, in9Var, this.e, p6aVar);
        return objA == v72.t ? objA : g2b.a;
    }

    public final Object c(p6a p6aVar) throws Throwable {
        oh4<in9, Boolean> oh4Var = this.b;
        in9 in9Var = in9.t;
        if (!oh4Var.invoke(in9Var).booleanValue()) {
            return g2b.a;
        }
        Object objA = a(this, in9Var, this.f, p6aVar);
        return objA == v72.t ? objA : g2b.a;
    }

    public final boolean d() {
        return this.d.g.getValue() != in9.t;
    }

    public final Object e(p6a p6aVar) throws Throwable {
        if (this.a) {
            aa0.c("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
            return null;
        }
        oh4<in9, Boolean> oh4Var = this.b;
        in9 in9Var = in9.v;
        if (!oh4Var.invoke(in9Var).booleanValue()) {
            return g2b.a;
        }
        Object objA = a(this, in9Var, this.f, p6aVar);
        return objA == v72.t ? objA : g2b.a;
    }

    public final Object f(p6a p6aVar) throws Throwable {
        g63<in9> g63VarE = this.d.e();
        in9 in9Var = in9.v;
        if (!g63VarE.e(in9Var)) {
            in9Var = in9.u;
        }
        if (!this.b.invoke(in9Var).booleanValue()) {
            return g2b.a;
        }
        Object objA = a(this, in9Var, this.e, p6aVar);
        return objA == v72.t ? objA : g2b.a;
    }
}
