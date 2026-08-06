package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s7d {
    public final tkc a;

    public s7d(tkc tkcVar) {
        this.a = tkcVar;
    }

    public final void a(Bundle bundle, String str) {
        String string;
        tkc tkcVar = this.a;
        fkc fkcVar = tkcVar.g;
        zic zicVar = tkcVar.e;
        tkc.m(fkcVar);
        fkcVar.g();
        if (tkcVar.d()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        tkc.k(zicVar);
        zicVar.w.b(string);
        tic ticVar = zicVar.x;
        tkcVar.k.getClass();
        ticVar.b(System.currentTimeMillis());
    }

    public final boolean b() {
        if (!c()) {
            return false;
        }
        tkc tkcVar = this.a;
        tkcVar.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        zic zicVar = tkcVar.e;
        tkc.k(zicVar);
        return jCurrentTimeMillis - zicVar.x.a() > tkcVar.d.o(null, wfc.i0);
    }

    public final boolean c() {
        zic zicVar = this.a.e;
        tkc.k(zicVar);
        return zicVar.x.a() > 0;
    }
}
