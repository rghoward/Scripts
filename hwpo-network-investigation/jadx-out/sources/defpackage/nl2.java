package defpackage;

import com.hwpo_training_app.R;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nl2 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ nl2(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                ql2.a aVar = ql2.Companion;
                return Integer.valueOf((int) ((ql2) obj).getResources().getDimension(R.dimen.default_margin));
            default:
                return HelpCenterViewModel.searchBrowseTeamPresenceState_delegate$lambda$0((HelpCenterViewModel) obj);
        }
    }
}
