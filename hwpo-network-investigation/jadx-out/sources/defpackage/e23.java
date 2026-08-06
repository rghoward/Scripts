package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class e23 implements jac {
    public static final /* synthetic */ e23 t = new e23();

    public static final void b(e41 e41Var, r02 r02Var, boolean z) {
        Object objS = e41Var.s();
        Throwable thD = e41Var.d(objS);
        Object aVar = thD != null ? new av8.a(thD) : e41Var.f(objS);
        if (!z) {
            r02Var.resumeWith(aVar);
            return;
        }
        r02Var.getClass();
        a23 a23Var = (a23) r02Var;
        u02 u02Var = a23Var.x;
        Object obj = a23Var.z;
        h72 context = u02Var.getContext();
        Object objC = cla.c(context, obj);
        x1b<?> x1bVarC = objC != cla.a ? l72.c(u02Var, context, objC) : null;
        try {
            u02Var.resumeWith(aVar);
            g2b g2bVar = g2b.a;
        } finally {
            if (x1bVarC == null || x1bVarC.F0()) {
                cla.a(context, objC);
            }
        }
    }

    public static int c(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Long.valueOf(u4c.u.get().D());
    }
}
