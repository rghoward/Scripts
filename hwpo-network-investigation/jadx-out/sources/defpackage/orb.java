package defpackage;

import android.view.View;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class orb implements View.OnClickListener {
    public final /* synthetic */ int t;
    public final /* synthetic */ prb u;

    public orb(prb prbVar, int i) {
        this.u = prbVar;
        this.t = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        rj6<?> rj6Var = this.u.d;
        by6 by6VarF = by6.f(this.t, rj6Var.y.u);
        a21 a21Var = rj6Var.w;
        by6 by6Var = a21Var.u;
        by6 by6Var2 = a21Var.t;
        if (by6VarF.compareTo(by6Var2) < 0) {
            by6VarF = by6Var2;
        } else if (by6VarF.compareTo(by6Var) > 0) {
            by6VarF = by6Var;
        }
        rj6Var.k(by6VarF);
        rj6Var.l(rj6.e.t);
        MaterialButton materialButton = rj6Var.H;
        if (materialButton != null) {
            materialButton.sendAccessibilityEvent(8);
        }
    }
}
