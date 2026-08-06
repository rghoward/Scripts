package defpackage;

import android.view.inputmethod.BaseInputConnection;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class aia extends wp5 implements mh4<BaseInputConnection> {
    public final /* synthetic */ zha u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aia(zha zhaVar) {
        super(0);
        this.u = zhaVar;
    }

    @Override // defpackage.mh4
    public final BaseInputConnection invoke() {
        return new BaseInputConnection(this.u.a, false);
    }
}
