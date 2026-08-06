package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i74 {
    /* JADX WARN: Code duplicated, block: B:19:0x0030  */
    public static final <T> tm9<T> a(r54<? extends T> r54Var, int i) {
        p91.b.getClass();
        int i2 = p91.a.b;
        if (i >= i2) {
            i2 = i;
        }
        int i3 = i2 - i;
        boolean z = r54Var instanceof u91;
        xx0 xx0Var = xx0.t;
        if (z) {
            u91 u91Var = (u91) r54Var;
            xx0 xx0Var2 = u91Var.v;
            r54<T> r54VarK = u91Var.k();
            if (r54VarK != null) {
                int i4 = u91Var.u;
                if (i4 != -3 && i4 != -2 && i4 != 0) {
                    i3 = i4;
                } else if (xx0Var2 == xx0Var) {
                    if (i4 == 0) {
                        i3 = 0;
                    }
                } else if (i == 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                return new tm9<>(i3, xx0Var2, u91Var.t, r54VarK);
            }
        }
        return new tm9<>(i3, xx0Var, ff3.t, r54Var);
    }
}
