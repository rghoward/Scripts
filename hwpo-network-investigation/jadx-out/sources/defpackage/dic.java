package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dic extends fyc {
    public final boolean k() {
        h();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.a.a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void l(String str, hyc hycVar, skc skcVar, xhc xhcVar) {
        String str2;
        String str3 = hycVar.a;
        tkc tkcVar = this.a;
        g();
        h();
        try {
            URL url = new URI(str3).toURL();
            this.b.k0();
            byte[] bArrG = skcVar.g();
            fkc fkcVar = tkcVar.g;
            tkc.m(fkcVar);
            Map map = hycVar.b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
            try {
                fkcVar.s(new bic(this, str2, url, bArrG, map, xhcVar));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                thc thcVar = tkcVar.f;
                tkc.m(thcVar);
                thcVar.f.c(thc.o(str2), str3, "Failed to parse URL. Not uploading MeasurementBatch. appId");
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            str2 = str;
        }
    }

    @Override // defpackage.fyc
    public final void j() {
    }
}
