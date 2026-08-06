package defpackage;

import android.graphics.drawable.Drawable;
import com.hwpo_training_app.R;
import com.hwpo_training_app.leaderboards.filter.details.presentation.screen.LeaderboardDetailsFiltersFragment;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tb implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ tb(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                xb xbVar = (xb) obj;
                xb.a aVar = xb.Companion;
                return new qb(new xb.b(2, xbVar.q(), gd.class, "onItemCheckedChanged", "onItemCheckedChanged(IZ)V", 0), new xb.c(1, xbVar.q(), gd.class, "onItemShown", "onItemShown(I)V", 0));
            case 1:
                LeaderboardDetailsFiltersFragment.Companion companion = LeaderboardDetailsFiltersFragment.Companion;
                Drawable drawable = ((LeaderboardDetailsFiltersFragment) obj).requireContext().getDrawable(R.drawable.ic_select_filter);
                if (drawable != null) {
                    return drawable;
                }
                z90.a("Required value was null.");
                return null;
            default:
                js7 js7Var = (js7) ((x57) obj).h.getValue();
                if (js7Var != null) {
                    return (String) js7Var.u;
                }
                return null;
        }
    }
}
