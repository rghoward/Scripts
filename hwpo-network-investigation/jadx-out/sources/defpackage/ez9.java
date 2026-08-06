package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ez9 implements zm6 {
    public final vf1 t;
    public boolean u;
    public long v;
    public long w;
    public k28 x = k28.d;

    public ez9(vf1 vf1Var) {
        this.t = vf1Var;
    }

    public final void a(long j) {
        this.v = j;
        if (this.u) {
            this.w = this.t.c();
        }
    }

    @Override // defpackage.zm6
    public final void c(k28 k28Var) {
        if (this.u) {
            a(g());
        }
        this.x = k28Var;
    }

    @Override // defpackage.zm6
    public final k28 e() {
        return this.x;
    }

    @Override // defpackage.zm6
    public final long g() {
        long j = this.v;
        if (!this.u) {
            return j;
        }
        long jC = this.t.c() - this.w;
        k28 k28Var = this.x;
        return (k28Var.a == 1.0f ? n6b.N(jC) : jC * ((long) k28Var.c)) + j;
    }
}
