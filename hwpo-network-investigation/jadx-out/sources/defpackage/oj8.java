package defpackage;

import android.content.Context;
import io.intercom.android.sdk.api.ShutdownStore$Companion$createSharedPrefsMigration$1;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oj8 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ oj8(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                vtb.b((Closeable) ((gl8) obj).t);
                return g2b.a;
            default:
                return ShutdownStore$Companion$createSharedPrefsMigration$1.oldPrefs_delegate$lambda$0((Context) obj);
        }
    }
}
