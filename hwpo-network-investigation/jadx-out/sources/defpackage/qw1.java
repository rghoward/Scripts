package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class qw1<E> extends zx0<E> {
    public final xx0 I;

    public qw1(int i, xx0 xx0Var) {
        super(i);
        this.I = xx0Var;
        if (xx0Var == xx0.t) {
            ca0.c(ll8.a(zx0.class).c(), " instead", "This implementation does not support suspension for senders, use ");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        ca0.a(pk.d(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
        throw null;
    }

    @Override // defpackage.zx0
    public final boolean G() {
        return this.I == xx0.u;
    }

    public final Object V(E e, boolean z) {
        ha1<E> ha1Var;
        if (this.I == xx0.v) {
            Object objN = super.n(e);
            return (!(objN instanceof ga1.b) || (objN instanceof ga1.a)) ? objN : g2b.a;
        }
        Object obj = dy0.d;
        ha1<E> ha1Var2 = (ha1) zx0.y.get(this);
        while (true) {
            long andIncrement = zx0.u.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zE = this.E(andIncrement, false);
            int i = dy0.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (ha1Var2.x != j3) {
                ha1<E> ha1VarW = this.w(j3, ha1Var2);
                if (ha1VarW != null) {
                    ha1Var = ha1VarW;
                } else if (zE) {
                    return new ga1.a(this.z());
                }
            } else {
                ha1Var = ha1Var2;
            }
            int iH = zx0.h(this, ha1Var, i2, e, j, obj, zE);
            ha1Var2 = ha1Var;
            if (iH == 0) {
                ha1Var2.a();
                return g2b.a;
            }
            if (iH == 1) {
                return g2b.a;
            }
            if (iH == 2) {
                if (zE) {
                    ha1Var2.n();
                    return new ga1.a(this.z());
                }
                vjb vjbVar = obj instanceof vjb ? (vjb) obj : null;
                if (vjbVar != null) {
                    vjbVar.a(ha1Var2, i2 + i);
                }
                this.s((ha1Var2.x * j2) + ((long) i2));
                return g2b.a;
            }
            if (iH == 3) {
                aa0.c("unexpected");
                return null;
            }
            if (iH == 4) {
                if (j < zx0.v.get(this)) {
                    ha1Var2.a();
                }
                return new ga1.a(this.z());
            }
            if (iH == 5) {
                ha1Var2.a();
            }
            this = this;
            e = e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zx0, defpackage.sc9
    public final Object a(r02 r02Var, Object obj) throws Throwable {
        if (V(obj, true) instanceof ga1.a) {
            throw z();
        }
        return g2b.a;
    }

    @Override // defpackage.zx0, defpackage.sc9
    public final Object n(E e) {
        return V(e, false);
    }
}
