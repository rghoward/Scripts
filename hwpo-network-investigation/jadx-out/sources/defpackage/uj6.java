package defpackage;

import android.view.View;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uj6 extends m3 {
    public final /* synthetic */ rj6 t;

    public uj6(rj6 rj6Var) {
        this.t = rj6Var;
    }

    @Override // defpackage.m3
    public final void onInitializeAccessibilityNodeInfo(View view, j4 j4Var) {
        super.onInitializeAccessibilityNodeInfo(view, j4Var);
        rj6 rj6Var = this.t;
        j4Var.b(new j4.a(16, rj6Var.G.getVisibility() == 0 ? rj6Var.getString(R.string.mtrl_picker_toggle_to_year_selection) : rj6Var.getString(R.string.mtrl_picker_toggle_to_day_selection)));
    }
}
