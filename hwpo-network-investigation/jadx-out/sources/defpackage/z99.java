package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class z99 extends gw2 implements lr5, a73, bn4 {
    public ia9 J;
    public final aba K;

    public z99() {
        throw null;
    }

    public z99(iw iwVar, wja wjaVar, qa4.a aVar, oh4 oh4Var, int i, boolean z, int i2, int i3, List list, oh4 oh4Var2, ia9 ia9Var) {
        this.J = ia9Var;
        aba abaVar = new aba(iwVar, wjaVar, aVar, oh4Var, i, z, i2, i3, list, oh4Var2, ia9Var, null);
        c2(abaVar);
        this.K = abaVar;
        if (this.J == null) {
            throw x70.a("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        }
    }

    @Override // defpackage.bn4
    public final void Q0(mb7 mb7Var) {
        ia9 ia9Var = this.J;
        if (ia9Var != null) {
            ia9Var.w = a1a.a(ia9Var.w, mb7Var, null, 2);
            ia9Var.u.c();
        }
    }

    @Override // ox6.c
    public final boolean R1() {
        return false;
    }

    @Override // defpackage.lr5
    public final gl6 e(hl6 hl6Var, cl6 cl6Var, long j) {
        return this.K.e(hl6Var, cl6Var, j);
    }

    @Override // defpackage.lr5
    public final int f(df6 df6Var, pj5 pj5Var, int i) {
        return this.K.f(df6Var, pj5Var, i);
    }

    @Override // defpackage.lr5
    public final int j(df6 df6Var, pj5 pj5Var, int i) {
        return this.K.j(df6Var, pj5Var, i);
    }

    @Override // defpackage.a73
    public final void t(tr5 tr5Var) throws Throwable {
        this.K.t(tr5Var);
    }

    @Override // defpackage.lr5
    public final int v(df6 df6Var, pj5 pj5Var, int i) {
        return this.K.v(df6Var, pj5Var, i);
    }

    @Override // defpackage.lr5
    public final int x(df6 df6Var, pj5 pj5Var, int i) {
        return this.K.x(df6Var, pj5Var, i);
    }
}
