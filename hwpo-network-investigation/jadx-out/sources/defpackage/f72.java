package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class f72 extends wp5 implements oh4<Throwable, g2b> {
    public final /* synthetic */ y21<Object> u;
    public final /* synthetic */ vv2 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f72(y21 y21Var, vv2 vv2Var) {
        super(1);
        this.u = y21Var;
        this.v = vv2Var;
    }

    @Override // defpackage.oh4
    public final g2b invoke(Throwable th) throws Throwable {
        Throwable th2 = th;
        y21<Object> y21Var = this.u;
        if (th2 == null) {
            Object objP = this.v.p();
            y21Var.d = true;
            a31<Object> a31Var = y21Var.b;
            if (a31Var != null && a31Var.u.l(objP)) {
                y21Var.a = null;
                y21Var.b = null;
                y21Var.c = null;
            }
        } else if (th2 instanceof CancellationException) {
            y21Var.d = true;
            a31<Object> a31Var2 = y21Var.b;
            if (a31Var2 != null && a31Var2.u.cancel(true)) {
                y21Var.a = null;
                y21Var.b = null;
                y21Var.c = null;
            }
        } else {
            y21Var.d = true;
            a31<Object> a31Var3 = y21Var.b;
            if (a31Var3 != null && a31Var3.u.m(th2)) {
                y21Var.a = null;
                y21Var.b = null;
                y21Var.c = null;
            }
        }
        return g2b.a;
    }
}
