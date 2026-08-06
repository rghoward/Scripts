package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dec extends bec {
    public final /* synthetic */ Bundle x;
    public final /* synthetic */ Activity y;
    public final /* synthetic */ lec z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dec(lec lecVar, Bundle bundle, Activity activity) {
        super(lecVar.t, true);
        this.x = bundle;
        this.y = activity;
        this.z = lecVar;
    }

    @Override // defpackage.bec
    public final void a() {
        Bundle bundle;
        Bundle bundle2 = this.x;
        if (bundle2 != null) {
            bundle = new Bundle();
            if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = bundle2.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        lbc lbcVar = this.z.t.f;
        a78.g(lbcVar);
        Activity activity = this.y;
        lbcVar.onActivityCreatedByScionActivityInfo(lcc.j(activity), bundle, this.u);
    }
}
