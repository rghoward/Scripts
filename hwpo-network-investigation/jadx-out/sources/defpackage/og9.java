package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class og9 {
    public static final og9 a = new og9();
    public static final cm5 b;

    static {
        dm5 dm5Var = new dm5();
        dm5Var.a(ng9.class, oc0.a);
        dm5Var.a(yg9.class, pc0.a);
        dm5Var.a(we2.class, mc0.a);
        dm5Var.a(l20.class, lc0.a);
        dm5Var.a(hk.class, kc0.a);
        dm5Var.a(ca8.class, nc0.a);
        dm5Var.d = true;
        b = new cm5(dm5Var);
    }

    public static l20 a(e04 e04Var) throws PackageManager.NameNotFoundException {
        e04Var.a();
        Context context = e04Var.a;
        context.getClass();
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        e04Var.a();
        String str = e04Var.c.b;
        str.getClass();
        Build.MODEL.getClass();
        Build.VERSION.RELEASE.getClass();
        packageName.getClass();
        String str2 = packageInfo.versionName;
        if (str2 == null) {
            str2 = strValueOf;
        }
        Build.MANUFACTURER.getClass();
        e04Var.a();
        ca8 ca8VarB = da8.b(context);
        e04Var.a();
        return new l20(str, new hk(packageName, str2, strValueOf, ca8VarB, da8.a(context)));
    }
}
