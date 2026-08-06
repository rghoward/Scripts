package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class i76 {
    public static final z66 a(s66 s66Var) {
        s66Var.getClass();
        l60<Object> l60Var = s66Var.a;
        while (true) {
            z66 z66Var = (z66) l60Var.a.get();
            if (z66Var != null) {
                return z66Var;
            }
            k5a k5aVarB = od3.b();
            et2 et2Var = i23.a;
            z66 z66Var2 = new z66(s66Var, h72.a.C0100a.c(k5aVarB, ag6.a.x0()));
            AtomicReference<Object> atomicReference = l60Var.a;
            do {
                if (atomicReference.compareAndSet(null, z66Var2)) {
                    et2 et2Var2 = i23.a;
                    oy0.d(z66Var2, ag6.a.x0(), null, new y66(z66Var2, null), 2);
                    return z66Var2;
                }
            } while (atomicReference.get() == null);
        }
    }
}
