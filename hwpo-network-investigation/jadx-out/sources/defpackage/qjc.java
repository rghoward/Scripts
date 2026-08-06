package defpackage;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qjc implements Callable {
    public final /* synthetic */ ujc a;
    public final /* synthetic */ String b;

    public /* synthetic */ qjc(ujc ujcVar, String str) {
        this.a = ujcVar;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ujc ujcVar = this.a;
        p8c p8cVar = ujcVar.b.c;
        lzc.U(p8cVar);
        String str = this.b;
        hic hicVarK0 = p8cVar.k0(str);
        HashMap map = new HashMap();
        map.put("platform", "android");
        map.put("package_name", str);
        ujcVar.a.d.m();
        map.put("gmp_version", 161000L);
        if (hicVarK0 != null) {
            String strO = hicVarK0.O();
            if (strO != null) {
                map.put("app_version", strO);
            }
            map.put("app_version_int", Long.valueOf(hicVarK0.Q()));
            map.put("dynamite_version", Long.valueOf(hicVarK0.b()));
        }
        return map;
    }
}
