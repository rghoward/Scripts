package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ub5<T> implements wv<T> {
    public final m93<T> a;
    public final qn8 b;
    public final long c;

    public ub5() {
        throw null;
    }

    public ub5(m93 m93Var, qn8 qn8Var, long j) {
        this.a = m93Var;
        this.b = qn8Var;
        this.c = j;
        if (m93Var instanceof xya) {
            xya xyaVar = (xya) m93Var;
            if (xyaVar.a != 0 || xyaVar.b != 0) {
                return;
            }
        } else if (!(m93Var instanceof fu9)) {
            if (m93Var instanceof gp5) {
                if (((gp5) m93Var).a.a != 0) {
                    return;
                }
            } else {
                if (m93Var instanceof ip5) {
                    throw null;
                }
                if (!(m93Var instanceof u20)) {
                    return;
                }
            }
        }
        z90.a("Animation to be infinitely repeated cannot have a 0-duration");
        throw null;
    }

    @Override // defpackage.wv
    public final <V extends fw> edb<V> a(cza<T, V> czaVar) {
        return new mdb(this.a.a((cza) czaVar), this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ub5) {
            ub5 ub5Var = (ub5) obj;
            if (xj5.a(ub5Var.a, this.a) && ub5Var.b == this.b && ub5Var.c == this.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
