package defpackage;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class iq1 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(dq1 dq1Var, fr1 fr1Var) {
        View childAt = ((ViewGroup) dq1Var.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(fr1Var);
            return;
        }
        ComposeView composeView2 = new ComposeView(dq1Var, null, 0, 6, null);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(fr1Var);
        View decorView = dq1Var.getWindow().getDecorView();
        if (vib.a(decorView) == null) {
            decorView.setTag(com.hwpo_training_app.R.id.view_tree_lifecycle_owner, dq1Var);
        }
        if (ty.e(decorView) == null) {
            decorView.setTag(com.hwpo_training_app.R.id.view_tree_view_model_store_owner, dq1Var);
        }
        if (sy.a(decorView) == null) {
            decorView.setTag(com.hwpo_training_app.R.id.view_tree_saved_state_registry_owner, dq1Var);
        }
        dq1Var.setContentView(composeView2, a);
    }
}
