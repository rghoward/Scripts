package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oq3 implements jac {
    public static final /* synthetic */ oq3 t = new oq3();

    public static final int b(iq7 iq7Var) {
        return (int) (iq7Var.c() == fl7.t ? iq7Var.a() & 4294967295L : iq7Var.a() >> 32);
    }

    public static final void c(bj4 bj4Var, ci4 ci4Var) {
        ci4Var.getClass();
        fza.b(2, ci4Var);
        ci4Var.invoke(bj4Var, 1);
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Integer.valueOf((int) u4c.u.get().R());
    }
}
