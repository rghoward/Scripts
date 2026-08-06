package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qv0 implements pv0, jv0 {
    public final tx2 a;
    public final long b;

    public qv0(g4a g4aVar, long j) {
        this.a = g4aVar;
        this.b = j;
    }

    @Override // defpackage.pv0
    public final long c() {
        return this.b;
    }

    @Override // defpackage.pv0
    public final float d() {
        long j = this.b;
        if (!xx1.d(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.a.F0(xx1.h(j));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qv0)) {
            return false;
        }
        qv0 qv0Var = (qv0) obj;
        return xj5.a(this.a, qv0Var.a) && xx1.b(this.b, qv0Var.b);
    }

    @Override // defpackage.jv0
    public final ox6 f(ox6 ox6Var, sp0 sp0Var) {
        return ox6Var.H(new zu0(sp0Var, false));
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.pv0
    public final float i() {
        long j = this.b;
        if (!xx1.c(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.a.F0(xx1.g(j));
    }

    @Override // defpackage.jv0
    public final ox6 k() {
        return new zu0(di.a.e, true);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + ((Object) xx1.k(this.b)) + ')';
    }
}
