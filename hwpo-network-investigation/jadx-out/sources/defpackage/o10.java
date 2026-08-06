package defpackage;

import android.content.Context;
import io.intercom.android.sdk.identity.AppIdentityStore$Companion$createSharedPrefsMigration$1;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o10 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ o10(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                return AppIdentityStore$Companion$createSharedPrefsMigration$1.oldPrefs_delegate$lambda$0((Context) obj);
            default:
                return oo0.p((oo0) obj);
        }
    }
}
