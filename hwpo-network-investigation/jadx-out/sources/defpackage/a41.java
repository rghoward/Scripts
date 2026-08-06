package defpackage;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a41 extends ln4 {
    public final Typeface x;
    public final xg1 y;
    public boolean z;

    public a41(xg1 xg1Var, Typeface typeface) {
        super(26);
        this.x = typeface;
        this.y = xg1Var;
    }

    @Override // defpackage.ln4
    public final void S0(int i) {
        if (this.z) {
            return;
        }
        yg1 yg1Var = this.y.a;
        if (yg1Var.l(this.x)) {
            yg1Var.j(false);
        }
    }

    @Override // defpackage.ln4
    public final void T0(Typeface typeface, boolean z) {
        if (this.z) {
            return;
        }
        yg1 yg1Var = this.y.a;
        if (yg1Var.l(typeface)) {
            yg1Var.j(false);
        }
    }
}
