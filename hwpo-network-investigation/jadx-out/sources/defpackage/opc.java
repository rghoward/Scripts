package defpackage;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class opc implements xzc {
    public final /* synthetic */ hrc t;

    public opc(hrc hrcVar) {
        this.t = hrcVar;
    }

    @Override // defpackage.xzc
    public final void a(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        hrc hrcVar = this.t;
        if (zIsEmpty) {
            hrcVar.k("auto", "_err", bundle);
        } else {
            hrcVar.getClass();
            aa0.c("Unexpected call on client side");
        }
    }
}
