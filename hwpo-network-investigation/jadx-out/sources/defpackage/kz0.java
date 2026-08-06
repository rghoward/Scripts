package defpackage;

import j$.time.LocalDate;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kz0 implements jac {
    public static final /* synthetic */ int v = 0;
    public static final pl9 t = pl9.x;
    public static final float u = 8.0f;
    public static final /* synthetic */ kz0 w = new kz0();

    public static final LocalDate b(qm2 qm2Var, int i) {
        qm2Var.getClass();
        if (i == 0) {
            return qm2Var.a;
        }
        if (i == 1) {
            return qm2Var.b;
        }
        if (i == 2) {
            return qm2Var.c;
        }
        z90.a(pp2.a(i, "Position must be in [0..2], got: "));
        return null;
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Integer.valueOf((int) u4c.u.get().C());
    }
}
