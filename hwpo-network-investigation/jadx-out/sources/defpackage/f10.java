package defpackage;

import io.intercom.android.sdk.AppIdentityInjector;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f10 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ f10(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                return AppIdentityInjector.surveyApi_delegate$lambda$11((AppIdentityInjector) obj);
            default:
                return GifGridKt.GifGridIcon$lambda$15$lambda$14((mh4) obj);
        }
    }
}
