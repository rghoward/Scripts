package defpackage;

import android.view.View;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sy {
    public static final h0b a = h0b.B;
    public static final gi1 b = gi1.F;

    public static final f19 a(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            f19 f19Var = tag instanceof f19 ? (f19) tag : null;
            if (f19Var != null) {
                return f19Var;
            }
            Object objG = bza.g(view);
            view = objG instanceof View ? (View) objG : null;
        }
        return null;
    }

    public static int b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }
}
