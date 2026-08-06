package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class ar0 extends vx6<br0> {
    public final oh4<ro4, g2b> t;

    /* JADX WARN: Multi-variable type inference failed */
    public ar0(oh4<? super ro4, g2b> oh4Var) {
        this.t = oh4Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        return new br0(this.t);
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        mb7 mb7Var;
        br0 br0Var = (br0) cVar;
        oh4<ro4, g2b> oh4Var = this.t;
        br0Var.H = oh4Var;
        if (br0Var.t.G && (mb7Var = ew2.d(br0Var, 2).K) != null) {
            mb7Var.c2(oh4Var, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ar0) {
            return this.t == ((ar0) obj).t;
        }
        return false;
    }

    public final int hashCode() {
        return this.t.hashCode();
    }
}
