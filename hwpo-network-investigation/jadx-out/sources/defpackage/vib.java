package defpackage;

import android.view.View;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vib {
    public static final m76 a(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            m76 m76Var = tag instanceof m76 ? (m76) tag : null;
            if (m76Var != null) {
                return m76Var;
            }
            Object objG = bza.g(view);
            view = objG instanceof View ? (View) objG : null;
        }
        return null;
    }
}
