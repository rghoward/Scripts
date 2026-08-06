package defpackage;

import android.net.Uri;
import java.net.URL;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class en8 implements ia2 {
    public final l20 a;
    public final h72 b;

    public en8(l20 l20Var, @hr0 h72 h72Var) {
        l20Var.getClass();
        h72Var.getClass();
        this.a = l20Var;
        this.b = h72Var;
    }

    public static final URL b(en8 en8Var) {
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        l20 l20Var = en8Var.a;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(l20Var.a).appendPath("settings");
        hk hkVar = l20Var.b;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", hkVar.c).appendQueryParameter("display_version", hkVar.b).build().toString());
    }

    @Override // defpackage.ia2
    public final Object a(Map map, cn8.b bVar, cn8.c cVar, cn8.a aVar) throws Throwable {
        Object objG = oy0.g(this.b, new dn8(this, map, bVar, cVar, null), aVar);
        return objG == v72.t ? objG : g2b.a;
    }
}
