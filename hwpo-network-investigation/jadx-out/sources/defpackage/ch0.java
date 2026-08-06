package defpackage;

import java.text.DecimalFormat;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ch0 extends nab {
    public final js7<xn0, m2b> a;
    public final DecimalFormat b;

    /* JADX WARN: Multi-variable type inference failed */
    public ch0(js7<? extends xn0, ? extends m2b> js7Var) {
        js7Var.getClass();
        this.a = js7Var;
        this.b = new DecimalFormat("0.##");
    }

    @Override // defpackage.nab
    public final String a(float f) {
        js7<xn0, m2b> js7Var = this.a;
        xn0 xn0Var = js7Var.t;
        m2b m2bVar = js7Var.u;
        float fAbs = Math.abs(f);
        if (xn0Var == xn0.u && m2bVar != m2b.u) {
            return wn0.c((long) fAbs);
        }
        String str = this.b.format(Float.valueOf(fAbs));
        str.getClass();
        return str;
    }
}
