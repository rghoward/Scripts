package defpackage;

import android.graphics.Canvas;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ml5 implements jac {
    public static final /* synthetic */ int A = 0;
    public static final k7a t = new k7a("COMPLETING_ALREADY");
    public static final k7a u = new k7a("COMPLETING_WAITING_CHILDREN");
    public static final k7a v = new k7a("COMPLETING_RETRY");
    public static final k7a w = new k7a("TOO_LATE_TO_CANCEL");
    public static final k7a x = new k7a("SEALED");
    public static final af3 y = new af3(false);
    public static final af3 z = new af3(true);
    public static final /* synthetic */ ml5 B = new ml5();

    public static final ol b(po poVar) {
        Canvas canvas = pl.a;
        ol olVar = new ol();
        olVar.a = new Canvas(so.a(poVar));
        return olVar;
    }

    public static final void c() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final Object d(Object obj) {
        ja5 ja5Var;
        ka5 ka5Var = obj instanceof ka5 ? (ka5) obj : null;
        return (ka5Var == null || (ja5Var = ka5Var.a) == null) ? obj : ja5Var;
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Boolean.valueOf(((b7c) a7c.u.t.t).b());
    }
}
