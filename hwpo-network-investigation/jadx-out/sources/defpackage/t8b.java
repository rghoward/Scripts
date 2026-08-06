package defpackage;

import android.transition.TransitionManager;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.c;
import com.hwpo_training_app.R;
import com.hwpo_training_app.tracking.presentation.widget.ScoreInfoExpandableLayout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class t8b implements oh4<m59, g2b> {
    public final /* synthetic */ ScoreInfoExpandableLayout t;

    public t8b(ScoreInfoExpandableLayout scoreInfoExpandableLayout) {
        this.t = scoreInfoExpandableLayout;
    }

    @Override // defpackage.oh4
    public final g2b invoke(m59 m59Var) {
        int iB;
        m59 m59Var2 = m59Var;
        m59Var2.getClass();
        ScoreInfoExpandableLayout scoreInfoExpandableLayout = this.t;
        is5 is5Var = scoreInfoExpandableLayout.K;
        int iOrdinal = m59Var2.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                is5Var.i.setText(R.string.show_more);
                scoreInfoExpandableLayout.f(false);
                iB = wk6.b(scoreInfoExpandableLayout.getResources().getDimension(R.dimen.description_collapsed_height));
            } else if (iOrdinal == 2) {
                is5Var.c.post(new p04(2, is5Var));
            } else {
                if (iOrdinal != 3) {
                    u.b();
                    return null;
                }
                is5Var.c.post(new p59(0, is5Var, scoreInfoExpandableLayout));
            }
            return g2b.a;
        }
        is5Var.i.setText(R.string.show_less);
        scoreInfoExpandableLayout.f(true);
        iB = -2;
        c cVar = new c();
        cVar.c(is5Var.c);
        ViewParent parent = is5Var.a.getParent();
        parent.getClass();
        TransitionManager.beginDelayedTransition((ViewGroup) parent);
        cVar.d(is5Var.f.getId(), iB);
        cVar.a(is5Var.c);
        return g2b.a;
    }
}
