package defpackage;

import android.net.Uri;
import io.intercom.android.sdk.m5.conversation.ui.components.MediaInputSheetContentKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ao6 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ ao6(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                return MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$5$lambda$4((oh4) obj2, (Uri) obj);
            default:
                String str = (String) obj;
                str.getClass();
                return Boolean.valueOf(!((x57) obj2).c().contains(str));
        }
    }
}
