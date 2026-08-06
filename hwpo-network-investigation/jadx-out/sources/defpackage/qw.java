package defpackage;

import io.intercom.android.sdk.survey.ui.models.Answer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qw implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ qw(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                return ((Answer.MediaAnswer.MediaItem) obj).get_uploadStatus();
            default:
                rb3.a aVar = rb3.Companion;
                ((kx3) ((rb3) obj).E.getValue()).d();
                return g2b.a;
        }
    }
}
