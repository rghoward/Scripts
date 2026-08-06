package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ht4 extends n72 implements zv2 {
    @Override // defpackage.n72
    public String toString() {
        gt4 gt4VarX0;
        String str;
        et2 et2Var = i23.a;
        ht4 ht4Var = ag6.a;
        if (this == ht4Var) {
            str = "Dispatchers.Main";
        } else {
            try {
                gt4VarX0 = ht4Var.x0();
            } catch (UnsupportedOperationException unused) {
                gt4VarX0 = null;
            }
            str = this == gt4VarX0 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + ym2.c(this);
    }

    @Override // defpackage.n72
    public final n72 w0(int i) {
        pp0.c(1);
        return this;
    }

    public abstract gt4 x0();
}
