package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kc0 implements ge7<hk> {
    public static final kc0 a = new kc0();
    public static final ou3 b = ou3.a("packageName");
    public static final ou3 c = ou3.a("versionName");
    public static final ou3 d = ou3.a("appBuildVersion");
    public static final ou3 e = ou3.a("deviceManufacturer");
    public static final ou3 f = ou3.a("currentProcessDetails");
    public static final ou3 g = ou3.a("appProcessDetails");

    @Override // defpackage.wf3
    public final void a(Object obj, he7 he7Var) {
        hk hkVar = (hk) obj;
        he7 he7Var2 = he7Var;
        he7Var2.a(b, hkVar.a);
        he7Var2.a(c, hkVar.b);
        he7Var2.a(d, hkVar.c);
        he7Var2.a(e, Build.MANUFACTURER);
        he7Var2.a(f, hkVar.d);
        he7Var2.a(g, hkVar.e);
    }
}
