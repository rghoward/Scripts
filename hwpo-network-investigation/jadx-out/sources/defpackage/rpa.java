package defpackage;

import android.text.Html;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class rpa implements oh4<String, g2b> {
    public final /* synthetic */ opa t;

    public rpa(opa opaVar) {
        this.t = opaVar;
    }

    @Override // defpackage.oh4
    public final g2b invoke(String str) {
        String str2 = str;
        opa.a aVar = opa.Companion;
        opa opaVar = this.t;
        opaVar.p().d.setVisibility(!z2a.w(str2) ? 0 : 8);
        if (!z2a.w(str2)) {
            opaVar.p().d.setText(Html.fromHtml(str2, 63));
        }
        return g2b.a;
    }
}
