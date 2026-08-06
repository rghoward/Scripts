package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lp implements jac {
    public static final /* synthetic */ lp t = new lp();

    public static final void b(l07 l07Var, n41 n41Var, fx0 fx0Var, float f, el9 el9Var, fda fdaVar, e73 e73Var) {
        ArrayList arrayList = l07Var.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ns7 ns7Var = (ns7) arrayList.get(i);
            ns7Var.a.i(n41Var, fx0Var, f, el9Var, fdaVar, e73Var);
            n41Var.n(0.0f, ns7Var.a.c());
        }
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Long.valueOf(u4c.u.get().A());
    }
}
