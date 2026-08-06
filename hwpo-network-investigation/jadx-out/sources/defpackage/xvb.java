package defpackage;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xvb extends hwb {
    public final /* synthetic */ Intent t;
    public final /* synthetic */ GoogleApiActivity u;

    public xvb(Intent intent, GoogleApiActivity googleApiActivity) {
        this.t = intent;
        this.u = googleApiActivity;
    }

    @Override // defpackage.hwb
    public final void a() {
        Intent intent = this.t;
        if (intent != null) {
            this.u.startActivityForResult(intent, 2);
        }
    }
}
