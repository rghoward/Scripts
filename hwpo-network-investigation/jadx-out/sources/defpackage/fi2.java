package defpackage;

import android.content.Context;
import io.intercom.android.sdk.identity.DeviceIdentityStore$Companion$createSharedPrefsMigration$1;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fi2 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ fi2(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                h37 h37Var = (h37) obj;
                h37Var.setValue(Boolean.valueOf(!((Boolean) h37Var.getValue()).booleanValue()));
                return g2b.a;
            default:
                return DeviceIdentityStore$Companion$createSharedPrefsMigration$1.legacyPrefs_delegate$lambda$0((Context) obj);
        }
    }
}
