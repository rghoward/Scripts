package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t1d extends u2d {
    @Override // defpackage.u2d
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new t3d("Invalid response to one way request", null));
        }
    }

    @Override // defpackage.u2d
    public final boolean b() {
        return true;
    }
}
