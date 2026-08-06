package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xk implements qq1 {
    @Override // defpackage.qq1
    public Object a(xu8 xu8Var) {
        Set setB = xu8Var.b(fg8.a(p66.class));
        xm4 xm4Var = xm4.b;
        if (xm4Var == null) {
            synchronized (xm4.class) {
                try {
                    xm4Var = xm4.b;
                    if (xm4Var == null) {
                        xm4Var = new xm4();
                        xm4.b = xm4Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return new hv2(setB, xm4Var);
    }
}
