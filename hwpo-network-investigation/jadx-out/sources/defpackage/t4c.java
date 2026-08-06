package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t4c {
    public static final exc a;
    public static volatile String b;
    public static final jxc c;

    static {
        s4c s4cVar = s4c.t;
        int i = q95.v;
        xxc xxcVar = new xxc(s4cVar, true, wl8.C);
        ozc ozcVar = new ozc();
        ozcVar.a = xxcVar;
        c = new jxc(ozcVar);
        a = new exc("__phenotype_server_token", ozcVar, BuildConfig.FLAVOR);
        b = null;
    }

    public static String a() {
        return (String) a.get();
    }
}
