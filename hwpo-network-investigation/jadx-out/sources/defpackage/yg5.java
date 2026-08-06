package defpackage;

import io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yg5 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ yg5(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                return IntercomArticleActivity.viewModel_delegate$lambda$2$lambda$1((IntercomArticleActivity) obj2, ((Integer) obj).intValue());
            default:
                ((h37) obj2).setValue((qq5) obj);
                return g2b.a;
        }
    }
}
