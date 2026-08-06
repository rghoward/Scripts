package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lc0 implements ge7<l20> {
    public static final lc0 a = new lc0();
    public static final ou3 b = ou3.a("appId");
    public static final ou3 c = ou3.a("deviceModel");
    public static final ou3 d = ou3.a("sessionSdkVersion");
    public static final ou3 e = ou3.a("osVersion");
    public static final ou3 f = ou3.a("logEnvironment");
    public static final ou3 g = ou3.a("androidAppInfo");

    @Override // defpackage.wf3
    public final void a(Object obj, he7 he7Var) {
        l20 l20Var = (l20) obj;
        he7 he7Var2 = he7Var;
        he7Var2.a(b, l20Var.a);
        he7Var2.a(c, Build.MODEL);
        he7Var2.a(d, "3.0.6");
        he7Var2.a(e, Build.VERSION.RELEASE);
        he7Var2.a(f, nd6.LOG_ENVIRONMENT_PROD);
        he7Var2.a(g, l20Var.b);
    }
}
