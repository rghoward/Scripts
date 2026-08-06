package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u72 {
    public static final o02 a(h72 h72Var) {
        if (h72Var.d0(el5.a.t) == null) {
            h72Var = h72Var.c0(sd.b());
        }
        return new o02(h72Var);
    }

    public static final o02 b() {
        k5a k5aVarB = od3.b();
        et2 et2Var = i23.a;
        return new o02(h72.a.C0100a.c(k5aVarB, ag6.a));
    }

    public static final void c(t72 t72Var, CancellationException cancellationException) {
        el5 el5Var = (el5) t72Var.getCoroutineContext().d0(el5.a.t);
        if (el5Var != null) {
            el5Var.k(cancellationException);
        } else {
            tn2.d(t72Var, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static final <R> Object d(ci4<? super t72, ? super r02<? super R>, ? extends Object> ci4Var, r02<? super R> r02Var) {
        i59 i59Var = new i59(r02Var, r02Var.getContext());
        return wx7.d(i59Var, true, i59Var, ci4Var);
    }

    public static final boolean e(t72 t72Var) {
        el5 el5Var = (el5) t72Var.getCoroutineContext().d0(el5.a.t);
        if (el5Var != null) {
            return el5Var.h();
        }
        return true;
    }
}
