package defpackage;

import android.content.Context;
import io.intercom.android.sdk.identity.AppConfigStore$Companion$createSharedPrefsMigration$1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r00 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ r00(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                return AppConfigStore$Companion$createSharedPrefsMigration$1.oldPrefs_delegate$lambda$0((Context) obj);
            default:
                Object obj2 = ((List) obj).get(2);
                obj2.getClass();
                return (Integer) obj2;
        }
    }
}
