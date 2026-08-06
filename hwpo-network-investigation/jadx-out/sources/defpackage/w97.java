package defpackage;

import android.icu.util.TimeZone;
import io.ably.lib.http.HttpConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w97 implements vg5 {
    @Override // defpackage.vg5
    public final qu8 intercept(vg5.a aVar) {
        aj8 aj8Var = (aj8) aVar;
        jp8.a aVarB = aj8Var.e.b();
        aVarB.b(HttpConstants.Headers.ACCEPT, HttpConstants.ContentTypes.JSON);
        aVarB.b("Content-Type", HttpConstants.ContentTypes.JSON);
        String id = TimeZone.getDefault().getID();
        id.getClass();
        aVarB.b("Client-Timezone", id);
        return aj8Var.a(new jp8(aVarB));
    }
}
