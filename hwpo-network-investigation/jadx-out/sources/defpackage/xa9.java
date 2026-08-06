package defpackage;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xa9 {
    public static final t43 a = ca9.a.b;

    public static final boolean a(r48 r48Var) {
        MotionEvent motionEventA;
        List<a58> list = r48Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).i != 2) {
                MotionEvent motionEventA2 = r48Var.a();
                if ((motionEventA2 == null || !motionEventA2.isFromSource(8194)) && ((motionEventA = r48Var.a()) == null || !motionEventA.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }
}
