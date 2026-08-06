package defpackage;

import androidx.media3.exoplayer.e;
import androidx.media3.exoplayer.k;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fs2 implements zm6 {
    public final ez9 t;
    public final e u;
    public k v;
    public zm6 w;
    public boolean x = true;
    public boolean y;

    public fs2(e eVar, vf1 vf1Var) {
        this.u = eVar;
        this.t = new ez9(vf1Var);
    }

    public final void a(k kVar) {
        zm6 zm6Var;
        zm6 zm6VarE = kVar.E();
        if (zm6VarE == null || zm6VarE == (zm6Var = this.w)) {
            return;
        }
        if (zm6Var != null) {
            throw new lo3(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.w = zm6VarE;
        this.v = kVar;
        ((bn6) zm6VarE).c(this.t.x);
    }

    @Override // defpackage.zm6
    public final void c(k28 k28Var) {
        zm6 zm6Var = this.w;
        if (zm6Var != null) {
            zm6Var.c(k28Var);
            k28Var = this.w.e();
        }
        this.t.c(k28Var);
    }

    @Override // defpackage.zm6
    public final k28 e() {
        zm6 zm6Var = this.w;
        return zm6Var != null ? zm6Var.e() : this.t.x;
    }

    @Override // defpackage.zm6
    public final long g() {
        if (this.x) {
            return this.t.g();
        }
        zm6 zm6Var = this.w;
        zm6Var.getClass();
        return zm6Var.g();
    }

    @Override // defpackage.zm6
    public final boolean w() {
        if (this.x) {
            this.t.getClass();
            return false;
        }
        zm6 zm6Var = this.w;
        zm6Var.getClass();
        return zm6Var.w();
    }
}
