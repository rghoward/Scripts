package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xlb extends RecyclerView.n {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        js7 js7Var;
        rect.getClass();
        view.getClass();
        a0Var.getClass();
        int iM = RecyclerView.M(view);
        Integer numValueOf = Integer.valueOf(iM);
        if (iM == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            int i = iIntValue + 1;
            if (iIntValue % 7 == 0) {
                js7Var = new js7(Float.valueOf(view.getResources().getDimension(R.dimen.day_item_space_start_end)), Float.valueOf(view.getResources().getDimension(R.dimen.day_item_space_between)));
            } else {
                js7Var = i % 7 == 0 ? new js7(Float.valueOf(view.getResources().getDimension(R.dimen.day_item_space_between)), Float.valueOf(view.getResources().getDimension(R.dimen.day_item_space_start_end))) : new js7(Float.valueOf(view.getResources().getDimension(R.dimen.day_item_space_between)), Float.valueOf(view.getResources().getDimension(R.dimen.day_item_space_between)));
            }
            float fFloatValue = ((Number) js7Var.t).floatValue();
            float fFloatValue2 = ((Number) js7Var.u).floatValue();
            rect.left = wk6.b(fFloatValue);
            rect.right = wk6.b(fFloatValue2);
        }
    }
}
