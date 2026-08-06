package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomsheet.b;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class du0 extends m3 {
    public final /* synthetic */ b t;

    public du0(b bVar) {
        this.t = bVar;
    }

    @Override // defpackage.m3
    public final void onInitializeAccessibilityNodeInfo(View view, j4 j4Var) {
        super.onInitializeAccessibilityNodeInfo(view, j4Var);
        if (!this.t.D) {
            j4Var.a.setDismissable(false);
        } else {
            j4Var.a(1048576);
            j4Var.a.setDismissable(true);
        }
    }

    @Override // defpackage.m3
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            b bVar = this.t;
            if (bVar.D) {
                bVar.cancel();
                return true;
            }
        }
        return super.performAccessibilityAction(view, i, bundle);
    }
}
