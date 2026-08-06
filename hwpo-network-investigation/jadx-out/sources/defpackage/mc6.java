package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mc6 {
    public static final u93 a = new u93(new lc6());

    public static f87 a(jt1 jt1Var) {
        f87 f87Var;
        f87 f87Var2 = (f87) jt1Var.F(a);
        if (f87Var2 != null) {
            jt1Var.K(950834231);
            jt1Var.B();
            return f87Var2;
        }
        jt1Var.K(950836184);
        View view = (View) jt1Var.F(AndroidCompositionLocals_androidKt.f);
        view.getClass();
        while (true) {
            f87Var = null;
            if (view == null) {
                break;
            }
            Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
            f87 f87Var3 = tag instanceof f87 ? (f87) tag : null;
            if (f87Var3 != null) {
                f87Var = f87Var3;
                break;
            }
            Object objG = bza.g(view);
            view = objG instanceof View ? (View) objG : null;
        }
        jt1Var.B();
        return f87Var;
    }
}
