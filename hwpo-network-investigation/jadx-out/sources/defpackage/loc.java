package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class loc implements Runnable {
    public final /* synthetic */ hrc t;

    public loc(hrc hrcVar) {
        this.t = hrcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s7d s7dVar = this.t.q;
        tkc tkcVar = s7dVar.a;
        fkc fkcVar = tkcVar.g;
        hrc hrcVar = tkcVar.m;
        zic zicVar = tkcVar.e;
        tkc.m(fkcVar);
        fkcVar.g();
        if (s7dVar.c()) {
            if (s7dVar.b()) {
                tkc.k(zicVar);
                zicVar.w.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                tkc.l(hrcVar);
                hrcVar.n("auto", "_cmpx", bundle);
            } else {
                tkc.k(zicVar);
                xic xicVar = zicVar.w;
                String strA = xicVar.a();
                if (TextUtils.isEmpty(strA)) {
                    thc thcVar = tkcVar.f;
                    tkc.m(thcVar);
                    thcVar.g.a("Cache still valid but referrer not found");
                } else {
                    long jA = zicVar.x.a() / 3600000;
                    Uri uri = Uri.parse(strA);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri.getPath(), bundle2);
                    for (String str : uri.getQueryParameterNames()) {
                        bundle2.putString(str, uri.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", (jA - 1) * 3600000);
                    Object obj = pair.first;
                    String str2 = obj == null ? "app" : (String) obj;
                    tkc.l(hrcVar);
                    hrcVar.n(str2, "_cmp", (Bundle) pair.second);
                }
                xicVar.b(null);
            }
            tkc.k(zicVar);
            zicVar.x.b(0L);
        }
    }
}
