package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class pm3 extends n72 {
    public static final /* synthetic */ int y = 0;
    public long v;
    public boolean w;
    public h30<d23<?>> x;

    public long A0() {
        return !B0() ? Long.MAX_VALUE : 0L;
    }

    public final boolean B0() {
        h30<d23<?>> h30Var = this.x;
        if (h30Var == null) {
            return false;
        }
        d23<?> d23VarRemoveFirst = h30Var.isEmpty() ? null : h30Var.removeFirst();
        if (d23VarRemoveFirst == null) {
            return false;
        }
        d23VarRemoveFirst.run();
        return true;
    }

    @Override // defpackage.n72
    public final n72 w0(int i) {
        pp0.c(1);
        return this;
    }

    public final void x0(boolean z) {
        long j = this.v - (z ? 4294967296L : 1L);
        this.v = j;
        if (j <= 0 && this.w) {
            shutdown();
        }
    }

    public final void y0(d23<?> d23Var) {
        h30<d23<?>> h30Var = this.x;
        if (h30Var == null) {
            h30Var = new h30<>();
            this.x = h30Var;
        }
        h30Var.addLast(d23Var);
    }

    public final void z0(boolean z) {
        this.v = (z ? 4294967296L : 1L) + this.v;
        if (z) {
            return;
        }
        this.w = true;
    }

    public void shutdown() {
    }
}
