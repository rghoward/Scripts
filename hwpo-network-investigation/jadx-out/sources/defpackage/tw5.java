package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tw5 implements sw5, hl6 {
    public final ew5 t;
    public final g4a u;
    public final hw5 v;
    public final e27<List<cl6>> w;

    public tw5(ew5 ew5Var, g4a g4aVar) {
        this.t = ew5Var;
        this.u = g4aVar;
        this.v = (hw5) ew5Var.b.invoke();
        ag5.a();
        this.w = new e27<>();
    }

    @Override // defpackage.tx2
    public final long A0(float f) {
        return this.u.A0(f);
    }

    @Override // defpackage.tx2
    public final float C1(long j) {
        return this.u.C1(j);
    }

    @Override // defpackage.tx2
    public final float F0(int i) {
        return this.u.F0(i);
    }

    @Override // defpackage.tx2
    public final float I0(float f) {
        return this.u.I0(f);
    }

    @Override // defpackage.tx2
    public final float N0() {
        return this.u.N0();
    }

    @Override // defpackage.tx2
    public final long O(float f) {
        return this.u.O(f);
    }

    @Override // defpackage.tx2
    public final long P(long j) {
        return this.u.P(j);
    }

    @Override // defpackage.qj5
    public final boolean P0() {
        return this.u.P0();
    }

    @Override // defpackage.tx2
    public final float U0(float f) {
        return this.u.U0(f);
    }

    @Override // defpackage.tx2
    public final float d0(long j) {
        return this.u.d0(j);
    }

    public final List<cl6> e(int i) {
        e27<List<cl6>> e27Var = this.w;
        List<cl6> listB = e27Var.b(i);
        if (listB != null) {
            return listB;
        }
        hw5 hw5Var = this.v;
        Object objF = hw5Var.f(i);
        List listH = this.u.H(this.t.a(i, objF, hw5Var.g(i)), objF);
        e27Var.i(i, listH);
        return listH;
    }

    @Override // defpackage.tx2
    public final float getDensity() {
        return this.u.getDensity();
    }

    @Override // defpackage.qj5
    public final tq5 getLayoutDirection() {
        return this.u.getLayoutDirection();
    }

    @Override // defpackage.hl6
    public final gl6 i1(int i, int i2, Map<ei, Integer> map, oh4<? super wy8, g2b> oh4Var, oh4<? super jz7.a, g2b> oh4Var2) {
        return this.u.i1(i, i2, map, oh4Var, oh4Var2);
    }

    @Override // defpackage.tx2
    public final int n1(float f) {
        return this.u.n1(f);
    }

    @Override // defpackage.tx2
    public final long w0(int i) {
        return this.u.w0(i);
    }

    @Override // defpackage.hl6
    public final gl6 y0(int i, int i2, Map<ei, Integer> map, oh4<? super jz7.a, g2b> oh4Var) {
        return this.u.y0(i, i2, map, oh4Var);
    }

    @Override // defpackage.tx2
    public final long z1(long j) {
        return this.u.z1(j);
    }
}
