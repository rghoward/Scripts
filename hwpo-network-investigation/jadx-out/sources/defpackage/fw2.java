package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fw2 {
    public static final View a(dw2 dw2Var) {
        if (!dw2Var.q().G) {
            uc5.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) ur5.a(ew2.f(dw2Var));
    }
}
