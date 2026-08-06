package defpackage;

import io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity;
import io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ml1 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ ml1(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                am1 am1Var = (am1) obj;
                kx3.b bVar = am1Var.A;
                if (bVar == null) {
                    xj5.e("filePickerFactory");
                    throw null;
                }
                ba activityResultRegistry = am1Var.requireActivity().getActivityResultRegistry();
                s66 lifecycle = am1Var.getLifecycle();
                lifecycle.getClass();
                return bVar.a(activityResultRegistry, lifecycle);
            case 1:
                return DatePickerQuestionKt.TimePicker$lambda$24$lambda$23((h37) obj);
            default:
                return IntercomArticleActivity.viewModel_delegate$lambda$2((IntercomArticleActivity) obj);
        }
    }
}
