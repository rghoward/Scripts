package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oc6 {
    public static final u93 a = new u93(new nc6());

    public static bh7 a(jt1 jt1Var) {
        bh7 bh7Var = (bh7) jt1Var.F(a);
        Object obj = null;
        if (bh7Var == null) {
            jt1Var.K(1208426157);
            View view = (View) jt1Var.F(AndroidCompositionLocals_androidKt.f);
            view.getClass();
            while (true) {
                if (view == null) {
                    bh7Var = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                bh7 bh7Var2 = tag instanceof bh7 ? (bh7) tag : null;
                if (bh7Var2 != null) {
                    bh7Var = bh7Var2;
                    break;
                }
                Object objG = bza.g(view);
                view = objG instanceof View ? (View) objG : null;
            }
        } else {
            jt1Var.K(1208423708);
        }
        jt1Var.B();
        if (bh7Var != null) {
            jt1Var.K(1208423789);
            jt1Var.B();
            return bh7Var;
        }
        jt1Var.K(1208428160);
        for (Context baseContext = (Context) jt1Var.F(AndroidCompositionLocals_androidKt.b); baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof bh7) {
                obj = baseContext;
                break;
            }
        }
        bh7 bh7Var3 = (bh7) obj;
        jt1Var.B();
        return bh7Var3;
    }
}
