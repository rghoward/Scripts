package defpackage;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.leaderboards.databinding.FragmentLeaderboardsDetailsHeaderBinding;
import com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderFragment;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e36 implements Runnable {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ e36(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                FragmentLeaderboardsDetailsHeaderBinding fragmentLeaderboardsDetailsHeaderBinding = (FragmentLeaderboardsDetailsHeaderBinding) obj;
                LeaderboardDetailsHeaderFragment.Companion companion = LeaderboardDetailsHeaderFragment.Companion;
                MaterialTextView materialTextView = fragmentLeaderboardsDetailsHeaderBinding.k;
                materialTextView.setVisibility(0);
                fragmentLeaderboardsDetailsHeaderBinding.m.setVisibility(8);
                fragmentLeaderboardsDetailsHeaderBinding.i.setVisibility(8);
                ViewGroup.LayoutParams layoutParams = materialTextView.getLayoutParams();
                if (layoutParams == null) {
                    ac4.c("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                } else {
                    ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams;
                    ((ViewGroup.MarginLayoutParams) aVar).height = -2;
                    materialTextView.setLayoutParams(aVar);
                }
                break;
            default:
                ((TextInputLayout) obj).x.requestLayout();
                break;
        }
    }
}
