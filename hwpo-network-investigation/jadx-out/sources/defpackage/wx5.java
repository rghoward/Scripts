package defpackage;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wx5 implements jac {
    public static final /* synthetic */ wx5 t = new wx5();

    public static boolean b(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    public static final ox6 c(ox6 ox6Var, eo5 eo5Var, sx5 sx5Var, fl7 fl7Var, boolean z) {
        return ox6Var.H(new xx5(eo5Var, sx5Var, fl7Var, z));
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Long.valueOf(u4c.u.get().i0());
    }
}
