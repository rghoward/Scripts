package defpackage;

import android.content.Context;
import io.intercom.android.sdk.api.DeDuperStore$Companion$createSharedPrefsMigration$1;
import io.intercom.android.sdk.post.IntercomPostActivity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class um2 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Context u;

    public /* synthetic */ um2(Context context, int i) {
        this.t = i;
        this.u = context;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Context context = this.u;
        switch (i) {
            case 0:
                return DeDuperStore$Companion$createSharedPrefsMigration$1.oldPrefs_delegate$lambda$0(context);
            default:
                return IntercomPostActivity.timeFormatter_delegate$lambda$2((IntercomPostActivity) context);
        }
    }
}
