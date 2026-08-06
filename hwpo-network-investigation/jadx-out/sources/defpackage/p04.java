package defpackage;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.hwpo_training_app.R;
import com.hwpo_training_app.tracking.presentation.widget.ScoreInfoExpandableLayout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p04 implements Runnable {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ p04(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                ((s04) obj).b();
                break;
            case 1:
                ((o38) obj).o.start();
                break;
            default:
                is5 is5Var = (is5) obj;
                int i2 = ScoreInfoExpandableLayout.N;
                is5Var.e.setAlpha(0.0f);
                is5Var.i.setText(R.string.show_less);
                ConstraintLayout constraintLayout = is5Var.f;
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                if (layoutParams == null) {
                    ac4.c("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                } else {
                    ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams;
                    ((ViewGroup.MarginLayoutParams) aVar).height = -2;
                    constraintLayout.setLayoutParams(aVar);
                }
                break;
        }
    }
}
