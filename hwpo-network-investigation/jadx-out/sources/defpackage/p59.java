package defpackage;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.hwpo_training_app.R;
import com.hwpo_training_app.tracking.presentation.widget.ScoreInfoExpandableLayout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p59 implements Runnable {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ p59(int i, Object obj, Object obj2) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.t;
        Object obj = this.v;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                is5 is5Var = (is5) obj2;
                ScoreInfoExpandableLayout scoreInfoExpandableLayout = (ScoreInfoExpandableLayout) obj;
                int i2 = ScoreInfoExpandableLayout.N;
                is5Var.i.setText(R.string.show_more);
                is5Var.e.setAlpha(1.0f);
                ConstraintLayout constraintLayout = is5Var.f;
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                if (layoutParams == null) {
                    ac4.c("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                } else {
                    ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams;
                    ((ViewGroup.MarginLayoutParams) aVar).height = wk6.b(scoreInfoExpandableLayout.getResources().getDimension(R.dimen.description_collapsed_height));
                    constraintLayout.setLayoutParams(aVar);
                }
                break;
            default:
                qqb qqbVar = (qqb) obj2;
                s66 s66Var = (s66) obj;
                if (!qqbVar.v) {
                    qqbVar.w = s66Var;
                    s66Var.a(qqbVar);
                }
                break;
        }
    }
}
